package springboots.service;


import api.IHelloService;
import api.ITestConfigService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config")
public class TestConfigController implements ITestConfigService {

    @Value("${enviroment.now}")
    private String enviroment;

    @Override
    public String getConfig() {
        return "enviroment:" +  enviroment;
    }
}