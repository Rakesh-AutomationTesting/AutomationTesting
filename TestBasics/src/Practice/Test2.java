package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		

		driver.get("https://www.google.com");
		driver.navigate().to("https://www.youtube.com");
		driver.get("https://www.github.com");
		
		Thread.sleep(1000);
		
		driver.quit();
		
	}

}
