package com.example.spinerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.spinerapp.databinding.ActivityMainBinding
import com.example.spinerapp.utils.Adapters.MySpinnerAdapter
import com.example.spinerapp.utils.MyData

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        binding.spinner1.adapter = MySpinnerAdapter(MyData.list)


        binding.btnClick.setOnClickListener {
            val b = binding.spinner1.selectedItem
            Toast.makeText(this, "$b", Toast.LENGTH_SHORT).show()
        }
    }
}