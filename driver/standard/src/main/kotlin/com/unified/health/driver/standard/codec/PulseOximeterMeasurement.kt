package com.unified.health.driver.standard.codec

import com.unified.health.core.ble.protocol.ByteReader
import java.time.LocalDateTime

/**
 * One SpO2 + pulse rate reading from the Pulse Oximeter Service [Ext: PLXS 1.0 §3.1-3.2; GSS
 * §3.170 PLX Spot-Check Measurement (0x2A5E), §3.169 PLX Continuous Measurement (0x2A5F)].
 */
internal data class PulseOximeterMeasurement(
    val spo2Percent: Double?,
    val pulseRateBpm: Double?,
    /** Device-local time of a spot-check, null for continuous readings or when absent/unset. */
    val timestamp: LocalDateTime?,
    /** Measurement Status bit field, null when the field is absent. */
    val measurementStatus: Int?,
) {
    /** False when the status flags the value as invalid, unavailable, questionable, demo or test data. */
    val isTrustworthy: Boolean
        get() = measurementStatus == null || measurementStatus and UNTRUSTED_STATUS_MASK == 0

    /** Status bit 9: the record was read back from the device's storage (RACP transfer). */
    val fromStorage: Boolean get() = measurementStatus?.hasFlag(STATUS_FROM_STORAGE) == true

    companion object {
        /**
         * Spot-check flags: bit 0 Timestamp present, bit 1 Measurement Status present, bit 2 Device
         * and Sensor Status present, bit 3 Pulse Amplitude Index present, bit 4 device clock not set.
         */
        fun parseSpotCheck(value: ByteArray): PulseOximeterMeasurement {
            val r = ByteReader(value)
            val flags = r.u8()
            val spo2 = r.sfloat()
            val pr = r.sfloat()
            val time = if (flags.hasFlag(0)) SigTypes.dateTime(r) else null
            val status = if (flags.hasFlag(1)) r.u16le() else null
            if (flags.hasFlag(2)) r.u24le()
            if (flags.hasFlag(3)) r.sfloat()
            val clockNotSet = flags.hasFlag(4)
            return PulseOximeterMeasurement(spo2, pr, time.takeUnless { clockNotSet }, status)
        }

        /**
         * Continuous flags: bit 0 SpO2PR-Fast present, bit 1 SpO2PR-Slow present, bit 2 Measurement
         * Status present, bit 3 Device and Sensor Status present, bit 4 Pulse Amplitude Index present.
         * Only the mandatory SpO2PR-Normal pair is reported.
         */
        fun parseContinuous(value: ByteArray): PulseOximeterMeasurement {
            val r = ByteReader(value)
            val flags = r.u8()
            val spo2 = r.sfloat()
            val pr = r.sfloat()
            if (flags.hasFlag(0)) r.skip(4)
            if (flags.hasFlag(1)) r.skip(4)
            val status = if (flags.hasFlag(2)) r.u16le() else null
            if (flags.hasFlag(3)) r.u24le()
            if (flags.hasFlag(4)) r.sfloat()
            return PulseOximeterMeasurement(spo2, pr, null, status)
        }

        const val STATUS_FROM_STORAGE = 9

        /** Bits 10 demo, 11 testing, 13 unavailable, 14 questionable, 15 invalid. */
        const val UNTRUSTED_STATUS_MASK = (1 shl 10) or (1 shl 11) or (1 shl 13) or (1 shl 14) or (1 shl 15)
    }
}
