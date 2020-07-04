import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {


    public void login() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
        driver.findElement(By.cssSelector("#email")).sendKeys("cosmin@fasttrackit.org");
        driver.findElement(By.cssSelector("#pass")).sendKeys("123456");
        driver.findElement(By.cssSelector("#send2 > span > span")).click();
        driver.quit();
    }
    public void loginIrina(){
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
        driver.findElement(By.cssSelector("#email")).sendKeys("irinabrinza@yahoo.ro");
        driver.findElement(By.cssSelector("#pass")).sendKeys("12345678");
        driver.findElement(By.cssSelector("#send2 > span > span")).click();
        driver.quit();
    }

    public void invalidEmailLogin() {
        WebDriver driver = new ChromeDriver();
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
        driver.findElement(By.cssSelector("#email")).sendKeys("cosmin");
        driver.findElement(By.cssSelector("#pass")).sendKeys("12345");
        driver.findElement(By.cssSelector("#send2 > span > span")).click();
        driver.quit();
    }

    public void invalidPasswordLogin() {
        WebDriver driver = new ChromeDriver();
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
        driver.findElement(By.cssSelector("#email")).sendKeys("cosmin@fasttrackit.org");
        driver.findElement(By.cssSelector("#pass")).sendKeys("12345");
        driver.findElement(By.cssSelector("#send2 > span > span")).click();
        driver.quit();
    }



    public void ImageTitle() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
        driver.findElement(By.cssSelector("#email")).sendKeys("irinabrinza@yahoo.ro");
        driver.findElement(By.cssSelector("#pass")).sendKeys("12345678");
       driver.findElement(By.cssSelector("#send2 > span > span")).click();
       driver.findElement(By.cssSelector("#header > div > a > img.large")).click();



    }

    public void ProductName() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
        driver.findElement(By.cssSelector("#email")).sendKeys("irinabrinza@yahoo.ro");
        driver.findElement(By.cssSelector("#pass")).sendKeys("12345678");
        driver.findElement(By.cssSelector("#send2")).click();
        driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col2-left-layout > div > div.col-main > div.my-account > div > div:nth-child(3) > div.col2-set > div.col-1 > div > div.box-content > p > a")).click();
        driver.findElement(By.cssSelector("#current_password")).sendKeys("12345678");
        driver.findElement(By.cssSelector("#password")).sendKeys("1111111");
        driver.findElement(By.cssSelector("#confirmation")).sendKeys("1111111");
        driver.findElement(By.cssSelector("#form-validate > div.buttons-set > button")).click();

        //driver.findElement(By.cssSelector("send2 > span > span")).click();





    }




}




