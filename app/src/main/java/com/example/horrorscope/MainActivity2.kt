package com.example.horrorscope

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var intent = intent
        val sentText = intent.getStringExtra("sentText")

        var database = FirebaseDatabase.getInstance().reference
        var getdata = object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                textView.text = (snapshot.child(sentText).getValue()).toString()
            }

            override fun onCancelled(error: DatabaseError) {
            }
        }

        database.addValueEventListener(getdata)
        database.addListenerForSingleValueEvent(getdata)
    }


}

