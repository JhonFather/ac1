package com.example.joaoac1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
        fun calculaIdade(componente: View) {
            val nome = campo2.text.toString()
            val pai = campo3.text.toString().toInt()
            val mae = campo4.text.toString().toInt()
            if(nome == "" || nome.length <=3 || pai <= 0 || mae <= 0){
                Toast.makeText(this, "Os campos não podem ser nulos ou zerados", Toast.LENGTH_SHORT).show()
            }else {
                val idadeMorte = (pai + mae)-30

                if(idadeMorte > 60){
                    campo6.setTextColor(Color.GREEN)
                    campo6.text = "${nome} você vai morrer com ${idadeMorte} anos. Vai morrer velho"
                }else if(idadeMorte > 20){
                    campo6.setTextColor(Color.YELLOW)
                    campo6.text = "${nome} você vai morrer com ${idadeMorte} anos. Vai morrer jovem"
                }else {
                    campo6.setTextColor(Color.RED)
                    campo6.text = "${nome} você vai morrer com ${idadeMorte} anos. Vai morrer MUITO jovem"
                }

            }
        }
}