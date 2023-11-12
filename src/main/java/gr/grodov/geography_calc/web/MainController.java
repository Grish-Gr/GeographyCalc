package gr.grodov.geography_calc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("")
public class MainController {

    @GetMapping(value = {"/", "/home"})
    public String main(ModelAndView model) {
        return "main.th";
    }
}
