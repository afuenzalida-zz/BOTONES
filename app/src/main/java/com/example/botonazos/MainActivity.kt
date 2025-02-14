package com.example.botonazos

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.botonazos.ui.theme.BOTONAZOSTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BOTONAZOSTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    CenteredButton(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun CenteredButton(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Button(onClick = {
            // Por ahora usamos un println ya que Toast requiere un Context
            println("¡Hola!")
        }) {
            Text(text = "Presióname")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CenteredButtonPreview() {
    BOTONAZOSTheme {
        CenteredButton()
    }
}