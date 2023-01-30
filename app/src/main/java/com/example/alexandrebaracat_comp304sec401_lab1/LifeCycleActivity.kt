package com.example.alexandrebaracat_comp304sec401_lab1

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class LifeCycleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_life_cycle)
    }

    override fun onStart() {
        Log.i(TAG,"onStart() is called...")
        super.onStart()
    }

    override fun onResume() {
        Log.i(TAG,"onResume() is called...")
        super.onResume()
    }

    override fun onPause() {
        Log.i(TAG,"onPause() is called...")
        super.onPause()
    }

    override fun onStop() {
        Log.i(TAG,"onStop() is called...")
        super.onStop()
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(TAG,"onRestart() is called...")
        super.onStop()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG,"onDestroy() is called...")
        super.onStop()
    }
}