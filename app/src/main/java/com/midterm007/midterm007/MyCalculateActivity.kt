package com.midterm007.midterm007

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_my_calculate.*

class MyCalculateActivity : AppCompatActivity(),View.OnClickListener {

    override fun onClick(view: View?) {

        val btnClick:Button = view as Button

        if(view == btnC)
        {
            tvShow?.text = "0"
        }
        else if(view == btnAdd || view == btnMinus|| view == btnMulti|| view == btnDiv)
        {
            num1 = tvShow?.text.toString().toInt()
            tvShow?.text = "0"
            tag = btnClick.tag.toString().toInt()
        }
        else if(view == btnAnswer)
        {
            if(tag==1)
            {
                val sum = num1+tvShow?.text.toString().toInt()
                tvShow?.text = ""+sum
            }
            else if(tag==2)
            {
                val sum = num1-tvShow?.text.toString().toInt()
                tvShow?.text = ""+sum
            }
            else if(tag==3)
            {
                val sum = num1*tvShow?.text.toString().toInt()
                tvShow?.text = ""+sum
            }
            else
            {
                val sum = num1/tvShow?.text.toString().toInt()
                tvShow?.text = ""+sum
            }
        }
        else
        {
            if(tvShow?.text.toString() == "0")
            {
                tvShow?.text = btnClick.text.toString()
            }
            else
            {
                val text = tvShow?.text.toString()+btnClick.text.toString()
                tvShow?.text = text
            }
        }
    }

    var tvShow:TextView? = null
    var btn0:Button? = null
    var btn1:Button? = null
    var btn2:Button? = null
    var btn3:Button? = null
    var btn4:Button? = null
    var btn5:Button? = null
    var btn6:Button? = null
    var btn7:Button? = null
    var btn8:Button? = null
    var btn9:Button? = null
    var btnC:Button? = null

    var btnAdd:Button? = null
    var btnMinus:Button? = null
    var btnX:Button? = null
    var btnDiv:Button? = null
    var btnAnswer:Button? = null

    var num1 = 0
    var tag = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_calculate)

        //init
        tvShow = findViewById(R.id.tvShow)
        btn1 = findViewById(R.id.btn1)
        btn2 = findViewById(R.id.btn2)
        btn3 = findViewById(R.id.btn3)
        btn4 = findViewById(R.id.btn4)
        btn5 = findViewById(R.id.btn5)
        btn6 = findViewById(R.id.btn6)
        btn7 = findViewById(R.id.btn7)
        btn8 = findViewById(R.id.btn8)
        btn9 = findViewById(R.id.btn9)
        btn0 = findViewById(R.id.btn0)
        btnC = findViewById(R.id.btnC)
        btnAdd = findViewById(R.id.btnAdd)
        btnMinus = findViewById(R.id.btnMInus)
        btnX = findViewById(R.id.btnMulti)
        btnDiv = findViewById(R.id.btnDiv)
        btnAnswer = findViewById(R.id.btnAnswer)

        btn1?.setOnClickListener(this)
        btn2?.setOnClickListener(this)
        btn3?.setOnClickListener(this)
        btn4?.setOnClickListener(this)
        btn5?.setOnClickListener(this)
        btn6?.setOnClickListener(this)
        btn7?.setOnClickListener(this)
        btn8?.setOnClickListener(this)
        btn9?.setOnClickListener(this)
        btn0?.setOnClickListener(this)
        btnC?.setOnClickListener(this)
        btnAdd?.setOnClickListener(this)
        btnMinus?.setOnClickListener(this)
        btnX?.setOnClickListener(this)
        btnDiv?.setOnClickListener(this)
        btnAnswer?.setOnClickListener(this)
    }
}
