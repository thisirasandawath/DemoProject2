package helloController;

import org.springframework.web.bind.annotation.*;

import java.lang.constant.Constable;

@RestController
@RequestMapping("api/v1/hello")
@CrossOrigin
public class MainController {

@GetMapping("user")
public String Hello(){
    System.out.println("hiijkjkjkj");
    return "welcome nsbm";
}

@PostMapping("user")
    public String Welcome(){
    System.out.println("thisira");
    return "welcome Nsbm From Post";
}
}
