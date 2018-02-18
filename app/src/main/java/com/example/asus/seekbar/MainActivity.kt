package com.example.asus.seekbar

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        seekBar.max = 200//Maximum değeri
        seekBar.progress = 20//Seekbarda bulunan noktanın yüzde oalrak nerede bulunmasını istediğimizi belirtiyoruz
        seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(p0: SeekBar?, artis_miktari: Int, p2: Boolean) {

                tvSayi.text = "Artış Durumu: " + artis_miktari.toString()//Seekbar değeri değiştiğinde artiş miktarını textimize yazdırıyoruz

            }

            override fun onStartTrackingTouch(p0: SeekBar?) {

            }

            override fun onStopTrackingTouch(p0: SeekBar?) {

            }
        })
    }

}
