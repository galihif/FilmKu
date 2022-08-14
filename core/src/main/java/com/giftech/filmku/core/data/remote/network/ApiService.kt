package com.giftech.filmku.core.data.remote.network

import com.giftech.filmku.core.data.remote.dto.GetNowPlayingDto
import com.giftech.filmku.core.data.remote.dto.GetPopularDto
import com.giftech.filmku.core.utils.Constants
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("movie/now_playing")
    suspend fun getNowPlaying(
        @Query("api_key") apiKey:String = Constants.API_KEY
    ):GetNowPlayingDto

    @GET("movie/popular")
    suspend fun getPopular(
        @Query("api_key") apiKey:String = Constants.API_KEY
    ):GetPopularDto


}