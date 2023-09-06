
import java.sql.Driver;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class prueba2 {
    public static void main(String[] args) throws Exception {
        Map<String, String> env = System.getenv();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Usser\\Desktop\\first-java-selenium\\src\\drivers\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.facebook.com/");

        System.out.println(driver.getTitle());

        WebElement usuario = driver.findElement(By.id("email"));
        usuario.sendKeys(env.get("USER_FACEBOOK"));
        WebElement password = driver.findElement(By.id("pass"));
        password.sendKeys(env.get("PASSWORD_FACEBOOK"));

        WebElement botonLogin = driver.findElement(By.name("login"));
        botonLogin.click();
        
        WebElement buscar = driver.findElement(By.xpath("//label[contains(@class, 'x1a2a7pz')]"));
        buscar.click();

         WebElement ls = driver.findElement(By.xpath("//input[contains(@class, 'x1i10hfl')]"));
        ls.sendKeys("Dim");
        ls.sendKeys(Keys.ENTER);
        
    

    }
}
