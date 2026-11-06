package com.unified.health.driver.standard

import com.unified.health.core.model.HealthRecord

/**
 * Records captured from a SIG device but not yet handed to a sink, kept per device address by the
 * long-lived driver (D-603). A link loss or app-initiated reconnect therefore never loses samples
 * that were streamed before the next sync: the new session resumes with the same buffer.
 */
internal class StandardSampleStore {
    private val buffers = HashMap<String, SampleBuffer>()

    fun bufferFor(address: String): SampleBuffer = synchronized(buffers) {
        buffers.getOrPut(address.uppercase()) { SampleBuffer() }
    }
}

/**
 * Bounded FIFO with two-phase hand-over: [snapshot] then, once the sink accepted the batch,
 * [commit]. Records added in between (live stream) survive the commit. Thread-safe.
 */
internal class SampleBuffer(private val capacity: Int = DEFAULT_CAPACITY) {

    class Snapshot(val records: List<HealthRecord>, internal val lastSequence: Long)

    private class Entry(val sequence: Long, val record: HealthRecord)

    private val entries = ArrayDeque<Entry>()
    private var nextSequence = 0L

    /** Number of records dropped because the buffer was full (oldest first). */
    var dropped: Long = 0
        private set

    val size: Int get() = synchronized(this) { entries.size }

    fun add(record: HealthRecord) = synchronized(this) {
        if (entries.size == capacity) {
            entries.removeFirst()
            dropped++
        }
        entries.addLast(Entry(nextSequence++, record))
    }

    fun snapshot(): Snapshot = synchronized(this) {
        Snapshot(entries.map { it.record }, entries.lastOrNull()?.sequence ?: -1)
    }

    /** Removes everything up to and including [snapshot]; later additions stay. */
    fun commit(snapshot: Snapshot) = synchronized(this) {
        while (entries.isNotEmpty() && entries.first().sequence <= snapshot.lastSequence) entries.removeFirst()
    }

    companion object {
        /** ~5.5 hours of 1 Hz heart rate plus the derived records. */
        const val DEFAULT_CAPACITY = 20_000
    }
}
