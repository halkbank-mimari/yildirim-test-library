package io.github.ytam.jetpacklibrary

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.github.ytam.jetpacklibrary.ui.theme.JetpackLibraryTheme
import io.github.ytam.mylibrary.ComposePicker

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackLibraryTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    Column(modifier = Modifier.padding(innerPadding)) {

                        ComposePicker(
                            modifier = Modifier.fillMaxWidth(),
                            items = (1..100).toList().map { it.toString() },
                            textModifier = Modifier.padding(12.dp),
                            endText = "Yaş",
                            visibleItemCount = 5

                        ) {

                        }
                    }



                }
            }
        }
    }
}

