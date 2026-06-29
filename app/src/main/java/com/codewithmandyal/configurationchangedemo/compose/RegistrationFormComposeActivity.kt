package com.codewithmandyal.configurationchangedemo.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.codewithmandyal.configurationchangedemo.R
import com.codewithmandyal.configurationchangedemo.ui.theme.ConfigurationChangeDemoTheme

class RegistrationFormComposeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ConfigurationChangeDemoTheme {
                RegistrationFormCompose()
            }
        }
    }
}