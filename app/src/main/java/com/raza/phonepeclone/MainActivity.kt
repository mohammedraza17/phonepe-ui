package com.raza.phonepeclone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.ui.graphics.toArgb
import com.raza.phonepeclone.ui.theme.PhonePeCloneTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val purpleColor = androidx.compose.ui.graphics.Color(0xFF5F259F).toArgb()
        enableEdgeToEdge(
            statusBarStyle = SystemBarStyle.dark(purpleColor)
        )
        setContent {
            PhonePeCloneTheme {
                HomeScreen()
            }
        }
    }
}
