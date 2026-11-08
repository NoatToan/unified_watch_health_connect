package com.unified.health.driver.zepp

import com.unified.health.core.ble.gatt.sigUuid
import java.util.UUID

/**
 * GATT identifiers used by Zepp / Amazfit (Huami) watches.
 *
 * Section numbers refer to `ZEPP_DEVICE_PROTOCOL.md`.
 */
internal object ZeppUuids {

    /**
     * Expands a 16-bit id onto the Huami base UUID `0000xxxx-0000-3512-2118-0009af100700`
     * (§3.1 [V], `GattUtils.java:39-41, 134-136`).
     */
    fun huamiUuid(shortId: Int): UUID = UUID.fromString("%08x-0000-3512-2118-0009af100700".format(shortId))

    /** "Mili" main service, scanned for by the vendor app (§2.1, §3.1 [V]). */
    val SERVICE_MILI: UUID = sigUuid(0xFEE0)

    /** Secondary service holding the legacy auth characteristic 0x0009 (§3.1 [V]). */
    val SERVICE_MILI_SECONDARY: UUID = sigUuid(0xFEE1)

    /** GDSP control point: header requests, start/stop transfer (§3.1, §6.1 [V]). */
    val GDSP_CONTROL: UUID = huamiUuid(0x0004)

    /** GDSP data: `[seq, payload…]` notifications (§3.1, §6.1 [V]). */
    val GDSP_DATA: UUID = huamiUuid(0x0005)

    /** Legacy auth control point for watches without the channel (§3.1, §5.5 [V]). */
    val LEGACY_AUTH: UUID = huamiUuid(0x0009)

    /** Legacy battery characteristic in FEE0 (`IMiLiProProfile.UUID_CHARACTERISTIC_BATTERY` = 0x0006, §3.1 [V]). */
    val BATTERY: UUID = huamiUuid(0x0006)

    /**
     * Channel "down" link: the phone writes DATA packets here; the watch notifies ACKs and the
     * version reply on the same characteristic (§3.1, §3.3 [V]).
     */
    val CHANNEL_DOWN: UUID = huamiUuid(0x0016)

    /** Channel "up" link: the watch notifies DATA packets; the phone writes ACKs here (§3.1 [V]). */
    val CHANNEL_UP: UUID = huamiUuid(0x0017)

    /** Heart-rate control point `2A39` of the standard HR service: starts/stops realtime HR (§3.1 [V], `HMHeartRateProfile.java:24-26`). */
    val HR_CONTROL: UUID = sigUuid(0x2A39)

    /** Bluetooth SIG company identifier registered to Huami (§2.1 [Ext]; not used by the vendor app). */
    const val HUAMI_COMPANY_ID = 0x0157
}
