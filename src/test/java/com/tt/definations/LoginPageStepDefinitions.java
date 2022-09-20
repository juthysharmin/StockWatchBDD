package com.tt.definations;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageStepDefinitions {
	 
    private static WebDriver driver;       
    public final static int TIMEOUT = 10;
     
    @Before
    public void setUp() {
 
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
        driver.manage().window().maximize();
    }
    @After
    public void close() {
    	driver.quit();
    }
    @Given("I am on Site Homepage")
	public void goToHomepage() {
	driver.get("https://thestockmarketwatch.com/members/login.aspx?pg=%2fmembers%2fmy-watchlist.aspx");
	
	}   
	@When ("I click on My Watch to view portfolio on the page")
	public void goToPortfoliopage() {
		driver.get("https://thestockmarketwatch.com/members/login.aspx?pg=%2fmembers%2fmy-watchlist.aspx");		
	}
	@And ("I enter “talentechcy” in to the “User Name” field on the login page")
	public void validUsername() {
		driver.findElement(By.id("ContentPlaceHolder1_txtUserName")).sendKeys("talentechcy");
	}
	@And  ("I enter CyTech2022 into the “password” field on the Registration page")
	public void validPassWord () {
		driver.findElement(By.id("ContentPlaceHolder1_txtPassword")).sendKeys("CyTech2022");
		}
	@And (" I click on “submit” on the login page")
	public void clickSubmit() {
		driver.findElement(By.id("ContentPlaceHolder1_btnLogin")).click();
	}
	@Then(" I am able to login successfully")
	public void loginpage () {
        String pageURL = driver.getCurrentUrl();
		
		Assert.assertEquals("https://thestockmarketwatch.com/members/my-watchlist.aspx", pageURL);
	}
 



    
    }
    

