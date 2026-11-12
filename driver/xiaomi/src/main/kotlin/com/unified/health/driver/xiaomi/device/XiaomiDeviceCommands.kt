package com.unified.health.driver.xiaomi.device

import com.unified.health.driver.xiaomi.proto.S7r
import com.unified.health.driver.xiaomi.proto.Swo
import com.unified.health.driver.xiaomi.proto.Txo
import com.unified.health.driver.xiaomi.proto.Vwo
import com.unified.health.driver.xiaomi.proto.Wxo
import com.unified.health.driver.xiaomi.transport.XiaomiLink
import java.time.Instant
import java.time.ZoneId
import java.util.TimeZone

/** Battery level + optional charge info (protocol §9.2 [V], `vwo`). */
internal data class XiaomiBattery(
    val percent: Int?,
    val chargeStatus: Int?,
    val chargeState: Int?,
    val chargeTimestamp: Instant?,
)

/** Watch identity (protocol §9.2 [V], `swo`). */
internal data class XiaomiWatchInfo(
    val serialNumber: String?,
    val firmwareVersion: String?,
    val model: String?,
)

/**
 * System commands, `e = 2` (protocol §9.2 [V]): battery (`f=1`), watch info (`f=2`) and set time
 * (`f=3`, best-effort -- the vendor marks it `needResponse=false`, so [setTime] uses
 * [XiaomiLink.send] and never waits for an answer).
 */
internal object XiaomiDeviceCommands {
    private const val CLASS_SYSTEM = S7r.CLASS_SYSTEM
    private const val F_BATTERY = 1
    private const val F_WATCH_INFO = 2
    private const val F_SET_TIME = 3

    /** Vendor timeout for the battery query (protocol §9.2 [V]). */
    const val BATTERY_TIMEOUT_MS = 6_000L

    /** No vendor timeout documented for watch info; same order of magnitude as battery [I]. */
    const val WATCH_INFO_TIMEOUT_MS = 6_000L

    /** Vendor timeout mentioned for the (best-effort, unanswered) set-time write (protocol §9.2 [V]). */
    const val SET_TIME_TIMEOUT_MS = 3_000L

    /** @throws com.unified.health.core.ble.driver.WearableProtocolException on a timeout or device error. */
    suspend fun readBattery(link: XiaomiLink): XiaomiBattery {
        val response = link.request(CLASS_SYSTEM, F_BATTERY, payload = null, timeoutMs = BATTERY_TIMEOUT_MS)
        val vwo = response.txo?.let { Txo.decode(it).vwo }?.let { Vwo.decode(it) } ?: Vwo()
        return XiaomiBattery(
            percent = vwo.batteryPercent,
            chargeStatus = vwo.chargeStatus,
            chargeState = vwo.chargeState,
            chargeTimestamp = vwo.chargeTimestampSeconds?.let { Instant.ofEpochSecond(it) },
        )
    }

    /** @throws com.unified.health.core.ble.driver.WearableProtocolException on a timeout or device error. */
    suspend fun readWatchInfo(link: XiaomiLink): XiaomiWatchInfo {
        val response = link.request(CLASS_SYSTEM, F_WATCH_INFO, payload = null, timeoutMs = WATCH_INFO_TIMEOUT_MS)
        val swo = response.txo?.let { Txo.decode(it).swo }?.let { Swo.decode(it) } ?: Swo()
        return XiaomiWatchInfo(swo.serialNumber, swo.firmwareVersion, swo.model)
    }

    /**
     * Best-effort set time/date/timezone; the device never answers this command (protocol §9.2
     * [V]), so a failed write is the only way this can fail -- there is no response to time out on.
     */
    suspend fun setTime(link: XiaomiLink, instant: Instant, zone: ZoneId, is24HourFormat: Boolean = true) {
        val wxo = toWxo(instant, zone, is24HourFormat)
        val txo = Txo(wxo = wxo.encode()).encode()
        link.send(CLASS_SYSTEM, F_SET_TIME, txo)
    }

    /**
     * Protocol §9.2 [V]: "Offsets are `TimeZone.getRawOffset()/15min` and `getDSTSavings()/15min`".
     * This is a literal transliteration of those two `java.util.TimeZone` methods (both zone
     * constants, not adjusted for whether DST is in effect right now).
     *
     * TODO(xiaomi-protocol): verify on a real watch whether it expects [dstOffset15min]-equivalent
     * as this constant "DST savings amount" or as "0 unless DST is active for `instant`" -- the doc
     * names the two getters above but does not say which semantics the firmware assumes.
     */
    private fun toWxo(instant: Instant, zone: ZoneId, is24HourFormat: Boolean): Wxo {
        val zdt = instant.atZone(zone)
        val timeZone = TimeZone.getTimeZone(zone)
        return Wxo(
            year = zdt.year,
            month = zdt.monthValue,
            day = zdt.dayOfMonth,
            hour = zdt.hour,
            minute = zdt.minute,
            second = zdt.second,
            millis = zdt.nano / 1_000_000,
            utcOffset15min = timeZone.rawOffset / MILLIS_PER_15_MIN,
            dstOffset15min = timeZone.dstSavings / MILLIS_PER_15_MIN,
            tzId = zone.id,
            is24HourFormat = is24HourFormat,
        )
    }

    private const val MILLIS_PER_15_MIN = 15 * 60 * 1000
}
