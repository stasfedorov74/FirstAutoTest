import com.codeborne.selenide.Selenide;
import org.junit.Assert;
import org.junit.Test;

public class AppleTest extends BaseTest {

    private final static String URL = "https://appleinsider.ru/";
    private final static String SEARCH_STRING = "Чем iPhone 13 отличается от iPhone 12";

    @Test
    public void checkHref() {
        MainPage mainPage = new MainPage(URL);
        mainPage.search(SEARCH_STRING);
        searchPage searchPage = new searchPage();
        String href = searchPage.getHrefFirstArticle();
        Assert.assertTrue(href.contains("iphone-13"));
    }

}
