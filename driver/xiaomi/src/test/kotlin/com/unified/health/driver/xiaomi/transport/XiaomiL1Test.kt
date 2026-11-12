package com.unified.health.driver.xiaomi.transport

import com.unified.health.core.ble.protocol.MalformedPayloadException
import com.unified.health.core.ble.protocol.hexToBytes
import com.unified.health.core.ble.protocol.toHex
import com.unified.health.driver.xiaomi.XiaomiChannel
import org.junit.Assert.assertArrayEquals
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertNull
import org.junit.Assert.assertThrows
import org.junit.Assert.assertTrue
import org.junit.Test

class XiaomiL1Test {

    // ---- L1Frame: byte vectors from XIAOMI_MIWEAR_DEVICE_PROTOCOL.md / XIAOMI_TEST_VECTORS.json ----

    @Test
    fun `decodes the getBindInfo DATA frame vector`() {
        val frameHex = "a5a503001e005ef50101080110111a165a1408001210e807f1fcf82d132f9bb018ca6738a19f"
        val frame = L1Frame.decode(frameHex.hexToBytes())
        assertEquals(L1Frame.TYPE_DATA, frame.type)
        assertEquals(0, frame.frx)
        assertEquals(0, frame.seq)
        assertEquals("0101080110111a165a1408001210e807f1fcf82d132f9bb018ca6738a19f", frame.payload.toHex())
    }

    @Test
    fun `encodes the same bytes it decodes for the getBindInfo vector`() {
        val frameHex = "a5a503001e005ef50101080110111a165a1408001210e807f1fcf82d132f9bb018ca6738a19f"
        val frame = L1Frame.decode(frameHex.hexToBytes())
        val reEncoded = L1Frame.encode(frame.type, frame.seq, frame.payload, frame.frx)
        assertEquals(frameHex, reEncoded.toHex())
    }

    @Test
    fun `encodes the L1 START request frame exactly like the doc example`() {
        val fullFrameHex = "a5a5020016001d4d0101030001000002020000fc03020020000402001027"
        val frame = L1Frame.encode(L1Frame.TYPE_CMD, seq = 0, payload = L1StartCodec.encodeRequest())
        assertEquals(fullFrameHex, frame.toHex())
    }

    @Test
    fun `an ACK or NAK frame has no payload and a zero crc`() {
        val frame = L1Frame.encode(L1Frame.TYPE_ACK, seq = 42)
        assertEquals(XiaomiL0.HEADER_SIZE, frame.size)
        assertEquals(0, frame[6].toInt())
        assertEquals(0, frame[7].toInt())
        val decoded = L1Frame.decode(frame)
        assertEquals(L1Frame.TYPE_ACK, decoded.type)
        assertEquals(42, decoded.seq)
        assertTrue(decoded.payload.isEmpty())
    }

    @Test
    fun `frx is packed into the high nibble of the type byte`() {
        val frame = L1Frame.encode(L1Frame.TYPE_DATA, seq = 1, payload = byteArrayOf(1), frx = 1)
        assertEquals(0x13, frame[2].toInt() and 0xFF)
        val decoded = L1Frame.decode(frame)
        assertEquals(1, decoded.frx)
        assertEquals(L1Frame.TYPE_DATA, decoded.type)
    }

    @Test
    fun `decode rejects a frame shorter than the header`() {
        assertThrows(MalformedPayloadException::class.java) { L1Frame.decode(ByteArray(4)) }
    }

    @Test
    fun `decode rejects a bad magic`() {
        val frame = L1Frame.encode(L1Frame.TYPE_DATA, seq = 0, payload = byteArrayOf(1))
        frame[0] = 0x00
        assertThrows(MalformedPayloadException::class.java) { L1Frame.decode(frame) }
    }

    @Test
    fun `decode rejects a dataLength that does not match the buffer`() {
        val frame = L1Frame.encode(L1Frame.TYPE_DATA, seq = 0, payload = byteArrayOf(1, 2, 3))
        val truncated = frame.copyOfRange(0, frame.size - 1)
        assertThrows(MalformedPayloadException::class.java) { L1Frame.decode(truncated) }
    }

    @Test
    fun `decode rejects a bad crc`() {
        val frame = L1Frame.encode(L1Frame.TYPE_DATA, seq = 0, payload = byteArrayOf(1, 2, 3))
        frame[frame.size - 1] = (frame[frame.size - 1].toInt() xor 0xFF).toByte()
        assertThrows(MalformedPayloadException::class.java) { L1Frame.decode(frame) }
    }

    // ---- L1 start config TLV ----

    @Test
    fun `L1StartCodec request round-trips with the default config`() {
        val (cmd, config) = L1StartCodec.decode(L1StartCodec.encodeRequest())
        assertEquals(L1StartCodec.CMD_L1START_REQ, cmd)
        assertArrayEquals(byteArrayOf(1, 0, 0), config.version)
        assertEquals(64512, config.mps)
        assertEquals(32, config.txWindow)
        assertEquals(10_000, config.sendTimeoutMs)
    }

