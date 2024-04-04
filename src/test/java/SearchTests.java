import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchTests {
    @Test
    void successfulSearchTest() {
        open("https://www.google.com/");
        $("[name=q]").setValue("selenide").pressEnter();
        //$(".tjvcx GvPZzd cHaqb").shouldHave(text("https://selenide.org"));
    }

    @Test
    void qaGuruFormTest() {
        Configuration.holdBrowserOpen = true;
        Configuration.timeout = 10000;
        open("https://qa.guru/cms/system/login?required=true");
        Configuration.timeout = 10000;
        $("#xdget172046_1").shouldHave(text("Войти"));
        $("[name=email]").setValue("qagu@gmail.com");
        $("[name=pasword]").setValue("passpass");
        $("#xdget33092_1").click();
    }

    @Test
    void name() {
        Configuration.holdBrowserOpen = true;
        Configuration.timeout = 10000;
        open("https://tomas33.ru/authentication?back=my-account");
        Configuration.timeout = 10000;
        $("[name=email]").setValue("qagu@gmail.com");
    }
}
