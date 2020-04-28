import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class MessageTest {

    String TestStr = "美味的大烧鸡";

    Message  message = new Message(TestStr);



    @Test
    public void TestMessage(){
        //        引入谷歌浏览器驱动器
        System.setProperty("webdriver.chrome.driver", "/Users/liuliu/Downloads/chromedrive");

        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://cn.bing.com/");

        System.out.println("Test Page Title:" + webDriver.getTitle());

        String str = "美味的大烧鸡";
//        元素定位
        WebElement webElement = webDriver.findElement(By.cssSelector("#sb_form_q"));
        webElement.sendKeys(str);
        webElement.submit();

        assertEquals(TestStr,message.PrintMessage());
    }


}
