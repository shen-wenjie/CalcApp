package com.example.calcapp.intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calcapp.intent.R
import kotlinx.android.synthetic.main.activity_main.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val value1 = intent.getStringExtra("VALUE1")
        val value2 = intent.getStringExtra("VALUE2")
        val value3 = intent.getStringExtra("VALUE3")

        when(value3)
        {
            "+"->{textView.text = "${value1.toFloat() + value2.toFloat()}"}
            "-"->{textView.text = "${value1.toFloat() - value2.toFloat()}"}
            "*"->{textView.text = "${value1.toFloat()* value2.toFloat()}"}
            "/"->{textView.text = "${value1.toFloat() / value2.toFloat()}"}
        }

    }
}
