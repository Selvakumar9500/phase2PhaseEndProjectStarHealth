package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import static steps.BaseTest.driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class BuyNowPageTest {

	@Given("User launches the Star Health application with {string}")
	public void user_launches_the_star_health_application_with(String string) {
	
		driver.get(string);
	}



	@Then("User waits for the Welcome to Star Health pop-up and closes it")
	public void user_waits_for_the_welcome_to_star_health_pop_up_and_closes_it() {
	   System.out.println(" Welcome to Star Health.. ");
	}

	@Then("User get home page title and Validates it")
	public void user_get_home_page_title_and_validates_it() {
	    // Write code here that turns the phrase above into concrete actions
		String actualTitle = "Star Health Insurance: Medical, Accident and Travel insurance policies";
	    driver.navigate().to("https://www.starhealth.in/");
	    String expectedTitle = driver.getTitle();
	    Assert.assertEquals(expectedTitle, actualTitle);
	}

	@Then("User clicks on the Buy Now button")
	public void user_clicks_on_the_buy_now_button() throws InterruptedException {
		
		WebElement BuyButton = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/header/div[2]/div[2]/div/button"));
		BuyButton.click();
		Thread.sleep(2500);
	}

	@Then("User Enters data for  {string},{string},{string},{string}")
	public void user_enters_data_for(String string1, String string2, String string3, String string4) throws InterruptedException {

		WebElement name = driver.findElement(By.xpath("//input[@id='fullname']"));
		WebElement mobilenumber = driver.findElement(By.xpath("//*[@id=\"mobile\"]"));
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		WebElement pincode = driver.findElement(By.xpath("//*[@id=\"zipcode\"]"));
		name.sendKeys(string1);
		mobilenumber.sendKeys(string2);
		email.sendKeys(string3);
		pincode.sendKeys(string4);
		
		Thread.sleep(2500);
  
	}

	@Then("User click on getstarted button")
	public void user_click_on_getstarted_button() throws InterruptedException {
		WebElement getstart = driver.findElement(By.xpath("//*[@id=\"userDetails-form\"]/div/div/div/div[1]/div/div/div[2]/div/button"));
		getstart.click();
		Thread.sleep(2500);
	}

	@Then("User select the checkbox for myself")
	public void user_select_the_checkbox_for_myself() throws InterruptedException {
		WebElement checkboxmyself = driver.findElement(By.xpath("(//input[@id='myself'])[1]"));
		checkboxmyself.click();
		Thread.sleep(2500);
	}

	@Then("user navigates to the HomePage with {string}")
	public void user_navigates_to_the_home_page_with(String string) {
		driver.get(string);
	}

	
	
}