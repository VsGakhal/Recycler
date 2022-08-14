package com.example.recycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recycler.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var adapter: RecyclerClass
    lateinit var linearLayoutManager: LinearLayoutManager
    lateinit var gridLayoutManager: GridLayoutManager
    var array : ArrayList<RecycleDataClass> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        array.add(RecycleDataClass(1,22))
        array.add(RecycleDataClass(2,25))
        array.add(RecycleDataClass(3,29))


        adapter = RecyclerClass(array)
        gridLayoutManager = GridLayoutManager(this,3)
        linearLayoutManager = LinearLayoutManager(this)
        binding.Recycler.layoutManager = gridLayoutManager

        binding.Recycler.adapter = adapter


    }
}