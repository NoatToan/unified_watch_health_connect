package com.unified.health.driver.xiaomi.codec

import com.unified.health.core.model.HealthRecord
import com.unified.health.driver.xiaomi.proto.FitnessDataId

/**
 * Dispatches a decoded fitness file to the matching parser by [FitnessKind], the one place both
 * the live sync path ([com.unified.health.driver.xiaomi.sync.XiaomiFitnessSyncImpl]) and the
 * stored-payload path ([com.unified.health.driver.xiaomi.XiaomiDriver.reprocess]) call into, so a
 * parser fix benefits both without the two call sites drifting apart.
 */
internal object FitnessPayloadDecoder {

    /** [bytes] is `id.encode() + payload` -- see [FitnessFilePayload.Decoded.rawPayloadBytes]. */
    fun decodeStored(bytes: ByteArray): List<HealthRecord> {
        if (bytes.size < FitnessDataId.SIZE) return emptyList()
        val id = FitnessDataId.decode(bytes.copyOfRange(0, FitnessDataId.SIZE))
        return decode(id, bytes.copyOfRange(FitnessDataId.SIZE, bytes.size))
    }

    fun decode(id: FitnessDataId, payload: ByteArray): List<HealthRecord> = when (FitnessKind.of(id)) {
        FitnessKind.DAILY_RECORD -> DailyRecordCodec.decode(id, payload)
        FitnessKind.DAILY_REPORT -> DailyReportCodec.decode(id, payload)
        FitnessKind.NIGHT_SLEEP -> NightSleepCodec.decode(id, payload)
        FitnessKind.DAYTIME_SLEEP -> DaytimeSleepCodec.decode(id, payload)
        FitnessKind.SPORT_REPORT_OUTDOOR -> SportReportCodec.decode(id, payload)
        FitnessKind.SPORT_GPS -> SportGpsCodec.decode(id, payload)
        else -> emptyList()
    }
}
