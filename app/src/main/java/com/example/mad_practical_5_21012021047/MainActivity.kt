package com.example.mad_practical_5_21012021047

import android.content.Intent
import android.graphics.Camera
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Phone
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var browse_button:Button = findViewById(R.id.button_browse)
        var editTextBrowser:EditText = findViewById(R.id.editTextText)

        browse_button.setOnClickListener {
            browse(editTextBrowser.text.toString())
        }
    }

    fun browse(url:String) {
        Intent(Intent.ACTION_VIEW, Uri.parse(url)).also {
            startActivity(it)
        }
    }
    fun call(phone:String) {

    }
    fun call_log() {

    }
    fun gallery() {

    }
    fun camera() {

    }
    fun alarm() {

    }
}