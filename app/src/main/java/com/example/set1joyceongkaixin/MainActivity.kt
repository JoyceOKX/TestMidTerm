package com.example.set1joyceongkaixin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import org.w3c.dom.Text
import java.util.jar.Attributes.Name

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button).setOnClickListener{
            var enterName: EditText =findViewById(R.id.editName)
            var nameView: TextView =findViewById(R.id.nameText)
            var enterCourse: Spinner = findViewById(R.id.editCourse)
            var courseView: TextView = findViewById(R.id.courseText)
            var enterScore: EditText = findViewById(R.id.editScore)
            var grade: String = ""
            var scoreView: TextView = findViewById(R.id.scoreText)
            var scoreInt: Int = enterScore.text.toString().toInt()

            nameView.text = enterName.text
            enterName.visibility = View.GONE
            nameView.visibility = View.VISIBLE

            courseView.text = enterCourse.selectedItem.toString()
            enterCourse.visibility = View.GONE
            courseView.visibility = View.VISIBLE

            if (scoreInt >= 80 ){
                grade = "A"
            }else if(scoreInt >= 75){
                grade = "A-"
            }else if(scoreInt >= 70){
                grade = "B+"
            }
            scoreView.text = "Grade" + grade

        }
    }

//    fun checkGrade(){
//
//    }
}
