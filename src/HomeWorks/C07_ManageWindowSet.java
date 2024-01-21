package HomeWorks;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C07_ManageWindowSet {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        System.out.println("The page size is : " + driver.manage().window().getSize());
        System.out.println("The page position is:  " + driver.manage().window().getPosition());

        driver.manage().window().setSize(new Dimension(600,400));
        driver.manage().window().setPosition(new Point(500,700));

        driver.close();
    }

}
