package x.h.p.m

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.{RequestMapping, ResponseBody}

/**
  * Created by zhaoji on 28/07/2017.
  */
@Controller
@RequestMapping(value = Array("/"))
class HelloWorldController {
  @RequestMapping(value = Array("/helloWorld"))
  @ResponseBody
  def home= "Hello World"
}
