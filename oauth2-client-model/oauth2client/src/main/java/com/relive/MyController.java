package com.relive;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class MyController {


    @GetMapping("/team")
    public String doIt() {
        return "asdf";
    }
}
