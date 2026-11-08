package com.unified.health.driver.zepp

import android.util.Log
import com.unified.health.core.ble.driver.AuthenticationException
import com.unified.health.core.ble.driver.UnsupportedDeviceException
import com.unified.health.core.ble.driver.WearableProtocolException
import com.unified.health.core.ble.gatt.GattCharacteristic
import com.unified.health.core.ble.gatt.GattClient
import com.unified.health.core.ble.protocol.MalformedPayloadException
import com.unified.health.driver.zepp.codec.AuthModule1Codec
import com.unified.health.driver.zepp.codec.B163Ecdh
import com.unified.health.driver.zepp.codec.ChannelCipher
import com.unified.health.driver.zepp.codec.ChannelProtocol
import com.unified.health.driver.zepp.codec.CommandResponse
import com.unified.health.driver.zepp.codec.LegacyAuthCodec
import com.unified.health.driver.zepp.codec.ZeppOsAuthCodec
import com.unified.health.driver.zepp.transport.ChannelTransport
import com.unified.health.driver.zepp.transport.discardBuffered
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.withTimeoutOrNull
import java.util.Random

/**
 * Chooses and runs the authentication for one connection (§4 steps 2-6, `DeviceAuthorizationFactory.java:79-94` [V]):
 * the choice depends on the channel version and, for v2, the BuiltInModule list (§3.4):
 * - channel v1 → no module list is exchanged (`BaseProfile.supportModule()` is v2-only) and the
 *   legacy 0x0009 exchange is always used (`TraditionalDeviceAuthorizationImpl`, §5.5);
 * - channel v2 → module list has 0x82 or 0x80: `encryptEnabled == null` selects module 0x80
 *   session auth (Impl1, no ECDH, `AuthModule1Codec`), otherwise module 0x82 (Impl2, ECDH session
 *   auth, §5.2); a list with neither → legacy auth on characteristic 0x0009;
 * - channel present but an unrecognised version byte → [UnsupportedDeviceException].
 *
 * Session auth is the default. When [authenticate] gets a `confirmBind` callback the driver first
 * writes the (app-generated) key to the watch: legacy `0x01` bind (§5.5), Zepp OS module 0x82
 * local bind (§5.3 step 5) or module 0x80 local bind (`DeviceAuthorizationImpl1`, §3.2) — the
 * channel binds only when the firmware reports `allowLocalBinding`. The cloud-signed bind (§5.1,
 * §5.3 steps 2-4) is never performed: this driver does not contact Huami servers.
 */
