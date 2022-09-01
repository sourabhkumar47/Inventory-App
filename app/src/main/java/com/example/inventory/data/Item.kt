package com.example.inventory.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.text.NumberFormat

//Represent database entity of the app

/**
 * Entity data class represents a single row in the database.
 */
@Entity
data class Item(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    @ColumnInfo(name = "name")
    val itemName: String,
    @ColumnInfo(name = "price")
    val itemPrice: Double,
    @ColumnInfo(name = "quantity")
    val quantityInStock: Int
)

//Format the item price to currency price format
fun Item.getFormattedPrice(): String =
    NumberFormat.getCurrencyInstance().format(itemPrice)