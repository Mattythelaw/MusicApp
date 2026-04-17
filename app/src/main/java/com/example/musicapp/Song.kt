package com.example.musicapp

import android.util.Log

class Song {

    //adding variables for song objects attributes
    var name: String = " "
    var artist: String = " "
    var year: Int = 0
    var duration: String = " "

    //function to play song
    fun Play() {
        Log.v("Song ", "$name is playing")

    }

    //function to pause song
    fun Pause(){
        Log.v("Song", "$name is paused")
    }

    //function to stop song
    fun Stop(){
        Log.v("Song", "$name stopped now")
    }

    //function to favourite song
    fun Favourite(): Boolean{
        Log.v("Song", "$name is favourited now")
        //return placeholder
        return true


    }


}