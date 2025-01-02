package com.example.firstapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.firstapp.ui.theme.FirstAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            Demo()

        }
    }
}


@Composable
fun Demo(){
    Column(modifier = Modifier.fillMaxSize().background(Color.White).padding(start = 20.dp)){



        Spacer(modifier = Modifier.height(40.dp))

        Text(
            "Denzel Cars Showroom",
            fontSize = 30.sp,
            color = Color.DarkGray,
            fontFamily = FontFamily.SansSerif,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Bold,
            textDecoration = TextDecoration.Underline,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth()
            )
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            "Drive Your Dreams Home Today – Explore the Best Deals at Our Showroom!",
            fontSize = 25.sp
            )
        Spacer(modifier = Modifier.height(12.dp))

        Text(
            "1. G-Wagon",
            fontSize = 20.sp,
            color = Color.DarkGray,
            fontFamily = FontFamily.SansSerif,

            )
        Spacer(modifier = Modifier.height(8.dp))

        Text(
            "2. Audi",
            fontSize = 20.sp,
            color = Color.DarkGray,
            fontFamily = FontFamily.SansSerif,
        )
        Spacer(modifier = Modifier.height(8.dp))

        Text(
            "3. Bentley",
            fontSize = 20.sp,
            color = Color.DarkGray,
            fontFamily = FontFamily.SansSerif,
            )

        Spacer(modifier = Modifier.height(8.dp))
        Text(
            "4. Porsche",
            fontSize = 20.sp,
            color = Color.DarkGray,
            fontFamily = FontFamily.SansSerif,
            )
        Spacer(modifier = Modifier.height(8.dp))


        //Button
        Button(
            onClick = {},
            shape = RoundedCornerShape(8.dp),
//            colors = ButtonDefaults.buttonColors(Color.Magenta)

        ) {
            Row {
                Icon(imageVector = Icons.Default.ExitToApp, contentDescription = "View machines")
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    "View the machines",
                    fontSize = 10.sp,
                    )
            }
        }




    }

}



@Preview(showBackground = true)
@Composable
fun DemoPreview(){

    Demo()
}
