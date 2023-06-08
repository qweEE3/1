package com.example.myapplication1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication1.ui.theme.MyApplication1Theme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            var textFromTextField = remember {
                mutableStateOf("")
            }
            var textToText = remember {
                mutableStateOf("")
            }
            Column(
                modifier = Modifier
                    .background(Color.White)
                    .fillMaxSize(),
                Arrangement.Center,
                Alignment.CenterHorizontally

            ){
                TextField(textStyle = TextStyle(fontSize = 27.sp),modifier = Modifier.border(BorderStroke(1.dp,color = Color.Black)),colors = TextFieldDefaults.textFieldColors(containerColor = Color.White),value = textFromTextField.value, onValueChange = { t->textFromTextField.value = t})
                Button(
                    modifier = Modifier.padding(5.dp),
                    colors = ButtonDefaults.buttonColors(Color.White,Color.Black,Color.White,Color.White),
                    border = BorderStroke(1.dp,color = Color.Black),
                    onClick = {textToText.value = textFromTextField.value},){
                    Text(
                        "отобразить",
                        fontSize = 27.sp,
                    )
                }
                Text(
                    "${textToText.value}",
                    fontSize = 27.sp,
                )
            }
        }
    }
}
