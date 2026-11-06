package com.unified.health.feature.devices.detail

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.unified.health.core.domain.repository.WearableDeviceRepository
import com.unified.health.core.model.SyncState
import com.unified.health.core.model.WearableDevice
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

sealed interface DeviceDetailUiState {
    data object Loading : DeviceDetailUiState

    /** Not (or no longer) paired. [unpaired] = the user just removed it here, so the screen closes. */
    data class Gone(val unpaired: Boolean) : DeviceDetailUiState

    data class Success(
        val device: WearableDevice,
        /** Sync progress of the app's single link; only meaningful while this device is the connected one. */
        val syncState: SyncState,
        val busy: Boolean = false,
        val message: String? = null,
    ) : DeviceDetailUiState
}

private data class LocalState(val busy: Boolean = false, val message: String? = null, val unpaired: Boolean = false)

@HiltViewModel
class DeviceDetailViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle,
    private val repository: WearableDeviceRepository,
) : ViewModel() {

    /** Argument of [com.unified.health.feature.devices.navigation.DeviceDetailDestination], stored under its property name. */
    private val deviceId: String = checkNotNull(savedStateHandle[ARG_DEVICE_ID]) { "Missing $ARG_DEVICE_ID" }

    private val local = MutableStateFlow(LocalState())

    val uiState: StateFlow<DeviceDetailUiState> =
        combine(repository.pairedDevices, repository.syncState, local) { paired, sync, l ->
            val device = paired.firstOrNull { it.id == deviceId }
            if (device == null) {
                DeviceDetailUiState.Gone(unpaired = l.unpaired)
            } else {
                DeviceDetailUiState.Success(device, sync, l.busy, l.message)
            }
        }.stateIn(viewModelScope, SharingStarted.WhileSubscribed(5_000), DeviceDetailUiState.Loading)

    fun syncNow() = run(success = "Sync complete") { repository.syncNow(deviceId) }

    fun connect() = run(success = null) { repository.connect(deviceId) }

    fun disconnect() = run(success = null) {
        repository.disconnect(deviceId)
        Result.success(Unit)
    }

    fun unpair() = run(success = null) {
        repository.unpair(deviceId)
        local.update { it.copy(unpaired = true) }
        Result.success(Unit)
    }

    fun messageShown() = local.update { it.copy(message = null) }

    private fun run(success: String?, block: suspend () -> Result<Unit>) {
        if (local.value.busy) return
        viewModelScope.launch {
            local.update { it.copy(busy = true) }
            val result = runCatching { block() }.getOrElse { Result.failure(it) }
            val message = result.fold(onSuccess = { success }, onFailure = { it.message ?: "Operation failed" })
            local.update { it.copy(busy = false, message = message ?: it.message) }
        }
    }

    internal companion object {
        const val ARG_DEVICE_ID = "deviceId"
    }
}
