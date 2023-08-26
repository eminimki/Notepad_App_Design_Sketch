package com.eminimki.tasarimtestleri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View


class NoteAddActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_note_add)

    }


    fun noteAddButtonAddPage(view : View){ // this is a temp activity
        val intent = Intent(this,MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}