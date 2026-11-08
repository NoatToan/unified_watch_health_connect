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
 *
 * ACTIVITY files (§6.1 FIT_TYPE_4) use a much longer cutoff than [SyncRequest.effectiveSince]
 * (see [ACTIVITY_LOOKBACK_DAYS]): a workout is rare and small compared to daily monitoring, so missing
 * one because it happened before the rolling wellness window, or before the very first sync's
 * 7-day default, otherwise hides it forever — `since` only moves forward after each sync, so a
 * workout older than the window at the moment it was first seen is never retried (D-419).
 *
 * Within that window, an ACTIVITY entry is only downloaded once (D-422): entries whose timestamp is
 * already in [SyncRequest.knownRawPayloadTimestamps] are skipped, since `:core:data` already has
 * that file on disk. Without this, every sync would re-pull every activity still listed in the
 * watch's directory over BLE — fine for the rare *new* workout, not for a watch holding months of
 * history. The remaining *new* entries (never downloaded before) are capped per sync at
 * [ACTIVITY_CATCH_UP_CAP], newest first, so a large backlog (e.g. right after this fix ships, or a
 * first pair on a watch with a full history) catches up gradually over several syncs instead of one
 * long BLE transfer; anything beyond the cap is simply still "new" next sync and gets reconsidered.
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
        // D-1092: METRICS (subtype 44, "BIOMETRIC" per docs/re-evidence/garmin — vo2_max,
        // recovery_time, race predictions, performance capacity) is written far less often than
        // daily MONITORING, so a VO2max update can easily be older than the default 7-day
        // wellnessSince window and silently never get synced. Give it the same long lookback as
        // ACTIVITY files, for the same reason (D-418/419/422).
        val metricsSince = request.now.minusSeconds(ACTIVITY_LOOKBACK_DAYS * SECONDS_PER_DAY)
        val activitySince = request.now.minusSeconds(ACTIVITY_LOOKBACK_DAYS * SECONDS_PER_DAY)
        val directory = GarminDirectory.parse(download(GarminDirectory.DIRECTORY_FILE_INDEX))
            .filter { it.fileIndex != GarminDirectory.DIRECTORY_FILE_INDEX }
        val typed = directory.mapNotNull { entry -> GarminFitFileType.of(entry)?.let { entry to it } }

        val dailyWellness = typed.filter { (entry, type) ->
            type != GarminFitFileType.ACTIVITY && type != GarminFitFileType.METRICS && entry.timestamp.isAfter(wellnessSince)
        }
        // Unlike dailyWellness (bounded by the advancing wellnessSince cursor), metricsSince is a
        // fixed rolling window re-applied on every sync, so dedup against already-downloaded
        // timestamps explicitly — otherwise every METRICS file in the window gets re-fetched on
        // every single sync, forever.
        val metrics = typed.filter { (entry, type) -> type == GarminFitFileType.METRICS && entry.timestamp.isAfter(metricsSince) }
            .filterNot { (entry, _) -> entry.timestamp in request.knownRawPayloadTimestamps }
        val nonActivity = dailyWellness + metrics
        val activityCandidates = typed.filter { (entry, type) -> type == GarminFitFileType.ACTIVITY && entry.timestamp.isAfter(activitySince) }
        val newActivities = activityCandidates.filterNot { (entry, _) -> entry.timestamp in request.knownRawPayloadTimestamps }
            .sortedByDescending { it.first.timestamp }
        val activityAlreadyKnown = activityCandidates.size - newActivities.size
        val activityThisSync = newActivities.take(ACTIVITY_CATCH_UP_CAP)
        val activityDeferred = newActivities.size - activityThisSync.size

        val wanted = (nonActivity + activityThisSync).sortedBy { it.first.timestamp }
        Log.i(
            TAG,
            "Directory: ${directory.size} entries, ${typed.size} FIT of interest ${countsByType(typed)}; " +
                "${wanted.size} to sync (wellness since=$wellnessSince, metrics since=$metricsSince, activity since=$activitySince, " +
                "activity alreadyDownloaded=$activityAlreadyKnown new=${newActivities.size} " +
                "thisSync=${activityThisSync.size} deferredToNextSync=$activityDeferred cap=$ACTIVITY_CATCH_UP_CAP)",
        )
        progress.report(DIRECTORY_SHARE)

        val daily = DailyActivityAccumulator()
        var delivered = 0
        var decodedFiles = 0
        var decodeFailures = 0
        var workoutsProduced = 0
        val downloaded = mutableListOf<GarminFitFileType>()
        // Per-record-type tally across this sync round, so "Sync finished" shows exactly which
        // metric kinds the watch's files actually carried (e.g. 0 Sleep/SpO2/RestingHeartRate is
        // the watch not having produced that data yet, not a parser gap — all file types decode
        // through the same FitHealthMapper.map(), see D-1070).
        val recordKindCounts = sortedMapOf<String, Int>()
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
                outcome.records.forEach { record ->
                    val kind = record::class.simpleName ?: "Unknown"
                    recordKindCounts[kind] = (recordKindCounts[kind] ?: 0) + 1
                }
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
                "totalRecords=$delivered byKind=$recordKindCounts",
        )
        return delivered
    }

    private fun countsByType(entries: List<Pair<GarminFileEntry, GarminFitFileType>>): Map<GarminFitFileType, Int> =
        entries.groupingBy { it.second }.eachCount()

    private fun countsOf(types: List<GarminFitFileType>): Map<GarminFitFileType, Int> =
        types.groupingBy { it }.eachCount()

    private fun decode(entry: GarminFileEntry, bytes: ByteArray, daily: DailyActivityAccumulator): DecodeOutcome = try {
        val file = FitDecoder.decode(bytes)
        // D-1071/D-1080 diagnostic: raw message-number histogram (before FitHealthMapper drops
        // anything it doesn't recognize), so a "message genuinely absent on this watch/firmware"
        // is distinguishable from "message present but our field guess is wrong" for any future
        // [Ext]-tagged constant, without needing another logging round-trip.
        val histogram = file.messages.groupingBy { it.globalNumber }.eachCount()
        Log.d(TAG, "File ${entry.fileIndex} raw globalNumbers=$histogram")
        DecodeOutcome(FitHealthMapper.map(file, zone(), daily), decoded = true)
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

        /**
         * Most never-downloaded ACTIVITY files fetched in one sync (D-422). Bounds BLE time/battery
         * on a catch-up sync (e.g. right after this fix ships, or a first pair against a watch with
         * months of un-archived history); anything beyond the cap is still "new" and is picked up by
         * a later sync, newest-first.
         */
        const val ACTIVITY_CATCH_UP_CAP = 50
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
