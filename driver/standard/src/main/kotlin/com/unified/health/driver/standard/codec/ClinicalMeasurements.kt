package com.unified.health.driver.standard.codec

import com.unified.health.core.ble.protocol.ByteReader
import java.time.LocalDateTime

/**
 * Measurements of SIG "clinical" peripherals that the app's record model cannot store yet (blood
 * pressure, body temperature, weight, body composition). They are decoded to validate the frame
 * and to find their timestamp, then kept verbatim as `HealthRecord.RawPayload` (D-607) so they can
 * be re-imported once `:core:model` gains the record types.
 */
internal sealed interface ClinicalMeasurement {
    val timestamp: LocalDateTime?

    /** File-safe label used as `RawPayload.kind`. */
    val kind: String

    /**
     * Blood Pressure Measurement (0x2A35) [Ext: BLS 1.1 §3.1; GSS §3.31]. Flags: bit 0 unit
     * (0 mmHg, 1 kPa), bit 1 Time Stamp, bit 2 Pulse Rate, bit 3 User ID, bit 4 Measurement Status.
     */
    data class BloodPressure(
        val systolic: Double?,
        val diastolic: Double?,
        val meanArterial: Double?,
        val unitKpa: Boolean,
        override val timestamp: LocalDateTime?,
        val pulseRate: Double?,
    ) : ClinicalMeasurement {
        override val kind: String get() = "sig_blood_pressure"
    }

    /**
     * Temperature Measurement (0x2A1C) [Ext: HTS 1.0 §3.1; GSS §3.216]. Flags: bit 0 unit
     * (0 °C, 1 °F), bit 1 Time Stamp, bit 2 Temperature Type. Value is a 32-bit FLOAT.
     */
    data class Temperature(
        val value: Double?,
        val fahrenheit: Boolean,
        override val timestamp: LocalDateTime?,
    ) : ClinicalMeasurement {
        override val kind: String get() = "sig_temperature"
    }

    /**
     * Weight Measurement (0x2A9D) [Ext: WSS 1.0 §3.1; GSS §3.248]. Flags: bit 0 unit (0 = SI,
     * 0.005 kg; 1 = imperial, 0.01 lb), bit 1 Time Stamp, bit 2 User ID, bit 3 BMI and Height.
     */
    data class Weight(
        val kilograms: Double?,
        override val timestamp: LocalDateTime?,
    ) : ClinicalMeasurement {
        override val kind: String get() = "sig_weight"
    }

    /**
     * Body Composition Measurement (0x2A9C) [Ext: BCS 1.0 §3.1; GSS §3.34]. uint16 flags: bit 0
     * unit, bit 1 Time Stamp, … Only Body Fat Percentage (uint16, 0.1 %) and the time stamp are read.
     */
    data class BodyComposition(
        val bodyFatPercent: Double?,
        override val timestamp: LocalDateTime?,
    ) : ClinicalMeasurement {
        override val kind: String get() = "sig_body_composition"
    }

    companion object {
        fun parseBloodPressure(value: ByteArray): BloodPressure {
            val r = ByteReader(value)
            val flags = r.u8()
            val systolic = r.sfloat()
            val diastolic = r.sfloat()
            val map = r.sfloat()
            val time = if (flags.hasFlag(1)) SigTypes.dateTime(r) else null
            val pulse = if (flags.hasFlag(2)) r.sfloat() else null
            return BloodPressure(systolic, diastolic, map, unitKpa = flags.hasFlag(0), timestamp = time, pulseRate = pulse)
        }

        fun parseTemperature(value: ByteArray): Temperature {
            val r = ByteReader(value)
            val flags = r.u8()
            val temperature = r.float32()
            val time = if (flags.hasFlag(1)) SigTypes.dateTime(r) else null
            return Temperature(temperature, fahrenheit = flags.hasFlag(0), timestamp = time)
        }

        fun parseWeight(value: ByteArray): Weight {
            val r = ByteReader(value)
            val flags = r.u8()
            val raw = r.u16le()
            val time = if (flags.hasFlag(1)) SigTypes.dateTime(r) else null
            val kg = when {
                raw == WEIGHT_UNSUCCESSFUL -> null
                flags.hasFlag(0) -> raw * 0.01 * KG_PER_LB
                else -> raw * 0.005
            }
            return Weight(kg, time)
        }

        fun parseBodyComposition(value: ByteArray): BodyComposition {
            val r = ByteReader(value)
            val flags = r.u16le()
            val raw = r.u16le()
            val time = if (flags.hasFlag(1)) SigTypes.dateTime(r) else null
            return BodyComposition(if (raw == WEIGHT_UNSUCCESSFUL) null else raw / 10.0, time)
        }

        /** "Measurement unsuccessful" special value of Weight / Body Fat Percentage. */
        private const val WEIGHT_UNSUCCESSFUL = 0xFFFF
        private const val KG_PER_LB = 0.45359237
    }
}
