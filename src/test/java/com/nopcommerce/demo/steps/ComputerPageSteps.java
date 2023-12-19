package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopsPage;
import com.nopcommerce.demo.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ComputerPageSteps {
    @When("Click on Computer tab")
    public void clickOnComputerTab() {
        new HomePage().clickOnComputersLink();
    }

    @Then("Verify Computer text")
    public void verifyComputerText() {
        Assert.assertEquals(new ComputerPage().getComputersText(),"Computers","Message not Verify");
    }

    @And("Click on Desktops link")
    public void clickOnDesktopsLink() {
        new ComputerPage().clickOnDesktopsLink();
    }

    @Then("Verify Desktops text")
    public void verifyDesktopsText() {
        Assert.assertEquals(new DesktopsPage().getDesktopsText(),"Desktops","Desktops Text not verify");
    }

    @And("Click on product name Build your own computer")
    public void clickOnProductNameBuildYourOwnComputer() {
        new DesktopsPage().ClickOnProductBuildYourOwnComputer();
    }

    @And("Select processor {string}")
    public void selectProcessor(String processor) {
        new BuildYourOwnComputerPage().selectProcessorFromDropdown(processor);
    }

    @And("Select RAM {string}")
    public void selectRAM(String ram) {
        new BuildYourOwnComputerPage().selectRamFromDropdown(ram);
    }

    @And("Select HDD {string}")
    public void selectHDD(String HDD) {
        new BuildYourOwnComputerPage().clickOnRadioButtonOfHDD(HDD);
    }

    @And("Select OS {string}")
    public void selectOS(String OS) {
        new BuildYourOwnComputerPage().clickOnOSRadioButton(OS);
    }

    @And("Select Software {string}")
    public void selectSoftware(String Software) {
        new BuildYourOwnComputerPage().selectTheSoftware(Software);
    }

    @And("Click on ADD TO CART Button")
    public void clickOnButton() {
        new BuildYourOwnComputerPage().clickOnAddToCart();
    }

    @Then("Verify message The product has been added to your shopping cart")
    public void verifyMessageTheProductHasBeenAddedToYourShoppingCart() {
        Assert.assertEquals(new BuildYourOwnComputerPage().getContentMessage(),"The product has been added to your shopping cart","Message not Verify");

    }
}
