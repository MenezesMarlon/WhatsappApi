package com.menezesmarlon.whatsappapi

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.menezesmarlon.whatsappapi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonConfirm.setOnClickListener {
            val editNumber = binding.editNumber.text.toString()
            val editMessage = binding.editMessage.text.toString()
            val url = "https://api.whatsapp.com/send?phone=" + editNumber + "&text=" + editMessage
            val queryUrl: Uri = Uri.parse(url)
            val intent = Intent(Intent.ACTION_VIEW, queryUrl)
            startActivity(intent)

        }

    }
}