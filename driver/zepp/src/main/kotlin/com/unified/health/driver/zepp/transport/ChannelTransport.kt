package com.unified.health.driver.zepp.transport

import android.util.Log
import com.unified.health.core.ble.driver.WearableProtocolException
import com.unified.health.core.ble.gatt.GattCharacteristic
import com.unified.health.core.ble.gatt.GattClient
import com.unified.health.core.ble.gatt.GattException
import com.unified.health.core.ble.gatt.WriteType
import com.unified.health.core.ble.protocol.MalformedPayloadException
import com.unified.health.driver.zepp.codec.BuiltInModuleCodec
import com.unified.health.driver.zepp.codec.ChannelAck
import com.unified.health.driver.zepp.codec.ChannelCipher
import com.unified.health.driver.zepp.codec.ChannelCodec
import com.unified.health.driver.zepp.codec.ChannelCryptoException
import com.unified.health.driver.zepp.codec.ChannelDataPacket
import com.unified.health.driver.zepp.codec.ChannelMessage
import com.unified.health.driver.zepp.codec.ChannelPacketType
import com.unified.health.driver.zepp.codec.ChannelProtocol
import com.unified.health.driver.zepp.codec.ChannelReassembler
import com.unified.health.driver.zepp.codec.ChannelReplyCode
import com.unified.health.driver.zepp.codec.ChannelVersionInfo
import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.TimeoutCancellationException
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.launch
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import kotlinx.coroutines.withTimeout
import kotlinx.coroutines.withTimeoutOrNull
import java.util.concurrent.ConcurrentHashMap

/**
 * The Huami "channel" (§3.3): chunked module messages over 0x0016 (phone → watch, plus the watch's
 * ACKs and version reply) and 0x0017 (watch → phone, plus our ACKs).
 *
 * One outbound message is in flight at a time. Inbound packets are read by a loop in [scope]
 * (owned by the session), ACKed when asked, reassembled, decrypted when flagged and delivered to
 * the inbox of the module they address. Packets for unregistered modules are refused with code 5,
 * as the vendor app does.
 */
