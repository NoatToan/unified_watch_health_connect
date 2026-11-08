package com.unified.health.feature.devices

import com.unified.health.core.domain.repository.PairingCodeBroker
import com.unified.health.core.domain.repository.WearableDeviceRepository
import com.unified.health.core.model.ConnectionState
import com.unified.health.core.model.DiscoveredDevice
import com.unified.health.core.model.PairingCodeRequest
import com.unified.health.core.model.SyncState
import com.unified.health.core.model.VendorIdentifierKeys
import com.unified.health.core.model.WearableDevice
import com.unified.health.core.model.WearableVendor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.emptyFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.test.UnconfinedTestDispatcher
import kotlinx.coroutines.test.advanceTimeBy
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.runCurrent
import kotlinx.coroutines.test.runTest
import kotlinx.coroutines.test.setMain
import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test

@OptIn(ExperimentalCoroutinesApi::class)
class DevicesViewModelTest {

    private class FakeRepository : WearableDeviceRepository {
        val scanFlow = MutableStateFlow<List<DiscoveredDevice>>(emptyList())
        val paired = mutableListOf<DiscoveredDevice>()
        override val pairedDevices: Flow<List<WearableDevice>> = MutableStateFlow(emptyList())
        override val connectionState: Flow<ConnectionState> = MutableStateFlow(ConnectionState.Disconnected)
        override val syncState: Flow<SyncState> = MutableStateFlow(SyncState.Idle)
        override fun scan(): Flow<List<DiscoveredDevice>> = scanFlow
        override suspend fun pair(device: DiscoveredDevice): Result<WearableDevice> {
            paired += device
            return Result.success(WearableDevice(device.macAddress, device.name, device.macAddress, device.vendor))
        }
        override suspend fun connect(deviceId: String): Result<Unit> = Result.success(Unit)
        override suspend fun disconnect(deviceId: String) = Unit
        override suspend fun unpair(deviceId: String) = Unit
        override suspend fun syncNow(deviceId: String): Result<Unit> = Result.success(Unit)
        override suspend fun setCredential(deviceId: String, key: String, value: String): Result<Unit> = Result.success(Unit)
        override suspend fun generateCredential(deviceId: String, key: String): Result<String> = Result.success("")
    }

    private class FakeBroker : PairingCodeBroker {
        override val request = MutableStateFlow<PairingCodeRequest?>(null)
        override fun submit(code: String) = Unit
        override fun cancel() = Unit
    }

    private val repository = FakeRepository()
    private val dispatcher = UnconfinedTestDispatcher()

    @Before
    fun setUp() = Dispatchers.setMain(dispatcher)

    @After
    fun tearDown() = Dispatchers.resetMain()

    private fun viewModel() = DevicesViewModel(repository, FakeBroker())

    private fun zepp(mac: String, name: String = "Amazfit GTR") =
        DiscoveredDevice(name = name, macAddress = mac, rssi = -50, vendor = WearableVendor.ZEPP)

    private fun huawei(name: String, mac: String = "11:22:33:44:55:66") =
        DiscoveredDevice(name = name, macAddress = mac, rssi = -50, vendor = WearableVendor.HUAWEI)

    private fun garmin(mac: String, productNumber: String? = null) = DiscoveredDevice(
        name = "Forerunner 265",
        macAddress = mac,
        rssi = -50,
        vendor = WearableVendor.GARMIN,
        vendorIdentifiers = productNumber?.let { mapOf(VendorIdentifierKeys.GARMIN_PRODUCT_NUMBER to it) } ?: emptyMap(),
    )

    @Test
    fun `Zepp QR hint finds the watch by exact MAC and pairs it`() = runTest(dispatcher) {
        val vm = viewModel()
        backgroundScope.launch { vm.uiState.collect {} }
        repository.scanFlow.value = listOf(zepp("AA:BB:CC:DD:EE:FF"), zepp("11:11:11:11:11:11"))

        vm.onQrCodeScanned("macAddress=AABBCCDDEEFF&pnpNumber=1&pnpVersion=2")

        assertEquals(listOf("AA:BB:CC:DD:EE:FF"), repository.paired.map { it.macAddress })
        assertNull(vm.uiState.value.qrFind)
        assertEquals("Added Amazfit GTR", vm.uiState.value.userMessage)
    }

