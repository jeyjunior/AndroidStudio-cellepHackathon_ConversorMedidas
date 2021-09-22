package com.josejunior.conversordemedidas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.josejunior.conversordemedidas.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnConverter.setOnClickListener {

            var km = (binding.edtTxtQuilometros.text.toString().trim()).toInt()

            var m = km * 1000
            var cm = km * 100000
            var mm = km * 1000000

            binding.txvMetros.text = "Metro: $m"
            binding.txvCentimetros.text = "Centímetro: $cm"
            binding.txvMilimetros.text = "Milímetro: $mm"
        }

    }
}