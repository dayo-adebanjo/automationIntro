package testing1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginObject {
	//Global Variables 
	private WebDriver webDriver;
	private WebElement logIn;
	private WebElement username;
	
	@FindBy(id ="password")
	private WebElement password;
	
	//Constructors 
	public LoginObject(){
	}

	public LoginObject(WebDriver driver) {
		this.setWebDriver(driver);
		username = driver.findElement(By.id("username"));
		password = driver.findElement(By.id("password"));
		logIn = driver.findElement(By.id("login"));
	}
	

	//Getters and Setters 
	public boolean isTheUserNameFieldPresent(){	
		return getUsername().isDisplayed();	
	}
	
	public boolean isTheLogInLinkPresent(){	
		return getLogIn().isDisplayed();	
	}
	
	public boolean isThePasswordBoxPresent(){	
		return getPassword().isDisplayed();	
	}

	public WebElement getLogIn() {
		return logIn;
	}

	public WebElement getUsername() {
		return username;
	}
	
	public WebElement getPassword() {
		return password;
	}

	public WebDriver getWebDriver() {
		return webDriver;
	}

	public void setWebDriver(WebDriver webDriver) {
		this.webDriver = webDriver;
	}
	

}
