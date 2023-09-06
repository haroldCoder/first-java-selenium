import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Usser\\Desktop\\first-java-selenium\\src\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://es.wikipedia.org/wiki/Programaci%C3%B3n");

        System.out.println(driver.getTitle());

    }
}
