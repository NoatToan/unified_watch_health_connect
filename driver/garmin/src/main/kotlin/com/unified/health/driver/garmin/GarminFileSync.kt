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
import java.time.Instant
import java.time.ZoneId

/** The watch refused or aborted one file transfer; other files may still be fine. */
internal class FileDownloadException(val fileIndex: Int, message: String) : WearableProtocolException(message)

/**
 * Downloads FIT files over GFDI and turns them into records (§6.1 [V]): directory (file index 0)
 * → 5002 per wanted file → 5004 chunks reassembled by [FileDataAssembler].
 *
 * Never sets archive flags (5008) nor deletes anything, so Garmin Connect can still sync the same
 * files; the store de-duplicates records we deliver twice.
 *
 * ACTIVITY files (§6.1 FIT_TYPE_4) use a much longer cutoff than [SyncRequest.effectiveSince]
 * (see [ACTIVITY_LOOKBACK_DAYS]): a workout is rare and small compared to daily monitoring, so missing
 * one because it happened before the rolling wellness window, or before the very first sync's
 * 7-day default, otherwise hides it forever — `since` only moves forward after each sync, so a
 * workout older than the window at the moment it was first seen is never retried (D-419).
 * Re-listing/re-downloading an already-synced activity on every sync is deliberate and cheap: the
 * watch's own directory only ever holds the handful of FIT files still on its limited storage, and
 * [sink] upserts on `(deviceId, startEpochMs)`, so redelivering the same workout is a no-op.
 */
internal class GarminFileSync(
    private val dispatcher: GfdiDispatcher,
    private val zone: () -> ZoneId,
) {
    private class ActiveDownload {
        val assembler = FileDataAssembler()
        val progress = Channel<Unit>(Channel.CONFLATED)
    }

    private class DecodeOutcome(val records: List<HealthRecord>, val decoded: Boolean)

    private val lock = Any()
    private var active: ActiveDownload? = null

    /** @return number of non-raw records delivered. */
    suspend fun sync(request: SyncRequest, sink: HealthRecordSink, progress: SyncProgress): Int {
        val wellnessSince = request.effectiveSince()
        val activitySince = request.now.minusSeconds(ACTIVITY_LOOKBACK_DAYS * SECONDS_PER_DAY)
        val directory = GarminDirectory.parse(download(GarminDirectory.DIRECTORY_FILE_INDEX))
            .filter { it.fileIndex != GarminDirectory.DIRECTORY_FILE_INDEX }
        val typed = directory.mapNotNull { entry -> GarminFitFileType.of(entry)?.let { entry to it } }
        val wanted = typed
            .filter { (entry, type) -> entry.timestamp.isAfter(sinceFor(type, wellnessSince, activitySince)) }
            .sortedBy { it.first.timestamp }
        Log.i(
            TAG,
            "Directory: ${directory.size} entries, ${typed.size} FIT of interest ${countsByType(typed)}; " +
                "${wanted.size} newer than cutoff (wellness since=$wellnessSince, activity since=$activitySince)",
        )
        progress.report(DIRECTORY_SHARE)

        val daily = DailyActivityAccumulator()
        var delivered = 0
        var decodedFiles = 0
        var decodeFailures = 0
        var workoutsProduced = 0
        val downloaded = mutableListOf<GarminFitFileType>()
        wanted.forEachIndexed { index, (entry, type) ->
            val bytes = try {
                download(entry.fileIndex)
            } catch (e: FileDownloadException) {
                Log.w(TAG, "Skipping file ${entry.fileIndex}: ${e.message}")
                null
            }
            if (bytes != null) {
                downloaded += type
                val outcome = decode(entry, bytes, daily)
                if (outcome.decoded) decodedFiles++ else decodeFailures++
                workoutsProduced += outcome.records.count { it is HealthRecord.Workout }
                sink.onRecords(listOf(HealthRecord.RawPayload(WearableVendor.GARMIN, type.kind, entry.timestamp, bytes)) + outcome.records)
                delivered += outcome.records.size
            }
            progress.report(DIRECTORY_SHARE + (1f - DIRECTORY_SHARE) * (index + 1) / wanted.size)
        }
        val days = daily.build()
        if (days.isNotEmpty()) {
            sink.onRecords(days)
            delivered += days.size
        }
        progress.report(1f)
        Log.i(
            TAG,
            "Sync finished: downloaded ${downloaded.size}/${wanted.size} files ${countsOf(downloaded)}, " +
                "decoded=$decodedFiles decodeFailures=$decodeFailures workouts=$workoutsProduced dailySummaries=${days.size} " +
                "totalRecords=$delivered",
        )
        return delivered
    }

    /** ACTIVITY uses [activitySince]; every other FIT type keeps the normal wellness window. */
    private fun sinceFor(type: GarminFitFileType, wellnessSince: Instant, activitySince: Instant): Instant =
        if (type == GarminFitFileType.ACTIVITY) activitySince else wellnessSince

    private fun countsByType(entries: List<Pair<GarminFileEntry, GarminFitFileType>>): Map<GarminFitFileType, Int> =
        entries.groupingBy { it.second }.eachCount()

    private fun countsOf(types: List<GarminFitFileType>): Map<GarminFitFileType, Int> =
        types.groupingBy { it }.eachCount()

    private fun decode(entry: GarminFileEntry, bytes: ByteArray, daily: DailyActivityAccumulator): DecodeOutcome = try {
        DecodeOutcome(FitHealthMapper.map(FitDecoder.decode(bytes), zone(), daily), decoded = true)
    } catch (e: FitDecodeException) {
        Log.w(TAG, "File ${entry.fileIndex} is not decodable (${e.message}); keeping the raw payload only")
        DecodeOutcome(emptyList(), decoded = false)
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

    companion object {
        private const val TAG = "GarminFileSync"
        private const val REQUEST_TIMEOUT_MS = 10_000L

        /** Longest silence tolerated between two 5004 packets of the same file. */
        private const val FILE_DATA_TIMEOUT_MS = 15_000L

        /** Share of the progress bar given to the directory download. */
        private const val DIRECTORY_SHARE = 0.05f

        /**
         * How far back ACTIVITY files are listed, regardless of [SyncRequest.since] (D-419).
         * 365 days comfortably covers a watch's own on-device storage (far smaller in practice —
         * Garmin firmware recycles old un-archived activities well before a year), while bounding
         * the per-sync directory scan.
         */
        const val ACTIVITY_LOOKBACK_DAYS = 365L
        private const val SECONDS_PER_DAY = 86_400L
    }
}

/**
 * Re-decodes a previously downloaded `fit_activity` [HealthRecord.RawPayload] without a live
 * session, for [GarminDriver.reprocess] (D-420): lets a fixed FIT-decoder bug recover
 * workouts from files we already stored, without asking the user to pair/resync.
 */
internal fun decodeGarminActivityWorkouts(bytes: ByteArray): List<HealthRecord.Workout> = try {
    FitHealthMapper.map(FitDecoder.decode(bytes), ZoneId.systemDefault(), DailyActivityAccumulator())
        .filterIsInstance<HealthRecord.Workout>()
} catch (e: FitDecodeException) {
    Log.w("GarminFileSync", "Raw fit_activity payload is still not decodable: ${e.message}")
    emptyList()
}
