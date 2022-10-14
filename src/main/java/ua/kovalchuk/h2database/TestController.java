package ua.kovalchuk.h2database;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("ping")
    public String test(){
        return "pong";
    }
}
