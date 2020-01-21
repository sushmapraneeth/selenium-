package practice.code;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import okio.Timeout;

public class removecontent {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:/Softwares/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement searchTextbox = driver.findElement(By.name("q"));
		searchTextbox.sendKeys("Java");
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		searchTextbox.clear();
		searchTextbox.sendKeys("Selenium");
		searchTextbox.clear();
		searchTextbox.sendKeys("automation");
		searchTextbox.sendKeys(Keys.CONTROL,"a",Keys.DELETE);
//		driver.close();
	}
}
