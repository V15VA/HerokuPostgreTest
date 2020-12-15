package PatientDatabase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.*;


@Controller
@SpringBootApplication
public class DatabaseApplication {
    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Premature Baby Health Monitoring Database - Homepage";
    }

    @RequestMapping("/test")
    @ResponseBody
    String test() {
        return "This is a response from the server to your test invocation";
    }

    public static void main(String[] args) {
        SpringApplication.run(DatabaseApplication.class, args);
    }
}
