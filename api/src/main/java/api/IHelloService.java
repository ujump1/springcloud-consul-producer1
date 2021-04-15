package api;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "spring-cloud-producer",path = "hello")
public interface IHelloService {

	@GetMapping("/sayHello")
	String sayHello(@RequestParam(value = "name") String name);

}
