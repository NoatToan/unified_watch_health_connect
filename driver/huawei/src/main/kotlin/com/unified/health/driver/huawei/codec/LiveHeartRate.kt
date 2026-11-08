package com.unified.health.driver.huawei.codec

import com.unified.health.core.model.HealthRecord
import java.time.Instant

/**
 * Service 23 (Workout/HR) live heart-rate report.
 *
 * Request: service 23 command 18, payload `TLV 1 = operator` (1 byte) — 1 opens, 0 closes the
 * report. [V] `HwHeartRateManager.java:248-271` (`openOrCloseReport`) builds exactly
 * `01 01 <operator>`; the app's callers use operator 1 to open and 0 to close
 * (`fic.java:873` openAllDataReport, `fic.java:933` closeAllDataReport).
 *
 * Notifications: service 23 command 3. [V] `HwHeartRateManager.getResult` case 3 →
 * `handleHeartRateNotice` → `configHeartRateNotice` (`HwHeartRateManager.java:998,1063-1108`):
 * leaf TLV 3 = heart rate (`hr_info`; line 1255 broadcasts it as `HEART_RATE`), leaf TLV 4 =
 * timestamp in epoch seconds (multiplied by 1000 before use), leaf TLV 5 = credibility.
 *
 * Note on the RE briefs: `HUAWEI_CONNECTION_ANALYSIS.md` §3 says "notify command 3 TLV 4 = HR".
 * The verified cmd-3 reader above puts HR in TLV 3 and the timestamp in TLV 4; "TLV 4 = heart
 * rate" is the cmd 5 workout real-time notification ([V] `HwWorkoutServiceManager.java:386-425`,
 * where TLV 4 = heart rate). [LiveHeartRateParser] follows the verified cmd-3 layout and also
 * accepts a one-byte TLV 4 with no TLV 3 as HR (the shape the brief describes), because the two
 * are unambiguous by length: a timestamp is 4 bytes.
 */
internal object LiveHeartRateCommands {
    const val SERVICE_ID = 23
    const val COMMAND_ID = 18
    const val NOTICE_ID = 3

    /** `operator_type`: 1 = open, 0 = close. [V] `fic.java:873,933`, `fks.java:237-249` */
    const val OPERATOR_OPEN = 1
    const val OPERATOR_CLOSE = 0

    private const val TAG_OPERATOR = 0x01

    fun report(open: Boolean): HuaweiCommand =
        HuaweiCommand(
            SERVICE_ID,
            COMMAND_ID,
            listOf(Tlv.u8(TAG_OPERATOR, if (open) OPERATOR_OPEN else OPERATOR_CLOSE)),
        )
}

/** Maps a service 23 command 3 notification to a typed [HealthRecord.HeartRate]. */
internal object LiveHeartRateParser {
    private const val TAG_HEART_RATE = 3
    private const val TAG_TIME = 4
    private const val EPOCH_SECONDS_SIZE = 4

    /**
     * @param fallbackTime used when the notification carries no readable timestamp.
     * @return null for a rejected notification, a missing/out-of-range heart rate, or any command
     *  other than service 23 command 3.
     */
    fun parse(command: HuaweiCommand, fallbackTime: Instant): HealthRecord.HeartRate? {
        if (command.serviceId != LiveHeartRateCommands.SERVICE_ID || command.commandId != LiveHeartRateCommands.NOTICE_ID) return null
        val error = command.errorCode()
        if (error != null && error != HuaweiCommand.SUCCESS_CODE) return null
        // The app parses nested sections (father TLVs) and then their leaf TLVs; walk every level.
        val leaves = command.tlvs.filter { it.tag != HuaweiCommand.ERROR_TAG }.flatMap { it.leaves() }
        val heartRateTlv = leaves.find { it.tag == TAG_HEART_RATE }
        val timeTlv = leaves.find { it.tag == TAG_TIME }
        val bpm = heartRateTlv?.uintOrNull()?.toInt()?.takeIf { it in 1..MAX_BPM }
            ?: timeTlv?.takeIf { it.value.size == 1 }?.uintOrNull()?.toInt()?.takeIf { it in 1..MAX_BPM }
            ?: return null
        val time = timeTlv?.takeIf { it.value.size == EPOCH_SECONDS_SIZE }?.uintOrNull()?.takeIf { it > 0 }
        return HealthRecord.HeartRate(time?.let(Instant::ofEpochSecond) ?: fallbackTime, bpm)
    }

    /** Leaf TLVs at any nesting depth; an unparseable branch contributes nothing. */
    private fun Tlv.leaves(depth: Int = 0): List<Tlv> = when {
        !isNested -> listOf(this)
        depth >= MAX_NESTING -> emptyList()
        else -> runCatching { children().flatMap { it.leaves(depth + 1) } }.getOrDefault(emptyList())
    }

    /** Numeric value of a 1..4-byte TLV, or null when it is not a number. */
    private fun Tlv.uintOrNull(): Long? = runCatching { uint() }.getOrNull()

    /** Highest plausible heart rate for a byte-encoded field; rejects 0 and sensor filler. */
    private const val MAX_BPM = 255

    /** Same nesting cap as the vendor TLV reader ([V] `eet.a`: throws above 50 levels). */
    private const val MAX_NESTING = 50
}
