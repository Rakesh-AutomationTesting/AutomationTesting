package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasicTest {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("q")).sendKeys("Winter");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
		WebDriverWait wait =  new WebDriverWait(driver, 5);
		
		WebElement ele1 = driver.findElement(By.id("logo"));
		
		wait.until(ExpectedConditions.visibilityOf(ele1));
		
		String readText = driver.findElement(By.className("zCubwf")).getText();
		System.out.println(readText);
		
		Thread.sleep(2000);
		
		driver.close();
		
		

	}

}
