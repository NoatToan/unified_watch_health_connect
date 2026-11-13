package com.unified.health.driver.xiaomi.sync

import android.util.Log
import com.unified.health.core.ble.HealthRecordSink
import com.unified.health.core.ble.driver.SyncProgress
import com.unified.health.core.ble.driver.SyncRequest
import com.unified.health.core.ble.driver.WearableProtocolException
import com.unified.health.core.ble.protocol.MalformedPayloadException
import com.unified.health.core.model.HealthRecord
import com.unified.health.core.model.WearableVendor
import com.unified.health.driver.xiaomi.XiaomiChannel
import com.unified.health.driver.xiaomi.codec.FitnessFilePayload
import com.unified.health.driver.xiaomi.codec.FitnessKind
import com.unified.health.driver.xiaomi.codec.FitnessPayloadDecoder
import com.unified.health.driver.xiaomi.proto.FitnessDataId
import com.unified.health.driver.xiaomi.proto.S7r
import com.unified.health.driver.xiaomi.proto.Ur9
import com.unified.health.driver.xiaomi.transport.L2Frame
import com.unified.health.driver.xiaomi.transport.XiaomiFitnessFileReassembler
import com.unified.health.driver.xiaomi.transport.XiaomiLink
import com.unified.health.driver.xiaomi.transport.XiaomiOpCode
import kotlinx.coroutines.CancellationException
import java.time.Instant
import javax.inject.Inject

/**
 * M3 (fitness-id sync + channel-5 file receiver) + scoped M4 (three record parsers) implementation
 * of [XiaomiFitnessSync] (protocol §9.3/§9.4/§9.5 [V]):
 * 1. [fetchIds] -- `f=1`/`f=2` id exchange, deduped against [SyncRequest.knownRawPayloadTimestamps]
 *    and windowed/capped like `driver/garmin`'s `GarminFileSync`.
 * 2. [downloadAndStore] per remaining id -- `f=4` triggers the transfer, [receiveFile] reassembles
 *    the unprompted channel-5 stream, [FitnessFilePayload] verifies/strips the CRC32 and splits off
 *    the [FitnessDataId], the raw bytes are stored via [sink] first, parsed records (if this id's
 *    kind has a parser, see [FitnessPayloadDecoder]) go out in the same batch, and only then is the
 *    id confirmed (`f=5`) -- so a disconnect before the raw bytes are durably stored still has the
 *    watch holding the file for the next sync to re-request.
 *
 * One file is downloaded at a time (protocol §9.3 [V] uses one-id-at-a-time `f=4`/`f=5`); a
 * per-file failure (corrupt frame, timeout, CRC mismatch) is logged and skipped so it cannot abort
 * the rest of the sync, mirroring `GarminFileSync`'s `FileDownloadException` handling.
 */
internal class XiaomiFitnessSyncImpl @Inject constructor() : XiaomiFitnessSync {

    override suspend fun sync(link: XiaomiLink, sink: HealthRecordSink, progress: SyncProgress, request: SyncRequest): Int {
        progress.report(0f, "Đang lấy danh sách dữ liệu từ đồng hồ...")
        val ids = fetchIds(link, request)
        Log.i(TAG, "Fitness id exchange: ${ids.size} id(s) to sync (since=${request.effectiveSince()}, cap=$MAX_FILES_PER_SYNC)")

        var delivered = 0
        ids.forEachIndexed { index, id ->
            try {
                delivered += downloadAndStore(link, id, sink)
            } catch (e: CancellationException) {
                throw e
            } catch (e: WearableProtocolException) {
                Log.w(TAG, "Skipping fitness file $id: ${e.message}")
            } catch (e: MalformedPayloadException) {
                // A corrupt channel-5 segment or CRC32 mismatch (XiaomiFitnessFileReassembler/
                // FitnessFilePayload) is a per-file protocol error, not grounds to crash the sync.
                Log.w(TAG, "Skipping malformed fitness file $id: ${e.message}")
            }
            progress.report((index + 1f) / ids.size, "Đang tải dữ liệu từ đồng hồ (${index + 1}/${ids.size} file)...")
        }
        progress.report(1f, "Đang xử lý...")
        return delivered
    }

    /**
     * `f=1` (today) + `f=2` (history) id exchange (protocol §9.3 [V]), combined, deduped by data
     * id equality and by [SyncRequest.knownRawPayloadTimestamps] (D-422-style: a file already on
     * disk is not re-downloaded just because the watch still lists it), bounded to
     * [SyncRequest.effectiveSince] and [MAX_FILES_PER_SYNC] oldest-first so a large backlog is
     * caught up gradually across syncs rather than in one long BLE session [I].
     */
    private suspend fun fetchIds(link: XiaomiLink, request: SyncRequest): List<FitnessDataId> {
        val today = requestIds(link, F_GET_TODAY_IDS, Ur9.requestToday(isAutoSync = true).encode())
        val history = requestIds(link, F_GET_HISTORY_IDS, payload = null)
        val since = request.effectiveSince()
        return (today + history)
            .distinct()
            .filterNot { Instant.ofEpochSecond(it.timestampSeconds) in request.knownRawPayloadTimestamps }
            .filter { Instant.ofEpochSecond(it.timestampSeconds) >= since }
            .sortedBy { it.timestampSeconds }
            .take(MAX_FILES_PER_SYNC)
    }

