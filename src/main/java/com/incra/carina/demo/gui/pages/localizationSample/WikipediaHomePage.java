package com.incra.carina.demo.gui.pages.localizationSample;

import com.qaprosoft.carina.core.foundation.utils.resources.L10N;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class WikipediaHomePage extends AbstractPage {

  @FindBy(xpath = "//div[@id='js-lang-lists']//a")
  private List<ExtendedWebElement> langList;

  @FindBy(id = "js-lang-list-button")
  private ExtendedWebElement langListBtn;

  @FindBy(id = "{L10N:HomePage.welcomeTextId}")
  private ExtendedWebElement welcomeText;

  public WikipediaHomePage(WebDriver driver) {
    super(driver);
    setPageAbsoluteURL("https://www.wikipedia.org/");
  }

  public String getWelcomeText() {
    langListBtn.clickIfPresent();
    if (!langList.isEmpty()) {
      for (ExtendedWebElement languageBtn : langList) {
        if (languageBtn.getAttribute("lang").equals(L10N.getDefaultLocale().getLanguage())) {
          languageBtn.click();
          return welcomeText.getText();
        }
      }
    }
    return null;
  }
}
