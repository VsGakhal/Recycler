package com.example.recycler

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class RecyclerClass : RecyclerView.Adapter<RecyclerClass.ViewHolder> () {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerClass.ViewHolder {
        var initView = LayoutInflater.from(parent.context).inflate(
            R.layout.layout, parent, false
        )
        return ViewHolder(initView)


    }

    override fun onBindViewHolder(holder: RecyclerClass.ViewHolder, position: Int) {

    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    }

    override fun getItemCount(): Int {
    return 5
    }
}
