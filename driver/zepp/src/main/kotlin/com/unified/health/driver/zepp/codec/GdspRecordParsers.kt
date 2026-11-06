package com.unified.health.driver.zepp.codec

import com.unified.health.core.ble.protocol.ByteReader
import com.unified.health.core.ble.protocol.MalformedPayloadException
import com.unified.health.core.model.HealthRecord
import java.time.Instant
import java.time.ZoneId

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

    /** `Spo2PointDataExtends` (brief TODO-2 [V]): timestamp(4) + current spo2(1) + 60 history bytes. */
    const val SPO2_V2_VERSION = 2
    const val SPO2_V2_RECORD_SIZE = 65
    private const val SPO2_V2_HISTORY_LENGTH = 60

    /** Stress-single / resting-HR record: `[timestamp u32 LE, value u8]`, after one leading skip byte. */
    const val EVENT_RECORD_SIZE = 5

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
     * SpO2 points (type 0x25). Version 1: 5-byte records `[timestamp u32 LE, spo2 u8]` (§6.2 [V]).
     * Version 2 (`Spo2PointDataExtends`, brief TODO-2 [V]): 65-byte records `[timestamp u32 LE,
     * current spo2 u8, 60 history bytes (oldest→newest, one per minute, ending at timestamp)]`; the
     * current-point byte is superseded by `history[59]` (same instant) and not re-emitted.
     *
     * Devices with the "support version" feature prefix the payload with one version byte
     * (`HMSyncSpo2Profile.q`, [V]). We cannot query that feature, so the prefix is inferred from the
     * length ([I]): a clean multiple of 5 bytes means no prefix (implicitly v1); otherwise the first
     * byte is the version and the rest must cleanly fit a known record size (v1's 5 or v2's 65) —
     * a version we don't recognise is kept as [Spo2Result.unsupportedVersion] (not decoded, not
     * thrown), but a length that fits neither is a corrupt frame ([MalformedPayloadException]).
     */
    fun parseSpo2(payload: ByteArray): Spo2Result {
        if (payload.isEmpty()) return Spo2Result(emptyList())
        if (payload.size % SPO2_RECORD_SIZE == 0) return Spo2Result(parseSpo2V1(payload, 0))
        val version = payload[0].toInt() and 0xFF
        val body = payload.size - 1
        val fitsV1 = body % SPO2_RECORD_SIZE == 0
        val fitsV2 = body % SPO2_V2_RECORD_SIZE == 0
        return when {
            version == SPO2_SUPPORTED_VERSION && fitsV1 -> Spo2Result(parseSpo2V1(payload, 1))
            version == SPO2_V2_VERSION && fitsV2 -> Spo2Result(parseSpo2V2(payload, 1))
            fitsV1 || fitsV2 -> Spo2Result(emptyList(), unsupportedVersion = version)
            else -> throw MalformedPayloadException(
                "SpO2 payload of ${payload.size} bytes is not n × $SPO2_RECORD_SIZE or 1 + n × ($SPO2_RECORD_SIZE or $SPO2_V2_RECORD_SIZE)",
            )
        }
    }

    private fun parseSpo2V1(payload: ByteArray, start: Int): List<HealthRecord.SpO2> {
        val reader = ByteReader(payload, start = start)
        val records = ArrayList<HealthRecord.SpO2>()
        while (reader.hasRemaining) {
            val timestamp = reader.u32le()
            val percent = reader.u8()
            if (timestamp > 0 && percent in 1..100) records += HealthRecord.SpO2(Instant.ofEpochSecond(timestamp), percent)
        }
        return records
    }

    private fun parseSpo2V2(payload: ByteArray, start: Int): List<HealthRecord.SpO2> {
        val reader = ByteReader(payload, start = start)
        val records = ArrayList<HealthRecord.SpO2>()
        while (reader.hasRemaining) {
            val timestamp = reader.u32le()
            reader.skip(1) // current spo2: same instant/value as history[last], not re-emitted.
            val history = reader.bytes(SPO2_V2_HISTORY_LENGTH)
            history.forEachIndexed { i, byte ->
                val percent = byte.toInt() and 0xFF
                val time = timestamp - (SPO2_V2_HISTORY_LENGTH - 1 - i) * SECONDS_PER_MINUTE
                if (time > 0 && percent in 1..100) records += HealthRecord.SpO2(Instant.ofEpochSecond(time), percent)
            }
        }
        return records
    }

    /**
     * All-day stress (type 0x13): one byte per minute from [start], after a leading skip byte
     * (`HMProSyncDataProfile.M()`, brief TODO [V]; mirrors [parseActivity]'s leading byte). Values
     * outside 1..100 (0 = not measured, 0xFE/0xFF markers) are skipped ([I]).
     */
    fun parseStressAllDay(payload: ByteArray, start: Instant): List<HealthRecord.Stress> {
        if (payload.size <= 1) return emptyList()
        return (1 until payload.size).mapNotNull { index ->
            val score = payload[index].toInt() and 0xFF
            if (score in 1..100) HealthRecord.Stress(start.plusSeconds((index - 1) * SECONDS_PER_MINUTE), score) else null
        }
    }

    /**
     * Single-event stress (type 0x12): 5-byte records `[timestamp u32 LE, stress u8]` after a
     * leading skip byte (`HMProSyncDataProfile.parsePressureSingleData()`, brief TODO [V]).
     */
    fun parseStressSingle(payload: ByteArray): List<HealthRecord.Stress> {
        if (payload.size <= 1) return emptyList()
        val body = payload.size - 1
        if (body % EVENT_RECORD_SIZE != 0) {
            throw MalformedPayloadException("Stress-single payload of ${payload.size} bytes is not 1 + n × $EVENT_RECORD_SIZE")
        }
        val reader = ByteReader(payload, start = 1)
        val records = ArrayList<HealthRecord.Stress>()
        while (reader.hasRemaining) {
            val timestamp = reader.u32le()
            val score = reader.u8()
            if (timestamp > 0 && score in 1..100) records += HealthRecord.Stress(Instant.ofEpochSecond(timestamp), score)
        }
        return records
    }

    /**
     * Resting heart rate (type 0x3A = 58). The type constant is [V] (`HMProSyncDataBaseProfile.java:71`)
     * but no parse method was found in the decompiled sources (likely R8-obfuscated or in a class
     * jadx could not decompile). [I] Inferred as the same shape already confirmed for
     * [parseStressSingle] (type 0x12): one skip byte then 5-byte `[timestamp u32 LE, bpm u8]` records.
     *
     * TODO(zepp-protocol): NEEDS-REAL-WATCH — this layout is a guess by analogy, not seen in code.
     * Confirm with an HCI snoop log of a real sync before trusting these values; a watch answering
     * this type with a different shape will surface as a [MalformedPayloadException] here, not
     * silently wrong data, because [EVENT_RECORD_SIZE] validates the overall length first.
     */
    fun parseRestingHeartRate(payload: ByteArray, zone: ZoneId): List<HealthRecord.RestingHeartRate> {
        if (payload.size <= 1) return emptyList()
        val body = payload.size - 1
        if (body % EVENT_RECORD_SIZE != 0) {
            throw MalformedPayloadException("Resting-HR payload of ${payload.size} bytes is not 1 + n × $EVENT_RECORD_SIZE")
        }
        val reader = ByteReader(payload, start = 1)
        val records = ArrayList<HealthRecord.RestingHeartRate>()
        while (reader.hasRemaining) {
            val timestamp = reader.u32le()
            val bpm = reader.u8()
            if (timestamp > 0 && bpm in 1..250) {
                val date = Instant.ofEpochSecond(timestamp).atZone(zone).toLocalDate()
                records += HealthRecord.RestingHeartRate(date, bpm)
            }
        }
        return records
    }
}
