package com.example.musicapp

import android.util.Log

class Song (songName: String, songArtist: String, songYear: Int, songDuration: String){

    //adding variables for song objects attributes
    var name: String = " "
    var artist: String = " "
    var year: Int = 0
    var duration: String = " "

    // Secondary constructor 1 - user does not know the artist name but knows the year
    constructor(songName: String, songYear: Int, songDuration: String)
            : this(songName, "Unknown Artist", songYear, songDuration)

    //added another secondary constructor to accomodate for artist name or year if not shown
    constructor(songName: String, songDuration: String, placeholder: Boolean)
            : this(songName, "Unknown Artist", 0, songDuration)


    //initializing the variables/attributes for the song objects//
    init{
        name = songName
        artist = songArtist
        year = songYear
        duration = songDuration
    }

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
        Log.v("Song", "$name is  favourited now")
        //return placeholder
        return true
    }
    fun DisplaySongs( ) : String{
        return "$name - $artist ($duration)"
    }
}