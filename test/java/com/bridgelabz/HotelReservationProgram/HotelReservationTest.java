package com.bridgelabz.HotelReservationProgram;

import org.junit.Assert;
import org.junit.Test;

public class HotelReservationTest {

	static Hotel hotel = new Hotel("Monarch", 750, 1250);

	@Test
	public void givenHotelNameIfSameReturnTrue() {
		HotelReservation hotelReservation = new HotelReservation();
		Assert.assertEquals(hotel.getHotelName(), hotelReservation.hotel.getHotelName());
	}

	@Test
	public void givenHotelWeekDayRateIfSameReturnTrue() {
		HotelReservation hotelReservation = new HotelReservation();
		Assert.assertEquals(hotel.getWeekdayRegularCustomerCost(),
				hotelReservation.hotel.getWeekdayRegularCustomerCost(), 0.0);
	}

	@Test
	public void givenHotelWeekEndRateIfSameReturnTrue() {
		HotelReservation hotelReservation = new HotelReservation();
		Assert.assertEquals(hotel.getWeekendRegularCustomerCost(),
				hotelReservation.hotel.getWeekendRegularCustomerCost(), 0.0);
	}

}
