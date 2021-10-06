package com.example.callbacksapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val btn = findViewById<Button>(R.id.btn2)
        btn.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }
    }


    override fun onStart() {
        super.onStart()
        Toast.makeText(this, "onStart Activity 2", Toast.LENGTH_LONG).show()
        Log.d("TAG", "onStart Activity 2")
    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this, "onRestart Activity 2", Toast.LENGTH_LONG).show()
        Log.d("TAG", "onRestart Activity 2")
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "onResume Activity 2", Toast.LENGTH_LONG).show()
        Log.d("TAG", "onResume Activity 2")
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this, "onPause Activity 2", Toast.LENGTH_LONG).show()
        Log.d("TAG", "onPause Activity 2")
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this, "onStop Activity 2", Toast.LENGTH_LONG).show()
        Log.d("TAG", "onStop Activity 2")
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "onDestroy Activity 2", Toast.LENGTH_LONG).show()
        Log.d("TAG", "onDestroy Activity 2")
    }
}