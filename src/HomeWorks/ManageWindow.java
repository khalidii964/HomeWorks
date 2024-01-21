package HomeWorks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ManageWindow {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        System.out.println("The size of the page  is: "+ driver.manage().window().getPosition());
        System.out.println("The position of the page is : " + driver.manage().window().getSize());

        driver.manage().window().minimize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().window().maximize();

        driver.manage().window().fullscreen();
        System.out.println("The full screen page  position is: " +driver.manage().window().getPosition());
        System.out.println("The full screen page size  is: " +driver.manage().window().getSize());

        driver.close();

    }
}
