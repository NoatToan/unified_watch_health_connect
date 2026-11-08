package com.unified.health.core.domain.repository

import kotlinx.coroutines.flow.StateFlow

/**
 * Runtime switch behind Profile > Developer: default OFF, persisted (DataStore). While off the app
 * behaves exactly like production — no virtual/mock watches in scan results, no mock driver
 * recognition, no seeded data. Turning it on makes the simulated watches (`:core:demo`) show up in
 * scan immediately, no restart required.
 *
 * Bound only in debug/androidTest builds (absent from the release graph, see D-006/D-201/D-203), so
 * callers inject it as `Optional<DemoModeController>` and hide any demo-only UI when it is empty.
 */
interface DemoModeController {
    /** Current value, observable so scanning/driver recognition react without an app restart. */
    val enabled: StateFlow<Boolean>

    suspend fun setEnabled(enabled: Boolean)
}