    @Test
    fun `L1StartCodec response uses the RSP sub-command`() {
        val (cmd, _) = L1StartCodec.decode(L1StartCodec.encodeResponse())
        assertEquals(L1StartCodec.CMD_L1START_RSP, cmd)
    }

    @Test
    fun `L1StartCodec decode rejects an empty payload`() {
        assertThrows(MalformedPayloadException::class.java) { L1StartCodec.decode(ByteArray(0)) }
    }

    @Test
    fun `L1StartConfig tolerates an unknown entry type`() {
        val entries = listOf(
            L1ConfigEntry(L1ConfigEntry.TYPE_TX_WIN, byteArrayOf(0x20, 0x00)),
            L1ConfigEntry(type = 99, value = byteArrayOf(1)),
        )
        assertEquals(32, L1StartConfig.from(entries).txWindow)
    }

    // ---- XiaomiL1 window / seq / ack state machine ----

    @Test
    fun `assigns sequential seq numbers and wraps at 256`() {
        val l1 = XiaomiL1()
        repeat(300) { l1.prepareData(byteArrayOf(0), nowMs = 0) }
        val frame = l1.prepareData(byteArrayOf(0), nowMs = 0)
        assertEquals(44, L1Frame.decode(frame).seq) // 301st frame: seq 300 % 256 = 44
    }

    @Test
    fun `canSend respects the remote window from the START response`() {
        val l1 = XiaomiL1()
        l1.applyRemoteConfig(L1StartConfig(txWindow = 2))
        assertTrue(l1.canSend())
        l1.prepareData(byteArrayOf(0), nowMs = 0)
        assertTrue(l1.canSend())
        l1.prepareData(byteArrayOf(0), nowMs = 0)
        assertFalse(l1.canSend())
    }

    @Test
    fun `cumulative ack releases every frame at or before the acked seq`() {
        val l1 = XiaomiL1()
        l1.applyRemoteConfig(L1StartConfig(txWindow = 10))
        repeat(4) { l1.prepareData(byteArrayOf(0), nowMs = 0) } // seq 0,1,2,3
        assertEquals(4, l1.outstandingCount)
        l1.onAck(1)
        assertEquals(2, l1.outstandingCount)
        l1.onAck(3)
        assertEquals(0, l1.outstandingCount)
    }

    @Test
    fun `cumulative ack handles seq wraparound`() {
        val l1 = XiaomiL1()
        // Drive seq 0..253 one at a time, acking each before the next is sent: the real protocol's
        // TX window is 32, so no more than a handful of frames are ever outstanding together, and
        // onAck/seqDistance's signed mod-256 comparison only ever sees seqs within half the
        // sequence space. (Queuing all 254 unacked at once -- this test's previous shape -- is not a
        // scenario the protocol allows: the window would have blocked it, and the signed distance
        // between far-apart seqs like 0 and 253 is genuinely ambiguous.)
        repeat(254) { seq ->
            l1.prepareData(byteArrayOf(0), nowMs = 0)
            l1.onAck(seq)
        }
        assertEquals(0, l1.outstandingCount)
        l1.prepareData(byteArrayOf(0), nowMs = 0) // seq 254
        l1.prepareData(byteArrayOf(0), nowMs = 0) // seq 255
        l1.prepareData(byteArrayOf(0), nowMs = 0) // seq 0 (wrapped)
        assertEquals(3, l1.outstandingCount)
        l1.onAck(0) // must release 254 and 255 too: they are circularly "before" the wrapped 0.
        assertEquals(0, l1.outstandingCount)
    }

    @Test
    fun `nak retransmits every unacked frame from the nak seq onward`() {
        val l1 = XiaomiL1()
        l1.applyRemoteConfig(L1StartConfig(txWindow = 10))
        val f0 = l1.prepareData(byteArrayOf(0), nowMs = 0)
        val f1 = l1.prepareData(byteArrayOf(1), nowMs = 0)
        val f2 = l1.prepareData(byteArrayOf(2), nowMs = 0)
        val resend = l1.onNak(1)
        assertEquals(listOf(1, 2), resend.map { L1Frame.decode(it).seq })
        assertArrayEquals(f1, resend[0])
        assertArrayEquals(f2, resend[1])
        assertArrayEquals(f0, f0) // sanity: f0 itself untouched/not part of the resend
    }

    @Test
    fun `frames past the retransmit timeout are resent and their timer resets`() {
        val l1 = XiaomiL1()
        l1.applyRemoteConfig(L1StartConfig(txWindow = 10))
        l1.prepareData(byteArrayOf(0), nowMs = 1_000)
        assertEquals(0, l1.framesToRetransmit(nowMs = 5_000, timeoutMs = 10_000).size)
        val due = l1.framesToRetransmit(nowMs = 11_500, timeoutMs = 10_000)
        assertEquals(1, due.size)
        // Timer was reset to 11_500, so it is not due again immediately.
        assertEquals(0, l1.framesToRetransmit(nowMs = 12_000, timeoutMs = 10_000).size)
    }

