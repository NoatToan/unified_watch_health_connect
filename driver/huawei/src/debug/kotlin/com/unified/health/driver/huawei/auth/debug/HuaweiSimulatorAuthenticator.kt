package com.unified.health.driver.huawei.auth.debug

import android.util.Log
import com.unified.health.core.ble.driver.AuthenticationException
import com.unified.health.core.ble.driver.SessionContext
import com.unified.health.driver.huawei.auth.HuaweiAuthMode
import com.unified.health.driver.huawei.auth.HuaweiAuthenticator
import com.unified.health.driver.huawei.auth.HuaweiSessionKeys
import com.unified.health.driver.huawei.codec.HuaweiCommand
import com.unified.health.driver.huawei.codec.LinkParameters
import com.unified.health.driver.huawei.codec.Tlv
import com.unified.health.driver.huawei.codec.find
import com.unified.health.driver.huawei.transport.HuaweiCommandChannel
import java.security.SecureRandom
import javax.inject.Inject

/**
 * NOT a Huawei authentication mechanism. `HUAWEI_DEVICE_PROTOCOL.md` §6/§9 concludes that every
 * real mechanism (legacy HMAC, HiChainLite, HiChain/HiChain3) needs vendor secrets this project
 * must not extract (docs/DECISIONS.md D-004) — production ships zero [HuaweiAuthenticator]s
 * ([com.unified.health.driver.huawei.di.HuaweiDriverModule]) and real Huawei watches correctly fail
 * to connect (see [com.unified.health.driver.huawei.HuaweiDriver]).
 *
 * This class exists only so the E2E suite can drive the REAL framing/CRC/TLV/transport/cipher code
 * in this module end to end against the in-repo watch simulator
 * (`core/demo/.../virtual/huawei/HuaweiVirtualWatch.kt`), which is the only peer that answers this
 * exchange: a single clear round trip on 0x0113 trading a random challenge for a fixed, public,
 * test-only AES key, nothing resembling CAK/HMAC/HiChain. [mode] is [HuaweiAuthMode.LEGACY_HMAC]
 * only because that is the bucket [HuaweiAuthMode.candidatesFor] falls back to for an unrecognised
 * auth type (§6.1, "anything else → legacy HMAC"); [SIMULATOR_MARKER_TAG] guards against ever
 * running this against a real watch (which would simply not carry that TLV and fail fast below,
 * instead of wasting a 10s timeout).
 *
 * Compiled only into debug builds (`src/debug`): release never contains this class.
 */
internal class HuaweiSimulatorAuthenticator @Inject constructor() : HuaweiAuthenticator {

    override val mode = HuaweiAuthMode.LEGACY_HMAC

    override suspend fun authenticate(channel: HuaweiCommandChannel, link: LinkParameters, context: SessionContext): HuaweiSessionKeys {
        val marker = link.raw.find(SIMULATOR_MARKER_TAG)?.value
        if (marker == null || !marker.contentEquals(SIMULATOR_MARKER_VALUE)) {
            throw AuthenticationException(
                "Legacy HMAC authentication is not implemented; only the in-repo Huawei watch simulator is supported in debug builds",
            )
        }
        Log.i(TAG, "Authenticating against the Huawei watch simulator (test-only key, not real Huawei crypto)")
        val randB = ByteArray(RAND_B_SIZE).also { SecureRandom().nextBytes(it) }
        val response = channel.request(HuaweiCommand(SERVICE_ID, COMMAND_ID, listOf(Tlv(TAG_RAND_B, randB))))
        val workKey = response.tlvs.find(TAG_WORK_KEY)?.value
            ?: throw AuthenticationException("Huawei watch simulator did not return a work key on 0x0113")
        return HuaweiSessionKeys(workKey)
    }

    companion object {
        private const val TAG = "HuaweiSimAuth"
        private const val SERVICE_ID = 0x01

        /** 0x0113 AccessValidityAuthCommand's tag — reused as a realistic-looking channel, not re-implemented. */
        private const val COMMAND_ID = 0x13
        private const val TAG_RAND_B = 1
        private const val TAG_WORK_KEY = 1
        private const val RAND_B_SIZE = 16

        /** Link parameter TLV only [HuaweiVirtualWatch] ever sends; unused by the real protocol in this doc. */
        const val SIMULATOR_MARKER_TAG = 0x11
        val SIMULATOR_MARKER_VALUE: ByteArray = "UHSIM".toByteArray(Charsets.US_ASCII)
    }
}
