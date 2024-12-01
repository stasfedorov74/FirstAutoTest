import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;

public class searchPage {
    private final ElementsCollection articlesTitle = Selenide.$$x("//h2//a");

    /**
     * возвращает ссылку на первую статью
     * @return
     */
    public String getHrefFirstArticle() {
       return articlesTitle.first().getAttribute("href");
    }
    }
