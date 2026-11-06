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
 * The official app always registers service 4 (REGISTRATION) and queries its info pages first
 * (§10.2 [V], `eh2/f.initialize`). We go straight to GFDI, and only when the watch answers REJECTED
 * do we run that registration sequence ([queryRegistrationInfoPages]) and retry once
 * (`GARMIN_IMPLEMENTATION_BRIEF.md` TODO-1).
 * TODO(garmin-protocol): NEEDS-REAL-WATCH — whether firmware ever requires service 4 first, and the
 * info-page *response* layout (not decoded; we only wait for an answer per page).
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
        var response = requestGfdi(link)
        if (response.status == RegisterStatus.REJECTED && queryRegistrationInfoPages(link)) {
            Log.i(TAG, "GFDI rejected; retrying after the REGISTRATION info-page query")
            response = requestGfdi(link)
        }
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

    private suspend fun requestGfdi(link: MultiLinkLink): MultiLinkResponse.Register =
        link.register(MultiLinkCodec.SERVICE_GFDI, REGISTER_TIMEOUT_MS) ?: throw WearableProtocolException(
            "The watch did not answer the Multi-Link GFDI registration within ${REGISTER_TIMEOUT_MS / 1000}s",
        )

    /**
     * REGISTER service 4 and ask each info page (§4.B.6-7, §10.2 [V]): write `[H4][pageType]` for the
     * page order of `eh2/f.initialize` and wait for any answer on H4, retrying [INFO_PAGE_ATTEMPTS]
     * times with [INFO_PAGE_TIMEOUT_MS] each (`ml2/o.java`). The answer's content is not parsed.
     * @return false when the watch refused service 4, so retrying GFDI is pointless.
     */
    private suspend fun queryRegistrationInfoPages(link: MultiLinkLink): Boolean {
        val registration = link.register(MultiLinkCodec.SERVICE_REGISTRATION, REGISTER_TIMEOUT_MS)
        if (registration == null || registration.status != RegisterStatus.SUCCESS) {
            Log.w(TAG, "REGISTRATION service refused (status ${registration?.status}); cannot retry GFDI")
            return false
        }
        val handle = registration.handle
        val answers = link.channelFor(handle)
        for (page in MultiLinkCodec.INFO_PAGE_ORDER) {
            var answered = false
            for (attempt in 1..INFO_PAGE_ATTEMPTS) {
                link.write(byteArrayOf(handle.toByte(), page.toByte()))
                if (withTimeoutOrNull(INFO_PAGE_TIMEOUT_MS) { answers.receiveCatching().getOrNull() } != null) {
                    answered = true
                    break
                }
            }
            if (!answered) Log.w(TAG, "No answer to info page $page after $INFO_PAGE_ATTEMPTS attempts")
        }
        return true
    }

    companion object {
        private const val TAG = "GarminMultiLink"

        /** `nl2/d.java:178`: the official app waits 5 s for CLOSE_ALL. */
        const val CLOSE_ALL_TIMEOUT_MS = 5_000L

        /** `nl2/d.java:224-231`: REGISTER waits up to 30 s, including PENDING_AUTH. */
        const val REGISTER_TIMEOUT_MS = 30_000L

        /** `ml2/o.java` via §4.B.7: retried 5 times, 1 s per page. */
        const val INFO_PAGE_ATTEMPTS = 5
        const val INFO_PAGE_TIMEOUT_MS = 1_000L
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
        do {
            val drained = control.tryReceive().isSuccess
        } while (drained)
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
