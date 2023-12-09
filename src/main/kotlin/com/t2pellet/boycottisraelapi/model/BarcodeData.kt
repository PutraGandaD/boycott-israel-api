package com.t2pellet.boycottisraelapi.model

import com.fasterxml.jackson.annotation.JsonAlias
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class BarcodeData (
    @JsonProperty("barcode")
    val barcode: String,
    @JsonProperty("title")
    @JsonAlias("company")
    val company: String,
    @JsonProperty("brand")
    @JsonAlias("product")
    val product: String
)