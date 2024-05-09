package kr.co.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "my-second-service")
public interface SecondServiceClient {

    @GetMapping("/second-service/water")
    String getWater();
}
