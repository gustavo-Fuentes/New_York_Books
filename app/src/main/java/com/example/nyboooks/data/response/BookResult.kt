package com.example.nyboooks.data.response

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BookResult (
    @Json(name = "book_details")
    val bookDetails: List<BookDetails>
)