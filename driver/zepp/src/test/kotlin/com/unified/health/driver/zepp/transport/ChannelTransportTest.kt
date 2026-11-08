package com.unified.health.driver.zepp.transport

import com.unified.health.driver.zepp.FakeZeppWatch
import com.unified.health.driver.zepp.codec.ChannelProtocol
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Test

class ChannelTransportTest {

    private val authKey = ByteArray(16) { it.toByte() }

    private fun FakeZeppWatch.transport(scope: kotlinx.coroutines.CoroutineScope) =
        ChannelTransport(gatt, channelDown, channelUp, scope)

    @Test
    fun `retries a lost v2 ACK and completes the message`() = runTest {
        val watch = FakeZeppWatch(authKey)
        val transport = watch.transport(backgroundScope)
        assertNotNull(transport.open())
        transport.use(ChannelProtocol.V2)

        watch.dropAcks = 1
        assertEquals(mapOf(0x82 to false), transport.loadModuleList())
        assertEquals(0, watch.dropAcks)
    }

    @Test
    fun `v2 ACK retries are bounded`() = runTest {
        val watch = FakeZeppWatch(authKey)
        val transport = watch.transport(backgroundScope)
        assertNotNull(transport.open())
        transport.use(ChannelProtocol.V2)

        watch.dropAcks = ChannelTransport.ACK_ATTEMPTS
        // loadModuleList deliberately degrades a failed list to "no modules"; after the bounded
        // retries have been spent the answer is empty rather than hanging.
        assertEquals(emptyMap<Int, Boolean>(), transport.loadModuleList())
        assertEquals(0, watch.dropAcks)
    }
}
