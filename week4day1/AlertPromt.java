package week4day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPromt {

	public static void main(String[] args) throws InterruptedException{
		 ChromeDriver driver = new ChromeDriver();
	   	 driver.get("https://buythevalue.in/");
	   	 driver.manage().window().maximize();
	   	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	   	 
	   	 driver.findElement(By.xpath("//a[@class='grid-image']")).click();
	   	 driver.findElement(By.xpath("//input[@name='wk_zipcode']")).sendKeys("600036");
	   	 driver.findElement(By.xpath("//input[@class='btn']")).click();
	   	 driver.findElement(By.xpath("//button[@id='product-add-to-cart']")).click();
	   	 Thread.sleep(5000);
	   	 driver.findElement(By.xpath("//span[@data-hover='View Cart']")).click();
	    Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='checkout']")).click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		alert.accept();			   	

	}

}
