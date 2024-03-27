package demo;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	WebDriver driver;
    String url ="http://10.82.180.36/Common/Login.aspx";
    @Before
    public void setup()
    {
  	  System.setProperty("webdriver.chrome.driver","C:\\Users\\mohammed.k08\\Documents\\chromedriver-win64\\chromedriver.exe");
  	  driver = new ChromeDriver();
  	  driver.get(url);
  	  driver.manage().window().maximize();
  	  driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
    }
	@org.junit.Test
	public void test() {
		driver.findElement(By.id("body_txtUserID")).sendKeys("donhere");
		driver.findElement(By.id("body_txtPassword")).sendKeys("don@123");
		driver.findElement(By.id("body_btnLogin")).click();
}
	
	@After
	public void close()
	{
		driver.close();
	}

}
