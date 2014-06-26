package com.jpldev.guestbook.test;

import static org.junit.Assert.assertEquals;

import java.sql.Date;

import com.jpldev.guestbook.Guest;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GuestStepDefs {
	String name;
	String arguments;
	Guest result;
	
	@Given("^the persons name is \"([^\"]*)\"$")
	public void the_persons_name_is(String arg1) throws Throwable {
		this.name = arg1;
	}

	@When("^the add button is pressed$")
	public void the_add_button_is_pressed() throws Throwable {
		result = new Guest(name);
	}

	@Then("^the result should be displayed as \"([^\"]*)\"$")
	public void the_result_should_be_displayed_as(String arg1) throws Throwable {
		String expected = arg1.replace("@todays_date", new Date(System.currentTimeMillis()).toString()); 
		assertEquals(expected, result.toString());
	}

}
