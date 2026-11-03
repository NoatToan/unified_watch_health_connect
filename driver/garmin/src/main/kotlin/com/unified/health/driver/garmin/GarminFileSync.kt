package com.unified.health.driver.garmin

import android.util.Log
import com.unified.health.core.ble.HealthRecordSink
import com.unified.health.core.ble.driver.SyncProgress
import com.unified.health.core.ble.driver.SyncRequest
import com.unified.health.core.ble.driver.WearableProtocolException
import com.unified.health.core.ble.protocol.MalformedPayloadException
import com.unified.health.core.model.HealthRecord
import com.unified.health.core.model.WearableVendor
import com.unified.health.driver.garmin.codec.DownloadResponse
import com.unified.health.driver.garmin.codec.FileDataAssembler
import com.unified.health.driver.garmin.codec.GarminDirectory
import com.unified.health.driver.garmin.codec.GarminFileEntry
import com.unified.health.driver.garmin.codec.GarminFitFileType
import com.unified.health.driver.garmin.codec.GfdiMessageId
import com.unified.health.driver.garmin.codec.GfdiPayloads
import com.unified.health.driver.garmin.codec.GfdiStatus
import com.unified.health.driver.garmin.codec.fit.DailyActivityAccumulator
import com.unified.health.driver.garmin.codec.fit.FitDecodeException
import com.unified.health.driver.garmin.codec.fit.FitDecoder
import com.unified.health.driver.garmin.codec.fit.FitHealthMapper
import com.unified.health.driver.garmin.transport.GfdiDispatcher
import com.unified.health.driver.garmin.transport.InboundReply
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.withTimeoutOrNull
import java.time.ZoneId

/** The watch refused or aborted one file transfer; other files may still be fine. */
internal class FileDownloadException(val fileIndex: Int, message: String) : WearableProtocolException(message)

/**
 * Downloads FIT files over GFDI and turns them into records (§6.1 [V]): directory (file index 0)
 * → 5002 per wanted file → 5004 chunks reassembled by [FileDataAssembler].
 *
 * Never sets archive flags (5008) nor deletes anything, so Garmin Connect can still sync the same
 * files; the store de-duplicates records we deliver twice.
 */
internal class GarminFileSync(
    private val dispatcher: GfdiDispatcher,
    private val zone: () -> ZoneId,
) {
    private class ActiveDownload {
        val assembler = FileDataAssembler()
        val progress = Channel<Unit>(Channel.CONFLATED)
    }

    private val lock = Any()
    private var active: ActiveDownload? = null

    /** @return number of non-raw records delivered. */
    suspend fun sync(request: SyncRequest, sink: HealthRecordSink, progress: SyncProgress): Int {
        val since = request.effectiveSince()
        val wanted = GarminDirectory.parse(download(GarminDirectory.DIRECTORY_FILE_INDEX))
            .filter { it.fileIndex != GarminDirectory.DIRECTORY_FILE_INDEX && it.timestamp.isAfter(since) }
            .mapNotNull { entry -> GarminFitFileType.of(entry)?.let { entry to it } }
            .sortedBy { it.first.timestamp }
        Log.i(TAG, "Directory lists ${wanted.size} FIT files newer than $since")
        progress.report(DIRECTORY_SHARE)

        val daily = DailyActivityAccumulator()
        var delivered = 0
        wanted.forEachIndexed { index, (entry, type) ->
            val bytes = try {
                download(entry.fileIndex)
            } catch (e: FileDownloadException) {
                Log.w(TAG, "Skipping file ${entry.fileIndex}: ${e.message}")
                null
            }
            if (bytes != null) {
                val records = decode(entry, bytes, daily)
                sink.onRecords(listOf(HealthRecord.RawPayload(WearableVendor.GARMIN, type.kind, entry.timestamp, bytes)) + records)
                delivered += records.size
            }
            progress.report(DIRECTORY_SHARE + (1f - DIRECTORY_SHARE) * (index + 1) / wanted.size)
        }
        val days = daily.build()
        if (days.isNotEmpty()) {
            sink.onRecords(days)
            delivered += days.size
        }
        progress.report(1f)
        return delivered
    }

    private fun decode(entry: GarminFileEntry, bytes: ByteArray, daily: DailyActivityAccumulator): List<HealthRecord> = try {
        FitHealthMapper.map(FitDecoder.decode(bytes), zone(), daily)
    } catch (e: FitDecodeException) {
        Log.w(TAG, "File ${entry.fileIndex} is not decodable (${e.message}); keeping the raw payload only")
        emptyList()
    }

    /** Called from the dispatcher's read loop for every 5004 message. */
    fun onFileData(payload: ByteArray): InboundReply {
        val download = synchronized(lock) { active } ?: return InboundReply(GfdiStatus.NAK)
        val ackData = synchronized(lock) { download.assembler.accept(payload) }
        download.progress.trySend(Unit)
        return InboundReply(data = ackData)
    }

    fun onLinkClosed() {
        synchronized(lock) { active }?.progress?.close()
    }

    /** Downloads one file completely; throws [FileDownloadException] when the watch refuses or aborts it. */
    suspend fun download(fileIndex: Int): ByteArray {
        val download = ActiveDownload()
        synchronized(lock) { active = download }
        try {
            val ack = dispatcher.request(GfdiMessageId.DOWNLOAD_REQUEST, GfdiPayloads.downloadRequest(fileIndex), REQUEST_TIMEOUT_MS)
            if (!ack.isAck) throw FileDownloadException(fileIndex, "Watch answered the download request with ${GfdiStatus.name(ack.status)}")
            val response = try {
                DownloadResponse.decode(ack.data)
            } catch (e: MalformedPayloadException) {
                throw WearableProtocolException("Malformed download response: ${e.message}")
            }
            if (!response.isOk) throw FileDownloadException(fileIndex, "Watch refused file $fileIndex (download status ${response.status})")
            synchronized(lock) { download.assembler.expect(response.fileSize) }
            while (true) {
                val (failure, bytes) = synchronized(lock) {
                    val assembler = download.assembler
                    assembler.failure to (if (assembler.isComplete) assembler.bytes() else null)
                }
                if (failure != null) throw FileDownloadException(fileIndex, failure)
                if (bytes != null) return bytes
                val signal = withTimeoutOrNull(FILE_DATA_TIMEOUT_MS) { download.progress.receiveCatching() }
                    ?: throw WearableProtocolException("No file data for file $fileIndex within ${FILE_DATA_TIMEOUT_MS / 1000}s")
                if (signal.isClosed) throw WearableProtocolException("Link closed while downloading file $fileIndex")
            }
        } finally {
            synchronized(lock) { if (active === download) active = null }
        }
    }

    private companion object {
        const val TAG = "GarminFileSync"
        const val REQUEST_TIMEOUT_MS = 10_000L

        /** Longest silence tolerated between two 5004 packets of the same file. */
        const val FILE_DATA_TIMEOUT_MS = 15_000L

        /** Share of the progress bar given to the directory download. */
        const val DIRECTORY_SHARE = 0.05f
    }
}
