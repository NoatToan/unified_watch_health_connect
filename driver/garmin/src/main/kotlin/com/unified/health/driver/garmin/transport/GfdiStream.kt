package com.unified.health.driver.garmin.transport

import com.unified.health.core.ble.driver.UnsupportedDeviceException
import com.unified.health.core.ble.gatt.GattCharacteristic
import com.unified.health.core.ble.gatt.GattClient
import com.unified.health.driver.garmin.GarminUuids
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.channels.ReceiveChannel

/**
 * The raw GFDI byte stream (COBS-framed messages) over whichever GATT transport the watch offers.
 * Implementations handle chunking to the ATT payload size and any per-packet prefix.
 */
internal interface GfdiStream {
    /** Stream bytes from the watch, in arrival order. Closes when the link drops. */
    val incoming: ReceiveChannel<ByteArray>

    /** Writes [data] (one or more complete COBS frames), split into link-sized packets. */
    suspend fun write(data: ByteArray)

    /** Best-effort release of protocol resources. Never throws. */
    suspend fun close()

    /** The shared Multi-Link channel when GFDI runs over one, so other ML services can be opened on it. */
    val multiLink: MultiLinkLink? get() = null
}

/**
 * Picks the GFDI transport (§2.4 [V], `ma2/a.java:342-397`): a dedicated GFDI service when the watch
 * has one, otherwise Multi-Link.
 */
internal object GfdiTransportSelector {

    suspend fun open(gatt: GattClient, scope: CoroutineScope, multiLinkClientId: Long): GfdiStream {
        dedicatedCharacteristics(gatt)?.let { (read, write) ->
            return DedicatedGfdiStream(gatt, write, gatt.subscribe(read))
        }
        if (gatt.hasService(GarminUuids.MULTI_LINK_SERVICE)) {
            return MultiLinkConnector(gatt, scope, multiLinkClientId).openGfdi()
        }
        throw UnsupportedDeviceException("No Garmin GFDI or Multi-Link service found; this watch model is not supported")
    }

    private fun dedicatedCharacteristics(gatt: GattClient): Pair<GattCharacteristic, GattCharacteristic>? {
        val services = listOf(
            Triple(GarminUuids.GFDI_V2_SERVICE, GarminUuids.GFDI_V2_READ, GarminUuids.GFDI_V2_WRITE),
            Triple(GarminUuids.GFDI_V1_SERVICE, GarminUuids.GFDI_V1_READ, GarminUuids.GFDI_V1_WRITE),
        )
        for ((service, readUuid, writeUuid) in services) {
            val read = gatt.findCharacteristic(readUuid, service) ?: continue
            val write = gatt.findCharacteristic(writeUuid, service) ?: continue
            return read to write
        }
        return null
    }
}

/** Dedicated GFDI service: the COBS stream is written as-is in ATT-sized chunks (§3.1 [V]). */
internal class DedicatedGfdiStream(
    private val gatt: GattClient,
    private val writeCharacteristic: GattCharacteristic,
    override val incoming: ReceiveChannel<ByteArray>,
) : GfdiStream {

    override suspend fun write(data: ByteArray) {
        val chunkSize = gatt.maxWriteLength
        var offset = 0
        while (offset < data.size) {
            val end = minOf(offset + chunkSize, data.size)
            gatt.write(writeCharacteristic, data.copyOfRange(offset, end))
            offset = end
        }
    }

    override suspend fun close() = Unit
}
