package com.example.sns

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.example.sns.databinding.ActivityLoginBinding
import com.example.sns.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityLoginBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}