package com.myapp.flight.management;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Flight {
	
	private String id;
	List<Passenger> list = new ArrayList<>();
	
	private int distance;
	
	
	

	public Flight(String id) {
		this.id = id;
	
	}

	public String getId() {
		return id;
	}

	
	public List<Passenger> getList() {
		return Collections.unmodifiableList(list);
	}

	public void setList(List<Passenger> list) {
		this.list = list;
	}

	
	public int getDistance() {
		return distance;
	}
	
	public void setDistance(int distance) {
		this.distance = distance;
	}
	
	
	public abstract boolean addPassenger(Passenger passenger) ;
		
	
	
public abstract boolean removePassenger(Passenger passenger) ;
		
	


}
