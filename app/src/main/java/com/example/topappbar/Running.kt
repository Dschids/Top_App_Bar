package com.example.topappbar


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class Running : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_running)

        setSupportActionBar(findViewById(R.id.my_toolbar))
        val bar_setting = supportActionBar
        bar_setting?.title = "RUN!"
        bar_setting?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {
        R.id.action_run -> {
            Toast.makeText(this, "You're already there.", Toast.LENGTH_SHORT).show()
            true
        }

        R.id.action_naptime -> {
            val nap = Intent(this, Napping::class.java)
            startActivity(nap)
            true
        }

        else -> {
            // The user's action isn't recognized.
            // Invoke the superclass to handle it.
            super.onOptionsItemSelected(item)
        }
    }
}