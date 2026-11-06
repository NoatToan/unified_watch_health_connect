package com.unified.health.core.demo.virtual

import com.unified.health.core.ble.protocol.buildBytes
import java.time.Instant
import java.time.temporal.ChronoUnit

/**
 * Seeds the simulated watch's GDSP history (§6.1) so a first sync of the Zepp virtual watch shows
 * steps, heart rate, SpO2 and stress in Summary/Browse. Fixed, deterministic values (no RNG) so the
 * E2E screenshots and assertions never flake. Type codes match `driver.zepp.codec.GdspDataType`
 * (`ACTIVITY` 0x01, `STRESS_ALL_DAY` 0x13, `SPO2_POINT` 0x25); duplicated here because that enum is
 * `internal` to `:driver:zepp`.
 */
internal object DemoGdspData {
    private const val TYPE_ACTIVITY = 0x01
    private const val TYPE_STRESS_ALL_DAY = 0x13
    private const val TYPE_SPO2_POINT = 0x25

    /** Per-minute steps; a zero minute and a "not measured" heart rate exercise the driver's filters. */
    private val STEPS = listOf(12, 18, 0, 25, 9)
    private val HEART_RATES = listOf(71, 74, 0, 78, 73)

    /** Per-minute stress score; 0xFF is the "not measured" marker the driver filters out. */
    private val STRESS = listOf(22, 28, 0xFF, 34, 30)

    private val SPO2_OFFSETS_MINUTES = listOf(1L, 3L)
    private val SPO2_PERCENTS = listOf(96, 97)

    fun blocksByType(): Map<Int, GdspBlock> {
        val start = Instant.now().truncatedTo(ChronoUnit.MINUTES).minusSeconds(STEPS.size * 60L)
        return mapOf(
            TYPE_ACTIVITY to activity(start),
            TYPE_SPO2_POINT to spo2(start),
            TYPE_STRESS_ALL_DAY to stress(start),
        )
    }

    /** `[leading byte (skipped), (kind, intensity, steps, heartRate) × N]` (§6.2 4-byte layout [V]). */
    private fun activity(start: Instant): GdspBlock {
        val payload = buildBytes(1 + STEPS.size * 4) {
            u8(0)
            STEPS.indices.forEach { i ->
                u8(1) // kind: unused by the driver (native-only decode, §6.2 [I])
                u8(2) // intensity: unused by the driver
                u8(STEPS[i])
                u8(HEART_RATES[i])
            }
        }
        return GdspBlock(STEPS.size.toLong(), start, payload)
    }

    /** `[timestamp u32 LE, percent u8] × N` (§6.2 [V], version-1 layout, no leading version byte). */
    private fun spo2(start: Instant): GdspBlock {
        val payload = buildBytes(SPO2_OFFSETS_MINUTES.size * 5) {
            SPO2_OFFSETS_MINUTES.indices.forEach { i ->
                u32le(start.plusSeconds(SPO2_OFFSETS_MINUTES[i] * 60).epochSecond)
                u8(SPO2_PERCENTS[i])
            }
        }
        return GdspBlock(SPO2_OFFSETS_MINUTES.size.toLong(), start, payload)
    }

    /** One byte per minute (§6.2 [I]). */
    private fun stress(start: Instant): GdspBlock {
        val payload = buildBytes(STRESS.size) { STRESS.forEach { u8(it) } }
        return GdspBlock(STRESS.size.toLong(), start, payload)
    }
}
