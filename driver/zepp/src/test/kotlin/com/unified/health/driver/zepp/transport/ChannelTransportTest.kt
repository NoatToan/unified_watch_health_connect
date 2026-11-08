package com.unified.health.driver.zepp.transport

import com.unified.health.driver.zepp.FakeZeppWatch
import com.unified.health.driver.zepp.codec.ChannelProtocol
import com.unified.health.driver.zepp.codec.ConnectParamCodec
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

    @Test
    fun `parses the FakeZeppWatch module 0x15 reply into the channel write size`() = runTest {
        val watch = FakeZeppWatch(
            authKey,
            mtu = 247,
            modules = mapOf(0x82 to false, 0x15 to false),
            connectParamPayload = 100, // ATT MTU 103
        )
        val transport = watch.transport(backgroundScope)
        assertNotNull(transport.open())
        transport.use(ChannelProtocol.V2)
        transport.loadModuleList()

        val reply = transport.request(ConnectParamCodec.MODULE, ConnectParamCodec.query(), 1_000) {
            ConnectParamCodec.parseAttMtu(it) != null
        }
        transport.useAttMtu(checkNotNull(ConnectParamCodec.parseAttMtu(reply)))
        assertEquals(1, watch.connectParamRequests)
        assertEquals(100, transport.writeSize())
    }

    @Test
    fun `channel write size uses the watch-reported ATT MTU capped at 247`() = runTest {
        val watch = FakeZeppWatch(authKey, mtu = 247)
        val transport = watch.transport(backgroundScope)

        // No report yet: GATT MTU - 3, capped at the vendor maximum (Mtu.ATT_MTU_MAX).
        assertEquals(244, transport.writeSize())
        transport.useAttMtu(103) // module 0x15 payload 100 + ATT header 3
        assertEquals(100, transport.writeSize())
        transport.useAttMtu(247)
        assertEquals(244, transport.writeSize())
    }

    @Test
    fun `channel write size never exceeds the GATT-negotiated MTU`() = runTest {
        val watch = FakeZeppWatch(authKey, mtu = 23)
        val transport = watch.transport(backgroundScope)

        assertEquals(20, transport.writeSize())
        // A watch report cannot override a smaller real ATT payload; Android would reject the write.
        transport.useAttMtu(247)
        assertEquals(20, transport.writeSize())
    }
}
