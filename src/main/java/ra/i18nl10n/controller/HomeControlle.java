package ra.i18nl10n.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeControlle {
    @GetMapping("/")
    public String home(){
        return "home";
    }
}
