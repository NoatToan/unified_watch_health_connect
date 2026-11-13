package com.unified.health.driver.xiaomi.sync

import com.unified.health.core.ble.driver.SyncProgress
import com.unified.health.core.ble.driver.SyncRequest
import com.unified.health.core.model.HealthRecord
import com.unified.health.core.testing.RecordingSink
import com.unified.health.driver.xiaomi.FakeMiWearWatch
import com.unified.health.driver.xiaomi.XiaomiChannel
import com.unified.health.driver.xiaomi.proto.FitnessDataId
import com.unified.health.driver.xiaomi.proto.S7r
import com.unified.health.driver.xiaomi.proto.Ur9
import com.unified.health.driver.xiaomi.transport.XiaomiLink
import com.unified.health.driver.xiaomi.transport.XiaomiOpCode
import java.time.Instant
import java.util.zip.CRC32
import kotlinx.coroutines.test.TestScope
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

/** Exercises [XiaomiFitnessSyncImpl] end to end against a scripted [FakeMiWearWatch]. */
class XiaomiFitnessSyncImplTest {

    private val noProgress = SyncProgress { _, _ -> }

    private suspend fun TestScope.startedLink(watch: FakeMiWearWatch): XiaomiLink {
        val link = XiaomiLink(watch.gatt, watch.write, watch.notify, backgroundScope)
        link.start()
        return link
    }

    private fun u16le(value: Int) = byteArrayOf((value and 0xFF).toByte(), ((value ushr 8) and 0xFF).toByte())
    private fun u32le(value: Int) = byteArrayOf(
        (value and 0xFF).toByte(), ((value ushr 8) and 0xFF).toByte(), ((value ushr 16) and 0xFF).toByte(), ((value ushr 24) and 0xFF).toByte(),
    )

    private fun crc32(bytes: ByteArray): ByteArray {
        val value = CRC32().apply { update(bytes) }.value
        return byteArrayOf(
            (value and 0xFF).toByte(), ((value ushr 8) and 0xFF).toByte(), ((value ushr 16) and 0xFF).toByte(), ((value ushr 24) and 0xFF).toByte(),
        )
    }

    /** A `daily_report` (dataType=0, subType=0, fileType=1) file with steps/calories/restHr all valid. */
    private fun dailyReportId(timestampSeconds: Long) = FitnessDataId(
        timestampSeconds = timestampSeconds,
        timezone15min = 0,
        version = 2,
        dataType = FitnessDataId.DATA_TYPE_DAILY,
        subType = 0,
        fileType = 1,
    )

    private fun dailyReportFileBytes(id: FitnessDataId, steps: Int, calories: Int, restHr: Int): ByteArray {
        val dataValid = byteArrayOf(0xD0.toByte(), 0x00) // steps + calories + restHr valid, curHr not
        val body = u32le(steps) + u16le(calories) + byteArrayOf(0) + byteArrayOf(restHr.toByte())
        val payload = byteArrayOf(0) + dataValid + body
        val withId = id.encode() + payload
        return withId + crc32(withId)
    }

    /** Scripts the id exchange (`f=1`/`f=2`) to answer with exactly [ids]. */
    private fun FakeMiWearWatch.scriptIdExchange(ids: List<FitnessDataId>) {
        val idBytes = ids.fold(ByteArray(0)) { acc, id -> acc + id.encode() }
        onRequest(S7r.CLASS_FITNESS, 1) { S7r(e = S7r.CLASS_FITNESS, f = 1, ur9 = Ur9(field3Bytes = idBytes).encode()).encode() }
        onRequest(S7r.CLASS_FITNESS, 2) { S7r(e = S7r.CLASS_FITNESS, f = 2, ur9 = Ur9(field3Bytes = ByteArray(0)).encode()).encode() }
    }

    /**
     * Scripts `f=4` to push the channel-5 segment matching whichever id [filesById] has the
     * request's own id (decoded from the request's `ur9.field3Bytes`, matching [Ur9.requestOne]),
     * and `f=5` to just ack -- one handler shared by every id, since `FakeMiWearWatch.onRequest` is
     * keyed only by `(e, f)`, not by request contents.
     */
    private fun FakeMiWearWatch.scriptFileTransfers(filesById: Map<FitnessDataId, ByteArray>) {
        onRequest(S7r.CLASS_FITNESS, 4) { request ->
            val requestedId = FitnessDataId.decode(checkNotNull(Ur9.decode(checkNotNull(request.ur9)).field3Bytes))
            val fileBytes = checkNotNull(filesById[requestedId]) { "No scripted file for $requestedId" }
            pushChannelFrame(XiaomiChannel.FILE_FITNESS.id, XiaomiOpCode.WRITE, u16le(1) + u16le(1) + fileBytes)
            S7r(e = S7r.CLASS_FITNESS, f = 4).encode()
        }
        onRequest(S7r.CLASS_FITNESS, 5) { S7r(e = S7r.CLASS_FITNESS, f = 5).encode() }
    }

