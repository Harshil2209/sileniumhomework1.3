import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class MultiBrowserTest {

    //BaseUrl = http://the-internet.herokuapp.com/login

    static String baseUrl = " http://the-internet.herokuapp.com/login ";
    static String browser = "Chrome";
    //static String browser ="Firefox";
    //static String browser ="Edge";
    //static String browser ="Safari";

    public static void main(String[] args) throws InterruptedException {
        //1. Setup Chrome browser
        WebDriver driver = new ChromeDriver();
      //  WebDriver driver = new FirefoxDriver();
      //  WebDriver driver = new EdgeDriver();
      //  WebDriver driver = new SafariDriver();
        System.setProperty("webdriver.chrome.driver" , "chromedriver.exe");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().window().maximize();

        //2. Open Url
        driver.get(baseUrl);

        //3.Print the title of page
        String title = driver.getTitle();
        System.out.println("Title of the page: " + title);

        //4.Print the current Url
        System.out.println(baseUrl);

        //5.Print the page source
        String pageSource = driver.getPageSource();
        System.out.println(driver.getPageSource());

        //6. Enter email to email field
        WebElement emailField = driver.findElement(By.id("username"));
        emailField.sendKeys("harry2209");

        //7.Enter the password to password field
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("superlogin");

        //8. Click on login button
        WebElement loginLink = driver.findElement(By.xpath("//button[@type='submit']"));
        loginLink.click();
        Thread.sleep(4000);

        //9.Print the current Url
        System.out.println("The current Url: " + driver.getCurrentUrl());

        //10. Refresh the page
        driver.navigate().refresh();

        //11. Close the browser
        driver.quit();


    }
}
