package com.unified.health.core.demo.virtual.huawei

import com.unified.health.core.ble.gatt.GattClient
import com.unified.health.core.ble.scan.Advertisement
import com.unified.health.core.ble.virtual.VirtualDevice

/** Identity of the simulated Huawei watch; used by the E2E test and the virtual GATT client. */
object HuaweiVirtualDevice {
    const val ADDRESS = "02:DE:30:00:00:05"
    const val NAME = "HUAWEI WATCH GT 5 (Simulator)"
    const val MODEL = "HUAWEI WATCH GT 5 (Simulator)"
    const val FIRMWARE = "17.0.7-uhsim"
    const val SERIAL = "UHSIMHW0001"
    const val BATTERY_PERCENT = 64
}

/**
 * Advertises as a real Huawei watch (FE86 service UUID + a `HUAWEI WATCH` name, matching
 * `HuaweiDriver.recognize`/`NAME_PREFIXES`) and is reached through an in-memory GATT link instead
 * of the radio, so pairing it exercises the app's real scan → `HuaweiDriver.recognize` →
 * `HuaweiSession.open` → sync → Room pipeline (docs/DECISIONS.md D-201/D-203). Debug/test builds
 * only, gated the same way as the generic demo watch (`BuildConfig.MOCK_DEVICE`).
 */
internal class HuaweiVirtualWatch(
    override val advertisement: Advertisement = Advertisement(
        address = HuaweiVirtualDevice.ADDRESS,
        name = HuaweiVirtualDevice.NAME,
        rssi = -52,
        serviceUuids = setOf(HuaweiSimUuids.SERVICE),
    ),
) : VirtualDevice {
    override suspend fun connect(): GattClient = HuaweiVirtualGattClient(advertisement.address)
}
