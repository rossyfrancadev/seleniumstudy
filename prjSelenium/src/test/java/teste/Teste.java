package teste;

import static org.junit.Assert.*;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Teste {
	static WebDriver driver;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "Y:/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.youtube.com");
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		

	}
	

}
