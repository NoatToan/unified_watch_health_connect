package com.unified.health.driver.zepp.codec

import com.unified.health.core.ble.protocol.ByteReader
import com.unified.health.core.ble.protocol.MalformedPayloadException
import com.unified.health.core.model.HealthRecord
import java.time.Instant

/**
 * Decoders for reassembled GDSP payloads (per-packet sequence bytes already stripped), §6.2.
 * They return vendor-neutral records and never throw for a single bad value; a payload whose
 * overall shape is wrong raises [MalformedPayloadException].
 */
internal object GdspRecordParsers {
    private const val SECONDS_PER_MINUTE = 60L

    /** Default activity record size: kind, intensity, steps, heart rate (`ActivityHrData`, [V]). */
    const val ACTIVITY_RECORD_SIZE = 4

    /** Extended record when the device declares it (`ActivityDataExtend`, [V]). */
    const val ACTIVITY_RECORD_SIZE_EXTENDED = 8

    private const val ACTIVITY_STEPS_OFFSET = 2
    private const val ACTIVITY_HEART_RATE_OFFSET = 3

    /** "Not measured" heart-rate markers (§6.2 [Ext]); 0 is also treated as no reading. */
    private val INVALID_HEART_RATES = setOf(0x00, 0xFE, 0xFF)

    /** SpO2 point record: timestamp u32 LE (UTC seconds) + percent (`Spo2PointData`, [V]). */
    const val SPO2_RECORD_SIZE = 5
    const val SPO2_SUPPORTED_VERSION = 1

    /**
     * Activity (type 0x01), one record per minute from [start] (§6.2 [V]). The first byte of the
     * reassembled payload is skipped (`parseData` starts at index 1; meaning [I]).
     *
     * The record size is 4, or 8 when the device declares an extended feature we cannot query; it is
     * inferred from the header's [minuteCount] ([I]) and falls back to 4 when that is inconclusive.
     */
    fun parseActivity(payload: ByteArray, start: Instant, minuteCount: Long): List<HealthRecord> {
        if (payload.size <= 1) return emptyList()
        val body = payload.size - 1
        val recordSize = activityRecordSize(body, minuteCount)
        val records = ArrayList<HealthRecord>()
        for (minute in 0 until body / recordSize) {
            val offset = 1 + minute * recordSize
            val time = start.plusSeconds(minute * SECONDS_PER_MINUTE)
            val steps = payload[offset + ACTIVITY_STEPS_OFFSET].toInt() and 0xFF
            val heartRate = payload[offset + ACTIVITY_HEART_RATE_OFFSET].toInt() and 0xFF
            if (steps > 0) records += HealthRecord.Steps(time, time.plusSeconds(SECONDS_PER_MINUTE), steps)
            if (heartRate !in INVALID_HEART_RATES) records += HealthRecord.HeartRate(time, heartRate)
        }
        return records
    }

    private fun activityRecordSize(body: Int, minuteCount: Long): Int = when {
        minuteCount > 0 && body.toLong() == minuteCount * ACTIVITY_RECORD_SIZE_EXTENDED -> ACTIVITY_RECORD_SIZE_EXTENDED
        body % ACTIVITY_RECORD_SIZE == 0 -> ACTIVITY_RECORD_SIZE
        else -> throw MalformedPayloadException("Activity payload of ${body + 1} bytes is not 1 + n × $ACTIVITY_RECORD_SIZE")
    }

    /** Outcome of [parseSpo2]: decoded points, or the payload version when it is not supported. */
    class Spo2Result(val records: List<HealthRecord.SpO2>, val unsupportedVersion: Int? = null)

    /**
     * SpO2 points (type 0x25), version 1: 5-byte records `[timestamp u32 LE, spo2 u8]` (§6.2 [V]).
     *
     * Devices with the "support version" feature prefix the payload with one version byte
     * (`HMSyncSpo2Profile.q`, [V]). We cannot query that feature, so the prefix is inferred from the
     * length ([I]): `n × 5 + 1` bytes means a version byte, `n × 5` means none.
     */
    fun parseSpo2(payload: ByteArray): Spo2Result {
        if (payload.isEmpty()) return Spo2Result(emptyList())
        val (version, body) = when (payload.size % SPO2_RECORD_SIZE) {
            0 -> SPO2_SUPPORTED_VERSION to 0
            1 -> (payload[0].toInt() and 0xFF) to 1
            else -> throw MalformedPayloadException("SpO2 payload of ${payload.size} bytes is not n × $SPO2_RECORD_SIZE (+1)")
        }
        if (version != SPO2_SUPPORTED_VERSION) return Spo2Result(emptyList(), unsupportedVersion = version)
        val reader = ByteReader(payload, start = body)
        val records = ArrayList<HealthRecord.SpO2>()
        while (reader.hasRemaining) {
            val timestamp = reader.u32le()
            val percent = reader.u8()
            if (timestamp > 0 && percent in 1..100) records += HealthRecord.SpO2(Instant.ofEpochSecond(timestamp), percent)
        }
        return Spo2Result(records)
    }

    /**
     * All-day stress (type 0x13): one byte per minute from [start] (`HMSyncPressureTask`,
     * `HMProSyncDataProfile.M`, §6.2 [I]). Values outside 1..100 (0 = not measured, 0xFE/0xFF
     * markers) are skipped ([I]).
     */
    fun parseStressAllDay(payload: ByteArray, start: Instant): List<HealthRecord.Stress> =
        payload.indices.mapNotNull { minute ->
            val score = payload[minute].toInt() and 0xFF
            if (score in 1..100) HealthRecord.Stress(start.plusSeconds(minute * SECONDS_PER_MINUTE), score) else null
        }
}
