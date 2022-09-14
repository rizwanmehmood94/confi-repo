package de.fraunhofer.iosb.ast.LocalConfiguration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RefreshScope
@RestController
public class GreetingController {
    @Value("${greeting}")
    private String greeting;

    @GetMapping("greeting")
    public String getGreeting() {
        return greeting;
    }
}
