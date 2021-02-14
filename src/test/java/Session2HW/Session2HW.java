package Session2HW;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Session2HW {
	
	WebDriver driver;

	@Before
	public void launchBrowser() {

		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://techfios.com/billing/?ng=login/");
	}

	@Test
	public void loginTest() throws InterruptedException {

		
		//Using ID
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		
		//Using Name
		driver.findElement(By.name("login")).click();

		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Transactions']")).click();
		
		driver.findElement(By.linkText("New Deposit")).click();
		
		Thread.sleep(5000);
		
		//driver.findElement(By.xpath("//span[@id = 'select2-account-container']")).click();
		
		//Thread.sleep(2000);
		
		driver.findElement(By.xpath("//select[@id='account']/option[2]")).click();
		
		driver.findElement(By.xpath("//input[@id='description']")).sendKeys("Annie");
		
		driver.findElement(By.xpath("//input[@id='amount']")).sendKeys("1000");
		
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		

	}



}