internal class ChannelTransport(
    private val gatt: GattClient,
    private val down: GattCharacteristic,
    private val up: GattCharacteristic,
    private val scope: CoroutineScope,
) {
    private lateinit var downFrames: ReceiveChannel<ByteArray>
    private val inboxes = ConcurrentHashMap<Int, Channel<ByteArray>>()

    /**
     * Passive listeners that receive a copy of every complete message for a module without stealing
     * it from [request]'s inbox (used for unsolicited module notifications, e.g. battery 0x29).
     */
    private val taps = ConcurrentHashMap<Int, Channel<ByteArray>>()
    private val sendLock = Mutex()
    private val reassembler = ChannelReassembler()
    private var nextSessionId = 0

    @Volatile private var protocol: ChannelProtocol? = null

    /** Set after a successful Zepp OS auth; required to read and send ENCRYPTED messages. */
    @Volatile var cipher: ChannelCipher? = null

    @Volatile private var version: ChannelVersionInfo? = null

    /** Module id → requireEncryption, from [loadModuleList]; empty until then. */
    @Volatile var modules: Map<Int, Boolean> = emptyMap()
        private set

    /**
     * ATT MTU reported by the watch's ConnectModule (0x15) after auth, or null when the module is
     * absent or did not answer. The vendor replaces its default 20-byte chunk with this value
     * (`MiLiProProfile.C0` → `Mtu.setAttMtuSize`, `ConnectionParamCodec.java:56-59`).
     */
    @Volatile private var reportedAttMtu: Int? = null

    /**
     * Subscribes to both characteristics, starts the inbound reader and runs the version query
     * `[0x01]` → `[0x02, version, encrypt?]` (§3.3 [V]).
     * @return null when the watch did not answer within [VERSION_TIMEOUT_MS].
     */
    suspend fun open(): ChannelVersionInfo? {
        downFrames = gatt.subscribe(down)
        val upFrames = gatt.subscribe(up)
        scope.launch { readUpLink(upFrames) }
        drainDownFrames()
        writeDown(ChannelCodec.VERSION_QUERY)
        return withTimeoutOrNull(VERSION_TIMEOUT_MS) {
            var reply: ChannelVersionInfo? = null
            while (reply == null) reply = ChannelCodec.parseVersionReply(downFrames.receive())
            reply
        }.also { version = it }
    }

    /**
     * Reads the BuiltInModule list (§3.4 [V], `BuiltInModule.java:365-430`). The vendor treats a
     * missing or malformed list as "no modules", so does this; it never fails the connection.
     */
    suspend fun loadModuleList(timeoutMs: Long = MODULE_LIST_TIMEOUT_MS): Map<Int, Boolean> {
        val withEncryption = version?.encryptEnabled != null
        val reply = try {
            request(BuiltInModuleCodec.MODULE, BuiltInModuleCodec.request(withEncryption), timeoutMs) {
                it.isNotEmpty() && (it[0].toInt() and 0xFF) == BuiltInModuleCodec.replyCommand(withEncryption)
            }
        } catch (e: WearableProtocolException) {
            Log.w(TAG, "No module list: ${e.message}")
            return emptyMap()
        }
        modules = try {
            BuiltInModuleCodec.parse(reply, withEncryption)
        } catch (e: MalformedPayloadException) {
            Log.w(TAG, "Malformed module list: ${e.message}")
            emptyMap()
        }
        return modules
    }

    fun supportsModule(module: Int): Boolean = module in modules

    /** Selects the header layout once the version is known. */
    fun use(protocol: ChannelProtocol) {
        this.protocol = protocol
    }

    /**
     * Applies the ATT MTU reported by the watch's ConnectModule (0x15). The vendor does not call
     * `requestMtu`; it asks the watch and stores `ATT MTU - 3` as the channel payload size
     * (`Mtu.setAttMtuSize`, `Mtu.java:26-33`; `MiLiProProfile.java:2053-2056`).
     */
    fun useAttMtu(attMtu: Int) {
        reportedAttMtu = attMtu.coerceIn(GattClient.DEFAULT_MTU, MAX_ATT_MTU)
    }

    /**
     * Largest channel frame (header + payload) sent in one BLE write: `ATT MTU - 3`, exactly the
     * value `Mtu.setAttMtuSize` stores. The watch-reported value wins over the GATT-negotiated one;
     * the GATT value still caps it (Android rejects a write above the real ATT payload) and the
     * vendor never uses more than 247 ([V] `Mtu.ATT_MTU_MAX`).
     */
    internal fun writeSize(): Int =
        minOf(reportedAttMtu?.minus(GattClient.ATT_HEADER_SIZE) ?: gatt.maxWriteLength, gatt.maxWriteLength, MAX_WRITE_SIZE)

    /** Creates (or returns) the inbox for [module]; messages for unregistered modules are refused. */
    fun register(module: Int): ReceiveChannel<ByteArray> = inboxes.getOrPut(module) { Channel(Channel.UNLIMITED) }

    /**
     * Returns a passive copy channel for [module]. It sees every complete message delivered to the
     * module (request answers included) without consuming [register]'s inbox.
     */
    fun tap(module: Int): ReceiveChannel<ByteArray> = taps.getOrPut(module) { Channel(Channel.UNLIMITED) }

    /**
     * Sends [payload] to [module] and returns the first inbound message for that module accepted by
     * [accept]. The inbox is registered and drained before writing, so the answer cannot be missed.
     */
    suspend fun request(module: Int, payload: ByteArray, timeoutMs: Long, accept: (ByteArray) -> Boolean): ByteArray =
        sendLock.withLock {
            val inbox = register(module)
            inbox.discardBuffered()
            sendLocked(module, payload)
            try {
                withTimeout(timeoutMs) {
                    var answer = inbox.receive()
                    while (!accept(answer)) answer = inbox.receive()
                    answer
                }
            } catch (e: TimeoutCancellationException) {
                throw WearableProtocolException("Watch did not answer module 0x%04x within %d ms".format(module, timeoutMs), e)
            }
        }

    private suspend fun sendLocked(module: Int, payload: ByteArray) {
        val protocol = requireProtocol()
        val sessionId = nextSessionId
        nextSessionId = (nextSessionId + 1) % 256
        val packets = if (requiresEncryption(module)) {
            val cipher = cipher ?: throw WearableProtocolException("Module 0x%04x requires encryption before auth".format(module))
            ChannelCodec.split(
                protocol, sessionId, module, cipher.encrypt(sessionId, payload),
                packetSize = writeSize(), totalSize = payload.size, encrypted = true,
            )
        } else {
            ChannelCodec.split(protocol, sessionId, module, payload, packetSize = writeSize())
        }
        for (packet in packets) {
            sendPacket(protocol, sessionId, packet)
        }
    }

    /**
     * Sends one packet and, when it carries NEED_REPLY (every [ChannelCodec.DEFAULT_REPLY_FREQUENCY]
     * packets and the last one), waits for its DATA_REPLY. A missing reply is retried a bounded
     * number of times; an explicit refusal is a protocol error and is not retried. The vendor's v2
     * retry body did not decompile (§9 question 3), so [ACK_ATTEMPTS] is a conservative policy [I].
     */
    private suspend fun sendPacket(protocol: ChannelProtocol, sessionId: Int, packet: ChannelDataPacket) {
        // The retry rule is a v2 question only (the vendor's BleChannelImpl2.sendData body is a
        // decompilation gap); v1 keeps the previous single-attempt behaviour.
        val attempts = if (protocol == ChannelProtocol.V2 && packet.needsReply) ACK_ATTEMPTS else 1
        var lastTimeout: WearableProtocolException? = null
        repeat(attempts) { attempt ->
            drainDownFrames()
            writeDown(ChannelCodec.encodeData(protocol, packet))
            if (!packet.needsReply) return
            val ack = awaitAck(protocol, sessionId, packet.index)
            if (ack != null) {
                if (ack.code != ChannelReplyCode.OK) {
                    throw WearableProtocolException("Watch refused channel packet ${packet.index} of session $sessionId (code ${ack.code})")
                }
                return
            }
            lastTimeout = WearableProtocolException(
                "Watch did not acknowledge channel packet ${packet.index} of session $sessionId",
            )
            if (attempt < attempts - 1) {
                Log.w(TAG, "No ACK for packet ${packet.index} of session $sessionId; resending (${attempt + 1}/$attempts)")
            }
        }
        throw checkNotNull(lastTimeout)
    }

    /**
     * Waits for the watch's DATA_REPLY on 0x0016. The vendor's v2 sender waits up to 15 s for a
     * reply (`BleChannelImpl2`, constant `l = 15000`; the method body did not decompile, §9
     * question 3), so the exact rule is [I].
     * @return null on timeout.
     */
    private suspend fun awaitAck(protocol: ChannelProtocol, sessionId: Int, index: Int): ChannelAck? =
        withTimeoutOrNull(ACK_TIMEOUT_MS) {
            var match: ChannelAck? = null
            while (match == null) {
                val candidate = ChannelCodec.decodeAck(protocol, downFrames.receive()) ?: continue
                if (candidate.sessionId == sessionId && candidate.index == index) match = candidate
            }
            match
        }

    private suspend fun readUpLink(frames: ReceiveChannel<ByteArray>) {
        for (frame in frames) {
            try {
                handleUpFrame(frame)
            } catch (e: CancellationException) {
                throw e
            } catch (e: MalformedPayloadException) {
                Log.w(TAG, "Dropping malformed channel frame: ${e.message}")
            } catch (e: GattException) {
                Log.w(TAG, "Could not answer channel frame: ${e.message}")
            }
        }
    }

    private suspend fun handleUpFrame(frame: ByteArray) {
        if (frame.isEmpty()) return
        when (frame[0].toInt() and 0xFF) {
            ChannelPacketType.VERSION_QUERY -> writeUp(ChannelCodec.APP_VERSION_REPLY)
            ChannelPacketType.DATA -> handleDataPacket(frame)
            else -> Log.d(TAG, "Ignoring channel frame type ${frame[0]}")
        }
    }

    private suspend fun handleDataPacket(frame: ByteArray) {
        val protocol = protocol ?: return
        val packet = ChannelCodec.decodeData(protocol, frame)
        if (protocol.hasAppId && packet.appId != ChannelCodec.APP_ID) return
        val module = packet.module
        if (packet.isFirst && module != null && !inboxes.containsKey(module) && !taps.containsKey(module)) {
            reassembler.reset()
            ack(protocol, packet.sessionId, ChannelReplyCode.UNKNOWN_MODULE, packet.index)
            return
        }
        when (val result = reassembler.append(packet)) {
            is ChannelReassembler.Result.Rejected -> ack(protocol, packet.sessionId, result.code, packet.index)
            ChannelReassembler.Result.Pending -> if (packet.needsReply) ack(protocol, packet.sessionId, ChannelReplyCode.OK, packet.index)
            is ChannelReassembler.Result.Complete -> {
                if (packet.needsReply) ack(protocol, packet.sessionId, ChannelReplyCode.OK, packet.index)
                deliver(result.message)
            }
        }
    }

    private fun deliver(message: ChannelMessage) {
        val data = if (message.isEncrypted) decryptOrNull(message) ?: return else message.data
        inboxes[message.module]?.trySend(data)
        taps[message.module]?.trySend(data)
    }

    private fun decryptOrNull(message: ChannelMessage): ByteArray? {
        val cipher = cipher
        if (cipher == null) {
            Log.w(TAG, "Encrypted message for module ${message.module} before auth; dropped")
            return null
        }
        return try {
            cipher.decrypt(message.sessionId, message.totalSize, message.data)
        } catch (e: ChannelCryptoException) {
            Log.w(TAG, "Dropping message for module ${message.module}: ${e.message}")
            null
        }
    }

    private suspend fun ack(protocol: ChannelProtocol, sessionId: Int, code: Int, index: Int) =
        writeUp(ChannelCodec.encodeAck(protocol, ChannelAck(sessionId, code, index)))

    private fun drainDownFrames() = downFrames.discardBuffered()

    private suspend fun writeDown(value: ByteArray) = gatt.write(down, value, preferredWriteType(down))

    private suspend fun writeUp(value: ByteArray) = gatt.write(up, value, preferredWriteType(up))

    /** `ChannelApiImpl2.k` (`:126-141`) [V]: encrypt-enabled channel and the module list says so. */
    private fun requiresEncryption(module: Int): Boolean = version?.encryptEnabled == true && modules[module] == true

    private fun requireProtocol(): ChannelProtocol =
        protocol ?: throw WearableProtocolException("Channel version is unknown; call open() first")

    /** The vendor writes channel frames without response (`ChannelTransferMethod`, §3.1 [V]). */
    private fun preferredWriteType(c: GattCharacteristic): WriteType =
        if (c.canWriteWithoutResponse) WriteType.WITHOUT_RESPONSE else WriteType.DEFAULT

    companion object {
        private const val TAG = "ZeppChannel"

        /** No vendor constant found for the version query; generous for a single round trip. */
        const val VERSION_TIMEOUT_MS = 5_000L

        /** `BleChannelImpl2` reply wait (15 000 ms) [V]. */
        const val ACK_TIMEOUT_MS = 15_000L

        /** Initial send plus two retries when a NEED_REPLY packet's ACK is lost [I]. */
        const val ACK_ATTEMPTS = 3

        /** No vendor constant read for the module-list answer; one round trip [I]. */
        const val MODULE_LIST_TIMEOUT_MS = 5_000L

        /** `Mtu.ATT_MTU_MAX` (`Mtu.java:8`): the vendor never chunks above 247 B ATT MTU. */
        const val MAX_ATT_MTU = 247

        /** `Mtu.ATT_MTU_MAX - ATT_HEADER_SIZE`, i.e. `Mtu.b` = 244 (`Mtu.java:9,26-33`). */
        const val MAX_WRITE_SIZE = 244
    }
}
