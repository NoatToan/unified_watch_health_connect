package com.unified.health.core.model

import java.time.Instant
import java.time.LocalDate

/**
 * A record decoded from a wearable during sync. Vendor-neutral on purpose: every driver maps its
 * own wire format onto these types, so storage and Health Connect export never see brand details.
 *
 * Stores must be idempotent: a sync may deliver the same record twice (overlapping time windows,
 * retried transfers), so persist keyed on (device, type, start).
 */
sealed interface HealthRecord {

    data class HeartRate(val time: Instant, val bpm: Int) : HealthRecord

    data class SpO2(val time: Instant, val percent: Int) : HealthRecord

    /** 0..100 stress score. */
    data class Stress(val time: Instant, val score: Int) : HealthRecord

    data class Steps(val start: Instant, val end: Instant, val count: Int) : HealthRecord

    /**
     * Device-computed running totals for one local calendar day. A later record for the same
     * date supersedes an earlier one (use it when the device only exposes cumulative counters).
     */
    data class DailyActivity(
        val date: LocalDate,
        val steps: Int,
        val activeKcal: Int? = null,
        val distanceMeters: Double? = null,
        /** Minutes of brisk activity (Apple "Exercise" ring). */
        val exerciseMinutes: Int? = null,
    ) : HealthRecord

    /** Device-computed resting heart rate for one local calendar day. */
    data class RestingHeartRate(val date: LocalDate, val bpm: Int) : HealthRecord

    /** Heart rate variability (SDNN or RMSSD as reported by the device), in milliseconds. */
    data class HeartRateVariability(val time: Instant, val milliseconds: Int) : HealthRecord

    data class Sleep(val start: Instant, val end: Instant, val stage: SleepStage) : HealthRecord

    /**
     * Device-computed VO2max estimate (mL/kg/min), read back as-is from the watch's own FIT export
     * (D-1000). Never re-derived from raw sensor data here — that would re-implement a vendor's
     * proprietary fitness algorithm (Firstbeat etc.), which is explicitly out of scope (D-803).
     */
    data class Vo2Max(val time: Instant, val value: Int) : HealthRecord

    data class Workout(
        val start: Instant,
        val end: Instant,
        /** Vendor sport name/code normalised to lower_snake_case, e.g. `running`. */
        val sport: String,
        val distanceMeters: Double? = null,
        val activeKcal: Int? = null,
        val avgHeartRate: Int? = null,
        val maxHeartRate: Int? = null,
    ) : HealthRecord

    /**
     * One completed lap/split within a workout (e.g. Garmin FIT `lap`, global mesg 19, D-1093).
     * Keyed to its parent [Workout] by [workoutStart] (that workout's own [Workout.start]) — the
     * sink pairs it with the device id the same way it does for every other [HealthRecord], which
     * together give the same `<deviceId>@<startEpochMs>` primary key [Workout] itself uses
     * (docs/DECISIONS.md D-804).
     */
    data class WorkoutLap(
        val workoutStart: Instant,
        /** 0-based position of this lap within the workout, in recording order. */
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
    ) : HealthRecord

    /**
     * One instantaneous reading recorded during a workout (e.g. Garmin FIT `record`, global mesg 20,
     * D-1093), keyed to its parent [Workout] the same way as [WorkoutLap]. [latitude]/[longitude] are
     * parsed and stored for a future route-map view but have no map UI yet (docs/DECISIONS.md D-1093).
     */
    data class WorkoutSample(
        val workoutStart: Instant,
        val time: Instant,
        val latitude: Double? = null,
        val longitude: Double? = null,
        val altitudeMeters: Double? = null,
        val heartRate: Int? = null,
        val cadence: Int? = null,
        val speedMps: Double? = null,
    ) : HealthRecord

    /**
     * Original vendor payload (e.g. a Garmin FIT file) kept so it can be re-decoded when a parser
     * improves. [kind] is a driver-defined, filesystem-safe label such as `fit_monitoring`.
     */
    class RawPayload(
        val vendor: WearableVendor,
        val kind: String,
        val createdAt: Instant?,
        val bytes: ByteArray,
    ) : HealthRecord
}
