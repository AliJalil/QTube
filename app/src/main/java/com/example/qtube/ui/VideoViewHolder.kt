package com.example.qtube.ui

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.qtube.R

class VideoViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView) {
    val Title=itemView.findViewById<TextView>(R.id.title)
    val Option=itemView.findViewById<TextView>(R.id.options)
    val Time1=itemView.findViewById<TextView>(R.id.time)
    val imageprovile=itemView.findViewById<ImageView>(R.id.profile)
    val imagemain=itemView.findViewById<ImageView>(R.id.main_image)
    val imageplay=itemView.findViewById<ImageView>(R.id.play)

}