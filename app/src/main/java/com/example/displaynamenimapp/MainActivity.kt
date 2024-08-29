package com.example.displaynamenimapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.displaynamenimapp.ui.theme.DisplayNameNIMAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DisplayNameNIMAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    DisplayNameAndNIM(
                        name = "Alif Nur Sanubari",
                        nim = "225150600111020",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun DisplayNameAndNIM(name: String, nim: String, modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(16.dp)) {
        Text(
            text = "Nama: $name",
            fontSize = 24.sp,
            modifier = Modifier.padding(bottom = 8.dp)
        )
        Text(
            text = "NIM: $nim",
            fontSize = 24.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DisplayNameAndNIMPreview() {
    DisplayNameNIMAppTheme {
        DisplayNameAndNIM(
            name = "Alif Nur Sanubari",
            nim = "225150600111020"
        )
    }
}
