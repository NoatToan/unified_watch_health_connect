package com.unified.health.driver.garmin.codec

import com.unified.health.core.ble.protocol.MalformedPayloadException
import com.unified.health.core.ble.protocol.buildBytes
import com.unified.health.core.ble.protocol.hexToBytes
import com.unified.health.core.ble.protocol.toHex
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test
import java.time.Instant
import java.time.ZoneId
import java.time.ZoneOffset

class GfdiPayloadsTest {

    @Test
    fun `decodes device information and ignores optional trailing fields`() {
        val payload = buildBytes {
            u16le(150)
            u16le(3990)
            u32le(3_456_789_012L)
            u16le(1234)
            u16le(375)
            string8("FR265")
            string8("Forerunner 265")
            string8("Forerunner 265 Music")
            u8(1) // dual BT flag + MACs: ignored
            bytes(ByteArray(12))
        }
        val info = GarminDeviceInformation.decode(payload)
        assertEquals(150, info.protocolVersion)
        assertEquals(3990, info.productNumber)
        assertEquals(3_456_789_012L, info.unitId)
        assertEquals(375, info.maxPacketSize)
        assertEquals("Forerunner 265 Music", info.deviceModel)
        assertEquals("12.34", info.firmwareVersionText)
    }

    @Test(expected = MalformedPayloadException::class)
    fun `truncated device information is malformed`() {
        GarminDeviceInformation.decode("71000100".hexToBytes())
    }

    @Test
    fun `host 5050 advertises exactly bits 0 3 4 5 29 71`() {
        // byte 0: bits 0,3,4,5 = 0x39; byte 3: bit 29 = 0x20; byte 8: bit 71 = 0x80; 9 bytes, length-prefixed.
        assertEquals("09" + "39000020" + "00000000" + "80", GfdiPayloads.hostConfiguration().toHex())
        assertEquals(setOf(0, 3, 4, 5, 29, 71), GfdiPayloads.HOST_CAPABILITIES)
    }

    @Test
    fun `capability bitmask sets bit modulo 8 in byte bit div 8`() {
        assertEquals("", GfdiPayloads.capabilityBitmask(emptySet()).toHex())
        assertEquals("01", GfdiPayloads.capabilityBitmask(setOf(0)).toHex())
        assertEquals("0080", GfdiPayloads.capabilityBitmask(setOf(15)).toHex())
        assertEquals("010001", GfdiPayloads.capabilityBitmask(setOf(0, 16)).toHex())
    }

    @Test
    fun `provisional 5023 battery status decodes the inferred layout`() {
        // 64 % | status 6 (charging) | timestamp 0x12345678 LE
        val battery = BatteryStatus.decode("400678563412".hexToBytes())
        assertEquals(BatteryStatus(percent = 64, status = 6, fitTimestamp = 0x12345678L), battery)
        assertTrue(battery!!.isCharging)
        assertEquals(BatteryStatus(100, 2, 0), BatteryStatus.decode("640200000000".hexToBytes() + byteArrayOf(9)))
    }

    @Test
    fun `5023 that does not fit the inferred layout is rejected`() {
        assertEquals(null, BatteryStatus.decode("4006".hexToBytes())) // too short
        assertEquals(null, BatteryStatus.decode("ff0200000000".hexToBytes())) // 0xFF = unknown percent
        assertEquals(null, BatteryStatus.decode("650200000000".hexToBytes())) // 101 %
        assertEquals(null, BatteryStatus.decode("400900000000".hexToBytes())) // status out of range
    }

    @Test
    fun `host information layout`() {
        val bytes = GfdiPayloads.hostInformation(HostIdentity(appVersion = 2, friendlyName = "UH", manufacturer = "G", model = "P9"))
        assertEquals(
            "7100" + "ffff" + "ffffffff" + "0200" + "ffff" + "02" + "5548" + "01" + "47" + "02" + "5039" + "01",
            bytes.toHex(),
        )
    }

    @Test
    fun `current time reply echoes the request and lists DST start then end`() {
        val now = Instant.parse("2026-03-01T00:00:00Z")
        val reply = GfdiPayloads.currentTimeReply("0102030405".hexToBytes(), now, ZoneId.of("Europe/Berlin"))
        // echo | now (FIT s) | +3600 s | DST start 2026-03-29T01:00Z | DST end 2026-10-25T01:00Z
        assertEquals("01020304" + "80350644" + "100e0000" + "902d2b44" + "90084045", reply.toHex())
    }

    @Test
    fun `current time reply in late year still orders start before end`() {
        val now = Instant.parse("2026-10-01T00:00:00Z")
        val reply = GfdiPayloads.currentTimeReply("01020304".hexToBytes(), now, ZoneId.of("Europe/Berlin"))
        val dstEnd = FitTime.fromInstant(Instant.parse("2026-10-25T01:00:00Z"))
        val dstStart = FitTime.fromInstant(Instant.parse("2027-03-28T01:00:00Z"))
        assertEquals(buildBytes { u32le(dstStart); u32le(dstEnd) }.toHex(), reply.copyOfRange(12, 20).toHex())
    }

    @Test
    fun `current time reply without DST uses zero transitions and a negative offset`() {
        val reply = GfdiPayloads.currentTimeReply("00000000".hexToBytes(), Instant.parse("2026-03-01T00:00:00Z"), ZoneOffset.ofHours(-5))
        assertEquals("b0b9ffff" + "00000000" + "00000000", reply.copyOfRange(8, 20).toHex())
    }

    @Test(expected = MalformedPayloadException::class)
    fun `current time request shorter than 4 bytes is malformed`() {
        GfdiPayloads.currentTimeReply("0102".hexToBytes(), Instant.EPOCH, ZoneOffset.UTC)
    }

    @Test
    fun `configuration round trip`() {
        val mask = GfdiPayloads.decodeConfiguration("03ff0f01".hexToBytes())
        assertEquals("ff0f01", mask.toHex())
        assertEquals("03ff0f01", GfdiPayloads.encodeConfiguration(mask).toHex())
    }

    @Test
    fun `download request and response`() {
        assertEquals("0700" + "00000000" + "01" + "0000" + "00000000" + "00", GfdiPayloads.downloadRequest(7).toHex())
        val ok = DownloadResponse.decode("0010270000".hexToBytes())
        assertTrue(ok.isOk)
        assertEquals(10_000L, ok.fileSize)
        assertFalse(DownloadResponse.decode("0100000000".hexToBytes()).isOk)
    }

    @Test
    fun `directory entries are parsed after the 16 byte header`() {
        val bytes = buildBytes {
            bytes(ByteArray(16))
            u16le(5); u8(128); u8(32); u16le(9); u8(0); u8(0x20); u32le(4096); u32le(1_141_257_600L)
            u16le(6); u8(8); u8(4); u16le(1); u8(0); u8(0); u32le(10); u32le(1L)
            bytes(ByteArray(5)) // partial trailing entry ignored
        }
        val entries = GarminDirectory.parse(bytes)
        assertEquals(2, entries.size)
        val first = entries[0]
        assertEquals(5, first.fileIndex)
        assertEquals(GarminFitFileType.MONITORING, GarminFitFileType.of(first))
        assertEquals(4096L, first.size)
        assertEquals(Instant.parse("2026-03-01T00:00:00Z"), first.timestamp)
        assertEquals(null, GarminFitFileType.of(entries[1]))
        assertTrue(GarminDirectory.parse(ByteArray(16)).isEmpty())
    }
}
