package selenium1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class auto1 {
	WebDriver driver;
	@BeforeTest()
	public void facebook() {
		// TODO Auto-generated method stub
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ramu\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
		@Test()
		public void login(){		
		//driver.findElement(By.id("email")).sendKeys("p.l.ramu4789@gmail.com");
		//driver.findElement(By.id("pass")).sendKeys("Vivek0312#");
		//driver.findElement(By.id("login")).click();
		driver.findElement(By.linkText("Create New Account")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Select se = new Select(driver.findElement(By.xpath("//*[@id=\"day\"]")));
		se.selectByValue("4");
		}
		@AfterTest()
		public void close()
		{
		driver.close();
	}}

