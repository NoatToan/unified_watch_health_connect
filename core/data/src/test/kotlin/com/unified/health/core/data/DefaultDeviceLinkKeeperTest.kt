package com.unified.health.core.data

import com.unified.health.core.data.link.DefaultDeviceLinkKeeper
import com.unified.health.core.domain.repository.WearableDeviceRepository
import com.unified.health.core.model.ConnectionState
import com.unified.health.core.model.CredentialFormat
import com.unified.health.core.model.CredentialRequirement
import com.unified.health.core.model.DiscoveredDevice
import com.unified.health.core.model.SyncState
import com.unified.health.core.model.WearableDevice
import com.unified.health.core.model.WearableVendor
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.emptyFlow
import kotlinx.coroutines.test.advanceTimeBy
import kotlinx.coroutines.test.runCurrent
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

@OptIn(ExperimentalCoroutinesApi::class)
class DefaultDeviceLinkKeeperTest {

    private class FakeRepository(var failuresLeft: Int = 0) : WearableDeviceRepository {
        val devices = MutableStateFlow(listOf(WearableDevice("d1", "Watch", "AA:BB:CC:DD:EE:FF", WearableVendor.STANDARD)))
        val state = MutableStateFlow<ConnectionState>(ConnectionState.Disconnected)
        var connectCalls = 0
        var syncCalls = 0

        override val pairedDevices: Flow<List<WearableDevice>> = devices
        override val connectionState: Flow<ConnectionState> = state
        override val syncState: Flow<SyncState> = emptyFlow()
        override fun scan(): Flow<List<DiscoveredDevice>> = emptyFlow()
        override suspend fun pair(device: DiscoveredDevice) = Result.failure<WearableDevice>(UnsupportedOperationException())

        override suspend fun connect(deviceId: String): Result<Unit> {
            connectCalls++
            return if (failuresLeft > 0) {
                failuresLeft--
                state.value = ConnectionState.Error("boom")
                Result.failure(IllegalStateException("boom"))
            } else {
                state.value = ConnectionState.Connected
                Result.success(Unit)
            }
        }

        override suspend fun disconnect(deviceId: String) { state.value = ConnectionState.Disconnected }
        override suspend fun unpair(deviceId: String) = Unit
        override suspend fun syncNow(deviceId: String): Result<Unit> { syncCalls++; return Result.success(Unit) }
        override suspend fun reprocessRawPayloads(deviceId: String): Result<Int> = Result.success(0)
        override suspend fun generateCredential(deviceId: String, key: String) = Result.success("")
        override suspend fun setCredential(deviceId: String, key: String, value: String) = Result.success(Unit)
    }

    @Test
    fun `connects on start and syncs once`() = runTest {
        val repo = FakeRepository()
        val keeper = DefaultDeviceLinkKeeper(repo, backgroundScope)

        keeper.start()
        runCurrent()

        assertEquals(1, repo.connectCalls)
        assertEquals(1, repo.syncCalls)
        assertTrue(keeper.active.value)
    }

    @Test
    fun `retries with exponential back-off after failures`() = runTest {
        val repo = FakeRepository(failuresLeft = 2)
        val keeper = DefaultDeviceLinkKeeper(repo, backgroundScope)

        keeper.start()
        runCurrent()
        assertEquals(1, repo.connectCalls)

        advanceTimeBy(DefaultDeviceLinkKeeper.backoffMs(0) - 1)
        runCurrent()
        assertEquals(1, repo.connectCalls)
        advanceTimeBy(1)
        runCurrent()
        assertEquals(2, repo.connectCalls)

        advanceTimeBy(DefaultDeviceLinkKeeper.backoffMs(1))
        runCurrent()
        assertEquals(3, repo.connectCalls)
        assertEquals(ConnectionState.Connected, repo.state.value)
    }

    @Test
    fun `reconnects after link loss`() = runTest {
        val repo = FakeRepository()
        DefaultDeviceLinkKeeper(repo, backgroundScope).start()
        runCurrent()

        repo.state.value = ConnectionState.Error("Connection lost")
        advanceTimeBy(DefaultDeviceLinkKeeper.backoffMs(0))
        runCurrent()

        assertEquals(2, repo.connectCalls)
        assertEquals(ConnectionState.Connected, repo.state.value)
    }

    @Test
    fun `stops when the user disconnects`() = runTest {
        val repo = FakeRepository()
        val keeper = DefaultDeviceLinkKeeper(repo, backgroundScope)
        keeper.start()
        runCurrent()

        repo.state.value = ConnectionState.Disconnected
        runCurrent()

        assertFalse(keeper.active.value)
        assertEquals(1, repo.connectCalls)
    }

    @Test
    fun `waits for credentials before connecting`() = runTest {
        val repo = FakeRepository()
        val needsKey = CredentialRequirement("k", "Key", "d", CredentialFormat.HEX_16_BYTES)
        repo.devices.value = listOf(repo.devices.value.first().copy(credentialRequirements = listOf(needsKey)))
        DefaultDeviceLinkKeeper(repo, backgroundScope).start()
        runCurrent()
        assertEquals(0, repo.connectCalls)

        repo.devices.value = listOf(repo.devices.value.first().copy(storedCredentialKeys = setOf("k")))
        runCurrent()
        assertEquals(1, repo.connectCalls)
    }

    @Test
    fun `back-off is capped`() {
        assertEquals(2_000L, DefaultDeviceLinkKeeper.backoffMs(0))
        assertEquals(DefaultDeviceLinkKeeper.BACKOFF_MAX_MS, DefaultDeviceLinkKeeper.backoffMs(30))
    }
}
