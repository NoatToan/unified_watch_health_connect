package com.unified.health.driver.xiaomi.sync

import com.unified.health.core.ble.HealthRecordSink
import com.unified.health.core.ble.driver.SyncProgress
import com.unified.health.driver.xiaomi.transport.XiaomiLink
import java.time.Instant

/**
 * Fitness history sync over MiWear (protocol §9.3/§9.4/§9.5 [V]): the fitness-ID exchange (channel
 * 1, `e = 8`), the file transfer (channel 5) and the vendor's bit-packed record parsing. Owned by
 * the fitness agent (M3/M4 in `XIAOMI_IMPLEMENTATION_BRIEF.md`); this module only provides the
 * pieces it is built on -- `proto/FitnessIds.kt`'s `ur9`/`nu9`/`FitnessDataId` codecs and
 * `transport/XiaomiL2.kt`'s channel framing.
 */
internal interface XiaomiFitnessSync {

    /**
     * Downloads fitness data newer than [since] (null = a first sync; implementations choose their
     * own bounded default window) over [link], delivering decoded records to [sink] in batches as
     * they are parsed and reporting [progress] as it goes.
     * @return number of non-raw [com.unified.health.core.model.HealthRecord]s delivered.
     */
    suspend fun sync(link: XiaomiLink, sink: HealthRecordSink, progress: SyncProgress, since: Instant?): Int
}
