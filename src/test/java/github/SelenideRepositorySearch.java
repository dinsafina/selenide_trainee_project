package github;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SelenideRepositorySearch {
    @Test
    void shouldFileSelenideRepositoryAtTheTop() {
        open("https://github.com/");
        Configuration.browserSize = "1920x1080";
        $(".search-input").setValue("dinsafina").pressEnter();
    }

    @Test
    void avitoSearch() {
        open("https://www.avito.ru/");
        $(".input-input-Zpzc1").setValue("ноутбук").pressEnter();
    }

    @Test
    void avitoUL() {
        open("https://www.avito.ru/");
        $$("ul.index-module-nav-stRnY").first().$("a").click();
        $(".menu-item-header-link-XIo5g").shouldHave(text("Решения для бизнеса"));
    }
}
