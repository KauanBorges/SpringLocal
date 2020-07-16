package xD1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThreeController {
    
    @GetMapping("/Three")
    public String Three(){
        return "Three";
    }
}