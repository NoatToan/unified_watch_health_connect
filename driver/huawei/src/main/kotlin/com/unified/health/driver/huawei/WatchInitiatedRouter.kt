package com.unified.health.driver.huawei

import android.util.Log
import com.unified.health.core.model.HealthRecord
import com.unified.health.core.model.WearableVendor
import com.unified.health.driver.huawei.codec.HuaweiCommand
import com.unified.health.driver.huawei.transport.WatchInitiatedHandler
import java.time.Clock
import java.time.Instant

/**
 * Routes messages the watch sends on its own (HUAWEI_DEVICE_PROTOCOL.md §11.5) by service and keeps
 * them, newest [capacity] at most, until the next sync hands them over as
 * [HealthRecord.RawPayload]s (`kind = huawei_watch_<category>_<SSCC>`).
 *
 * Why only routing + raw capture: which services push unsolicited frames is [I] (log strings), and
 * none of their payload layouts is documented — decoding an "HR alert" (svc 7) into
 * `HealthRecord.HeartRate` or a "battery alert" (svc 1 cmd 8/9) into a battery level would mean
 * inventing a layout. TODO(huawei-protocol): decode per category once an HCI log shows the bytes;
 * also confirm whether the watch expects an ACK for any of them (the app's `MessageReceiveCallback`
 * suggests the receiving layer acknowledges, layout unknown).
 *
 * Thread-safe: [onWatchInitiated] runs on the transport reader, [drain] on the sync caller.
 */
internal class WatchInitiatedRouter(
    private val clock: Clock,
    private val capacity: Int = DEFAULT_CAPACITY,
) : WatchInitiatedHandler {

    /** Coarse category from the service id ([I] §11.5); used for logging and the raw-payload kind. */
    enum class Category(val label: String) {
        DEVICE_STATUS("device_status"),
        NOTIFICATION("notification"),
        FITNESS("fitness"),
        EXERCISE("exercise"),
        FILE_TRANSFER("file_request"),
        OTHER("other"),
        ;

        companion object {
            fun of(serviceId: Int): Category = when (serviceId) {
                SERVICE_DEVICE_CONFIG -> DEVICE_STATUS
                SERVICE_NOTIFY -> NOTIFICATION
                SERVICE_FITNESS -> FITNESS
                SERVICE_WORKOUT -> EXERCISE
                SERVICE_COMMON_FILE_REQUEST -> FILE_TRANSFER
                else -> OTHER
            }
        }
    }

    private class Received(val command: HuaweiCommand, val at: Instant)

    private val buffer = ArrayDeque<Received>()

    override fun onWatchInitiated(command: HuaweiCommand) {
        val category = Category.of(command.serviceId)
        Log.i(TAG, "Watch-initiated ${command.tag} (${category.label}), kept raw")
        synchronized(buffer) {
            if (buffer.size == capacity) buffer.removeFirst()
            buffer.addLast(Received(command, clock.instant()))
        }
    }

    /** Everything received since the previous call, as raw payloads, oldest first. */
    fun drain(): List<HealthRecord.RawPayload> {
        val items = synchronized(buffer) { buffer.toList().also { buffer.clear() } }
        return items.map {
            HealthRecord.RawPayload(
                vendor = WearableVendor.HUAWEI,
                kind = "huawei_watch_${Category.of(it.command.serviceId).label}_${it.command.tag.lowercase()}",
                createdAt = it.at,
                bytes = it.command.encode(),
            )
        }
    }

    companion object {
        private const val TAG = "HuaweiWatchEvents"
        const val DEFAULT_CAPACITY = 256

        const val SERVICE_DEVICE_CONFIG = 1
        const val SERVICE_NOTIFY = 2
        const val SERVICE_FITNESS = 7
        const val SERVICE_WORKOUT = 23
        const val SERVICE_COMMON_FILE_REQUEST = 44
    }
}
