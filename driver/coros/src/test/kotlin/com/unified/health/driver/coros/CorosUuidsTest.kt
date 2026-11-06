package com.unified.health.driver.coros

import org.junit.Assert.assertEquals
import org.junit.Test
import java.nio.charset.StandardCharsets
import java.util.UUID

class CorosUuidsTest {

    /** Self-documenting: the custom service suffix decodes to COROS's predecessor brand name. */
    @Test
    fun `weloop service suffix decodes to ASCII weloop`() {
        val suffixHex = CorosUuids.WELOOP_UART_SERVICE.toString().substringAfterLast('-')
        val bytes = ByteArray(suffixHex.length / 2) { i -> suffixHex.substring(i * 2, i * 2 + 2).toInt(16).toByte() }
        assertEquals("weloop", String(bytes, StandardCharsets.US_ASCII))
    }

    @Test
    fun `weloop and nordic uart variants share the standard characteristic offsets`() {
        // Service (…0001), write (…0002), notify (…0003) — same shape for both base UUIDs.
        assertEquals(UUID.fromString("6E400002-B5A3-F393-E0A9-77656C6F6F70"), CorosUuids.WELOOP_UART_WRITE)
        assertEquals(UUID.fromString("6E400003-B5A3-F393-E0A9-77656C6F6F70"), CorosUuids.WELOOP_UART_NOTIFY)
        assertEquals(UUID.fromString("6E400002-B5A3-F393-E0A9-E50E24DCCA9E"), CorosUuids.NORDIC_UART_WRITE)
        assertEquals(UUID.fromString("6E400003-B5A3-F393-E0A9-E50E24DCCA9E"), CorosUuids.NORDIC_UART_NOTIFY)
    }

    @Test
    fun `vendor services contains every custom and dfu service but not the raw characteristics`() {
        assertEquals(
            setOf(
                CorosUuids.WELOOP_UART_SERVICE,
                CorosUuids.NORDIC_UART_SERVICE,
                CorosUuids.ADF7_SERVICE,
                CorosUuids.NORDIC_DFU_SERVICE,
            ),
            CorosUuids.VENDOR_SERVICES,
        )
    }
}
