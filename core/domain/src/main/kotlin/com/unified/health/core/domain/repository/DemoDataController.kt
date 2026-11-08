package com.unified.health.core.domain.repository

/**
 * Debug-only tool behind Profile > Developer, usable once [DemoModeController] is on: fills local
 * storage with deterministic demo data ("Fill demo data") or wipes only that demo data ("Clear demo
 * data"). Bound only in debug builds (absent from the release graph), so callers inject it as
 * `Optional<DemoDataController>`.
 */
interface DemoDataController {
    /**
     * Writes [days] days of demo data ending now into the real local store, through the same sink a
     * wearable sync uses. Idempotent: running it twice leaves the same rows.
     * @return number of records written.
     */
    suspend fun seed(days: Int = DEFAULT_DAYS): Int

    /**
     * Deletes only the rows tagged with a demo/virtual device id (samples and workouts). Real watch
     * data is never touched, even if a real device happens to be paired at the same time.
     */
    suspend fun clearDemoData()

    companion object {
        const val DEFAULT_DAYS = 90
    }
}
