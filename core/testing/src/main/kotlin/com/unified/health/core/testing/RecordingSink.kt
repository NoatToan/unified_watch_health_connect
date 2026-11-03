package com.unified.health.core.testing

import com.unified.health.core.ble.HealthRecordSink
import com.unified.health.core.model.HealthRecord

/** Collects every record a session delivers. */
class RecordingSink : HealthRecordSink {
    val records: MutableList<HealthRecord> = mutableListOf()

    override suspend fun onRecords(batch: List<HealthRecord>) {
        records += batch
    }

    inline fun <reified T : HealthRecord> ofType(): List<T> = records.filterIsInstance<T>()
}
