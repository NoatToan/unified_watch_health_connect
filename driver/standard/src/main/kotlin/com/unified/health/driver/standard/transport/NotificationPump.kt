package com.unified.health.driver.standard.transport

import android.util.Log
import com.unified.health.core.ble.protocol.MalformedPayloadException
import com.unified.health.core.ble.protocol.toHex
import kotlinx.coroutines.CompletableDeferred
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.launch
import kotlinx.coroutines.selects.select
import kotlinx.coroutines.withTimeoutOrNull

/**
 * Single consumer of one characteristic's notification channel. Values are decoded by [handler] in
 * arrival order; [flush] returns once every value that was already queued has been handled, so a
 * sync can drain its buffer knowing nothing received before the call is still in flight (stored
 * PLX records indicated before the RACP response, see `PlxStoredRecordReader`).
 */
internal class NotificationPump(
    private val name: String,
    private val values: ReceiveChannel<ByteArray>,
    private val handler: (ByteArray) -> Unit,
) {
    private val barriers = Channel<CompletableDeferred<Unit>>(Channel.UNLIMITED)
    private var job: Job? = null

    fun launchIn(scope: CoroutineScope): Job = scope.launch { run() }.also { launched ->
        job = launched
        launched.invokeOnCompletion {
            barriers.close()
            while (true) barriers.tryReceive().getOrNull()?.complete(Unit) ?: break
        }
    }

    /** Waits until all queued values are handled; returns immediately once the link is gone. */
    suspend fun flush(timeoutMs: Long = FLUSH_TIMEOUT_MS) {
        if (job?.isActive != true) return
        val ack = CompletableDeferred<Unit>()
        if (barriers.trySend(ack).isFailure) return
        if (withTimeoutOrNull(timeoutMs) { ack.await() } == null) Log.w(TAG, "$name: flush timed out")
    }

    private suspend fun run() {
        while (true) {
            val open = select {
                values.onReceiveCatching { result ->
                    result.getOrNull()?.let { handle(it); true } ?: false
                }
                barriers.onReceive { ack ->
                    drainQueued()
                    ack.complete(Unit)
                    true
                }
            }
            if (!open) break
        }
        Log.d(TAG, "$name: notifications stopped")
    }

    override fun toString(): String = name

    private fun drainQueued() {
        while (true) handle(values.tryReceive().getOrNull() ?: return)
    }

    private fun handle(value: ByteArray) {
        try {
            handler(value)
        } catch (e: MalformedPayloadException) {
            // A corrupt frame is a logged protocol error, never a crash.
            Log.w(TAG, "$name: dropped malformed value (${value.size} bytes, ${value.take(MAX_LOGGED).toByteArray().toHex()}): ${e.message}")
        }
    }

    private companion object {
        const val TAG = "StandardPump"
        const val FLUSH_TIMEOUT_MS = 2_000L
        const val MAX_LOGGED = 8
    }
}
