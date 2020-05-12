package jim.katunguka.KuberDocker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KuberController {

    @GetMapping("/")
    public String print(){
        return "my printer";
    }
}
