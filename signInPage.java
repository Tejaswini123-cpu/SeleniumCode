package pages;

import java.sql.Driver;

import org.apache.hc.client5.http.auth.UsernamePasswordCredentials;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class signInPage extends BaseClass {

	public static WebDriver driver;

	public signInPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//a[text()='Sign In'])[1]")
	public WebElement signinbutton;

	@FindBy(xpath = "//a[normalize-space()='Property Manager Login']")
	public WebElement propertymanagerbtn;

	@FindBy(xpath = "//input[@name=\"company_user[password]\"]")
	public WebElement passwordElement;

	@FindBy(xpath = "//input[@name=\"company_user[username]\"]")
	public WebElement usernameElement;

	public void enterUserName() throws InterruptedException {
		usernameElement.sendKeys("Tejaswini");
		Thread.sleep(2000);
	}

	public void enterPassword() throws InterruptedException {

		passwordElement.sendKeys("Tejaswini123");
		Thread.sleep(2000);
	}

	public void clickOnPropertyManagerBtn() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", propertymanagerbtn);
		Thread.sleep(2000);
		propertymanagerbtn.click();
	}

	public void clickOnSignInButton() {
		signinbutton.click();
	}

}
