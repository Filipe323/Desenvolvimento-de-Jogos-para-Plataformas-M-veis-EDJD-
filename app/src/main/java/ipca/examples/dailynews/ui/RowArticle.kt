package ipca.examples.dailynews.ui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import ipca.examples.dailynews.models.Article
import ipca.examples.dailynews.toYYYYMMDD

@Composable
fun RowArticle(modifier: Modifier = Modifier, article: Article) {
    Row(modifier = modifier.padding(12.dp)) {

        AsyncImage(
            model = article.urlToImage,
            contentDescription = "Image for article",
            modifier = Modifier
                .height(120.dp)
                .width(120.dp)
                .clip(RoundedCornerShape(16.dp))
                .shadow(4.dp, shape = RoundedCornerShape(16.dp)),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.width(12.dp))

        Column(modifier = Modifier.fillMaxWidth()) {
            Text(
                text = article.title ?: "Untitled article",
                style = MaterialTheme.typography.titleLarge,
                color = MaterialTheme.colorScheme.onPrimary,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis
            )

            Spacer(modifier = Modifier.height(4.dp))

            Text(
                text = article.description ?: "No description available",
                style = MaterialTheme.typography.bodyMedium,
                color = Color.Gray,
                maxLines = 3,
                overflow = TextOverflow.Ellipsis
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = article.publishedAt?.toYYYYMMDD() ?: "Unknown date",
                style = MaterialTheme.typography.bodySmall,
                color = Color.LightGray
            )
        }
    }
}
