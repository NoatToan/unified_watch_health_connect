package com.unified.health.driver.xiaomi.proto

import com.unified.health.core.ble.protocol.hexToBytes
import com.unified.health.core.ble.protocol.toHex
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Test

class TxosTest {

    // XIAOMI_TEST_VECTORS.json timeSync: 2026-11-12 19:30:00.250, UTC+7, "Asia/Ho_Chi_Minh", 24h.
    private val wxoHex = "0a0708ea0f100b180c12090813101e180020fa011a16083810001a10417369612f486f5f4368695f4d696e682001"
    private val txoHex = "222e$wxoHex" // txo.field4 wraps the same bytes with its own tag(0x22)/len(0x2e) header.

    private val wxo = Wxo(
        year = 2026, month = 11, day = 12,
        hour = 19, minute = 30, second = 0, millis = 250,
        utcOffset15min = 28, dstOffset15min = 0, tzId = "Asia/Ho_Chi_Minh", is24HourFormat = true,
    )

    @Test
    fun `Wxo encodes exactly like the timeSync vector`() {
        assertEquals(wxoHex, wxo.encode().toHex())
    }

    @Test
    fun `Wxo decodes every field from the timeSync vector`() {
        assertEquals(wxo, Wxo.decode(wxoHex.hexToBytes()))
    }

    @Test
    fun `Wxo round-trips an optional unknown tz string`() {
        val withUnknown = wxo.copy(unknown = "legacy")
        assertEquals("legacy", Wxo.decode(withUnknown.encode()).unknown)
    }

    @Test
    fun `Txo wraps wxo at field 4 exactly like the timeSync vector`() {
        assertEquals(txoHex, Txo(wxo = wxo.encode()).encode().toHex())
    }

    @Test
    fun `Txo decode extracts wxo from the timeSync vector`() {
        val txo = Txo.decode(txoHex.hexToBytes())
        assertEquals(wxoHex, txo.wxo?.toHex())
        assertNull(txo.vwo)
        assertNull(txo.swo)
    }

    @Test
    fun `Vwo decodes battery and charge info`() {
        val chargeInfo = ProtoWriter().int32Field(1, 2).int32Field(2, 1_700_000_000).toByteArray()
        val a = ProtoWriter().int32Field(1, 87).int32Field(2, 1).messageField(3, chargeInfo).toByteArray()
        val vwo = Vwo.decode(ProtoWriter().messageField(1, a).toByteArray())
        assertEquals(87, vwo.batteryPercent)
        assertEquals(1, vwo.chargeStatus)
        assertEquals(2, vwo.chargeState)
        assertEquals(1_700_000_000L, vwo.chargeTimestampSeconds)
    }

    @Test
    fun `Vwo tolerates a missing charge info`() {
        val a = ProtoWriter().int32Field(1, 55).toByteArray()
        val vwo = Vwo.decode(ProtoWriter().messageField(1, a).toByteArray())
        assertEquals(55, vwo.batteryPercent)
        assertNull(vwo.chargeStatus)
        assertNull(vwo.chargeState)
    }

    @Test
    fun `Vwo decode of an empty payload yields all-null fields`() {
        assertNull(Vwo.decode(ByteArray(0)).batteryPercent)
    }

    @Test
    fun `Swo decodes serial, firmware and model, ignoring the unused fields 3 and 5`() {
        val bytes = ProtoWriter()
            .stringField(1, "SN0001")
            .stringField(2, "1.2.3")
            .stringField(3, "")
            .stringField(4, "Smart Band 10")
            .stringField(5, "")
            .toByteArray()
        val swo = Swo.decode(bytes)
        assertEquals("SN0001", swo.serialNumber)
        assertEquals("1.2.3", swo.firmwareVersion)
        assertEquals("Smart Band 10", swo.model)
    }

    @Test
    fun `Swo decode of an empty payload yields all-null fields`() {
        val swo = Swo.decode(ByteArray(0))
        assertNull(swo.serialNumber)
        assertNull(swo.firmwareVersion)
        assertNull(swo.model)
    }
}
