package kr.co.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/second-service")
public class SecondController {

    @GetMapping("/water")
    public String getFood(){
        return "2번서버";
    }
}
