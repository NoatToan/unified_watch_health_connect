package com.unified.health.driver.xiaomi.proto

import com.unified.health.core.ble.protocol.MalformedPayloadException
import com.unified.health.core.ble.protocol.hexToBytes
import com.unified.health.core.ble.protocol.toHex
import org.junit.Assert.assertArrayEquals
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Assert.assertThrows
import org.junit.Assert.assertTrue
import org.junit.Test

class S7rTest {

    @Test
    fun `decodes and re-encodes the getBindInfo vector (e=1 bind, p90 slot)`() {
        val hex = "080110111a165a1408001210e807f1fcf82d132f9bb018ca6738a19f"
        val s7r = S7r.decode(hex.hexToBytes())
        assertEquals(1, s7r.e)
        assertEquals(17, s7r.f)
        assertEquals("5a1408001210e807f1fcf82d132f9bb018ca6738a19f", s7r.p90?.toHex())
        assertNull(s7r.txo)
        assertNull(s7r.ur9)
        assertNull(s7r.errorCode)
        assertEquals(hex, S7r.request(1, 17, s7r.p90).encode().toHex())
    }

    @Test
    fun `decodes and re-encodes the timeSync vector (e=2 system, txo slot)`() {
        val hex = "080210032230222e0a0708ea0f100b180c12090813101e180020fa011a16083810001a10417369612f486f5f4368695f4d696e682001"
        val txoHex = "222e0a0708ea0f100b180c12090813101e180020fa011a16083810001a10417369612f486f5f4368695f4d696e682001"
        val s7r = S7r.decode(hex.hexToBytes())
        assertEquals(2, s7r.e)
        assertEquals(3, s7r.f)
        assertEquals(txoHex, s7r.txo?.toHex())
        assertEquals(hex, S7r.request(2, 3, s7r.txo).encode().toHex())
    }

    @Test
    fun `decodes and re-encodes the battery request vector (no payload)`() {
        val hex = "08021001"
        val s7r = S7r.decode(hex.hexToBytes())
        assertEquals(2, s7r.e)
        assertEquals(1, s7r.f)
        assertNull(s7r.txo)
        assertEquals(hex, S7r.request(2, 1, payload = null).encode().toHex())
    }

    @Test
    fun `decodes and re-encodes the fitness-ids vectors (e=8 fitness, ur9 slot)`() {
        val today = "0808100152042a020800"
        val requestOne = "0808100452091a07707b14691c0203"
        val confirm = "0808100552091a07707b14691c0203"

        val todayDecoded = S7r.decode(today.hexToBytes())
        assertEquals(8, todayDecoded.e)
        assertEquals(1, todayDecoded.f)
        assertEquals("2a020800", todayDecoded.ur9?.toHex())
        assertEquals(today, S7r.request(8, 1, todayDecoded.ur9).encode().toHex())

        val requestOneDecoded = S7r.decode(requestOne.hexToBytes())
        assertEquals(4, requestOneDecoded.f)
        assertEquals("1a07707b14691c0203", requestOneDecoded.ur9?.toHex())
        assertEquals(requestOne, S7r.request(8, 4, requestOneDecoded.ur9).encode().toHex())

        val confirmDecoded = S7r.decode(confirm.hexToBytes())
        assertEquals(5, confirmDecoded.f)
        assertArrayEquals(requestOneDecoded.ur9, confirmDecoded.ur9)
        assertEquals(confirm, S7r.request(8, 5, confirmDecoded.ur9).encode().toHex())
    }

    @Test
    fun `field 100 round-trips as the error code`() {
        val bytes = S7r(e = 2, f = 1, errorCode = 4).encode()
        val decoded = S7r.decode(bytes)
        assertEquals(4, decoded.errorCode)
    }

    @Test
    fun `throwOnError throws only for a non-zero error code`() {
        S7r(e = 2, f = 1).throwOnError() // no error field at all: must not throw
        S7r(e = 2, f = 1, errorCode = 0).throwOnError() // explicit zero: must not throw
        val exception = assertThrows(XiaomiDeviceErrorException::class.java) { S7r(e = 2, f = 1, errorCode = 4).throwOnError() }
        assertEquals(4, exception.errorCode)
        assertEquals(2, exception.e)
        assertEquals(1, exception.f)
        assertTrue(exception.message!!.contains("not bound"))
    }

    @Test
    fun `payloadFieldFor is only known for bind, system and fitness`() {
        assertEquals(S7r.FIELD_P90, S7r.payloadFieldFor(S7r.CLASS_BIND))
        assertEquals(S7r.FIELD_TXO, S7r.payloadFieldFor(S7r.CLASS_SYSTEM))
        assertEquals(S7r.FIELD_UR9, S7r.payloadFieldFor(S7r.CLASS_FITNESS))
        assertNull(S7r.payloadFieldFor(22))
    }

    @Test
    fun `request throws for a payload on an unmapped class`() {
        assertThrows(MalformedPayloadException::class.java) { S7r.request(e = 22, f = 1, payload = byteArrayOf(1)) }
    }

    @Test
    fun `request with a null payload never throws, regardless of class`() {
        val s7r = S7r.request(e = 22, f = 1, payload = null)
        assertEquals(22, s7r.e)
        assertNull(s7r.p90)
        assertNull(s7r.txo)
        assertNull(s7r.ur9)
    }

    @Test
    fun `decode throws on a truncated varint`() {
        assertThrows(MalformedPayloadException::class.java) { S7r.decode(byteArrayOf(0x08)) }
    }

    @Test
    fun `decode tolerates and skips an unknown field`() {
        val bytes = ProtoWriter().int32Field(1, 2).int32Field(50, 7).int32Field(2, 1).toByteArray()
        val s7r = S7r.decode(bytes)
        assertEquals(2, s7r.e)
        assertEquals(1, s7r.f)
    }
}
