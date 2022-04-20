package com.dio.springboot;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Contato {

    private Long id;
    private String name;
    private String telefone;
}
