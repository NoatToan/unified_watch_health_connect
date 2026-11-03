package com.unified.health.core.model

/** The watch is showing a pairing code that the user has to type into the phone. */
data class PairingCodeRequest(
    val deviceName: String,
    val address: String,
    val maxLength: Int,
)
