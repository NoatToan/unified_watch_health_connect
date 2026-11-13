package com.unified.health.driver.xiaomi.codec

import com.unified.health.core.ble.protocol.MalformedPayloadException
import com.unified.health.driver.xiaomi.proto.FitnessDataId
import java.util.zip.CRC32
import org.junit.Assert.assertArrayEquals
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Assert.fail
import org.junit.Test

class FitnessFilePayloadTest {

    private val id = FitnessDataId(
        timestampSeconds = 1_700_000_000L,
        timezone15min = 28, // UTC+7
        version = 2,
        dataType = FitnessDataId.DATA_TYPE_DAILY,
        subType = 0,
        fileType = 0,
    )

    private fun crc32(bytes: ByteArray): Long = CRC32().apply { update(bytes) }.value

    private fun merged(id: FitnessDataId, payload: ByteArray): ByteArray {
        val body = id.encode() + payload
        val crc = crc32(body)
        val crcBytes = byteArrayOf(
            (crc and 0xFF).toByte(),
            ((crc ushr 8) and 0xFF).toByte(),
            ((crc ushr 16) and 0xFF).toByte(),
            ((crc ushr 24) and 0xFF).toByte(),
        )
        return body + crcBytes
    }

    @Test
    fun `decode splits the id and payload and strips a valid CRC32`() {
        val payload = byteArrayOf(9, 8, 7, 6)
        val decoded = FitnessFilePayload.decode(merged(id, payload), expectedId = id)
        assertEquals(id, decoded.id)
        assertArrayEquals(payload, decoded.payload)
    }

    @Test
    fun `rawPayloadBytes round-trips id + payload for reprocess`() {
        val payload = byteArrayOf(1, 2, 3)
        val decoded = FitnessFilePayload.decode(merged(id, payload), expectedId = id)
        assertArrayEquals(id.encode() + payload, decoded.rawPayloadBytes)
    }

    @Test
    fun `a corrupted CRC32 is rejected`() {
        val bytes = merged(id, byteArrayOf(1, 2, 3))
        bytes[bytes.size - 1] = (bytes[bytes.size - 1] + 1).toByte()
        try {
            FitnessFilePayload.decode(bytes, expectedId = id)
            fail("expected MalformedPayloadException")
        } catch (e: MalformedPayloadException) {
            assertTrue(e.message!!.contains("CRC32"))
        }
    }

    @Test
    fun `an id that does not match the requested id is rejected`() {
        val otherId = id.copy(timestampSeconds = id.timestampSeconds + 60)
        val bytes = merged(otherId, byteArrayOf(1))
        try {
            FitnessFilePayload.decode(bytes, expectedId = id)
            fail("expected MalformedPayloadException")
        } catch (e: MalformedPayloadException) {
            assertTrue(e.message!!.contains("does not match"))
        }
    }

    @Test
    fun `a transfer too short for an id plus CRC32 is rejected`() {
        try {
            FitnessFilePayload.decode(ByteArray(5), expectedId = id)
            fail("expected MalformedPayloadException")
        } catch (e: MalformedPayloadException) {
            assertTrue(e.message!!.contains("too short"))
        }
    }
}
