package springboots.service;


import api.IHelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController implements IHelloService {


    @Override
    public String sayHello(String name) {
        return "hello:"+name+"I am port 9002" ;
    }
}