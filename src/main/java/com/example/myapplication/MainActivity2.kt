package com.example.myapplication

import android.R.layout.simple_list_item_1
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.GridView
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.grid_view_example)

        val gridView = findViewById<GridView>(R.id.ini_grid) as GridView
        var arrayList = ArrayList<Int>()
        var i = 0
        while (i < 20){
            arrayList.add(i)
            i++
        }
        val myAdapter: ArrayAdapter<Int> = ArrayAdapter(this@MainActivity2, simple_list_item_1, arrayList)

        gridView.adapter = myAdapter

        gridView.setOnItemClickListener { adapterView, view, position, id -> Toast.makeText(this@MainActivity2, "You Have Click" + arrayList.get(position), Toast.LENGTH_LONG).show() }
    }
}