internal class ZeppHandshake(
    private val gatt: GattClient,
    private val scope: CoroutineScope,
    private val random: Random,
) {
    /**
     * @param confirmBind when non-null, [authKey] is bound to the watch first and this is invoked
     * once the watch accepted it (before session auth).
     * @return the authenticated channel, or null for a legacy (0x0009) watch without one.
     */
    suspend fun authenticate(authKey: ByteArray, confirmBind: (suspend () -> Unit)? = null): ChannelTransport? {
        val down = gatt.findCharacteristic(ZeppUuids.CHANNEL_DOWN, ZeppUuids.SERVICE_MILI)
            ?: gatt.findCharacteristic(ZeppUuids.CHANNEL_DOWN)
        val up = gatt.findCharacteristic(ZeppUuids.CHANNEL_UP, ZeppUuids.SERVICE_MILI)
            ?: gatt.findCharacteristic(ZeppUuids.CHANNEL_UP)
        if (down != null && up != null) {
            val transport = ChannelTransport(gatt, down, up, scope)
            val version = transport.open()
            Log.i(TAG, "Channel version: $version")
            when {
                version == null -> Log.w(TAG, "No channel version reply; trying legacy auth")
                version.version !in 1..2 -> throw UnsupportedDeviceException("Unknown Zepp channel version ${version.version}")
                version.version == 1 -> {
                    // The vendor never queries BuiltInModule on v1 and `supportModule()` is v2-only
                    // (`BaseProfile.java:486-499`, `BuiltInModule.java:365-368`); v1 always takes the
                    // legacy 0x0009 auth (`DeviceAuthorizationFactory.java:88-94`).
                    transport.use(ChannelProtocol.V1)
                    Log.i(TAG, "Channel v1: no module list; using legacy 0x0009 auth")
                }
                else -> {
                    transport.use(ChannelProtocol.V2)
                    transport.loadModuleList()
                    val hasChannelAuth = transport.supportsModule(ZeppOsAuthCodec.MODULE) || transport.supportsModule(AuthModule1Codec.MODULE)
                    if (hasChannelAuth) {
                        if (version.encryptEnabled == null) {
                            if (confirmBind != null) {
                                bindModule1(transport, authKey)
                                confirmBind()
                            }
                            authenticateModule1(transport, authKey)
                        } else {
                            if (confirmBind != null) {
                                bindZeppOs(transport, authKey)
                                confirmBind()
                            }
                            authenticateZeppOs(transport, authKey)
                        }
                        return transport
                    }
                    Log.i(TAG, "No auth module (0x80/0x82) in the channel's module list; trying legacy auth")
                }
            }
        }
        val legacy = gatt.findCharacteristic(ZeppUuids.LEGACY_AUTH, ZeppUuids.SERVICE_MILI_SECONDARY)
            ?: gatt.findCharacteristic(ZeppUuids.LEGACY_AUTH, ZeppUuids.SERVICE_MILI)
            ?: throw UnsupportedDeviceException("Watch exposes neither a supported channel auth module nor the legacy auth characteristic")
        authenticateLegacy(legacy, authKey, confirmBind)
        return null
    }

    /** §5.3 step 5 (`DeviceAuthorizationImpl2.d`): local bind, only when the firmware allows it. */
    private suspend fun bindZeppOs(transport: ChannelTransport, authKey: ByteArray) {
        val info = try {
            moduleRequest(transport, ZeppOsAuthCodec.getAuthorizationInfo(), ZeppOsAuthCodec.CMD_GET_AUTH_INFO)
        } catch (e: WearableProtocolException) {
            null
        }
        val allowed = info?.takeIf { it.isSuccess }?.let { ZeppOsAuthCodec.parseAllowLocalBinding(it.data) } == true
        if (!allowed) throw AuthenticationException(NEEDS_SERVER_SIGNATURE)
        val result = try {
            moduleRequest(transport, ZeppOsAuthCodec.localBind(authKey), ZeppOsAuthCodec.CMD_LOCAL_BIND, BIND_TIMEOUT_MS)
        } catch (e: WearableProtocolException) {
            throw AuthenticationException(BIND_NO_ANSWER, e)
        }
        if (!result.isSuccess) throw AuthenticationException(bindRefused(result.status))
        Log.i(TAG, "Zepp OS local bind accepted")
    }

    /**
     * Module 0x80 local bind (`DeviceAuthorizationImpl1.c` → `AuthModule.startLocalBinding`, §3.2 [V]):
     * the same `[0x01, apiLevel u16 LE, key]` command as 0x82 with the 0x80 API level, gated by the
     * firmware's `allowLocalBinding` flag.
     */
    private suspend fun bindModule1(transport: ChannelTransport, authKey: ByteArray) {
        val info = try {
            moduleRequest(
                transport, AuthModule1Codec.getAuthorizationInfo(), AuthModule1Codec.CMD_GET_AUTH_INFO,
                module = AuthModule1Codec.MODULE,
            )
        } catch (e: WearableProtocolException) {
            null
        }
        val allowed = info?.takeIf { it.isSuccess }?.let { ZeppOsAuthCodec.parseAllowLocalBinding(it.data) } == true
        if (!allowed) throw AuthenticationException(NEEDS_SERVER_SIGNATURE)
        val result = try {
            moduleRequest(
                transport, AuthModule1Codec.localBind(authKey), AuthModule1Codec.CMD_LOCAL_BIND, BIND_TIMEOUT_MS,
                module = AuthModule1Codec.MODULE,
            )
        } catch (e: WearableProtocolException) {
            throw AuthenticationException(BIND_NO_ANSWER, e)
        }
        if (!result.isSuccess) throw AuthenticationException(bindRefused(result.status))
        Log.i(TAG, "Module 0x80 local bind accepted")
    }

    /** §5.5 (`HMProAuthProfile.java:165-176`): write the new key while the watch is unbound. */
    private suspend fun bindLegacy(characteristic: GattCharacteristic, frames: ReceiveChannel<ByteArray>, authKey: ByteArray) {
        val result = legacyCommand(characteristic, frames, LegacyAuthCodec.bind(authKey), LegacyAuthCodec.CMD_BIND, BIND_TIMEOUT_MS)
            ?: throw AuthenticationException(BIND_NO_ANSWER)
        if (!result.isSuccess) throw AuthenticationException(bindRefused(result.status))
        Log.i(TAG, "Legacy bind accepted")
    }

    private fun bindRefused(status: Int) =
        "The watch did not accept the new key (status $status). Accept the prompt on the watch if it shows one. " +
            "If the watch is still bound to the Zepp app, unbind it there first or paste its existing key instead."

    /** §5.2 steps 1-8 (`DeviceAuthorizationImpl2.a`). */
    private suspend fun authenticateZeppOs(transport: ChannelTransport, authKey: ByteArray) {
        val keyPair = B163Ecdh.generateKeyPair(random)
        val challengeResponse = moduleRequest(transport, ZeppOsAuthCodec.requestAuth(keyPair.publicKey), ZeppOsAuthCodec.CMD_REQUEST_AUTH)
        if (!challengeResponse.isSuccess) {
            throw AuthenticationException("Watch refused the auth request (status ${challengeResponse.status}). Is it still bound to this Zepp account?")
        }
        val challenge = try {
            ZeppOsAuthCodec.parseChallenge(challengeResponse.data)
        } catch (e: MalformedPayloadException) {
            throw WearableProtocolException("Malformed auth challenge: ${e.message}", e)
        }
        val shared = try {
            B163Ecdh.sharedSecret(keyPair.privateKey, challenge.watchPublicKey)
        } catch (e: IllegalArgumentException) {
            throw WearableProtocolException("Watch sent an invalid ECDH public key: ${e.message}", e)
        }
        val sessionKey = ChannelCipher.deriveSessionKey(shared, authKey)
        val result = moduleRequest(
            transport,
            ZeppOsAuthCodec.authorize(authKey, sessionKey, challenge.random),
            ZeppOsAuthCodec.CMD_AUTHORIZE,
        )
        if (!result.isSuccess) {
            throw AuthenticationException(
                "Watch rejected the auth key (status ${result.status}). Re-read the key from your Zepp account; " +
                    "it changes when the watch is reset or re-bound.",
            )
        }
        transport.cipher = ChannelCipher(shared.copyOf(ChannelCipher.SHARED_SECRET_SIZE), authKey)
        Log.i(TAG, "Zepp OS session authenticated")
    }

    /**
     * Module 0x80 session auth (brief TODO-1, `AuthModule.java:401-538` [V]): no ECDH, the random
     * challenge is encrypted directly with the stored auth key.
     */
    private suspend fun authenticateModule1(transport: ChannelTransport, authKey: ByteArray) {
        val randomResponse = moduleRequest(transport, AuthModule1Codec.requestRandom(), AuthModule1Codec.CMD_REQUEST_RANDOM, module = AuthModule1Codec.MODULE)
        if (!randomResponse.isSuccess) {
            throw AuthenticationException("Watch refused the auth challenge (status ${randomResponse.status}). Is it still bound to this Zepp account?")
        }
        val random = try {
            AuthModule1Codec.parseRandom(randomResponse.data)
        } catch (e: MalformedPayloadException) {
            throw WearableProtocolException("Malformed auth challenge: ${e.message}", e)
        }
        val result = moduleRequest(transport, AuthModule1Codec.authorize(authKey, random), AuthModule1Codec.CMD_AUTHORIZE, module = AuthModule1Codec.MODULE)
        if (!result.isSuccess) {
            throw AuthenticationException(
                "Watch rejected the auth key (status ${result.status}). Re-read the key from your Zepp account; " +
                    "it changes when the watch is reset or re-bound.",
            )
        }
        Log.i(TAG, "Module 0x80 session authenticated")
    }

    private suspend fun moduleRequest(
        transport: ChannelTransport,
        payload: ByteArray,
        command: Int,
        timeoutMs: Long = MODULE_RESPONSE_TIMEOUT_MS,
        module: Int = ZeppOsAuthCodec.MODULE,
    ): CommandResponse {
        val answer = transport.request(module, payload, timeoutMs) {
            CommandResponse.parse(it)?.command == command
        }
        return checkNotNull(CommandResponse.parse(answer))
    }

    /** §5.5 (`HMProAuthProfile`): random request, then the AES-encrypted random. */
    private suspend fun authenticateLegacy(characteristic: GattCharacteristic, authKey: ByteArray, confirmBind: (suspend () -> Unit)?) {
        val frames = gatt.subscribe(characteristic)
        if (confirmBind != null) {
            bindLegacy(characteristic, frames, authKey)
            confirmBind()
        }
        val randomResponse = legacyCommand(characteristic, frames, LegacyAuthCodec.requestRandom(), LegacyAuthCodec.CMD_REQUEST_RANDOM)
            ?.takeIf { it.isSuccess }
            ?: legacyCommand(characteristic, frames, LegacyAuthCodec.requestRandomShort(), LegacyAuthCodec.CMD_REQUEST_RANDOM)
            ?: throw WearableProtocolException("Watch did not answer the legacy auth challenge")
        if (!randomResponse.isSuccess) throw AuthenticationException("Watch refused the auth challenge (status ${randomResponse.status})")
        val challenge = randomResponse.data
        if (challenge.size != ZeppOsAuthCodec.RANDOM_SIZE) throw WearableProtocolException("Legacy auth challenge has ${challenge.size} bytes")
        val result = legacyCommand(characteristic, frames, LegacyAuthCodec.sendEncryptedRandom(authKey, challenge), LegacyAuthCodec.CMD_SEND_ENCRYPTED)
            ?: throw WearableProtocolException("Watch did not answer the legacy auth response")
        if (!result.isSuccess) throw AuthenticationException("Watch rejected the auth key (status ${result.status})")
        Log.i(TAG, "Legacy auth succeeded")
    }

    private suspend fun legacyCommand(
        characteristic: GattCharacteristic,
        frames: ReceiveChannel<ByteArray>,
        request: ByteArray,
        command: Int,
        timeoutMs: Long = LEGACY_TIMEOUT_MS,
    ): CommandResponse? {
        frames.discardBuffered()
        gatt.write(characteristic, request)
        return withTimeoutOrNull(timeoutMs) {
            var match: CommandResponse? = null
            while (match == null) match = CommandResponse.parse(frames.receive())?.takeIf { it.command == command }
            match
        }
    }

    companion object {
        private const val TAG = "ZeppHandshake"

        /** `BaseModule.sendCommand` default timeout (15 000 ms) [V]. */
        const val MODULE_RESPONSE_TIMEOUT_MS = 15_000L

        /** Vendor wait for legacy responses was not traced; one round trip with margin [I]. */
        const val LEGACY_TIMEOUT_MS = 10_000L

        /** The watch may wait for a tap on its screen before answering a bind [I]. */
        const val BIND_TIMEOUT_MS = 30_000L

        internal const val NEEDS_SERVER_SIGNATURE =
            "This watch only accepts a first bind signed by the Huami server, and this app never contacts Huami " +
                "servers. Bind the watch once in the Zepp app, then paste its auth key here instead."

        internal const val BIND_NO_ANSWER =
            "The watch did not answer the bind request within 30 s. Put it in pairing mode, confirm on its screen if it asks, and retry."
    }
}
