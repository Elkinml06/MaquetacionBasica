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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProductScreen1()
        }
    }
}
// Primer ejercicio tarea
@Preview(showSystemUi = true)
@Composable
fun ProductScreen1() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
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