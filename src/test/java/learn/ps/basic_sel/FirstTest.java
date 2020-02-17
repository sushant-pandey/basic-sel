package learn.ps.basic_sel;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;


public class FirstTest {
	static WebDriver driver;
	@Test
	public void testUI() {
		System.setProperty("webdriver.gecko.driver", "D:\\Softwares\\Driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.softwaretestinghelp.com/geckodriver-selenium-tutorial/");
		String title = driver.getTitle();
		System.out.println(title);
		
		assertTrue(title.contains("GeckoDriver Selenium Tutorial"));
	}
	
	@AfterClass
	public static void cleanUp() {
		driver.quit();
	}

}
