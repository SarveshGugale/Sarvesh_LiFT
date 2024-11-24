package TestNG_Framework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class LiFT_Test {
	WebDriver driver;

	@Test
	public void LiFTFirstTest() throws InterruptedException {

		for (int i = 0; i < 10; i++) {

//			Thread.sleep(2000);
//
//			driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[1]/div[2]/a")).click();
//
//			Thread.sleep(1000);
//
//			driver.findElement(By.xpath("/html/body/section/div[1]/div[2]/div/form/div[1]/div/div/input"))
//					.sendKeys("Sarvesh+51@mentora.institute");
//
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("/html/body/section/div[1]/div[2]/div/form/div[2]/div/div/input"))
//					.sendKeys("Mentora@2024");
//
//			Thread.sleep(2000);
//
//			driver.findElement(By.xpath("/html/body/section/div[1]/div[2]/div/form/button")).click();

			// FM
			Thread.sleep(2000);

			driver.findElement(By.xpath("/html/body/section/div[3]/div/div[1]/div/div[3]/div[1]/img")).click();

			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div/div/div/textarea"))
					.sendKeys("I want to improve my leadership skills");

			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/section/div/div/div[3]/button")).click();

			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div/div/div/textarea"))
					.sendKeys("Enhance My Leadership Skills");

			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/section/div/div/div[3]/button[2]")).click();

			Thread.sleep(3000);
			JavascriptExecutor js1 = (JavascriptExecutor) driver;
			js1.executeScript("arguments[0].click()",
					driver.findElement(By.xpath("/html/body/section/div/div/div[3]/button[2]")));

			// Background
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div/div/div/textarea")).sendKeys(
					"The leader could address resistance by transparently communicating the benefits of the new language, such as improved performance and long-term sustainability.");

			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/section/div/div/div[3]/button[2]")).click();

			Thread.sleep(3000);

			JavascriptExecutor js11 = (JavascriptExecutor) driver;
			js11.executeScript("arguments[0].click()",
					driver.findElement(By.xpath("/html/body/section/div/div/div[3]/button[2]")));

			// Key-players
			Thread.sleep(5000);
			driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[1]/div/div/input")).sendKeys("Sarvesh");

			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div/div/input")).sendKeys("QA Team");

			// Add
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/section/div/div/button")).click();

			// continue
			Thread.sleep(2000);
			js11.executeScript("arguments[0].click()",
					driver.findElement(By.xpath("/html/body/section/div/div/div[4]/button[2]")));

			// Timeframe
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div/button[2]")).click();

			// Continue
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/section/div/div/div[2]/button[2]")).click();

			// Goal continue
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/section/div/div/div[2]/button[2]")).click();

			Thread.sleep(3000);
			driver.findElement(By.xpath("/html/body/section/div/div/div[3]/button[2]")).click();

			Thread.sleep(7000);
			driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[2]/div[2]/div/div/textarea"))
					.sendKeys("Feelings Excited now");

			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[2]/img")).click();

			// PI
			Thread.sleep(7000);
			driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[2]/div[2]/div/div/textarea"))
					.sendKeys("can you suggest posiive intention");

			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[2]/img")).click();

			Thread.sleep(7000);
			driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[2]/div[2]/div/div/textarea"))
					.sendKeys("Sounds Good");

			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[2]/img")).click();

			Thread.sleep(7000);
			driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div/div/div[10]/div/div[2]/div[2]/button"))
					.click();

			Thread.sleep(5000);
			JavascriptExecutor js12 = (JavascriptExecutor) driver;
			js12.executeScript("arguments[0].click()", driver.findElement(
					By.xpath("/html/body/div[3]/div/div[1]/div/div/div/div[12]/div/div[2]/div[2]/button")));

			Thread.sleep(5000);

			driver.findElement(By.xpath("/html/body/div[3]/header/div/button")).click();

		}
	}

	@BeforeMethod
	public void beforeMethod() {
	}

	@AfterMethod
	public void afterMethod() {
	}

	@BeforeTest
	public void beforeTest() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://beta-dev.mentoralift.ai/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[1]/div[2]/a")).click();

		Thread.sleep(1000);

		driver.findElement(By.xpath("/html/body/section/div[1]/div[2]/div/form/div[1]/div/div/input"))
				.sendKeys("Sarvesh+51@mentora.institute");

		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/section/div[1]/div[2]/div/form/div[2]/div/div/input"))
				.sendKeys("Mentora@2024");

		Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/section/div[1]/div[2]/div/form/button")).click();

	}

	@AfterTest
	public void afterTest() {

		System.out.println("LiFT MyGoal Screen Sucessful");
		driver.close();

	}

}
