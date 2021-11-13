package com.example.statusbarcolor

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.google.accompanist.systemuicontroller.rememberSystemUiController


class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface(color = MaterialTheme.colors.background) {
                HomeScreen()
            }
        }
    }
}

@Composable
fun HomeScreen(){

    val systemUiController = rememberSystemUiController()
    var color by remember{ mutableStateOf(Color.White)}
    var darkIcon by remember{ mutableStateOf(true)}

    systemUiController.setSystemBarsColor(
        color = color,
        darkIcons = darkIcon
    )

    Column(
        Modifier.fillMaxSize(),
        Arrangement.Center,
        Alignment.CenterHorizontally
    ) {
        Text("Status Bar Color", fontSize = 25.sp, fontWeight = FontWeight.W500)
        Spacer(modifier = Modifier.height(20.dp))
        Row(
            Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Button(
                onClick = {
                    color = Color.Gray
                },
                shape = CircleShape,
                elevation = ButtonDefaults.elevation(5.dp),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.Gray
                ),
            ) {}
            Button(
                onClick = {
                    color = Color.Yellow
                },
                elevation = ButtonDefaults.elevation(5.dp),
                shape = CircleShape,
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.Yellow
                ),
            ) {}
            Button(
                onClick = {
                    color = Color.Red
                },
                shape = CircleShape,
                elevation = ButtonDefaults.elevation(5.dp),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.Red
                ),
            ) {}
            Button(
                onClick = {
                    color = Color.Blue
                },
                shape = CircleShape,
                elevation = ButtonDefaults.elevation(5.dp),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.Blue
                ),
            ) {}
        }
        Spacer(modifier = Modifier.height(35.dp))
        Text("Status Bar Icon Color", fontSize = 25.sp, fontWeight = FontWeight.W500)
        Spacer(modifier = Modifier.height(20.dp))
        Row(
            Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ){
            Button(
                onClick = { darkIcon = false },
                shape = CircleShape,
                elevation = ButtonDefaults.elevation(5.dp),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.White
                ),
            ) {}
            Button(
                onClick = { darkIcon = true },
                shape = CircleShape,
                elevation = ButtonDefaults.elevation(5.dp),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.Black
                ),
            ) {}
        }
    }

}