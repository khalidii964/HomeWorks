package HomeWorks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookT {
    public static void main(String[] args) {

        /*
        3. Let's create a new class
        Using ChromeDriver, go to the Facebook page and verify that the page title (title) is “Facebook". If not, print the correct title.
        Verify that the page URL contains the word “facebook". If it doesn't, print the actual URL.
        Go to https://www.walmart.com/.
        Verify that the page title contains "Walmart.com".
                Go back to the Facebook page.
                Refresh the page.
        Maximize the page (full screen).
                Close the browser.

         */

        WebDriver driver = new ChromeDriver();
        driver.get("https://m.facebook.com/");

        String expectedResultTitle = "Facebook";

        String actualResultTile = driver.getTitle();
        System.out.println(actualResultTile);
            if (actualResultTile.contains(expectedResultTitle)){
                System.out.println("url Title Test Passed");
            }else {
                System.out.println("https://m.facebook.com/");
            }

        driver.navigate().to("https://m.facebook.com/");
        driver.navigate().to(" https://www.walmart.com/");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.manage().window().maximize();
        driver.close();






    }
}
