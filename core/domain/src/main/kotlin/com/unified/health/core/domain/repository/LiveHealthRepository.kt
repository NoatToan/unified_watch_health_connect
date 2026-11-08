package com.unified.health.core.domain.repository

import com.unified.health.core.model.HealthMetricType
import com.unified.health.core.model.LiveHeartRate
import kotlinx.coroutines.flow.StateFlow

/**
 * Real-time readings streamed by the connected watch. The value is retained, so a collector that
 * starts late (app opened) gets the latest reading immediately. The watch's sensor runs only
 * while at least one collector is active (plus a short grace period), to save battery on both devices.
 */
interface LiveHealthRepository {
    /** Null until a reading arrives; check [LiveHeartRate.time] for staleness. */
    val heartRate: StateFlow<LiveHeartRate?>

    /**
     * Metrics actively streaming from the connected device *right now* (D-1054): a reading has
     * arrived within the last few seconds, not merely "a device is connected" or "a cached value
     * exists". Drives the green/gray live dot on a metric's card. Only [HealthMetricType.HEART_RATE]
     * has a live mode today ([heartRate]); other metrics are simply never present in this set until
     * their own driver exposes a live stream.
     */
    val liveMetrics: StateFlow<Set<HealthMetricType>>
}
