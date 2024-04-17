package com.example.wavytextcompose


import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit

@Composable
fun ColoredText(
    modifier: Modifier = Modifier,
    text: String,
    textColor: Color = Color.Black,
    fillColor: Color = Color.Blue,
    offSet: Float = 0.5f,
    fontSize: TextUnit = TextUnit.Unspecified,
    fontStyle: FontStyle? = null,
    fontWeight: FontWeight? = null,
    fontFamily: FontFamily? = null,
    letterSpacing: TextUnit = TextUnit.Unspecified,
    textDecoration: TextDecoration? = null,
    textAlign: TextAlign? = null,
    lineHeight: TextUnit = TextUnit.Unspecified,
    overflow: TextOverflow = TextOverflow.Clip,
) {
    val len = calLen(text.length, offSet)
    Row(modifier=modifier) {
        Text(
            text = text.substring(0, len), fontWeight = fontWeight,
            fontSize = fontSize, fontStyle = fontStyle,
            fontFamily = fontFamily, letterSpacing = letterSpacing,
            textDecoration = textDecoration, textAlign = textAlign,
            lineHeight = lineHeight, overflow = overflow, color = fillColor
        )
        Text(
            text = text.substring(len, text.length), fontWeight = fontWeight,
            fontSize = fontSize, fontStyle = fontStyle,
            fontFamily = fontFamily, letterSpacing = letterSpacing,
            textDecoration = textDecoration, textAlign = textAlign,
            lineHeight = lineHeight, overflow = overflow, color = textColor
        )

    }

}

fun calLen(len: Int, percentage: Float): Int {
    return len.times(percentage).toInt()
}


@Preview(showSystemUi = true)
@Composable
fun PreviewText(modifier: Modifier = Modifier) {
    ColoredText(text = "Hello World", textColor = Color.Blue, fillColor = Color.Gray, offSet = 0.2f)
}