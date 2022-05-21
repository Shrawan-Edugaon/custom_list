package com.example.custom_list

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<RecyclerView>(R.id.listView)
        val custom_list_data = ArrayList<CList>()

//        custom_list_data.add(CList(R.drawable"Date", "This is custom date"))
//        custom_list_data.add(CList("Calculator", "This is custom calculator"))
//        custom_list_data.add(CList("Animation", "This is custom animation"))
//        custom_list_data.add(CList("Implicit Intent", "This is custom Implicit Intent"))
//        custom_list_data.add(CList("Explicit Intent", "This is custom Explict Intent"))
//        custom_list_data.add(CList("Time", "This is custom Time"))
//        custom_list_data.add(CList("Widgets", "This is custom widgets"))
        custom_list_data.add(CList(R.drawable.data,"Date","This custom Date"))
        custom_list_data.add(CList(R.drawable.calc,"Date","This custom Date"))
        custom_list_data.add(CList(R.drawable.data,"Date","This custom Date"))
        custom_list_data.add(CList(R.drawable.calc,"Date","This custom Date"))
        custom_list_data.add(CList(R.drawable.data,"Date","This custom Date"))
        custom_list_data.add(CList(R.drawable.calc,"Date","This custom Date"))
        custom_list_data.add(CList(R.drawable.data,"Date","This custom Date"))
        custom_list_data.add(CList(R.drawable.calc,"Date","This custom Date"))




        val gridLayoutManager = GridLayoutManager(applicationContext, 1)
        listView.layoutManager = gridLayoutManager
        listView.adapter = CListAdapter(custom_list_data)
//        listView.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
//            Toast.makeText(this@MainActivity,"Item Clicked:-$id",Toast.LENGTH_SHORT).show()
//        }
//    Toast.makeText(this@MainActivity,"Item Clicked",Toast.LENGTH_SHORT).show()
   }
//
//    override fun dayClick(CList: CList) {
//
//    }
}