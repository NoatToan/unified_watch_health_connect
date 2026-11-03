package com.unified.health.core.ble.gatt

import android.util.Log
import com.unified.health.core.model.DeviceInfo
import kotlinx.coroutines.CancellationException

/**
 * Reads the Bluetooth SIG Device Information (0x180A) and Battery (0x180F) services. Every brand
 * may expose some of them, so drivers use this as a fallback for fields their protocol lacks.
 */
object StandardGattReader {

    suspend fun readDeviceInfo(gatt: GattClient): DeviceInfo = DeviceInfo(
        model = readString(gatt, StandardUuids.MODEL_NUMBER),
        firmwareVersion = readString(gatt, StandardUuids.FIRMWARE_REVISION) ?: readString(gatt, StandardUuids.SOFTWARE_REVISION),
        serialNumber = readString(gatt, StandardUuids.SERIAL_NUMBER),
        batteryPercent = readBatteryPercent(gatt),
    )

    suspend fun readBatteryPercent(gatt: GattClient): Int? {
        val c = gatt.findCharacteristic(StandardUuids.BATTERY_LEVEL, StandardUuids.BATTERY_SERVICE) ?: return null
        return readOrNull(gatt, c)?.firstOrNull()?.toInt()?.and(0xFF)?.takeIf { it in 0..100 }
    }

    suspend fun readString(gatt: GattClient, characteristic: java.util.UUID): String? {
        val c = gatt.findCharacteristic(characteristic, StandardUuids.DEVICE_INFORMATION_SERVICE) ?: return null
        return readOrNull(gatt, c)?.toString(Charsets.UTF_8)?.trim('\u0000', ' ')?.takeIf { it.isNotEmpty() }
    }

    /**
     * Parses a Heart Rate Measurement (0x2A37) value: flags bit 0 selects uint8/uint16 bpm.
     * @return bpm, or null for a malformed value or a zero reading (sensor not in contact).
     */
    fun parseHeartRateMeasurement(value: ByteArray): Int? {
        if (value.size < 2) return null
        val flags = value[0].toInt()
        val bpm = if (flags and 0x01 == 0) {
            value[1].toInt() and 0xFF
        } else {
            if (value.size < 3) return null
            (value[1].toInt() and 0xFF) or ((value[2].toInt() and 0xFF) shl 8)
        }
        return bpm.takeIf { it > 0 }
    }

    private suspend fun readOrNull(gatt: GattClient, c: GattCharacteristic): ByteArray? = try {
        gatt.read(c)
    } catch (e: CancellationException) {
        throw e
    } catch (e: GattException) {
        Log.d("StandardGattReader", "Read ${c.uuid} failed: ${e.message}")
        null
    }
}
