package com.example.calcapp.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.calcapp.intent.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() , View.OnClickListener{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)

        button2.setOnClickListener(this)

        button3.setOnClickListener(this)

        button4.setOnClickListener(this)


    }
    override fun onClick(v: View) {
        if(editText1.text.toString()==""||editText2.text.toString()=="")
        {
            textView.text="二つの数字を全部入力してください"
        }else if (editText2.text.toString()=="0" && v.id==R.id.button4)
        {
            textView.text="/の計算する場合、二番目の欄に0を入力しないでください。"
        }else {

            val intent = Intent(this, Main2Activity::class.java)
            intent.putExtra("VALUE1", editText1.text.toString())
            intent.putExtra("VALUE2", editText2.text.toString())


            when (v.id) {
                R.id.button1 -> {
                    intent.putExtra("VALUE3", "+")
                }
                R.id.button2 -> {
                    intent.putExtra("VALUE3", "-")
                }
                R.id.button3 -> {
                    intent.putExtra("VALUE3", "*")
                }
                R.id.button4 -> {
                    intent.putExtra("VALUE3", "/")
                }
            }

            startActivity(intent)
        }
    }

}
