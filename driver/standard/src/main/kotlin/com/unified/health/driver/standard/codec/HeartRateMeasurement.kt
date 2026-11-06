package com.unified.health.driver.standard.codec

import com.unified.health.core.ble.protocol.ByteReader

/**
 * Heart Rate Measurement (0x2A37) [Ext: Heart Rate Service 1.0 §3.1; GSS §3.113].
 *
 * Flags: bit 0 value format (0 = uint8, 1 = uint16 bpm); bit 1 sensor contact detected;
 * bit 2 sensor contact feature supported; bit 3 Energy Expended present (uint16 kJ);
 * bit 4 one or more RR-Interval values present (uint16, 1/1024 s each).
 */
internal data class HeartRateMeasurement(
    val bpm: Int,
    /** null when the strap does not support contact detection. */
    val contactDetected: Boolean?,
    val energyExpendedKj: Int?,
    /** RR intervals in milliseconds, oldest first. */
    val rrIntervalsMs: List<Int>,
) {
    /** A reading worth storing: non-zero bpm and not explicitly "no skin contact". */
    val isUsable: Boolean get() = bpm > 0 && contactDetected != false

    companion object {
        /** @throws com.unified.health.core.ble.protocol.MalformedPayloadException on a short value. */
        fun parse(value: ByteArray): HeartRateMeasurement {
            val r = ByteReader(value)
            val flags = r.u8()
            val bpm = if (flags.hasFlag(0)) r.u16le() else r.u8()
            val contact = if (flags.hasFlag(2)) flags.hasFlag(1) else null
            val energy = if (flags.hasFlag(3)) r.u16le() else null
            val rr = if (flags.hasFlag(4)) {
                buildList { while (r.remaining >= 2) add(r.u16le() * 1000 / RR_RESOLUTION) }
            } else {
                emptyList()
            }
            return HeartRateMeasurement(bpm, contact, energy, rr)
        }

        /** RR intervals are expressed in 1/1024 s. */
        const val RR_RESOLUTION = 1024
    }
}
