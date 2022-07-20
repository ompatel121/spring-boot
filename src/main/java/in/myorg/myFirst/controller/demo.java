package in.myorg.myFirst.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Date;
@RestController

public class demo {
    @GetMapping("/")
    public String welcomemessage(){
        return " welcome to spring boot";
    }
    @GetMapping("/getdate")
        public Date getdate(){
            return new Date();
    }
}