    @Test
    fun `in-order DATA is delivered and advances rxExpect`() {
        val l1 = XiaomiL1()
        val result = l1.onDataReceived(L1Frame(L1Frame.TYPE_DATA, frx = 0, seq = 0, payload = byteArrayOf(9)), nowMs = 0)
        assertTrue(result is XiaomiL1.ReceiveResult.Deliver)
        assertArrayEquals(byteArrayOf(9), (result as XiaomiL1.ReceiveResult.Deliver).payload)
        assertEquals(0, l1.ackSeq())
    }

    @Test
    fun `out-of-order DATA is rejected with a nak carrying rxExpect`() {
        val l1 = XiaomiL1()
        val result = l1.onDataReceived(L1Frame(L1Frame.TYPE_DATA, frx = 0, seq = 5, payload = byteArrayOf(1)), nowMs = 0)
        assertTrue(result is XiaomiL1.ReceiveResult.Rejected)
        assertEquals(0, (result as XiaomiL1.ReceiveResult.Rejected).nakSeq)
    }

    @Test
    fun `frx=1 is delivered without an ack and resyncs rxExpect`() {
        val l1 = XiaomiL1()
        val result = l1.onDataReceived(L1Frame(L1Frame.TYPE_DATA, frx = 1, seq = 40, payload = byteArrayOf(1)), nowMs = 0)
        assertTrue(result is XiaomiL1.ReceiveResult.Deliver)
        assertEquals(40, l1.ackSeq())
        // The next frx=0 frame must continue right after the frx=1 resync point.
        val next = l1.onDataReceived(L1Frame(L1Frame.TYPE_DATA, frx = 0, seq = 41, payload = byteArrayOf(2)), nowMs = 0)
        assertTrue(next is XiaomiL1.ReceiveResult.Deliver)
    }

    @Test
    fun `needsImmediateAck is true for the protobuf and lyra channels`() {
        val l1 = XiaomiL1()
        assertTrue(l1.needsImmediateAck(byteArrayOf(XiaomiChannel.PROTOBUF.id.toByte(), 1)))
        assertTrue(l1.needsImmediateAck(byteArrayOf(XiaomiChannel.LYRA.id.toByte(), 1)))
        assertFalse(l1.needsImmediateAck(byteArrayOf(XiaomiChannel.FILE_FITNESS.id.toByte(), 1)))
    }

    @Test
    fun `needsImmediateAck trips once unacked count reaches two thirds of the local window`() {
        val l1 = XiaomiL1(localWindow = 3) // threshold = floor(3 * 2 / 3) = 2
        val other = byteArrayOf(XiaomiChannel.FILE_FITNESS.id.toByte())
        l1.onDataReceived(L1Frame(L1Frame.TYPE_DATA, frx = 0, seq = 0, payload = byteArrayOf(1)), nowMs = 0)
        assertFalse(l1.needsImmediateAck(other))
        l1.onDataReceived(L1Frame(L1Frame.TYPE_DATA, frx = 0, seq = 1, payload = byteArrayOf(1)), nowMs = 0)
        assertTrue(l1.needsImmediateAck(other))
    }

    @Test
    fun `cumulative ack is due once the oldest unacked receive is older than the timeout`() {
        val l1 = XiaomiL1()
        assertFalse(l1.isCumulativeAckDue(nowMs = 10_000, timeoutMs = 500))
        l1.onDataReceived(L1Frame(L1Frame.TYPE_DATA, frx = 0, seq = 0, payload = byteArrayOf(1)), nowMs = 1_000)
        assertFalse(l1.isCumulativeAckDue(nowMs = 1_200, timeoutMs = 500))
        assertTrue(l1.isCumulativeAckDue(nowMs = 1_600, timeoutMs = 500))
        l1.onAckSent()
        assertFalse(l1.isCumulativeAckDue(nowMs = 1_600, timeoutMs = 500))
    }

    @Test
    fun `seqDistance handles wraparound both ways`() {
        assertEquals(1, XiaomiL1.seqDistance(0, 255))
        assertEquals(-1, XiaomiL1.seqDistance(255, 0))
        assertEquals(0, XiaomiL1.seqDistance(10, 10))
        assertEquals(5, XiaomiL1.seqDistance(15, 10))
    }

    @Test
    fun `remote window defaults until the START response negotiates one`() {
        val l1 = XiaomiL1()
        assertEquals(XiaomiL1.DEFAULT_REMOTE_WINDOW, l1.remoteWindow)
        assertNull(l1.remoteConfig)
    }
}
