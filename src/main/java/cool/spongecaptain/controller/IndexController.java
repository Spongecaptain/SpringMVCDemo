package cool.spongecaptain.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @RequestMapping("/index")
    public String index(){
        System.out.println("执⾏了index...");
        return "index";
    }
}
