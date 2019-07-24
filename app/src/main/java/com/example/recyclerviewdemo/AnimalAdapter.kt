package com.example.recyclerviewdemo


import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.animal_list_item.view.*

class AnimalAdapter(val items: ArrayList<String>, val context: Context) :
    RecyclerView.Adapter<AnimalAdapter.ViewHolder>() {

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        Log.v("animal adapter", "[ onCreateViewHolder ]")
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.animal_list_item, parent, false))
    }//inflates item views

    override fun onViewDetachedFromWindow(holder: ViewHolder) {
        super.onViewDetachedFromWindow(holder)
        Log.v(
            "animal adapter",
            "[ onViewDetachedFromWindow ---> ${holder.animal} at position ---> ${holder.adapterPosition}]"
        )
    }

    override fun onAttachedToRecyclerView(recyclerView: RecyclerView) {
        super.onAttachedToRecyclerView(recyclerView)
        Log.v("animal adapter", "[ onAttachedToRecyclerView ]")
    }

    override fun onDetachedFromRecyclerView(recyclerView: RecyclerView) {
        super.onDetachedFromRecyclerView(recyclerView)
        Log.v("animal adapter", "[ onDetachedFromRecyclerView}]")
    }

    override fun onViewRecycled(holder: ViewHolder) {
        super.onViewRecycled(holder)
        Log.v("animal adapter", "[ onViewRecycled ---> ${holder.animal} at position ---> ${holder.adapterPosition}]")
    }

    override fun onViewAttachedToWindow(holder: ViewHolder) {
        super.onViewAttachedToWindow(holder)
        Log.v(
            "animal adapter",
            "[ onViewAttachedToWindow ---> ${holder.animal} at position ---> ${holder.adapterPosition}]"
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindView(items[position])
        Log.v("animal adapter", "[ onBindViewHolder ] ---> ${holder.animal} at position ---> ${holder.adapterPosition}")
    }//binds data items to the views

    class ViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        var animal: String? = null

        fun bindView(animal: String) {
            this.animal = animal
            view.tv_animal_type.text = animal
        }

    }


}
