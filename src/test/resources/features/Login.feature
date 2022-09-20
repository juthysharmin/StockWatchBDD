Feature: 
@automated 
Scenario: when I try to submit the login with valid password 
Given: I am on Site Homepage
When: I click on My Watch to view portfolio on the page
And:  I enter talentechcy in to the User Name field on the login page
And: I enter CyTech2022 into the password field on the Registration page
And: I click on submit on the login page.
Then: I am able to login successfully 
  
Scenario: Error message should become visible when I try to submit the login with invalid password Invalid login, please try again.
Given: I am on Site Homepage
When: I click on “My Watch” to “view portfolio” on the page 
And : I enter “techcy” in to the “User Name” field on the login page
And: I enter CyTech2022 into the “password” field on the Registration page
And: I click on submit on the login page.
Then: Error message “Invalid login, please try again.” should become visible on login page 
