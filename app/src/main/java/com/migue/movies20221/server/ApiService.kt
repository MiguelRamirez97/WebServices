package com.migue.movies20221.server

import com.migue.movies20221.server.model.MoviesList
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("movie/top_rated")
    suspend fun getTopRated(@Query ("api_key") apiKey: String) : MoviesList

}