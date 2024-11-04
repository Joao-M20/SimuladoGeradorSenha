package com.imc.simulado

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonSenha: Button = findViewById(R.id.buttonSenha)
        val textoSenha: TextView = findViewById(R.id.textViewSenha)

        val letrasMinusculas = "abcdefghijklmnopqrstuvwxyz"
        val numeros = "0123456789"
        val simbolos = "!@#$%&"
        val senhaGerada = StringBuilder()

        buttonSenha.setOnClickListener{

            senhaGerada.clear()
            for(i in 1..3){
                val letra = letrasMinusculas.random()
                val numero = numeros.random()
                val simbolo = simbolos.random()

                senhaGerada.append(letra)
                senhaGerada.append(numero)
                senhaGerada.append(simbolo)
            }
            textoSenha.text = senhaGerada

        }


    }
}