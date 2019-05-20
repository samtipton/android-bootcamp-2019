package com.retailmenot.stipton.androidbootcamp2019

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.retailmenot.stipton.androidbootcamp2019.data.Source
import com.retailmenot.stipton.androidbootcamp2019.data.Story
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val story = Story(
        title = "Bitcoin Price Hits All-Time Highs in These Countries, Thanks to Crippling Fiat Currencies",
        description = "By CCN: If you thought bitcoin’s recovery to $8,000 was impressive, take a look at these charts below. While most traders are focused on bitcoin’s price in dollars, the recent surge has propelled bitcoin to all-time highs in Argentina and Sudan’s local curren…",
        content = "By CCN: If you thought bitcoins recovery to $8,000 was impressive, take a look at these charts below. While most traders are focused on bitcoins price in dollars, the recent surge has propelled bitcoin to all-time highs in Argentina and Sudans local currencie… [+3983 chars]",
        author = "Ben Brown",
        url = "https://www.ccn.com/bitcoin-price-rockets-all-time-highs-countries-crippling-fiat",
        urlToImage = "https://www.ccn.com/wp-content/uploads/2019/05/pjimage-44.jpg",
        source = Source("crypto-coins-news", "Crypto Coins News"),
        publishedAt = "2019-05-20T13:13:43Z"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // inflate layout
        setContentView(R.layout.activity_main)

        title_text.text = story.title
        // todo bind text data to other views

        // load image behind url and bind to ImageView using glide library
        Glide.with(this)
            .load(story.urlToImage)
            .into(story_image)

        // todo launch an intent to open url in browser
    }
}
