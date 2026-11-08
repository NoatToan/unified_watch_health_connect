package com.unified.health.driver.garmin.codec.fit

import com.unified.health.core.model.HealthRecord
import com.unified.health.core.model.SleepStage
import com.unified.health.driver.garmin.codec.FitTime
import com.unified.health.driver.garmin.testing.FitFileBuilder
import com.unified.health.driver.garmin.testing.FitFileBuilder.Companion.enum
import com.unified.health.driver.garmin.testing.FitFileBuilder.Companion.fit
import com.unified.health.driver.garmin.testing.FitFileBuilder.Companion.s16
import com.unified.health.driver.garmin.testing.FitFileBuilder.Companion.s32
import com.unified.health.driver.garmin.testing.FitFileBuilder.Companion.u16
import com.unified.health.driver.garmin.testing.FitFileBuilder.Companion.u32
import com.unified.health.driver.garmin.testing.FitFileBuilder.Companion.u8
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Assert.assertTrue
import org.junit.Test
import java.time.Instant
import java.time.LocalDate
import java.time.ZoneOffset

class FitHealthMapperTest {

    private val t0 = fit("2026-03-01T20:00:00Z")

    private fun at(seconds: Long): Instant = FitTime.toInstant(seconds)

    /** monitoring_info says local time is UTC+2, so 23:00Z falls on the next local day. */
    private fun monitoringFile(): ByteArray = FitFileBuilder()
        .define(0, FitHealthMapper.MESG_MONITORING_INFO, u32(253), u32(0))
        .record(0, t0, t0 + 7200)
        .define(1, FitHealthMapper.MESG_MONITORING, u32(253), enum(5), u32(3), u16(19), u32(2))
        .record(1, t0 + 60, 6, 1000, 50, 80_000)
        .record(1, t0 + 120, 1, 500, 40, 150_000)
        .record(1, t0 + 180, 6, 2500, 120, 200_000)
        .define(2, FitHealthMapper.MESG_MONITORING, u16(26), u8(27))
        .record(2, (t0 + 200) and 0xFFFF, 72)
        .record(2, (t0 + 260) and 0xFFFF, 0) // no reading: dropped
        .define(3, FitHealthMapper.MESG_STRESS_LEVEL, s16(0), u32(1))
        .record(3, 35, t0 + 300)
        .record(3, -1L and 0xFFFF, t0 + 360) // not measurable: dropped
        .define(4, FitHealthMapper.MESG_SPO2_DATA, u32(253), u8(0))
        .record(4, t0 + 400, 96)
        .define(5, FitHealthMapper.MESG_MONITORING, u32(253), FitFileBuilder.Field(24, 1, FitFileBuilder.UINT8), u32(3))
        .record(5, t0 + 3 * 3600, 6 or (2 shl 5), 300) // activity type in current_activity_type_intensity
        .build()

    @Test
    fun `maps monitoring heart rate stress and spo2`() {
        val daily = DailyActivityAccumulator()
        val records = FitHealthMapper.map(FitDecoder.decode(monitoringFile()), ZoneOffset.UTC, daily)

        assertEquals(listOf(HealthRecord.HeartRate(at(t0 + 200), 72)), records.filterIsInstance<HealthRecord.HeartRate>())
        assertEquals(listOf(HealthRecord.Stress(at(t0 + 300), 35)), records.filterIsInstance<HealthRecord.Stress>())
        assertEquals(listOf(HealthRecord.SpO2(at(t0 + 400), 96)), records.filterIsInstance<HealthRecord.SpO2>())

        val days = daily.build()
        assertEquals(
            listOf(
                // walking max 2500 + running max 500; calories 120 + 40; distance (200000 + 150000) / 100
                HealthRecord.DailyActivity(LocalDate.of(2026, 3, 1), steps = 3000, activeKcal = 160, distanceMeters = 3500.0),
                HealthRecord.DailyActivity(LocalDate.of(2026, 3, 2), steps = 300, activeKcal = null, distanceMeters = null),
            ),
            days,
        )
    }

    @Test
    fun `daily totals combine files of the same sync`() {
        val daily = DailyActivityAccumulator()
        val later = FitFileBuilder()
            .define(0, FitHealthMapper.MESG_MONITORING, u32(253), enum(5), u32(3))
            .record(0, t0 + 600, 6, 4000)
            .build()
        FitHealthMapper.map(FitDecoder.decode(monitoringFile()), ZoneOffset.UTC, daily)
        FitHealthMapper.map(FitDecoder.decode(later), ZoneOffset.ofHours(2), daily)
        assertEquals(4500, daily.build().first().steps)
    }

