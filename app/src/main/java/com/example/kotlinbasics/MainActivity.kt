package com.example.kotlinbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    val constante: String = "Esta es una constante"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val a: Int = 1
        var b: Int = 2
        b = 3
        Log.i("Basics", "Valor de b = $b")
        Toast.makeText(this, "Valor de b + $b", Toast.LENGTH_LONG).show()
        Log.i("Basics", constante)
        Log.d("Basics", "d")
        Log.w("Basics", "w")
        Log.e("Basics", "e")
        imprimir()
        Log.i("Basics", ejemploBooleano(a).toString())
        ejecutar()
        forFuncion()
        whileFuncion()
    }
    fun imprimir(){
        Log.i("Basics", "Impreso desde la funcion de imprimir: $constante")
    }
    fun ejemploBooleano(a: Int): Boolean{
        var array = arrayOf(1,2,3,4,5)
        if (a in array){
            return true
        }
        else{
            return false
        }
    }
    fun ejecutar(){
        val x = 1
        when(x) {
            1 -> Log.i("Basics", "Es uno")
            2 -> {Log.i("Basics", "No es uno")}
            else -> Log.i("Basics", "No es ningun numero")
        }
    }
    fun forFuncion(){
        var array = arrayOf(1,2,3,4,5)
        for (numero in array){
            Log.i("Basics", numero.toString())
        }
        Log.i("Basics", "De uno a tres")
        for (i in 1..3){
            Log.i("Basics", i.toString())
        }

        Log.i("Basics", "de seis a 0 llendo de dos en dos")
        for (i in 6 downTo 0 step 2){
            Log.i("Basics", i.toString())
        }
    }
    fun whileFuncion(){
        Log.i("Basics", "While:")
        var x = 0;
        while(x < 5){
            Log.i("Basics", x.toString())
            x++
        }
        Log.i("Basics", "DoWhile:")
        x = 0
        do {
            Log.i("Basics", x.toString())
        }while (x < 6)
    }
}