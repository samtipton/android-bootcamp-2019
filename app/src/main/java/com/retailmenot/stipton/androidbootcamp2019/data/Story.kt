package com.retailmenot.stipton.androidbootcamp2019.data

data class Story(
   val title: String,
   val description: String,
   val content: String,
   val author: String?,
   val url: String,
   val urlToImage: String,
   val source: Source,
   val publishedAt: String
)

data class Source(
    val id: String?,
    val name: String
)
