import org.junit.jupiter.api.Test;


public class CardTest {
    @Test
    void cardTest (){
      open("http://localhost:9999");

      SelenideElement form = $("form");
      form.$("[data-test-id=name] input").sendKeys("Петр Петров");
      form.$("[data-test-id=phone] input").sendKeys("+79135589627");
      form.$("[data-test-id=agreement]").click();
      form.$("button").click();
      $("[data-test-id=order-success]").shouldHave(exactText("Ваша заявка успешно отправлена.С вами свяжется наш менеджер в ближайшее время!"));
    }
}
