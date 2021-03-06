package ru.st.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.openqa.selenium.support.ui.ExpectedConditions.*;

public class LoginPage extends AnyPage {

	public LoginPage(PageManager pages) {
		super(pages);
	}

	@FindBy(id = "username")
	private WebElement usernameField;

    By byUsernameField = By.id("username");

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(tagName = "Button")
    private WebElement submitButton;


    public LoginPage setUsernameField(String text) {
        usernameField.sendKeys(text);
        return this;
    }

    public LoginPage setPasswordField(String text) {
        passwordField.sendKeys(text);
        return this;
    }

    public void clickSubmitButton() {
        submitButton.click();
      }

    public LoginPage ensurePageLoaded() {
        super.ensurePageLoaded();
//        try {
        wait.until(presenceOfElementLocated(byUsernameField));
//        } catch (Exception e) {
//            System.out.println("EXPECTED ERROR: " + e.getMessage());
//        }
        return this;
    }
}
