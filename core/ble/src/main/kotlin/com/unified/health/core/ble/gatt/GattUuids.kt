package com.unified.health.core.ble.gatt

import java.util.UUID

/** Expands a 16-bit Bluetooth SIG assigned number to its 128-bit UUID. */
fun sigUuid(shortId: Int): UUID = UUID.fromString("%08x-0000-1000-8000-00805f9b34fb".format(shortId))

object StandardUuids {
    val CLIENT_CHARACTERISTIC_CONFIG: UUID = sigUuid(0x2902)

    val DEVICE_INFORMATION_SERVICE: UUID = sigUuid(0x180A)
    val MANUFACTURER_NAME: UUID = sigUuid(0x2A29)
    val MODEL_NUMBER: UUID = sigUuid(0x2A24)
    val SERIAL_NUMBER: UUID = sigUuid(0x2A25)
    val HARDWARE_REVISION: UUID = sigUuid(0x2A27)
    val FIRMWARE_REVISION: UUID = sigUuid(0x2A26)
    val SOFTWARE_REVISION: UUID = sigUuid(0x2A28)

    val BATTERY_SERVICE: UUID = sigUuid(0x180F)
    val BATTERY_LEVEL: UUID = sigUuid(0x2A19)

    val HEART_RATE_SERVICE: UUID = sigUuid(0x180D)
    val HEART_RATE_MEASUREMENT: UUID = sigUuid(0x2A37)

    val CURRENT_TIME_SERVICE: UUID = sigUuid(0x1805)
    val CURRENT_TIME: UUID = sigUuid(0x2A2B)
}
