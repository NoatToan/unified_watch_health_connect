package com.unified.health.driver.xiaomi

import com.unified.health.core.ble.gatt.GattCharacteristic.Companion.PROPERTY_NOTIFY
import com.unified.health.core.ble.gatt.GattCharacteristic.Companion.PROPERTY_READ
import com.unified.health.core.ble.gatt.GattCharacteristic.Companion.PROPERTY_WRITE
import com.unified.health.core.ble.gatt.GattCharacteristic.Companion.PROPERTY_WRITE_NO_RESPONSE
import com.unified.health.core.testing.FakeGattClient
import com.unified.health.core.testing.characteristic
import com.unified.health.driver.xiaomi.proto.S7r
import com.unified.health.driver.xiaomi.transport.L1Frame
import com.unified.health.driver.xiaomi.transport.L1StartCodec
import com.unified.health.driver.xiaomi.transport.L2Frame
import com.unified.health.driver.xiaomi.transport.XiaomiL0

/**
 * Scripted MiWear V2 watch for JVM tests: always answers the L1 session-start exchange (unless
 * [answersL1Start] is false) and ACKs every DATA frame, answering specific `s7r (e, f)` requests
 * with canned responses registered via [onRequest]. Byte layouts follow
 * `XIAOMI_MIWEAR_DEVICE_PROTOCOL.md`.
 */
internal class FakeMiWearWatch(
    mtu: Int = 247,
    private val versionBytes: ByteArray = byteArrayOf(1, 0, 0), // 1.0.0 -> V2
    hasVersion: Boolean = true,
    hasWrite: Boolean = true,
    hasNotify: Boolean = true,
    private val answersL1Start: Boolean = true,
) {
    val version = characteristic(XiaomiUuids.SERVICE, XiaomiUuids.VERSION, PROPERTY_READ)
    val write = characteristic(XiaomiUuids.SERVICE, XiaomiUuids.V2_WRITE, PROPERTY_WRITE, PROPERTY_WRITE_NO_RESPONSE)
    val notify = characteristic(XiaomiUuids.SERVICE, XiaomiUuids.V2_NOTIFY, PROPERTY_NOTIFY)

    val gatt = FakeGattClient(
        buildList {
            if (hasVersion) add(version)
            if (hasWrite) add(write)
            if (hasNotify) add(notify)
        },
        mtu = mtu,
    )

    /** Every `s7r` request the watch received on channel 1, in order. */
    val received: MutableList<S7r> = mutableListOf()

    /** When true, the *first* DATA frame received answers with a NAK instead of an ACK+response. */
    var failFirstDataWithNak: Boolean = false

    private var dataFramesSeen = 0
    private var nextWatchSeq = 0
    private val scripted = mutableMapOf<Pair<Int, Int>, (S7r) -> ByteArray?>()
    private val reassembler = XiaomiL0.Reassembler()

    init {
        if (hasVersion) gatt.readValues[XiaomiUuids.VERSION] = versionBytes
        gatt.onWrite = { _, value -> onWrite(value) }
    }

    /**
     * Registers a response builder for one `(e, f)`; `null` means "never answer" (timeout). The
     * builder receives the decoded request `s7r` -- needed by crypto-dependent exchanges (the M2
     * nonce/ECDH handshakes carry the real appRandom/appPub, which the response must sign/derive
     * against), unused by the simple fixed-payload commands most other tests script.
     */
    fun onRequest(e: Int, f: Int, response: (S7r) -> ByteArray?) {
        scripted[e to f] = response
    }

    private fun onWrite(chunk: ByteArray) {
        reassembler.feed(chunk).forEach(::handleL1Frame)
    }

    private fun handleL1Frame(raw: ByteArray) {
        val frame = L1Frame.decode(raw)
        when (frame.type) {
            L1Frame.TYPE_CMD -> handleCmd(frame.payload)
            L1Frame.TYPE_DATA -> handleData(frame)
            else -> Unit // ACK/NAK addressed to this side's own sent frames; nothing to do for the test.
        }
    }

    private fun handleCmd(payload: ByteArray) {
        if (!answersL1Start) return
        val (cmd, _) = L1StartCodec.decode(payload)
        if (cmd == L1StartCodec.CMD_L1START_REQ) {
            notifyFrame(L1Frame.encode(L1Frame.TYPE_CMD, seq = 0, payload = L1StartCodec.encodeResponse()))
        }
    }

    private fun handleData(frame: L1Frame) {
        dataFramesSeen++
        if (failFirstDataWithNak && dataFramesSeen == 1) {
            notifyFrame(L1Frame.encode(L1Frame.TYPE_NAK, seq = frame.seq))
            return
        }
        notifyFrame(L1Frame.encode(L1Frame.TYPE_ACK, seq = frame.seq))
        val l2 = L2Frame.decode(frame.payload)
        if (l2.channel != XiaomiChannel.PROTOBUF.id) return
        val s7r = S7r.decode(l2.payload)
        received += s7r
        val response = scripted[s7r.e to s7r.f]?.invoke(s7r) ?: return
        val responseL2 = L2Frame.encode(XiaomiChannel.PROTOBUF.id, l2.opCode, response)
        notifyFrame(L1Frame.encode(L1Frame.TYPE_DATA, seq = nextWatchSeq++, payload = responseL2))
    }

    private fun notifyFrame(frame: ByteArray) {
        XiaomiL0.chunk(frame, gatt.maxWriteLength).forEach { gatt.notify(notify, it) }
    }
}
