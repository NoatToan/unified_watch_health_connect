package com.unified.health.driver.garmin.codec

/**
 * Garmin realtime HEART_RATE payload, identical on the dedicated `6A4E2501` characteristic and on
 * Multi-Link service 6 (both feed the same parser, `fh2/d.java:72-158`). Layout (`xm2/i.java:28-49` [V]):
 *
 * | byte | field | note |
 * |---|---|---|
 * | 0 | source | 0 NO_SOURCE, 1 HR_STRAP, 2 OHR_NO_LOCK, 3 OHR_LOCKED (`xm2/j.java`) |
 * | 1 | heart rate (bpm) | `0xFF` = unknown |
 * | 2 | resting heart rate | `0xFF` = unknown |
 * | 3 | low heart rate | `0xFF` = unknown |
 * | 4 | high heart rate | `0xFF` = unknown |
 *
 * Field names follow the labels in `TestRealTimeDataActivity.java:140, 242-247`. Frames shorter than
 * 5 bytes are rejected by the official parser; extra trailing bytes are ignored.
 */
internal data class RealtimeHeartRate(
    val source: Source,
    val heartRate: Int?,
    val restingHeartRate: Int?,
    val lowHeartRate: Int?,
    val highHeartRate: Int?,
) {
    enum class Source { NO_SOURCE, HR_STRAP, OHR_NO_LOCK, OHR_LOCKED }

    companion object {
        const val MIN_LENGTH = 5
        private const val UNKNOWN = 0xFF

        fun decode(payload: ByteArray): RealtimeHeartRate? {
            if (payload.size < MIN_LENGTH) return null
            val sourceIndex = payload[0].toInt() and 0xFF
            fun field(index: Int) = (payload[index].toInt() and 0xFF).takeUnless { it == UNKNOWN }
            return RealtimeHeartRate(
                source = Source.entries.getOrElse(sourceIndex) { Source.NO_SOURCE },
                heartRate = field(1),
                restingHeartRate = field(2),
                lowHeartRate = field(3),
                highHeartRate = field(4),
            )
        }
    }
}
