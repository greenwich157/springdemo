package com.arska;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class SpringdemoController {
  @RequestMapping("/")
  public String index() {
    return "Springboot demo landing page";
  }
  
  @RequestMapping("/hello")
  public String helloWorld() {
	  return "Hello World! With webhook!";
  }

}
