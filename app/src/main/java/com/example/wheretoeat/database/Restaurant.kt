package com.example.wheretoeat.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "restaurant_table")
data class Restaurant(
    val address: String,
    val area: String,
    val city: String,
    val country: String,
    @PrimaryKey(autoGenerate = false)
    val id: Long,
    val image_url: String,
    val lat: Double,
    val lng: Double,
    val mobile_reserve_url: String,
    val name: String,
    val phone: String,
    val postal_code: String,
    val price: Int,
    val reserve_url: String,
    val state: String,
    var isfavorited :Boolean =false
)