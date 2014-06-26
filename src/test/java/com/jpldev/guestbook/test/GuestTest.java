package com.jpldev.guestbook.test;

import static org.junit.Assert.assertEquals;
import com.jpldev.guestbook.Guest;
import org.junit.Test;


public class GuestTest {
	String name = "Johny Doe";
	String company = "My Incorporated";
	Guest guest = new Guest(name);
	String signingDate = guest.getSigningDate();

	@Test
	public void createGuestTest(){
		String expectedText = "Johny Doe" + " (signed on date " + signingDate.toString() + ")";
		assertEquals(expectedText, guest.toString());
	}
}