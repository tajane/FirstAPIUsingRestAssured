package stepDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class MyStepDefinitions 
{

    @Given("^enter the tamplo url$")
    public void enter_the_tamplo_url() throws Throwable 
    {
        System.out.println("@Given(\"^enter the tamplo url$\")");
    }

    @When("^enter the userame \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void enter_the_userame_something_and_password_something(String strArg1, String strArg2) throws Throwable {
    	 System.out.println("@When(\"^enter the userame "+strArg1+" and password " + strArg2);
    }

    @Then("^click on login button$")
    public void click_on_login_button() throws Throwable 
    {
    	System.out.println("@Then(\"^click on login button$\")");
    }

    @And("^verify dashboard page should be display$")
    public void verify_dashboard_page_should_be_display() throws Throwable 
    {
    	System.out.println(" @And(\"^verify dashboard page should be display$\")");
    }

}