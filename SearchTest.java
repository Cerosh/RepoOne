package Framework.Automation.Test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class SearchTest {
	
	
	WrapperClass d9 ;
@Parameters({"browser"})
@BeforeTest
public void setup(String browser) {
 this.d9= new WrapperClass(browser);
}

@AfterTest
public void tearDown() {
	d9.quit();
}
@Test(description ="Description about Search Test")
public void searchTest() {
	HomePage home = new HomePage(d9);
	home.lauchHomePage();
	LanguagePage lang =	home.launchLangPage();
	Assert.assertEquals("Wikipedia, the free encyclopedia", lang.getTitle());
	
}


}
