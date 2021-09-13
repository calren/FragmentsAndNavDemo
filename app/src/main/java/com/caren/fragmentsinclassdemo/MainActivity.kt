package com.caren.fragmentsinclassdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Using NavGraph
        // First show TopFragment
           // Inside TopFragment, add a button that takes us to BottomFragment
    }
}