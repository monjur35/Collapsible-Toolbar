package com.example.collapsibletoolbar

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var toolbar=findViewById<Toolbar>(R.id.toolbar)
        var rv=findViewById<RecyclerView>(R.id.rv)
        toolbar.title="MEEEE"
        toolbar.setTitleTextColor(Color.parseColor("#FFFFFF"))
        setSupportActionBar(toolbar)

        var list= mutableListOf<Int>(11)
       for (i in 0..10){
           list.add(i,i)
       }

        rv.apply {
            var arrr=RvAdapter(list)
            adapter=arrr
            arrr.notifyDataSetChanged()
        }

    }
}