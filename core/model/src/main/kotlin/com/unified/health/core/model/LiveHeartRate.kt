package com.unified.health.core.model

import java.time.Instant

/** Latest heart rate pushed by the connected watch. */
data class LiveHeartRate(val bpm: Int, val time: Instant)
