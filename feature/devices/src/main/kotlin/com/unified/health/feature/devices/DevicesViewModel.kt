package com.unified.health.feature.devices

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.unified.health.core.domain.repository.PairingCodeBroker
import com.unified.health.core.domain.repository.WearableDeviceRepository
import com.unified.health.core.model.DiscoveredDevice
import com.unified.health.core.model.PairingCodeRequest
import com.unified.health.core.model.SyncState
import com.unified.health.core.model.WearableDevice
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.combine
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
)

/** A key the app just created and is about to write to the watch; shown once so the user can back it up. */
data class GeneratedKey(val deviceName: String, val label: String, val hex: String)

private data class ScanState(
    val generatedKey: GeneratedKey? = null,
    val discovered: List<DiscoveredDevice> = emptyList(),
    val isScanning: Boolean = false,
    val message: String? = null,
)

@HiltViewModel
class DevicesViewModel @Inject constructor(
    private val repository: WearableDeviceRepository,
    private val pairingCodes: PairingCodeBroker,
) : ViewModel() {

    private val scan = MutableStateFlow(ScanState())
    private var scanJob: Job? = null

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
    }
}
