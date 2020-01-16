package com.example.carloancalculate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val price:String = careditText.text.toString()
        val payment:String = downpeditText2.text.toString()
        val rate:String = inteditText3.text.toString()
        val period:String = loanpeditText4.text.toString()

        val carPrice:Double = price.toDouble()
        val downPayment:Double = payment.toDouble()
        val interestRate:Double = rate.toDouble()
        val loanPeriod:Double = period.toDouble()

        btnCal.setOnClickListener() {
        val carLoan:Double = carPrice - downPayment
        val Interest:Double = (carPrice*downPayment) * interestRate * loanPeriod
        val monthlyRepayment:Double = (carLoan + Interest)/loanPeriod/12

        cartxt.text = "%.2f".format(carLoan)
        inttxt.text = "%.2f".format(Interest)
        montxt.text = "%.2f".format(monthlyRepayment)
}
    }
}
