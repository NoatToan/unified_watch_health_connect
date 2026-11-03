package com.unified.health.driver.garmin.transport

import android.util.Log
import com.unified.health.core.ble.driver.UnsupportedDeviceException
import com.unified.health.core.ble.driver.WearableProtocolException
import com.unified.health.core.ble.gatt.GattCharacteristic
import com.unified.health.core.ble.gatt.GattClient
import com.unified.health.core.ble.gatt.GattException
import com.unified.health.driver.garmin.GarminUuids
import com.unified.health.driver.garmin.codec.MultiLinkCodec
import com.unified.health.driver.garmin.codec.MultiLinkResponse
import com.unified.health.driver.garmin.codec.RegisterStatus
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.channels.ClosedReceiveChannelException
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.launch
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import kotlinx.coroutines.withTimeoutOrNull
import java.util.concurrent.ConcurrentHashMap

/** The watch refused to open GFDI over Multi-Link. */
internal class MultiLinkRegistrationException(val status: Int, message: String) : WearableProtocolException(message)

/**
 * Opens GFDI over Multi-Link (§4.B [V], `eh2/f.java:250-330`, `nl2/d.java`): subscribe to a
 * `6A4E281x` characteristic, CLOSE_ALL our client's stale handles, then REGISTER service 1 (GFDI)
 * without the reliable layer and wait through PENDING_AUTH.
 *
 * TODO(garmin-protocol): the official app first registers service 4 (REGISTRATION) and reads the
 * "info pages" (§4.7, `ml2/o.java`) before GFDI. Skipped here; check on a real watch whether
 * firmware requires it.
 */
internal class MultiLinkConnector(
    private val gatt: GattClient,
    private val scope: CoroutineScope,
    private val clientId: Long,
) {
    suspend fun openGfdi(): GfdiStream {
        val (notify, write) = findChannel()
            ?: throw UnsupportedDeviceException("Multi-Link service has no 6A4E281x notify characteristic")
        val router = MultiLinkRouter(clientId)
        val notifications = gatt.subscribe(notify)
        val routerJob = scope.launch { router.run(notifications) }
        val link = MultiLinkLink(gatt, write, clientId, router, routerJob)
        try {
            if (!link.closeAll(CLOSE_ALL_TIMEOUT_MS)) {
                Log.w(TAG, "No CLOSE_ALL response within ${CLOSE_ALL_TIMEOUT_MS}ms; registering anyway")
            }
            val handle = registerGfdi(link)
            return MultiLinkGfdiStream(link, handle, router.channelFor(handle))
        } catch (t: Throwable) {
            routerJob.cancel()
            throw t
        }
    }

    /** Uses the first `6A4E281x` the watch exposes, writing to its `282x` twin when present (§3.1 [V]). */
    private fun findChannel(): Pair<GattCharacteristic, GattCharacteristic>? {
        for (index in 0 until GarminUuids.MULTI_LINK_CHANNEL_COUNT) {
            val notify = gatt.findCharacteristic(GarminUuids.multiLinkNotify(index), GarminUuids.MULTI_LINK_SERVICE) ?: continue
            val write = gatt.findCharacteristic(GarminUuids.multiLinkWrite(index), GarminUuids.MULTI_LINK_SERVICE) ?: notify
            return notify to write
        }
        return null
    }

    private suspend fun registerGfdi(link: MultiLinkLink): Int {
        val response = link.register(MultiLinkCodec.SERVICE_GFDI, REGISTER_TIMEOUT_MS) ?: throw WearableProtocolException(
            "The watch did not answer the Multi-Link GFDI registration within ${REGISTER_TIMEOUT_MS / 1000}s",
        )
        when (response.status) {
            RegisterStatus.SUCCESS -> Unit
            RegisterStatus.ALREADY_IN_USE -> throw MultiLinkRegistrationException(
                response.status,
                "GFDI is already in use by another app (usually Garmin Connect). Close or unpair it in Garmin Connect, then retry.",
            )
            RegisterStatus.REJECTED -> throw MultiLinkRegistrationException(
                response.status,
                "The watch rejected this app's Multi-Link client id; its firmware may only accept Garmin-issued ids.",
            )
            else -> throw MultiLinkRegistrationException(response.status, "Multi-Link GFDI registration failed (status ${response.status})")
        }
        if (response.reliableFlags and MultiLinkCodec.RELIABLE_FLAG != 0) {
            throw UnsupportedDeviceException("This watch requires Multi-Link Reliable (MLR), which is not implemented")
        }
        return response.handle
    }

    companion object {
        private const val TAG = "GarminMultiLink"

        /** `nl2/d.java:178`: the official app waits 5 s for CLOSE_ALL. */
        const val CLOSE_ALL_TIMEOUT_MS = 5_000L

        /** `nl2/d.java:224-231`: REGISTER waits up to 30 s, including PENDING_AUTH. */
        const val REGISTER_TIMEOUT_MS = 30_000L
    }
}

/**
 * One Multi-Link channel shared by every service this app opens on it (GFDI, realtime data…).
 * Control exchanges are serialised, because the watch answers them all on handle 0.
 */
