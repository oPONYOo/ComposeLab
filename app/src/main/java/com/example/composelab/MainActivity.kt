package com.example.composelab

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.composelab.animation.AnimatedVisibilityDemo
import com.example.composelab.animation.CrossfadeAnimationDemo
import com.example.composelab.animation.InfiniteRepeatableDemo
import com.example.composelab.animation.MultipleValuesAnimationDemo
import com.example.composelab.animation.SizeChangeAnimationDemo
import com.example.composelab.animation.StateChangeDemo
import com.example.composelab.ui.theme.ComposeLabTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeLabTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    StateChangeDemo()
//                    MultipleValuesAnimationDemo()
//                    AnimatedVisibilityDemo()
//                    SizeChangeAnimationDemo()
//                    CrossfadeAnimationDemo()
//                    InfiniteRepeatableDemo()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeLabTheme {
        Greeting("Android")
    }
}