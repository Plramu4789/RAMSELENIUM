import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@Test
		public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver",

		"D:\\FIIT\\chromedriver_win32\\chromedriver.exe");
		Object driver = new ChromeDriver();//Launch Browser
		((Object) driver).manage().window().maximize();
		//driver.manage().deleteAllCookies();
		((Object) driver).manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in");
		String windowHandle = ((Object) driver).getWindowHandle();//Get Parent Window

		in this case www.amazon.in is Parent

		}
		@Test()
		public void search() {
		WebElement search =

		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/d
		iv[2]/div[1]/input"));//By ID

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		search.sendKeys("samsung mobiles");

		WINDOW HANDLE IN SELENIUM

		3 | P a g e

		WebElement enter=driver.findElement(By.id("nav-search-submit-
		button"));

		enter.click();
		WebElement

		find=driver.findElement(By.xpath("//span[contains(text(),'Samsung Galaxy M12
		(Blue,4GB RAM, 64GB Storage) 60')]"));

		find.click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> list = new ArrayList<String>(windowHandles); //Num of

		Windows that is opened

		driver.switchTo().window(list.get(1));
		WebElement buy=driver.findElement(By.id("buy-now-button"));
		buy.click();
		driver.switchTo().window(list.get(0));
		driver.close();

	}


}
