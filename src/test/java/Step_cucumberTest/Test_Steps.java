package Step_cucumberTest;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Test_Steps {
    @Given("the user is on login page")
    public void the_user_is_on_login_page() {
        System.out.println("the user is on login page");
        throw new io.cucumber.java.PendingException();
    }
    @When("The user enters valid credentials")
    public void the_user_enters_valid_credentials() {
        System.out.println("The user enters valid credentials");
    }
    @And("hits submit")
    public void hits_submit() {
        System.out.println("hits submit");
    }
    @Then("the user Should be logged in successfully")
    public void the_user_should_be_logged_in_successfully() {
        System.out.println("the user Should be logged in successfully");
    }
}
