package com.example.comp3025w1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.comp3025w1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //define a variable to associate the elements
    // in the view to be accessible in the controller class
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // initialize the binding variable to the objects in the
        // ActivityMainBinding class
        binding = ActivityMainBinding.inflate(layoutInflater)

        // set the content view to the root view of the binding object
        setContentView(binding.root)

        // create a click listener for the button
        binding.submitButton.setOnClickListener {
           var name = binding.nameEditText.text
              binding.textView.text ="Hello " + name
        }


    }
}