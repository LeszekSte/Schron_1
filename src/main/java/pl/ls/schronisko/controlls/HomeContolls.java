package pl.ls.schronisko.controlls;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeContolls {

    @GetMapping("/")
    String start(Model model) {

        return "start";
    }
}
