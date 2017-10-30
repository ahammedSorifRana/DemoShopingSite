package test.DemoProject.Action;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage{
	WebDriver xDriver;
	
	@FindBy(xpath=".//*[@id='customer_login_link']")
	WebElement ClickOnLogin;
	
	@FindBy(xpath=".//*[@id='CustomerEmail']")
	WebElement EnterEamil;
	@FindBy(xpath=".//*[@id='CustomerPassword']")
	WebElement EnterPass;
	@FindBy(xpath="//form[contains(@id,'customer')]//input[@class='btn']")
	WebElement ClickOnSingIn;
	
	
	
	
	public  HomePage(WebDriver driver) {
		this.xDriver = driver;
		PageFactory.initElements(driver, this);
		System.out.println("Hello World");
		System.out.println("Desktop add");
		System.out.println("Desktop 3");
		System.out.println("Laptop 1");
		System.out.println("Desktop4");
		
		int x = 4;
		}
	
	public void logInApp(String EmailAdd,String PassWord) {
	 xDriver.switchTo().frame(xDriver.findElement(By.id("PreviewFrame")));
		ClickOnLogin.click();
		EnterEamil.sendKeys(EmailAdd);
		EnterPass.sendKeys(PassWord);
		ClickOnSingIn.click();
		System.out.println("hello");
		}
	

}
