package com.unified.health.core.domain.repository

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
}
