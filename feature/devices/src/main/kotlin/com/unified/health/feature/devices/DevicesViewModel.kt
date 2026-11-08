package com.unified.health.feature.devices

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.unified.health.core.domain.repository.PairingCodeBroker
import com.unified.health.core.domain.repository.WearableDeviceRepository
import com.unified.health.core.model.DiscoveredDevice
import com.unified.health.core.model.MacAddressFormat
import com.unified.health.core.model.PairingCodeRequest
import com.unified.health.core.model.QrPairingHint
import com.unified.health.core.model.QrPairingParser
import com.unified.health.core.model.SyncState
import com.unified.health.core.model.VendorIdentifierKeys
import com.unified.health.core.model.WearableDevice
import com.unified.health.core.model.WearableVendor
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.firstOrNull
import kotlinx.coroutines.flow.mapNotNull
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import kotlinx.coroutines.withTimeoutOrNull
import javax.inject.Inject

data class DevicesUiState(
    val pairedDevices: List<WearableDevice> = emptyList(),
    val discovered: List<DiscoveredDevice> = emptyList(),
    val isScanning: Boolean = false,
    val syncState: SyncState = SyncState.Idle,
    val userMessage: String? = null,
    val pairingCodeRequest: PairingCodeRequest? = null,
    val generatedKey: GeneratedKey? = null,
    val isLoading: Boolean = true,
    /** Non-null while "Pair with QR code" (or the manual MAC fallback) is looking for a specific watch. */
    val qrFind: QrFindUiState? = null,
)

/** A key the app just created and is about to write to the watch; shown once so the user can back it up. */
data class GeneratedKey(val deviceName: String, val label: String, val hex: String)

enum class QrFindStatus { SCANNING, TIMED_OUT }

/**
 * State for the "Looking for <watch>" bottom sheet. [huaweiPin] is set only for a Huawei QR scan
 * that carried a PIN; it is never persisted and never logged (`docs/DECISIONS.md` D-902) — shown
 * once here, for this attempt only, so the user can type it on the watch if asked.
 */
data class QrFindUiState(
    val label: String,
    val status: QrFindStatus,
    val huaweiPin: String? = null,
)

private data class ScanState(
    val generatedKey: GeneratedKey? = null,
    val discovered: List<DiscoveredDevice> = emptyList(),
    val isScanning: Boolean = false,
    val message: String? = null,
    val qrFind: QrFindUiState? = null,
)

