package com.migue.movies20221.server.moviesrepository

import com.migue.movies20221.server.MovieDB

class MoviesRepository {

    private val apiKey = "752d7a607eebcda7cb278611c5884a14"

    suspend fun getMovies() = MovieDB.retrofit.getTopRated(apiKey)

}