    @Test
    fun `syncs one daily report file, stores it raw and delivers its parsed records`() = runTest {
        val watch = FakeMiWearWatch()
        val id = dailyReportId(1_700_000_040L)
        val fileBytes = dailyReportFileBytes(id, steps = 8_000, calories = 450, restHr = 55)
        watch.scriptIdExchange(listOf(id))
        watch.scriptFileTransfers(mapOf(id to fileBytes))
        val link = startedLink(watch)
        val sink = RecordingSink()

        val delivered = XiaomiFitnessSyncImpl().sync(link, sink, noProgress, SyncRequest(since = Instant.EPOCH))

        assertEquals(2, delivered) // DailyActivity + RestingHeartRate
        val raw = sink.ofType<HealthRecord.RawPayload>().single()
        assertEquals("daily_report", raw.kind)
        assertEquals(Instant.ofEpochSecond(id.timestampSeconds), raw.createdAt)
        assertEquals(8_000, sink.ofType<HealthRecord.DailyActivity>().single().steps)
        assertEquals(55, sink.ofType<HealthRecord.RestingHeartRate>().single().bpm)
        assertEquals(1, watch.received.count { it.e == S7r.CLASS_FITNESS && it.f == 4 })
        assertEquals(1, watch.received.count { it.e == S7r.CLASS_FITNESS && it.f == 5 }) // confirmed after storing
    }

    @Test
    fun `a file whose timestamp is already known is not re-downloaded`() = runTest {
        val watch = FakeMiWearWatch()
        val id = dailyReportId(1_700_000_040L)
        watch.scriptIdExchange(listOf(id))
        watch.scriptFileTransfers(mapOf(id to dailyReportFileBytes(id, 1, 1, 1)))
        val link = startedLink(watch)
        val sink = RecordingSink()
        val request = SyncRequest(since = Instant.EPOCH, knownRawPayloadTimestamps = setOf(Instant.ofEpochSecond(id.timestampSeconds)))

        val delivered = XiaomiFitnessSyncImpl().sync(link, sink, noProgress, request)

        assertEquals(0, delivered)
        assertTrue(sink.records.isEmpty())
        assertEquals(0, watch.received.count { it.e == S7r.CLASS_FITNESS && it.f == 4 })
    }

    @Test
    fun `a file older than the first-sync window is skipped`() = runTest {
        val watch = FakeMiWearWatch()
        val oldId = dailyReportId(100L) // epoch second 100: ancient relative to `now`
        watch.scriptIdExchange(listOf(oldId))
        watch.scriptFileTransfers(mapOf(oldId to dailyReportFileBytes(oldId, 1, 1, 1)))
        val link = startedLink(watch)
        val sink = RecordingSink()
        val now = Instant.ofEpochSecond(10_000_000L)

        val delivered = XiaomiFitnessSyncImpl().sync(link, sink, noProgress, SyncRequest(since = null, now = now))

        assertEquals(0, delivered)
        assertEquals(0, watch.received.count { it.e == S7r.CLASS_FITNESS && it.f == 4 })
    }

    @Test
    fun `a CRC32 mismatch on one file is skipped without aborting the rest of the sync`() = runTest {
        val watch = FakeMiWearWatch()
        val goodId = dailyReportId(1_700_000_040L)
        val corruptId = dailyReportId(1_700_000_100L)
        watch.scriptIdExchange(listOf(goodId, corruptId))
        val corruptBytes = dailyReportFileBytes(corruptId, 1, 1, 1).also { it[it.size - 1] = (it[it.size - 1] + 1).toByte() }
        watch.scriptFileTransfers(
            mapOf(
                goodId to dailyReportFileBytes(goodId, steps = 8_000, calories = 450, restHr = 55),
                corruptId to corruptBytes,
            ),
        )
        val link = startedLink(watch)
        val sink = RecordingSink()

        val delivered = XiaomiFitnessSyncImpl().sync(link, sink, noProgress, SyncRequest(since = Instant.EPOCH))

        assertEquals(2, delivered) // only the good file's records
        assertEquals(1, sink.ofType<HealthRecord.RawPayload>().size)
        assertEquals(1, watch.received.count { it.e == S7r.CLASS_FITNESS && it.f == 5 }) // only the good file confirmed
    }
}
