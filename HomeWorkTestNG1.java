import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HomeWorkTestNG1 {
        WebDriver driver;
        @Test(priority = 1)
        void openBrowser() throws InterruptedException {
            System.out.println("Open browser");
            WebDriverManager.chromedriver().setup();
            System.setProperty("webdriver.chrome.driver","C:\\Users\\shilp\\IdeaProjects\\Software\\Driver\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.get("https://demo.nopcommerce.com/");

            Thread.sleep(2000);
            driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a"));
            driver.findElement(By.className("ico-login")).click();

            driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.header > div.header-upper > div.header-links-wrapper > div.header-links > ul > li:nth-child(2) > a")).click();
            driver.findElement(By.id("Email")).sendKeys("tester123@gmail.com");
            driver.findElement(By.id("Password")).sendKeys("Happy@123");
            Thread.sleep(3000);
            driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div > div > div > div.page-body > div.customer-blocks > div.returning-wrapper.fieldset > form > div.buttons > button")).click();


            driver.findElement((By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button"))).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"small-searchterms\"]")).click();
            driver.findElement(By.xpath("//*[@id=\"product-details-form\"]/div[2]/div[1]/div[2]/div[1]/h1")).click();
            driver.findElement(By.xpath("//*[@id=\"add-to-cart-button-3\"]")).click();
            driver.findElement(By.cssSelector("#checkout")).click();
        }
        @Test(priority = 2)
        void login() throws InterruptedException {
            System.out.println("user able to login");

               }
    @Test(priority = 3)
    void search() {

        System.out.println("user able to search");
    }
    @Test(priority = 4)
    void select() {
        System.out.println("user able to select");
    }
    @Test(priority = 5)
    void add() {

        System.out.println("user able to add");
    }
    @Test(priority = 6)
    void buy() {
        System.out.println("user able to buy");
    }

}