@HiltViewModel
class DevicesViewModel @Inject constructor(
    private val repository: WearableDeviceRepository,
    private val pairingCodes: PairingCodeBroker,
) : ViewModel() {

    private val scan = MutableStateFlow(ScanState())
    private var scanJob: Job? = null
    private var qrFindJob: Job? = null
    private var pendingQrRetry: (() -> Unit)? = null

    val uiState: StateFlow<DevicesUiState> =
        combine(repository.pairedDevices, repository.syncState, scan, pairingCodes.request) { paired, sync, scanState, codeRequest ->
            val pairedMacs = paired.map { it.macAddress }.toSet()
            DevicesUiState(
                pairedDevices = paired,
                discovered = scanState.discovered.filterNot { it.macAddress in pairedMacs },
                isScanning = scanState.isScanning,
                syncState = sync,
                userMessage = scanState.message,
                pairingCodeRequest = codeRequest,
                generatedKey = scanState.generatedKey,
                isLoading = false,
                qrFind = scanState.qrFind,
            )
        }.stateIn(viewModelScope, SharingStarted.WhileSubscribed(5_000), DevicesUiState())

    fun startScan() {
        if (scanJob?.isActive == true) return
        scanJob = viewModelScope.launch {
            scan.update { it.copy(isScanning = true, discovered = emptyList()) }
            withTimeoutOrNull(SCAN_TIMEOUT_MS) {
                repository.scan().collect { found -> scan.update { it.copy(discovered = found) } }
            }
            scan.update { it.copy(isScanning = false) }
        }
    }

    fun stopScan() {
        scanJob?.cancel()
        scan.update { it.copy(isScanning = false) }
    }

    fun pair(device: DiscoveredDevice) = launchWithMessage(success = "Added ${device.name}") {
        stopScan()
        repository.pair(device).map { }
    }

    /** "Pair with QR code": parse the scanned text and, for a recognised vendor, start looking for that watch. */
    fun onQrCodeScanned(raw: String) {
        val hint = QrPairingParser.parse(raw)
        if (hint != null) {
            startFind(label = labelFor(hint), huaweiPin = (hint as? QrPairingHint.Huawei)?.pin) { discovered -> selectMatch(discovered, hint) }
            return
        }
        val brand = QrPairingParser.isLikelyVendorQr(raw)
        val message = if (brand != null) {
            "${brand.displayName} QR detected — choose your watch from the list"
        } else {
            "Unrecognized QR code"
        }
        scan.update { it.copy(message = message) }
    }

    /** "Enter MAC address" manual fallback: same targeted find, keyed by an exact address instead of a hint. */
    fun findByMacAddress(raw: String) {
        val mac = MacAddressFormat.normalizeOrNull(raw)
        if (mac == null) {
            scan.update { it.copy(message = "Enter a valid MAC address, e.g. AA:BB:CC:DD:EE:FF") }
            return
        }
        startFind(label = "your watch ($mac)") { discovered -> discovered.firstOrNull { it.macAddress.equals(mac, ignoreCase = true) } }
    }

    /** Timed-out sheet: "Try again" with the same hint/address. */
    fun retryQrFind() = pendingQrRetry?.invoke()

    /** Cancel button. */
    fun cancelQrFind() {
        qrFindJob?.cancel()
        scan.update { it.copy(qrFind = null) }
    }

    /** "Choose from list" after a timeout: close the sheet and fall back to the normal nearby-devices scan. */
    fun chooseFromListInsteadOfQr() {
        cancelQrFind()
        startScan()
    }

    private fun startFind(label: String, huaweiPin: String? = null, select: (List<DiscoveredDevice>) -> DiscoveredDevice?) {
        stopScan()
        qrFindJob?.cancel()
        pendingQrRetry = { startFind(label, huaweiPin, select) }
        scan.update { it.copy(qrFind = QrFindUiState(label, QrFindStatus.SCANNING, huaweiPin)) }
        qrFindJob = viewModelScope.launch {
            val match = withTimeoutOrNull(QR_FIND_TIMEOUT_MS) {
                repository.scan().mapNotNull(select).firstOrNull()
            }
            if (match != null) {
                scan.update { it.copy(qrFind = null) }
                pair(match)
            } else {
                scan.update { it.copy(qrFind = it.qrFind?.copy(status = QrFindStatus.TIMED_OUT)) }
            }
        }
    }

    /** Per-vendor match rule (`QR_PAIRING_ANALYSIS.md` §6.2): Zepp by exact MAC, Huawei by advertised
     *  name, Garmin by vendor + product number when it could be read from the advertisement, else
     *  (uncertain decode) by "exactly one nearby Garmin candidate" — ambiguous cases wait for the
     *  timeout and fall back to the device list rather than guessing. */
    private fun selectMatch(discovered: List<DiscoveredDevice>, hint: QrPairingHint): DiscoveredDevice? = when (hint) {
        is QrPairingHint.Zepp -> discovered.firstOrNull { it.macAddress.equals(hint.mac, ignoreCase = true) }
        is QrPairingHint.Huawei -> discovered.firstOrNull {
            it.name.equals(hint.btName, ignoreCase = true) || it.name.startsWith(hint.btName, ignoreCase = true)
        }
        is QrPairingHint.Garmin -> {
            val candidates = discovered.filter { it.vendor == WearableVendor.GARMIN }
            val byProductNumber = hint.productNumber?.let { productNumber ->
                candidates.firstOrNull { it.vendorIdentifiers[VendorIdentifierKeys.GARMIN_PRODUCT_NUMBER] == productNumber }
            }
            byProductNumber ?: candidates.singleOrNull()
        }
    }

    private fun labelFor(hint: QrPairingHint): String = when (hint) {
        is QrPairingHint.Zepp -> "your Zepp/Amazfit watch (${hint.mac})"
        is QrPairingHint.Huawei -> hint.btName
        is QrPairingHint.Garmin -> "your Garmin watch" + (hint.productNumber?.let { " ($it)" } ?: "")
    }

    fun connect(device: WearableDevice) = launchWithMessage(success = null) { repository.connect(device.id) }

    fun disconnect(device: WearableDevice) = launchWithMessage(success = null) {
        repository.disconnect(device.id)
        Result.success(Unit)
    }

    fun syncNow(device: WearableDevice) = launchWithMessage(success = "Sync complete") { repository.syncNow(device.id) }

    fun unpair(device: WearableDevice) = launchWithMessage(success = "${device.name} removed") {
        repository.unpair(device.id)
        Result.success(Unit)
    }

    fun setCredential(device: WearableDevice, key: String, value: String) = launchWithMessage(success = "Saved. Connecting…") {
        repository.setCredential(device.id, key, value).also { saved ->
            if (saved.isSuccess) repository.connect(device.id).onFailure { return@launchWithMessage Result.failure(it) }
        }
    }

    fun generateCredential(device: WearableDevice, key: String) {
        viewModelScope.launch {
            val requirement = device.credentialRequirements.firstOrNull { it.key == key } ?: return@launch
            repository.generateCredential(device.id, key).fold(
                onSuccess = { hex ->
                    scan.update { it.copy(generatedKey = GeneratedKey(device.name, requirement.label, hex), message = "Key created. Connecting; confirm on the watch if it asks.") }
                    repository.connect(device.id).onFailure { error ->
                        scan.update { it.copy(message = error.message ?: "Bind failed") }
                    }
                },
                onFailure = { error -> scan.update { it.copy(message = error.message ?: "Could not create a key") } },
            )
        }
    }

    fun generatedKeyShown() = scan.update { it.copy(generatedKey = null) }

    fun submitPairingCode(code: String) = pairingCodes.submit(code)

    fun cancelPairingCode() = pairingCodes.cancel()

    fun messageShown() = scan.update { it.copy(message = null) }

    private fun launchWithMessage(success: String?, block: suspend () -> Result<Unit>) {
        viewModelScope.launch {
            val result = block()
            val message = result.fold(onSuccess = { success }, onFailure = { it.message ?: "Operation failed" })
            if (message != null) scan.update { it.copy(message = message) }
        }
    }

    private companion object {
        const val SCAN_TIMEOUT_MS = 15_000L

        /** Matches the vendor apps' own address-filtered-scan timeout (`QR_PAIRING_ANALYSIS.md` §2.3, §6.2). */
        const val QR_FIND_TIMEOUT_MS = 30_000L
    }
}
