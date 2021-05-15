package testLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



@Test
public class testingLogin 
{
	public void createNewAcc_Test() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//Invoke Browser
		driver.get("https://www.instagram.com/accounts/emailsignup/");
		Thread.sleep(3000);
		WebElement emailOrPhone = driver.findElement(By.name("emailOrPhone"));
		emailOrPhone.sendKeys("dakaevas13@gmail.com");
		driver.findElement(By.name("fullName")).sendKeys("Kent Broom");
		driver.findElement(By.name("username")).sendKeys("KENTBROOM4");
		driver.findElement(By.name("password")).sendKeys("*NewPassword1");
		WebElement clickBtn = driver.findElement(By.cssSelector("#react-root > section > main > div > div > div:nth-child(1) > div > form > div:nth-child(8) > div > button"));
		clickBtn.click();
		Thread.sleep(3000);
		//Assert.assertTrue();
		
		driver.close();
	}
	
	public void createNewAcc_Test_ExistingAcc() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//Invoke Browser
		driver.get("https://www.instagram.com/accounts/emailsignup/");
		Thread.sleep(3000);
		WebElement emailOrPhone = driver.findElement(By.name("emailOrPhone"));
		emailOrPhone.sendKeys("dakaevas13@gmail.com");
		driver.findElement(By.name("fullName")).sendKeys("Kent Broom");
		driver.findElement(By.name("username")).sendKeys("KENTBROOM4");
		driver.findElement(By.name("password")).sendKeys("*NewPassword1");
		//Assert.assertFalse();
		
		driver.close();
	}
	
	public void login_Test_Succesful() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//Invoke Browser
		driver.get("https://www.instagram.com/accounts/login/");
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("KENTBROOM4");
		driver.findElement(By.name("password")).sendKeys("*NewPassword1");
		//Assert.assertEquals(String actual, String expected); Assert that logged in
		
		driver.close();
	}
	
}
