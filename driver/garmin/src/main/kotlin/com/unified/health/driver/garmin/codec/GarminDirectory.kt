package com.unified.health.driver.garmin.codec

import com.unified.health.core.ble.protocol.ByteReader
import java.time.Instant

/**
 * One entry of the file directory (file index 0), 16 bytes LE (§6.1 [V], `com/garmin/gfdi/file/a.java:418-455`):
 * `u16 fileIndex | u8 dataType | u8 subType | u16 fileNumber | u8 specificFlags | u8 fileFlags |
 *  u32 size | u32 timestamp (FIT epoch)`.
 */
internal data class GarminFileEntry(
    val fileIndex: Int,
    val dataType: Int,
    val subType: Int,
    val fileNumber: Int,
    val specificFlags: Int,
    val fileFlags: Int,
    val size: Long,
    val timestamp: Instant,
) {
    val isFit: Boolean get() = dataType == FIT_DATA_TYPE

    companion object {
        /** Data type of FIT files; the sub type is the FIT file type (§6.1 [V], `yr1/o.java`). */
        const val FIT_DATA_TYPE = 128
    }
}

/** FIT sub types this driver syncs and the [com.unified.health.core.model.HealthRecord.RawPayload.kind] they map to. */
internal enum class GarminFitFileType(val subType: Int, val kind: String) {
    ACTIVITY(4, "fit_activity"),
    MONITORING(32, "fit_monitoring"),
    METRICS(44, "fit_metrics"),

    /** Synced together with monitoring; probably sleep/wellness (§6.1 [I], §9 question 7). */
    WELLNESS_49(49, "fit_type49"),
    ;

    companion object {
        fun of(entry: GarminFileEntry): GarminFitFileType? =
            if (entry.isFit) entries.firstOrNull { it.subType == entry.subType } else null
    }
}

internal object GarminDirectory {
    const val DIRECTORY_FILE_INDEX = 0

    /** The directory starts with a 16-byte header whose content is not documented ([I]); skipped. */
    private const val HEADER_SIZE = 16
    private const val ENTRY_SIZE = 16

    /** Parses every complete entry; a trailing partial entry is ignored. */
    fun parse(bytes: ByteArray): List<GarminFileEntry> {
        if (bytes.size <= HEADER_SIZE) return emptyList()
        val count = (bytes.size - HEADER_SIZE) / ENTRY_SIZE
        val r = ByteReader(bytes, HEADER_SIZE, HEADER_SIZE + count * ENTRY_SIZE)
        return List(count) {
            GarminFileEntry(
                fileIndex = r.u16le(),
                dataType = r.u8(),
                subType = r.u8(),
                fileNumber = r.u16le(),
                specificFlags = r.u8(),
                fileFlags = r.u8(),
                size = r.u32le(),
                timestamp = FitTime.toInstant(r.u32le()),
            )
        }
    }
}
