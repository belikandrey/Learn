package by.itoverone;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @GetMapping("hello-world")
    public String sayHello(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model) {
        System.out.println("Name : "+name);
        model.addAttribute("name", name);
        return "hello_world";
    }


    @GetMapping("/hello-world111")
    public String sayHello111(@RequestParam(name = "name", required = false,
            defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        return "hello_world111";
    }
}
