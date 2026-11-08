package com.unified.health.core.data

import com.unified.health.core.ble.DeviceConnection
import com.unified.health.core.ble.HealthRecordSink
import com.unified.health.core.data.live.DefaultLiveHealthRepository
import com.unified.health.core.model.ConnectionState
import com.unified.health.core.model.DeviceCapability
import com.unified.health.core.model.DeviceInfo
import com.unified.health.core.model.HealthMetricType
import com.unified.health.core.model.HealthRecord
import com.unified.health.core.model.WearableVendor
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.onSubscription
import kotlinx.coroutines.flow.callbackFlow
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.launch
import kotlinx.coroutines.test.TestScope
import kotlinx.coroutines.test.advanceTimeBy
import kotlinx.coroutines.test.runCurrent
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import java.time.Instant
import org.junit.Test

@OptIn(ExperimentalCoroutinesApi::class)
class DefaultLiveHealthRepositoryTest {

    private class FakeConnection : DeviceConnection {
        override val state = MutableStateFlow<ConnectionState>(ConnectionState.Connected)
        override val activeAddress = MutableStateFlow<String?>("AA:BB")
        override val capabilities: StateFlow<Set<DeviceCapability>> = MutableStateFlow(setOf(DeviceCapability.LIVE_HEART_RATE))
        val samples = MutableSharedFlow<HealthRecord.HeartRate>()
        var collectors = 0
        override val liveHeartRate: Flow<HealthRecord.HeartRate> = callbackFlow {
            collectors++
            val job = launch { samples.collect { send(it) } }
            awaitClose { collectors--; job.cancel() }
        }

        override suspend fun connect(macAddress: String, vendor: WearableVendor) = Result.success(Unit)
        override suspend fun disconnect() = Unit
        override suspend fun readDeviceInfo() = Result.failure<DeviceInfo>(UnsupportedOperationException())
    }

    private class RecordingBatches : HealthRecordSink {
        val batches = mutableListOf<List<HealthRecord>>()
        override suspend fun onRecords(batch: List<HealthRecord>) { batches += batch }
    }

    private fun TestScope.repo(connection: FakeConnection, sink: RecordingBatches, atSize: Int = 3) =
        DefaultLiveHealthRepository(connection, { sink }, backgroundScope, flushEveryMs = 60_000, flushAtSize = atSize)

    private fun hr(bpm: Int, time: Instant = Instant.EPOCH) = HealthRecord.HeartRate(time, bpm)

    @Test
    fun `does not touch the sensor without observers and replays the last value to late ones`() = runTest {
        val connection = FakeConnection()
        val repo = repo(connection, RecordingBatches())
        runCurrent()
        assertEquals(0, connection.collectors)

        val first: Job = launch { repo.heartRate.collect { } }
        runCurrent()
        assertEquals(1, connection.collectors)
        connection.samples.emit(hr(72))
        runCurrent()
        assertEquals(72, repo.heartRate.value?.bpm)

        first.cancel()
        advanceTimeBy(DefaultLiveHealthRepository.GRACE_MS + 1)
        runCurrent()
        assertEquals(0, connection.collectors)
        assertEquals(72, repo.heartRate.value?.bpm)
    }

    @Test
    fun `writes readings in batches and flushes the rest when streaming stops`() = runTest {
        val connection = FakeConnection()
        val sink = RecordingBatches()
        val repo = repo(connection, sink, atSize = 3)
        val observer = launch { repo.heartRate.collect { } }
        runCurrent()

        listOf(70, 71, 72, 73).forEach { connection.samples.emit(hr(it)); runCurrent() }
        assertEquals(listOf(3), sink.batches.map { it.size })

        observer.cancel()
        advanceTimeBy(DefaultLiveHealthRepository.GRACE_MS + 1)
        runCurrent()
        assertEquals(listOf(3, 1), sink.batches.map { it.size })
    }

    @Test
    fun `no streaming while disconnected`() = runTest {
        val connection = FakeConnection().apply { state.value = ConnectionState.Disconnected }
        val repo = repo(connection, RecordingBatches())
        val observer = launch { repo.heartRate.collect { } }
        runCurrent()

        assertEquals(0, connection.collectors)
        assertNull(repo.heartRate.value)
        observer.cancel()
    }

    @Test
    fun `liveMetrics marks heart rate live only while a reading is fresh (D-1054)`() = runTest {
        val connection = FakeConnection()
        val repo = repo(connection, RecordingBatches())
        val hrObserver = launch { repo.heartRate.collect { } }
        val liveObserver = launch { repo.liveMetrics.collect { } }
        runCurrent()

        assertEquals(emptySet<HealthMetricType>(), repo.liveMetrics.value)

        // A real (not EPOCH) timestamp: liveWhileFresh compares it against wall-clock Instant.now().
        connection.samples.emit(hr(72, Instant.now()))
        runCurrent()
        assertEquals(setOf(HealthMetricType.HEART_RATE), repo.liveMetrics.value)
        // The value itself stays cached (unrelated to liveness) well past the live window.
        assertEquals(72, repo.heartRate.value?.bpm)

        advanceTimeBy(DefaultLiveHealthRepository.LIVE_MAX_AGE.toMillis() + 1_000)
        runCurrent()
        assertEquals(emptySet<HealthMetricType>(), repo.liveMetrics.value)
        assertEquals(72, repo.heartRate.value?.bpm)

        hrObserver.cancel()
        liveObserver.cancel()
    }
}
