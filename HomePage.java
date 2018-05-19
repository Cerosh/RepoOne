package Framework.Automation.Test;

import org.openqa.selenium.WebDriver;

public class HomePage {

private WrapperClass d2;
private final String URL = "https://www.wikipedia.org/";
private final String URL1 = "https://en.wikipedia.org/wiki/Main_Page";

	public HomePage(WrapperClass d1) {
		this.d2 = d1;
	}
	public HomePage lauchHomePage() {
		d2.get(URL);
		return this;
	}
	public LanguagePage launchLangPage() {
		d2.get(URL1);
		return new LanguagePage(d2);
	}
	

}
