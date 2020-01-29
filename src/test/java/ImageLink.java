import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ImageLink {
    WebDriver driver;

    String strGuruLink = "http://demo.guru99.com/V4/";
    String driverLink = "/Users/minhle/Desktop/driver/chromedriver";
    @BeforeTest
    public void SetUp(){
        System.setProperty("webdriver.chrome.driver", driverLink );
        driver = new ChromeDriver();
    }

    @AfterTest
    public void tearDown(){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.quit();
    }

    @Test
    public void login(){
        driver.get(strGuruLink);
        WebElement txtUserID = driver.findElement(By.cssSelector("[type=\"text\"][name=\"uid\"]"));
        WebElement txtPassword = driver.findElement(By.cssSelector("[type=\"password\"]"));
        WebElement btnLogin = driver.findElement(By.cssSelector("[name=\"btnLogin\"]"));

        txtUserID.sendKeys("Minh Le UID");
        txtPassword.sendKeys("Minh Le PW");
        btnLogin.click();
    }
}
