package com.unified.health.driver.xiaomi.codec

import com.unified.health.core.ble.protocol.ByteReader
import com.unified.health.core.model.HealthRecord
import com.unified.health.driver.xiaomi.proto.FitnessDataId

/**
 * `dailyType=2` daytime sleep/nap (`DaytimeSleepParser`, protocol §9.5 [V]). Evidence:
 * `docs/re-evidence/mi/jadx-base/sources/com/xiaomi/fit/fitness/parser/daily/DaytimeSleepParser.java`.
 *
 * A thin variant of [NightSleepCodec]'s own payload: a one-field report (`sleepDuration`, u16,
 * not exposed by this milestone -- [HealthRecord.Sleep] has no "total nap duration" slot, only
 * per-stage segments) followed by the *same* `(sleepTime: u32, sleepState: u8)` transition-marker
 * record shape night sleep uses, confirmed by the vendor's own source reusing
 * `NightSleepParser.processSleepState(1, 2, ...)` verbatim for the record list (only the type
 * numbers passed to it differ -- `1`/`2` here vs `16`/`17` for night sleep -- the record *bytes*
 * are identical, which is why [NightSleepCodec.parseTransitions] is reused unchanged).
 *
 * The vendor parser itself rejects `version == 1` outright (`"invalid version, not parse"`) rather
 * than falling back to a v1 table the way [DailyRecordCodec] does for its own v1 case; this codec
 * mirrors that rejection rather than guessing a v1 layout that was never ported upstream either.
 */
internal object DaytimeSleepCodec {

    /** `sleepDuration`, u16 LE, the only `reportDataTypeArray` entry (`DaytimeSleepParser.java`). */
    private const val REPORT_LEN = 2

    /** `getDayLightSleepValidityLen` (protocol §9.5 [V], evidence: `FitnessDataValidity.java`). */
    private fun dataValidLen(version: Int): Int? = if (version == 2) 1 else null

    /**
     * @return one [HealthRecord.Sleep] per consecutive pair of transition markers (see
     * [NightSleepCodec.parseTransitions]), or an empty list for `version != 2` (the vendor never
     * parses `version == 1`, and no higher version is documented) or a payload too short for its
     * own header.
     */
    fun decode(id: FitnessDataId, payload: ByteArray): List<HealthRecord> {
        val validLen = dataValidLen(id.version) ?: return emptyList()
        val headerLen = 1 + validLen + REPORT_LEN
        if (payload.size < headerLen) return emptyList()

        val reader = ByteReader(payload, headerLen, payload.size)
        return NightSleepCodec.parseTransitions(reader)
    }
}
