package com.unified.health.driver.xiaomi.codec

import com.unified.health.core.ble.protocol.ByteReader
import com.unified.health.core.model.HealthRecord
import com.unified.health.driver.xiaomi.proto.FitnessDataId
import java.time.Instant

/**
 * `dataType=1 (sport), fileType=2` raw GPS waypoints (`SportGpsParser`, protocol §9.5 [V]).
 * Evidence: `docs/re-evidence/mi/jadx-base/sources/com/xiaomi/fit/fitness/parser/sport/gps/SportGpsParser.java`
 * -- only the "native" (pre-v4) loop format is decoded here; see [MIN_UNSUPPORTED_VERSION] and the
 * triathlon/ski exclusion below for what is explicitly out of scope and why.
 *
 * Same repeating `OneDimenDataType` loop mechanism [NightSleepCodec]'s record list and
 * [DailyReportCodec]'s flat struct both already use, just looped per-point: one shared validity
 * bitmap (`SportGpsParser.DataType`, confirmed real `int` constants [V]: `time=0, longitude=1,
 * latitude=2, accuracy=3, speed=4, gpsSource=5 (0-byte, see below), altitude=6, hdop=7`) decoded
 * once, then every point's fields back-to-back, looped until the buffer is exhausted (no leading
 * record-count prefix for `version < 4` -- `OneDimenDataParser.parseRecordData`'s default
 * `parseLoopRecord` overload loops to `dataBuffer.capacity()`, confirmed in the evidence).
 *
 * `speed`'s 2 bytes pack two values (`SportGpsParser.processOneRecordData` [V]): the top 12 bits
 * are speed in 0.1-units, the bottom 4 bits are `gpsSource`; `gpsSource`'s own `OneDimenDataType`
 * entry has `byteCount = 0` on purpose -- it exists only so the file's validity bitmap has a bit
 * for it, its "value" is never actually read as separate wire bytes.
 *
 * A point is only emitted once [TYPE_TIME]/[TYPE_LONGITUDE]/[TYPE_LATITUDE] are *all* valid for the
 * whole file (mirrors `SportGpsParser.processRecordList`'s own all-or-nothing check) -- a file
 * missing any of the three has no usable points at all, not partially-usable ones.
 */
internal object SportGpsCodec {

    private const val TYPE_TIME = 0
    private const val TYPE_LONGITUDE = 1
    private const val TYPE_LATITUDE = 2
    private const val TYPE_ACCURACY = 3
    private const val TYPE_SPEED = 4
    private const val TYPE_GPS_SOURCE = 5
    private const val TYPE_ALTITUDE = 6
    private const val TYPE_HDOP = 7

    private data class Field(val type: Int, val byteCount: Int, val supportVersion: Int)

    /** `SportGpsParser.dataTypeArray`, in wire order. */
    private val FIELDS = listOf(
        Field(TYPE_TIME, byteCount = 4, supportVersion = 1),
        Field(TYPE_LONGITUDE, byteCount = 4, supportVersion = 1),
        Field(TYPE_LATITUDE, byteCount = 4, supportVersion = 1),
        Field(TYPE_ACCURACY, byteCount = 4, supportVersion = 2),
        Field(TYPE_SPEED, byteCount = 2, supportVersion = 2),
        Field(TYPE_GPS_SOURCE, byteCount = 0, supportVersion = 2),
        Field(TYPE_ALTITUDE, byteCount = 4, supportVersion = 3),
        Field(TYPE_HDOP, byteCount = 4, supportVersion = 3),
    )

    /**
     * `version >= 4` switches `SportGpsParser.parseGps` to the "TGC" container format (a leading
     * record-count prefix, a feature-type byte, then an optional opaque TGC blob) instead of the
     * plain loop this codec implements. TODO(xiaomi-protocol): port the TGC variant once a v4+
     * real watch is available to capture a sample payload from; until then this is a deliberate
     * scope cut, not a guess.
     */
    private const val MIN_UNSUPPORTED_VERSION = 4

    /**
     * Triathlon/ski (`XiaomiSportTypes.TRIATHLON`/`SKI`) multiplex several sub-sport GPS tracks
     * inside one file (`SportGpsParser.parseTriItemsGps`, a *different* per-segment framing with
     * its own sub-sport-type + record-count prefix per segment) even below [MIN_UNSUPPORTED_VERSION].
     * TODO(xiaomi-protocol): port the multi-segment variant if/when triathlon/ski sport reports are
     * added; deliberately out of scope here (this driver does not decode those sportTypes' reports
     * either, see [XiaomiSportTypes.OUTDOOR_REPORT_SPORT_TYPES]).
     */
    private val MULTI_SEGMENT_SPORT_TYPES = setOf(XiaomiSportTypes.TRIATHLON, XiaomiSportTypes.SKI)

