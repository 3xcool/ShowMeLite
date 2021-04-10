package com.andrefilgs.showmeliteapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

//https://blog.octo.com/en/android-library-development-best-practices-guide/
class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
  }
}