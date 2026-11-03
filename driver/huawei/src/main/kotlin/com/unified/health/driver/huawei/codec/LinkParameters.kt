package com.unified.health.driver.huawei.codec

import com.unified.health.core.ble.protocol.MalformedPayloadException

/**
 * Result of 0x0101 Link Negotiation (HUAWEI_DEVICE_PROTOCOL.md §5.2, [V] `ckv.java:148-256`,
 * field mapping verified against `cml.java` getters used by `coa`/`cjy`/`cke`).
 *
 * @property maxFrameSize TLV 2: largest 0x5A frame; drives slicing (`coa.java:51,62`).
 * @property singleFrameSize TLV 3: largest chunk per BLE write; frames are cut at this size (`coa.java:53,70-101`).
 * @property intervalMs TLV 4: pause after a frame (`coa.java:52,82`). [I] the unit is milliseconds.
 * @property authVersion first 2 bytes of TLV 5; 0 is rejected by the app as "invalid device version".
 * @property randA last 16 bytes of TLV 5: the watch challenge for authentication.
 * @property authType TLV 7 ("deviceSupportType"): selects the auth mechanism (`cke.java:38-43`), see `HuaweiAuthMode`.
 * @property bondStatus TLV 9; 2 means the watch lost the bond keys while the phone is still bonded (`ckv.java:113`).
 * @property encryptionMethod TLV 12; 1 selects AES-GCM for payloads (`cjy.java:193`).
 * @property singleFrameSizeDevice TLV 15 (logged only by the app).
 * @property raw every TLV received, for authenticators that need more.
 */
internal class LinkParameters(
    val maxFrameSize: Int,
    val singleFrameSize: Int,
    val intervalMs: Int,
    val authVersion: Int,
    val randA: ByteArray?,
    val authType: Int,
    val bondStatus: Int?,
    val encryptionMethod: Int,
    val singleFrameSizeDevice: Int?,
    val raw: List<Tlv>,
) {
    val keyMissing: Boolean get() = bondStatus == BOND_STATUS_KEY_MISSING

    val cipherMode: CipherMode get() = if (encryptionMethod == ENCRYPTION_GCM) CipherMode.AES_GCM else CipherMode.AES_CBC_PKCS5

    override fun toString(): String =
        "LinkParameters(maxFrame=$maxFrameSize, singleFrame=$singleFrameSize, interval=$intervalMs, " +
            "authVersion=$authVersion, authType=$authType, bondStatus=$bondStatus, encryption=$encryptionMethod)"

    companion object {
        const val SERVICE_ID = 0x01
        const val COMMAND_ID = 0x01

        /** Defaults the app uses before negotiation ([V] `coa.java:29-33`). */
        const val DEFAULT_FRAME_SIZE = 255
        const val DEFAULT_INTERVAL_MS = 10

        const val BOND_STATUS_KEY_MISSING = 2
        const val ENCRYPTION_GCM = 1

        private const val TAG_MAX_FRAME = 2
        private const val TAG_SINGLE_FRAME = 3
        private const val TAG_INTERVAL = 4
        private const val TAG_AUTH = 5
        private const val TAG_AUTH_TYPE = 7
        private const val TAG_BOND_STATUS = 9
        private const val TAG_ENCRYPTION = 12
        private const val TAG_SINGLE_FRAME_DEVICE = 15
        private const val TAG_DEMO_WATCH = 16
        private const val TAG_AUTH_LENGTH = 18
        private const val RAND_A_SIZE = 16

        /** Workaround the app applies when the watch reports a 2698-byte single frame ([V] `ckv.java:216-222`). */
        private const val QUIRK_SINGLE_FRAME = 2698
        private const val QUIRK_FRAME_SIZE = 990

        /**
         * Request: `01 01 | 01 00 02 00 03 00 04 00 10 00` — empty TLVs asking for parameters 1-4 and
         * 16 (16 is only omitted on Huawei retail demo phones). [V] `ckv.java:25-61`
         */
        fun request(): HuaweiCommand = HuaweiCommand(SERVICE_ID, COMMAND_ID, listOf(1, 2, 3, 4, 16).map { Tlv(it) })

        /** @throws LinkNegotiationException with the reason the app would also abort on. */
        fun parse(response: HuaweiCommand): LinkParameters {
            val tlvs = response.tlvs
            if (tlvs.isEmpty()) throw LinkNegotiationException("empty link parameter response")
            if (tlvs.find(HuaweiCommand.ERROR_TAG) != null) {
                throw LinkNegotiationException("watch returned error ${response.errorCode()}")
            }
            if (tlvs.find(TAG_DEMO_WATCH)?.let { intOrNull(it) } == 1) {
                throw LinkNegotiationException("watch is in retail demo mode")
            }
            val auth = tlvs.find(TAG_AUTH)?.value?.takeIf { it.size == TAG_AUTH_LENGTH }
            val authVersion = auth?.let { ((it[0].toInt() and 0xFF) shl 8) or (it[1].toInt() and 0xFF) } ?: 0
            if (authVersion == 0) throw LinkNegotiationException("watch did not report an authentication version (TLV 5)")

            var maxFrame = tlvs.find(TAG_MAX_FRAME)?.let(::intOrNull) ?: DEFAULT_FRAME_SIZE
            var singleFrame = tlvs.find(TAG_SINGLE_FRAME)?.let(::intOrNull) ?: DEFAULT_FRAME_SIZE
            var interval = tlvs.find(TAG_INTERVAL)?.let(::intOrNull) ?: DEFAULT_INTERVAL_MS
            if (singleFrame == QUIRK_SINGLE_FRAME) {
                maxFrame = QUIRK_FRAME_SIZE
                singleFrame = QUIRK_FRAME_SIZE
                interval = DEFAULT_INTERVAL_MS
            }
            if (maxFrame <= FrameCodec.SLICE_OVERHEAD || singleFrame <= 0) {
                throw LinkNegotiationException("unusable frame sizes max=$maxFrame single=$singleFrame")
            }
            return LinkParameters(
                maxFrameSize = maxFrame,
                singleFrameSize = singleFrame,
                intervalMs = interval.coerceAtLeast(0),
                authVersion = authVersion,
                randA = auth?.copyOfRange(2, 2 + RAND_A_SIZE),
                authType = tlvs.find(TAG_AUTH_TYPE)?.let(::intOrNull) ?: 0,
                bondStatus = tlvs.find(TAG_BOND_STATUS)?.let(::intOrNull),
                encryptionMethod = tlvs.find(TAG_ENCRYPTION)?.let(::intOrNull) ?: 0,
                singleFrameSizeDevice = tlvs.find(TAG_SINGLE_FRAME_DEVICE)?.let(::intOrNull),
                raw = tlvs,
            )
        }

        private fun intOrNull(tlv: Tlv): Int? = try {
            tlv.int()
        } catch (_: MalformedPayloadException) {
            null
        }
    }
}

internal class LinkNegotiationException(message: String) : Exception(message)
