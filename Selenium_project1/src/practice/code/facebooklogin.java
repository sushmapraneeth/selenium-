package practice.code;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebooklogin {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "F:/Softwares/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement emailTextbox = driver.findElement(By.id("email"));
		emailTextbox.sendKeys("sushmapraneeth9391@gmail.com");
		 driver.findElement(By.id("pass")).sendKeys("invalid",Keys.ENTER);
	}
}