    /** Defensive cap so a corrupt/zeroed header (`recordLen == 0`) cannot spin forever. */
    private const val MAX_POINTS_PER_FILE = 20_000

    /** `getSportGpsValidityLen` (protocol §9.5 [V], evidence: `FitnessDataValidity.java`). */
    private fun dataValidLen(version: Int): Int? = if (version in 1..4) 1 else null

    /**
     * @return one [HealthRecord.WorkoutSample] per waypoint (latitude/longitude/altitude/speed;
     * no heart rate/cadence -- those come from the sport record file this driver does not decode,
     * see `SportReportCodec`'s module KDoc and the coordinator report's "deferred" section), or an
     * empty list for an unsupported/out-of-scope version, sportType, or a payload too short for
     * its own header.
     */
    fun decode(id: FitnessDataId, payload: ByteArray): List<HealthRecord> {
        if (id.subType in MULTI_SEGMENT_SPORT_TYPES) return emptyList()
        if (id.version >= MIN_UNSUPPORTED_VERSION) return emptyList()
        val validLen = dataValidLen(id.version) ?: return emptyList()
        if (payload.size < 1 + validLen) return emptyList()
        val dataValid = payload.copyOfRange(1, 1 + validLen)
        val validity = decodeValidity(id.version, dataValid)
        if (validity[TYPE_TIME] != true || validity[TYPE_LONGITUDE] != true || validity[TYPE_LATITUDE] != true) {
            return emptyList()
        }
        val pointLen = FIELDS.filter { it.supportVersion <= id.version }.sumOf { it.byteCount }
        if (pointLen <= 0) return emptyList()

        val reader = ByteReader(payload, 1 + validLen, payload.size)
        val workoutStart = Instant.ofEpochSecond(id.timestampSeconds)
        val samples = mutableListOf<HealthRecord>()
        var count = 0
        while (count < MAX_POINTS_PER_FILE && reader.remaining >= pointLen) {
            samples += parsePoint(reader, id.version, workoutStart)
            count++
        }
        return samples
    }

    private fun parsePoint(reader: ByteReader, version: Int, workoutStart: Instant): HealthRecord.WorkoutSample {
        val time = reader.u32le()
        val longitude = Float.fromBits(reader.s32le())
        val latitude = Float.fromBits(reader.s32le())
        var speedMps: Double? = null
        if (FIELDS[3].supportVersion <= version) reader.s32le() // accuracy: not modelled, discarded.
        if (FIELDS[4].supportVersion <= version) {
            val raw = reader.u16le()
            // TODO(xiaomi-protocol): 0.1 resolution confirmed by the packing math
            // (`processOneRecordData`); the unit itself (m/s vs km/h) is not spelled out anywhere
            // in the evidence -- assuming m/s by analogy with this field's name elsewhere in the
            // app and with `HealthRecord.WorkoutSample.speedMps`'s own documented unit. Verify on
            // a real watch against the companion app's displayed pace/speed.
            speedMps = ((raw ushr 4) and 0xFFF) / 10.0
            // gpsSource = raw and 0xF -- not modelled on HealthRecord, discarded.
        }
        var altitude: Double? = null
        if (FIELDS[6].supportVersion <= version) {
            altitude = Float.fromBits(reader.s32le()).toDouble()
            if (FIELDS[7].supportVersion <= version) reader.s32le() // hdop: not modelled, discarded.
        }
        return HealthRecord.WorkoutSample(
            workoutStart = workoutStart,
            time = Instant.ofEpochSecond(time),
            latitude = latitude.toDouble(),
            longitude = longitude.toDouble(),
            altitudeMeters = altitude,
            speedMps = speedMps,
        )
    }

    /**
     * One bit per [FIELDS] entry (`SportGpsParser.DataType` order), only consuming a bit when
     * `supportVersion <= version` (same convention confirmed across every codec in this module --
     * see [DailyReportCodec]'s KDoc for the shared citation).
     */
    private fun decodeValidity(version: Int, dataValid: ByteArray): Map<Int, Boolean> {
        val result = mutableMapOf<Int, Boolean>()
        var bitIndex = 0
        for (field in FIELDS) {
            if (field.supportVersion > version) {
                result[field.type] = false
                continue
            }
            val byteIndex = bitIndex / 8
            val bit = byteIndex < dataValid.size && dataValid[byteIndex].toInt() and (1 shl (7 - bitIndex % 8)) != 0
            result[field.type] = bit
            bitIndex++
        }
        return result
    }
}
