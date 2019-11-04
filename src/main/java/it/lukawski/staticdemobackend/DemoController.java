package it.lukawski.staticdemobackend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("demo")
    public DemoResponse getDemo() {
        return new DemoResponse("Hello world !");
    }
}

