package com.example.wheretoeat.repository

import com.example.wheretoeat.api.RetrofitInstance
import com.example.wheretoeat.model.Countries
import com.example.wheretoeat.model.Restaurats
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Query

class Repository {
   suspend fun getRestaurantsByCountry(country :String):Response<Restaurats>{
       return  RetrofitInstance.api.getRestaurantsByCountry(country)
   }
    suspend fun  getCoutries():Response<Countries>{
        return RetrofitInstance.api.getCoutries()
    }
}