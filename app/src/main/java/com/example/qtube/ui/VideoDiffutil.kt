package com.example.qtube.ui

import androidx.recyclerview.widget.DiffUtil
import com.example.qtube.data.domain.Video

class VideoDiffutil(val oldList:List<Video>, val newList:List<Video>): DiffUtil.Callback(){
    override fun getOldListSize()=oldList.size
    override fun getNewListSize()=newList.size


    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return (
                oldList[oldItemPosition].texttitle==newList[newItemPosition].texttitle
                        && oldList[oldItemPosition].texttime==newList[newItemPosition].texttime
                )
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return true
    }

}