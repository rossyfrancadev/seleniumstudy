package seleniumstudy;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class TestCase {
	// instância do webdriver
		static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {

		// setando caminho do driver
		System.setProperty("webdriver.chrome.driver", "Y:/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		// Config wait for page
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.get("https://www.youtube.com");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		// fecha a aba que está sendo utilizada
		driver.close();
		// fecha o browser
		// driver.quit();
	}

	

}
