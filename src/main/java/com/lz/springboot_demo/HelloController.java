package com.lz.springboot_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//该类被标记为@RestController，这意味着它已准备好供 Spring MVC 用于处理 Web 请求。


@RestController
public class HelloController {

    //@GetMapping映射/到index()方法。当从浏览器调用或在命令行上使用 curl 时，该方法返回纯文本。
    // 这是因为@RestController结合了@Controller和@ResponseBody，这两个注释会导致 Web 请求返回数据而不是视图。
    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    //访问地址：http://localhost:8080/hello?name=Amy
    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }
}
