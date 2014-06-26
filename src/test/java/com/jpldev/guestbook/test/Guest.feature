Feature: Adding a person to the guestbook 
Scenario: Add a person and a company 
	Given the persons name is "John Doe" 
	When the add button is pressed 
	Then the result should be displayed as "John Doe (signed on date @todays_date)"
	