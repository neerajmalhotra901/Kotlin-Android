package com.example.kotlinandro

import android.annotation.SuppressLint
import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ListView
import android.widget.TextView

class ListViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

        var listview = findViewById<ListView>(R.id.mylistview)

        listview.adapter = MyCustomAdapter(this)
    }
private class MyCustomAdapter(context:Context): BaseAdapter(){

    private val mContext: Context

    init {
        mContext = context

    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }


    override fun getItem(p0: Int): Any {
        return "Test Strong"
    }
    override fun getCount(): Int {
        return 5
    }





    @SuppressLint("ResourceType")
    override fun getView(position: Int, convertView: View?, viewGroup: ViewGroup?): View {


//        val layoutInflator = LayoutInflater.from(mContext)
//
//        val rowMain = layoutInflator.inflate(R.id.row_listview,viewGroup,false)
//
//        return rowMain
//


//        val layoutInflator = LayoutInflater.from(mContext)
//
//      val rowMain =  layoutInflator.inflate(R.id.row_listview, ViewGroup,false)


        var textview = TextView(mContext)
        textview.text = "Hi, Hello"

        return textview

       // return rowMain


    }

}

}
