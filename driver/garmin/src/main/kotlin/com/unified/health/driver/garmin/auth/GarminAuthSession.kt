package com.unified.health.driver.garmin.auth

import android.util.Log
import com.unified.health.core.ble.driver.AuthenticationException
import com.unified.health.core.ble.driver.CredentialReader
import com.unified.health.core.ble.driver.CredentialWriter
import com.unified.health.core.ble.pairing.PairingCodeRequester
import com.unified.health.core.model.PairingCodeRequest
import com.unified.health.driver.garmin.codec.GfdiAck
import com.unified.health.driver.garmin.codec.GfdiMessage
import com.unified.health.driver.garmin.codec.GfdiStatus
import com.unified.health.driver.garmin.transport.InboundReply
import com.unified.health.driver.garmin.transport.GfdiInboundHandler
import kotlinx.coroutines.CancellationException
import java.security.SecureRandom

/**
 * App-level Garmin Auth state machine (`ss2/c.java` [V]); only used when the watch asks for it
 * (message 5101), i.e. when the OS bond is unavailable. See
 * `docs/analysis/GARMIN_AUTH_CRYPTO_ANALYSIS.md`.
 *
 * The watch drives the exchange: 5101 start → ACK with our algorithm mask → 5103 passkey mode →
 * 5104/5105 STK challenge → 5106 result → 5107 LTK → 5108 session key → 5109 verify → 5111 secure
 * session. All values come from the watch/user; no Garmin secret is involved.
 */
