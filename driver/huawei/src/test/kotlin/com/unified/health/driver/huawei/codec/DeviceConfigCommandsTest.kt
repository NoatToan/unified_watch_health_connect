package com.unified.health.driver.huawei.codec

import com.unified.health.core.ble.protocol.MalformedPayloadException
import com.unified.health.core.ble.protocol.hexToBytes
import com.unified.health.core.ble.protocol.toHex
import com.unified.health.driver.huawei.DeviceConfigurator
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertNull
import org.junit.Assert.assertTrue
import org.junit.Test
import java.time.Instant
import java.time.ZoneId
import java.time.ZoneOffset

/** Byte vectors for 0x0107, 0x0108, 0x0132, 0x0102, 0x0103 (HUAWEI_CONNECTION_ANALYSIS.md §1.5, §3). */
class DeviceConfigCommandsTest {

    private fun String.clean() = replace(" ", "").hexToBytes()

    // --- 0x0107 ------------------------------------------------------------------------------

    @Test
    fun `version request is one empty tlv per requested type`() {
        assertEquals("0107 0100 0200 0300 0700 0900 0c00 1400 1600".replace(" ", ""), DeviceConfigCommands.deviceVersion().encode().toHex())
        assertEquals("0107 0100 0c00".replace(" ", ""), DeviceConfigCommands.deviceVersion(listOf(1, 12)).encode().toHex())
        // §11.1 says "29 types" but its own three switch lists name 30 ids (10 + 7 + 13).
        assertEquals(30, DeviceVersion.KNOWN_TYPES.size)
    }

    @Test
    fun `version response maps firmware model serial name and bt mode`() {
        // 01 "1.2.3" | 03 "GT4" | 09 "SN1" | 0c "Watch4" | 16 "BLE"
        val reply = HuaweiCommand.decode("0107 0105 312e322e33 0303 475434 0903 534e31 0c06 576174636834 1603 424c45".clean())
        val version = DeviceVersion.parse(reply)
        assertEquals("1.2.3", version.firmwareVersion)
        assertEquals("GT4", version.productModel) // no type 20: falls back to type 3
        assertEquals("SN1", version.serialNumber)
        assertEquals("Watch4", version.deviceName) // type 12, not battery
        assertEquals("BLE", version.deviceBtMode) // type 22, not a capability bitmap
        assertEquals(5, version.raw.size)
    }

    @Test
    fun `type 20 wins over type 3 and padding is trimmed`() {
        val reply = HuaweiCommand.decode("0107 0302 4141 1403 424200".clean())
        val version = DeviceVersion.parse(reply)
        assertEquals("BB", version.productModel) // trailing NUL trimmed
        assertNull(version.firmwareVersion)
        assertNull(version.deviceName)
        assertNull(version.deviceBtMode)
    }

    @Test(expected = MalformedPayloadException::class)
    fun `version error reply is rejected`() {
        DeviceVersion.parse(HuaweiCommand.decode("0107 7f04 0001a9ca".clean()))
    }

    // --- 0x0108 ------------------------------------------------------------------------------

    @Test
    fun `battery request is service 1 cmd 8 with empty tlv 1`() {
        assertEquals("01080100", DeviceConfigCommands.battery().encode().toHex())
    }

    @Test
    fun `battery newer format parses tlv 1 and earbud levels`() {
        val reply = HuaweiCommand.decode("0108 0101 4b 0203 0a14 ff".clean())
        val battery = BatteryStatus.parse(reply)!!
        assertEquals(75, battery.levelPercent)
        assertEquals(10, battery.leftEarPercent)
        assertEquals(20, battery.rightEarPercent)
        assertNull(battery.casePercent) // 255 = unknown
    }

    @Test
    fun `battery protocol 0 reads raw byte 14`() {
        // 01 08 | five empty TLVs | TLV 0x7e len 1 value 0x41: byte 14 = 0x41 (65 %)
        val reply = HuaweiCommand.decode("0108 0000 0000 0000 0000 0000 7e01 41".clean())
        assertEquals(65, BatteryStatus.parse(reply)?.levelPercent)
    }

    @Test
    fun `battery error reply is null`() {
        assertNull(BatteryStatus.parse(HuaweiCommand.decode("0108 7f04 0001a9ca".clean())))
        assertNull(BatteryStatus.parse(HuaweiCommand.decode("0108 0100".clean())))
    }

    // --- 0x0132 ------------------------------------------------------------------------------

    @Test
    fun `time zone request is epoch then offset then iana id`() {
        val command = DeviceConfigCommands.setTimeZoneId(
            Instant.ofEpochSecond(0x65000000),
            ZoneOffset.UTC,
            ZoneId.of("Etc/UTC"),
        )
        assertEquals("0132", command.tag)
        assertEquals(listOf(1, 2, 3), command.tlvs.map { it.tag })
        // 01 32 header | TLV1 epoch 0x65000000 | TLV2 +00:00 | TLV3 "Etc/UTC"
        assertEquals("0132 0104 65000000 0202 0000 0307 4574632f555443".replace(" ", ""), command.encode().toHex())
    }

