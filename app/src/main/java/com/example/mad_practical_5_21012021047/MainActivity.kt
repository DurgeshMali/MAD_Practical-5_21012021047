package com.example.mad_practical_5_21012021047

import android.content.Intent
import android.graphics.Camera
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock
import android.provider.CallLog
import android.provider.ContactsContract.CommonDataKinds.Phone
import android.provider.MediaStore
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var browse_button:Button = findViewById(R.id.button_browse)
        var editTextBrowser:EditText = findViewById(R.id.editTextText)

        var call_button:Button = findViewById(R.id.button_call)
        var editPhone:EditText = findViewById(R.id.editTextText2)

        var buttonCallLog:Button = findViewById(R.id.button_call_log)

        var buttonGallery:Button = findViewById(R.id.button_gallery)

        var buttonCamera:Button = findViewById(R.id.button_camera)

        var buttonAlarm:Button = findViewById(R.id.button_alarm)

        browse_button.setOnClickListener {
            browse(editTextBrowser.text.toString())
        }

        call_button.setOnClickListener {
            call(editPhone.text.toString())
        }

        buttonCallLog.setOnClickListener {
            call_log()
        }

        buttonGallery.setOnClickListener {
            gallery()
        }

        buttonCamera.setOnClickListener {
            camera()
        }

        buttonAlarm.setOnClickListener {
            alarm()
        }
    }

    fun browse(url:String) {
        Intent(Intent.ACTION_VIEW, Uri.parse(url)).also {
            startActivity(it)
        }
    }
    fun call(phone:String) {
        Intent(Intent.ACTION_DIAL).setData(Uri.parse("tel:$phone")).also {
            startActivity(it)
        }
    }
    fun call_log() {
        Intent(Intent.ACTION_VIEW).setType(CallLog.Calls.CONTENT_TYPE).also {
            startActivity(it)
        }
    }
    fun gallery() {
        Intent(Intent.ACTION_VIEW).setType("image/*").also {
            startActivity((it))
        }
    }
    fun camera() {
        Intent(MediaStore.ACTION_IMAGE_CAPTURE).also {
            startActivity(it)
        }
    }
    fun alarm() {
        Intent(AlarmClock.ACTION_SHOW_ALARMS).also {
            startActivity(it)
        }
    }
}