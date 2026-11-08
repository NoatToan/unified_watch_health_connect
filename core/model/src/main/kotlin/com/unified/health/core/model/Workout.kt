package com.unified.health.core.model

import java.time.Duration
import java.time.Instant

enum class WorkoutType { WALKING, RUNNING, CYCLING, SWIMMING, STRENGTH, YOGA, OTHER }

data class Workout(
    val id: String,
    val type: WorkoutType,
    val start: Instant,
    val end: Instant,
    val distanceMeters: Double? = null,
    val activeKcal: Int? = null,
    val avgHeartRate: Int? = null,
    val maxHeartRate: Int? = null,
    val source: DataSource = DataSource.WEARABLE,
    /** Id (MAC) of the paired device that recorded it, for source attribution; null when unknown. */
    val sourceDeviceId: String? = null,
) {
    val duration: Duration get() = Duration.between(start, end)
}

/** Where a record came from; used for de-duplication with Health Connect. */
enum class DataSource { WEARABLE, PHONE, HEALTH_CONNECT, MANUAL }

/**
 * One split/lap within a [Workout] (docs/DECISIONS.md D-1093), read back by
 * [com.unified.health.core.domain.repository.HealthDataRepository.observeWorkoutLaps].
 */
data class WorkoutLap(
    /** 0-based position within the workout, in recording order. */
    val index: Int,
    val start: Instant,
    val end: Instant,
    val distanceMeters: Double? = null,
    val calories: Int? = null,
    val avgSpeedMps: Double? = null,
    val maxSpeedMps: Double? = null,
    val avgHeartRate: Int? = null,
    val maxHeartRate: Int? = null,
    val avgCadence: Int? = null,
    val maxCadence: Int? = null,
    val ascentMeters: Double? = null,
    val descentMeters: Double? = null,
) {
    val duration: Duration get() = Duration.between(start, end)
}

/**
 * One instantaneous reading recorded during a [Workout] (docs/DECISIONS.md D-1093), read back by
 * [com.unified.health.core.domain.repository.HealthDataRepository.observeWorkoutSamples]. GPS
 * [latitude]/[longitude] are carried for a future route map but have no UI yet (D-1093).
 */
data class WorkoutSample(
    val time: Instant,
    val latitude: Double? = null,
    val longitude: Double? = null,
    val altitudeMeters: Double? = null,
    val heartRate: Int? = null,
    val cadence: Int? = null,
    val speedMps: Double? = null,
)
