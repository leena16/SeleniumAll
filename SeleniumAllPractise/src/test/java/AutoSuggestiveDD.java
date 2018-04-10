import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDD {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://ksrtc.in/oprs-web/");
		//driver.manage().window().maximize();
		driver.findElement(By.id("fromPlaceName")).sendKeys("BENG");
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
		//driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);*/
	//System.out.println(driver.findElement(By.id("fromPlaceName")).getText());	
		String script="return document.getElementById(\"fromPlaceName\").value;";
	JavascriptExecutor js= (JavascriptExecutor) driver;
	String str=(String) js.executeScript(script);
	//System.out.println(str);

	while (!str.equalsIgnoreCase("BENGALURU INTERNATION AIPORT")) {
		//String script="return document.getElementById(\"fromPlaceName\").value;";
		System.out.println(str);
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
		str=(String) js.executeScript(script);
		System.out.println(str);
		
	}
	
	}
	
	

}
