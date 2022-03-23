package com.meliskara.assignment4
import androidx.appcompat.app.AppCompatActivity
import android.app.DatePickerDialog
import android.os.Bundle
import android.view.View
import android.widget.TextView
import java.util.Calendar

class MainActivity : AppCompatActivity() {
    var calendar= Calendar.getInstance()
    var year= calendar.get(Calendar.YEAR)
    var month= calendar.get(Calendar.MONTH)
    var dayOfMonth= calendar.get(Calendar.DAY_OF_MONTH)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun picker(view: View){
        var result = findViewById<TextView>(R.id.result)

        val datePickerDialog = DatePickerDialog.OnDateSetListener { datePicker, Year, Month, Day -> this.year=Year
        this.month=Month+1
        this.dayOfMonth=Day
        result.setText(""+dayOfMonth+"."+month+"."+year)}
        val datePicker = DatePickerDialog(this,datePickerDialog,year,month,dayOfMonth)
        datePicker.show()

    }

}




