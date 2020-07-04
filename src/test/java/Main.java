public class Main {


    public static void main(String[] args) {

//        Decomentati pentru windows cu Chrome V 83
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

        //System.setProperty("webdriver.chrome.driver","resources/chromedriver");

        LoginTest login = new LoginTest();
         login.login();
         login.loginIrina();
         login.invalidEmailLogin();
         login.invalidPasswordLogin();
         login.ImageTitle();
         login.ProductName();

      RegisterTest test =new RegisterTest();

        test.RegisterValabile();
        test.InvalidCharacterAndEmail();
        test.NewRegister();

      WishListTest wishlist  =new WishListTest();

      wishlist .AddProduct();
      wishlist.NavigareSale();
      wishlist.AddProductwish();
        wishlist.ProductVip();





    }

}
