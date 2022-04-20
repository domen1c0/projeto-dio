package com.dio.springboot;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name="agenda", url="http://localhost:8080/contato")
public interface ConsumindoApi {

    @GetMapping(value = "/")
    Contato retornaContato();
}
