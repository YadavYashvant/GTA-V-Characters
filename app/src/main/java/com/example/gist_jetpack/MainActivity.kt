package com.example.gist_jetpack

import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.StringRes
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import com.example.gist_jetpack.ui.theme.GistJetpackTheme


class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val characters = listOf(
            CharacterData(9,"Michael De Santa",getString(R.string.michael),R.drawable.michael),
            CharacterData(9,"Michael De Santa",getString(R.string.franklin), R.drawable.franklin),
            CharacterData(9,"Michael De Santa",getString(R.string.trevor), R.drawable.trevor),
            CharacterData(9,"Michael De Santa",getString(R.string.lester), R.drawable.lester),
            CharacterData(9,"Michael De Santa",getString(R.string.dave), R.drawable.dave),
            CharacterData(9,"Michael De Santa",getString(R.string.amanda), R.drawable.amanda),
            CharacterData(9,"Michael De Santa",getString(R.string.lamar), R.drawable.lamar),
            CharacterData(9,"Michael De Santa",getString(R.string.jimmy), R.drawable.jimmy),
            CharacterData(9,"Michael De Santa",getString(R.string.molly),R.drawable.molly),
        )



        setContent {
            GistJetpackTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.Black),
                    color = MaterialTheme.colorScheme.background
                ) {
                    AllCharacters(characters)
                }
            }
        }
    }
}
