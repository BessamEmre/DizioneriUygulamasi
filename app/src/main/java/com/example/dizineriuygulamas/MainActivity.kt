package com.example.dizineriuygulamas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var imgSeries : ImageView = findViewById(R.id.imgSeries)
        var textSeries : TextView = findViewById(R.id.textSeries)
        var buttonA : Button = findViewById(R.id.buttonA)
        var buttonS : Button = findViewById(R.id.buttonS)
        var buttonAK : Button = findViewById(R.id.buttonAK)
        buttonA.setOnClickListener{
            var randomSayi =(1..4).random()

            when(randomSayi){
                1-> {imgSeries.setImageResource(R.drawable.bojack) ; textSeries.text="Bojack Horseman"}
                2-> {imgSeries.setImageResource(R.drawable.southpark) ; textSeries.text="South Park"}
                3-> {imgSeries.setImageResource(R.drawable.simpsons) ; textSeries.text="The Simpsons"}
                4-> {imgSeries.setImageResource(R.drawable.rickandmorty) ; textSeries.text="Rick And Morty"}


            }
        }
        buttonS.setOnClickListener{
            var randomSayi2 =(1..3).random()

            when(randomSayi2){

                1-> {imgSeries.setImageResource(R.drawable.b99) ; textSeries.text="Brooklyn-99"}
                2-> {imgSeries.setImageResource(R.drawable.office) ; textSeries.text="The Office"}
                3-> {imgSeries.setImageResource(R.drawable.himym) ; textSeries.text="How I Met Your Mother"}








            }
        }
        buttonAK.setOnClickListener{
            var randomSayi3 = (1..4).random()

            when(randomSayi3){

                1-> {imgSeries.setImageResource(R.drawable.punisher) ; textSeries.text="The Punisher"}
                2-> {imgSeries.setImageResource(R.drawable.twd) ; textSeries.text="The Walking Dead"}
                3-> {imgSeries.setImageResource(R.drawable.witcher) ; textSeries.text="The Witcher"}
                4-> {imgSeries.setImageResource(R.drawable.swat) ; textSeries.text="SWAT"}
            }
        }
    }
}

