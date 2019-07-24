package com.example.recyclerviewdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    val animals: ArrayList<String> = ArrayList() //an empty arrayList

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addAnimals()//loads animals in to the arrayList
        rv_animal_list.layoutManager = LinearLayoutManager(this)
        //rv_animal_list.layoutManager=GridLayoutManager(this,2)---try this out .
        rv_animal_list.adapter = AnimalAdapter(animals, this)
    }

    fun addAnimals() {
        animals.add("Lion")
        animals.add("Tiger")
        animals.add("Bat")
        animals.add("Snake")
        animals.add("Owl")
        animals.add("Elephant")
        animals.add("Shark")
        animals.add("T-Rex")
        animals.add("Lion2")
        animals.add("Tiger2")
        animals.add("Bat2")
        animals.add("Snake2")
        animals.add("Owl2")
        animals.add("Elephant2")
        animals.add("Shark2")
        animals.add("T-Rex2")
        animals.add("Lion3")
        animals.add("Tiger3")
        animals.add("Bat3")
        animals.add("Snake3")
        animals.add("Owl3")
        animals.add("Elephant3")
        animals.add("Shark3")
        animals.add("T-Rex3")
        animals.add("Lion4")
        animals.add("Tiger4")
        animals.add("Bat4")
        animals.add("Snake4")
        animals.add("Owl4")
        animals.add("Elephant4")
        animals.add("Shark4")
        animals.add("T-Rex4")
        animals.add("Lion4")
        animals.add("Tiger4")
        animals.add("Bat4")
        animals.add("Snake4")
        animals.add("Owl4")
        animals.add("Elephant4")
        animals.add("Shark4")
        animals.add("T-Rex4")
        animals.add("Lion5")
        animals.add("Tiger5")
        animals.add("Bat5")
        animals.add("Snake5")
        animals.add("Owl5")
        animals.add("Elephant5")
        animals.add("Shark5")
        animals.add("T-Rex5")
        animals.add("Lion6")
        animals.add("Tiger6")
        animals.add("Bat6")
        animals.add("Snake6")
        animals.add("Owl6")
        animals.add("Elephant6")
        animals.add("Shark6")
        animals.add("T-Rex6")
        animals.add("Lion7")
        animals.add("Tiger7")
        animals.add("Bat7")
        animals.add("Snake7")
        animals.add("Owl7")
        animals.add("Elephant7")
        animals.add("Shark7")
        animals.add("T-Rex7")
        animals.add("Lion8")
        animals.add("Tiger8")
        animals.add("Bat8")
        animals.add("Snake8")
        animals.add("Owl8")
        animals.add("Elephant8")
        animals.add("Shark8")
        animals.add("T-Rex8")
    }

}