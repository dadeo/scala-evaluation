package d4d30.scala.evaluation

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class HelloController {

  @RequestMapping(Array("/hello.do"))
  def greet = "index"
  
}

