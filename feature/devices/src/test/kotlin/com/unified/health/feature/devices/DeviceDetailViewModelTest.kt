package com.unified.health.feature.devices

import androidx.lifecycle.SavedStateHandle
import com.unified.health.core.domain.repository.WearableDeviceRepository
import com.unified.health.core.model.ConnectionState
import com.unified.health.core.model.DiscoveredDevice
import com.unified.health.core.model.SyncState
import com.unified.health.core.model.WearableDevice
import com.unified.health.core.model.WearableVendor
import com.unified.health.feature.devices.detail.DeviceDetailUiState
import com.unified.health.feature.devices.detail.DeviceDetailViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.emptyFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import kotlinx.coroutines.test.UnconfinedTestDispatcher
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.runTest
import kotlinx.coroutines.test.setMain
import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertNull
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test

@OptIn(ExperimentalCoroutinesApi::class)
class DeviceDetailViewModelTest {

    private class FakeRepository : WearableDeviceRepository {
        val devices = MutableStateFlow(listOf(WearableDevice("W1", "Watch", "W1", WearableVendor.HUAWEI, connectionState = ConnectionState.Connected)))
        val calls = mutableListOf<String>()
        var syncResult: Result<Unit> = Result.success(Unit)
        var reprocessResult: Result<Int> = Result.success(0)
        override val pairedDevices: Flow<List<WearableDevice>> = devices
        override val connectionState: Flow<ConnectionState> = MutableStateFlow(ConnectionState.Connected)
        override val syncState = MutableStateFlow<SyncState>(SyncState.Idle)
        override fun scan(): Flow<List<DiscoveredDevice>> = emptyFlow()
        override suspend fun pair(device: DiscoveredDevice): Result<WearableDevice> = Result.failure(UnsupportedOperationException())
        override suspend fun connect(deviceId: String): Result<Unit> { calls += "connect:$deviceId"; return Result.success(Unit) }
        override suspend fun disconnect(deviceId: String) { calls += "disconnect:$deviceId" }
        override suspend fun unpair(deviceId: String) {
            calls += "unpair:$deviceId"
            devices.update { list -> list.filterNot { it.id == deviceId } }
        }
        override suspend fun syncNow(deviceId: String): Result<Unit> { calls += "sync:$deviceId"; return syncResult }
        override suspend fun reprocessRawPayloads(deviceId: String): Result<Int> { calls += "reprocess:$deviceId"; return reprocessResult }
        override suspend fun setCredential(deviceId: String, key: String, value: String): Result<Unit> = Result.success(Unit)
        override suspend fun generateCredential(deviceId: String, key: String): Result<String> = Result.success("")
    }

    private val repository = FakeRepository()

    /** Shared with runTest so the ViewModel's Main work and the test run on one scheduler. */
    private val dispatcher = UnconfinedTestDispatcher()

    @Before
    fun setUp() = Dispatchers.setMain(dispatcher)

    @After
    fun tearDown() = Dispatchers.resetMain()

    private fun viewModel(id: String = "W1") = DeviceDetailViewModel(SavedStateHandle(mapOf("deviceId" to id)), repository)

    @Test
    fun `shows the requested device`() = runTest(dispatcher) {
        val vm = viewModel()
        backgroundScope.launch { vm.uiState.collect {} }
        val state = vm.uiState.value as DeviceDetailUiState.Success
        assertEquals("Watch", state.device.name)
        assertFalse(state.busy)
    }

    @Test
    fun `unknown device is gone but not unpaired`() = runTest(dispatcher) {
        val vm = viewModel("nope")
        backgroundScope.launch { vm.uiState.collect {} }
        assertEquals(DeviceDetailUiState.Gone(unpaired = false), vm.uiState.value)
    }

    @Test
    fun `sync now syncs this device and reports the result`() = runTest(dispatcher) {
        val vm = viewModel()
        backgroundScope.launch { vm.uiState.collect {} }
        vm.syncNow()
        assertEquals(listOf("sync:W1"), repository.calls)
        assertEquals("Sync complete", (vm.uiState.value as DeviceDetailUiState.Success).message)
        vm.messageShown()
        assertNull((vm.uiState.value as DeviceDetailUiState.Success).message)
    }

    @Test
    fun `failed sync surfaces the error`() = runTest(dispatcher) {
        repository.syncResult = Result.failure(IllegalStateException("Device is not connected"))
        val vm = viewModel()
        backgroundScope.launch { vm.uiState.collect {} }
        vm.syncNow()
        assertEquals("Device is not connected", (vm.uiState.value as DeviceDetailUiState.Success).message)
    }

    @Test
    fun `unpair removes the device and closes the screen`() = runTest(dispatcher) {
        val vm = viewModel()
        backgroundScope.launch { vm.uiState.collect {} }
        vm.unpair()
        assertTrue("unpair:W1" in repository.calls)
        assertEquals(DeviceDetailUiState.Gone(unpaired = true), vm.uiState.value)
    }

    @Test
    fun `reprocess recovers stored raw payloads and reports how many records`() = runTest(dispatcher) {
        repository.reprocessResult = Result.success(3)
        val vm = viewModel()
        backgroundScope.launch { vm.uiState.collect {} }
        vm.reprocessRawPayloads()
        assertEquals(listOf("reprocess:W1"), repository.calls)
        assertEquals("Recovered 3 record(s)", (vm.uiState.value as DeviceDetailUiState.Success).message)
    }

    @Test
    fun `failed reprocess surfaces the error`() = runTest(dispatcher) {
        repository.reprocessResult = Result.failure(IllegalStateException("No driver registered"))
        val vm = viewModel()
        backgroundScope.launch { vm.uiState.collect {} }
        vm.reprocessRawPayloads()
        assertEquals("No driver registered", (vm.uiState.value as DeviceDetailUiState.Success).message)
    }

    @Test
    fun `connect and disconnect target this device`() = runTest(dispatcher) {
        val vm = viewModel()
        backgroundScope.launch { vm.uiState.collect {} }
        vm.disconnect()
        vm.connect()
        assertEquals(listOf("disconnect:W1", "connect:W1"), repository.calls)
    }
}
