package com.example.mad_practical_6_22172012017

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var  button:Button=findViewById(R.id.button2)
        var  button1:Button=findViewById(R.id.button4)

    }

    fun playpause() {
        Intent(applicationContext, MyService::class.java).putExtra(MyService.PLAYERKEY,MyService.PLAYERVALUE).apply { {} }
        stopService(this)
    }
}
fun playpause() {
    Intent(applicationContext, MyService::class.java).putExtra(MyService.PLAYERKEY,MyService.PLAYERVALUE).apply { {} }
    stopService(this)
}
}
}