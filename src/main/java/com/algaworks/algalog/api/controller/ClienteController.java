package com.algaworks.algalog.api.controller;

import com.algaworks.algalog.domain.model.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Arrays;
import java.util.List;

@RestController
public class ClienteController {

    @PersistenceContext
    private EntityManager entitymanager;

    @GetMapping("/clientes")
    public List<Cliente> listar() {

        return entitymanager.createQuery("from Cliente",Cliente.class).getResultList();

    }

}
