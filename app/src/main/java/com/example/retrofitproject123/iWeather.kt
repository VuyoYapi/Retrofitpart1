package com.example.retrofitproject123

import com.example.retrofitproject123.Models.WeatherForecast
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query


/*const val apiKey = "6139fdfb87584775a3cb8fc0c4f19e63"
const val lon = 28.1879101
const val  lat = -25.7459277*/

interface iWeather {

@GET("/data/2.5/forecast?")
    suspend fun getWeekData(@Query("lat") lat:String,@Query("lon") lon:String,@Query("appid") appid:String ):Response<WeatherForecast>
}