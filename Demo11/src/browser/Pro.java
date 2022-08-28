package browser;

import java.awt.Robot;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pro {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\QSPJSP\\eclipse-workspace\\Demo1\\src\\browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  WebElement ele =	driver.findElement(By.name("q"));
	  ele.sendKeys("Hero Hoodie",Keys.ENTER);
	 // driver.findElement(By.xpath("//div[@class='swatch-option color selected']")).click();
	  driver.findElement(By.xpath("(//a[@class='product-item-link'])[1]")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//div[@id='option-label-size-143-item-167']")).click();
	   
	  driver.findElement(By.xpath("//div[@id='option-label-color-93-item-53']")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//span[text()='Add to Cart']")).click();
	 //driver.findElement(By.xpath("//span[@class='counter qty']")).click();
	   Thread.sleep(3000);
	  driver.findElement(By.xpath("//a[text()='shopping cart']")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//span[text()='Proceed to Checkout']")).click();
	  Thread.sleep(3000);
	  
	  driver.findElement(By.xpath("//input[@id='customer-email']")).sendKeys("Abc@gmail.com",Keys.TAB,Keys.TAB,"Demo");
		
	}

}
