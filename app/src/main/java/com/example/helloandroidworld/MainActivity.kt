package com.example.helloandroidworld
/*
The Kotlin file for an activity is used to define the behavior and logic of the activity.
It defines the lifecycle of the activity, including when it is created, started, paused,
resumed, stopped, and destroyed.
It handles user input and responds to events such as button clicks, text input, and gestures.
It interacts with the data layer of the app, such as retrieving and storing data from a local
database or a remote server.
It updates the user interface based on changes in the app's data and state.
It may also interact with other components of the Android system, such as other activities,
services, or broadcast receivers.
*/

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}