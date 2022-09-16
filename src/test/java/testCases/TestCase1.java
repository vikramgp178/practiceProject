package testCases;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.HasFullPageScreenshot;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

@Listeners(testCases.CustomListeners.class)

@Epic("Epic - User Actions Login and Registration")
@Feature("Feature -UserFlows ")
public class TestCase1 {

	@Test
	public void googletest() {
		System.out.println("test google ");
	}

	@Test
	@Story("Story - Wiki Story")
	@Description("wiki test case")
	@Severity(SeverityLevel.CRITICAL)
	public void wikiTestCase() throws IOException {
		System.out.println("driver test case");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		driver.quit();
		/*
		 * // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 * 
		 * File PrintScreen = ((TakesScreenshot)
		 * driver).getScreenshotAs(OutputType.FILE); FileUtils.copyFile(PrintScreen, new
		 * File("./Screenshots/1_PagePrintScreen.jpg"));
		 * 
		 * File FullPageScreen = ((HasFullPageScreenshot)
		 * driver).getFullPageScreenshotAs(OutputType.FILE);
		 * FileUtils.copyFile(FullPageScreen, new
		 * File("./Screenshots/2_FullPageScreen1.jpg"));
		 * 
		 * Screenshot s = new
		 * AShot().shootingStrategy(ShootingStrategies.viewportPasting(3000)).
		 * takeScreenshot(driver); ImageIO.write(s.getImage(), "PNG", new
		 * File("./Screenshots/3_fullPageScreenshotUsingLib.png"));
		 * 
		 * WebElement blocks =
		 * driver.findElement(By.xpath("//*[@id=\"www-wikipedia-org\"]/div[7]/div[3]"));
		 * File blocksFile = blocks.getScreenshotAs(OutputType.FILE);
		 * FileUtils.copyFile(blocksFile, new File("./Screenshots/4_blocksFile.jpg"));
		 * 
		 * List<WebElement> links = blocks.findElements(By.tagName("a"));
		 * 
		 * for (WebElement hyperlink : links) { System.out.println("URL is :" +
		 * hyperlink.getAttribute("href") + " Name :" + hyperlink.getText()); }
		 * 
		 * driver.close();
		 */
	}

	@Test
	@Story("Story - Login Story")
	@Description("login test case")
	@Severity(SeverityLevel.CRITICAL)
	public void doLogin() throws FileNotFoundException {

		System.out.println("Test case Pass");
	}

	@Test
	@Description("user registration test case")
	@Story("Story - User Reg. Story")
	@Severity(SeverityLevel.BLOCKER)
	public void doRegi() throws FileNotFoundException {

		// Assert.fail("User Reg. Story Test case failed");
		System.out.println("Test case Pass");

	}

	@Test
	@Story("Story - recover password Story")
	@Description("recover password test case")
	@Severity(SeverityLevel.NORMAL)
	public void doSkip() {
		// throw new SkipException("Test case Skipped");
		System.out.println("Test case Pass");

	}

	@Test
	@Description("user forgot password test case")
	@Story("Story - user forgot password Story")
	@Severity(SeverityLevel.BLOCKER)
	public void doForgot() throws FileNotFoundException {

		// Assert.fail("Test case failed");
		System.out.println("Test case Pass");

	}

}
