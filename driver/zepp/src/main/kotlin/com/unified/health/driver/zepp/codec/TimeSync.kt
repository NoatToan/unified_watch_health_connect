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
 * `[year u16 LE, month, day, hour, min, sec, dayOfWeek, fraction256, adjustReason, tzKey]`
 *
 * `dayOfWeek` is 0 = Sunday ([V], unlike the SIG characteristic's 1 = Monday). The source shows
 * the layout but not the values the vendor app fills `fraction256`/`adjustReason` with
 * (`ProfileUtils.java:42-58` was not fully read, §9); both are sent as 0 ([I]: "exact time, no
 * reason flags"), which a watch following the SIG semantics treats as "reason unknown", not a
 * rejection. `tzKey` reuses [GdspCodec.timezoneKey] (§6.1), the same quarter-hour encoding GDSP uses.
 */
internal object TimeSync {
    const val PAYLOAD_SIZE = 11

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
            u8(0) // fraction256: value not given by the source [I], see class doc.
            u8(0) // adjustReason: value not given by the source [I], see class doc.
            u8(GdspCodec.timezoneKey(offset.totalSeconds))
        }
    }
}