    @Test
    fun `time zone echo follows the vendor one-second tolerance`() {
        val now = Instant.ofEpochSecond(0x65000000)
        fun matches(hex: String) = DeviceConfigCommands.timeZoneEchoMatches(HuaweiCommand.decode(hex.clean()), now)
        assertTrue(matches("0132 0104 65000000")) // echo matches
        assertTrue(matches("0132")) // nothing to verify -> no resend
        assertTrue(matches("0132 7f04 000186a0")) // rejection is not an echo mismatch
        assertFalse(matches("0132 0104 65000001")) // 1 s drift -> resend once
        assertFalse(matches("0132 0104 64ffffff")) // 1 s the other way
        assertFalse(matches("0132 0101 01")) // readable but wrong
    }

    @Test
    fun `fixed offsets have no IANA id except UTC`() {
        assertEquals(ZoneId.of("Europe/London"), DeviceConfigurator.ianaZone(ZoneId.of("Europe/London")))
        assertEquals("Etc/UTC", DeviceConfigurator.ianaZone(ZoneOffset.UTC)?.id)
        assertNull(DeviceConfigurator.ianaZone(ZoneOffset.ofHours(7)))
    }

    // --- 0x0137 / 0x013C / 0x0112 -------------------------------------------------------------

    @Test
    fun `optional handshake requests match the decompiled payloads`() {
        assertEquals("0137 0100".replace(" ", ""), DeviceConfigCommands.expandCapability().encode().toHex())
        assertEquals("013c 0100 0200".replace(" ", ""), DeviceConfigCommands.createDualChannel(extendSocket = false).encode().toHex())
        assertEquals("013c 0100 0200 0300 0400".replace(" ", ""), DeviceConfigCommands.createDualChannel(extendSocket = true).encode().toHex())
        assertEquals("0112 8100".replace(" ", ""), DeviceConfigCommands.activityTypes().encode().toHex())
    }

    @Test
    fun `expand capability bitmap uses cqd bit numbering`() {
        // 81 12 | 01 10 "0000000000000001": bit 56 = byte 7 bit 0.
        val response = HuaweiCommand.decode("0137 8112 0110 30303030303030303030303030303031".clean())
        val bitmap = ExpandCapability.parse(response)!!
        assertTrue(ExpandCapability.supports(bitmap, 56))
        assertFalse(ExpandCapability.supports(bitmap, 57))
        assertFalse(ExpandCapability.supports(bitmap, 142))
        assertFalse(ExpandCapability.supports(bitmap, 64)) // beyond the bitmap
        assertNull(ExpandCapability.parse(HuaweiCommand.decode("0137 7f04 0001a9ca".clean())))
        assertEquals(0, ExpandCapability.parse(HuaweiCommand.decode("0137 8102 0100".clean()))!!.size)
        // A father whose children are not TLV 1 means "no expand capability", not a fatal reply.
        assertEquals(0, ExpandCapability.parse(HuaweiCommand.decode("0137 8102 0200".clean()))!!.size)
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

    @Test
    fun `command support parses nested tlv 2 service and tlv 4 vector`() {
        val requested = linkedMapOf(1 to listOf(5, 8), 7 to listOf(3, 4))
        // 81 07 | 02 01 01 | 04 02 01 00  and  81 07 | 02 01 07 | 04 02 00 01
        val reply = HuaweiCommand.decode("0103 8107 020101 04020100 8107 020107 04020001".clean())
        val support = CapabilityConsult.commandSupport(reply, requested)!!
        assertTrue(support.supports(1, 5))
        assertFalse(support.supports(1, 8))
        assertFalse(support.supports(7, 3))
        assertTrue(support.supports(7, 4))
        assertEquals(setOf(5), support.supportedCommands(1))
    }

    @Test
    fun `command support rejects error and empty replies and treats a short vector as unsupported`() {
        val requested = linkedMapOf(1 to listOf(5, 8))
        assertNull(CapabilityConsult.commandSupport(HuaweiCommand.decode("0103 7f04 0001a9ca".clean()), requested))
        assertNull(CapabilityConsult.commandSupport(HuaweiCommand.decode("0103".clean()), requested))
        // Vector has one byte: cmd 5 supported, cmd 8 missing from the vector -> unsupported.
        val short = CapabilityConsult.commandSupport(HuaweiCommand.decode("0103 8106 020101 040101".clean()), requested)!!
        assertTrue(short.supports(1, 5))
        assertFalse(short.supports(1, 8))
    }
}
