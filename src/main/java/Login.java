import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Login {

    WebDriver driver;
    By userName = By.name("uid");
    By password = By.name("passw");
    By titleText = By.className("#_ctl0__ctl0_Content_Main_promo > table > tbody > tr:nth-child(1) > td > h2");
    By login = By.name("btnSubmit");

    public Login(WebDriver driver) {
        this.driver = driver;
    }

    //Set user name in textbox
    public void setUserName(String strUserName) {
        driver.findElement(userName).sendKeys(strUserName);
    }

    //Set password in password textbox
    public void setPassword(String strPassword) {
        driver.findElement(password).sendKeys(strPassword);
    }

    //Click on login button
    public void clickLogin() {
        driver.findElement(login).click();
    }

    //Get the title of Login Page
    public String getLoginTitle() {
        return driver.findElement(titleText).getText();
    }

    /**
     * This POM method will be exposed in test case to login in the application
     *
     * @param strUserName
     * @param strPasword
     * @return
     */
    public void loginToGuru99(String strUserName, String strPasword) {
        //Fill user name
        this.setUserName(strUserName);
        //Fill password
        this.setPassword(strPasword);
        //Click Login button
        this.clickLogin();

    }
}
