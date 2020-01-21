package practice.code;

import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GmailLogin {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:/Softwares/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com");
		new WebDriverWait(driver, 10)
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='identifierId']")))
				.sendKeys("praneeth.chakri26@gmail.com");
		driver.findElement(By.id("identifierNext")).click();
		new WebDriverWait(driver, 10)
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='password']")))
				.sendKeys("dummyPAssword");
		driver.findElement(By.id("passwordNext")).click();
	}
}
