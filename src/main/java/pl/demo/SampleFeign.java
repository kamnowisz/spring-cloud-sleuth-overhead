package pl.demo;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "sampleFeign", url = "localhost:8081")
public interface SampleFeign {

    @RequestMapping(value = "hi", method = RequestMethod.GET)
    String hi();

}
