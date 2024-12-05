package com.example.lab_3

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(private val mDataset: List<MyDataModel>) : RecyclerView.Adapter<MyViewHolder>() {

    override fun getItemCount() = mDataset.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(vh: MyViewHolder, position: Int) {
        val data = mDataset[position]
        vh.mImageView.setImageResource(data.imageResource)
        vh.mTextView.text= data.text
        vh.mButtonImage.setImageResource(if (data.isImage1) R.drawable.heart_button_off else R.drawable.heart_button_on)

        vh.mButtonImage.setOnClickListener(View.OnClickListener {
            data.toggleImage()
            notifyItemChanged(position)
        })
    }
}