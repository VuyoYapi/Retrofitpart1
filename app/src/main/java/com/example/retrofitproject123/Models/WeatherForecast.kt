package com.example.retrofitproject123.Models

data class WeatherForecast(
    val city: City,
    val cnt: Int,
    val cod: String,
    val list: List<Hours3Forecast>,
    val message: Int
)