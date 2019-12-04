package stepDef;



import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;

import java.io.IOException;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



@RunWith(Cucumber.class)
public class stepDefinition 
{
	public WebDriver driver;

	@Given("^I want food in \"([^\"]*)\"$")
    public void i_want_food_in_something(String strArg1) throws IOException  
	{
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\main\\java\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.just-eat.co.uk/");
		driver.findElement(By.xpath("//input[@name='postcode']")).click();
		driver.findElement(By.xpath("//input[@name='postcode']")).sendKeys(strArg1);
		
	 }


    @When("^I search for restaurants$")
    public void i_search_for_restaurants() throws Throwable
    {
    	driver.findElement(By.xpath("//span[@class='Form_c-search-btn-text_1jLYr']")).click();
		
     throw new PendingException();
    }

    @Then("^I should see some restaurants in \"([^\"]*)\"$")
    public void i_should_see_some_restaurants_in_something(String strArg1) throws Throwable 
    {
    	System.out.println(driver.findElement(By.xpath("//span[contains(text(),'open restaurants')]")).getText());
    	
        throw new PendingException();
    }
    
    
   

    @When("^ submit information$")
    public void submit_information() throws Throwable 
    {
    	driver.findElement(By.xpath("//span[@class='Form_c-search-btn-text_1jLYr']")).click();
        throw new PendingException();
    }

    @Then("^I should see error with invalid Postcode$")
    public void i_should_see_error_with_invalid_postcode() throws Throwable 
    {
    	System.out.println(driver.findElement(By.xpath("//div[@id='errorMessage']")).getText());
        throw new PendingException();
    }

    
    
}