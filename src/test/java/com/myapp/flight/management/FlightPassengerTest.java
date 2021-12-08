package com.myapp.flight.management;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FlightPassengerTest {
	
	@Test
	public void testEconomyFlightsForRegularPassenger() {
		
		
		
		Flight economyFlight = new EconomyFlight("1");
		Passenger pass1 = new Passenger("Pass1", true);
		
		assertEquals("1", economyFlight.getId());
		
		assertEquals(true, economyFlight.addPassenger(pass1));
		
		assertEquals(false, economyFlight.removePassenger(pass1));
		
	
		assertEquals(1, economyFlight.getList().size());
		
		
		
		
	
	}
	
	@Test
	public void testEconomyFlightsForVipPassenger() {
		
		
//		Passenger pass1 = new Passenger("Pass1", true);
//		Passenger pass2 = new Passenger("Pass2", false);
//		
//		
//		assertEquals(true, economyFlight.addPassenger(pass1));
//		
//		assertEquals(false, economyFlight.removePassenger(pass1));
//		
//	
//	    assertEquals(true, businessFlight.addPassenger(pass1));
//		
//		assertEquals(false, businessFlight.removePassenger(pass1));
//		
		
		
		
		
	
	}
	
	@Test
	public void testBusinessFlightsForVipPassenger() {
		
		
//		Passenger pass1 = new Passenger("Pass1", true);
//		Passenger pass2 = new Passenger("Pass2", false);
//		
//		
//		assertEquals(true, economyFlight.addPassenger(pass1));
//		
//		assertEquals(false, economyFlight.removePassenger(pass1));
//		
//	
//	    assertEquals(true, businessFlight.addPassenger(pass1));
//		
//		assertEquals(false, businessFlight.removePassenger(pass1));
		
		
		
		
		
	
	}
	@Test
	public void testBusinessFlightsForRegularPassenger() {
		
		
//		Passenger pass1 = new Passenger("Pass1", true);
//		Passenger pass2 = new Passenger("Pass2", false);
//		
//		
//		assertEquals(true, economyFlight.addPassenger(pass1));
//		
//		assertEquals(false, economyFlight.removePassenger(pass1));
//		
//	
//	    assertEquals(true, businessFlight.addPassenger(pass1));
//		
//		assertEquals(false, businessFlight.removePassenger(pass1));
//		
//		
//		
		
		
	
	}
	
	

}

// Modular Approach

// Write Tests

// Discover And Run Test

// Run The Test From IDE and Tools (Eclipse And Maven)

//  JunitPlatform Commons

//  Junit Jupiter

//  Junit Vintage