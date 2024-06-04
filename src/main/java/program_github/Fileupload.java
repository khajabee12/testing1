package program_github;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Fileupload {
	AUTOMATION TESTING 
THIS IS GITHUB
12345678910112
	public static void main(String args[]) {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver.chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
      driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
      driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
      driver.findElement(By.name("Submit")).click();
      driver.switchTo().frame("rightMenu");
      driver.findElement(By.xpath("//input[@type='button'][@value='Add']")).click();
      driver.findElement(By.name("txtEmpFirstName")).sendKeys("nareshit");
      driver.findElement(By.name("txtEmpLastName")).sendKeys("testing");
      WebElement fileinput =driver.findElement(By.xpath("//input[@name='photofile'][@id='photofile']"));
      fileinput.sendKeys("C:\\Users\\Dell\\Downloads\\nature.jpg");
      System.out.println("file upload");
      driver.switchTo().defaultContent();
      driver.close();

}
}
