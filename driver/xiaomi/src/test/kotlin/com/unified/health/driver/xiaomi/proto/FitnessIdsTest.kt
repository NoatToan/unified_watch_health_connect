package com.unified.health.driver.xiaomi.proto

import com.unified.health.core.ble.protocol.MalformedPayloadException
import com.unified.health.core.ble.protocol.hexToBytes
import com.unified.health.core.ble.protocol.toHex
import org.junit.Assert.assertEquals
import org.junit.Assert.assertThrows
import org.junit.Test

class FitnessIdsTest {

    private val dataIdHex = "707b14691c0203"

    // XIAOMI_TEST_VECTORS.json fitnessRequestOne.dataId_hex, decoded by hand (see the session's
    // byte-level verification): 2025-11-12T12:20:00Z, UTC+7, version 2, daily/type0/file3.
    private val dataId = FitnessDataId(
        timestampSeconds = 1_762_950_000L,
        timezone15min = 28,
        version = 2,
        dataType = FitnessDataId.DATA_TYPE_DAILY,
        subType = 0,
        fileType = 3,
    )

    @Test
    fun `FitnessDataId decodes the fitnessRequestOne vector`() {
        assertEquals(dataId, FitnessDataId.decode(dataIdHex.hexToBytes()))
    }

    @Test
    fun `FitnessDataId encodes exactly like the fitnessRequestOne vector`() {
        assertEquals(dataIdHex, dataId.encode().toHex())
    }

    @Test
    fun `FitnessDataId round-trips a negative timezone`() {
        val id = dataId.copy(timezone15min = -28) // UTC-7
        assertEquals(id, FitnessDataId.decode(id.encode()))
    }

    @Test
    fun `FitnessDataId round-trips a sport typeByte`() {
        val id = dataId.copy(dataType = FitnessDataId.DATA_TYPE_SPORT, subType = 5, fileType = 1)
        val decoded = FitnessDataId.decode(id.encode())
        assertEquals(FitnessDataId.DATA_TYPE_SPORT, decoded.dataType)
        assertEquals(5, decoded.subType)
        assertEquals(1, decoded.fileType)
    }

    @Test
    fun `FitnessDataId decode rejects anything other than 7 bytes`() {
        assertThrows(MalformedPayloadException::class.java) { FitnessDataId.decode(ByteArray(6)) }
        assertThrows(MalformedPayloadException::class.java) { FitnessDataId.decode(ByteArray(8)) }
    }

    @Test
    fun `Ur9 requestToday encodes exactly like the fitnessTodayIds vector`() {
        assertEquals("2a020800", Ur9.requestToday(isAutoSync = false).encode().toHex())
    }

    @Test
    fun `Ur9 requestOne encodes exactly like the fitnessRequestOne vector`() {
        assertEquals("1a07707b14691c0203", Ur9.requestOne(dataId).encode().toHex())
    }

    @Test
    fun `Ur9 decode extracts nu9 from the fitnessTodayIds vector`() {
        val ur9 = Ur9.decode("2a020800".hexToBytes())
        assertEquals(false, Nu9.decode(checkNotNull(ur9.nu9)).isAutoSync)
    }

    @Test
    fun `Ur9 decode extracts the single id from the fitnessRequestOne vector`() {
        val ur9 = Ur9.decode("1a07707b14691c0203".hexToBytes())
        assertEquals(dataId, FitnessDataId.decode(checkNotNull(ur9.field3Bytes)))
    }

    @Test
    fun `Nu9 round-trips isAutoSync true and false`() {
        assertEquals(true, Nu9.decode(Nu9(true).encode()).isAutoSync)
        assertEquals(false, Nu9.decode(Nu9(false).encode()).isAutoSync)
    }

    @Test
    fun `Ur9 decodeIds splits a concatenated blob and rejects a bad length`() {
        val ids = listOf(dataId, dataId.copy(timestampSeconds = dataId.timestampSeconds + 60))
        val concatenated = checkNotNull(Ur9.requestMany(ids).field2Bytes)
        assertEquals(ids, Ur9.decodeIds(concatenated))
        assertThrows(MalformedPayloadException::class.java) { Ur9.decodeIds(ByteArray(8)) }
    }
}
