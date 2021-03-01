package com.wez.ctrl;

import com.wez.config.DBProperties;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private DBProperties dbProperties;

    @GetMapping(value="/hello")
    public String home() {
        return "Hello World!";
    }

    @GetMapping(value="/get_db_config")
    public DBProperties getDbConfig() {
        return dbProperties;
    }

}
