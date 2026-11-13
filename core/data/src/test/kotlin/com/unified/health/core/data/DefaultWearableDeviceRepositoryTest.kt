package com.unified.health.core.data

import android.content.Context
import android.content.ContextWrapper
import com.unified.health.core.ble.DeviceConnection
import com.unified.health.core.ble.DeviceScanner
import com.unified.health.core.ble.HealthDataSync
import com.unified.health.core.ble.HealthRecordSink
import com.unified.health.core.ble.credentials.DeviceCredentialStore
import com.unified.health.core.ble.driver.DriverRegistry
import com.unified.health.core.ble.driver.RecognitionScore
import com.unified.health.core.ble.driver.SessionContext
import com.unified.health.core.ble.driver.WearableDriver
import com.unified.health.core.ble.driver.WearableSession
import com.unified.health.core.ble.gatt.GattClient
import com.unified.health.core.ble.scan.Advertisement
import com.unified.health.core.data.database.HealthRecordDao
import com.unified.health.core.data.database.HealthSampleEntity
import com.unified.health.core.data.database.PairedDeviceDao
import com.unified.health.core.data.database.PairedDeviceEntity
import com.unified.health.core.data.database.WorkoutEntity
import com.unified.health.core.data.database.WorkoutLapEntity
import com.unified.health.core.data.database.WorkoutSampleEntity
import com.unified.health.core.data.repository.DefaultWearableDeviceRepository
import com.unified.health.core.data.sync.HealthRecordSinkFactory
import com.unified.health.core.data.sync.RawPayloadSaver
import com.unified.health.core.data.sync.RawPayloadStore
import com.unified.health.core.data.sync.WorkoutDetailBackfillFilter
import com.unified.health.core.data.sync.WorkoutDetailBackfillState
import com.unified.health.core.data.sync.WorkoutDetailRowCounter
import com.unified.health.core.model.ConnectionState
import com.unified.health.core.model.CredentialFormat
import com.unified.health.core.model.CredentialRequirement
import com.unified.health.core.model.DeviceCapability
import com.unified.health.core.model.DeviceInfo
import com.unified.health.core.model.HealthRecord
import com.unified.health.core.model.SyncState
import com.unified.health.core.model.WearableVendor
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.emptyFlow
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

/**
 * Covers the [DefaultWearableDeviceRepository.generateCredential] bugfix: a `generatable`
 * [CredentialFormat.TEXT] credential (e.g. driver/xiaomi's `USER_ID` / `APP_DEVICE_ID`) used to
 * always fail because [CredentialFormat.TEXT.byteLength] is null. Everything this class needs
 * besides the bits [generateCredential] actually touches (`dao`, `registry`, `credentials`) is a
 * throwaway fake/no-op; the rest of the repository's behaviour is not under test here.
 */
class DefaultWearableDeviceRepositoryTest {

    private val device = PairedDeviceEntity(
        id = "AA:BB:CC:DD:EE:FF",
        name = "Test Watch",
        macAddress = "AA:BB:CC:DD:EE:FF",
        model = null,
        firmwareVersion = null,
        batteryPercent = null,
        lastSyncedAtEpochMs = null,
        pairedAtEpochMs = 0L,
        vendor = WearableVendor.XIAOMI.name,
    )

    private val textRequirement = CredentialRequirement(
        key = "xiaomi.user_id",
        label = "User id",
        description = "Generated locally on first bind",
        format = CredentialFormat.TEXT,
        generatable = true,
    )

    private val hexRequirement = CredentialRequirement(
        key = "xiaomi.auth_token",
        label = "Auth token",
        description = "Generated locally on first bind",
        format = CredentialFormat.HEX_16_BYTES,
        generatable = true,
    )

