package steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginPage;
import util.BrowserFactory;

public class LoginSteps {
	WebDriver driver = BrowserFactory.startBrowser();
	
	@Given("^user is already in login Page$")
	public void user_is_already_in_login_Page() throws Throwable {
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		String expectedTitle="Login - TechFios Test Application - Billing";
		Assert.assertEquals(expectedTitle, actualTitle);
		
	}

	@When("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String username, String password) throws Throwable {
	   LoginPage logintechfios = PageFactory.initElements(driver, LoginPage.class);
	   logintechfios.login(username, password);
	   
	}

	@Then("^After login close the browser$")
	public void after_login_close_the_browser() throws Throwable {
	   driver.close();
	}
}
