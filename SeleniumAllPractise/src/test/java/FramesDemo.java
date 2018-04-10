import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FramesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*System.setProperty("webdriver.gecko.driver", "driver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();*/
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demoqa.com/datepicker/");
		driver.findElement(By.xpath(".//*[@id='datepicker1']")).click();
		
		while(!driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText().contains("April")) {
			driver.findElement(By.xpath("//a[@data-handler='next']")).click();
		}
		
		
		int dateSize=driver.findElements(By.xpath("//td[@data-handler='selectDay']")).size();
		for(int i=0;i<dateSize;i++) {
			if(driver.findElements(By.xpath("//td[@data-handler='selectDay']")).get(i).getText().equals("16")) {
				driver.findElements(By.xpath("//td[@data-handler='selectDay']")).get(i).click();
				break;
			}
			
		}
	
	}
	
}
