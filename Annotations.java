package testing1;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Annotations {
	
	public WebDriver driver;
	public String appUrl; 
	
	@BeforeClass
	public void openBrowser() {
	    appUrl = "http://the-internet.herokuapp.com/login"; 
	    System.setProperty("webdriver.chrome.driver", "/Users/adedayo206523124/Downloads/chromedriver");
	    driver = new ChromeDriver();
	    driver.get(appUrl);
	    driver.manage().window().maximize();
	}
	
	@AfterClass
	public void tearDown() throws IOException {
	    driver.quit();
	} 
	
	

}
