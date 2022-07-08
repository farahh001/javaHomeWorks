package hw15SeleniumTestNg;

import org.openqa.selenium.By;import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumMethods_hw15 {
	WebDriver driver;

	@BeforeTest
	public void setUp() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sulta\\eclipse-workspace\\SeleniumMethods\\driver\\chromedriver.exe");

	
	// WebDriver is an interface and ChromeDriver is a concrete class
	//we use CMS.gov portal
	driver = new ChromeDriver();
	driver.get("https://www.gucci.com/us/en/?&msclkid=f399164249bd12c960b774852b4bdb19&utm_source=bing&utm_medium=cpc&utm_campaign=US%20-%20Desktop%20-%20Brand%20-%20Alone%20Exact%20-%20Brand%20Pure&utm_term=gucci&utm_content=Gucci%20-%20Alone%20Exact&gclid=f399164249bd12c960b774852b4bdb19&gclsrc=3p.ds");
	Thread.sleep(5000);
	}
	
	//isEnabled()--> if the web Element is enabled or disabled.Mostly used on buttons
		// status
		//we are using xpath --> class="tab-logo"
	
		@Test
		public void displayStatus() throws InterruptedException{
			boolean elementDisplayed= driver.findElement(By.xpath("//a[@class='tab-logo']")).isDisplayed();
			System.out.println("Is it displayed? Ans: " + elementDisplayed);
			Thread.sleep(5000);
		}
		

	@Test(enabled = true,priority = 1)
	public void shopButtonIsEnabled() throws InterruptedException {
		boolean elementEnabled = driver.findElement(By.xpath("//a[@class='button-gold shop-the-collection']")).isEnabled();
		System.out.println("Is the button enabled? Ans: " +elementEnabled);
		Thread.sleep(5000);
	}
	@Test(enabled = true,priority = 2)
	public void continueButtonIsEnabled() throws InterruptedException {
		boolean elementEnabled = driver.findElement(By.xpath("//button[text()='CONTINUE']")).isEnabled();
		System.out.println("Is the button enabled? Ans: " +elementEnabled);
		Thread.sleep(5000);
	}


	@AfterTest
	public void tearUp() {
	driver.quit();
	}

}
