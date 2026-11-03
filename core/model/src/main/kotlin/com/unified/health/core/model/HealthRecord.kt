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
    ) : HealthRecord

    data class Sleep(val start: Instant, val end: Instant, val stage: SleepStage) : HealthRecord

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
