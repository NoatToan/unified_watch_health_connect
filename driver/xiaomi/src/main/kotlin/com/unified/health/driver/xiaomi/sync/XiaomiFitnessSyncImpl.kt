package com.unified.health.driver.xiaomi.sync

import com.unified.health.core.ble.HealthRecordSink
import com.unified.health.core.ble.driver.SyncProgress
import com.unified.health.driver.xiaomi.transport.XiaomiLink
import java.time.Instant
import javax.inject.Inject

/**
 * No fitness-file transfer or record parsing lives in this module. Channel 5 reassembly
 * (`totalSegments`/`sequence` u16 LE, optional CRC32), the `DailyRecordParser`/`DailyReportParser`/
 * sleep/sport parsers and the `HealthRecord` mapping (protocol §9.4/§9.5 [V];
 * `XIAOMI_IMPLEMENTATION_BRIEF.md` M3/M4) all belong to the fitness agent, built on
 * `proto/FitnessIds.kt` and the same `transport/XiaomiLink.kt` the device commands use.
 */
internal class XiaomiFitnessSyncImpl @Inject constructor() : XiaomiFitnessSync {

    override suspend fun sync(link: XiaomiLink, sink: HealthRecordSink, progress: SyncProgress, since: Instant?): Int =
        TODO(
            "M3: implemented by the fitness agent (protocol §9.3 fitness-id exchange, §9.4 channel 5 " +
                "file transfer, §9.5 record parsing)",
        )
}
