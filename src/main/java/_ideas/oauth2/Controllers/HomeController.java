package _ideas.oauth2.Controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "This is home page";
    }

    @GetMapping("/secured")
    public String secured() {
        return "This is page secured";
    }
}
