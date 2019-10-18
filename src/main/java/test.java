import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class test {

    @RequestMapping("/")
    String test(){
        return "test";
    }

    public static void main(String[] args) {
        SpringApplication.run(test.class, args);
    }

}