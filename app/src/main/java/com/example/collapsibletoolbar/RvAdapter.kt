package com.example.collapsibletoolbar

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RvAdapter(var list:List<Int>): RecyclerView.Adapter<RvAdapter.RvViewholder>() {


    inner class RvViewholder(item: View): RecyclerView.ViewHolder(item) {
        var ttt=item.findViewById<TextView>(R.id.tttt)

        fun bind(i: Int) {
            ttt.text=i.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RvViewholder {
       val vvvv= LayoutInflater.from(parent.context).inflate(R.layout.row,parent,false);
        return RvViewholder(vvvv)
    }

    override fun onBindViewHolder(holder: RvViewholder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int {
       return list.size
    }
}

