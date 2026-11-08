package com.unified.health.core.demo

import com.unified.health.core.data.repository.LocalHealthDataRepository
import com.unified.health.core.data.sync.HealthRecordSinkFactory
import com.unified.health.core.demo.seed.DemoDataSeeder
import com.unified.health.core.domain.repository.UserPreferencesRepository
import com.unified.health.core.domain.usecase.MetricStatsCalculator
import com.unified.health.core.model.HealthMetricType
import com.unified.health.core.model.HealthRecord
import com.unified.health.core.model.ThemeMode
import com.unified.health.core.model.TimeRange
import com.unified.health.core.model.UnitSystem
import com.unified.health.core.model.UserPreferences
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Assert.assertTrue
import org.junit.Test
import java.time.LocalDate
import java.time.ZoneId

/** Seeds through the real sink into an in-memory DAO and reads every chart back through the real repository. */
class DemoDataSeederTest {

    private val zone = ZoneId.systemDefault()
    private val today = LocalDate.of(2026, 11, 6)
    private val now = today.atTime(18, 0).atZone(zone).toInstant()
    private val dao = InMemoryHealthRecordDao()
    private val sinks = HealthRecordSinkFactory(dao) { _, _ -> }
    private val seeder = DemoDataSeeder(sinks::create, { dao.deleteAllSamples(); dao.deleteAllWorkouts() }, DemoHealthDataGenerator(zone = zone)) { now }
    private val prefs = object : UserPreferencesRepository {
        override val userPreferences: Flow<UserPreferences> = flowOf(UserPreferences())
        override suspend fun setOnboardingCompleted(completed: Boolean) = Unit
        override suspend fun setUnitSystem(unitSystem: UnitSystem) = Unit
        override suspend fun setThemeMode(themeMode: ThemeMode) = Unit
        override suspend fun setUseDynamicColor(enabled: Boolean) = Unit
        override suspend fun setDailyStepGoal(steps: Int) = Unit
        override suspend fun setPinnedMetrics(metrics: List<HealthMetricType>) = Unit
    }
    private val repository = LocalHealthDataRepository(dao, prefs)
    private val charted = HealthMetricType.entries - HealthMetricType.WEIGHT

    @Test
    fun `seeding is idempotent and stored under the demo watch`() = runTest {
        val written = seeder.seed(90)
        val rows = dao.sampleCount()
        assertTrue("$written records", written > 15_000)
        seeder.seed(90)
        assertEquals(rows, dao.sampleCount())
        assertTrue(dao.allSamples.all { it.deviceId == DemoDevice.ADDRESS })
        assertTrue(dao.allWorkouts.size in 35..70)
    }

    @Test
    fun `every chart of every range has data after seeding`() = runTest {
        seeder.seed(90)
        val expectedBuckets = mapOf(TimeRange.DAY to 24, TimeRange.WEEK to 7, TimeRange.MONTH to 30, TimeRange.SIX_MONTHS to 26, TimeRange.YEAR to 12)
        for (metric in charted) for (range in TimeRange.entries) {
            val points = repository.observeMetricSeries(metric, range, today).first()
            val expected = if (metric == HealthMetricType.SLEEP && range == TimeRange.DAY) 1 else expectedBuckets.getValue(range)
            assertEquals("$metric $range", expected, points.size)
            assertTrue("$metric $range has no data", points.any { it.hasData })
            assertNotNull("$metric $range stats", MetricStatsCalculator.of(metric, range, points))
        }
    }

    @Test
    fun `discrete charts carry min and max, cumulative weeks average daily totals`() = runTest {
        seeder.seed(90)
        val hr = repository.observeMetricSeries(HealthMetricType.HEART_RATE, TimeRange.WEEK, today).first()
        assertTrue(hr.all { it.min!! < it.value && it.value < it.max!! })
        val week = repository.observeMetricSeries(HealthMetricType.STEPS, TimeRange.WEEK, today).first()
        val sixMonths = repository.observeMetricSeries(HealthMetricType.STEPS, TimeRange.SIX_MONTHS, today).first()
        val lastWeek = sixMonths.last().value
        assertTrue("weekly bucket $lastWeek is a daily average", lastWeek < week.maxOf { it.value } * 1.01f && lastWeek > 1_000f)
        val day = repository.observeMetricSeries(HealthMetricType.STEPS, TimeRange.DAY, today).first()
        val summary = repository.observeDailySummary(today).first()
        assertEquals(summary.steps.count.toFloat(), day.sumOf { it.value.toDouble() }.toFloat(), 1f)
    }

    @Test
    fun `summary cards and Show All Data read the seeded values`() = runTest {
        seeder.seed(90)
        for (metric in charted) assertNotNull("$metric latest", repository.observeLatestReading(metric, today).first())
        val summary = repository.observeDailySummary(today).first()
        assertNotNull(summary.heartRate.restingBpm)
        assertNotNull(summary.sleep)
        assertTrue(summary.activeMinutes > 0)
        val readings = repository.observeMetricReadings(HealthMetricType.HEART_RATE, 50).first()
        assertEquals(50, readings.size)
        assertTrue(readings.zipWithNext().all { (a, b) -> !a.time.isBefore(b.time) })
        assertEquals(DemoDevice.ADDRESS, readings.first().sourceId)
        val nights = repository.observeMetricReadings(HealthMetricType.SLEEP, 10).first()
        assertEquals(10, nights.size)
        assertTrue(nights.all { it.value in 300.0..540.0 })
        assertEquals(30, repository.observeMetricReadings(HealthMetricType.STEPS, 30).first().size)
    }

    @Test
    fun `clearing removes every record`() = runTest {
        seeder.seed(10)
        seeder.clearDemoData()
        assertEquals(0, dao.sampleCount())
        assertTrue(repository.observeLatestReading(HealthMetricType.STEPS, today).first() == null)
    }

    @Test
    fun `clearDemoData through the real device-scoped delete leaves other devices' rows alone`() = runTest {
        // The production `clearDemo` lambda (scoped to DemoDeviceIds.ALL), not the test's own all-deleting one.
        val scopedSeeder = DemoDataSeeder(
            sinkFor = sinks::create,
            clearDemo = { dao.deleteSamplesForDevices(DemoDeviceIds.ALL); dao.deleteWorkoutsForDevices(DemoDeviceIds.ALL) },
            generator = DemoHealthDataGenerator(zone = zone),
            now = { now },
        )
        scopedSeeder.seed(5)
        val realWatchId = "AA:BB:CC:DD:EE:FF"
        sinks.create(realWatchId).onRecords(listOf(HealthRecord.HeartRate(now, 61)))
        assertTrue(dao.allSamples.any { it.deviceId == realWatchId })

        scopedSeeder.clearDemoData()

        assertTrue("demo rows should be gone", dao.allSamples.none { it.deviceId == DemoDevice.ADDRESS })
        assertTrue("other devices' rows (real watch or another virtual watch) must survive", dao.allSamples.any { it.deviceId == realWatchId })
    }
}
