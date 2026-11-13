package com.unified.health.driver.xiaomi.codec

import com.unified.health.driver.xiaomi.proto.FitnessDataId

/**
 * Stable, filesystem-safe [com.unified.health.core.model.HealthRecord.RawPayload.kind] label for
 * one [FitnessDataId] (protocol §9.3/§9.5 [V]). Used both when storing the raw file (sync) and
 * when dispatching [com.unified.health.driver.xiaomi.XiaomiDriver.reprocess] back to the matching
 * parser -- every value here is `[a-z0-9_]+`, safe for
 * `com.unified.health.core.data.sync.RawPayloadFileNaming`'s `<vendor>_<kind>_<epochMs>.bin`
 * convention (that file also replaces anything outside `[A-Za-z0-9_.-]`, so this is belt-and-braces).
 */
internal object FitnessKind {
    const val DAILY_RECORD = "daily_record"
    const val DAILY_REPORT = "daily_report"
    const val NIGHT_SLEEP = "night_sleep"

    /**
     * The three M4-parsed kinds get a short, human-meaningful name; every other
     * `(dataType, subType, fileType)` combination (daytime sleep, user profile, manual measure,
     * all-day sleep, abnormal record, weight, ECG, temperature, any sport/`dataType=1` kind, GPS --
     * protocol §9.5's full table) gets a generic, still-unique fallback so the raw bytes are kept
     * without this driver pretending to understand them.
     */
    fun of(id: FitnessDataId): String = when {
        id.dataType == FitnessDataId.DATA_TYPE_DAILY && id.subType == 0 && id.fileType == 0 -> DAILY_RECORD
        id.dataType == FitnessDataId.DATA_TYPE_DAILY && id.subType == 0 && id.fileType == 1 -> DAILY_REPORT
        id.dataType == FitnessDataId.DATA_TYPE_DAILY && id.subType == 3 -> NIGHT_SLEEP
        else -> "fitness_${id.dataType}_${id.subType}_${id.fileType}"
    }
}
