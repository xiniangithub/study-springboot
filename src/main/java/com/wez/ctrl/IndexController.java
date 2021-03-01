package com.wez.ctrl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Think
 * @Time 2021/3/1 21:19
 */
@RestController
@RequestMapping(value="/index")
public class IndexController {

    @GetMapping(value="/hello")
    public String home() {
        return "Hello World!";
    }

}