    @Test
    fun `sleep levels become merged intervals`() {
        val bytes = FitFileBuilder()
            .define(0, FitHealthMapper.MESG_SLEEP_LEVEL, u32(253), enum(0))
            .record(0, t0, 2)
            .record(0, t0 + 60, 2)
            .record(0, t0 + 120, 3)
            .record(0, t0 + 300, 0) // unmeasurable
            .record(0, t0 + 360, 4)
            .record(0, t0 + 420, 1) // last sample has no end: dropped
            .build()
        val sleep = FitHealthMapper.map(FitDecoder.decode(bytes), ZoneOffset.UTC, DailyActivityAccumulator())
        assertEquals(
            listOf(
                HealthRecord.Sleep(at(t0), at(t0 + 120), SleepStage.LIGHT),
                HealthRecord.Sleep(at(t0 + 120), at(t0 + 300), SleepStage.DEEP),
                HealthRecord.Sleep(at(t0 + 360), at(t0 + 420), SleepStage.REM),
            ),
            sleep,
        )
    }

    @Test
    fun `session becomes a workout`() {
        val bytes = FitFileBuilder()
            .define(0, FitHealthMapper.MESG_SESSION, u32(253), u32(2), enum(5), u32(7), u32(9), u16(11), u8(16), u8(17))
            .record(0, t0 + 4000, t0, 1, 3_600_000, 1_000_000, 750, 150, 182)
            .build()
        val workouts = FitHealthMapper.map(FitDecoder.decode(bytes), ZoneOffset.UTC, DailyActivityAccumulator())
        assertEquals(
            listOf(HealthRecord.Workout(at(t0), at(t0 + 3600), "running", 10_000.0, 750, 150, 182)),
            workouts,
        )
    }

    @Test
    fun `lap and record attach to the session they precede`() {
        val bytes = FitFileBuilder()
            .define(0, FitHealthMapper.MESG_RECORD, u32(253), s32(0), s32(1), u16(2), u8(3), u8(4), u16(6))
            .record(0, t0 + 10, 1_073_741_824, 536_870_912, 3500, 150, 85, 3500)
            .record(0, t0 + 20, 0x7FFF_FFFFL, 0x7FFF_FFFFL, 0xFFFFL, 0, 90, 3000) // invalid lat/long/altitude; hr=0 filtered
            .define(1, FitHealthMapper.MESG_LAP, u32(2), u32(7), u32(9), u16(11), u16(13), u16(14), u8(15), u8(16), u8(17), u8(18), u16(21), u16(22))
            .record(1, t0, 600_000, 100_000, 80, 3000, 4000, 140, 160, 80, 90, 15, 5)
            .define(2, FitHealthMapper.MESG_SESSION, u32(253), u32(2), enum(5), u32(7), u32(9), u16(11), u8(16), u8(17))
            .record(2, t0 + 700, t0, 1, 610_000, 100_000, 80, 140, 160)
            .build()

        val records = FitHealthMapper.map(FitDecoder.decode(bytes), ZoneOffset.UTC, DailyActivityAccumulator())

        val workout = records.filterIsInstance<HealthRecord.Workout>().single()
        assertEquals(at(t0), workout.start)

        val lap = records.filterIsInstance<HealthRecord.WorkoutLap>().single()
        assertEquals(workout.start, lap.workoutStart)
        assertEquals(0, lap.index)
        assertEquals(at(t0), lap.start)
        assertEquals(at(t0 + 600), lap.end)
        assertEquals(1000.0, lap.distanceMeters)
        assertEquals(80, lap.calories)
        assertEquals(3.0, lap.avgSpeedMps)
        assertEquals(4.0, lap.maxSpeedMps)
        assertEquals(140, lap.avgHeartRate)
        assertEquals(160, lap.maxHeartRate)
        assertEquals(80, lap.avgCadence)
        assertEquals(90, lap.maxCadence)
        assertEquals(15.0, lap.ascentMeters)
        assertEquals(5.0, lap.descentMeters)

        val samples = records.filterIsInstance<HealthRecord.WorkoutSample>()
        assertEquals(2, samples.size)
        val first = samples[0]
        assertEquals(workout.start, first.workoutStart)
        assertEquals(at(t0 + 10), first.time)
        assertEquals(90.0, first.latitude!!, 0.001)
        assertEquals(45.0, first.longitude!!, 0.001)
        assertEquals(200.0, first.altitudeMeters)
        assertEquals(150, first.heartRate)
        assertEquals(85, first.cadence)
        assertEquals(3.5, first.speedMps)

        val second = samples[1]
        assertNull(second.latitude)
        assertNull(second.longitude)
        assertNull(second.altitudeMeters)
        assertNull(second.heartRate)
        assertEquals(90, second.cadence)
        assertEquals(3.0, second.speedMps)
    }

