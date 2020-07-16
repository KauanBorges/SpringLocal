package xD1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TwoController {
    
    @GetMapping("/Two") 
    public String Two(){
        return"Two";
    }
}