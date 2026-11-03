package com.unified.health.core.ble.scan

import java.util.UUID

/**
 * Platform-neutral snapshot of what a device advertised (or what the system knows about a bonded
 * device that is not advertising, in which case only [name] and [address] are set).
 */
class Advertisement(
    val address: String,
    val name: String?,
    /** dBm; null for bonded devices that were not heard during this scan. */
    val rssi: Int?,
    val serviceUuids: Set<UUID> = emptySet(),
    /** Keyed by Bluetooth SIG company identifier. */
    val manufacturerData: Map<Int, ByteArray> = emptyMap(),
    val serviceData: Map<UUID, ByteArray> = emptyMap(),
    val isBonded: Boolean = false,
) {
    fun hasService(uuid: UUID): Boolean = uuid in serviceUuids || uuid in serviceData

    /** Case-insensitive prefix match on the advertised name. */
    fun nameStartsWith(vararg prefixes: String): Boolean =
        name != null && prefixes.any { name.startsWith(it, ignoreCase = true) }

    fun nameContains(vararg fragments: String): Boolean =
        name != null && fragments.any { name.contains(it, ignoreCase = true) }

    override fun toString(): String = "Advertisement($address, $name, rssi=$rssi, services=$serviceUuids, " +
        "manufacturers=${manufacturerData.keys.map { "0x%04X".format(it) }})"
}
