package tutorial;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Flight_List2 {
	private WebDriver driver;
	  private String baseUrl;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();

	  @BeforeClass(alwaysRun = true)
	  public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\Software\\chromedriver_win32_83\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }

	  @Test
	  public void testPhpTravel() throws Exception {
	    driver.get("https://www.phptravels.net/home");
	    driver.findElement(By.xpath("//a[@class='text-center flights ']")).click();
	    driver.findElement(By.xpath("//div[@id='flights']/div/div/form/div/div/div/div/div[2]/label")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//div[@id='flights']/div/div/form/div/div/div[2]/div/div/a/span")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//div[@id='flights']/div/div/form/div/div/div[2]/div/div/div/ul/li[2]")).click();
	    driver.findElement(By.xpath("//body")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//body")).click();
	    driver.findElement(By.id("FlightsDateStart")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//div[@id='datepickers-container']/div[8]/div/div/div[2]/div[17]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//div[@id='datepickers-container']/div[9]/div/div/div[2]/div[19]")).click();
	    driver.findElement(By.xpath("(//button[@type='button'])[7]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("(//button[@type='button'])[9]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("(//button[@type='button'])[11]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	    Thread.sleep(3000);
	  }

	  @AfterClass(alwaysRun = true)
	  public void tearDown() throws Exception {
	    driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	  }

	  private boolean isElementPresent(By by) {
	    try {
	      driver.findElement(by);
	      return true;
	    } catch (NoSuchElementException e) {
	      return false;
	    }
	  }

	  private boolean isAlertPresent() {
	    try {
	      driver.switchTo().alert();
	      return true;
	    } catch (NoAlertPresentException e) {
	      return false;
	    }
	  }

	  private String closeAlertAndGetItsText() {
	    try {
	      Alert alert = driver.switchTo().alert();
	      String alertText = alert.getText();
	      if (acceptNextAlert) {
	        alert.accept();
	      } else {
	        alert.dismiss();
	      }
	      return alertText;
	    } finally {
	      acceptNextAlert = true;
	    }
	  }

}
