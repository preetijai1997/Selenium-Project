package SeleniumTutorialPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataproviderDemo {
	
	@Test(dataProvider="create")
	public void DataSet(String username, String password)
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\bs0452\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login-button")).click();
		driver.close();
	}

@DataProvider(name="create")
public Object[][] dataSet()
{
	return new Object[][]
			{
		{"standard_user","secret_sauce"},
		{"locked_out_user","secret_sauce"},
		{"problem_user","secret_sauce"},
		{"performance_glitch_user","secret_sauce"}
			};
}
}
