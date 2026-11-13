package com.unified.health.driver.xiaomi.proto

import org.junit.Assert.assertArrayEquals
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Test

class Q90Test {

    @Test
    fun `round-trips the appVerify slot (field 30)`() {
        val payload = byteArrayOf(1, 2, 3, 4)
        val decoded = Q90.decode(Q90(appVerify = payload).encode())
        assertArrayEquals(payload, decoded.appVerify)
        assertNull(decoded.deviceVerify)
        assertNull(decoded.errorCode)
    }

    @Test
    fun `round-trips each of the four auth message slots independently`() {
        assertArrayEquals(byteArrayOf(1), Q90.decode(Q90(deviceVerify = byteArrayOf(1)).encode()).deviceVerify)
        assertArrayEquals(byteArrayOf(2), Q90.decode(Q90(appConfirm = byteArrayOf(2)).encode()).appConfirm)
        assertArrayEquals(byteArrayOf(3), Q90.decode(Q90(deviceConfirm = byteArrayOf(3)).encode()).deviceConfirm)
    }

    @Test
    fun `round-trips the error code (field 3) -- code 4 means device not bound`() {
        val decoded = Q90.decode(Q90(errorCode = Q90.ERROR_NOT_BOUND).encode())
        assertEquals(4, decoded.errorCode)
    }

    // ===== V1 CMD_SEND_USERID fields (protocol §6.2 [V]) =====

    @Test
    fun `userId (field 7) encodes to the hand-computed byte vector`() {
        // tag=(7<<3)|2=0x3A, len=3, "abc": field7 is a length-delimited string, same wire type as
        // every other string field this module already encodes.
        val expected = byteArrayOf(0x3A, 0x03, 'a'.code.toByte(), 'b'.code.toByte(), 'c'.code.toByte())
        assertArrayEquals(expected, Q90(userId = "abc").encode())
    }

    @Test
    fun `userId round-trips`() {
        val decoded = Q90.decode(Q90(userId = "mi-fitness-user-1").encode())
        assertEquals("mi-fitness-user-1", decoded.userId)
        assertNull(decoded.success)
    }

    @Test
    fun `success (field 8) encodes to the hand-computed byte vector`() {
        // tag=(8<<3)|0=0x40, varint(1)=0x01.
        assertArrayEquals(byteArrayOf(0x40, 0x01), Q90(success = true).encode())
    }

    @Test
    fun `success round-trips true and false`() {
        assertEquals(true, Q90.decode(Q90(success = true).encode()).success)
        assertEquals(false, Q90.decode(Q90(success = false).encode()).success)
    }

    @Test
    fun `a reply with neither userId nor success nor errorCode decodes all three as null`() {
        val decoded = Q90.decode(Q90().encode())
        assertNull(decoded.userId)
        assertNull(decoded.success)
        assertNull(decoded.errorCode)
    }
}
