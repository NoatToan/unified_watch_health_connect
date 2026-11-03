package com.unified.health.core.data.link

import com.unified.health.core.domain.repository.DeviceLinkKeeper
import com.unified.health.core.domain.repository.WearableDeviceRepository
import com.unified.health.core.model.ConnectionState
import com.unified.health.core.model.WearableDevice
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.launch
import java.time.Duration
import java.time.Instant
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Event-driven (no polling): it suspends on connection-state flows and only wakes to connect,
 * back off, or run an incremental sync after a (re)connect.
 */
@Singleton
internal class DefaultDeviceLinkKeeper(
    private val repository: WearableDeviceRepository,
    private val scope: CoroutineScope,
    private val now: () -> Instant = Instant::now,
) : DeviceLinkKeeper {

    @Inject
    constructor(repository: WearableDeviceRepository) :
        this(repository, CoroutineScope(SupervisorJob() + Dispatchers.Default))

    private val _active = MutableStateFlow(false)
    override val active: StateFlow<Boolean> = _active.asStateFlow()
    private var job: Job? = null

    @Synchronized
    override fun start() {
        if (job?.isActive == true) return
        _active.value = true
        job = scope.launch {
            try {
                keep()
            } finally {
                _active.value = false
            }
        }
    }

    @Synchronized
    override fun stop() {
        job?.cancel()
        job = null
    }

    private suspend fun keep() {
        var failures = 0
        while (true) {
            when (repository.connectionState.first()) {
                ConnectionState.Connected -> {
                    failures = 0
                    // Link loss is an Error (retry); a plain Disconnected is the user's choice (stop).
                    if (repository.connectionState.first { it !is ConnectionState.Connected } is ConnectionState.Disconnected) return
                    delay(backoffMs(failures++))
                }
                ConnectionState.Connecting, ConnectionState.Authenticating ->
                    repository.connectionState.first { it !is ConnectionState.Connecting && it !is ConnectionState.Authenticating }
                else -> {
                    val device = pickDevice()
                    if (repository.connect(device.id).isSuccess) {
                        syncIfStale(device)
                    } else {
                        delay(backoffMs(failures++))
                    }
                }
            }
        }
    }

    /** Waits until a device that can connect (all credentials present) is paired; prefers the one synced most recently. */
    private suspend fun pickDevice(): WearableDevice {
        val devices = repository.pairedDevices.first { list -> list.any { it.missingCredentials.isEmpty() } }
        return devices.filter { it.missingCredentials.isEmpty() }.maxBy { it.lastSyncedAt ?: Instant.EPOCH }
    }

    private suspend fun syncIfStale(device: WearableDevice) {
        val last = device.lastSyncedAt
        if (last == null || Duration.between(last, now()) >= MIN_SYNC_GAP) repository.syncNow(device.id)
    }

    companion object {
        val MIN_SYNC_GAP: Duration = Duration.ofMinutes(5)
        const val BACKOFF_BASE_MS = 2_000L
        const val BACKOFF_MAX_MS = 300_000L

        /** 2 s, 4 s, 8 s … capped at 5 min. */
        fun backoffMs(failures: Int): Long =
            (BACKOFF_BASE_MS shl failures.coerceIn(0, 16)).coerceAtMost(BACKOFF_MAX_MS)
    }
}
