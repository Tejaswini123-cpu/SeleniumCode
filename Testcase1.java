package testcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v118.page.model.NavigatedWithinDocument;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.signInPage;
import pages.watchDemo;

public class Testcase1 {
	private WebDriver driver;

	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.entrata.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test(priority = 2)
	public void verifySignInFunctionality() throws InterruptedException {
		signInPage signIn = new signInPage(driver);
		signIn.clickOnSignInButton();
		signIn.clickOnPropertyManagerBtn();
		signIn.enterUserName();
		signIn.enterPassword();

	}

	@Test(priority = 1)
	public void verifywatchDemoForm() {
		watchDemo demo = new watchDemo(driver);
		demo.formSubmisiion();
	}
}
