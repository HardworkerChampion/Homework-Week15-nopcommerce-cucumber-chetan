package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class RegisterSteps {
    @When("Click on Register Link")
    public void clickOnRegisterLink() {
        new HomePage().clickOnRegisterLink();
    }

    @Then("Verify {string} text")
    public void verifyText(String arg0) {
    }

    @Then("Verify Register text")
    public void verifyRegisterText() {
        Assert.assertEquals(new RegisterPage().getRegisterText(),"Register","Wrong Text Display");
    }

    @And("Click on Register button")
    public void clickOnRegisterButton() {
        new RegisterPage().clickOnRegisterButton();
    }



    @And("Verify the error message First name is required")
    public void verifyTheErrorMessageFirstNameIsRequired() {
      Assert.assertEquals(new RegisterPage().getFirstNameErrorText(),"First name is required.","Message Not verify");
    }

    @And("Verify the error message Last name is required")
    public void verifyTheErrorMessageLastNameIsRequired (){
        Assert.assertEquals(new RegisterPage().getLastNameErrorText(),"Last name is required.","Message Not verify");
    }

    @And("Verify the error message Email is required")
    public void verifyTheErrorMessageEmailIsRequired() {
        Assert.assertEquals(new RegisterPage().getEmailErrorText(),"Email is required.","Message is not verify");
    }

    @And("Verify the error message Password is required")
    public void verifyTheErrorMessagePasswordIsRequired() {
        Assert.assertEquals(new RegisterPage().getPasswordErrorText(),"Password is required.","Message is not verify");
    }

    @Then("Verify the error message CPassword is required.")
    public void verifyTheErrorMessageAPasswordIsRequired() {
        Assert.assertEquals(new RegisterPage().getConfirmPasswordErrorText(),"Password is required.","Message is not verify");
    }

    @And("Select gender Female")
    public void selectGenderFemale() {
        new RegisterPage().clickOnFemaleRadioButton();
    }

    @And("Enter firstname")
    public void enterFirstname() {
        new RegisterPage().sendTextToFirstNameField("John");
    }

    @And("Enter lastname")
    public void enterLastname() {
        new RegisterPage().sendTextToLastNameField("John123");
    }

    @And("Select day")
    public void selectDay() {
        new RegisterPage().selectDayFromDropdown("25");
    }

    @And("Select month")
    public void selectMonth() {
       new RegisterPage().selectMonthFromDropdown("April");
    }

    @And("Select year")
    public void selectYear() {
        new RegisterPage().selectYearFromDropdown("1931");
    }

    @And("Enter email")
    public void enterEmail() {
        new RegisterPage().sendTextToEmailField("John@gmail.com");
    }

    @And("Enter password")
    public void enterPassword() {
        new RegisterPage().sendTextToPasswordField("John123");
    }

    @And("Enter Confirm Password")
    public void enterConfirmPassword() {
        new RegisterPage().sendTextToConfirmPasswordField("John123");
    }

    @And("Click on REGISTER button")
    public void clickOnREGISTERButton() {
       new RegisterPage().clickOnRegisterButton();
    }

    @Then("Verify message Your registration completed")
    public void verifyMessageYourRegistrationCompleted() {
        Assert.assertEquals(new RegisterPage().getRegisterCompletedText(),"Your registration completed","Message not Verify");
    }
}

