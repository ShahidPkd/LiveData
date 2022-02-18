package com.demo.livedata

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    var count = 1

    private val factsLiveDataObjects = MutableLiveData<String>("This is a fact 1")

    val factsLiveData : LiveData<String>
    get() = factsLiveDataObjects

    fun updateLiveData(){
        ++count
        factsLiveDataObjects.value = "another fact "+ count
    }

}