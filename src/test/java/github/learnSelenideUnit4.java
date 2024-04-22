package github;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;

public class learnSelenideUnit4 {
    @BeforeAll
    static void setupSuite() {
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void selenideAssertionHW() {
        open("https://github.com/selenide/selenide/wiki");
        $(By.linkText("Soft assertions")).click();
        $(byXpath("//*[@class= 'heading-element' and contains(text(), '3. Using JUnit5 extend test class:')]")).shouldHave(text("3. Using JUnit5 extend test class:"));
    }
}
