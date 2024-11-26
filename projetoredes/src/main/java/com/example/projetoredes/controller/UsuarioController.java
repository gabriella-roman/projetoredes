package com.example.projetoredes.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/usuarios")
@RestController

public class UsuarioController {
    @PostMapping("/criar")
    public String criarUsuario() {
        return "Usuário criado com sucesso!";
    }
}