internal class MultiLinkLink(
    private val gatt: GattClient,
    private val writeCharacteristic: GattCharacteristic,
    private val clientId: Long,
    private val router: MultiLinkRouter,
    private val routerJob: Job,
) {
    private val controlLock = Mutex()

    val maxPacketPayload: Int get() = gatt.maxWriteLength - 1

    suspend fun write(packet: ByteArray) = gatt.write(writeCharacteristic, packet)

    suspend fun closeAll(timeoutMs: Long): Boolean = controlLock.withLock {
        router.drainControl()
        write(MultiLinkCodec.closeAll(clientId))
        awaitControl<MultiLinkResponse.CloseAll>(timeoutMs) { true } != null
    }

    /**
     * REGISTERs [serviceId] with plain (non-reliable) flags and waits through PENDING_AUTH.
     * @return the final response, or null when the watch did not answer within [timeoutMs].
     */
    suspend fun register(serviceId: Int, timeoutMs: Long): MultiLinkResponse.Register? = controlLock.withLock {
        router.drainControl()
        write(MultiLinkCodec.register(clientId, serviceId))
        awaitControl<MultiLinkResponse.Register>(timeoutMs) {
            if (it.serviceId != serviceId) return@awaitControl false
            if (it.status == RegisterStatus.PENDING_AUTH) Log.i(TAG, "Service $serviceId registration pending authorisation on the watch")
            it.status != RegisterStatus.PENDING_AUTH
        }
    }

    fun channelFor(handle: Int): ReceiveChannel<ByteArray> = router.channelFor(handle)

    /** CLOSE_HANDLE (`ml2/l.java:128-157`), best effort; the local channel is released either way. Never throws. */
    suspend fun closeHandle(serviceId: Int, handle: Int) {
        try {
            withTimeoutOrNull(CLOSE_TIMEOUT_MS) { write(MultiLinkCodec.closeHandle(clientId, serviceId, handle)) }
        } catch (e: GattException) {
            Log.d(TAG, "Could not close Multi-Link handle $handle: ${e.message}")
        } finally {
            router.release(handle)
        }
    }

    fun close() = routerJob.cancel()

    private suspend inline fun <reified T : MultiLinkResponse> awaitControl(
        timeoutMs: Long,
        crossinline accept: (T) -> Boolean,
    ): T? = withTimeoutOrNull(timeoutMs) {
        var match: T? = null
        while (match == null) {
            val response = try {
                router.control.receive()
            } catch (_: ClosedReceiveChannelException) {
                throw WearableProtocolException("Link closed during a Multi-Link control exchange")
            }
            if (response is T && accept(response)) match = response
        }
        match
    }

    private companion object {
        const val TAG = "GarminMultiLink"
        const val CLOSE_TIMEOUT_MS = 2_000L
    }
}

/**
 * Demultiplexes Multi-Link notifications `[handle][payload]`: control packets (handle 0) for our
 * client go to [control]; data for handles we registered goes to per-handle channels. Other
 * clients' traffic (Garmin Connect shares the same characteristic) is dropped.
 *
 * The handle channel is created while routing the REGISTER response, before any data for that
 * handle can be routed, so nothing sent right after registration is lost.
 */
internal class MultiLinkRouter(private val clientId: Long) {

    val control = Channel<MultiLinkResponse>(Channel.UNLIMITED)
    private val handles = ConcurrentHashMap<Int, Channel<ByteArray>>()

    fun channelFor(handle: Int): ReceiveChannel<ByteArray> =
        handles[handle] ?: throw WearableProtocolException("Multi-Link handle $handle was never registered")

    /** Forgets a closed handle; data still arriving for it is dropped. */
    fun release(handle: Int) {
        handles.remove(handle)?.close()
    }

    /** Drops stale control responses so the next exchange only sees answers to its own request. */
    fun drainControl() {
        while (control.tryReceive().isSuccess) Unit
    }

    suspend fun run(notifications: ReceiveChannel<ByteArray>) {
        try {
            for (packet in notifications) route(packet)
        } finally {
            control.close()
            handles.values.forEach { it.close() }
        }
    }

    fun route(packet: ByteArray) {
        if (packet.isEmpty()) return
        val handle = packet[0].toInt() and 0xFF
        if (handle == MultiLinkCodec.CONTROL_HANDLE) {
            when (val response = MultiLinkCodec.parseResponse(packet)) {
                is MultiLinkResponse.Register -> if (response.clientId == clientId) {
                    if (response.status == RegisterStatus.SUCCESS) handles.putIfAbsent(response.handle, Channel(Channel.UNLIMITED))
                    control.trySend(response)
                }
                is MultiLinkResponse.CloseAll -> if (response.clientId == null || response.clientId == clientId) control.trySend(response)
                null -> Unit
            }
        } else {
            handles[handle]?.trySend(packet.copyOfRange(1, packet.size))
        }
    }
}

/** GFDI over a Multi-Link handle: every packet is `[handle][≤ ATT payload − 1 bytes]` (§3.3 [V], `ml2/s.java:427-458`). */
internal class MultiLinkGfdiStream(
    override val multiLink: MultiLinkLink,
    private val handle: Int,
    override val incoming: ReceiveChannel<ByteArray>,
) : GfdiStream {

    override suspend fun write(data: ByteArray) {
        val chunkSize = multiLink.maxPacketPayload
        var offset = 0
        while (offset < data.size) {
            val end = minOf(offset + chunkSize, data.size)
            val packet = ByteArray(end - offset + 1)
            packet[0] = handle.toByte()
            data.copyInto(packet, destinationOffset = 1, startIndex = offset, endIndex = end)
            multiLink.write(packet)
            offset = end
        }
    }

    override suspend fun close() {
        try {
            multiLink.closeHandle(MultiLinkCodec.SERVICE_GFDI, handle)
        } finally {
            multiLink.close()
        }
    }
}
