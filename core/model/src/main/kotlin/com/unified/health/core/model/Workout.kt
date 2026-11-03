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
) {
    val duration: Duration get() = Duration.between(start, end)
}

/** Where a record came from; used for de-duplication with Health Connect. */
enum class DataSource { WEARABLE, PHONE, HEALTH_CONNECT, MANUAL }
