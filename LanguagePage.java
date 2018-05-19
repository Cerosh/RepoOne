package Framework.Automation.Test;


public class LanguagePage {

	private WrapperClass d4;
	private String title;

	public LanguagePage(WrapperClass d3) {
		this.d4= d3;
	}

	public String getTitle() {
		title = d4.getTitle();
		return title;
	}
	

}
