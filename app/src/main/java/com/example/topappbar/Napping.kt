package com.example.topappbar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class Napping : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_napping)

        setSupportActionBar(findViewById(R.id.my_toolbar))
        var bar_setting = supportActionBar
        bar_setting?.setTitle("Naptime")
        bar_setting?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        // inflates the menu I made
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {
        R.id.action_run -> {
            val run = Intent(this, Running::class.java)
            startActivity(run)
            true
        }

        R.id.action_naptime -> {
            Toast.makeText(this, "You're already there.", Toast.LENGTH_SHORT).show()
            true
        }

        else -> {
            // The user's action isn't recognized.
            // Invoke the superclass to handle it.
            super.onOptionsItemSelected(item)
        }
    }
}