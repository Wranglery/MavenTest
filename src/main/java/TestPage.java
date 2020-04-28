
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;


public class TestPage {

    static WebDriver driver;
    static Login objLogin;
    static HomePage objHomePage;

    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", "/Users/liuliu/Downloads/chromedrive");

        driver = new ChromeDriver();
        driver.get("http://www.testfire.net/login.jsp");

        objLogin = new Login(driver);
        objHomePage = new HomePage(driver);
    }


    @Test
    public void test_Home_Page_Appear_Correct() {

        String loginPageTitle = driver.getTitle();
        System.out.println("title:" + loginPageTitle);

        objLogin.setUserName("admin");
        objLogin.setPassword("admin");
        objLogin.clickLogin();
        System.out.println("获得到的Text:"+objHomePage.getHomePageDashboardUserName());
        assertEquals("Congratulations!", objHomePage.getHomePageDashboardUserName());
    }

}
