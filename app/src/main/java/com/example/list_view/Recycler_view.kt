package com.example.list_view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager

class Recycler_view : AppCompatActivity() {

    private lateinit var rv_list: RecyclerView;
    private lateinit var mensagemAdapter: MensagemAdapter
    private lateinit var btnClique : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view2)

        val lista = mutableListOf(
            Mensagem("Jamilton", "Olá, tudo bem?", "10:45"),
            Mensagem("Ana", "Te vi ontem...", "11:45"),
            Mensagem("Maria", "Não acredito!", "09:15"),
            Mensagem("Pedro", "Futebol hoje de tarde!", "5:22"),
        )

        rv_list = findViewById(R.id.rv_lista)
        btnClique = findViewById(R.id.btn_executar)


        mensagemAdapter = MensagemAdapter()
        mensagemAdapter.atualizarListaDados(lista)
        rv_list.adapter = mensagemAdapter;
        rv_list.layoutManager = LinearLayoutManager(this)

        btnClique.setOnClickListener {
            lista.add(
                Mensagem("Nova Deivid", "teste", "17:12")
            )
            mensagemAdapter.atualizarListaDados(lista)
        }
      /*  rv_list.addItemDecoration(
            DividerItemDecoration (this,
                RecyclerView.VERTICAL)
        )*/
    }
}