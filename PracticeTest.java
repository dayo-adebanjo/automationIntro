package testing1;

import java.io.*;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;;

public class PracticeTest {

	public WebDriver driver;
	public String appUrl; 
	
/*	@BeforeClass
	public void openBrowser() {
	    appUrl = "http://the-internet.herokuapp.com/login"; 
	    //System.setProperty("webdriver.chrome.driver", "/Users/ecortes/SeleniumDrivers/chromedriver");
	    driver = new ChromeDriver();
	    driver.get(appUrl);
	    driver.manage().window().maximize();;
	}
	
	@AfterClass
	public void tearDown() throws IOException {
	    driver.quit();
	} 
	
*/

	@Test
	public void login () throws IOException{
		appUrl = "http://the-internet.herokuapp.com/login"; 
	    System.setProperty("webdriver.chrome.driver", "/Users/adedayo206523124/Downloads/chromedriver");
	    driver = new ChromeDriver();
	    driver.get(appUrl);
	    driver.manage().window().maximize();;
		
	    
		WebElement username = driver.findElement(By.id("username"));
		username.clear();
		username.sendKeys("tomsmith");


		WebElement password = driver.findElement(By.id("password"));
		password.clear();

		password.sendKeys("SuperSecretPassword!");

		WebElement SignInButton = driver.findElement(By.id("login"));
		SignInButton.click();

	}

}
