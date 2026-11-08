package com.unified.health.core.demo.mode

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import com.unified.health.core.domain.repository.DemoModeController
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.runBlocking
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Persists the "Demo mode" switch in the shared preferences [DataStore] (same file as
 * `DataStoreUserPreferencesRepository`), default off. [enabled] is a hot [StateFlow] so the
 * virtual-device/driver contributors in this module can read its current value synchronously on
 * every scan/connect attempt (see `GatedVirtualDevice`), without a restart when the user flips the
 * switch in Settings.
 */
@Singleton
class DemoModeControllerImpl @Inject constructor(
    private val dataStore: DataStore<Preferences>,
) : DemoModeController {

    private val scope = CoroutineScope(SupervisorJob() + Dispatchers.Default)

    // Seeded synchronously so the very first scan after process start already sees the persisted
    // value, then kept current by the background collector below.
    private val state = MutableStateFlow(runBlocking { readPersisted() })

    override val enabled: StateFlow<Boolean> = state.asStateFlow()

    init {
        dataStore.data
            .map { it[KEY] ?: false }
            .distinctUntilChanged()
            .onEach { state.value = it }
            .launchIn(scope)
    }

    override suspend fun setEnabled(enabled: Boolean) {
        dataStore.edit { it[KEY] = enabled }
    }

    private suspend fun readPersisted(): Boolean = dataStore.data.first()[KEY] ?: false

    private companion object {
        val KEY = booleanPreferencesKey("demo_mode_enabled")
    }
}
