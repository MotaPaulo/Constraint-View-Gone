package com.motapaulo.constraintgone

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupButtons()
    }

    private fun setupButtons() {
        buttonA.setOnClickListener {
            buttonA.visibility = View.GONE
        }
        buttonB1.setOnClickListener {
            buttonB1.visibility = View.GONE
        }
        buttonB2.setOnClickListener {
            buttonB2.visibility = View.GONE
        }
        buttonB3.setOnClickListener {
            buttonB3.visibility = View.GONE
        }
        buttonC.setOnClickListener {
            buttonC.visibility = View.GONE
        }

        buttonReset.setOnClickListener {

            buttonA.visibility = View.VISIBLE
            buttonB1.visibility = View.VISIBLE
            buttonB2.visibility = View.VISIBLE
            buttonB3.visibility = View.VISIBLE
            buttonC.visibility = View.VISIBLE
        }


    }
}