    private fun repository(credentials: InMemoryCredentialStore = InMemoryCredentialStore()) =
        DefaultWearableDeviceRepository(
            scanner = object : DeviceScanner {
                override fun scan() = emptyFlow<List<com.unified.health.core.model.DiscoveredDevice>>()
            },
            connection = FakeDeviceConnection(),
            healthDataSync = FakeHealthDataSync(),
            dao = FakePairedDeviceDao(device),
            registry = DriverRegistry(setOf(FakeDriver(WearableVendor.XIAOMI, listOf(textRequirement, hexRequirement)))),
            credentials = credentials,
            sinkFactory = HealthRecordSinkFactory(NoOpHealthRecordDao(), RawPayloadSaver { _, _ -> }),
            rawPayloads = RawPayloadStore(NoOpContext()),
            backfillFilter = WorkoutDetailBackfillFilter(WorkoutDetailRowCounter { _, _ -> false }),
            backfillState = FakeBackfillState(),
        )

    @Test
    fun `generateCredential succeeds for a TEXT-format credential and the value is stored`() = runTest {
        val credentials = InMemoryCredentialStore()
        val repo = repository(credentials)

        val result = repo.generateCredential(device.id, textRequirement.key)

        assertTrue(result.isSuccess)
        val value = result.getOrThrow()
        assertTrue(value.isNotEmpty())
        val stored = credentials.get(device.macAddress, textRequirement.key)
        assertEquals(value, stored?.toString(Charsets.UTF_8))
        assertTrue(textRequirement.unboundMarkerKey in credentials.keysBlocking(device.macAddress))
    }

    @Test
    fun `generateCredential keeps generating 32 hex characters for HEX_16_BYTES`() = runTest {
        val credentials = InMemoryCredentialStore()
        val repo = repository(credentials)

        val result = repo.generateCredential(device.id, hexRequirement.key)

        assertTrue(result.isSuccess)
        val value = result.getOrThrow()
        assertEquals(32, value.length)
        assertEquals(16, credentials.get(device.macAddress, hexRequirement.key)?.size)
    }

    private class InMemoryCredentialStore : DeviceCredentialStore {
        private val store = mutableMapOf<String, ByteArray>()
        private fun storeKey(address: String, key: String) = "$address|$key"

        override suspend fun get(address: String, key: String): ByteArray? = store[storeKey(address, key)]
        override suspend fun put(address: String, key: String, value: ByteArray) {
            store[storeKey(address, key)] = value
        }
        override suspend fun remove(address: String, key: String) {
            store.remove(storeKey(address, key))
        }
        override suspend fun keys(address: String): Set<String> = keysBlocking(address)
        override suspend fun clear(address: String) {
            store.keys.filter { it.startsWith("$address|") }.forEach(store::remove)
        }

        fun keysBlocking(address: String): Set<String> =
            store.keys.filter { it.startsWith("$address|") }.map { it.removePrefix("$address|") }.toSet()
    }

    private class FakePairedDeviceDao(private val entity: PairedDeviceEntity) : PairedDeviceDao {
        override fun observeAll(): Flow<List<PairedDeviceEntity>> = flowOf(listOf(entity))
        override suspend fun getById(id: String): PairedDeviceEntity? = entity.takeIf { it.id == id }
        override suspend fun upsert(entity: PairedDeviceEntity) = Unit
        override suspend fun updateInfo(id: String, battery: Int?, firmware: String?, model: String?) = Unit
        override suspend fun updateBattery(id: String, battery: Int) = Unit
        override suspend fun updateLastSynced(id: String, epochMs: Long) = Unit
        override suspend fun delete(id: String) = Unit
    }

    private class FakeDeviceConnection : DeviceConnection {
        override val state: StateFlow<ConnectionState> = MutableStateFlow(ConnectionState.Disconnected)
        override val activeAddress: StateFlow<String?> = MutableStateFlow(null)
        override val capabilities: StateFlow<Set<DeviceCapability>> = MutableStateFlow(emptySet())
        override val liveHeartRate: Flow<HealthRecord.HeartRate> = emptyFlow()
        override suspend fun connect(macAddress: String, vendor: WearableVendor) = Result.success(Unit)
        override suspend fun disconnect() = Unit
        override suspend fun readDeviceInfo(): Result<DeviceInfo> = Result.failure(UnsupportedOperationException())
    }

