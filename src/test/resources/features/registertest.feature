Feature: Register

  Scenario: VerifyUserShouldNavigateToRegisterPageSuccessfully
    Given I am on homepage
  When Click on Register Link
  Then Verify Register text

 Scenario: VerifyThatFirstNameLastNameEmailPasswordAndConfirmPasswordFieldsAreMandatory
   Given I am on homepage
  When Click on Register Link
  And Click on Register button
  And Verify the error message First name is required
  And Verify the error message Last name is required
  And Verify the error message Email is required
  And Verify the error message Password is required
  Then Verify the error message CPassword is required.

 Scenario: VerifyThatUserShouldCreateAccountSuccessfully
   Given I am on homepage
 When Click on Register Link
 And Select gender Female
 And Enter firstname
 And Enter lastname
 And Select day
 And Select month
 And Select year
 And Enter email
 And Enter password
 And Enter Confirm Password
 And Click on REGISTER button
 Then Verify message Your registration completed

