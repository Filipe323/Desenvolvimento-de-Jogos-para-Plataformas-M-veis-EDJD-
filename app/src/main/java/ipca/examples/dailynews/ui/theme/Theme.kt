package ipca.examples.dailynews.ui.theme

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

// Cores para o modo escuro
private val DarkColorScheme = darkColorScheme(
    primary = Color(0xFFBB86FC),  // Roxo claro
    secondary = Color(0xFF03DAC5), // Verde claro
    background = Color(0xFF121212), // Preto para o fundo
    surface = Color(0xFF121212),   // Preto para superfícies
    onPrimary = Color.White,       // Branco para texto
    onSecondary = Color.White,     // Branco para texto em componentes secundários
    onBackground = Color.White,    // Branco para texto no fundo
    onSurface = Color.White        // Branco para texto nas superfícies
)

@Composable
fun DailyNewsTheme(
    darkTheme: Boolean = true,  // Forçar o tema escuro
    content: @Composable () -> Unit
) {
    val colorScheme = DarkColorScheme

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}
