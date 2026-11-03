package com.unified.health.driver.garmin.codec.fit

import com.unified.health.driver.garmin.testing.FitFileBuilder
import com.unified.health.driver.garmin.testing.FitFileBuilder.Companion.STRING
import com.unified.health.driver.garmin.testing.FitFileBuilder.Companion.s16
import com.unified.health.driver.garmin.testing.FitFileBuilder.Companion.u16
import com.unified.health.driver.garmin.testing.FitFileBuilder.Companion.u32
import com.unified.health.driver.garmin.testing.FitFileBuilder.Companion.u8
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Test

class FitDecoderTest {

    @Test
    fun `decodes little and big endian definitions with invalid sentinels`() {
        val bytes = FitFileBuilder()
            .define(0, 55, u32(253), u16(19), u8(27))
            .record(0, 1000, 0xFFFF, 72)
            .define(1, 227, s16(0), u32(1), bigEndian = true)
            .record(1, -2L and 0xFFFF, 1001)
            .build()
        val file = FitDecoder.decode(bytes)
        assertEquals(2132, file.profileVersion)
        val (monitoring, stress) = file.messages
        assertEquals(55, monitoring.globalNumber)
        assertEquals(1000L, monitoring.timestamp)
        assertNull(monitoring.value(19)) // 0xFFFF is invalid
        assertEquals(72L, monitoring.value(27))
        assertEquals(227, stress.globalNumber)
        assertEquals(-2L, stress.value(0)) // sign-extended big-endian sint16
        assertEquals(1001L, stress.value(1))
    }

    @Test
    fun `skips developer fields and decodes strings`() {
        val bytes = FitFileBuilder()
            .define(0, 55, u32(253), u8(27), developerFieldSizes = listOf(3, 2))
            .record(0, 500, 90)
            .define(1, 0, FitFileBuilder.Field(8, 6, STRING))
            .string(1, "fenix", 6)
            .build()
        val messages = FitDecoder.decode(bytes).messages
        assertEquals(90L, messages[0].value(27))
        assertEquals("fenix", messages[1].string(8))
    }

    @Test
    fun `compressed timestamp headers roll over relative to the last timestamp`() {
        val bytes = FitFileBuilder()
            .define(0, 55, u32(253), u8(27))
            .define(1, 55, u8(27))
            .record(0, 0x3E, 60) // low 5 bits = 30
            .compressed(1, timeOffset = 31, 61) // 31 >= 30 → 0x3F
            .compressed(1, timeOffset = 2, 62) // 2 < 31 → rolls over to 0x42
            .build()
        val timestamps = FitDecoder.decode(bytes).messages.map { it.timestamp }
        assertEquals(listOf(0x3EL, 0x3FL, 0x42L), timestamps)
    }

    @Test(expected = FitDecodeException::class)
    fun `rejects a file crc mismatch`() {
        FitDecoder.decode(FitFileBuilder().define(0, 55, u8(27)).record(0, 1).build(corruptFileCrc = true))
    }

    @Test(expected = FitDecodeException::class)
    fun `rejects data for an undefined local type`() {
        FitDecoder.decode(FitFileBuilder().define(0, 55, u8(27)).raw(0x03, 0x01).build())
    }

    @Test(expected = FitDecodeException::class)
    fun `rejects a compressed timestamp before any full timestamp`() {
        FitDecoder.decode(FitFileBuilder().define(0, 55, u8(27)).compressed(0, 3, 1).build())
    }

    @Test(expected = FitDecodeException::class)
    fun `rejects non FIT data`() {
        FitDecoder.decode(ByteArray(20))
    }

    @Test(expected = FitDecodeException::class)
    fun `rejects truncated records`() {
        FitDecoder.decode(FitFileBuilder().define(0, 55, u32(253)).raw(0x00, 0x01).build())
    }
}
