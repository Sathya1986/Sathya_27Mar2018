package package001;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ClassNew001 {
	
	WebDriver driver;
	
	@Test
	public void test2()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\s.a.shanmugam\\\\Desktop\\\\Sathya_Personal\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("http://www.google.com");
		
		driver.close();
		
		
	}

}
