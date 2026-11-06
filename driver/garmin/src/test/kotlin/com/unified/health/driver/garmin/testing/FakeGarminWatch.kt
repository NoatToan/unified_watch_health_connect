package com.unified.health.driver.garmin.testing

import com.unified.health.core.ble.gatt.GattCharacteristic.Companion.PROPERTY_NOTIFY
import com.unified.health.core.ble.gatt.GattCharacteristic.Companion.PROPERTY_READ
import com.unified.health.core.ble.gatt.GattCharacteristic.Companion.PROPERTY_WRITE
import com.unified.health.core.ble.gatt.StandardUuids
import com.unified.health.core.ble.protocol.ByteReader
import com.unified.health.core.ble.protocol.buildBytes
import com.unified.health.core.testing.FakeGattClient
import com.unified.health.core.testing.characteristic
import com.unified.health.driver.garmin.GarminUuids
import com.unified.health.driver.garmin.codec.Cobs
import com.unified.health.driver.garmin.codec.CobsFrameAccumulator
import com.unified.health.driver.garmin.codec.GarminCrc16
import com.unified.health.driver.garmin.codec.GfdiAck
import com.unified.health.driver.garmin.codec.GfdiMessage
import com.unified.health.driver.garmin.codec.GfdiMessageId
import com.unified.health.driver.garmin.codec.GfdiStatus
import com.unified.health.driver.garmin.codec.MultiLinkCodec
import com.unified.health.driver.garmin.codec.RegisterStatus
import kotlinx.coroutines.delay

/**
 * Scripted Garmin watch on top of [FakeGattClient]. It decodes what the driver writes with the
 * (separately unit-tested) codec and answers like the protocol document describes.
 */
