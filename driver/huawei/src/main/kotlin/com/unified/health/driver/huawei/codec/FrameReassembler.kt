package com.unified.health.driver.huawei.codec

import com.unified.health.core.ble.protocol.MalformedPayloadException
import java.io.ByteArrayOutputStream

/**
 * Rebuilds application payloads from BLE notifications (HUAWEI_DEVICE_PROTOCOL.md §4.2, the
 * receive side of `coa.java:200-520`). Two independent layers:
 * 1. a byte stream split at the watch's single-frame size is cut back into 0x5A frames using the
 *    length field (one notification may also carry several frames);
 * 2. sliced frames (flags 1/2/3) are joined in index order into one payload.
 *
 * Not thread-safe: feed it from a single coroutine.
 */
internal class FrameReassembler(private val maxBufferedBytes: Int = MAX_BUFFERED_BYTES) {

    sealed interface Event {
        class Payload(val bytes: ByteArray) : Event

        /** A frame or slice sequence was dropped; reassembly continues with the next frame. */
        class Corrupt(val reason: String) : Event
    }

    private var stream = ByteArray(INITIAL_CAPACITY)
    private var streamSize = 0
    private var slices: ByteArrayOutputStream? = null
    private var nextSliceIndex = 0

    fun feed(notification: ByteArray): List<Event> {
        val events = ArrayList<Event>(1)
        append(notification)
        while (streamSize > 0) {
            if ((stream[0].toInt() and 0xFF) != FrameCodec.MAGIC) {
                val skipped = resync()
                events += Event.Corrupt("Skipped $skipped bytes without 0x5A frame start")
                continue
            }
            val length = FrameCodec.frameLength(stream, streamSize) ?: break
            if (length > maxBufferedBytes) {
                discard(1)
                events += Event.Corrupt("Frame length $length exceeds $maxBufferedBytes bytes")
                continue
            }
            if (streamSize < length) break
            val frameBytes = stream.copyOf(length)
            discard(length)
            onFrame(frameBytes, events)
        }
        return events
    }

    private fun onFrame(bytes: ByteArray, events: MutableList<Event>) {
        val frame = try {
            FrameCodec.decode(bytes)
        } catch (e: MalformedPayloadException) {
            slices = null
            events += Event.Corrupt(e.message ?: "Malformed frame")
            return
        }
        if (frame.flag == FrameCodec.FLAG_SINGLE || frame.flag == FrameCodec.FLAG_FIRST) {
            if (slices != null) events += Event.Corrupt("Slice sequence abandoned before its last slice")
            slices = null
        }
        when (frame.flag) {
            FrameCodec.FLAG_SINGLE -> events += Event.Payload(frame.data)
            FrameCodec.FLAG_FIRST -> {
                slices = ByteArrayOutputStream().apply { write(frame.data) }
                nextSliceIndex = ((frame.index ?: 0) + 1) and 0xFF
            }
            else -> appendSlice(frame)?.let { events += it }
        }
    }

    private fun appendSlice(frame: FrameCodec.Frame): Event? {
        val buffer = slices ?: return Event.Corrupt("Slice ${frame.index} without a first slice")
        if (frame.index != nextSliceIndex) {
            slices = null
            return Event.Corrupt("Slice index ${frame.index}, expected $nextSliceIndex")
        }
        buffer.write(frame.data)
        if (buffer.size() > maxBufferedBytes) {
            slices = null
            return Event.Corrupt("Sliced payload exceeds $maxBufferedBytes bytes")
        }
        nextSliceIndex = (nextSliceIndex + 1) and 0xFF
        if (frame.flag != FrameCodec.FLAG_LAST) return null
        slices = null
        return Event.Payload(buffer.toByteArray())
    }

    private fun append(data: ByteArray) {
        if (streamSize + data.size > stream.size) stream = stream.copyOf(maxOf(stream.size * 2, streamSize + data.size))
        data.copyInto(stream, streamSize)
        streamSize += data.size
    }

    /** Drops bytes up to the next 0x5A; returns how many were dropped. */
    private fun resync(): Int {
        var i = 1
        while (i < streamSize && (stream[i].toInt() and 0xFF) != FrameCodec.MAGIC) i++
        discard(i)
        return i
    }

    private fun discard(count: Int) {
        stream.copyInto(stream, 0, count, streamSize)
        streamSize -= count
    }

    companion object {
        /** Same safety cap as the app ([V] `coa.java:229`, 102400 bytes). */
        const val MAX_BUFFERED_BYTES = 102_400
        private const val INITIAL_CAPACITY = 512
    }
}
