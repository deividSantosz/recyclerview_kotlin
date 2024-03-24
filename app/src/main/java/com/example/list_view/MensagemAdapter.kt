package com.example.list_view

import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class MensagemAdapter(
    private val lista:List<Mensagem>
) : Adapter<MensagemAdapter.MensagemViewHolder>() {

    inner class MensagemViewHolder(
        val itemView: View
    ) : ViewHolder(itemView) {
      //  val textNome: TextView = itemView.findViewById(R.id.text_nome)
      //  val mensagem: TextView = itemView.findViewById(R.id.text_mensagem)
      //  val horario: TextView = itemView.findViewById(R.id.text_hora)
            val textNome: TextView = itemView.findViewById(R.id.text_card_nome)
            val mensagem: TextView = itemView.findViewById(R.id.text_card_mensagem)
            val image_clique: ImageView = itemView.findViewById(R.id.image_card_perfil)


    }

    // Cria a visualização
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MensagemViewHolder {
       val layoutInflater = LayoutInflater.from(
           parent.context
       )
      /*  val itemView = layoutInflater.inflate(
            R.layout.item_rv_lista, parent, false
        )*/

        val itemView = layoutInflater.inflate(
            R.layout.item_cardview, parent, false)
        return MensagemViewHolder(itemView)
    }

    // vinculação dos dados ao view holder
    override fun onBindViewHolder(holder: MensagemViewHolder, position: Int) {
        val mensagem = lista[position]
        holder.textNome.text = mensagem.nome
        holder.mensagem.text = mensagem.mensagem

        //Eventos de clique
    /*    val context = holder.image_clique.context
        holder.image_clique.setOnClickListener {
            Toast.makeText(context,  "Olá, ${mensagem.nome}", Toast.LENGTH_SHORT).show()
        }*/
    }

    //Recuperar a quantidade de itens
    override fun getItemCount(): Int {
        return lista.size
    }
}