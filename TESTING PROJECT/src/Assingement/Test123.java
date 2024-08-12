package Assingement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.assertthat.selenium_shutterbug.core.Capture;
import com.assertthat.selenium_shutterbug.core.Shutterbug;

public class Test123 {

	 
		public static WebDriver driver;
		@Parameters({"Browser"})
		@BeforeTest
		public void setup(String brw) throws Throwable
		{
			switch(brw) {
			case"chrome":
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				Dimension d1 = new Dimension(1920, 1080);
				driver.manage().window().setSize(d1);
				Thread.sleep(2000);
				System.out.println(d1.width+"  "+d1.height);
				driver.get("https://www.getcalley.com/page-sitemap.xml");
				Thread.sleep(5000);
				Shutterbug.shootPage(driver, Capture.FULL, true).save("D:/Fullscreenshotpage/1.png");
				break;
			case"firebox":
				System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
				driver =new FirefoxDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				Dimension d2 = new Dimension(1366, 768);
				driver.manage().window().setSize(d2);
				Thread.sleep(2000);
				System.out.println(d2.width+"  "+d2.height);
				driver.get("https://www.getcalley.com/page-sitemap.xml");
				Thread.sleep(5000);
			    //Shutterbug.shootPage(driver, Capture.FULL_SCROLL ,true).save("D:\\Fullscreenshotpage/2.png");
				break;
			case"edge":
				driver = new EdgeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				Dimension d3 = new Dimension(1536, 864);
				driver.manage().window().setSize(d3);
				Thread.sleep(2000);
				System.out.println(d3.width+"  "+d3.height);
				driver.get("https://www.getcalley.com/page-sitemap.xml");
				Thread.sleep(5000);
				Shutterbug.shootPage(driver, Capture.FULL, true).save("D:/Fullscreenshotpage/3.png");
				break;
			default:
				System.out.println("browser value not matching");
			
			}
			}
			@Test
			public void startTest() throws Throwable
			{
			driver.findElement(By.xpath("//table[@id='sitemap']/tbody/tr[1]/td[1]")).click();
			driver.navigate().back();
			driver.findElement(By.xpath("//table[@id='sitemap']/tbody/tr[2]/td[1]")).click();
			driver.navigate().back();
			driver.findElement(By.xpath("//table[@id='sitemap']/tbody/tr[3]/td[1]")).click();
			driver.navigate().back();
			driver.findElement(By.xpath("//table[@id='sitemap']/tbody/tr[4]/td[1]")).click();
			driver.navigate().back();
			driver.findElement(By.xpath("//table[@id='sitemap']/tbody/tr[5]/td[1]")).click();
			Thread.sleep(2000);
			}
			@AfterTest
			public void tearDown()
			{
			driver.quit();
			}
	

		

	}


