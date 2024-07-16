package com.example.yhhhhhh

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.yhhhhhh.ui.theme.YhhhhhhTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            YhhhhhhTheme {
                MainScreen()
            }
        }
    }
}

@Composable
fun MainScreen() {
    var showText by remember { mutableStateOf(false) }

    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        if (showText) {
            Text(text = "Hello World!")
        } else {
            Button(onClick = { showText = true }) {
                Text(text = "Click me")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    YhhhhhhTheme {
        MainScreen()
    }
}