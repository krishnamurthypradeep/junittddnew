package com.myapp.flight.management;

public class EconomyFlight extends Flight {

	public EconomyFlight(String id) {
		super(id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean addPassenger(Passenger passenger) {
		// TODO Auto-generated method stub
		return list.add(passenger);
	}

	@Override
	public boolean removePassenger(Passenger passenger) {
		// TODO Auto-generated method stub
		
		if(!passenger.isVip()) {
		return list.remove(passenger);
	}
		return false;

}
}