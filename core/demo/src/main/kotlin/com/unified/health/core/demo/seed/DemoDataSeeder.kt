package com.unified.health.core.demo.seed

import com.unified.health.core.ble.HealthRecordSink
import com.unified.health.core.data.database.HealthRecordDao
import com.unified.health.core.data.sync.HealthRecordSinkFactory
import com.unified.health.core.demo.DemoDevice
import com.unified.health.core.demo.DemoHealthDataGenerator
import com.unified.health.core.domain.repository.DemoDataController
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.time.Instant
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Writes demo data into the real Room store through the same [HealthRecordSink] a wearable sync
 * uses, under the simulated watch's id (so a later mock sync overwrites rather than duplicates).
 */
@Singleton
class DemoDataSeeder internal constructor(
    private val sinkFor: (deviceId: String) -> HealthRecordSink,
    private val clearAll: suspend () -> Unit,
    private val generator: DemoHealthDataGenerator,
    private val now: () -> Instant,
) : DemoDataController {

    @Inject
    constructor(sinkFactory: HealthRecordSinkFactory, dao: HealthRecordDao) : this(
        sinkFor = sinkFactory::create,
        clearAll = {
            dao.deleteAllSamples()
            dao.deleteAllWorkouts()
        },
        generator = DemoHealthDataGenerator(),
        now = Instant::now,
    )

    override suspend fun seed(days: Int): Int = withContext(Dispatchers.IO) {
        require(days > 0) { "days must be positive" }
        val sink = sinkFor(DemoDevice.ADDRESS)
        var written = 0
        generator.lastDays(days, now()).forEach { batch ->
            sink.onRecords(batch)
            written += batch.size
        }
        written
    }

    override suspend fun clearHealthData() = withContext(Dispatchers.IO) { clearAll() }
}
