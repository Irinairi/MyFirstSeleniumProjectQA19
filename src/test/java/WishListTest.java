import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class WishListTest {


    public void AddProduct() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
        driver.findElement(By.cssSelector("#email")).sendKeys("irinabrinza@yahoo.ro");
        driver.findElement(By.cssSelector("#pass")).sendKeys("12345678");
        driver.findElement(By.cssSelector("#nav > ol > li.level0.nav-6.last > a")).click();
        driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col3-layout > div > div.col-wrapper > div.col-main > div.category-products > ul > li:nth-child(3) > div > h2 > a")).click();
        driver.findElement(By.cssSelector("#product_addtocart_form > div.product-shop > div.product-options-bottom > ul.add-to-links > li:nth-child(1) > a")).click();
        driver.quit();

    }


    //Adăugati un test(o noua metoda) prin care să deschideți homepage-ul site-ului, apoi să navigați la categoria "Sale", //
    // apoi să deschideți pagina de detalii a primului produs și să încercați să îl adăugați în WishList, //
    // apăsând butonul Add to Wishlist. Pe viitor, după ce veți învăța să faceți și verificări,//
    // veți putea reveni pentru a vă asigura că adăugarea în wishlist poate fi realizată doar de utilizatorii autentificați. //
    // Apelati metoda aceasta in metoda main pentru a rula testul.

    public void NavigareSale() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
        driver.findElement(By.cssSelector("#email")).sendKeys("irinabrinza@yahoo.ro");
        driver.findElement(By.cssSelector("#pass")).sendKeys("12345678");
        driver.findElement(By.cssSelector("#send2")).click();
        driver.findElement(By.cssSelector("#nav > ol > li.level0.nav-5.parent > a")).click();
        driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col3-layout > div > div.col-wrapper > div.col-main > div.category-products > ul > li:nth-child(1) > div > div.actions > ul > li:nth-child(1) > a")).click();
        driver.quit();


    }
    public void AddProductwish() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
        driver.findElement(By.cssSelector("#email")).sendKeys("irinabrinza@yahoo.ro");
        driver.findElement(By.cssSelector("#pass")).sendKeys("12345678");
        driver.findElement(By.cssSelector("#send2")).click();
        driver.findElement(By.cssSelector("#nav > ol > li.level0.nav-6.last > a ")).click();
        driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col3-layout > div > div.col-wrapper > div.col-main > div.category-products > ul > li:nth-child(1) > div > h2 > a")).click();
        driver.findElement(By.cssSelector("#product_addtocart_form > div.product-shop > div.product-options-bottom > ul.add-to-links > li:nth-child(1) > a")).click();
    }

           public void ProductVip () {
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("http://testfasttrackit.info/selenium-test/");
            driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
            driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
            driver.findElement(By.cssSelector("#email")).sendKeys("irinabrinza@yahoo.ro");
            driver.findElement(By.cssSelector("#pass")).sendKeys("12345678");
            driver.findElement(By.cssSelector("#send2")).click();
            driver.findElement(By.cssSelector("#nav > ol > li.level0.nav-6.last > a")).click();
            driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col3-layout > div > div.col-wrapper > div.col-main > div.category-products > ul > li:nth-child(3) > div > h2 > a")).click();
            driver.findElement(By.cssSelector("#product_addtocart_form > div.product-shop > div.product-options-bottom > ul.add-to-links > li:nth-child(1) > a")).click();
            driver.quit();

t



    }

}