    private class FakeHealthDataSync : HealthDataSync {
        override val state: StateFlow<SyncState> = MutableStateFlow(SyncState.Idle)
        override suspend fun sync(
            macAddress: String,
            since: java.time.Instant?,
            sink: HealthRecordSink,
            knownRawPayloadTimestamps: Set<java.time.Instant>,
        ) = Result.failure<com.unified.health.core.model.SyncResult>(UnsupportedOperationException())
    }

    private class FakeBackfillState : WorkoutDetailBackfillState {
        override suspend fun isDone(deviceId: String) = true
        override suspend fun markDone(deviceId: String) = Unit
    }

    /** Never dereferences its (null) base: only passed through to satisfy [RawPayloadStore]'s constructor. */
    private class NoOpContext : ContextWrapper(null as Context?)

    private class FakeDriver(
        override val vendor: WearableVendor,
        override val credentialRequirements: List<CredentialRequirement>,
    ) : WearableDriver {
        override fun recognize(advertisement: Advertisement): Int = RecognitionScore.NONE
        override suspend fun openSession(gatt: GattClient, context: SessionContext): WearableSession =
            throw UnsupportedOperationException("not used by this test")
    }

    /** None of [generateCredential]'s code paths touch the DB; every member here is unreachable. */
    private class NoOpHealthRecordDao : HealthRecordDao {
        override suspend fun upsertSamples(samples: List<HealthSampleEntity>) = TODO()
        override suspend fun upsertWorkouts(workouts: List<WorkoutEntity>) = TODO()
        override suspend fun upsertWorkoutLaps(laps: List<WorkoutLapEntity>) = TODO()
        override suspend fun upsertWorkoutSamples(samples: List<WorkoutSampleEntity>) = TODO()
        override suspend fun samples(type: String, fromEpochMs: Long, toEpochMs: Long): List<HealthSampleEntity> = TODO()
        override fun observeSamples(types: List<String>, fromEpochMs: Long, toEpochMs: Long): Flow<List<HealthSampleEntity>> = TODO()
        override fun observeWorkouts(limit: Int): Flow<List<WorkoutEntity>> = TODO()
        override fun observeWorkout(deviceId: String, startEpochMs: Long): Flow<WorkoutEntity?> = TODO()
        override fun observeWorkoutLaps(deviceId: String, workoutStartEpochMs: Long): Flow<List<WorkoutLapEntity>> = TODO()
        override fun observeWorkoutSamples(deviceId: String, workoutStartEpochMs: Long): Flow<List<WorkoutSampleEntity>> = TODO()
        override suspend fun workoutLapCount(deviceId: String, workoutStartEpochMs: Long): Int = TODO()
        override suspend fun workoutSampleCount(deviceId: String, workoutStartEpochMs: Long): Int = TODO()
        override fun observeDeviceSamples(type: String, deviceId: String, fromEpochMs: Long, toEpochMs: Long): Flow<List<HealthSampleEntity>> = TODO()
        override fun observeLatestSamples(types: List<String>, limit: Int): Flow<List<HealthSampleEntity>> = TODO()
        override suspend fun sampleCount(): Int = TODO()
        override suspend fun deleteAllSamples() = TODO()
        override suspend fun deleteAllWorkouts() = TODO()
        override suspend fun deleteAllWorkoutLaps() = TODO()
        override suspend fun deleteAllWorkoutSamples() = TODO()
        override suspend fun deleteSamplesForDevices(deviceIds: List<String>) = TODO()
        override suspend fun deleteWorkoutsForDevices(deviceIds: List<String>) = TODO()
        override suspend fun deleteWorkoutLapsForDevices(deviceIds: List<String>) = TODO()
        override suspend fun deleteWorkoutSamplesForDevices(deviceIds: List<String>) = TODO()
    }
}
