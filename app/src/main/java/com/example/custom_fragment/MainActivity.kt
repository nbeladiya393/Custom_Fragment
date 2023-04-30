package com.example.custom_fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.custom_fragment.Fragment.calls_Fragment
import com.example.custom_fragment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding.btnButton.setOnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.FragFrame,calls_Fragment()).commit()
        }
    }
}