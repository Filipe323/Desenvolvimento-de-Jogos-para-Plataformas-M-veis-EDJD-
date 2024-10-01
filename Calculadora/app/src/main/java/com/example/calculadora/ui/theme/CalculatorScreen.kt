package com.example.calculadora.ui.theme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.calculadora.ui.theme.CalculadoraTheme

@Composable
fun CalculatorScreen(modifier: Modifier = Modifier) {
    Column(modifier = modifier)
    Text(text = "0"
        Row{
             Button(onClick =  { TODO() }
                 Text(text="7")


    }
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CalculadoraTheme {
        Greeting("Android")
    }
}