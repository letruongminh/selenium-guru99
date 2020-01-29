import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ImageLink {
    String fbLink = "http://demo.guru99.com/V4/";
    String driverLink = "/Users/minhle/Desktop/driver/chromedriver";
    WebDriver driver;


    @BeforeTest
    public void setUp(){
        System.setProperty( "webdriver.chrome.driver", driverLink );
        driver = new ChromeDriver();
    }

    @AfterTest
    public void tearDown(){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.quit();
    }

    @Test
    public void checkImageLink(){
        driver.get(fbLink);
        driver
                .findElement(By
                        .cssSelector("[type=\"text\"]"))
                .sendKeys("Minh Le");
        driver
                .findElement(By
                        .cssSelector("[type=\"password\"][name=\"password\"]"))
                .sendKeys("Minh Le");

        driver.findElement(By.cssSelector("[name=\"btnLogin\"]")).click();

    }
}
