package com.example.nyboooks.data.response

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BookDetails (
    val title: String,
    val author: String,
    val description: String
)