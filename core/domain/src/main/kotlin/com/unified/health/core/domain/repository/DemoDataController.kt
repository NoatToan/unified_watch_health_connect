package com.unified.health.core.domain.repository

/**
 * Debug-only tool behind Profile > Developer: fills local storage with deterministic demo data or
 * wipes it. Bound only in debug builds (absent from the release graph), so callers inject it as
 * `Optional<DemoDataController>`.
 */
interface DemoDataController {
    /**
     * Writes [days] days of demo data ending now into the real local store, through the same sink a
     * wearable sync uses. Idempotent: running it twice leaves the same rows.
     * @return number of records written.
     */
    suspend fun seed(days: Int = DEFAULT_DAYS): Int

    /** Deletes every stored health record (samples and workouts). Paired devices are kept. */
    suspend fun clearHealthData()

    companion object {
        const val DEFAULT_DAYS = 90
    }
}
