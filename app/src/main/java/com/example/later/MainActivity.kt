package com.example.later

import android.media.MediaPlayer
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    // list of Images
    val Images = intArrayOf(
        R.drawable.black,
        R.drawable.blue,
        R.drawable.green,
        R.drawable.red
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val black = 0
        val blue = 1
        val green = 2
        val red = 3

        //buttons
        val btnBlack = findViewById<Button>(R.id.btnBlack)
        val btnBlue = findViewById<Button>(R.id.btnBlue)
        val btnGreen = findViewById<Button>(R.id.btnGreen)

        val btnRed = findViewById<Button>(R.id.btnRed)
        val image : ImageView = findViewById(R.id.Image)
        val btnNext : Button = findViewById(R.id.next)
        val correctSound = MediaPlayer.create(this, R.raw.check)
        val incorrectSound = MediaPlayer.create(this, R.raw.notcorrect)

        // Next Button
        btnNext.setOnClickListener {
            val source = Random.nextInt(4)
            image.setImageResource(Images[source])
            // black color
            if (black == source){
                btnBlack.setOnClickListener {
                    correctSound.start()
                    val blackss = Toast.makeText(applicationContext,"სწორია",Toast.LENGTH_SHORT)
                    blackss.setGravity(200,0,1300)
                    blackss.show()}
                btnRed.setOnClickListener {
                    incorrectSound.start()
                    Toast.makeText(applicationContext,"არასწორია",Toast.LENGTH_SHORT).show()
                }
                btnBlue.setOnClickListener {
                    incorrectSound.start()
                    Toast.makeText(applicationContext,"არასწორია",Toast.LENGTH_SHORT).show()
                }
                btnGreen.setOnClickListener {
                    incorrectSound.start()
                    Toast.makeText(applicationContext,"არასწორია",Toast.LENGTH_SHORT).show()
                }
            }
            //blue color
            if (blue == source){
                btnBlue.setOnClickListener {
                    correctSound.start()
                    val bluesss = Toast.makeText(applicationContext,"სწორია",Toast.LENGTH_SHORT)
                    bluesss.setGravity(200,0,1300)
                    bluesss.show()}
                btnRed.setOnClickListener {
                    incorrectSound.start()
                    Toast.makeText(applicationContext,"არასწორია",Toast.LENGTH_SHORT).show()
                }
                btnBlack.setOnClickListener {
                    incorrectSound.start()
                    Toast.makeText(applicationContext,"არასწორია",Toast.LENGTH_SHORT).show()
                }
                btnGreen.setOnClickListener {
                    incorrectSound.start()
                    Toast.makeText(applicationContext,"არასწორია",Toast.LENGTH_SHORT).show()
                }
            }

            //green color
            if (green == source){
                btnGreen.setOnClickListener {
                    correctSound.start()
                    val greenss = Toast.makeText(applicationContext,"სწორია",Toast.LENGTH_SHORT)
                    greenss.setGravity(200,0,1300)
                    greenss.show()}
                btnRed.setOnClickListener {
                    incorrectSound.start()
                    Toast.makeText(applicationContext,"არასწორია",Toast.LENGTH_SHORT).show()
                }
                btnBlack.setOnClickListener {
                    incorrectSound.start()
                    Toast.makeText(applicationContext,"არასწორია",Toast.LENGTH_SHORT).show()
                }
                btnBlue.setOnClickListener {
                    incorrectSound.start()
                    Toast.makeText(applicationContext,"არასწორია",Toast.LENGTH_SHORT).show()
                }
            }
            //red color
            if (red == source){
                btnRed.setOnClickListener {
                    correctSound.start()
                    val redd = Toast.makeText(applicationContext,"სწორია",Toast.LENGTH_SHORT)
                    redd.setGravity(200,0,1300)
                    redd.show()}
                btnGreen.setOnClickListener {
                    incorrectSound.start()
                    Toast.makeText(applicationContext,"არასწორია",Toast.LENGTH_SHORT).show()
                }
                btnBlack.setOnClickListener {
                    incorrectSound.start()
                    Toast.makeText(applicationContext,"არასწორია",Toast.LENGTH_SHORT).show()
                }
                btnBlue.setOnClickListener {
                    incorrectSound.start()
                    Toast.makeText(applicationContext,"არასწორია",Toast.LENGTH_SHORT).show()
                }

            }
        }
        }
}