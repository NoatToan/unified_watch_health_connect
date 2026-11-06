package com.unified.health.core.demo.virtual

import com.unified.health.core.ble.protocol.buildBytes
import java.time.Instant
import java.time.LocalTime
import java.time.ZoneId

/**
 * Builds the directory (file index 0) and FIT files the simulated watch serves during a sync
 * (§6.1): one MONITORING_B (type 32) file with the day's steps/distance/calories, heart rate,
 * resting heart rate, HRV, stress, SpO2 and sleep stages, and one ACTIVITY (type 4) file with a
 * completed workout — covering every history-sync feature `GarminDriver` maps
 * (`driver/garmin/.../codec/fit/FitHealthMapper.kt`).
 *
 * Message/field numbers mirror that mapper's constants (duplicated here for the reason explained
 * in [GarminWire]); kept in sync deliberately, not by sharing code.
 */
internal object GarminSimulatedFiles {

    private const val FILE_MONITORING = 1
    private const val FILE_ACTIVITY = 2

    private const val DATA_TYPE_FIT = 128
    private const val SUB_TYPE_ACTIVITY = 4
    private const val SUB_TYPE_MONITORING = 32

    // Global message numbers, matching FitHealthMapper [Ext].
    private const val MESG_SESSION = 18
    private const val MESG_MONITORING = 55
    private const val MESG_MONITORING_HR_DATA = 273
    private const val MESG_STRESS_LEVEL = 227
    private const val MESG_SPO2_DATA = 269
    private const val MESG_SLEEP_LEVEL = 275
    private const val MESG_HRV_STATUS_SUMMARY = 389

    fun build(now: Instant): Map<Int, ByteArray> {
        val monitoring = monitoringFile(now)
        val activity = activityFile(now)
        val directory = directory(
            now.minusSeconds(600) to (FILE_MONITORING to monitoring),
            now.minusSeconds(300) to (FILE_ACTIVITY to activity),
        )
        return mapOf(0 to directory, FILE_MONITORING to monitoring, FILE_ACTIVITY to activity)
    }

    /** File index 0 (§6.1): 16-byte header (unused) + one 16-byte entry per file. */
    private fun directory(vararg entries: Pair<Instant, Pair<Int, ByteArray>>): ByteArray = buildBytes(16 + entries.size * 16) {
        bytes(ByteArray(16))
        for ((timestamp, indexed) in entries) {
            val (fileIndex, content) = indexed
            u16le(fileIndex)
            u8(DATA_TYPE_FIT)
            u8(if (fileIndex == FILE_ACTIVITY) SUB_TYPE_ACTIVITY else SUB_TYPE_MONITORING)
            u16le(fileIndex) // fileNumber, unused by the driver
            u8(0) // specificFlags
            u8(0) // fileFlags
            u32le(content.size.toLong())
            u32le(garminFitTime(timestamp))
        }
    }

