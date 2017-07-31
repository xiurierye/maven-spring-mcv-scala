package x.h.p.m

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.{RequestMapping, ResponseBody}

/**
  * Created by xrry on 28/07/2017.
  */
@Controller
@RequestMapping(value = Array("/"))
class HelloWorldController {


  @RequestMapping(value = Array("/helloWorld"))
  @ResponseBody
  def home= "Hello World"


  case class  Person(age:Int,any: Any)
  class anotherPerson(age:Int, name:String){
    def getAge()=age
  }

  @RequestMapping(value = Array("/map"))
  @ResponseBody
  def map= Map("key"->"value")

  @RequestMapping(value = Array("/person"))
  @ResponseBody
  def thePerson= new Person(12,Map("key"->"value","ddd"->List("de")))

  @RequestMapping(value = Array("/get406"))
  @ResponseBody
  def get406= new  anotherPerson(12,"xrry")
}
