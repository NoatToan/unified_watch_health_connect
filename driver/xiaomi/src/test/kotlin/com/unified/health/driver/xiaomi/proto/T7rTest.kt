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

    @Test
    fun `CMD_SEND_USERID with a q90 userId encodes to the hand-computed byte vector (protocol 6_2)`() {
        // t7r{1:1, 2:5, 3: q90{7:"abc"}} -- WearAuthV1.e()'s exact request shape.
        // 08 01          field1=1 (const)
        // 10 05          field2=5 (CMD_SEND_USERID)
        // 1A 05          field3, length 5 (the q90 bytes below)
        //   3A 03 61 62 63   q90 field7 (string) "abc"
        val expected = byteArrayOf(
            0x08, 0x01,
            0x10, 0x05,
            0x1A, 0x05,
            0x3A, 0x03, 0x61, 0x62, 0x63,
        )
        val actual = T7r(msgId = T7r.CMD_SEND_USERID, q90 = Q90(userId = "abc").encode()).encode()
        assertArrayEquals(expected, actual)

        val decoded = T7r.decode(actual)
        assertEquals(5, decoded.msgId)
        assertEquals("abc", Q90.decode(checkNotNull(decoded.q90)).userId)
    }
}
