package com.unified.health.driver.huawei.codec

import com.unified.health.core.ble.protocol.MalformedPayloadException
import com.unified.health.core.ble.protocol.hexToBytes
import com.unified.health.core.ble.protocol.toHex
import com.unified.health.driver.huawei.DeviceConfigurator
import org.junit.Assert.assertArrayEquals
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Test
import java.time.ZoneId
import java.time.ZoneOffset

/** Byte vectors for HUAWEI_DEVICE_PROTOCOL.md §11 (0x0107, 0x0132, 0x0102, 0x0103). */
class DeviceConfigCommandsTest {

    private fun String.clean() = replace(" ", "").hexToBytes()

    // --- 0x0107 ------------------------------------------------------------------------------

    @Test
    fun `version request is one empty tlv per requested type`() {
        assertEquals("0107 0100 0200 0300 0700 0900 0c00 0f00 1400 1600".replace(" ", ""), DeviceConfigCommands.deviceVersion().encode().toHex())
        assertEquals("0107 0100 0c00".replace(" ", ""), DeviceConfigCommands.deviceVersion(listOf(1, 12)).encode().toHex())
        // §11.1 says "29 types" but its own three switch lists name 30 ids (10 + 7 + 13).
        assertEquals(30, DeviceVersion.KNOWN_TYPES.size)
    }

    @Test
    fun `version response maps firmware model serial battery and bitmap`() {
        // 01 "1.2.3" | 03 "GT4" | 09 "SN1" | 0c 4b (75 %) | 16 0f01 | 1b 00 (type 27, kept raw only)
        val reply = HuaweiCommand.decode("0107 0105 312e322e33 0303 475434 0903 534e31 0c01 4b 1602 0f01 1b01 00".clean())
        val version = DeviceVersion.parse(reply)
        assertEquals("1.2.3", version.firmwareVersion)
        assertEquals("GT4", version.productModel) // no type 20: falls back to type 3
        assertEquals("SN1", version.serialNumber)
        assertEquals(75, version.batteryPercent)
        assertArrayEquals(byteArrayOf(0x0F, 0x01), version.capabilityBitmap)
        assertEquals(6, version.raw.size)
    }

    @Test
    fun `type 20 wins over type 3, out of range battery and padding are dropped`() {
        val reply = HuaweiCommand.decode("0107 0302 4141 1403 424200 0c01 c8".clean())
        val version = DeviceVersion.parse(reply)
        assertEquals("BB", version.productModel) // trailing NUL trimmed
        assertNull(version.batteryPercent) // 200 is not a percentage
        assertNull(version.firmwareVersion)
    }

    @Test(expected = MalformedPayloadException::class)
    fun `version error reply is rejected`() {
        DeviceVersion.parse(HuaweiCommand.decode("0107 7f04 0001a9ca".clean()))
    }

    // --- 0x0132 ------------------------------------------------------------------------------

    @Test
    fun `time zone request carries only the IANA id in tlv 3`() {
        val zone = ZoneId.of("Asia/Ho_Chi_Minh")
        val command = DeviceConfigCommands.setTimeZoneId(zone)
        assertEquals("0132", command.tag)
        assertEquals(listOf(3), command.tlvs.map { it.tag })
        assertArrayEquals(zone.id.toByteArray(Charsets.UTF_8), command.tlvs.single().value)
    }

    @Test
    fun `fixed offsets have no IANA id except UTC`() {
        assertEquals(ZoneId.of("Europe/London"), DeviceConfigurator.ianaZone(ZoneId.of("Europe/London")))
        assertEquals("Etc/UTC", DeviceConfigurator.ianaZone(ZoneOffset.UTC)?.id)
        assertNull(DeviceConfigurator.ianaZone(ZoneOffset.ofHours(7)))
    }

    // --- 0x0102 / 0x0103 ---------------------------------------------------------------------

    @Test
    fun `service consult request is count minus one then ids`() {
        assertEquals("0102 0103 01 0107".replace(" ", ""), DeviceConfigCommands.serviceCapability(listOf(1, 7)).encode().toHex())
        assertEquals("0102 0102 00 07".replace(" ", ""), DeviceConfigCommands.serviceCapability(listOf(7)).encode().toHex())
    }

    @Test
    fun `service bitmap bit 0 of byte i marks requested service i`() {
        val requested = listOf(1, 7, 23)
        assertEquals(listOf(1, 23), CapabilityConsult.supportedServices(HuaweiCommand.decode("0102 0103 010201".clean()), requested))
        // A short bitmap: services beyond it are unsupported.
        assertEquals(listOf(7), CapabilityConsult.supportedServices(HuaweiCommand.decode("0102 0102 0003".clean()), requested))
        assertNull(CapabilityConsult.supportedServices(HuaweiCommand.decode("0102 7f04 0001a9ca".clean()), requested))
        assertNull(CapabilityConsult.supportedServices(HuaweiCommand.decode("0102".clean()), requested))
    }

    @Test
    fun `command consult request nests service and command lists under 0x81`() {
        val command = DeviceConfigCommands.commandCapability(linkedMapOf(1 to listOf(5, 7), 7 to listOf(3)))
        // 81 0f | 02 01 01 | 03 03 02 05 07 | 02 01 07 | 03 02 01 03
        assertEquals("0103 810f 020101 0303020507 020107 03020103".replace(" ", ""), command.encode().toHex())
    }
}