    @Test
    fun `Huawei QR hint matches by advertised name, case-insensitively`() = runTest(dispatcher) {
        val vm = viewModel()
        backgroundScope.launch { vm.uiState.collect {} }
        repository.scanFlow.value = listOf(huawei("huawei band 8 pro"))

        vm.onQrCodeScanned("t=71&n=HUAWEI Band 8 Pro&r=123456")

        assertEquals(1, repository.paired.size)
        assertEquals("11:22:33:44:55:66", repository.paired.single().macAddress)
    }

    @Test
    fun `Huawei PIN is surfaced on the sheet while scanning, never otherwise exposed`() = runTest(dispatcher) {
        val vm = viewModel()
        backgroundScope.launch { vm.uiState.collect {} }
        // No matching candidate yet: the sheet stays in Scanning and shows the PIN for display only.
        vm.onQrCodeScanned("t=71&n=HUAWEI Band 8 Pro&r=123456")

        assertEquals("123456", vm.uiState.value.qrFind?.huaweiPin)
        assertEquals(QrFindStatus.SCANNING, vm.uiState.value.qrFind?.status)
    }

    @Test
    fun `Huawei name prefix match works when the advertised name has a longer suffix`() = runTest(dispatcher) {
        val vm = viewModel()
        backgroundScope.launch { vm.uiState.collect {} }
        repository.scanFlow.value = listOf(huawei("HUAWEI Band 8-ABC123"))

        vm.onQrCodeScanned("t=71&n=HUAWEI Band 8")

        assertEquals(1, repository.paired.size)
    }

    @Test
    fun `find sheet carries the hint vendor and name, then the matched device once found`() = runTest(dispatcher) {
        val vm = viewModel()
        val qrFindStates = mutableListOf<QrFindUiState?>()
        backgroundScope.launch { vm.uiState.collect { qrFindStates += it.qrFind } }
        val device = huawei("HUAWEI Band 8 Pro")
        repository.scanFlow.value = listOf(device)

        vm.onQrCodeScanned("t=71&n=HUAWEI Band 8 Pro&r=123456")

        val scanning = qrFindStates.first { it?.status == QrFindStatus.SCANNING }
        assertEquals(WearableVendor.HUAWEI, scanning?.vendor)
        assertEquals("HUAWEI Band 8 Pro", scanning?.hintName)
        val found = qrFindStates.first { it?.status == QrFindStatus.FOUND }
        assertEquals(device, found?.matchedDevice)
    }

    @Test
    fun `manual MAC find has no vendor hint`() = runTest(dispatcher) {
        val vm = viewModel()
        backgroundScope.launch { vm.uiState.collect {} }

        vm.findByMacAddress("aa:bb:cc:dd:ee:ff")

        assertNull(vm.uiState.value.qrFind?.vendor)
    }

    @Test
    fun `Garmin QR hint matches by product number when the advertisement carries one`() = runTest(dispatcher) {
        val vm = viewModel()
        backgroundScope.launch { vm.uiState.collect {} }
        repository.scanFlow.value = listOf(
            garmin("22:22:22:22:22:22", productNumber = "006483"),
            garmin("33:33:33:33:33:33", productNumber = "999999"),
        )

        vm.onQrCodeScanned("https://connect.garmin.com/mobile-link/gcm/pair-device?deviceId=1&productNumber=006483")

        assertEquals(listOf("22:22:22:22:22:22"), repository.paired.map { it.macAddress })
    }

    @Test
    fun `Garmin QR hint falls back to the single nearby candidate when no product number was decoded`() = runTest(dispatcher) {
        val vm = viewModel()
        backgroundScope.launch { vm.uiState.collect {} }
        repository.scanFlow.value = listOf(garmin("44:44:44:44:44:44"))

        vm.onQrCodeScanned("https://connect.garmin.com/mobile-link/gcm/pair-device?deviceId=1&productNumber=006483")

        assertEquals(listOf("44:44:44:44:44:44"), repository.paired.map { it.macAddress })
    }

