package com.unified.health.core.demo.virtual.huawei

import com.unified.health.core.ble.gatt.GattClient
import com.unified.health.core.ble.scan.Advertisement
import com.unified.health.core.ble.virtual.VirtualDevice

/** Identity of the simulated no-app-auth Huawei watch; used by the E2E test and the virtual GATT client. */
object HuaweiVirtualDevice {
    const val ADDRESS = "02:DE:30:00:00:05"
    const val NAME = "HUAWEI WATCH GT 5 (Simulator)"
    const val MODEL = "HUAWEI WATCH GT 5 (Simulator)"
    const val FIRMWARE = "17.0.7-uhsim"
    const val SERIAL = "UHSIMHW0001"
    const val BATTERY_PERCENT = 64

    /** TLV 5 authenticVersion 0 = the vendor's "no app auth" branch (`cke.java:60-65`). */
    const val AUTH_VERSION = 0
    const val AUTH_TYPE = 0
}

/**
 * A simulated modern Huawei watch that reports a non-zero authenticVersion and authType 2
 * (HiChainLite), i.e. the case where direct BLE needs Huawei's app-level authentication. Production
 * binds no authenticator for it, so pairing it must fail fast with the driver's clear
 * `UnsupportedDeviceException` instead of attempting CAK/HiChain.
 */
object HuaweiAuthRequiredVirtualDevice {
    const val ADDRESS = "02:DE:30:00:00:06"
    const val NAME = "HUAWEI WATCH GT 5 (Simulator, auth required)"
    const val AUTH_VERSION = 3
    const val AUTH_TYPE = 2
}

/**
 * Advertises as a real Huawei watch (FE86 service UUID + a `HUAWEI WATCH` name, matching
 * `HuaweiDriver.recognize`/`NAME_PREFIXES`) and is reached through an in-memory GATT link instead
 * of the radio, so pairing it exercises the app's real scan → `HuaweiDriver.recognize` →
 * `HuaweiSession.open` → sync → Room pipeline (docs/DECISIONS.md D-201/D-203). Debug/test builds
 * only, gated the same way as the generic demo watch (the "Demo mode" switch, see `HuaweiVirtualModule`).
 */
internal class HuaweiVirtualWatch(
    private val address: String = HuaweiVirtualDevice.ADDRESS,
    private val name: String = HuaweiVirtualDevice.NAME,
    private val authVersion: Int = HuaweiVirtualDevice.AUTH_VERSION,
    private val authType: Int = HuaweiVirtualDevice.AUTH_TYPE,
    override val advertisement: Advertisement = Advertisement(
        address = address,
        name = name,
        rssi = -52,
        serviceUuids = setOf(HuaweiSimUuids.SERVICE),
    ),
) : VirtualDevice {
    override suspend fun connect(): GattClient = HuaweiVirtualGattClient(address, authVersion, authType)
}
