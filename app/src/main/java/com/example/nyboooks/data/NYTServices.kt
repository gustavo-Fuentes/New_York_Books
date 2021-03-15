package com.example.nyboooks.data

import com.example.nyboooks.data.response.BookBodyResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query


interface NYTServices {

    @GET("lists.json")
    fun getBooks(
        @Query("api-key") apiKey: String = "OqxVpOFE4SZLIIKwcNk5VUeSamv65iFn",
        @Query("list") list: String = "hardcover-fiction"
    ): Call<BookBodyResponse>

}