    @Test
    fun `Garmin QR hint stays ambiguous and times out with two unidentified candidates`() = runTest(dispatcher) {
        val vm = viewModel()
        backgroundScope.launch { vm.uiState.collect {} }
        repository.scanFlow.value = listOf(garmin("44:44:44:44:44:44"), garmin("55:55:55:55:55:55"))

        vm.onQrCodeScanned("https://connect.garmin.com/mobile-link/gcm/pair-device?deviceId=1&productNumber=006483")
        assertEquals(QrFindStatus.SCANNING, vm.uiState.value.qrFind?.status)

        advanceTimeBy(30_001L)
        runCurrent()

        assertTrue(repository.paired.isEmpty())
        assertEquals(QrFindStatus.TIMED_OUT, vm.uiState.value.qrFind?.status)
    }

    @Test
    fun `timeout then retry re-runs the same find`() = runTest(dispatcher) {
        val vm = viewModel()
        backgroundScope.launch { vm.uiState.collect {} }
        repository.scanFlow.value = emptyList()

        vm.onQrCodeScanned("macAddress=AABBCCDDEEFF&pnpNumber=1&pnpVersion=2")
        advanceTimeBy(30_001L)
        runCurrent()
        assertEquals(QrFindStatus.TIMED_OUT, vm.uiState.value.qrFind?.status)

        repository.scanFlow.value = listOf(zepp("AA:BB:CC:DD:EE:FF"))
        vm.retryQrFind()

        assertEquals(listOf("AA:BB:CC:DD:EE:FF"), repository.paired.map { it.macAddress })
    }

    @Test
    fun `cancel clears the find sheet`() = runTest(dispatcher) {
        val vm = viewModel()
        backgroundScope.launch { vm.uiState.collect {} }
        repository.scanFlow.value = emptyList()

        vm.onQrCodeScanned("macAddress=AABBCCDDEEFF&pnpNumber=1&pnpVersion=2")
        assertEquals(QrFindStatus.SCANNING, vm.uiState.value.qrFind?.status)

        vm.cancelQrFind()

        assertNull(vm.uiState.value.qrFind)
        assertTrue(repository.paired.isEmpty())
    }

    @Test
    fun `an unparsable but recognisable QR asks the user to choose from the list`() = runTest(dispatcher) {
        val vm = viewModel()
        backgroundScope.launch { vm.uiState.collect {} }

        vm.onQrCodeScanned("https://connect.garmin.com/mobile-link/gcm/pair-device?applicationKey=only-this")

        assertEquals("Garmin QR detected — choose your watch from the list", vm.uiState.value.userMessage)
        assertNull(vm.uiState.value.qrFind)
    }

    @Test
    fun `garbage QR shows a generic message`() = runTest(dispatcher) {
        val vm = viewModel()
        backgroundScope.launch { vm.uiState.collect {} }

        vm.onQrCodeScanned("not a qr code at all")

        assertEquals("Unrecognized QR code", vm.uiState.value.userMessage)
    }

    @Test
    fun `manual MAC entry rejects an invalid address`() = runTest(dispatcher) {
        val vm = viewModel()
        backgroundScope.launch { vm.uiState.collect {} }

        vm.findByMacAddress("not-a-mac")

        assertNull(vm.uiState.value.qrFind)
        assertEquals("Enter a valid MAC address, e.g. AA:BB:CC:DD:EE:FF", vm.uiState.value.userMessage)
    }

    @Test
    fun `manual MAC entry finds and pairs an exact address match`() = runTest(dispatcher) {
        val vm = viewModel()
        backgroundScope.launch { vm.uiState.collect {} }
        repository.scanFlow.value = listOf(zepp("AA:BB:CC:DD:EE:FF"))

        vm.findByMacAddress("aa:bb:cc:dd:ee:ff")

        assertEquals(listOf("AA:BB:CC:DD:EE:FF"), repository.paired.map { it.macAddress })
    }
}
