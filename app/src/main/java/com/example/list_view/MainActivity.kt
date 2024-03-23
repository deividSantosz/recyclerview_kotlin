package com.example.list_view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    private lateinit var listUsuarios: ListView;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listaUsuarios = listOf(
            "Jamilton", "Ana", "Maria", "pedro"
        )

        listUsuarios = findViewById(R.id.list_view);
        listUsuarios.adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            android.R.id.text1,
            listaUsuarios
        )
    }
}