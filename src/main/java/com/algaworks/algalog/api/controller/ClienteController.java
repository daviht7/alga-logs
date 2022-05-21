package com.algaworks.algalog.api.controller;

import com.algaworks.algalog.domain.model.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ClienteController {

    @GetMapping("/clientes")
    public List<Cliente> listar() {
        var cliente1 = new Cliente();

        cliente1.setId(1L);
        cliente1.setNome("João 123");
        cliente1.setEmail("joao@gmail.com");
        cliente1.setTelefone("85994185335");

        return Arrays.asList(cliente1);
    }

}
