import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

/**
 * Главная страница https://appleinsider.ru/
 */
public class MainPage {
    private final SelenideElement textBoxInput = Selenide.$x("//input[@type='text']");
    public MainPage(String url) {
        Selenide.open(url);
    }

    /**
     * Выполняет поиск среди статей и нажимается кнопка Enter
     * @param searchString
     */
    public void search(String searchString) {
        textBoxInput.setValue(searchString);
        textBoxInput.sendKeys(Keys.ENTER);
    }

}
