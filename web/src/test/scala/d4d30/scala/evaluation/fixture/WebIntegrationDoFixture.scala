package d4d30.scala.evaluation.fixture

import fitlibrary.DoFixture

class WebIntegrationDoFixture extends DoFixture {

  def whenINavigateToThePage(page: String) = {
    true
  }

  def thePageContainsText(text: String) = {
    true
  }

}