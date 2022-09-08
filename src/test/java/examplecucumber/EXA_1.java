package examplecucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class EXA_1 {
	public static WebDriver wd;
	@Given("launch browser")
	public void launch_browser() {
		WebDriverManager.chromedriver().setup();
		wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wd.get("https://djangovinoth.pythonanywhere.com/login/");
	}

	@When("pass usename")
	public void pass_usename() {
		 WebElement username= wd.findElement(By.xpath("//*[@name='username']"));
		  username.sendKeys("priyalakshmi");
	}

	@When("pass password")
	public void pass_password() {
		 WebElement password = wd.findElement(By.name("password"));
		  password.sendKeys("priya12345");
	}

	@When("click login")
	public void click_login() {
		 WebElement login =wd.findElement(By.xpath("/html/body/main/div/div/div/div/form/div/button"));
		  login.click();
	}

	@Then("check login")
	public void check_login() {
	   System.out.println("its correct");
	}


}
