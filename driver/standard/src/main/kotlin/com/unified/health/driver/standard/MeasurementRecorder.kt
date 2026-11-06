package com.unified.health.driver.standard

import com.unified.health.core.model.HealthRecord
import com.unified.health.core.model.WearableVendor
import com.unified.health.driver.standard.codec.CadenceStepCounter
import com.unified.health.driver.standard.codec.ClinicalMeasurement
import com.unified.health.driver.standard.codec.HeartRateMeasurement
import com.unified.health.driver.standard.codec.PulseOximeterMeasurement
import com.unified.health.driver.standard.codec.RmssdWindow
import com.unified.health.driver.standard.codec.RscMeasurement
import java.time.Clock
import java.time.Duration
import java.time.Instant
import java.time.LocalDateTime
import java.time.ZoneId
import kotlin.math.roundToInt

/**
 * Turns decoded SIG measurements into vendor-neutral [HealthRecord]s and appends them to the
 * device's [SampleBuffer]. Pure state machine (no coroutines); every method is thread-safe
 * because notification pumps of different characteristics run concurrently.
 *
 * @param pulseRateAsHeartRate store the PLX pulse rate as heart rate (only when the device has no
 *  Heart Rate service, otherwise both streams would duplicate each other, D-608).
 * @param onLiveHeartRate called for every heart-rate sample as it arrives.
 */
internal class MeasurementRecorder(
    private val buffer: SampleBuffer,
    private val clock: Clock,
    private val zone: () -> ZoneId,
    private val pulseRateAsHeartRate: Boolean,
    private val onLiveHeartRate: (HealthRecord.HeartRate) -> Unit = {},
) {
    private val lock = Any()
    private val rmssd = RmssdWindow()
    private val steps = CadenceStepCounter()
    private var lastContinuousSpo2: Instant? = null

    fun onHeartRate(value: ByteArray) {
        val m = HeartRateMeasurement.parse(value)
        val now = clock.instant()
        synchronized(lock) {
            if (m.isUsable && m.bpm in HR_RANGE) {
                val sample = HealthRecord.HeartRate(now, m.bpm)
                buffer.add(sample)
                onLiveHeartRate(sample)
            }
            // RR intervals are only meaningful while the strap has skin contact.
            if (m.contactDetected != false && m.rrIntervalsMs.isNotEmpty()) {
                rmssd.add(now, m.rrIntervalsMs)?.let { buffer.add(HealthRecord.HeartRateVariability(now, it)) }
            }
        }
    }

    fun onPlxContinuous(value: ByteArray) {
        val m = PulseOximeterMeasurement.parseContinuous(value)
        if (!m.isTrustworthy) return
        val now = clock.instant()
        synchronized(lock) {
            // Continuous oximeters notify ~1 Hz; one stored SpO2 sample per interval is plenty (D-608).
            val last = lastContinuousSpo2
            if (last != null && Duration.between(last, now) < CONTINUOUS_SPO2_INTERVAL) return
            if (addOximetry(m, now)) lastContinuousSpo2 = now
        }
    }

    /**
     * Live spot-checks and RACP-transferred stored records share this characteristic.
     * @return true when a record was kept.
     */
    fun onPlxSpotCheck(value: ByteArray): Boolean {
        val m = PulseOximeterMeasurement.parseSpotCheck(value)
        if (!m.isTrustworthy) return false
        val time = m.timestamp?.toInstant()
            // A stored record without a usable timestamp cannot be placed in time: drop it.
            ?: if (m.fromStorage) return false else clock.instant()
        return synchronized(lock) { addOximetry(m, time) }
    }

    fun onRsc(value: ByteArray) {
        val m = RscMeasurement.parse(value)
        val now = clock.instant()
        synchronized(lock) {
            steps.add(now, m.cadencePerMinute.coerceIn(0, MAX_CADENCE))?.let { buffer.add(it.toRecord()) }
        }
    }

    fun onClinical(measurement: ClinicalMeasurement, value: ByteArray) {
        val createdAt = measurement.timestamp?.toInstant() ?: clock.instant()
        buffer.add(HealthRecord.RawPayload(WearableVendor.STANDARD, measurement.kind, createdAt, value.copyOf()))
    }

    /** Moves partially aggregated values (open step bucket, short HRV window) into the buffer before a sync. */
    fun flushDerived() {
        val now = clock.instant()
        synchronized(lock) {
            rmssd.flush()?.let { buffer.add(HealthRecord.HeartRateVariability(now, it)) }
            steps.partial(now)?.let { buffer.add(it.toRecord()) }
        }
    }

    private fun addOximetry(m: PulseOximeterMeasurement, time: Instant): Boolean {
        val spo2 = m.spo2Percent?.roundToInt()?.takeIf { it in SPO2_RANGE } ?: return false
        buffer.add(HealthRecord.SpO2(time, spo2))
        if (pulseRateAsHeartRate) {
            m.pulseRateBpm?.roundToInt()?.takeIf { it in HR_RANGE }?.let { buffer.add(HealthRecord.HeartRate(time, it)) }
        }
        return true
    }

    private fun LocalDateTime.toInstant(): Instant = atZone(zone()).toInstant()

    private fun CadenceStepCounter.Bucket.toRecord() = HealthRecord.Steps(start, end, steps)

    companion object {
        val HR_RANGE = 25..250
        val SPO2_RANGE = 50..100
        const val MAX_CADENCE = 250
        val CONTINUOUS_SPO2_INTERVAL: Duration = Duration.ofSeconds(10)
    }
}
