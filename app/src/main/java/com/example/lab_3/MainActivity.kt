package com.example.lab_3

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var my_recycler_view: RecyclerView
    lateinit var textHeader: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textHeader = findViewById(R.id.textHeader)
        my_recycler_view = findViewById(R.id.my_recycler_view)
        my_recycler_view.layoutManager = LinearLayoutManager(this)

        val datalist = listOf(
            MyDataModel(R.drawable.realism, "Реализм"),
            MyDataModel(R.drawable.impres, "Импрессионизм"),
            MyDataModel(R.drawable.express, "Экспрессионизм"),
            MyDataModel(R.drawable.surreal, "Сюрреализм"),
            MyDataModel(R.drawable.a_express, "Абстрактный экспрессионизм"),
            MyDataModel(R.drawable.pop_art, "Поп-арт"),
            MyDataModel(R.drawable.kubism, "Кубизм"),
            MyDataModel(R.drawable.fovism, "Фовизм"),
            MyDataModel(R.drawable.puantilism, "Пуантилизм"),
            MyDataModel(R.drawable.barokko, "Барокко"),
            MyDataModel(R.drawable.rokoko, "Рококо"),
            MyDataModel(R.drawable.renesans, "Ренессанс"),
            MyDataModel(R.drawable.romantism, "Романтизм"),
            MyDataModel(R.drawable.neoklass, "Неоклассицизм"),
            MyDataModel(R.drawable.minimalism, "Минимализм"),
            MyDataModel(R.drawable.modern, "Ар-нуво"),
            MyDataModel(R.drawable.post_impress, "Постимпрессионизм"),
            MyDataModel(R.drawable.abstractcionism, "Абстрактное искусство"),
            MyDataModel(R.drawable.constructiv, "Конструктивизм"),
            MyDataModel(R.drawable.op_art, "Оп-арт")
        )

        val adapter = CustomAdapter(datalist)

        my_recycler_view.adapter = adapter
    }
}