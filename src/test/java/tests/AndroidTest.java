package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;

public class AndroidTest extends TestBase {
    @Test
    @Tag("android")
    void searchTest() {
        $(id("org.wikipedia.alpha:id/option_label")).shouldHave(text("1.  English"));
        $(id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();
        $(id("org.wikipedia.alpha:id/primaryTextView")).shouldHave(text("New ways to explore"));
        $(id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();
        $(id("org.wikipedia.alpha:id/primaryTextView")).shouldHave(text("Reading lists with sync"));
        $(id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();
        $(id("org.wikipedia.alpha:id/primaryTextView")).shouldHave(text("Send anonymous data"));
    }
}
