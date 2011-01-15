package d4d30.scala.evaluation.fixture

import fitlibrary.DoFixture
import com.gargoylesoftware.htmlunit.WebClient
import com.gargoylesoftware.htmlunit.html.HtmlPage
import java.lang.String

class WebIntegrationDoFixture extends DoFixture {
  val webClient = new WebClient()
  var currentPage : HtmlPage = null

  /*
    final WebClient webClient = new WebClient();
    final HtmlPage page = webClient.getPage("http://htmlunit.sourceforge.net");
    assertEquals("HtmlUnit - Welcome to HtmlUnit", page.getTitleText());

    final String pageAsXml = page.asXml();
    assertTrue(pageAsXml.contains("<body class=\"composite\">"));

    final String pageAsText = page.asText();
    assertTrue(pageAsText.contains("Support for the HTTP and HTTPS protocols"));

    webClient.closeAllWindows();
}
   */
  def whenINavigateToThePage(page: String) = {
    currentPage = webClient.getPage("http://localhost:8080/" + page + ".do")
    true
  }

  def thePageContainsText(text: String) : Array[String] = {
    val pageContents: String = currentPage.asText

    if(pageContents.contains(text))
      Array()
    else
      Array(pageContents)
  }

  def cleanUp = {
    webClient.closeAllWindows()
    true
  }
}