    private suspend fun requestIds(link: XiaomiLink, f: Int, payload: ByteArray?): List<FitnessDataId> {
        val response = link.request(S7r.CLASS_FITNESS, f, payload, timeoutMs = ID_EXCHANGE_TIMEOUT_MS)
        val ur9 = response.ur9?.let { Ur9.decode(it) } ?: return emptyList()
        // TODO(xiaomi-protocol): Ur9's own KDoc -- the doc's request/response field mapping for
        // f=1/f=2 reads backwards from the request side and has no byte vector to confirm it;
        // handle whichever of field2Bytes/field3Bytes the watch actually populated.
        val idBytes = ur9.field2Bytes ?: ur9.field3Bytes ?: return emptyList()
        return try {
            Ur9.decodeIds(idBytes)
        } catch (e: MalformedPayloadException) {
            Log.w(TAG, "Malformed fitness id list for f=$f: ${e.message}")
            emptyList()
        }
    }

    /** Downloads, stores (raw + any parsed records) and confirms one id. @return parsed record count. */
    private suspend fun downloadAndStore(link: XiaomiLink, id: FitnessDataId, sink: HealthRecordSink): Int {
        link.request(S7r.CLASS_FITNESS, F_REQUEST_ONE, Ur9.requestOne(id).encode(), timeoutMs = REQUEST_FILE_TIMEOUT_MS)
        val merged = receiveFile(link)
        val decoded = FitnessFilePayload.decode(merged, id)

        val raw = HealthRecord.RawPayload(
            vendor = WearableVendor.XIAOMI,
            kind = FitnessKind.of(id),
            createdAt = Instant.ofEpochSecond(id.timestampSeconds),
            bytes = decoded.rawPayloadBytes,
        )
        val parsed = FitnessPayloadDecoder.decode(id, decoded.payload)
        sink.onRecords(listOf(raw) + parsed)

        confirm(link, id)
        return parsed.size
    }

    /**
     * Channel-5 reassembly (protocol §9.4 [V]): the data arrives as a stream the watch pushes on
     * its own once [F_REQUEST_ONE] triggers it, not as that request's own reply -- see
     * [XiaomiLink.receiveRaw]'s KDoc for why this is a plain receive loop, not a request/response.
     */
    private suspend fun receiveFile(link: XiaomiLink): ByteArray {
        val reassembler = XiaomiFitnessFileReassembler()
        val type = requireNotNull(L2Frame.typeFor(XiaomiChannel.FILE_FITNESS.id, XiaomiOpCode.WRITE)) {
            "Channel 5 (FILE_FITNESS) has no derived L2 type"
        }
        while (true) {
            val packet = link.receiveRaw(type, SEGMENT_TIMEOUT_MS)
            val merged = reassembler.feed(packet)
            if (merged != null) return merged
        }
    }

    /**
     * `f=5`, best-effort and only sent after [sink.onRecords] above returns, i.e. after the raw
     * bytes are durably stored (protocol §9.3 [V] acceptance criterion: a disconnect mid-file, or
     * a lost confirm, must not lose data -- the watch simply offers the same id again next sync,
     * and [fetchIds]'s timestamp dedup is what prevents that from becoming a duplicate download).
     */
    private suspend fun confirm(link: XiaomiLink, id: FitnessDataId) {
        try {
            link.request(S7r.CLASS_FITNESS, F_CONFIRM_ONE, Ur9.requestOne(id).encode(), timeoutMs = CONFIRM_TIMEOUT_MS)
        } catch (e: CancellationException) {
            throw e
        } catch (e: WearableProtocolException) {
            Log.w(TAG, "Could not confirm fitness file $id (watch may resend it next sync): ${e.message}")
        }
    }

    private companion object {
        const val TAG = "XiaomiFitnessSync"

        const val F_GET_TODAY_IDS = 1
        const val F_GET_HISTORY_IDS = 2
        const val F_REQUEST_ONE = 4
        const val F_CONFIRM_ONE = 5

        const val ID_EXCHANGE_TIMEOUT_MS = 10_000L
        const val REQUEST_FILE_TIMEOUT_MS = 10_000L
        const val CONFIRM_TIMEOUT_MS = 10_000L

        /**
         * Longest silence tolerated between two channel-5 segments of the same file [I] (the doc
         * gives no value for this; mirrors `GarminFileSync.FILE_DATA_TIMEOUT_MS`'s order of
         * magnitude for the analogous GFDI file-chunk wait).
         */
        const val SEGMENT_TIMEOUT_MS = 15_000L

        /**
         * Bounds a catch-up sync's BLE time/battery the same way `GarminFileSync.ACTIVITY_CATCH_UP_CAP`
         * does [I]; anything beyond the cap is still "new" and is picked up by a later sync.
         */
        const val MAX_FILES_PER_SYNC = 50
    }
}
