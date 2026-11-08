package com.unified.health.driver.garmin.codec.fit

import com.unified.health.core.model.HealthRecord
import com.unified.health.core.model.SleepStage
import com.unified.health.driver.garmin.codec.FitTime
import com.unified.health.driver.garmin.testing.FitFileBuilder
import com.unified.health.driver.garmin.testing.FitFileBuilder.Companion.enum
import com.unified.health.driver.garmin.testing.FitFileBuilder.Companion.fit
import com.unified.health.driver.garmin.testing.FitFileBuilder.Companion.s16
import com.unified.health.driver.garmin.testing.FitFileBuilder.Companion.u16
import com.unified.health.driver.garmin.testing.FitFileBuilder.Companion.u32
import com.unified.health.driver.garmin.testing.FitFileBuilder.Companion.u8
import org.junit.Assert.assertEquals
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
            .define(0, FitHealthMapper.MESG_HRV_STATUS_SUMMARY, u32(253), u16(4))
            .record(0, t0, 5120) // 5120 / 128 = 40 ms
            .build()
        val records = FitHealthMapper.map(FitDecoder.decode(bytes), ZoneOffset.UTC, DailyActivityAccumulator())
        assertEquals(listOf(HealthRecord.HeartRateVariability(at(t0), 40)), records.filterIsInstance<HealthRecord.HeartRateVariability>())
    }

    @Test
    fun `user_metrics and user_profile vo2_max become Vo2Max records at the last seen timestamp`() {
        val bytes = FitFileBuilder()
            .define(0, FitHealthMapper.MESG_MONITORING, u32(253), enum(5), u32(3))
            .record(0, t0, 6, 1000)
            .define(1, FitHealthMapper.MESG_USER_METRICS, u8(7))
            .record(1, 52)
            .define(2, FitHealthMapper.MESG_USER_PROFILE, u8(7))
            .record(2, 48)
            .build()
        val records = FitHealthMapper.map(FitDecoder.decode(bytes), ZoneOffset.UTC, DailyActivityAccumulator())
        assertEquals(
            listOf(HealthRecord.Vo2Max(at(t0), 52), HealthRecord.Vo2Max(at(t0), 48)),
            records.filterIsInstance<HealthRecord.Vo2Max>(),
        )
    }

    @Test
    fun `vo2_max outside the plausible human range is dropped`() {
        val bytes = FitFileBuilder()
            .define(0, FitHealthMapper.MESG_MONITORING, u32(253), enum(5), u32(3))
            .record(0, t0, 6, 1000)
            .define(1, FitHealthMapper.MESG_USER_METRICS, u8(7))
            .record(1, 150) // not the 0xFF invalid sentinel, but not a believable VO2max either
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
