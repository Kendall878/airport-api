package com.example.airport_api;

import com.example.airport_api.model.*;
import com.example.airport_api.repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AirportApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(AirportApiApplication.class, args);
    }

    @Bean
    public CommandLineRunner printEverything(
            CityRepository cityRepo,
            PassengerRepository passengerRepo,
            AirportRepository airportRepo,
            AircraftRepository aircraftRepo
    ) {
        return args -> {
            System.out.println("==CITIES==");
            cityRepo.findAll().forEach(city ->
                    System.out.println(city.getName() + ", " + city.getState() + " (Pop: " + city.getPopulation() + ")")
            );

            System.out.println("\n==PASSENGERS==");
            passengerRepo.findAll().forEach(p ->
                    System.out.println(p.getFirstName() + " " + p.getLastName() + " | " + p.getPhoneNumber())
            );

            System.out.println("\n==AIRPORTS==");
            airportRepo.findAll().forEach(airport ->
                    System.out.println(airport.getName() + " (" + airport.getCode() + ") in " + airport.getCity().getName())
            );

            System.out.println("\n==AIRCRAFT==");
            aircraftRepo.findAll().forEach(a ->
                    System.out.println(a.getType() + " by " + a.getAirlineName() + " | Capacity: " + a.getNumberOfPassengers())
            );
        };
    }
}