internal class FakeGarminWatch(
    private val multiLink: Boolean = true,
    mtu: Int = 23,
    heartRateService: Boolean = false,
    realtimeService: Boolean = false,
    sigBattery: Boolean = true,
) {

    val mlNotify = characteristic(GarminUuids.MULTI_LINK_SERVICE, GarminUuids.multiLinkNotify(0), PROPERTY_NOTIFY)
    val mlWrite = characteristic(GarminUuids.MULTI_LINK_SERVICE, GarminUuids.multiLinkWrite(0), PROPERTY_WRITE)
    val gfdiRead = characteristic(GarminUuids.GFDI_V2_SERVICE, GarminUuids.GFDI_V2_READ, PROPERTY_NOTIFY)
    val gfdiWrite = characteristic(GarminUuids.GFDI_V2_SERVICE, GarminUuids.GFDI_V2_WRITE, PROPERTY_WRITE)
    private val battery = characteristic(StandardUuids.BATTERY_SERVICE, StandardUuids.BATTERY_LEVEL, PROPERTY_READ)

    val heartRate = characteristic(StandardUuids.HEART_RATE_SERVICE, StandardUuids.HEART_RATE_MEASUREMENT, PROPERTY_NOTIFY)
    val realtimeHeartRate = characteristic(GarminUuids.REALTIME_SERVICE, GarminUuids.REALTIME_HEART_RATE, PROPERTY_NOTIFY)

    val gatt = FakeGattClient(
        (if (multiLink) listOf(mlNotify, mlWrite) else listOf(gfdiRead, gfdiWrite)) +
            (if (sigBattery) listOf(battery) else emptyList()) +
            (if (heartRateService) listOf(heartRate) else emptyList()) +
            (if (realtimeService) listOf(realtimeHeartRate) else emptyList()),
        mtu = mtu,
    ).apply { readValues[StandardUuids.BATTERY_LEVEL] = byteArrayOf(81) }

    /** Statuses sent, in order, in answer to REGISTER of GFDI (e.g. PENDING_AUTH then SUCCESS). */
    var registerStatuses = listOf(RegisterStatus.SUCCESS)

    /** When true, REGISTER(GFDI) is REJECTED until service 4 was registered and every info page asked. */
    var requireRegistrationService = false

    /** Answer to REGISTER of REGISTRATION (service 4). */
    var registrationStatus = RegisterStatus.SUCCESS

    /** Info pages that get no answer on the first N requests each (to exercise retries). */
    var silentInfoPageRequests = 0

    /** Info-page types asked on the REGISTRATION handle, in order (retries included). */
    val infoPageRequests = mutableListOf<Int>()

    /** Answer to REGISTER of REAL_TIME_HR (service 6); null = never answer. */
    var realtimeRegisterStatus: Int? = RegisterStatus.INVALID_SERVICE_ID

    /** REGISTER requests per Multi-Link service id. */
    val registrations = mutableMapOf<Int, Int>()

    /** CLOSE_HANDLE requests as (serviceId, handle). */
    val closedHandles = mutableListOf<Pair<Int, Int>>()
    var sendDeviceInformation = true
    var systemEventStatus = GfdiStatus.ACK
    val configuration = byteArrayOf(0x0F, 0x00, 0x01)

    /** Files served by 5002, by index; index 0 is the directory. */
    val files = mutableMapOf<Int, ByteArray>()

    /** Messages written by the driver, in order. */
    val received = mutableListOf<GfdiMessage>()

    /** Raw Multi-Link control packets written by the driver. */
    val controlWrites = mutableListOf<ByteArray>()

    private val accumulator = CobsFrameAccumulator()
    private var download: Pair<Int, ByteArray>? = null

    init {
        gatt.onWrite = { _, value -> onWrite(value) }
    }

    /** Dedicated transport: the watch speaks first once the driver subscribed. */
    suspend fun announceWhenSubscribed() {
        while (!gatt.isSubscribed(gfdiRead)) delay(1)
        sendDeviceInformation()
    }

    fun ackOf(id: Int): GfdiAck? = received.filter { it.id == GfdiMessageId.ACK }.map { GfdiAck.decode(it.payload) }
        .lastOrNull { it.originalId == id }

    fun sent(id: Int): List<GfdiMessage> = received.filter { it.id == id }

    private fun onWrite(value: ByteArray) {
        if (!multiLink) return onGfdiBytes(value)
        when (value[0].toInt()) {
            MultiLinkCodec.CONTROL_HANDLE -> onControl(value)
            HANDLE -> onGfdiBytes(value.copyOfRange(1, value.size))
            REGISTRATION_HANDLE -> onInfoPageRequest(value[1].toInt())
            else -> error("Write to unknown handle ${value[0]}")
        }
    }

    private fun onControl(packet: ByteArray) {
        controlWrites += packet
        val clientId = ByteReader(packet, 2).u64le()
        when (packet[1].toInt()) {
            MultiLinkCodec.CMD_CLOSE_ALL -> notifyRaw(buildBytes { u8(0); u8(MultiLinkCodec.CMD_CLOSE_ALL_RESPONSE); u64le(clientId) })
            MultiLinkCodec.CMD_REGISTER -> {
                val serviceId = ByteReader(packet, 10).u16le()
                registrations[serviceId] = (registrations[serviceId] ?: 0) + 1
                when (serviceId) {
                    MultiLinkCodec.SERVICE_GFDI -> {
                        // Another client's traffic on the same characteristic must be ignored by the driver.
                        notifyRaw(registerResponse(clientId + 1, serviceId, RegisterStatus.SUCCESS, handle = 9))
                        notifyRaw(byteArrayOf(9, 1, 2, 3))
                        val statuses = if (requireRegistrationService && !infoPagesComplete()) listOf(RegisterStatus.REJECTED) else registerStatuses
                        for (status in statuses) notifyRaw(registerResponse(clientId, serviceId, status, HANDLE))
                        if (statuses.last() == RegisterStatus.SUCCESS) sendDeviceInformation()
                    }
                    MultiLinkCodec.SERVICE_REGISTRATION ->
                        notifyRaw(registerResponse(clientId, serviceId, registrationStatus, REGISTRATION_HANDLE))
                    MultiLinkCodec.SERVICE_REAL_TIME_HR ->
                        realtimeRegisterStatus?.let { notifyRaw(registerResponse(clientId, serviceId, it, REALTIME_HANDLE)) }
                }
            }
            MultiLinkCodec.CMD_CLOSE_HANDLE -> {
                val r = ByteReader(packet, 10)
                closedHandles += r.u16le() to r.u8()
            }
        }
    }

    private fun infoPagesComplete() =
        registrations.containsKey(MultiLinkCodec.SERVICE_REGISTRATION) && infoPageRequests.toSet() == MultiLinkCodec.INFO_PAGE_ORDER.toSet()

    /** Answers `[H4][pageType]` with `[H4][pageType][one service entry]`; content is opaque to the driver. */
    private fun onInfoPageRequest(page: Int) {
        infoPageRequests += page
        if (silentInfoPageRequests > 0) {
            silentInfoPageRequests--
            return
        }
        notifyRaw(byteArrayOf(REGISTRATION_HANDLE.toByte(), page.toByte(), 1, 0))
    }

    private fun registerResponse(clientId: Long, serviceId: Int, status: Int, handle: Int) = buildBytes {
        u8(0); u8(MultiLinkCodec.CMD_REGISTER_RESPONSE); u64le(clientId); u16le(serviceId); u8(status)
        if (status == RegisterStatus.SUCCESS) { u8(handle); u8(0); u8(1) }
    }

    /** One REAL_TIME_HR data packet on the Multi-Link handle. */
    fun sendRealtime(payload: ByteArray) = notifyRaw(byteArrayOf(REALTIME_HANDLE.toByte()) + payload)

    fun sendDeviceInformation() {
        if (!sendDeviceInformation) return
        sendGarbageFrame()
        send(
            GfdiMessageId.DEVICE_INFORMATION,
            buildBytes {
                u16le(113); u16le(3990); u32le(3_456_789_012L); u16le(1520); u16le(512)
                string8("FR265"); string8("Forerunner 265"); string8("Forerunner 265S")
            },
        )
    }

    /** A frame with a broken CRC: the driver must drop it and keep going. */
    private fun sendGarbageFrame() = sendFrame(byteArrayOf(8, 0, 0xA6.toByte(), 0x13, 8, 0, 0, 0))

    private fun onGfdiBytes(bytes: ByteArray) {
        for (frame in accumulator.feed(bytes)) {
            val message = GfdiMessage.decode(Cobs.decode(frame))
            received += message
            onMessage(message)
        }
    }

    private fun onMessage(message: GfdiMessage) {
        when (message.id) {
            GfdiMessageId.ACK -> onAppAck(GfdiAck.decode(message.payload))
            GfdiMessageId.CONFIGURATION -> ack(message.id, GfdiStatus.ACK)
            GfdiMessageId.SYSTEM_EVENT -> ack(message.id, systemEventStatus)
            GfdiMessageId.DOWNLOAD_REQUEST -> onDownloadRequest(ByteReader(message.payload).u16le())
            else -> ack(message.id, GfdiStatus.UNKNOWN_OR_NOT_SUPPORTED)
        }
    }

    private fun onAppAck(ack: GfdiAck) {
        when (ack.originalId) {
            GfdiMessageId.DEVICE_INFORMATION -> {
                send(GfdiMessageId.CONFIGURATION, byteArrayOf(configuration.size.toByte()) + configuration)
                send(GfdiMessageId.CURRENT_TIME_REQUEST, byteArrayOf(1, 2, 3, 4))
                send(9999, byteArrayOf()) // unknown to the driver
            }
            GfdiMessageId.FILE_DATA -> {
                val r = ByteReader(ack.data)
                val status = r.u8()
                val next = r.u32le().toInt()
                val (_, file) = download ?: return
                if (status == 0 && next < file.size) sendChunk(next) else download = null
            }
        }
    }

    private fun onDownloadRequest(index: Int) {
        val file = files[index]
        if (file == null) {
            ack(GfdiMessageId.DOWNLOAD_REQUEST, GfdiStatus.ACK, buildBytes { u8(1); u32le(0) })
            return
        }
        ack(GfdiMessageId.DOWNLOAD_REQUEST, GfdiStatus.ACK, buildBytes { u8(0); u32le(file.size.toLong()) })
        download = index to file
        if (file.isNotEmpty()) sendChunk(0)
    }

    private fun sendChunk(offset: Int) {
        val (_, file) = download ?: return
        val end = minOf(offset + FILE_CHUNK, file.size)
        send(
            GfdiMessageId.FILE_DATA,
            buildBytes {
                u8(0)
                u16le(GarminCrc16.compute(file, 0, end))
                u32le(offset.toLong())
                bytes(file.copyOfRange(offset, end))
            },
        )
    }

    private fun ack(id: Int, status: Int, data: ByteArray = ByteArray(0)) =
        send(GfdiMessageId.ACK, GfdiAck(id, status, data).encode())

    fun send(id: Int, payload: ByteArray) = sendFrame(GfdiMessage(id, payload).encode())

    private fun sendFrame(message: ByteArray) {
        val stream = Cobs.frame(message)
        val chunk = gatt.mtu - 3 - if (multiLink) 1 else 0
        for (start in stream.indices step chunk) {
            val part = stream.copyOfRange(start, minOf(start + chunk, stream.size))
            if (multiLink) gatt.notify(mlNotify, byteArrayOf(HANDLE.toByte()) + part) else gatt.notify(gfdiRead, part)
        }
    }

    private fun notifyRaw(packet: ByteArray) = gatt.notify(mlNotify, packet)

    companion object {
        const val HANDLE = 4
        const val REALTIME_HANDLE = 5
        const val REGISTRATION_HANDLE = 6
        const val FILE_CHUNK = 100
    }
}
