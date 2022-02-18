package com.demo.livedata

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    private lateinit var mainViewModel: MainViewModel
    private val factsTextView : TextView
    get() = findViewById(R.id.factsTextView)

    private val btnUpdate : Button
    get() = findViewById(R.id.btnUpdate)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainViewModel = ViewModelProvider(this)[MainViewModel::class.java]

        mainViewModel.factsLiveData.observe(this) {
            // code
            factsTextView.text = it

        }
        btnUpdate.setOnClickListener {
            mainViewModel.updateLiveData()
        }
    }
}