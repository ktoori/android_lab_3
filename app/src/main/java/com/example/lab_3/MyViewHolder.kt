package com.example.lab_3

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val mTextView: TextView = itemView.findViewById(R.id.text_item)
    val mImageView: ImageView = itemView.findViewById(R.id.image_item)
    val mButtonImage: ImageView = itemView.findViewById(R.id.button_like)
}