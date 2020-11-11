package com.cybertek.step_definitions;

import com.cybertek.pages.EtsySearchPage;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class EtsyStepDefinitions {


    EtsySearchPage etsySearchPage = new EtsySearchPage();
    @Given("User is on the Etsy home page page")
    public void userIsOnTheEtsyHomePagePage() {

        Driver.getDriver().get("https://www.etsy.com");


    }

    @Then("User should be able to see title is as expected")
    public void user_should_be_able_to_see_title_is_as_expected() {

        String actualTitle = Driver.getDriver().getTitle();
        String expectedResult = "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";

        Assert.assertEquals(actualTitle, expectedResult);


    }

    @When("User searches {string} in the search box")
    public void userSearchesInTheSearchBox(String searchValue) {

        etsySearchPage.searchBox.sendKeys("apple" + Keys.ENTER);
    }

    @And("User clicks to search button")
    public void userClicksToSearchButton() {
        etsySearchPage.searchBox.click();
    }

    @Then("User should see {string} in the Etsy title")
    public void userShouldSeeInTheEtsyTitle(String expectedInTitle) {

        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue(actualTitle.contains(expectedInTitle));


    }


}
