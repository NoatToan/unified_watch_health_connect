package com.unified.health.core.ble.gatt

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

/** [friendlyConnectionFailureMessage] — D-1189: known GATT status codes get a sentence, not a bare number. */
class AndroidGattClientTest {

    @Test
    fun `known status codes return an explanatory sentence, not the raw number as the whole message`() {
        for (status in listOf(8, 19, 22, 62, 133, 147)) {
            val message = friendlyConnectionFailureMessage(status)
            assertTrue("status $status should produce a real sentence, got: $message", message.length > 20)
            assertFalse("status $status's message shouldn't be just the bare code", message == "status $status")
        }
    }

    @Test
    fun `status 147 specifically mentions a retry, matching the user-reported case`() {
        val message = friendlyConnectionFailureMessage(147)
        assertTrue(message.contains("Try again", ignoreCase = true) || message.contains("try again", ignoreCase = true))
    }

    @Test
    fun `an unrecognized status code still includes the raw code for diagnosis`() {
        val message = friendlyConnectionFailureMessage(9999)
        assertTrue(message.contains("9999"))
    }
}
