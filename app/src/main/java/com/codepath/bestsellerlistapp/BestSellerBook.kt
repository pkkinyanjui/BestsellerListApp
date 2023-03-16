package com.codepath.bestsellerlistapp

import com.google.gson.annotations.SerializedName

/**
 * The Model for storing a single book from the NY Times API
 *
 * SerializedName tags MUST match the JSON response for the
 * object to correctly parse with the gson library.
 */
class BestSellerBook {

    @JvmField
    @SerializedName("original_title")
    var title: String? = null

    //TODO bookImageUrl
    @SerializedName("poster_path")
    var imageURL: String? = null

    //TODO description
    @SerializedName("overview")
    var description: String? = null

}