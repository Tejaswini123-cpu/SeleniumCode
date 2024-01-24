package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import base.BaseClass;

public class watchDemo extends BaseClass {

	public watchDemo(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "(//a[text()=\"Watch Demo\"])[1]")
	public WebElement watchdemo;

	@FindBy(xpath = "//input[@id='FirstName']")
	public WebElement firstNamElement;

	@FindBy(xpath = "//input[@id='LastName']")
	public WebElement lastNamElement;

	@FindBy(xpath = "//input[@id='Email']")
	public WebElement emailElement;

	@FindBy(xpath = "//input[@id='Company']")
	public WebElement companyElement;

	@FindBy(xpath = "//input[@id='Phone']")
	public WebElement phoneElement;

	@FindBy(css = "#Unit_Count__c")
	public WebElement unitcountElement;

	@FindBy(xpath = "//input[@id='Title']")
	public WebElement titleElement;

	public void formSubmisiion() {
		watchdemo.click();
		firstNamElement.sendKeys("Tejaswini");
		lastNamElement.sendKeys("teju123");
		emailElement.sendKeys("tejaswinipole@gmail.com");
		companyElement.sendKeys("Entrata");
		phoneElement.sendKeys("9021647557");
		unitcountElement.click();

		Select select = new Select(unitcountElement);

		select.selectByVisibleText("11 - 100");

		titleElement.sendKeys("Manager");

	}

}
