package hw15SeleniumTestNg;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNg_15 {
	WebDriver driver;

	@BeforeTest
	public void setUp() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sulta\\eclipse-workspace\\SeleniumMethods\\driver\\chromedriver.exe");

	
	// WebDriver is an interface and ChromeDriver is a concrete class
	//we use CMS.gov portal
	driver = new ChromeDriver();
	driver.get("https://www.nasa.gov/");
	Thread.sleep(5000);
	}
	
	//LinkText***
	//link Text always link with href
	@Test(enabled = true,priority = 5)
	public void linkText() throws InterruptedException{
		driver.findElement(By.linkText("Image of the Day")).click();
		Thread.sleep(5000);
	}
	
	//partialLinkText***
	//When we select partial Text..
	
	@Test(enabled = false,priority = 0)
	public void clickPartialLinkText() throws InterruptedException{
		driver.findElement(By.partialLinkText("Image of ")).click();
		Thread.sleep(5000);
	}
	
	
	//CSS Selector
	//By Class
	// ---First we get html tag
	//--- then dot 
	//--- then write class name inside the string
	
	
	// newUserRegistration--We clicked
	// -- a. cms-newuser-reg // a=tag name, class="cms-newuser-reg"
	//login --we clicked 
	// --button.cms-green-button-reg
	@Test(enabled = false,priority = 2)
	public void displayedTextTest() throws InterruptedException {
	
		
	//this is not clickable. 	
	//class="lt-line-clamp lt-line-clamp--multi-line ember-view"
		
	//driver.findElement(By.cssSelector("div.lt-line-clamp.lt-line-clamp--multi-line.ember-view")).click();
	driver.findElement(By.cssSelector("div.lt-line-clamp.lt-line-clamp--multi-line.ember-view")).isDisplayed();
	Thread.sleep(5000);

	}
	

	
	//CSS Selector-02
	//value of ID
	//a#follow
	//first html tag+#+valueOfID
	
	@Test(enabled = false ,priority = 0)
	public void followButton() throws InterruptedException{
		driver.findElement(By.cssSelector("a#follow")).click();
		Thread.sleep(5000);
	}
	
	//we can also do --> CSS Selector by NAME 03
	
	
	

	@AfterTest
	public void tearUp() {
	driver.quit();
	}


}
