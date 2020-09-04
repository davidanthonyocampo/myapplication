package com.example.horrorscope

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val horrorScopes = arrayOf(
            "Aquarius            (Jan 20 - Feb 18)",
            "Pisces                (Feb 19 - Mar 20)",
            "Aries                   (Mar 21 - Apr 19)",
            "Taurus              (Apr 20 - May 20)",
            "Gemini              (May 21 - Jun 21)",
            "Cancer           (Jun 22 - Jul 22)",
            "Leo             (Jul 23 - Aug 22)",
            "Virgo            (Aug 23 - Sep 22)",
            "Libra            (Sep 23 - Oct 22)",
            "Scorpio           (Oct 23 - Nov 21)",
            "Sagittarius            (Nov 22 - Dec 21)",
            "Capricorn          (Dec 22 - Jan 19)"
        )
        val arrayAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, horrorScopes)

        spinner.adapter = arrayAdapter

        spinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(p0: AdapterView<*>?) {

            }

            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

            }
        }

        button.setOnClickListener {

            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }

    }
}
