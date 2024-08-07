package components;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SelectCityPopUp {
    private final SelenideElement citySelectPopup = $(".locality-selector-popup");
    private final SelenideElement searchInput =
            $("[data-testid='locality-selector-popup__search-input']");
    private final ElementsCollection cityButton = $$(".locality-selector-popup__table__group");
    //private final SelenideElement cityButton = $$(".locality-selector-popup__table__group");
    private final ElementsCollection bigCityButton = $$(".locality-selector-popup__big-city");


    public void selectCityBySearch(String city) {
        searchInput.click();
        searchInput.setValue(city);
        cityButton.findBy(text(city)).click();
    }

    public void selectBigCity(String city) {
        bigCityButton.findBy(text(city)).click();
    }

}
