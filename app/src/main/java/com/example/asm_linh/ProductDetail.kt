package com.example.asm_linh

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun ProductDetail(navController: NavHostController) {
    Column(modifier = Modifier.fillMaxWidth().padding(16.dp)) {
        Text(text = "Product Detail Screen")

        // Add your product detail UI components here
    }
}