    @Test
    fun `records and laps without a following session are dropped`() {
        val bytes = FitFileBuilder()
            .define(0, FitHealthMapper.MESG_RECORD, u32(253), u8(3))
            .record(0, t0, 120)
            .define(1, FitHealthMapper.MESG_LAP, u32(2), u32(7))
            .record(1, t0, 60_000)
            .build()
        val records = FitHealthMapper.map(FitDecoder.decode(bytes), ZoneOffset.UTC, DailyActivityAccumulator())
        assertTrue(records.filterIsInstance<HealthRecord.WorkoutSample>().isEmpty())
        assertTrue(records.filterIsInstance<HealthRecord.WorkoutLap>().isEmpty())
    }

    @Test
    fun `monitoring_hr_data becomes resting heart rate keyed by local day`() {
        val bytes = FitFileBuilder()
            .define(0, FitHealthMapper.MESG_MONITORING_HR_DATA, u32(253), u8(0), u8(1))
            .record(0, t0, 50, 48) // current_day (1) wins over the plain field (0)
            .define(1, FitHealthMapper.MESG_MONITORING_HR_DATA, u32(253), u8(0))
            .record(1, t0 + 86_400, 52) // only the plain field present
            .build()
        val records = FitHealthMapper.map(FitDecoder.decode(bytes), ZoneOffset.UTC, DailyActivityAccumulator())
        assertEquals(
            listOf(
                HealthRecord.RestingHeartRate(LocalDate.of(2026, 3, 1), 48),
                HealthRecord.RestingHeartRate(LocalDate.of(2026, 3, 2), 52),
            ),
            records.filterIsInstance<HealthRecord.RestingHeartRate>(),
        )
    }

    @Test
    fun `hrv_status_summary becomes heart rate variability in milliseconds`() {
        val bytes = FitFileBuilder()
            .define(0, FitHealthMapper.MESG_HRV_STATUS_SUMMARY, u32(253), u16(1))
            .record(0, t0, 5120) // 5120 / 128 = 40 ms
            .build()
        val records = FitHealthMapper.map(FitDecoder.decode(bytes), ZoneOffset.UTC, DailyActivityAccumulator())
        assertEquals(listOf(HealthRecord.HeartRateVariability(at(t0), 40)), records.filterIsInstance<HealthRecord.HeartRateVariability>())
    }

    @Test
    fun `max_met_data vo2_max is scaled by 10 and uses its own update_time when present`() {
        val bytes = FitFileBuilder()
            .define(0, FitHealthMapper.MESG_MONITORING, u32(253), enum(5), u32(3))
            .record(0, t0, 6, 1000)
            .define(1, FitHealthMapper.MESG_MAX_MET_DATA, u32(0), u16(2))
            .record(1, t0 + 500, 500) // own update_time (field 0) = t0+500, raw 500 -> 50.0 mL/kg/min
            .define(2, FitHealthMapper.MESG_MAX_MET_DATA, u16(2))
            .record(2, 480) // no update_time field -> falls back to the last timestamp seen (t0)
            .build()
        val records = FitHealthMapper.map(FitDecoder.decode(bytes), ZoneOffset.UTC, DailyActivityAccumulator())
        assertEquals(
            listOf(HealthRecord.Vo2Max(at(t0 + 500), 50), HealthRecord.Vo2Max(at(t0), 48)),
            records.filterIsInstance<HealthRecord.Vo2Max>(),
        )
    }

    @Test
    fun `vo2_max outside the plausible human range is dropped`() {
        val bytes = FitFileBuilder()
            .define(0, FitHealthMapper.MESG_MONITORING, u32(253), enum(5), u32(3))
            .record(0, t0, 6, 1000)
            .define(1, FitHealthMapper.MESG_MAX_MET_DATA, u16(2))
            .record(1, 1500) // scales to 150.0 mL/kg/min — not believable
            .build()
        val records = FitHealthMapper.map(FitDecoder.decode(bytes), ZoneOffset.UTC, DailyActivityAccumulator())
        assertTrue(records.filterIsInstance<HealthRecord.Vo2Max>().isEmpty())
    }

    @Test
    fun `timestamp_16 expands across a 16 bit rollover`() {
        assertEquals(0x1_0005L, FitHealthMapper.expandTimestamp16(0xFFF0L, 0x0005L))
        assertEquals(0xFFF8L, FitHealthMapper.expandTimestamp16(0xFFF0L, 0xFFF8L))
        assertTrue(FitHealthMapper.expandTimestamp16(null, 1L) == null)
        assertEquals("sport_200", FitSport.name(200))
    }
}
