package WebsiteReader;

import javax.swing.text.Document;

import org.jsoup.*;

public class WebsiteReader {
	public static void main(String[] args) {
		Document doc = Jsoup.connect("https://esmunich.de/home.html").get();
	}
}
