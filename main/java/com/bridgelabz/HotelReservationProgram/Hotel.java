package com.bridgelabz.HotelReservationProgram;

public class Hotel {
	String hotelName;
	double weekdayRegularCustomerCost;
	double weekendRegularCustomerCost;

	public Hotel() {

	}

	public Hotel(String hotelName, double weekdayRegularCustomerCost, double weekendRegularCustomerCost) {
		super();
		this.hotelName = hotelName;
		this.weekdayRegularCustomerCost = weekdayRegularCustomerCost;
		this.weekendRegularCustomerCost = weekendRegularCustomerCost;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public double getWeekdayRegularCustomerCost() {
		return weekdayRegularCustomerCost;
	}

	public void setWeekdayRegularCustomerCost(double weekdayRegularCustomerCost) {
		this.weekdayRegularCustomerCost = weekdayRegularCustomerCost;
	}

	public double getWeekendRegularCustomerCost() {
		return weekendRegularCustomerCost;
	}

	public void setWeekendRegularCustomerCost(double weekendRegularCustomerCost) {
		this.weekendRegularCustomerCost = weekendRegularCustomerCost;
	}

	@Override
	public String toString() {
		return "Hotel [hotelName=" + hotelName + ", weekdayRegularCustomerCost=" + weekdayRegularCustomerCost
				+ ", weekendRegularCustomerCost=" + weekendRegularCustomerCost + "]";
	}

}
