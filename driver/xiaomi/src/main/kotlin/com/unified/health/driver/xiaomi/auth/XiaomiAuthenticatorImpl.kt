package com.unified.health.driver.xiaomi.auth

import android.os.Build
import android.util.Log
import com.unified.health.core.ble.driver.AuthenticationException
import com.unified.health.core.ble.driver.CredentialReader
import com.unified.health.core.ble.driver.CredentialWriter
import com.unified.health.core.ble.driver.MissingCredentialException
import com.unified.health.core.ble.driver.WearableProtocolException
import com.unified.health.driver.xiaomi.XiaomiDriver
import com.unified.health.driver.xiaomi.crypto.aesCcmEncrypt
import com.unified.health.driver.xiaomi.crypto.aesCtrCrypt
import com.unified.health.driver.xiaomi.crypto.constantTimeEquals
import com.unified.health.driver.xiaomi.crypto.deriveAuthKeys
import com.unified.health.driver.xiaomi.crypto.deriveBindKeys
import com.unified.health.driver.xiaomi.crypto.generateEcKeyPair
import com.unified.health.driver.xiaomi.crypto.hmacSha256
import com.unified.health.driver.xiaomi.crypto.md5
import com.unified.health.driver.xiaomi.proto.AppDeviceInfo
import com.unified.health.driver.xiaomi.proto.Ca0
import com.unified.health.driver.xiaomi.proto.Ha0
import com.unified.health.driver.xiaomi.proto.Ka0
import com.unified.health.driver.xiaomi.proto.Na0
import com.unified.health.driver.xiaomi.proto.P90
import com.unified.health.driver.xiaomi.proto.Pb0
import com.unified.health.driver.xiaomi.proto.Q90
import com.unified.health.driver.xiaomi.proto.Qa0
import com.unified.health.driver.xiaomi.proto.S7r
import com.unified.health.driver.xiaomi.proto.Sb0
import com.unified.health.driver.xiaomi.proto.T7r
import com.unified.health.driver.xiaomi.proto.T90
import com.unified.health.driver.xiaomi.proto.Ta0
import com.unified.health.driver.xiaomi.proto.W90
import com.unified.health.driver.xiaomi.proto.Wa0
import com.unified.health.driver.xiaomi.proto.Z90
import com.unified.health.driver.xiaomi.transport.L2Frame
import com.unified.health.driver.xiaomi.transport.XiaomiLink
import java.security.SecureRandom
import javax.inject.Inject

/**
 * [XiaomiAuthenticator] for MiWear V2 and V1: the `getBindInfo` probe (protocol §7.1 [V]), the
 * token+nonce session auth (`WearAuthV2`, protocol §6.1 [V]), the no-cloud ECDH local bind
 * (`LocalWearBinderV2`, protocol §7.2 [V]) and V1's `CMD_SEND_USERID` session auth (`WearAuthV1`,
 * protocol §6.2 [V], [authenticateV1]). V2's PSK/cloud bind (§7.3) and V1's cloud bind
 * (`WearBinderV1`, §7.4) both need a cloud bind key this app does not fetch and stay out of scope
 * (D-1193) -- V1 support here is therefore reauth-only, for a watch already bound through Mi
 * Fitness; see [authenticateV1]'s KDoc.
 *
 * Every pre-auth exchange (bind probe, both auth messages, every local-bind step) is `s7r`/`t7r`
 * framed over [XiaomiLink]'s plaintext primitive, [L2Frame.TYPE_PB_PLAINTEXT]
 * ([XiaomiLink.requestRaw]) -- none of it is encrypted yet, which is exactly the state the
 * protocol describes before a token exists or before [authenticateV2] has installed the session
 * keys.
 */
