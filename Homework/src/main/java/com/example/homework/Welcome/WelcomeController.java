package com.example.homework.Welcome;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")

public class WelcomeController {
   @GetMapping(path = "/name")
  public String GetName(){
       return "My name is Amwaj";
   }
   @GetMapping(path = "/age")
    public String GetAge(){
       return "My Age is 28";
   }
   @GetMapping(path = "/check/status")
    public String GetCheck(){
       return "Everything Ok";
   }
   @GetMapping(path = "/health")
    public String GetHealth(){
       return "Server health is up and running";
   }


}
