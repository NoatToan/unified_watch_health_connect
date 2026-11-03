package com.unified.health.core.ble.driver

import com.unified.health.core.ble.scan.Advertisement
import com.unified.health.core.model.WearableVendor
import javax.inject.Inject
import javax.inject.Singleton

/** All drivers contributed via Hilt multibinding, indexed by vendor. */
@Singleton
class DriverRegistry @Inject constructor(
    drivers: Set<@JvmSuppressWildcards WearableDriver>,
) {

    private val byVendor: Map<WearableVendor, WearableDriver> = drivers.associateBy { it.vendor }.also {
        require(it.size == drivers.size) { "Two drivers registered for the same vendor: ${drivers.map { d -> d.vendor }}" }
    }

    val vendors: Set<WearableVendor> get() = byVendor.keys

    operator fun get(vendor: WearableVendor): WearableDriver? = byVendor[vendor]

    /** Best matching vendor for [advertisement], or null when no driver claims it. */
    fun identify(advertisement: Advertisement): WearableVendor? =
        byVendor.values
            .map { it to it.recognize(advertisement) }
            .filter { (_, score) -> score > RecognitionScore.NONE }
            .maxByOrNull { (_, score) -> score }
            ?.first?.vendor
}
