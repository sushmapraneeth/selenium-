package practice.code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Execute {
public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "F:/Softwares/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com");
		WebElement searchTextbox = driver.findElement((By.name("q")));
		searchTextbox.sendKeys("Java");
		System.out.println("Text Field Set");
		System.out.println("Text Field Set1");
//		driver.close();
		
	}
}
