package com.unified.health.driver.huawei.codec

import java.time.Instant
import java.time.ZoneOffset
import kotlin.math.abs

/** Service 0x01 (DeviceConfig) commands whose request layout is documented (HUAWEI_DEVICE_PROTOCOL.md §5). */
internal object DeviceConfigCommands {
    const val SERVICE_ID = 0x01
    const val SET_DATE_TIME = 0x05

    /**
     * 0x0105 SetDeviceDateAndTime (HUAWEI_DEVICE_PROTOCOL.md §5.3, [V] `cku.java:154-204`):
     * - TLV 1, 4 bytes: epoch seconds, big-endian, rounded to the nearest second;
     * - TLV 2, 2 bytes: UTC offset as `hours | minutes`, where a negative offset sets bit 0x80 of
     *   the hour byte (`hours + 128`).
     *
     * The app derives the sign from the whole-hour part only, so it would encode e.g. -00:30 as
     * +00:30; here the sign of the full offset is used ([I] that the watch expects this).
     * This command is sent encrypted after authentication in the app's handshake order (§5.1 step 5).
     */
    fun setDateTime(now: Instant, offset: ZoneOffset): HuaweiCommand {
        val epochSeconds = now.epochSecond + if (now.nano >= 500_000_000) 1 else 0
        val totalMinutes = offset.totalSeconds / 60
        val hours = abs(totalMinutes) / 60
        val minutes = abs(totalMinutes) % 60
        val hourByte = if (totalMinutes < 0) hours + NEGATIVE_OFFSET_BIT else hours
        return HuaweiCommand(
            SERVICE_ID,
            SET_DATE_TIME,
            listOf(
                Tlv.u32(1, epochSeconds and 0xFFFF_FFFFL),
                Tlv(2, byteArrayOf(hourByte.toByte(), minutes.toByte())),
            ),
        )
    }

    private const val NEGATIVE_OFFSET_BIT = 0x80
}
