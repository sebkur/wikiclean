package org.wikiclean.languages;

import java.util.List;
import java.util.regex.Pattern;

public class English extends Language {

  // public since it's reused in some languages
  public static final String CATEGORY_LINKS1 = "Category";

  public English() {
    super("en");
  }


  @Override
  protected List<Pattern> footerPatterns() {
    return footerPatterns("See also", "References", "Further reading", "External Links", "Related pages");
  }

  @Override
  protected List<Pattern> categoryLinkPatterns() {
    return categoryLinkPatterns(CATEGORY_LINKS1);
  }
}
