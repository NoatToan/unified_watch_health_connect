package com.unified.health.driver.xiaomi.proto

import org.junit.Assert.assertArrayEquals
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Test

class T7rTest {

    @Test
    fun `round-trips CMD_NONCE with a q90 payload`() {
        val q90 = byteArrayOf(1, 2, 3)
        val decoded = T7r.decode(T7r(msgId = T7r.CMD_NONCE, q90 = q90).encode())
        assertEquals(T7r.CMD_NONCE, decoded.msgId)
        assertArrayEquals(q90, decoded.q90)
    }

    @Test
    fun `round-trips CMD_AUTH with no payload`() {
        val decoded = T7r.decode(T7r(msgId = T7r.CMD_AUTH).encode())
        assertEquals(T7r.CMD_AUTH, decoded.msgId)
        assertNull(decoded.q90)
    }

    @Test
    fun `the leading constant field (always 1) is ignored on decode`() {
        val bytes = ProtoWriter().int32Field(1, 99).int32Field(2, T7r.CMD_NONCE).toByteArray()
        assertEquals(T7r.CMD_NONCE, T7r.decode(bytes).msgId)
    }
}
