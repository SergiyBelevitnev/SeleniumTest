import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class MainClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\belevitnev\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

//        System.setProperty("webdriver.gecko.driver","C:\\Users\\belevitnev\\Downloads\\geckodriver-v0.21.0-win64\\geckodriver.exe");
//        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.facebook.com");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://www.ukr.net");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='login-frame-wraper']/iframe")));
        driver.findElement(By.xpath("//*[@id=\"id-input-login\"]")).sendKeys("belevitnev");
        driver.findElement(By.xpath("//*[@id=\"id-input-password\"]")).sendKeys("3109703178");
        driver.findElement(By.xpath("/html/body/form/div[6]/button")).click();


//        driver.findElement(By.xpath("/html/body/form")).click();
//        driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("3109703178");

        System.out.println( driver.findElement(By.xpath("//*[@id=\"id-input-login\"]")).getAttribute("id"));
//        driver.close();
//
//
//
//        driver.quit();
    }
}