    private fun monitoringFile(now: Instant): ByteArray {
        val fit = GarminFitFileWriter()
        // monitoring (55): timestamp | activity_type | cycles (cumulative steps) | active_calories | distance (cm) | heart_rate.
        fit.define(
            0, MESG_MONITORING,
            GarminFitFileWriter.u32(253), GarminFitFileWriter.enum(5), GarminFitFileWriter.u32(3),
            GarminFitFileWriter.u16(19), GarminFitFileWriter.u32(2), GarminFitFileWriter.u8(27),
        )
        val start = now.minusSeconds(6 * 3600L)
        val steps = intArrayOf(900, 2100, 3400, 5000, 6600, 7800)
        val kcal = intArrayOf(40, 95, 150, 230, 300, 360)
        val distanceCm = intArrayOf(60_000, 140_000, 230_000, 340_000, 450_000, 530_000)
        val hr = intArrayOf(78, 95, 88, 110, 101, 84)
        for (i in steps.indices) {
            val t = garminFitTime(start.plusSeconds(i * 3600L))
            fit.record(0, t, WALKING_ACTIVITY_TYPE, steps[i].toLong(), kcal[i].toLong(), distanceCm[i].toLong(), hr[i].toLong())
        }

        // stress_level (227): value | time (no field 253 needed, matches FitHealthMapper's fallback).
        fit.define(1, MESG_STRESS_LEVEL, GarminFitFileWriter.s16(0), GarminFitFileWriter.u32(1))
        fit.record(1, 42L, garminFitTime(now.minusSeconds(1_800)))

        // spo2_data (269): timestamp | reading %.
        fit.define(2, MESG_SPO2_DATA, GarminFitFileWriter.u32(253), GarminFitFileWriter.u8(0))
        fit.record(2, garminFitTime(now.minusSeconds(3_600)), 97L)

        // sleep_level (275): timestamp | level. Each sample starts a stage lasting until the next one.
        // A night belongs to the morning it ends on: window(today) = [yesterday 18:00, today 12:00]
        // (core/data's LocalHealthDataRepository, D-206). Before noon, "now" itself sits inside that
        // window, so a few hours back is always safely inside it and in the past. From noon onward
        // that window has already closed, so anchor to yesterday 23:00 instead of a relative offset
        // (otherwise an afternoon/evening sync would place "sleep" in daylight hours, outside any
        // window `observeSleep(today)` looks at, and the Sleep detail screen would show nothing).
        val zone = ZoneId.systemDefault()
        val nowZoned = now.atZone(zone)
        val sleepStart = if (nowZoned.toLocalTime().isBefore(LocalTime.NOON)) {
            now.minusSeconds(8 * 3600L)
        } else {
            nowZoned.toLocalDate().minusDays(1).atTime(23, 0).atZone(zone).toInstant()
        }
        fit.define(3, MESG_SLEEP_LEVEL, GarminFitFileWriter.u32(253), GarminFitFileWriter.enum(0))
        listOf(2L to 0L, 3L to 5_400L, 2L to 9_000L, 4L to 12_600L, 1L to 16_200L).forEach { (level, offset) ->
            fit.record(3, garminFitTime(sleepStart.plusSeconds(offset)), level)
        }

        // monitoring_hr_data (273): timestamp | resting_heart_rate | current_day_resting_heart_rate.
        fit.define(4, MESG_MONITORING_HR_DATA, GarminFitFileWriter.u32(253), GarminFitFileWriter.u8(0), GarminFitFileWriter.u8(1))
        fit.record(4, garminFitTime(now.minusSeconds(3_600)), 54L, 52L)

        // hrv_status_summary (389): timestamp | last_night_average (scale 128 -> ms): 5376/128 = 42 ms.
        fit.define(5, MESG_HRV_STATUS_SUMMARY, GarminFitFileWriter.u32(253), GarminFitFileWriter.u16(4))
        fit.record(5, garminFitTime(sleepStart.plusSeconds(21_600)), 5_376L)

        return fit.build()
    }

    private fun activityFile(now: Instant): ByteArray {
        val fit = GarminFitFileWriter()
        // session (18): start_time | sport | total_elapsed_time (scale 1000) | total_distance (scale 100) |
        // total_calories | avg_heart_rate | max_heart_rate.
        fit.define(
            0, MESG_SESSION,
            GarminFitFileWriter.u32(2), GarminFitFileWriter.enum(5), GarminFitFileWriter.u32(7),
            GarminFitFileWriter.u32(9), GarminFitFileWriter.u16(11), GarminFitFileWriter.u8(16), GarminFitFileWriter.u8(17),
        )
        val start = now.minusSeconds(3 * 3600L)
        fit.record(0, garminFitTime(start), RUNNING_SPORT, 1_800_000L, 500_000L, 320L, 142L, 168L)
        return fit.build()
    }

    /** FIT `activity_type` walking (6) and `sport` running (1) [Ext]. */
    private const val WALKING_ACTIVITY_TYPE = 6L
    private const val RUNNING_SPORT = 1L
}