internal class XiaomiAuthenticatorImpl internal constructor(
    private val random: SecureRandom,
) : XiaomiAuthenticator {

    @Inject internal constructor() : this(SecureRandom())

    override suspend fun probeBindMode(link: XiaomiLink, userId: String): XiaomiBindProbe {
        val sb0 = Sb0(dynamicCode = false, userIdMd5 = md5(userId.toByteArray(Charsets.UTF_8))).encode()
        val response = bindRequest(link, CMD_GET_BIND_INFO, P90(sb0 = sb0), GET_BIND_INFO_TIMEOUT_MS)
        response.errorCode?.let { code ->
            if (code == P90.ERROR_ALREADY_BOUND) {
                // Decision (brief asked for one, documented here): §7.5's table (codes 1002-1014)
                // are vendor *callback* codes surfaced during the multi-step bind flows; this is a
                // different, simpler signal read directly off `getBindInfo`'s own response (p90
                // field 3 == 1, protocol §7.1/§7.5 [V]). It means some OTHER identity (most likely
                // Mi Fitness, or a previous install of this app that lost its stored token)
                // already completed a bind with this watch -- we hold no token for that identity
                // and a *new* local bind cannot proceed either, because §10.4 says a watch that
                // already answers "already bound" must be reset (or unbound in Mi Fitness) before
                // any app can bind it again. Returning a probe result here would let the driver
                // start (and predictably fail) a full ECDH handshake; surfacing the actionable
                // failure immediately, instead of a probe the caller has to reinterpret, is safer.
                throw AuthenticationException(
                    "This Xiaomi watch reports it is already bound to another app or Xiaomi account. Unbind it " +
                        "in Mi Fitness, or factory-reset the watch, before pairing it with this app.",
                )
            }
            throw AuthenticationException("Xiaomi watch rejected getBindInfo (p90 error code $code)")
        }
        val ha0 = Ha0.decode(
            response.ha0 ?: throw WearableProtocolException("Xiaomi watch answered getBindInfo without ha0 (field 12)"),
        )
        return XiaomiBindProbe(
            verifyMode = ha0.verifyMode,
            oobMode = ha0.oobMode,
            serialNumber = ha0.serialNumber,
            mac = ha0.mac,
            model = ha0.model,
            did = ha0.did,
        )
    }

    override suspend fun authenticateV2(link: XiaomiLink, credentials: CredentialReader): XiaomiAuthResult {
        val token = credentials.get(XiaomiDriver.AUTH_TOKEN.key) ?: throw MissingCredentialException(XiaomiDriver.AUTH_TOKEN)
        if (token.size != TOKEN_SIZE) {
            throw AuthenticationException("The stored Xiaomi auth token has ${token.size} bytes; it must be $TOKEN_SIZE (32 hex characters)")
        }
        // Optional per protocol §6.1 ("required by Wear OS watches, optional for bands"); this
        // driver excludes Wear OS (see XiaomiDriver), so an absent value is expected and fine.
        val appDeviceId = credentials.get(XiaomiDriver.APP_DEVICE_ID.key)?.toString(Charsets.UTF_8)?.takeIf { it.isNotEmpty() }

        // Step 1: sendAppVerify (protocol §6.1 [V]).
        val appRandom = randomBytes(W90.RANDOM_SIZE)
        val w90 = W90(appRandom = appRandom, appDeviceId = appDeviceId, hasOob = HAS_OOB)
        val verifyReply = authRequest(link, T7r.CMD_NONCE, Q90(appVerify = w90.encode()))
        verifyReply.errorCode?.let { throwSessionAuthError(it) }
        val ca0 = Ca0.decode(
            verifyReply.deviceVerify ?: throw WearableProtocolException("Xiaomi watch answered CMD_NONCE without ca0 (deviceVerify)"),
        )

        // Step 2: verify the device's signature before trusting anything it sent (protocol §6.1 [V]).
        // TODO(xiaomi-protocol): §6.1 extends the signed message with a stored OOB string when
        // `DeviceInfo.oob` is non-empty ("deviceRandom||appRandom||oob"); this driver never stores
        // an OOB secret (see [HAS_OOB]), so only the plain two-random form is implemented.
        val keys = deriveAuthKeys(ikm = token, appRandom = appRandom, deviceRandom = ca0.deviceRandom)
        val expectedDeviceSign = keys.deviceSign(ca0.deviceRandom, appRandom)
        if (!constantTimeEquals(expectedDeviceSign, ca0.deviceSign)) {
            throw AuthenticationException(
                "Xiaomi watch's deviceSign did not match during session auth -- wrong auth token, or a " +
                    "corrupted/replayed nonce exchange. Re-import the token or re-run local bind.",
            )
        }

        // Step 3: sendAppConfirm (protocol §6.1 [V]).
        val appSign = keys.appSign(appRandom, ca0.deviceRandom)
        val deviceInfo = AppDeviceInfo(sdkInt = Build.VERSION.SDK_INT.toFloat(), model = Build.MODEL.orEmpty())
        val deviceInfoNonce = keys.appIV + ByteArray(DEVICE_INFO_NONCE_PADDING_BYTES)
        val encryptedInfo = aesCcmEncrypt(keys.appKey, deviceInfoNonce, deviceInfo.encode())
        val confirmReply = authRequest(link, T7r.CMD_AUTH, Q90(appConfirm = T90(appSign, encryptedInfo).encode()))
        confirmReply.errorCode?.let { throwSessionAuthError(it) }
        val z90 = Z90.decode(
            confirmReply.deviceConfirm ?: throw WearableProtocolException("Xiaomi watch answered CMD_AUTH without z90 (deviceConfirm)"),
        )
        if (!z90.confirmed) {
            throw AuthenticationException("Xiaomi watch refused the session-auth confirmation (z90.confirmed == false)")
        }

        // Install the derived session keys exactly as protocol §4 [V] specifies: AES-128-CTR,
        // key == IV, one direction keyed by appKey, the other by deviceKey.
        link.encrypt = { plaintext -> aesCtrCrypt(keys.appKey, keys.appKey, plaintext) }
        link.decrypt = { ciphertext -> aesCtrCrypt(keys.deviceKey, keys.deviceKey, ciphertext) }
        Log.i(TAG, "Session auth succeeded (deviceCapability=${z90.deviceCapability}, v2=${z90.deviceCapabilityV2})")
        return XiaomiAuthResult(deviceCapability = z90.deviceCapability, deviceCapabilityV2 = z90.deviceCapabilityV2)
    }

    override suspend fun localBind(
        link: XiaomiLink,
        userId: String,
        appDeviceId: String,
        credentialWriter: CredentialWriter,
    ): XiaomiAuthResult {
        // Step 1/3: generate the app's ECDH keypair and offer it (protocol §7.2 [V]).
        val keyPair = generateEcKeyPair(random)
        val step1 = bindRequest(link, CMD_LOCAL_BIND_ECDH, P90(na0 = Na0(appDeviceId, keyPair.publicKey).encode()))
        step1.errorCode?.let { throwBindError(it) }
        val ta0 = Ta0.decode(
            step1.ta0 ?: throw WearableProtocolException("Xiaomi watch answered the local-bind ECDH step without ta0"),
        )

        // Steps 5-8: verify the device's ECDH signature, then derive the bind/session keys and the
        // new permanent token. The shared secret only lives for this block.
        val (appRandom, confirmSign, bindKeys) = run {
            val sharedKey = keyPair.sharedSecret(ta0.devicePub)
            try {
                // TODO(xiaomi-protocol): append a stored OOB string to the signed message when
                // present (protocol §7.2 step 6); this driver has no OOB secret to append (see
                // [XiaomiAuthenticatorImpl.authenticateV2]'s matching TODO).
                val expectedDeviceSign = hmacSha256(sharedKey, ta0.deviceRandom)
                if (!constantTimeEquals(expectedDeviceSign, ta0.deviceSign)) {
                    throw AuthenticationException("Xiaomi watch's ECDH deviceSign did not match during local bind; aborting")
                }
                val freshAppRandom = randomBytes(APP_RANDOM_SIZE)
                val sign = hmacSha256(sharedKey, freshAppRandom)
                val keys = deriveBindKeys(sharedKey, freshAppRandom, ta0.deviceRandom)
                Triple(freshAppRandom, sign, keys)
            } finally {
                sharedKey.fill(0)
            }
        }

        // Step 9/10: app confirms with the fresh appRandom; the watch may need a button press
        // first (oobMode == 3), so this step alone uses the longer [OOB_CONFIRM_TIMEOUT_MS].
        val step2 = bindRequest(link, CMD_LOCAL_BIND_CONFIRM, P90(ka0 = Ka0(appRandom, confirmSign).encode()), OOB_CONFIRM_TIMEOUT_MS)
        step2.errorCode?.let { throwBindError(it) }
        val qa0 = Qa0.decode(
            step2.qa0 ?: throw WearableProtocolException("Xiaomi watch answered the local-bind confirm step without qa0"),
        )
        if (!qa0.confirmed) {
            throw AuthenticationException(
                "Xiaomi watch declined the local bind. If it showed a confirmation prompt, accept it on the " +
                    "watch and retry.",
            )
        }

        // Step 11: send the AES-CCM-wrapped bind result.
        val deviceInfo = AppDeviceInfo(sdkInt = Build.VERSION.SDK_INT.toFloat(), model = Build.MODEL.orEmpty())
        val encryptedBindResult = aesCcmEncrypt(
            bindKeys.appKey,
            BIND_RESULT_NONCE,
            Wa0(userId, deviceInfo).encode(),
            aad = BIND_RESULT_AAD,
        )
        val step3 = bindRequest(link, CMD_LOCAL_BIND_RESULT, P90(pb0 = Pb0(encryptedBindResult).encode()))
        step3.errorCode?.let { throwBindError(it) }

        credentialWriter.put(XiaomiDriver.AUTH_TOKEN.key, bindKeys.token)
        credentialWriter.put(XiaomiDriver.USER_ID.key, userId.toByteArray(Charsets.UTF_8))
        credentialWriter.put(XiaomiDriver.APP_DEVICE_ID.key, appDeviceId.toByteArray(Charsets.UTF_8))
        Log.i(TAG, "Local bind succeeded")
        return XiaomiAuthResult(token = bindKeys.token, appDeviceId = appDeviceId)
    }

    /**
     * V1's only auth message, `CMD_SEND_USERID` (protocol §6.2 [V], `WearAuthV1.e()`): a plaintext
     * `t7r{msgId=5}`/`q90{userId}` round trip over the same channel-1 plaintext primitive V2's
     * pre-auth messages use ([XiaomiLink.requestRaw] with [L2Frame.TYPE_PB_PLAINTEXT]) -- V1 never
     * installs session crypto (`link.encrypt`/`link.decrypt` stay identity), matching the doc's
     * "no token/HKDF/AES exchange on the version-0 path; traffic remains plaintext after the OS
     * bond". The OS bond itself ([XiaomiAuthenticator]'s contract requires it to already be in
     * place by the time this runs, protocol §6.2 step 1) is [XiaomiDriver.doOpenSession]'s job, via
     * [com.unified.health.core.ble.gatt.GattClient.ensureBonded] -- not this method's.
     *
     * [credentials]' `xiaomi.user_id` must be the identity this watch actually knows: V1 binding
     * (`WearBinderV1`, protocol §7.4) needs a cloud bind key this app does not fetch (D-1193, same
     * scope line as V2's PSK/cloud bind), so first-time V1 pairing is not supported here. A watch
     * already bound through Mi Fitness can still be used by pasting *that* userId (extracted from
     * Mi Fitness, not the random id this app would otherwise auto-generate) as the credential --
     * the auto-generated default simply fails with [Q90.ERROR_NOT_BOUND] below, which is this
     * method's only real failure mode.
     */
    override suspend fun authenticateV1(link: XiaomiLink, credentials: CredentialReader): XiaomiAuthResult {
        val userId = credentials.get(XiaomiDriver.USER_ID.key)?.toString(Charsets.UTF_8)?.takeIf { it.isNotEmpty() }
            ?: throw MissingCredentialException(XiaomiDriver.USER_ID)
        val reply = authRequest(link, T7r.CMD_SEND_USERID, Q90(userId = userId), SEND_USERID_TIMEOUT_MS)
        reply.errorCode?.let { throwSendUserIdError(it) }
        if (reply.success != true) {
            throw AuthenticationException("Xiaomi watch did not confirm CMD_SEND_USERID (no success flag in its reply)")
        }
        Log.i(TAG, "V1 session auth (CMD_SEND_USERID) succeeded")
        return XiaomiAuthResult()
    }

    /** Code 4 = not bound under this identity (protocol §6.2 [V]); every other code is generic. */
    private fun throwSendUserIdError(code: Int): Nothing {
        if (code == Q90.ERROR_NOT_BOUND) {
            throw AuthenticationException(
                "Xiaomi watch reports this identity is not bound (error code 4). MiWear V1 devices can only be " +
                    "added here if already bound through Mi Fitness: extract the account user id Mi Fitness used " +
                    "(e.g. from its own log via adb) and paste it as the Xiaomi local user id, then retry. This " +
                    "app cannot perform a first-time V1 bind -- that needs a cloud bind key (protocol §7.4).",
            )
        }
        throw AuthenticationException("Xiaomi watch rejected CMD_SEND_USERID (error code $code)")
    }

    // ---- pre-auth plaintext request/response wrappers (protocol §6.1/§7.2 [V], both over
    // L2Frame.TYPE_PB_PLAINTEXT, i.e. channel 1 opCode WRITE) ----

    /** `t7r`/`q90` round trip for the session-auth nonce handshake (protocol §6.1 [V]). */
    private suspend fun authRequest(link: XiaomiLink, msgId: Int, q90: Q90, timeoutMs: Long = AUTH_REQUEST_TIMEOUT_MS): Q90 {
        val requestBytes = T7r(msgId, q90.encode()).encode()
        val responseBytes = link.requestRaw(L2Frame.TYPE_PB_PLAINTEXT, requestBytes, timeoutMs)
        val response = T7r.decode(responseBytes)
        return response.q90?.let { Q90.decode(it) } ?: Q90()
    }

    /**
     * `s7r`/`p90` round trip for every bind-probe/local-bind command (protocol §7.1/§7.2 [V]),
     * all carried as `s7r { e = CLASS_BIND, f, p90 }`.
     * @throws com.unified.health.driver.xiaomi.proto.XiaomiDeviceErrorException if `s7r.field100`
     *  (transport-level error) is set.
     * @throws WearableProtocolException if the watch answers a different `(e, f)`.
     */
    private suspend fun bindRequest(link: XiaomiLink, f: Int, p90: P90, timeoutMs: Long = BIND_REQUEST_TIMEOUT_MS): P90 {
        val requestBytes = S7r.request(S7r.CLASS_BIND, f, p90.encode()).encode()
        val responseBytes = link.requestRaw(L2Frame.TYPE_PB_PLAINTEXT, requestBytes, timeoutMs)
        val response = S7r.decode(responseBytes)
        response.throwOnError()
        if (response.e != S7r.CLASS_BIND || response.f != f) {
            throw WearableProtocolException(
                "Xiaomi watch answered bind class ${response.e} command ${response.f}, expected class ${S7r.CLASS_BIND} command $f",
            )
        }
        return response.p90?.let { P90.decode(it) } ?: P90()
    }

    private fun randomBytes(size: Int): ByteArray = ByteArray(size).also(random::nextBytes)

    /** Code 4 = not bound / wrong app identity (protocol §6.1/§9.6 [V]); every other code is generic. */
    private fun throwSessionAuthError(code: Int): Nothing {
        if (code == Q90.ERROR_NOT_BOUND) {
            throw AuthenticationException(
                "Xiaomi watch reports this app is not bound to it (error code 4). Run local bind again, or " +
                    "import the correct token from Mi Fitness.",
            )
        }
        throw AuthenticationException("Xiaomi watch rejected the session-auth request (error code $code)")
    }

    /** Code 1 = already bound (see [probeBindMode]'s KDoc), code 6 = the watch/user cancelled (protocol §7.2 [V]). */
    private fun throwBindError(code: Int): Nothing {
        val message = when (code) {
            P90.ERROR_ALREADY_BOUND ->
                "Xiaomi watch reports it is already bound to another app or Xiaomi account. Unbind it in Mi " +
                    "Fitness, or factory-reset the watch, before pairing it with this app."
            BIND_ERROR_CANCELLED -> "The local bind was cancelled on the watch."
            else -> "Xiaomi watch rejected the local-bind request (p90 error code $code)"
        }
        throw AuthenticationException(message)
    }

    companion object {
        private const val TAG = "XiaomiAuth"

        const val TOKEN_SIZE = 16

        /** `getBindInfo` (protocol §7.1 [V]). */
        private const val CMD_GET_BIND_INFO = 17

        /** `LocalWearBinderV2` steps 3/4 (protocol §7.2 [V]). */
        private const val CMD_LOCAL_BIND_ECDH = 18

        /** `LocalWearBinderV2` steps 9/10 (protocol §7.2 [V]). */
        private const val CMD_LOCAL_BIND_CONFIRM = 19

        /** `LocalWearBinderV2` step 11 (protocol §7.2 [V]). */
        private const val CMD_LOCAL_BIND_RESULT = 25

        /** Device/user cancelled the local bind (protocol §7.2 [V]). */
        private const val BIND_ERROR_CANCELLED = 6

        private const val APP_RANDOM_SIZE = 16

        /** `appIV(4) || 8 zero bytes` (protocol §5.3 [V], confirmed against `authCcm` in `XIAOMI_TEST_VECTORS.json`). */
        private const val DEVICE_INFO_NONCE_PADDING_BYTES = 8

        /** Literal bind-result nonce `10 11 12 13 14 15 16 17 18 19 1A 1B` (protocol §5.3/§7.2 [V]). */
        private val BIND_RESULT_NONCE = byteArrayOf(
            0x10, 0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, 0x1A, 0x1B,
        )

        /** AAD for the bind-result AES-CCM payload (protocol §5.3 [V]). */
        private val BIND_RESULT_AAD = "bind-data".toByteArray(Charsets.UTF_8)

        /**
         * This driver never stores or asks for an out-of-band secret, so `w90.hasOob` is always
         * `false` (protocol §6.1 [V]: "true iff `DeviceInfo.oob` is non-empty").
         * TODO(xiaomi-protocol): if a later milestone adds OOB pairing support, this constant (and
         * the matching TODOs in [authenticateV2]/[localBind]) is where to wire it in.
         */
        private const val HAS_OOB = false

        const val GET_BIND_INFO_TIMEOUT_MS = 10_000L
        const val BIND_REQUEST_TIMEOUT_MS = 10_000L

        /** The watch may wait for a button press before answering (`oobMode == 3`, protocol §7.2/§7.5 [V]). */
        const val OOB_CONFIRM_TIMEOUT_MS = 30_000L

        const val AUTH_REQUEST_TIMEOUT_MS = 10_000L

        /** `WearAuthV1.e()`'s own timeout for `CMD_SEND_USERID` (protocol §6.2 [V]). */
        const val SEND_USERID_TIMEOUT_MS = 15_000L
    }
}
