package com.example.retrofitproject123

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

val apiKey = "6139fdfb87584775a3cb8fc0c4f19e63"
val lon = 28.1879101
val  lat = -25.7459277
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        CoroutineScope(Dispatchers.IO).launch {
            val response = api.retrofit.getWeekData(lat.toString(),lon.toString(), apiKey)
            if (response.isSuccessful){
                findViewById<TextView>(R.id.text).setText(response.body().toString())

            }
            else
            {
                Log.v("openapi",response.message())
            }


        }

    }
}