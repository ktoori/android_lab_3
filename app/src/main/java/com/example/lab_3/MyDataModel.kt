package com.example.lab_3

class MyDataModel(val imageResource: Int, val text: String) {
    var isImage1: Boolean = true
        private set

    fun toggleImage() {
        this.isImage1 = !this.isImage1
    }
}