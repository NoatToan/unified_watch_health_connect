package com.unified.health.driver.xiaomi.codec

import com.unified.health.core.ble.protocol.ByteReader
import com.unified.health.core.model.HealthRecord
import com.unified.health.core.model.SleepStage
import com.unified.health.driver.xiaomi.proto.FitnessDataId
import java.time.Instant

/**
 * `dailyType=3` night sleep (`NightSleepParser`, protocol §9.5 [V]). Evidence:
 * `docs/re-evidence/mi/jadx-base/sources/com/xiaomi/fit/fitness/parser/daily/NightSleepParser.java`.
 *
 * The payload is a fixed-size report struct (`reportDataTypeArray`, 16 `OneDimenDataType` fields:
 * scores/summary/advice/bed-wakeup times/recovery/nervous/awake-count/stage durations) followed
 * by a repeating list of `(sleepTime: u32 epoch-seconds, sleepState: u8)` transition markers
 * (`recordDataTypeArray`). This codec skips over the report fields byte-for-byte (their presence
 * is purely version-gated, see [REPORT_FIELD_BYTE_COUNTS] -- no bit-validity check needed to know
 * how many bytes they occupy, only to know whether their *value* would have been meaningful, which
 * this codec does not need) to reach the record list, then turns consecutive transition markers
 * into contiguous [HealthRecord.Sleep] segments exactly like the vendor's own
 * `NightSleepParser.processSleepState`: record *i* opens a segment that record *i+1* closes, so
 * the very last marker (typically the final wake-up) never gets its own segment -- this mirrors
 * the vendor, not a bug introduced here.
 *
 * Raw `sleepState` values (protocol §9.5 is silent on the exact numbers; evidence:
 * `com/xiaomi/fit/fitness/export/data/item/SleepState.java` /
 * `com/xiaomi/fit/data/common/data/annotation/SleepState.java`, both agree) [V]:
 * `0=NOT_SLEEP, 2=DEEP_SLEEP, 3=LIGHT_SLEEP, 4=RAPID_EYE_MOVEMENT, 5=AWAKE, 6=SLEEP_TRACE`.
 * `NOT_SLEEP`/`SLEEP_TRACE` have no obvious [SleepStage] equivalent and are dropped (no segment
 * emitted for a marker in either state) rather than guessed onto one of the four stages this app
 * models -- TODO(xiaomi-protocol): verify on a real watch whether `SLEEP_TRACE` should instead
 * collapse into `AWAKE` or `LIGHT`.
 */
internal object NightSleepCodec {
    private const val TYPE_SLEEP_TIME = 16
    private const val TYPE_SLEEP_STATE = 17

    private const val NOT_SLEEP = 0
    private const val DEEP_SLEEP = 2
    private const val LIGHT_SLEEP = 3
    private const val REM = 4
    private const val AWAKE = 5
    private const val SLEEP_TRACE = 6

    /** `reportDataTypeArray` byte widths in wire order (`NightSleepParser.java`), paired with `supportVersion`. */
    private val REPORT_FIELD_BYTE_COUNTS: List<Pair<Int, Int>> = listOf(
        1 to 1, 1 to 1, 1 to 1, 1 to 1, 1 to 1, // totalScore, qualityScore, durationScore, summary, advice
        2 to 1, // sleepDuration
        4 to 1, 4 to 1, // bedTime, wakeupTime
        1 to 1, 1 to 1, 1 to 1, // recoveryScore, nervousScore, awakeCount
        2 to 1, 2 to 1, 2 to 1, 2 to 1, // deepDuration, lightDuration, remDuration, awakeDuration
        1 to 2, // friendlyTotalScore (supportVersion 2)
    )

    /** `getNightSleepValidityLen` (protocol §9.5 [V], evidence: `FitnessDataValidity.java`). */
    private fun dataValidLen(version: Int): Int? = if (version == 1 || version == 2) 2 else null

    private fun reportLen(version: Int): Int =
        REPORT_FIELD_BYTE_COUNTS.sumOf { (byteCount, supportVersion) -> if (supportVersion <= version) byteCount else 0 }

    /**
     * @return one [HealthRecord.Sleep] per consecutive pair of transition markers, or an empty
     * list for an unsupported version, a payload too short for its header/report, or a record
     * list with fewer than two markers (nothing to bound a segment with).
     */
    fun decode(id: FitnessDataId, payload: ByteArray): List<HealthRecord> {
        val validLen = dataValidLen(id.version) ?: return emptyList()
        val headerLen = 1 + validLen + reportLen(id.version)
        if (payload.size < headerLen) return emptyList()

        val reader = ByteReader(payload, headerLen, payload.size)
        var prevTime: Long? = null
        var prevState: Int? = null
        val records = mutableListOf<HealthRecord>()
        while (reader.remaining >= RECORD_SIZE) {
            val time = reader.u32le()
            val state = reader.u8()
            if (prevTime != null && prevState != null) {
                stage(prevState)?.let { records += HealthRecord.Sleep(Instant.ofEpochSecond(prevTime), Instant.ofEpochSecond(time), it) }
            }
            prevTime = time
            prevState = state
        }
        return records
    }

    private fun stage(rawState: Int): SleepStage? = when (rawState) {
        DEEP_SLEEP -> SleepStage.DEEP
        LIGHT_SLEEP -> SleepStage.LIGHT
        REM -> SleepStage.REM
        AWAKE -> SleepStage.AWAKE
        NOT_SLEEP, SLEEP_TRACE -> null
        else -> null
    }

    /** `sleepTime` (u32 LE) + `sleepState` (u8), `recordDataTypeArray` (`NightSleepParser.java`). */
    private const val RECORD_SIZE = 5
}
