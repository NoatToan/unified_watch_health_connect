package com.unified.health.driver.garmin.transport

import android.util.Log
import com.unified.health.core.ble.driver.WearableProtocolException
import com.unified.health.core.ble.gatt.GattException
import com.unified.health.core.ble.protocol.MalformedPayloadException
import com.unified.health.driver.garmin.codec.Cobs
import com.unified.health.driver.garmin.codec.CobsFrameAccumulator
import com.unified.health.driver.garmin.codec.GfdiAck
import com.unified.health.driver.garmin.codec.GfdiMessage
import com.unified.health.driver.garmin.codec.GfdiMessageId
import com.unified.health.driver.garmin.codec.GfdiStatus
import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.CompletableDeferred
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import kotlinx.coroutines.withTimeoutOrNull
import java.util.concurrent.ConcurrentHashMap

/** How the dispatcher answers one message the watch sent. */
internal class InboundReply(
    val status: Int = GfdiStatus.ACK,
    val data: ByteArray = ByteArray(0),
    /** Runs after the ACK was written, in the session scope (it may itself send requests). */
    val afterAck: (suspend () -> Unit)? = null,
)

internal interface GfdiInboundHandler {
    /** Decides the ACK for [message]. Runs on the read loop: must not wait for other inbound messages. */
    suspend fun onMessage(message: GfdiMessage): InboundReply

    /** The stream ended (link dropped or session closed). */
    fun onLinkClosed()
}

/**
 * Request/response engine over a [GfdiStream] (§3.4 [V], `us2` Dispatcher):
 * - decodes COBS frames into [GfdiMessage]s, dropping corrupt ones (logged; the watch retransmits);
 * - routes 5000 ACKs to the request waiting for that message id;
 * - answers every other message with an ACK built by [handler] — the watch retries and eventually
 *   disconnects if a message is left unanswered (§8.B.5);
 * - serialises outgoing frames so chunks of two frames never interleave.
 *
 * One request is in flight at a time; its waiter is registered before the request is written.
 */
internal class GfdiDispatcher(
    private val stream: GfdiStream,
    private val scope: CoroutineScope,
    private val handler: GfdiInboundHandler,
) {
    private val writeLock = Mutex()
    private val requestLock = Mutex()
    private val pending = ConcurrentHashMap<Int, CompletableDeferred<GfdiAck>>()
    private val accumulator = CobsFrameAccumulator()

    /** Largest message the watch accepts (from 5024); unknown until the handshake. */
    @Volatile
    var maxPacketSize: Int = Int.MAX_VALUE

    fun start(): Job = scope.launch {
        try {
            for (chunk in stream.incoming) {
                for (frame in accumulator.feed(chunk)) handleFrame(frame)
            }
        } finally {
            val closed = WearableProtocolException("Garmin link closed")
            pending.values.forEach { it.completeExceptionally(closed) }
            handler.onLinkClosed()
        }
    }

    /**
     * Sends [messageId] and waits for the watch's ACK for it.
     * @throws WearableProtocolException when no ACK arrives within [timeoutMs] or the link closes.
     */
    suspend fun request(messageId: Int, payload: ByteArray, timeoutMs: Long): GfdiAck = requestLock.withLock {
        val waiter = CompletableDeferred<GfdiAck>()
        pending[messageId] = waiter
        try {
            send(GfdiMessage(messageId, payload))
            withTimeoutOrNull(timeoutMs) { waiter.await() }
                ?: throw WearableProtocolException("Watch did not acknowledge message $messageId within ${timeoutMs}ms")
        } finally {
            pending.remove(messageId, waiter)
        }
    }

    private suspend fun send(message: GfdiMessage) {
        val encoded = message.encode()
        if (encoded.size > maxPacketSize) {
            throw WearableProtocolException("Message ${message.id} (${encoded.size} bytes) exceeds the watch limit of $maxPacketSize")
        }
        writeLock.withLock { stream.write(Cobs.frame(encoded)) }
    }

    private suspend fun handleFrame(frame: ByteArray) {
        val message = try {
            GfdiMessage.decode(Cobs.decode(frame))
        } catch (e: WearableProtocolException) {
            Log.w(TAG, "Dropping corrupt GFDI frame (${frame.size} bytes): ${e.message}")
            return
        }
        if (message.id == GfdiMessageId.ACK) {
            onAck(message)
        } else {
            answer(message)
        }
    }

    private fun onAck(message: GfdiMessage) {
        val ack = try {
            GfdiAck.decode(message.payload)
        } catch (e: MalformedPayloadException) {
            Log.w(TAG, "Malformed ACK: ${e.message}")
            return
        }
        val waiter = pending[ack.originalId]
        if (waiter == null) Log.d(TAG, "Unsolicited $ack") else waiter.complete(ack)
    }

    private suspend fun answer(message: GfdiMessage) {
        val reply = try {
            handler.onMessage(message)
        } catch (e: MalformedPayloadException) {
            Log.w(TAG, "Malformed message ${message.id}: ${e.message}")
            InboundReply(GfdiStatus.LENGTH_ERROR)
        }
        val ack = GfdiAck(message.id, reply.status, reply.data)
        try {
            send(GfdiMessage(GfdiMessageId.ACK, ack.encode(), message.transactionId))
        } catch (e: GattException) {
            Log.w(TAG, "Could not acknowledge message ${message.id}: ${e.message}")
            return
        } catch (e: WearableProtocolException) {
            Log.w(TAG, "Could not acknowledge message ${message.id}: ${e.message}")
            return
        }
        reply.afterAck?.let { action ->
            scope.launch {
                try {
                    action()
                } catch (e: CancellationException) {
                    throw e
                } catch (e: WearableProtocolException) {
                    Log.w(TAG, "Follow-up to message ${message.id} failed: ${e.message}")
                } catch (e: GattException) {
                    Log.w(TAG, "Follow-up to message ${message.id} failed: ${e.message}")
                }
            }
        }
    }

    private companion object {
        const val TAG = "GarminGfdi"
    }
}