internal class GarminAuthSession(
    private val address: String,
    private val deviceName: String,
    private val request: suspend (messageId: Int, payload: ByteArray) -> GfdiAck,
    private val credentials: CredentialReader,
    private val credentialWriter: CredentialWriter,
    private val pairingCodes: PairingCodeRequester?,
    private val random: SecureRandom = SecureRandom(),
    private val onFailure: (Throwable) -> Unit,
    private val onSecureSession: (GarminAuthCrypto.GarminSecureSession) -> Unit,
) : GfdiInboundHandler {

    enum class State {
        WAITING_START,
        WAITING_PASSKEY,
        DERIVING_STK,
        WAITING_LTK,
        WAITING_SESSION_KEY,
        AUTHENTICATED,
        FAILED,
    }

    @Volatile
    var state: State = State.WAITING_START
        private set

    private var stk: ByteArray? = null
    private var sessionKey: ByteArray? = null
    private var ltkInfo: GarminAuthCrypto.AuthInfo? = null
    private var failureReported = false

    override suspend fun onMessage(message: GfdiMessage): InboundReply = when (message.id) {
        GarminAuthMessages.START -> onStart(message.payload)
        GarminAuthMessages.PASSKEY_MODE -> onPasskeyMode(message.payload)
        GarminAuthMessages.LTK_DISTRIBUTION -> onLtk(message.payload)
        GarminAuthMessages.SESSION_DIVERSIFIER -> onSessionDiversifier(message.payload)
        GarminAuthMessages.SESSION_VERIFY -> onSessionVerify(message.payload)
        GarminAuthMessages.SECURE_SESSION -> onSecureSession(message.payload)
        else -> InboundReply(GfdiStatus.UNKNOWN_OR_NOT_SUPPORTED)
    }

    override fun onLinkClosed() = Unit

    private suspend fun onStart(payload: ByteArray): InboundReply {
        if (state == State.FAILED) return InboundReply(GfdiStatus.NAK)
        val start = try {
            GarminAuthMessages.parseStart(payload)
        } catch (e: IllegalArgumentException) {
            fail("malformed 5101", e)
            return InboundReply(GfdiStatus.LENGTH_ERROR)
        }
        if (start.status != 0 || (start.algorithmMask and XXTEA_BIT) == 0) {
            fail("the watch offered no common auth algorithm (mask=${start.algorithmMask})")
            return InboundReply(data = GarminAuthMessages.startAck(false, start.algorithmMask))
        }
        // We deliberately do not use the stored-LTK fast path (5104 with ediv/rand): its follow-up
        // sequence is not fully verified. Advertising no LTK makes the watch offer 5103, which is.
        state = State.WAITING_PASSKEY
        Log.i(TAG, "Garmin Auth requested by $address; offering XXTEA (mask=${start.algorithmMask})")
        return InboundReply(data = GarminAuthMessages.startAck(false, start.algorithmMask))
    }

    private fun onPasskeyMode(payload: ByteArray): InboundReply {
        if (state == State.FAILED) return InboundReply(GfdiStatus.NAK)
        val mode = try {
            GarminAuthMessages.parsePasskeyMode(payload)
        } catch (e: IllegalArgumentException) {
            fail("malformed 5103", e)
            return InboundReply(GfdiStatus.LENGTH_ERROR)
        }
        if (mode.mode !in 0..2) {
            fail("unsupported passkey mode ${mode.mode}")
            return InboundReply(data = GarminAuthMessages.passkeyAck(mode.mode))
        }
        if (mode.mode == GarminAuthMessages.MODE_OUT_OF_BAND) {
            fail("the watch requested an out-of-band passkey, which this app cannot provide")
            return InboundReply(data = GarminAuthMessages.passkeyAck(mode.mode))
        }
        state = State.DERIVING_STK
        return InboundReply(
            data = GarminAuthMessages.passkeyAck(mode.mode),
            afterAck = { runStkExchange(mode.mode, mode.timeoutSeconds) },
        )
    }

    private suspend fun runStkExchange(mode: Int, timeoutSeconds: Int) {
        try {
            val passkey = when (mode) {
                GarminAuthMessages.MODE_JUST_WORKS -> ByteArray(GarminAuthCrypto.KEY_SIZE)
                GarminAuthMessages.MODE_VISIBLE -> requestPasskey(timeoutSeconds)
                else -> throw AuthenticationException("Unsupported Garmin passkey mode $mode")
            }
            val phoneRandom = ByteArray(GarminAuthCrypto.KEY_SIZE).also(random::nextBytes)
            val confirm = GarminAuthCrypto.confirm(passkey, phoneRandom, address)
            val watchConfirm = requestRandom(GarminAuthMessages.STK_CONFIRM, confirm)
            val watchRandom = requestRandom(GarminAuthMessages.STK_RANDOM, phoneRandom)
            if (!watchConfirm.contentEquals(GarminAuthCrypto.confirm(passkey, watchRandom, address))) {
                throw AuthenticationException("The watch did not confirm the Garmin pairing code")
            }
            stk = GarminAuthCrypto.deriveStk(passkey, phoneRandom, watchRandom)
            val ack = request(GarminAuthMessages.STK_RESULT, GarminAuthMessages.stkResult(true))
            if (ack.status != GfdiStatus.ACK) {
                throw AuthenticationException("The watch rejected the Garmin STK (${GfdiStatus.name(ack.status)})")
            }
            state = State.WAITING_LTK
            Log.i(TAG, "Garmin STK established")
        } catch (e: CancellationException) {
            throw e
        } catch (e: Exception) {
            fail("STK exchange failed", e)
        }
    }

    private suspend fun requestRandom(messageId: Int, payload: ByteArray): ByteArray {
        val ack = request(messageId, payload)
        if (ack.status != GfdiStatus.ACK) {
            throw AuthenticationException("Watch answered $messageId with ${GfdiStatus.name(ack.status)}")
        }
        return GarminAuthMessages.parseRandomResponse(ack.data)
            ?: throw AuthenticationException("Watch sent a malformed $messageId response")
    }

    private suspend fun requestPasskey(timeoutSeconds: Int): ByteArray {
        val requester = pairingCodes
            ?: throw AuthenticationException("The watch shows a pairing code but the app cannot request it")
        val code = requester.requestCode(
            PairingCodeRequest(deviceName = deviceName, address = address, maxLength = PASSKEY_MAX_LENGTH),
        ) ?: throw AuthenticationException("No Garmin pairing code was entered")
        return GarminAuthMessages.passkeyFromCode(code)
            ?: throw AuthenticationException("The Garmin pairing code is not a number")
    }

    private suspend fun onLtk(payload: ByteArray): InboundReply {
        val key = stk ?: return failAck("5107 before the STK was established")
        val info = try {
            GarminAuthMessages.parseLtkDistribution(payload, key)
        } catch (e: Exception) {
            return failAck("malformed 5107", e)
        }
        ltkInfo = info
        credentialWriter.put(CREDENTIAL_KEY, GarminAuthMessages.serialiseAuthInfo(info))
        state = State.WAITING_SESSION_KEY
        Log.i(TAG, "Garmin LTK received and stored")
        return InboundReply(data = byteArrayOf(0))
    }

    private fun onSessionDiversifier(payload: ByteArray): InboundReply {
        val info = ltkInfo ?: return failAck("5108 before the LTK was received")
        val diversifier = try {
            GarminAuthMessages.parseSessionDiversifier(payload)
        } catch (e: IllegalArgumentException) {
            return failAck("malformed 5108", e)
        }
        val localRandom = ByteArray(8).also(random::nextBytes)
        val key = GarminAuthCrypto.deriveSessionKey(info.ltk, diversifier, localRandom)
        sessionKey = key
        Log.i(TAG, "Garmin session key derived")
        return InboundReply(data = GarminAuthMessages.sessionKeyAck(0, localRandom))
    }

    private fun onSessionVerify(payload: ByteArray): InboundReply {
        val key = sessionKey ?: return failAck("5109 before the session key was derived")
        val ok = GarminAuthCrypto.verifySessionKey(key, payload)
        if (!ok) return failAck("the watch failed session-key verification")
        return InboundReply(data = GarminAuthMessages.verifyAck(0))
    }

    private fun onSecureSession(payload: ByteArray): InboundReply {
        val key = sessionKey ?: return failAck("5111 before the session key was derived")
        if (payload.size < 16) return failAck("malformed 5111")
        val opened = try {
            GarminAuthCrypto.openSecureSession(key, payload, random)
        } catch (e: Exception) {
            return failAck("could not open the secure session", e)
        }
        state = State.AUTHENTICATED
        Log.i(TAG, "Garmin app-level auth complete; GFDI frames are now encrypted")
        return InboundReply(
            data = opened.ack,
            afterAck = { onSecureSession(opened.session) },
        )
    }

    private fun failAck(reason: String, cause: Throwable? = null): InboundReply {
        fail(reason, cause)
        return InboundReply(GfdiStatus.NAK)
    }

    private fun fail(reason: String, cause: Throwable? = null) {
        state = State.FAILED
        if (failureReported) return
        failureReported = true
        Log.w(TAG, "Garmin app-level auth failed: $reason", cause)
        onFailure(AuthenticationException("Garmin app-level pairing failed: $reason", cause))
    }

    private companion object {
        const val TAG = "GarminAuth"
        const val XXTEA_BIT = 1
        const val PASSKEY_MAX_LENGTH = 6
        const val CREDENTIAL_KEY = "garmin_auth_info"
    }
}
