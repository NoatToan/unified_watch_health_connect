package com.unified.health.driver.garmin.codec

import com.unified.health.core.ble.protocol.ByteReader
import com.unified.health.core.ble.protocol.ByteWriter
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
        val (dstStart, dstEnd) = nextDstTransitions(now, zone)
        return buildBytes(20) {
            bytes(request.copyOf(4))
            u32le(FitTime.fromInstant(now))
            u32le(zone.rules.getOffset(now).totalSeconds.toLong() and 0xFFFF_FFFFL)
            u32le(dstStart)
            u32le(dstEnd)
        }
    }

    /**
     * 5026 Set Device Settings pushed when the watch does not advertise capability bit 71
     * (§4.3 [V], `vs2/a.java:237-312`): `count u8 = 5` followed by five TLVs
     * `tag u8 | len u8 = 4 | u32le value`: 1 = current time (FIT s), 2 = DST savings seconds,
     * 3 = UTC offset seconds, 4 = next DST start, 5 = next DST end.
     *
     * The vendor writes the local zone's current DST savings for tag 2 (0 outside DST), not the
     * next transition's savings.
     */
    fun setDeviceSettings(now: Instant, zone: ZoneId): ByteArray {
        val rules = zone.rules
        val utcOffset = rules.getOffset(now).totalSeconds.toLong()
        val dstSavings = if (rules.isDaylightSavings(now)) utcOffset - rules.getStandardOffset(now).totalSeconds else 0L
        val (dstStart, dstEnd) = nextDstTransitions(now, zone)
        return buildBytes(31) {
            u8(5)
            u32leTlv(1, FitTime.fromInstant(now))
            u32leTlv(2, dstSavings)
            u32leTlv(3, utcOffset)
            u32leTlv(4, dstStart)
            u32leTlv(5, dstEnd)
        }
    }

    /** `tag u8 | len u8 (4) | u32le value`, the TLV unit of 5026. */
    private fun ByteWriter.u32leTlv(tag: Int, value: Long) {
        u8(tag)
        u8(4)
        u32le(value)
    }

    /** Next DST start/end as FIT seconds, zero when [zone] has no further transitions. */
    private fun nextDstTransitions(now: Instant, zone: ZoneId): Pair<Long, Long> {
        val rules = zone.rules
        val first = rules.nextTransition(now)?.instant ?: return 0L to 0L
        val second = rules.nextTransition(first.plusSeconds(SECONDS_PER_DAY))?.instant
        val firstStartsDst = rules.isDaylightSavings(first)
        val start = if (firstStartsDst) first else second
        val end = if (firstStartsDst) second else first
        return (start?.let(FitTime::fromInstant) ?: 0L) to (end?.let(FitTime::fromInstant) ?: 0L)
    }

    /**
     * Device capability bit 71 = CURRENT_TIME_REQUEST_SUPPORT (§4.15 [V], `vs2/k.java`), held in the
     * watch's own 5050 bitmask. With it the vendor sends 5030 TIME_UPDATED and waits for 5052;
     * without it the host pushes [setDeviceSettings] instead (`vs2/a.java:206-302`).
     */
    const val CURRENT_TIME_REQUEST_CAPABILITY = 71

    fun timeSyncMode(deviceCapabilities: ByteArray): TimeSyncMode =
        if (hasCapability(deviceCapabilities, CURRENT_TIME_REQUEST_CAPABILITY)) TimeSyncMode.TIME_UPDATED
        else TimeSyncMode.SET_DEVICE_SETTINGS

    /** `bitmask[bit / 8] & (1 << (bit % 8))`, the same packing as [capabilityBitmask]. */
    fun hasCapability(bitmask: ByteArray, bit: Int): Boolean {
        val index = bit / 8
        return index < bitmask.size && (bitmask[index].toInt() and (1 shl (bit % 8))) != 0
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

    /**
     * `SupportedCapability` ordinals this host really serves (§10.1 [V], `SupportedCapability.<clinit>`;
     * set from `GARMIN_IMPLEMENTATION_BRIEF.md` TODO-2). Anything else (GNCS, LiveTrack, weather…)
     * would make the watch send messages we can only answer with UNKNOWN_OR_NOT_SUPPORTED.
     */
    val HOST_CAPABILITIES: Set<Int> = setOf(
        0, // CONNECT_MOBILE_FIT_LINK: FIT file transfer
        3, // SYNC
        4, // DEVICE_INITIATES_SYNC: watch may send 5037
        5, // HOST_INITIATED_SYNC_REQUESTS
        // EXPLICIT_ARCHIVE: the host archives files itself (5008) instead of the watch doing it after
        // a download [I]; we never send 5008, so files stay un-archived for Garmin Connect.
        29,
        71, // CURRENT_TIME_REQUEST_SUPPORT: the watch asks for time with 5052, which we answer
    )

    /** `bitmask[bit / 8] |= 1 << (bit % 8)` (§10.1 [V]), as short as the highest bit allows. */
    fun capabilityBitmask(bits: Set<Int>): ByteArray {
        val highest = bits.maxOrNull() ?: return ByteArray(0)
        val bytes = ByteArray(highest / 8 + 1)
        for (bit in bits) bytes[bit / 8] = (bytes[bit / 8].toInt() or (1 shl (bit % 8))).toByte()
        return bytes
    }

    /** Our own 5050 payload: `len u8 | HOST_CAPABILITIES bitmask`. */
    fun hostConfiguration(): ByteArray = encodeConfiguration(capabilityBitmask(HOST_CAPABILITIES))

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
    const val TIME_UPDATED = 16
}

