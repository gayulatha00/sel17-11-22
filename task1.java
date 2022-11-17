package task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class task1 {
   public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Jsel\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		WebElement course= driver.findElement(By.xpath("//a[text()='COURSES']"));
		Actions act = new Actions(driver);
		act.moveToElement(course).perform();
		WebElement Oracle = driver.findElement(By.xpath("//span[text()='Oracle Training']"));
		act .moveToElement(Oracle).perform();
		WebElement ad=driver.findElement(By.xpath("//span[text()='SQL Certification']"));
	    act .moveToElement(ad).perform();
		

	}

}
