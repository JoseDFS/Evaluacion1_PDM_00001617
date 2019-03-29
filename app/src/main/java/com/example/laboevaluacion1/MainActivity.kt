package com.example.laboevaluacion1

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

import android.widget.TextView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val producto1 = findViewById<TextView>(R.id.tv_1)
        val producto2 = findViewById<TextView>(R.id.tv_2)
        val producto3 = findViewById<TextView>(R.id.tv_3)
        val producto4 = findViewById<TextView>(R.id.tv_4)
        val producto5 = findViewById<TextView>(R.id.tv_5)
        val producto6 = findViewById<TextView>(R.id.tv_6)
        val producto7 = findViewById<TextView>(R.id.tv_7)
        val producto8 = findViewById<TextView>(R.id.tv_8)
        val producto9 = findViewById<TextView>(R.id.tv_9)

        val user = findViewById<EditText>(R.id.et_user)
        val email = findViewById<EditText>(R.id.et_email)

        val share = findViewById<Button>(R.id.btn_submit)

        val clickListener = View.OnClickListener { view ->

            when (view.getId()) {
                R.id.tv_1 -> producto1.setText((producto1.text.toString().toInt() + 1).toString())
                R.id.tv_2 -> producto2.setText((producto2.text.toString().toInt() + 1).toString())
                R.id.tv_3 -> producto3.setText((producto3.text.toString().toInt() + 1).toString())
                R.id.tv_4 -> producto4.setText((producto4.text.toString().toInt() + 1).toString())
                R.id.tv_5 -> producto5.setText((producto5.text.toString().toInt() + 1).toString())
                R.id.tv_6 -> producto6.setText((producto6.text.toString().toInt() + 1).toString())
                R.id.tv_7 -> producto7.setText((producto7.text.toString().toInt() + 1).toString())
                R.id.tv_8 -> producto8.setText((producto8.text.toString().toInt() + 1).toString())
                R.id.tv_9 -> producto9.setText((producto9.text.toString().toInt() + 1).toString())

                R.id.btn_submit -> {
                    val intentinfo = Intent(this,Main2Activity.class)
                }

            }
        }
        producto1.setOnClickListener(clickListener)
        producto2.setOnClickListener(clickListener)
        producto3.setOnClickListener(clickListener)
        producto4.setOnClickListener(clickListener)
        producto5.setOnClickListener(clickListener)
        producto6.setOnClickListener(clickListener)
        producto7.setOnClickListener(clickListener)
        producto8.setOnClickListener(clickListener)
        producto9.setOnClickListener(clickListener)

        share.setOnClickListener(clickListener)



    }



}




