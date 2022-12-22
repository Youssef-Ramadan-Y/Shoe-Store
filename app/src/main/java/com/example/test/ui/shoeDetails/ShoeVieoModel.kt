package com.example.test.ui.shoeDetails

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.shoestore.model.Shoe


class ShoeViewModel : ViewModel() {

    var shoe = Shoe("", 0.0F, "", "")

    private val shoesList = mutableListOf<Shoe?>()

    private val _shoeList = MutableLiveData<List<Shoe?>>()

    val shoeList: LiveData<List<Shoe?>>
        get() = _shoeList

    fun addNewShoe() {
        shoesList.add(shoe)

        // reset the shoe field in the details screen
        shoe = Shoe("", 0.0F, "", "")
        _shoeList.value = shoesList
    }

}
