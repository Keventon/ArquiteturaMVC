package com.appco.arquiteturamvc.model.api

class UsuarioAPI {

    fun recuperarUsuarios() : List<Usuario> {
        return  listOf(
            Usuario("Keverton", 22),
            Usuario("José", 30),
            Usuario("Susana", 43),
            Usuario("Ruan", 15),
            Usuario("Catarina", 67)
        )
    }
}