package com.appco.arquiteturamvc.controller

import com.appco.arquiteturamvc.model.api.Usuario
import com.appco.arquiteturamvc.model.api.UsuarioAPI
import com.appco.arquiteturamvc.view.MainActivity

class UsuarioController(
    private val mainActivity: MainActivity
) {

    private val usuarioAPI = UsuarioAPI()

    fun recuperarUsuarios() {

        //1) Regra de negócio
        val lista = usuarioAPI.recuperarUsuarios()

        //2) Exibir os dados na interface
        mainActivity.listarUsuarios(lista)
    }
}