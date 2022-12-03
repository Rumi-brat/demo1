package com.example.CabApplication.model;

import java.awt.Point;

public class driver {
	private String driver_name;
	private String vehicle;
	private Point driver_location;
	private String status="unavailable";
	public String getDriver_name() {
		return driver_name;
	}
	public void setDriver_name(String driver_name) {
		this.driver_name = driver_name;
	}
	public String getVehicle() {
		return vehicle;
	}
	public void setVehicle(String vehicle) {
		this.vehicle = vehicle;
	}
	public Point getDriver_location() {
		return driver_location;
	}
	public void setDriver_location(Point driver_location) {
		this.driver_location = driver_location;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public driver(String driver_name, String vehicle, Point driver_location) {
		super();
		this.driver_name = driver_name;
		this.vehicle = vehicle;
		this.driver_location = driver_location;
	}
	@Override
	public String toString() {
		return "driver [driver_name=" + driver_name + ", vehicle=" + vehicle + ", driver_location=" + driver_location
				+ ", status=" + status + "]";
	}
	
	/*public void add_driver(String n,String v,Point p) {
		driver_name=n;
		vehicle=v;
		driver_location = p;
	}
	//update driver location
	public void update_driverLocation(String n, Point p) {
		driver_name=n;
		driver_location=p;
	}*/
	
}
