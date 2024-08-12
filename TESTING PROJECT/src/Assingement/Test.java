package Assingement;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.dealsdray.com/");
		driver.findElement(By.name("username")).sendKeys("prexo.mis@dealsdray.com");
		driver.findElement(By.name("password")).sendKeys("prexo.mis@dealsdray.com");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
		driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
		driver.findElement(By.xpath("(//button[@type='button'])[6]")).click();
		Thread.sleep(4000);
		WebElement ele=	driver.findElement(By.xpath("//div[@class='MuiOutlinedInput-root MuiInputBase-root MuiInputBase-colorPrimary MuiInputBase-formControl MuiInputBase-sizeSmall css-uodm64']"));
		ele.click();
		//robot class handle window Gui
		Robot r = new Robot();
		r.delay(2000);
		//copy the path of file in clipboard
		StringSelection ss = new StringSelection("D:\\demo-data.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		//ctrl+v perform methods
		//press on ctrl key
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.delay(2000);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		r.delay(2000);
		//enter path
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		r.delay(3000);
		driver.findElement(By.xpath("(//button[@type='button'])[7]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@type='button'])[7]")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		//screen short -1
		File screen1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screen1, new File("D:/screenshotpages/1.png"));
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		//scroll down the page
		WebElement element1 = driver.findElement(By.xpath("//table[@class='MuiTable-root css-9177x2']/tbody/tr[3]"));
		Actions ac = new Actions(driver);
		ac.moveToElement(element1).perform();
		Thread.sleep(2000);
		//screen short -2
		File screen2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screen2, new File("D:/screenshotpages/2.png"));
		Thread.sleep(2000);
		//scroll down the page
		WebElement element2 = driver.findElement(By.xpath("//table[@class='MuiTable-root css-9177x2']/tbody/tr[7]"));
		ac.moveToElement(element2).perform();
		Thread.sleep(2000);
		//screen short -3
		File screen3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screen3, new File("D:/screenshotpages/3.png"));
		Thread.sleep(2000);
		//scroll down the page
		WebElement element3 = driver.findElement(By.xpath("//table[@class='MuiTable-root css-9177x2']/tbody/tr[10]"));
		ac.moveToElement(element3).perform();
		Thread.sleep(2000);
		//screen short -4
		File screen4 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screen4, new File("D:/screenshotpages/4.png"));
		Thread.sleep(2000);
		//scroll to bottom
		WebElement element4 = driver.findElement(By.xpath("(//button[@type='button'])[9]"));
		ac.moveToElement(element4).perform();
		Thread.sleep(2000);
		//screen short -5
		File screen5 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screen5, new File("D:/screenshotpages/5.png"));
		Thread.sleep(2000);


	}


	





		

	}


