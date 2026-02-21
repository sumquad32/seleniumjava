package login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	WebDriver driver = null;

	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
	}

	@AfterMethod
	public void testdown() {
		if (driver != null) {
			driver.quit();
		}
	}

	@Test
	public void verifyLoginWithValidCredentials() {

	}

	@Test
	public void verifyLoginWithInValidCredentials() {

	}

	@Test
	public void verifyLoginWithoutCredentials() {

	}

	@Test
	public void verifyLoginWithGmail1() {
	}

	@Test
	public void verifyLoginWithGmail2() {

	}

}
