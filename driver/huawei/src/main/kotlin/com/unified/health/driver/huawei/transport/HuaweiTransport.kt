package com.unified.health.driver.huawei.transport

import android.util.Log
import com.unified.health.core.ble.driver.WearableProtocolException
import com.unified.health.core.ble.gatt.GattCharacteristic
import com.unified.health.core.ble.gatt.GattClient
import com.unified.health.core.ble.gatt.GattException
import com.unified.health.core.ble.protocol.MalformedPayloadException
import com.unified.health.driver.huawei.codec.FrameCodec
import com.unified.health.driver.huawei.codec.FrameReassembler
import com.unified.health.driver.huawei.codec.HuaweiCommand
import com.unified.health.driver.huawei.codec.LinkParameters
import com.unified.health.driver.huawei.codec.PayloadCipher
import kotlinx.coroutines.CompletableDeferred
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import kotlinx.coroutines.withTimeoutOrNull
import java.util.concurrent.atomic.AtomicReference

/** Request/response access to the watch, as handed to authenticators. */
internal interface HuaweiCommandChannel {
    /**
     * Sends [command] and waits for the watch's message with the same service and command id.
     * @param encrypted wrap the TLVs in the 0x7C/0x7D/0x7E envelope (only after authentication).
     * @throws WearableProtocolException on timeout after all resends, link loss or write failure.
     */
    suspend fun request(command: HuaweiCommand, encrypted: Boolean = false): HuaweiCommand
}

/**
 * @property responseMillis wait per attempt; the app's handshake ack timer period is 10 s
 *  ([V] `cnx.java:443`).
 * @property maxAttempts sends per request. The app's `CommandTimerTask` gives up when its resend
 *  counter reaches `MAX_RESEND_NUM = 3` ([V] `CommandTimerTask.java:36-41`,
 *  `HandshakeGeneralCommandBase.java:12`), i.e. one send plus two resends.
 */
internal data class TransportTimeouts(
    val responseMillis: Long = DEFAULT_RESPONSE_MILLIS,
    val maxAttempts: Int = DEFAULT_MAX_ATTEMPTS,
) {
    companion object {
        const val DEFAULT_RESPONSE_MILLIS = 10_000L
        const val DEFAULT_MAX_ATTEMPTS = 3
    }
}

/** Frame sizing in force on the link; starts with the app's pre-negotiation defaults. */
internal data class FrameSettings(
    val maxFrameSize: Int = LinkParameters.DEFAULT_FRAME_SIZE,
    val singleFrameSize: Int = LinkParameters.DEFAULT_FRAME_SIZE,
    val intervalMs: Int = LinkParameters.DEFAULT_INTERVAL_MS,
) {
    constructor(link: LinkParameters) : this(link.maxFrameSize, link.singleFrameSize, link.intervalMs)
}

/**
 * Moves [HuaweiCommand]s over FE01/FE02: encrypts (optionally), frames and chunks outgoing
 * payloads, reassembles and decrypts incoming ones, and matches responses to the single request
 * in flight (HUAWEI_DEVICE_PROTOCOL.md §4, §4.5). Background reading runs in [scope], which the
 * owning session cancels on close.
 */
internal class HuaweiTransport(
    private val gatt: GattClient,
    private val writeCharacteristic: GattCharacteristic,
    private val notifyCharacteristic: GattCharacteristic,
    private val scope: CoroutineScope,
    private val timeouts: TransportTimeouts = TransportTimeouts(),
) : HuaweiCommandChannel {

    private class Pending(val request: HuaweiCommand, val response: CompletableDeferred<HuaweiCommand> = CompletableDeferred())

    private val requestLock = Mutex()
    private val pending = AtomicReference<Pending?>(null)
    private val reassembler = FrameReassembler()

    @Volatile
    private var linkClosed = false

    @Volatile
    var frameSettings: FrameSettings = FrameSettings()

    /** Set once authentication produced a work key; incoming encrypted payloads need it too. */
    @Volatile
    var cipher: PayloadCipher? = null

    /** Enables FE02 notifications and starts the reader. */
    suspend fun start() {
        val notifications = gatt.subscribe(notifyCharacteristic)
        scope.launch {
            try {
                for (value in notifications) onNotification(value)
            } finally {
                linkClosed = true
                pending.getAndSet(null)?.response?.completeExceptionally(WearableProtocolException("Huawei link closed"))
            }
        }
    }

    override suspend fun request(command: HuaweiCommand, encrypted: Boolean): HuaweiCommand = requestLock.withLock {
        if (linkClosed) throw WearableProtocolException("Huawei link closed")
        val clear = command.encode()
        val payload = if (encrypted) {
            val activeCipher = cipher ?: throw WearableProtocolException("Huawei command ${command.tag} needs encryption before authentication")
            activeCipher.encrypt(clear)
        } else {
            clear
        }
        val frames = FrameCodec.encode(payload, frameSettings.maxFrameSize)
        val waiter = Pending(command)
        pending.set(waiter) // registered before the first write
        try {
            repeat(timeouts.maxAttempts) { attempt ->
                if (attempt > 0) Log.w(TAG, "No response to ${command.tag}, resend $attempt")
                writeFrames(frames)
                withTimeoutOrNull(timeouts.responseMillis) { waiter.response.await() }?.let { return@withLock it }
            }
            throw WearableProtocolException("Huawei watch did not answer command ${command.tag} after ${timeouts.maxAttempts} attempts")
        } finally {
            pending.compareAndSet(waiter, null)
        }
    }

    private suspend fun writeFrames(frames: List<ByteArray>) {
        val settings = frameSettings
        val unit = minOf(settings.singleFrameSize, gatt.maxWriteLength)
        frames.forEachIndexed { index, frame ->
            var offset = 0
            while (offset < frame.size) {
                val end = minOf(offset + unit, frame.size)
                try {
                    gatt.write(writeCharacteristic, frame.copyOfRange(offset, end))
                } catch (e: GattException) {
                    throw WearableProtocolException("Huawei write failed: ${e.message}", e)
                }
                offset = end
            }
            // The app pauses `interval` after each frame ([V] `coa.java:82,95`).
            if (index < frames.lastIndex && settings.intervalMs > 0) delay(settings.intervalMs.toLong())
        }
    }

    private fun onNotification(value: ByteArray) {
        for (event in reassembler.feed(value)) {
            when (event) {
                is FrameReassembler.Event.Corrupt -> Log.w(TAG, "Dropped inbound data: ${event.reason}")
                is FrameReassembler.Event.Payload -> onPayload(event.bytes)
            }
        }
    }

    private fun onPayload(bytes: ByteArray) {
        val command = try {
            val clear = if (PayloadCipher.isEncrypted(bytes)) {
                val activeCipher = cipher ?: run {
                    Log.w(TAG, "Encrypted payload received before authentication; dropped")
                    return
                }
                activeCipher.decrypt(bytes)
            } else {
                bytes
            }
            HuaweiCommand.decode(clear)
        } catch (e: MalformedPayloadException) {
            Log.w(TAG, "Malformed Huawei payload: ${e.message}")
            return
        }
        val waiter = pending.get()
        if (waiter != null && waiter.request.matches(command) && pending.compareAndSet(waiter, null)) {
            waiter.response.complete(command)
        } else {
            // TODO(huawei-protocol): route watch-initiated commands (notifications, file requests).
            Log.d(TAG, "Unsolicited Huawei message ${command.tag}")
        }
    }

    private companion object {
        const val TAG = "HuaweiTransport"
    }
}
