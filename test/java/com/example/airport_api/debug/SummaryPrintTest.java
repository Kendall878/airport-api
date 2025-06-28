package com.example.airport_api.debug;

import com.example.airport_api.model.*;
import org.junit.jupiter.api.Test;

public class SummaryPrintTest {

    @Test
    public void printMockedDataSummary() {
        City city = new City();
        city.setId(1L);
        city.setName("Toronto");
        city.setState("Ontario");
        city.setPopulation(3_000_000L);

        Passenger passenger = new Passenger();
        passenger.setId(1L);
        passenger.setFirstName("Anna");
        passenger.setLastName("Fitz");
        passenger.setPhoneNumber("123-456-7890");

        Airport airport = new Airport();
        airport.setId(1L);
        airport.setName("Pearson International");
        airport.setCode("YYZ");
        airport.setCity(city);

        Aircraft aircraft = new Aircraft();
        aircraft.setId(1L);
        aircraft.setType("Boeing 747");
        aircraft.setAirlineName("Air Canada");
        aircraft.setNumberOfPassengers(400);

        System.out.println("===== MOCK DATA SUMMARY =====");
        System.out.println("City: " + city.getName() + ", " + city.getState() + " (Population: " + city.getPopulation() + ")");
        System.out.println("Passenger: " + passenger.getFirstName() + " " + passenger.getLastName() + " | Phone: " + passenger.getPhoneNumber());
        System.out.println("Airport: " + airport.getName() + " (" + airport.getCode() + ") in " + airport.getCity().getName());
        System.out.println("Aircraft: " + aircraft.getType() + " by " + aircraft.getAirlineName() + " | Capacity: " + aircraft.getNumberOfPassengers());
    }
}
