package com.myapp.flight.management;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class AirportUsingFlightPassengerTest {
	
	
	@DisplayName("Given There is a Economy Flight")
	@Nested
	class EconomyFlightTest{
		
		private Flight economyFlight;
		private Passenger pass1,pass2;
		
		
		@BeforeEach
		void setUp() {
			economyFlight = new EconomyFlight("1");
			pass1 = new Passenger("Pass1", false);
			pass2 = new Passenger("Pass2", true);
			
		}
		@AfterEach
		void tearDown() {
			economyFlight = null;
			pass1 = null;
			pass2 = null;
			
		}
		@DisplayName("When We Have a Usual Passenger")
		@Nested
		class UsualPassenger{
			
			@Test
			@DisplayName("Then we will be add and Remove from an economy flight")
			public void testEconomyFlightForUsualPassenger() {
				assertAll("Verify All Conditions For Usual Passenger on a economy flight",
						
						()-> assertEquals("1", economyFlight.getId()),
						()-> assertTrue( economyFlight.addPassenger(pass1)),
						()-> assertEquals( 1,economyFlight.getList().size()),
						()-> assertEquals("Pass1", economyFlight.getList().get(0).getName()),
						()-> assertTrue( economyFlight.removePassenger(pass1)),
						()-> assertEquals(0, economyFlight.getList().size()));
				
			}
			
		}
		
		@DisplayName("When We Have a Vip Passenger")
		@Nested
		class VipPassenger{
			
			@Test
			@DisplayName("Then we will be add and Remove from an economy flight")
			public void testEconomyFlightForUsualPassenger() {
				assertAll("Verify All Conditions ForVip Passenger on a economy flight",
						
						()-> assertEquals("1", economyFlight.getId()),
						()-> assertTrue( economyFlight.addPassenger(pass2)),
						()-> assertEquals( 1,economyFlight.getList().size()),
						()-> assertEquals("Pass2", economyFlight.getList().get(0).getName()),
						()-> assertTrue( economyFlight.removePassenger(pass2)),
						()-> assertEquals(0, economyFlight.getList().size()));
				
			}
			
		}
		
	}

}
