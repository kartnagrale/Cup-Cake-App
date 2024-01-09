package com.kartik.cupcake.ui.components

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun FormattedPriceLabel(subtotal:String,modifier: Modifier=Modifier){
    Text(
        text = subtotal,
        modifier = modifier,
        style = MaterialTheme.typography.headlineSmall
    )
}
