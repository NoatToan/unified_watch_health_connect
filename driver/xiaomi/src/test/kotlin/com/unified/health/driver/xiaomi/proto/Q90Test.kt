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
}
