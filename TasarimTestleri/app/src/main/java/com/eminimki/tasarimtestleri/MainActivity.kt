package com.eminimki.tasarimtestleri

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.eminimki.tasarimtestleri.Fragments.CalendarFragment
import com.eminimki.tasarimtestleri.Fragments.FilterFragment
import com.eminimki.tasarimtestleri.Fragments.MyNotesFragment
import com.eminimki.tasarimtestleri.Fragments.SettingsFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadFragment(MyNotesFragment())
        val bottomNav = findViewById(R.id.bottom_navigation) as BottomNavigationView
        bottomNav.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.myNotesNavButton -> {
                    loadFragment(MyNotesFragment())
                    true
                }
                R.id.calendarNavButton -> {
                    loadFragment(CalendarFragment())
                    true
                }
                R.id.filterNavButton -> {
                    loadFragment(FilterFragment())
                    true
                }
                R.id.settingsNavButton -> {
                    loadFragment(SettingsFragment())
                    true
                }

                else -> {true}
            }
        }
    }

    private  fun loadFragment(fragment: Fragment){
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragmentNavHost,fragment)
        transaction.commit()
    }


    fun addNewNote(view : View) {
        val intent =Intent(this,NoteAddActivity::class.java)
        startActivity(intent)
    }

    fun finisThisActivity(){
        finish()
    }



}