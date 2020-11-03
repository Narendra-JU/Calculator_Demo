package com.example.a06_lastname_firstname

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception

const val TAG="TAG"

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var isAdd:Boolean=false
        var isSub:Boolean=false
        var isMul:Boolean=false
        var isDiv:Boolean=false
        var isSecondNo:Boolean=false
        var num1:Float= 0F
        var num2:Float= 0F
        var result:Float=0F
        var str:String=""

        button1.setOnClickListener {displaytext.setText("${displaytext.text}1" )
            if(!isSecondNo)
                str=str+"1"
        }
        button2.setOnClickListener {displaytext.setText("${displaytext.text}2" )
            if(!isSecondNo)
            str=str+"2"}
        button3.setOnClickListener {displaytext.setText("${displaytext.text}3" )
            if(!isSecondNo)
            str=str+"3"}
        button4.setOnClickListener {displaytext.setText("${displaytext.text}4" )
            if(!isSecondNo)
            str=str+"4"}
        button5.setOnClickListener {displaytext.setText("${displaytext.text}5" )
            if(!isSecondNo)
            str=str+"5"}
        button6.setOnClickListener {displaytext.setText("${displaytext.text}6" )
            if(!isSecondNo)
            str=str+"6"}
        button7.setOnClickListener {displaytext.setText("${displaytext.text}7" )
            if(!isSecondNo)
            str=str+"7"}
        button8.setOnClickListener {displaytext.setText("${displaytext.text}8" )
            if(!isSecondNo)
            str=str+"8"}
        button9.setOnClickListener {displaytext.setText("${displaytext.text}9" )
            if(!isSecondNo)
            str=str+"9"}
        button0.setOnClickListener {displaytext.setText("${displaytext.text}0" )
            if(!isSecondNo)
            str=str+"0"}
        buttonDot.setOnClickListener {displaytext.setText("${displaytext.text}." )
            if(!isSecondNo)
            str=str+"."}

        buttonadd.setOnClickListener {
            try{
            num1=displaytext.text.toString().toFloat()
            isAdd=true
            displaytext.setText("${displaytext.text}+")
            str=str+"+"
            isSecondNo=true}catch (e:Exception){
                displaytext.setBackgroundColor(Color.parseColor("#FF0000"))
                displaytext.setText("0")
            }

        }
        buttonsub.setOnClickListener {
            try{
            num1=displaytext.text.toString().toFloat()
            isSub=true
            displaytext.setText("${displaytext.text}-")
            str=str+"-"
            isSecondNo=true}catch (e:Exception){
                displaytext.setBackgroundColor(Color.parseColor("#FF0000"))
                displaytext.setText("0")
            }

        }
        buttonmul.setOnClickListener {
            try{
            num1=displaytext.text.toString().toFloat()
            isMul=true
            displaytext.setText("${displaytext.text}*")
            str=str+"*"
            isSecondNo=true}catch (e:Exception){
                displaytext.setBackgroundColor(Color.parseColor("#FF0000"))
                displaytext.setText("0")
            }

        }
        buttondiv.setOnClickListener {
            try{
            num1=displaytext.text.toString().toFloat()
            isDiv=true
            displaytext.setText("${displaytext.text}/")
            str=str+"/"
            isSecondNo=true}catch (e:Exception){
                displaytext.setBackgroundColor(Color.parseColor("#FF0000"))
                displaytext.setText("0")
            }

        }

        buttoneql.setOnClickListener {
            Log.d(TAG, "onCreate: ${displaytext.getText().removePrefix(str)}")
            num2=displaytext.getText().removePrefix(str).toString().toFloat()
            Log.d(TAG, "onCreate: $num2")
            try {
                if (isAdd){
                    result=num1+num2
                    displaytext.setText(result.toString())
                    isAdd=false
                    str=""
                }
                if (isSub){
                    result=num1-num2
                    displaytext.setText(result.toString())
                    isSub=false
                    str=""
                }
                if (isMul){
                    result=num1*num2
                    displaytext.setText(result.toString())
                    isMul=false
                    str=""
                }
                if (isDiv){
                    result=num1/num2
                    displaytext.setText(result.toString())
                    isDiv=false
                    str=""
                }

                if (result<0){
                    displaytext.setBackgroundColor(Color.parseColor("#000000"))
                    displaytext.setTextColor(Color.parseColor("#FFFFFF"))
                }
                isSecondNo=false
            }catch (e:Exception){
                displaytext.setBackgroundColor(Color.parseColor("#FF0000"))
                displaytext.setText("0")

            }
            buttonDel.setOnClickListener {
                displaytext.setText("")
                displaytext.setBackgroundColor(Color.parseColor("#ecf0f1"))
                displaytext.setTextColor(Color.parseColor("#000000"))
                str=""
                isSecondNo=false
                isAdd=false
                isSub=false
                isMul=false
                isDiv=false


            }


        }








    }
}