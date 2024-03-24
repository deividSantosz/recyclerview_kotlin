package com.example.list_view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager

class Recycler_view : AppCompatActivity() {

    private lateinit var rv_list: RecyclerView;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view2)

        val lista = listOf(
            Mensagem("Jamilton", "Olá, tudo bem?", "10:45"),
            Mensagem("Ana", "Te vi ontem...", "11:45"),
            Mensagem("Maria", "Não acredito!", "09:15"),
            Mensagem("Pedro", "Futebol hoje de tarde!", "5:22"),
        )

        rv_list = findViewById(R.id.rv_lista);
        rv_list.adapter = MensagemAdapter(lista);
        rv_list.layoutManager = LinearLayoutManager(this)

      /*  rv_list.addItemDecoration(
            DividerItemDecoration (this,
                RecyclerView.VERTICAL)
        )*/
    }
}