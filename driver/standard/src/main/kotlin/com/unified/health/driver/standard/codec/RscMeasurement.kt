package com.unified.health.driver.standard.codec

import com.unified.health.core.ble.protocol.ByteReader

/**
 * RSC Measurement (0x2A53) [Ext: Running Speed and Cadence Service 1.0 §3.1; GSS §3.189].
 *
 * Flags: bit 0 Instantaneous Stride Length present (uint16, 1/100 m); bit 1 Total Distance
 * present (uint32, 1/10 m); bit 2 walking (0) or running (1). Speed is uint16 in 1/256 m/s,
 * cadence uint8 in 1/min.
 */
internal data class RscMeasurement(
    val speedMetersPerSecond: Double,
    val cadencePerMinute: Int,
    val strideLengthMeters: Double?,
    val totalDistanceMeters: Double?,
    val running: Boolean,
) {
    companion object {
        fun parse(value: ByteArray): RscMeasurement {
            val r = ByteReader(value)
            val flags = r.u8()
            val speed = r.u16le() / SPEED_RESOLUTION
            val cadence = r.u8()
            val stride = if (flags.hasFlag(0)) r.u16le() / 100.0 else null
            val distance = if (flags.hasFlag(1)) r.u32le() / 10.0 else null
            return RscMeasurement(speed, cadence, stride, distance, running = flags.hasFlag(2))
        }

        private const val SPEED_RESOLUTION = 256.0
    }
}
