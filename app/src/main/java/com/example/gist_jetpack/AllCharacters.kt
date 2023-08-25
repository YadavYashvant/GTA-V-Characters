package com.example.gist_jetpack

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AllCharacters(charList: List<CharacterData>) {
    Scaffold (
    ) {
        LazyColumn(
            modifier = Modifier.fillMaxWidth(),
            contentPadding = PaddingValues(16.dp)
        ) {
            item {
                Column (
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight()
                        .padding(vertical = 40.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.SpaceEvenly
                ){
                    Card (
                        modifier = Modifier
                            .padding(horizontal = 12.dp, vertical = 25.dp)
                            .fillMaxWidth()
                            .wrapContentHeight(),
                        shape = MaterialTheme.shapes.large,
                        elevation = CardDefaults.cardElevation(
                            defaultElevation = 30.dp
                        ),
                    ) {
                        Image(painter = painterResource(id = R.drawable.gtav), contentDescription = null,
                            modifier = Modifier
                                .size(130.dp)
                                .padding(5.dp),
                            contentScale = ContentScale.Fit
                        )
                        Text(text = "GTA V Characters",
                            style = MaterialTheme.typography.headlineLarge,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }

            }

            items(charList) { character ->
                CharacterCard(
                    name = character.name,
                    description = character.description,
                    image = character.imageRes
                )
            }
        }
    }
}