/** Which 5026/5030 command the host uses for its active time sync (§4.3 [V]). */
internal enum class TimeSyncMode {
    /** Device 5050 bit 71 set: send 5030 TIME_UPDATED, then wait up to 5 s for 5052. */
    TIME_UPDATED,

    /** Device 5050 bit 71 clear: push the 5026 Set Device Settings TLV. */
    SET_DEVICE_SETTINGS,
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

/**
 * 5023 Battery Status (§10.3 [V], `ha2/a.java:161-198`; mask/offset verified, label mapping [I]):
 * `flags u8 | ? u8 | percent u8 | ...`, at least [LENGTH] bytes. The status is `payload[0] & 0x70`
 * (0x10 new, 0x20 good, 0x30 ok, 0x40 low, 0x50 critical, 0x70 invalid); the capacity percentage is
 * `payload[2]`. A timestamp at offset 3 is kept when present but is not required.
 *
 * This is only the fallback when the SIG `0x180F` battery is absent; [decode] returns null for
 * invalid statuses/percentages so a bad notification never overwrites a good value.
 */
internal data class BatteryStatus(val percent: Int, val status: Int, val fitTimestamp: Long) {
    companion object {
        const val LENGTH = 6
        const val STATUS_MASK = 0x70
        const val STATUS_NEW = 0x10
        const val STATUS_GOOD = 0x20
        const val STATUS_OK = 0x30
        const val STATUS_LOW = 0x40
        const val STATUS_CRITICAL = 0x50
        const val STATUS_INVALID = 0x70

        /** Statuses the vendor reports through its callback; 0x00/0x60 are ignored, 0x70 is invalid. */
        private val REPORTABLE_STATUSES = setOf(STATUS_NEW, STATUS_GOOD, STATUS_OK, STATUS_LOW, STATUS_CRITICAL)

        fun decode(payload: ByteArray): BatteryStatus? {
            if (payload.size < LENGTH) return null
            val status = payload[0].toInt() and STATUS_MASK
            if (status !in REPORTABLE_STATUSES) return null
            val percent = payload[2].toInt() and 0xFF
            if (percent !in 0..100) return null
            val timestamp = if (payload.size >= 7) ByteReader(payload, 3).u32le() else 0L
            return BatteryStatus(percent, status, timestamp)
        }
    }
}

/**
 * 5023 request sent by the vendor's 10-minute battery timer (§4.3 [V], `ha2/a.java:201-215`,
 * `ha2/b.java:59-77`): `FF 00 level FF FF FF`. The vendor fills [level] with the phone's battery
 * percentage; this driver has no phone-battery source, so it sends 0xFF (unknown).
 */
internal fun batteryStatusPoll(level: Int = 0xFF): ByteArray =
    byteArrayOf(0xFF.toByte(), 0x00, level.toByte(), 0xFF.toByte(), 0xFF.toByte(), 0xFF.toByte())

/**
 * Converts the 5024 `maxPacketSize` into the usable GFDI payload budget (§2 "Capability bitmask /
 * maxPacket", `us2/b.java:221-235`). The watch value is a *link* budget, not a payload size:
 * subtract the COBS block overhead `ceil(n / 254)` plus 8 bytes of framing, or 18 bytes when
 * session encryption is on, then align an encrypted budget so `budget + 18` is a multiple of 4
 * (the vendor's `budget -= 4 - budget % 4`).
 */
internal object GfdiPacketBudget {
    private const val COBS_BLOCK = 254
    private const val FRAMING_OVERHEAD = 8
    private const val ENCRYPTED_OVERHEAD = 18
    private const val ENCRYPTION_ALIGNMENT = 4

    fun usablePayload(maxPacketSize: Int, encrypted: Boolean = false): Int {
        require(maxPacketSize >= 0) { "maxPacketSize must be >= 0, got $maxPacketSize" }
        var cobsOverhead = maxPacketSize / COBS_BLOCK
        if (maxPacketSize % COBS_BLOCK > 0) cobsOverhead++
        var budget = maxPacketSize - cobsOverhead - if (encrypted) ENCRYPTED_OVERHEAD else FRAMING_OVERHEAD
        if (encrypted) {
            val remainder = budget % ENCRYPTION_ALIGNMENT
            if (remainder > 0) budget -= ENCRYPTION_ALIGNMENT - remainder
        }
        return budget
    }
}

private const val SECONDS_PER_DAY = 86_400L
