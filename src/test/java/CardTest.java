import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class CardTest {
    @Test
    void cardTest () throws InterruptedException {
      open("http://localhost:9999");

      SelenideElement form = $("form");
      form.$("[data-test-id=name] input").sendKeys("Петр Петров");
      form.$("[data-test-id=phone] input").sendKeys("+79135589627");
      form.$("[data-test-id=agreement]").click();
      form.$("button").click();
      $("[data-test-id=order-success]").shouldHave(exactText("Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время."));
      Thread.sleep(5000);
    }
}
