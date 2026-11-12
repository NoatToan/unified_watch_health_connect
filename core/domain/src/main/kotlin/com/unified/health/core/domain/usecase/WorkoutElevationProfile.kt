package com.unified.health.core.domain.usecase

/**
 * Elevation gain/descent + altitude range from a workout's altitude samples (docs/DECISIONS.md
 * D-1201). Used as the *fallback* only when a workout's laps carry no ascent/descent of their own —
 * see [com.unified.health.feature.activity.detail.WorkoutDetailViewModel].
 */
data class WorkoutElevationProfile(
    val gainMeters: Double,
    val descentMeters: Double,
    val maxAltitudeMeters: Double,
    val minAltitudeMeters: Double,
)

/**
 * Sums positive/negative altitude deltas with a small hysteresis band (docs/re-evidence/huawei/
 * workout_detail_metrics.md §9: "Huawei uses a smoothed altitude manager; raw sum needs hysteresis",
 * D-1201) — a plain sample-to-sample delta sum would massively overcount gain/descent on a noisy
 * barometer/GPS altitude trace.
 */
object WorkoutElevation {

    /** §9's suggested band ("a small hysteresis, e.g. 2-3 m"). */
    const val DEFAULT_HYSTERESIS_METERS = 2.5

    /**
     * Tracks an "anchor" altitude and only attributes a change to gain or descent once the net move
     * away from it clears [hysteresisMeters]; the anchor then resets to that sample, so back-and-forth
     * noise under the threshold never accumulates. Null without any altitude sample.
     */
    fun fromAltitudeSamples(altitudes: List<Double>, hysteresisMeters: Double = DEFAULT_HYSTERESIS_METERS): WorkoutElevationProfile? {
        if (altitudes.isEmpty()) return null
        if (altitudes.size == 1) {
            val only = altitudes.first()
            return WorkoutElevationProfile(gainMeters = 0.0, descentMeters = 0.0, maxAltitudeMeters = only, minAltitudeMeters = only)
        }
        var gain = 0.0
        var descent = 0.0
        var anchor = altitudes.first()
        for (i in 1 until altitudes.size) {
            val delta = altitudes[i] - anchor
            when {
                delta >= hysteresisMeters -> {
                    gain += delta
                    anchor = altitudes[i]
                }
                delta <= -hysteresisMeters -> {
                    descent += -delta
                    anchor = altitudes[i]
                }
            }
        }
        return WorkoutElevationProfile(gain, descent, altitudes.max(), altitudes.min())
    }
}
