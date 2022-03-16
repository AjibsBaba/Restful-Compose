package com.ajibsbaba.restfulcompose

import android.graphics.drawable.Icon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ajibsbaba.restfulcompose.ui.theme.RestfulComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RestfulComposeTheme {
                Column(modifier = Modifier
                    .fillMaxWidth()) {
                    TopBar()
                    Column(modifier = Modifier.padding(start = 10.dp, end = 10.dp, top = 12.dp)) {
                        PostCardTitle("Dele Momodu")
                        PostCardContent()
                        Spacer(modifier = Modifier.height(20.dp))
                        PostCardTitle("Joseph Yobo")
                        PostCardContent()
                        Spacer(modifier = Modifier.height(20.dp))
                        PostCardTitle("Brother Lie")
                        PostCardContent()
                    }
                }
            }
        }
    }
}

@Composable
fun PostCardTitle(author: String? = "Samuel Ajibade", timestamp: String? = "2 days ago") {
    Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(4.dp)) {
        Image(imageVector = Icons.Default.Person, contentDescription = null )
        Column {
            Text(text = "$author", fontWeight = FontWeight.SemiBold, fontSize = MaterialTheme.typography.body1.fontSize)
            Text(
                text = "$timestamp",
                fontWeight = FontWeight.Light,
                fontSize = MaterialTheme.typography.caption.fontSize
            )
        }
    }
}


@Composable
fun PostCardContent(content: String? = "Lorem Ipsum blah blah  blah yada yada yada Lorem Ipsum blah blah  blah yada yada yada Lorem Ipsum blah blah  blah yada yada yada Lorem Ipsum blah blah  blah yada yada yada Lorem Ipsum blah blah" ) {
    Column {
        Text (
            text = "$content",
            fontSize = MaterialTheme.typography.subtitle1.fontSize,
            fontWeight = FontWeight.Normal, modifier = Modifier.padding(top = 10.dp))
    }
}


@Composable
fun TopBar() {
    MaterialTheme {
          TopAppBar(backgroundColor = Color.Black, modifier = Modifier.fillMaxWidth()) {
              Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center) {
                  Text(text = "Restful Compose", color = Color.White, textAlign = TextAlign.Center, modifier = Modifier.fillMaxWidth())
              }
          }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    RestfulComposeTheme {
       Column(modifier = Modifier
           .fillMaxWidth()) {
           TopBar()
           Column(modifier = Modifier.padding(start = 10.dp, end = 10.dp, top = 12.dp)) {
               PostCardTitle("Dele Momodu")
               PostCardContent()
               Spacer(modifier = Modifier.height(20.dp))
               PostCardTitle("Joseph Yobo")
               PostCardContent()
               Spacer(modifier = Modifier.height(20.dp))
               PostCardTitle("Brother Lie")
               PostCardContent()
           }
       }
    }
}