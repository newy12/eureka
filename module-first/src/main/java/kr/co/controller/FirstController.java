package kr.co.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@RestController
@RequestMapping(value = "/first-service")
@RequiredArgsConstructor
public class FirstController {

    private final DiscoveryClient discoveryClient;
    private final SecondServiceClient secondServiceClient;

    @GetMapping("/food")
    public String getFood(){
/*       WebClient webClient = WebClient.builder().build();
        List<ServiceInstance> instances = discoveryClient.getInstances("my-second-service");
        if(instances.isEmpty()){
            throw new RuntimeException("Second service is not available");
        }
        String baseUrl = instances.get(0).getUri().toString();
        String url = baseUrl + "/second-service/water";
        return webClient.get().uri(url).retrieve().bodyToMono(String.class).block();*/

        return secondServiceClient.getWater();
    }
}


