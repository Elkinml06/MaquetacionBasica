package me.elkinmendoza.maquetacionbasica

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

        }
    }
}
// Primer ejercicio tarea
@Preview(showSystemUi = true)
@Composable
fun Screen1() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp,36.dp)
    ) {
        ProductCard()
        Spacer(modifier = Modifier.height(16.dp))

        ProductButtons()
    }
}

@Composable
fun ProductCard() {
    Card(
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(6.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        )
    ){
        Column(
            modifier = Modifier.padding(16.dp)
        ) {

            ProductImage()

            Spacer(modifier = Modifier.height(16.dp))

            ProductTexts()

        }
    }
}

@Composable
fun ProductImage() {

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(250.dp)
    ) {

        Image(
            painter = painterResource(id = R.drawable.pc),
            contentDescription = null,
            modifier = Modifier.fillMaxSize()
        )

        Icon(
            painter = painterResource(id = R.drawable.heart),
            contentDescription = null,
            tint = Color.Unspecified,
            modifier = Modifier
                .align(Alignment.TopEnd)
                .padding(13.dp)
                .size(24.dp)
        )
    }
}
@Composable
fun ProductTexts() {

    Column {

        Text(
            text = "Nombre del Producto",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold
        )

        Text(
            text = "$99.99",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Green
        )

        HorizontalDivider(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            thickness = 2.dp,
            color = Color.LightGray
        )
        Text(
            text = "Descripción del producto con detalles importantes, características y beneficios.",
        )
    }
}
@Composable
fun ProductButtons() {

    Row(
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {

        // Botón Editar
        Row(
            modifier = Modifier
                .weight(1f)
                .background(Color(0xFF6A1B9A), RoundedCornerShape(50))
                .padding(vertical = 12.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {

            Icon(
                painter = painterResource(id = R.drawable.edit),
                contentDescription = null,
                tint = Color.White,
                modifier = Modifier.size(18.dp)
            )

            Spacer(modifier = Modifier.width(8.dp))

            Text(
                text = "Editar",
                color = Color.White,
                fontWeight = FontWeight.Bold
            )
        }

        // Botón Eliminar
        Row(
            modifier = Modifier
                .weight(1f)
                .background(Color.Red, RoundedCornerShape(50))
                .padding(vertical = 12.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {

            Icon(
                painter = painterResource(id = R.drawable.delate),
                contentDescription = null,
                tint = Color.White,
                modifier = Modifier.size(18.dp)
            )

            Spacer(modifier = Modifier.width(8.dp))

            Text(
                text = "Eliminar",
                color = Color.White,
                fontWeight = FontWeight.Bold
            )
        }
    }
}

// Segundo ejercicio tarea
@Preview(showSystemUi = true)
@Composable
fun Screen2() {
    Column(
        modifier = Modifier
            .fillMaxSize(),
    ) {
        Row() {
            Image(
                painter = painterResource(id = R.drawable.bg2),
                contentDescription = null,
                modifier = Modifier
                    .padding(top = 30.dp)
            )
        }
        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Jetpack Compose Tutorial",
            fontSize = 24.sp,
            fontWeight = FontWeight.Medium,
            modifier = Modifier.padding(horizontal = 16.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Jetpack Compose is a modern toolkit for building native Android UI. Compose simplifies and accelerates UI development on Android with less code, powerful tools, nd intuitive Kotlin APIS.",
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(horizontal = 16.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "In this tutorial, you build a simple Ul component with declarative functions. You call Compose functions to say what elements you want and the Compose compiler does the rest Compose is built around Composable functions. These functions let you define your app's UI programmatically because they let you describe how it should look and provide data dependencies, rather than focus on the process of the Ul's construction, such as initializing an element and then attaching it to a parent. To create a Composable function, you add the @Composable annotation to the function name.",
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(horizontal = 16.dp)
        )
    }

}