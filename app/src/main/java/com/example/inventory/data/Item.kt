package com.example.inventory.data

//Represent database entity of the app
class Item(
    val id: Int = 0,
    val itemName: String,
    val itemPrice: Double,
    val quantityInStock: Int
)