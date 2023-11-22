package week4day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameWork {
	
	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//h2[text()='JavaScript Confirm Box']//following::button")).click();
	    Alert alert = driver.switchTo().alert();
		alert.accept();
		
		String confirm = driver.findElement(By.xpath("//p[text()='You pressed OK!']")).getText();
		System.out.println(confirm);
	}

}
