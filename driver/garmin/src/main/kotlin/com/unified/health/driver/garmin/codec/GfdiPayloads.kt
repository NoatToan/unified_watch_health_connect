package com.unified.health.driver.garmin.codec

import com.unified.health.core.ble.protocol.ByteReader
import com.unified.health.core.ble.protocol.MalformedPayloadException
import com.unified.health.core.ble.protocol.buildBytes
import java.time.Instant
import java.time.ZoneId

/** Garmin/FIT timestamps count seconds since 1989-12-31T00:00:00Z ([Ext] FIT profile; §4.15 [V]). */
internal object FitTime {
    const val EPOCH_OFFSET_SECONDS = 631_065_600L

    fun toInstant(fitSeconds: Long): Instant = Instant.ofEpochSecond(fitSeconds + EPOCH_OFFSET_SECONDS)

    fun fromInstant(instant: Instant): Long = instant.epochSecond - EPOCH_OFFSET_SECONDS
}

/**
 * 5024 sent by the watch (§4.10 [V], `at2/a.java:472-540`). Optional trailing fields (dual-BT MACs)
 * are ignored.
 */
internal data class GarminDeviceInformation(
    val protocolVersion: Int,
    val productNumber: Int,
    val unitId: Long,
    /** Firmware version ×100 ([I]: displayed by Garmin as `major.minor`). */
    val softwareVersion: Int,
    /** Largest GFDI message the watch accepts. */
    val maxPacketSize: Int,
    val bluetoothFriendlyName: String,
    val deviceName: String,
    val deviceModel: String,
) {
    val firmwareVersionText: String get() = "%d.%02d".format(softwareVersion / 100, softwareVersion % 100)

    companion object {
        fun decode(payload: ByteArray): GarminDeviceInformation {
            val r = ByteReader(payload)
            return GarminDeviceInformation(
                protocolVersion = r.u16le(),
                productNumber = r.u16le(),
                unitId = r.u32le(),
                softwareVersion = r.u16le(),
                maxPacketSize = r.u16le(),
                bluetoothFriendlyName = r.string8(),
                deviceName = r.string8(),
                deviceModel = r.string8(),
            )
        }
    }
}

/** What this app tells the watch about itself in the 5024 reply. */
internal data class HostIdentity(
    val appVersion: Int,
    val friendlyName: String,
    val manufacturer: String,
    val model: String,
)

internal object GfdiPayloads {

    /**
     * Protocol version we announce. 113 keeps the watch on the normal (non-compact) header; ≥150
     * would switch to compact headers with transaction ids (§4.10 [V], `at2/a.java:350-376`).
     */
    const val HOST_PROTOCOL_VERSION = 113

    /**
     * ACK data replying to 5024 (§4.10 [V], `at2/a.java:350-376`):
     * `u16 protocol | u16 0xFFFF | u32 0xFFFFFFFF | u16 appVersion | u16 0xFFFF | string8 friendlyName |
     *  string8 manufacturer | string8 model | u8 1`.
     */
    fun hostInformation(host: HostIdentity): ByteArray = buildBytes(64) {
        u16le(HOST_PROTOCOL_VERSION)
        u16le(0xFFFF)
        u32le(0xFFFF_FFFFL)
        u16le(host.appVersion)
        u16le(0xFFFF)
        string8(host.friendlyName)
        string8(host.manufacturer)
        string8(host.model)
        u8(1)
    }

    /**
     * ACK data replying to 5052 (§4.15 [V], `vs2/a.java:57-118, 333-347`):
     * `request[0..4] | u32 now (FIT s) | s32 utcOffset s | u32 nextDstStart | u32 nextDstEnd`.
     *
     * The decompiled code writes the transition *into* daylight time first: it takes the next
     * transition T1 and, if the zone is in DST right after T1, emits (T1, next transition after
     * T1 + 1 day), otherwise (next transition after T1 + 1 day, T1). Both are 0 without DST.
     */
    fun currentTimeReply(request: ByteArray, now: Instant, zone: ZoneId): ByteArray {
        if (request.size < 4) throw MalformedPayloadException("Current time request needs 4 bytes, got ${request.size}")
        val rules = zone.rules
        var dstStart = 0L
        var dstEnd = 0L
        val first = rules.nextTransition(now)?.instant
        if (first != null) {
            val second = rules.nextTransition(first.plusSeconds(SECONDS_PER_DAY))?.instant
            val firstStartsDst = rules.isDaylightSavings(first)
            val start = if (firstStartsDst) first else second
            val end = if (firstStartsDst) second else first
            dstStart = start?.let(FitTime::fromInstant) ?: 0L
            dstEnd = end?.let(FitTime::fromInstant) ?: 0L
        }
        return buildBytes(20) {
            bytes(request.copyOf(4))
            u32le(FitTime.fromInstant(now))
            u32le(rules.getOffset(now).totalSeconds.toLong() and 0xFFFF_FFFFL)
            u32le(dstStart)
            u32le(dstEnd)
        }
    }

    /** 5050 payload: `len u8 | capability bitmask[len]` (§4.12 [V], `at2/a.java:429-458`). */
    fun decodeConfiguration(payload: ByteArray): ByteArray {
        val r = ByteReader(payload)
        return r.bytes(r.u8())
    }

    fun encodeConfiguration(bitmask: ByteArray): ByteArray = buildBytes(bitmask.size + 1) {
        require(bitmask.size <= 0xFF) { "Capability bitmask too long" }
        u8(bitmask.size)
        bytes(bitmask)
    }

    /** 5030 payload `[eventId, 0]` (§4.16 [V], `vs2/l.java:96-100`). */
    fun systemEvent(eventId: Int): ByteArray = byteArrayOf(eventId.toByte(), 0)

    /**
     * 5002 payload (§6.1 [V], `xs2/c.java:209-222`): `u16 fileIndex | u32 offset | u8 1 |
     * u16 crcSeed | u32 size | u8 compressed`. Always a full, uncompressed download from offset 0.
     */
    fun downloadRequest(fileIndex: Int): ByteArray = buildBytes(14) {
        u16le(fileIndex)
        u32le(0)
        u8(1)
        u16le(0)
        u32le(0)
        u8(0)
    }
}

/** System event ids for 5030 (§4.16 [V], `vs2/k.java`). */
internal object GarminSystemEvent {
    const val SYNC_COMPLETE = 0
    const val HANDSHAKE_COMPLETE = 8
}

/** ACK data of a 5002 download request: `u8 status (0 = OK) | u32 fileSize` (§6.1 [V]). */
internal data class DownloadResponse(val status: Int, val fileSize: Long) {
    val isOk: Boolean get() = status == 0

    companion object {
        fun decode(data: ByteArray): DownloadResponse {
            val r = ByteReader(data)
            return DownloadResponse(r.u8(), r.u32le())
        }
    }
}

private const val SECONDS_PER_DAY = 86_400L
