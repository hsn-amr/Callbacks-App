package com.example.callbacksapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
    }


    override fun onStart() {
        super.onStart()
        Toast.makeText(this, "onStart Activity 3", Toast.LENGTH_LONG).show()
        Log.d("TAG", "onStart Activity 3")
    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this, "onRestart Activity 3", Toast.LENGTH_LONG).show()
        Log.d("TAG", "onRestart Activity 3")
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "onResume Activity 3", Toast.LENGTH_LONG).show()
        Log.d("TAG", "onResume Activity 3")
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this, "onPause Activity 1", Toast.LENGTH_LONG).show()
        Log.d("TAG", "onPause Activity 3")
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this, "onStop Activity 3", Toast.LENGTH_LONG).show()
        Log.d("TAG", "onStop Activity 3")
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "onDestroy Activity 3", Toast.LENGTH_LONG).show()
        Log.d("TAG", "onDestroy Activity 3")
    }
}