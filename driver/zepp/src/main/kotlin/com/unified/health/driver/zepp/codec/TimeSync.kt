package com.unified.health.driver.zepp.codec

import com.unified.health.core.ble.protocol.buildBytes
import java.time.Instant
import java.time.LocalDateTime
import java.time.ZoneId

/**
 * Current Time (`2A2B`) payload written once after auth (§4 step 7: `HMBaseBleDevice.java:186`,
 * `profile/base/ProfileUtils.java:42-58` [V]). Huami's own 11-byte layout is the Bluetooth SIG
 * Current Time characteristic's 10 bytes plus one trailing timezone-key byte:
 *
 * `[year u16 LE, month, day, hour, min, sec, dayOfWeek, fraction, adjustReason, tzKey]`
 *
 * `dayOfWeek` is 0 = Sunday ([V], unlike the SIG characteristic's 1 = Monday). The vendor fills
 * `fraction` with milliseconds / 4 and `adjustReason` with 8 (`CTS_AR_CHANGE_OF_DST`) while the
 * zone is in daylight saving time, 0 otherwise (`ProfileUtils.java:49,57-58`). `tzKey` reuses
 * [GdspCodec.timezoneKey] (§6.1), the same quarter-hour encoding GDSP uses.
 */
internal object TimeSync {
    const val PAYLOAD_SIZE = 11

    /** `AdjustReason.CTS_AR_CHANGE_OF_DST` [V]. */
    const val ADJUST_REASON_DST = 0x08

    fun encode(now: Instant, zone: ZoneId): ByteArray {
        val offset = zone.rules.getOffset(now)
        val local = LocalDateTime.ofInstant(now, offset)
        // Java: Monday=1..Sunday=7. Huami: Sunday=0..Saturday=6 (§4 step 7 [V]).
        val huamiDayOfWeek = local.dayOfWeek.value % 7
        return buildBytes(PAYLOAD_SIZE) {
            u16le(local.year)
            u8(local.monthValue)
            u8(local.dayOfMonth)
            u8(local.hour)
            u8(local.minute)
            u8(local.second)
            u8(huamiDayOfWeek)
            u8(now.nano / 1_000_000 / 4) // milliseconds / 4 (`ProfileUtils.java:49` [V]).
            u8(if (zone.rules.isDaylightSavings(now)) ADJUST_REASON_DST else 0) // `ProfileUtils.java:57` [V].
            u8(GdspCodec.timezoneKey(offset.totalSeconds))
        }
    }
}
