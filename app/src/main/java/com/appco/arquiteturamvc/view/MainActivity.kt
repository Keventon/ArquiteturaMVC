package com.appco.arquiteturamvc.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.appco.arquiteturamvc.R
import com.appco.arquiteturamvc.controller.UsuarioController
import com.appco.arquiteturamvc.databinding.ActivityMainBinding
import com.appco.arquiteturamvc.model.api.Usuario

class MainActivity : AppCompatActivity() {

    private lateinit var usuarioController: UsuarioController
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        usuarioController = UsuarioController(this)

        with(binding) {
            button.setOnClickListener {
                usuarioController.recuperarUsuarios()
            }
        }
    }

    fun listarUsuarios(lista: List<Usuario>) {
        //Exibir os dados
        var textoUsuarios = ""

        lista.forEach { usuario ->
            textoUsuarios += "${usuario.nome} - ${usuario.idade} \n"
        }

        binding.textView.text = textoUsuarios
    }
}