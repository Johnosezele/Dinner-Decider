package com.johnosezele.foodie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_dashboard.*
import java.util.*

class Dashboard : AppCompatActivity() {

    private val foodList = arrayListOf("Chinese", "Hamburger", "Pizza", "Rice'n Chicken")
    private val foodImage = arrayOf(R.drawable.chinese, R.drawable.hamburger, R.drawable.pizza, R.drawable.rice_n_chicken)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        select.setOnClickListener {
            val random = Random()
            val randomFoodImg = random.nextInt(foodImage.count())
            val randomFoodList = random.nextInt(foodList.count())
            food.text = foodList[randomFoodList]
            img.setImageResource(foodImage[randomFoodImg])
        }
    }
}