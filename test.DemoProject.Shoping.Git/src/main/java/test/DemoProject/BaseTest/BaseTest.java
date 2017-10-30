package test.DemoProject.BaseTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
	
	String URL ="file:///c://Users/Ahammed%20Sorif/Desktop/Demo_Site/demoSite.htm";
	String Browser = "Firefox";
	public WebDriver Driver; 
	
	public void init() {
		chooseBrowser(Browser);
		getUrl(URL);
		}
	
	
	public void chooseBrowser(String Browser) {

		switch(Browser) {
		case"Firefox":
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//Driver//geckodriver.exe");

			Driver = new FirefoxDriver();
			break;
		case"Chrome":
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Driver//chromedriver.exe");
			 Driver = new ChromeDriver();
			
			 break;
		default:
			System.out.println("Browser Not Found");
			break;
		
			}
		}
	
	public void getUrl(String URL) {
		Driver.get(URL);
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		
		}
	

}
