package com.unified.health.core.demo.virtual

import com.unified.health.core.ble.gatt.GattCharacteristic
import com.unified.health.core.ble.gatt.GattCharacteristic.Companion.PROPERTY_NOTIFY
import com.unified.health.core.ble.gatt.GattCharacteristic.Companion.PROPERTY_READ
import com.unified.health.core.ble.gatt.GattCharacteristic.Companion.PROPERTY_WRITE
import com.unified.health.core.ble.gatt.GattCharacteristic.Companion.PROPERTY_WRITE_NO_RESPONSE
import com.unified.health.core.ble.gatt.GattClient
import com.unified.health.core.ble.gatt.StandardUuids
import com.unified.health.core.ble.gatt.sigUuid
import com.unified.health.core.ble.scan.Advertisement
import com.unified.health.core.ble.virtual.VirtualDevice
import java.util.UUID

/**
 * Wire identity of the simulated Zepp/Amazfit watch: GATT UUIDs per `docs/protocols/ZEPP_DEVICE_PROTOCOL.md`
 * §3.1 (the Huami 128-bit base, FEE0/FEE1 services, GDSP 0x0004/0x0005, legacy auth 0x0009) plus the
 * Bluetooth SIG Device Information / Battery / Heart Rate / Current Time services real Huami
 * watches also expose. See `docs/DECISIONS.md` D-5xx for why this simulates the **legacy** auth
 * path (§5.5) rather than the Zepp OS channel/ECDH path (§5.2): it is a real, still-supported Zepp
 * protocol variant (older Mi Band / Amazfit Bip-class watches) that needs only AES-ECB, not a
 * from-scratch sect163r2 ECDH implementation outside `:driver:zepp`'s internal codec.
 */
internal object ZeppWireProtocol {
    /** Huami's own 128-bit base UUID, `0000xxxx-0000-3512-2118-0009af100700` (§3.1 [V]). */
    fun huamiUuid(shortId: Int): UUID = UUID.fromString("%08x-0000-3512-2118-0009af100700".format(shortId))

    val SERVICE_MILI: UUID = sigUuid(0xFEE0)
    val SERVICE_MILI_SECONDARY: UUID = sigUuid(0xFEE1)
    val LEGACY_AUTH: UUID = huamiUuid(0x0009)
    val GDSP_CONTROL: UUID = huamiUuid(0x0004)
    val GDSP_DATA: UUID = huamiUuid(0x0005)
    val HR_CONTROL: UUID = sigUuid(0x2A39)

    /** Bluetooth SIG company id registered to Huami (§2.1 [Ext]). */
    const val HUAMI_COMPANY_ID = 0x0157
}

/** Identity shown in the UI; a fixed seed so the E2E screenshots and assertions are deterministic. */
object ZeppVirtualWatchIdentity {
    const val ADDRESS = "D4:F5:13:00:00:09"
    const val NAME = "Amazfit GTR 4 Mini"
    const val MODEL = "Amazfit GTR 4 Mini"
    const val FIRMWARE = "4.2.1.0"
    const val SERIAL = "ZV00000009"
    const val BATTERY_PERCENT = 76

    fun advertisement(): Advertisement = Advertisement(
        address = ADDRESS,
        name = NAME,
        rssi = -52,
        serviceUuids = setOf(ZeppWireProtocol.SERVICE_MILI),
        manufacturerData = mapOf(ZeppWireProtocol.HUAMI_COMPANY_ID to byteArrayOf(0x01)),
    )
}

/** Characteristics the simulated watch exposes, shared by the GATT client's `hasService`/`findCharacteristic`. */
internal object ZeppVirtualCharacteristics {
    val modelNumber = characteristic(StandardUuids.DEVICE_INFORMATION_SERVICE, StandardUuids.MODEL_NUMBER, PROPERTY_READ)
    val serialNumber = characteristic(StandardUuids.DEVICE_INFORMATION_SERVICE, StandardUuids.SERIAL_NUMBER, PROPERTY_READ)
    val firmwareRevision = characteristic(StandardUuids.DEVICE_INFORMATION_SERVICE, StandardUuids.FIRMWARE_REVISION, PROPERTY_READ)
    val batteryLevel = characteristic(StandardUuids.BATTERY_SERVICE, StandardUuids.BATTERY_LEVEL, PROPERTY_READ)
    val currentTime = characteristic(StandardUuids.CURRENT_TIME_SERVICE, StandardUuids.CURRENT_TIME, PROPERTY_WRITE)
    val legacyAuth = characteristic(ZeppWireProtocol.SERVICE_MILI_SECONDARY, ZeppWireProtocol.LEGACY_AUTH, PROPERTY_WRITE, PROPERTY_NOTIFY)
    val gdspControl = characteristic(ZeppWireProtocol.SERVICE_MILI, ZeppWireProtocol.GDSP_CONTROL, PROPERTY_WRITE, PROPERTY_NOTIFY)
    val gdspData = characteristic(ZeppWireProtocol.SERVICE_MILI, ZeppWireProtocol.GDSP_DATA, PROPERTY_NOTIFY)
    val hrMeasurement = characteristic(StandardUuids.HEART_RATE_SERVICE, StandardUuids.HEART_RATE_MEASUREMENT, PROPERTY_NOTIFY)
    val hrControl = characteristic(StandardUuids.HEART_RATE_SERVICE, ZeppWireProtocol.HR_CONTROL, PROPERTY_WRITE, PROPERTY_WRITE_NO_RESPONSE)

    val all = listOf(modelNumber, serialNumber, firmwareRevision, batteryLevel, currentTime, legacyAuth, gdspControl, gdspData, hrMeasurement, hrControl)

    private fun characteristic(service: UUID, uuid: UUID, vararg properties: Int): GattCharacteristic =
        GattCharacteristic(service, uuid, properties.fold(0) { acc, p -> acc or p })
}

/**
 * The simulated Zepp/Amazfit watch as seen by `:core:ble` scanning/connecting: a real device of
 * this brand to the app, so `driver.recognize` → `openSession` → `sync` run unmodified
 * (`docs/DECISIONS.md` D-203 mechanism). Debug/test builds only (see `core/demo/build.gradle.kts`).
 */
class ZeppVirtualWatch(
    override val advertisement: Advertisement = ZeppVirtualWatchIdentity.advertisement(),
) : VirtualDevice {
    override suspend fun connect(): GattClient = ZeppVirtualWatchGattClient(advertisement.address)
}
