package com.unified.health.driver.xiaomi

import com.unified.health.core.ble.gatt.sigUuid
import com.unified.health.core.ble.protocol.ByteReader
import java.util.UUID

/**
 * GATT identifiers and protocol-generation discovery for Xiaomi MiWear watches/bands.
 *
 * Section numbers refer to `docs/protocols/XIAOMI_MIWEAR_DEVICE_PROTOCOL.md`.
 */
internal object XiaomiUuids {

    /** MiWear service, hosting every characteristic below (protocol §0.2 [V]). */
    val SERVICE: UUID = sigUuid(0xFE95)

    /** V2 notify: device -> phone (protocol §0.2 [V]). */
    val V2_NOTIFY: UUID = sigUuid(0x005E)

    /** V2 write: phone -> device (protocol §0.2 [V]). */
    val V2_WRITE: UUID = sigUuid(0x005F)

    /**
     * 3-byte protocol version, read once right after service discovery, before enabling
     * notifications (protocol §0.1/§1.2 [V]).
     */
    val VERSION: UUID = sigUuid(0x0050)

    /** Legacy (V1) command read characteristic (protocol §0.2 [V]). */
    val V1_COMMAND_READ: UUID = sigUuid(0x0051)

    /** Legacy (V1) command write characteristic (protocol §0.2 [V]). */
    val V1_COMMAND_WRITE: UUID = sigUuid(0x0052)

    /** Legacy (V1) activity data characteristic (protocol §0.2 [V]). */
    val V1_ACTIVITY_DATA: UUID = sigUuid(0x0053)

    /** Legacy (V1) upload characteristic (protocol §0.2 [V]). */
    val V1_UPLOAD: UUID = sigUuid(0x0055)

    /**
     * Parses the little-endian 3-byte value of [VERSION] into `major.minor.patch` plus the
     * generation it selects.
     *
     * Protocol §0.1 [V] (`e7r.java` `H0()`/callback on `qf4.f31473b`, `k8q.a(0x50)`):
     * ```
     * p = b0 | (b1 << 8) | (b2 << 16)
     * versionName = "b0.b1.b2"
     * if versionName starts with "0" -> V1 stack; else -> V2 stack
     * ```
     * A name starts with `"0"` exactly when `b0 == 0`, which is the check [XiaomiProtocolVersion.generation]
     * implements.
     *
     * @throws com.unified.health.core.ble.protocol.MalformedPayloadException if [bytes] has fewer than 3 bytes.
     */
    fun parseProtocolVersion(bytes: ByteArray): XiaomiProtocolVersion {
        val reader = ByteReader(bytes)
        val major = reader.u8()
        val minor = reader.u8()
        val patch = reader.u8()
        return XiaomiProtocolVersion(major, minor, patch)
    }
}

/** Stack selected by [XiaomiUuids.parseProtocolVersion] (protocol §0.1 [V]). */
internal enum class XiaomiGeneration {
    /** Legacy stack: product-specific UUIDs, OS bond + `CMD_SEND_USERID` (protocol §0/§6.2). */
    V1,

    /** `0xFE95` notify `0x5E` / write `0x5F`, token + nonce handshake, no OS bond (protocol §0/§6.1). */
    V2,
}

/** `major.minor.patch` read from [XiaomiUuids.VERSION] (protocol §0.1 [V]). */
internal data class XiaomiProtocolVersion(val major: Int, val minor: Int, val patch: Int) {

    /** A `versionName` of `"0.x.y"` (i.e. `major == 0`) means V1; anything else means V2. */
    val generation: XiaomiGeneration get() = if (major == 0) XiaomiGeneration.V1 else XiaomiGeneration.V2

    override fun toString(): String = "$major.$minor.$patch"
}

/**
 * L2 channel numbers -- byte 0 of every L2 payload -- and the feature each one carries (protocol
 * §4 [V]). [XiaomiL1]'s ACK policy also keys off these ids (§3.3: immediate ACK for [PROTOBUF] and
 * [LYRA], cumulative otherwise), so they are shared constants rather than private to L2.
 */
internal enum class XiaomiChannel(val id: Int) {
    /** Auth + virtually all protobuf commands (`s7r`/`t7r`/`q90`/...). */
    PROTOBUF(1),
    MASS(2),
    MASS_VOICE(3),
    FILE_SENSOR(4),

    /** Fitness data download (protocol §9.4). */
    FILE_FITNESS(5),
    OTA(6),
    NETWORK(7),
    LYRA(8),
    RESEARCH(9),
    ;

    companion object {
        fun fromId(id: Int): XiaomiChannel? = entries.firstOrNull { it.id == id }
    }
}
