package com.example.gist_jetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.gist_jetpack.ui.theme.GistJetpackTheme

val characters = listOf(
    CharacterData(0,"Michael De Santa","Michael De Santa, formerly Michael Townley, is a retired bank robber, who, after making a deal with the Federal Investigation Bureau, moves alongside his family to Los Santos, where they live in a nice mansion. Unfortunately, his wife, Amanda, repeatedly spends his money and the family has became largely dysfunctional over the years. After getting on the wrong side of a Mexican Cartel leader, Michael is forced to return to criminal life once more, this time, aided by his protege and up-and-coming criminal Franklin Clinton. After his first job, he is joined by former friend Trevor Philips. Despite a rift in their friendship after several jobs, including stealing a superweapon from the government, raiding a county bank & a research lab for the FIB, they banded together with Franklin and Lester to pull off a final heist",R.drawable.michael),
    CharacterData(1,"Franklin","Michael De Santa, formerly Michael Townley, is a retired bank robber, who, after making a deal with the Federal Investigation Bureau, moves alongside his family to Los Santos, where they live in a nice mansion. Unfortunately, his wife, Amanda, repeatedly spends his money and the family has became largely dysfunctional over the years. After getting on the wrong side of a Mexican Cartel leader, Michael is forced to return to criminal life once more, this time, aided by his protege and up-and-coming criminal Franklin Clinton. After his first job, he is joined by former friend Trevor Philips. Despite a rift in their friendship after several jobs, including stealing a superweapon from the government, raiding a county bank & a research lab for the FIB, they banded together with Franklin and Lester to pull off a final heist",R.drawable.franklin),
    CharacterData(2,"Michael De Santa","Michael De Santa, formerly Michael Townley, is a retired bank robber, who, after making a deal with the Federal Investigation Bureau, moves alongside his family to Los Santos, where they live in a nice mansion. Unfortunately, his wife, Amanda, repeatedly spends his money and the family has became largely dysfunctional over the years. After getting on the wrong side of a Mexican Cartel leader, Michael is forced to return to criminal life once more, this time, aided by his protege and up-and-coming criminal Franklin Clinton. After his first job, he is joined by former friend Trevor Philips. Despite a rift in their friendship after several jobs, including stealing a superweapon from the government, raiding a county bank & a research lab for the FIB, they banded together with Franklin and Lester to pull off a final heist", R.drawable.trevor),
    CharacterData(3,"Michael De Santa","Michael De Santa, formerly Michael Townley, is a retired bank robber, who, after making a deal with the Federal Investigation Bureau, moves alongside his family to Los Santos, where they live in a nice mansion. Unfortunately, his wife, Amanda, repeatedly spends his money and the family has became largely dysfunctional over the years. After getting on the wrong side of a Mexican Cartel leader, Michael is forced to return to criminal life once more, this time, aided by his protege and up-and-coming criminal Franklin Clinton. After his first job, he is joined by former friend Trevor Philips. Despite a rift in their friendship after several jobs, including stealing a superweapon from the government, raiding a county bank & a research lab for the FIB, they banded together with Franklin and Lester to pull off a final heist", R.drawable.lester),
    CharacterData(4,"Michael De Santa","Michael De Santa, formerly Michael Townley, is a retired bank robber, who, after making a deal with the Federal Investigation Bureau, moves alongside his family to Los Santos, where they live in a nice mansion. Unfortunately, his wife, Amanda, repeatedly spends his money and the family has became largely dysfunctional over the years. After getting on the wrong side of a Mexican Cartel leader, Michael is forced to return to criminal life once more, this time, aided by his protege and up-and-coming criminal Franklin Clinton. After his first job, he is joined by former friend Trevor Philips. Despite a rift in their friendship after several jobs, including stealing a superweapon from the government, raiding a county bank & a research lab for the FIB, they banded together with Franklin and Lester to pull off a final heist",
        R.drawable.lamar
    ),
    CharacterData(5,"Michael De Santa","Michael De Santa, formerly Michael Townley, is a retired bank robber, who, after making a deal with the Federal Investigation Bureau, moves alongside his family to Los Santos, where they live in a nice mansion. Unfortunately, his wife, Amanda, repeatedly spends his money and the family has became largely dysfunctional over the years. After getting on the wrong side of a Mexican Cartel leader, Michael is forced to return to criminal life once more, this time, aided by his protege and up-and-coming criminal Franklin Clinton. After his first job, he is joined by former friend Trevor Philips. Despite a rift in their friendship after several jobs, including stealing a superweapon from the government, raiding a county bank & a research lab for the FIB, they banded together with Franklin and Lester to pull off a final heist",
        R.drawable.dave
    ),
    CharacterData(6,"Michael De Santa","Michael De Santa, formerly Michael Townley, is a retired bank robber, who, after making a deal with the Federal Investigation Bureau, moves alongside his family to Los Santos, where they live in a nice mansion. Unfortunately, his wife, Amanda, repeatedly spends his money and the family has became largely dysfunctional over the years. After getting on the wrong side of a Mexican Cartel leader, Michael is forced to return to criminal life once more, this time, aided by his protege and up-and-coming criminal Franklin Clinton. After his first job, he is joined by former friend Trevor Philips. Despite a rift in their friendship after several jobs, including stealing a superweapon from the government, raiding a county bank & a research lab for the FIB, they banded together with Franklin and Lester to pull off a final heist",
        R.drawable.amanda
    ),
    CharacterData(7,"Michael De Santa","Michael De Santa, formerly Michael Townley, is a retired bank robber, who, after making a deal with the Federal Investigation Bureau, moves alongside his family to Los Santos, where they live in a nice mansion. Unfortunately, his wife, Amanda, repeatedly spends his money and the family has became largely dysfunctional over the years. After getting on the wrong side of a Mexican Cartel leader, Michael is forced to return to criminal life once more, this time, aided by his protege and up-and-coming criminal Franklin Clinton. After his first job, he is joined by former friend Trevor Philips. Despite a rift in their friendship after several jobs, including stealing a superweapon from the government, raiding a county bank & a research lab for the FIB, they banded together with Franklin and Lester to pull off a final heist",
        R.drawable.jimmy
    ),
    CharacterData(8,"Michael De Santa","Michael De Santa, formerly Michael Townley, is a retired bank robber, who, after making a deal with the Federal Investigation Bureau, moves alongside his family to Los Santos, where they live in a nice mansion. Unfortunately, his wife, Amanda, repeatedly spends his money and the family has became largely dysfunctional over the years. After getting on the wrong side of a Mexican Cartel leader, Michael is forced to return to criminal life once more, this time, aided by his protege and up-and-coming criminal Franklin Clinton. After his first job, he is joined by former friend Trevor Philips. Despite a rift in their friendship after several jobs, including stealing a superweapon from the government, raiding a county bank & a research lab for the FIB, they banded together with Franklin and Lester to pull off a final heist",R.drawable.michael),
    CharacterData(9,"Michael De Santa","Michael De Santa, formerly Michael Townley, is a retired bank robber, who, after making a deal with the Federal Investigation Bureau, moves alongside his family to Los Santos, where they live in a nice mansion. Unfortunately, his wife, Amanda, repeatedly spends his money and the family has became largely dysfunctional over the years. After getting on the wrong side of a Mexican Cartel leader, Michael is forced to return to criminal life once more, this time, aided by his protege and up-and-coming criminal Franklin Clinton. After his first job, he is joined by former friend Trevor Philips. Despite a rift in their friendship after several jobs, including stealing a superweapon from the government, raiding a county bank & a research lab for the FIB, they banded together with Franklin and Lester to pull off a final heist",R.drawable.michael),
    CharacterData(9,"Michael De Santa","Michael De Santa, formerly Michael Townley, is a retired bank robber, who, after making a deal with the Federal Investigation Bureau, moves alongside his family to Los Santos, where they live in a nice mansion. Unfortunately, his wife, Amanda, repeatedly spends his money and the family has became largely dysfunctional over the years. After getting on the wrong side of a Mexican Cartel leader, Michael is forced to return to criminal life once more, this time, aided by his protege and up-and-coming criminal Franklin Clinton. After his first job, he is joined by former friend Trevor Philips. Despite a rift in their friendship after several jobs, including stealing a superweapon from the government, raiding a county bank & a research lab for the FIB, they banded together with Franklin and Lester to pull off a final heist",R.drawable.michael),
    CharacterData(9,"Michael De Santa","Michael De Santa, formerly Michael Townley, is a retired bank robber, who, after making a deal with the Federal Investigation Bureau, moves alongside his family to Los Santos, where they live in a nice mansion. Unfortunately, his wife, Amanda, repeatedly spends his money and the family has became largely dysfunctional over the years. After getting on the wrong side of a Mexican Cartel leader, Michael is forced to return to criminal life once more, this time, aided by his protege and up-and-coming criminal Franklin Clinton. After his first job, he is joined by former friend Trevor Philips. Despite a rift in their friendship after several jobs, including stealing a superweapon from the government, raiding a county bank & a research lab for the FIB, they banded together with Franklin and Lester to pull off a final heist",R.drawable.michael),
    CharacterData(9,"Michael De Santa","Michael De Santa, formerly Michael Townley, is a retired bank robber, who, after making a deal with the Federal Investigation Bureau, moves alongside his family to Los Santos, where they live in a nice mansion. Unfortunately, his wife, Amanda, repeatedly spends his money and the family has became largely dysfunctional over the years. After getting on the wrong side of a Mexican Cartel leader, Michael is forced to return to criminal life once more, this time, aided by his protege and up-and-coming criminal Franklin Clinton. After his first job, he is joined by former friend Trevor Philips. Despite a rift in their friendship after several jobs, including stealing a superweapon from the government, raiding a county bank & a research lab for the FIB, they banded together with Franklin and Lester to pull off a final heist",R.drawable.michael),
    CharacterData(9,"Michael De Santa","Michael De Santa, formerly Michael Townley, is a retired bank robber, who, after making a deal with the Federal Investigation Bureau, moves alongside his family to Los Santos, where they live in a nice mansion. Unfortunately, his wife, Amanda, repeatedly spends his money and the family has became largely dysfunctional over the years. After getting on the wrong side of a Mexican Cartel leader, Michael is forced to return to criminal life once more, this time, aided by his protege and up-and-coming criminal Franklin Clinton. After his first job, he is joined by former friend Trevor Philips. Despite a rift in their friendship after several jobs, including stealing a superweapon from the government, raiding a county bank & a research lab for the FIB, they banded together with Franklin and Lester to pull off a final heist",R.drawable.michael),
    CharacterData(9,"Michael De Santa","Michael De Santa, formerly Michael Townley, is a retired bank robber, who, after making a deal with the Federal Investigation Bureau, moves alongside his family to Los Santos, where they live in a nice mansion. Unfortunately, his wife, Amanda, repeatedly spends his money and the family has became largely dysfunctional over the years. After getting on the wrong side of a Mexican Cartel leader, Michael is forced to return to criminal life once more, this time, aided by his protege and up-and-coming criminal Franklin Clinton. After his first job, he is joined by former friend Trevor Philips. Despite a rift in their friendship after several jobs, including stealing a superweapon from the government, raiding a county bank & a research lab for the FIB, they banded together with Franklin and Lester to pull off a final heist",R.drawable.michael),
    CharacterData(9,"Michael De Santa","Michael De Santa, formerly Michael Townley, is a retired bank robber, who, after making a deal with the Federal Investigation Bureau, moves alongside his family to Los Santos, where they live in a nice mansion. Unfortunately, his wife, Amanda, repeatedly spends his money and the family has became largely dysfunctional over the years. After getting on the wrong side of a Mexican Cartel leader, Michael is forced to return to criminal life once more, this time, aided by his protege and up-and-coming criminal Franklin Clinton. After his first job, he is joined by former friend Trevor Philips. Despite a rift in their friendship after several jobs, including stealing a superweapon from the government, raiding a county bank & a research lab for the FIB, they banded together with Franklin and Lester to pull off a final heist",R.drawable.michael),
    CharacterData(9,"Michael De Santa","Michael De Santa, formerly Michael Townley, is a retired bank robber, who, after making a deal with the Federal Investigation Bureau, moves alongside his family to Los Santos, where they live in a nice mansion. Unfortunately, his wife, Amanda, repeatedly spends his money and the family has became largely dysfunctional over the years. After getting on the wrong side of a Mexican Cartel leader, Michael is forced to return to criminal life once more, this time, aided by his protege and up-and-coming criminal Franklin Clinton. After his first job, he is joined by former friend Trevor Philips. Despite a rift in their friendship after several jobs, including stealing a superweapon from the government, raiding a county bank & a research lab for the FIB, they banded together with Franklin and Lester to pull off a final heist",R.drawable.michael),
)

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GistJetpackTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    AllCharacters(characters)
                }
            }
        }
    }
}
