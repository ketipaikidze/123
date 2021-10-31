package com.example.a2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var resultTextView: TextView
    private var operand: Int = 0
    private var operation:String = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        resultTextView = findViewById(R.id.resultTextView)
    }
    fun numberClick (View:View){
        if (View is TextView) {
            val number: String = View.text.toString()
            val resultText: String = resultTextView.text.toString()
            resultTextView.text = resultText + number
        }

    }
    fun operationClick(View: View){
        if (View is TextView) {
            var result:String = resultTextView.text.toString()
            if(result.isNotEmpty()){
                this.operand = result.toInt()
            }
            resultTextView.text = ""
            this.operation = View.text.toString()


            }

        }
    fun equalsClick(View: View){
        val secOperandText:String = resultTextView.text.toString()
        var secOperand: Int = 0
        if(secOperandText.isNotEmpty()){
            secOperand = secOperandText.toInt()
        }
        when(this.operation){
            "+" -> resultTextView.text = (operand + secOperand).toString()
            "-" -> resultTextView.text = (operand - secOperand).toString()
            "*" -> resultTextView.text = (operand * secOperand).toString()
            "/" -> resultTextView.text = (operand / secOperand).toString()
            "-/+" -> resultTextView.text = (operand * (-1)).toString()


    }
        fun deleteClick(view: View){
            if (view is TextView){
                val resultText: String = resultTextView.text.toString()
                resultTextView.text = "0"
            }
        }




}

    fun deleteClick(view: View) {}
}