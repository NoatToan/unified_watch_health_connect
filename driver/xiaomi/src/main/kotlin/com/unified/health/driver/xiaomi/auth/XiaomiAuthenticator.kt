package com.unified.health.driver.xiaomi.auth

import com.unified.health.core.ble.driver.CredentialReader
import com.unified.health.core.ble.driver.CredentialWriter
import com.unified.health.core.model.DeviceCapability
import com.unified.health.driver.xiaomi.transport.XiaomiLink

/**
 * Session authentication and binding for Xiaomi MiWear watches (protocol §6/§7 [V]). Every
 * cryptographic step -- HKDF-SHA256, HMAC-SHA256, AES-CCM, AES-CTR, ECDH-P256, the MiWear token,
 * the local/PSK bind handshakes, `WearAuthV2` message bodies -- is implemented by the crypto/auth
 * agent in `XiaomiAuthenticatorImpl` (M2 in `XIAOMI_IMPLEMENTATION_BRIEF.md`). This interface only
 * fixes the shape so the transport/device layer can be built and tested independently of that work.
 *
 * Transport-agnostic: every method takes the already-[started][XiaomiLink.start] [XiaomiLink] plus
 * [CredentialReader]/[CredentialWriter] for the device's stored secrets; nothing here touches GATT
 * or Android directly.
 */
internal interface XiaomiAuthenticator {

    /**
     * `getBindInfo` (protocol §7.1 [V], `s7r e=1 f=17`): asks the watch which bind mode it offers.
     * A pure protocol probe (no crypto) -- only its result (verify/oob mode, model/SN/MAC/DID)
     * decides between [localBind] and the feature-flagged, not-implemented-here cloud/PSK bind
     * (protocol §7.3/§8.5).
     */
    suspend fun probeBindMode(link: XiaomiLink): XiaomiBindProbe

    /**
     * V2 session auth (protocol §6.1 [V], `WearAuthV2`/`x6r`): nonce exchange, HKDF key schedule
     * and HMAC verification, using the stored `xiaomi.auth_token` read from [credentials]. On
     * success, installs [link]'s `encrypt`/`decrypt` hooks with the derived AES-CTR session keys.
     * @throws com.unified.health.core.ble.driver.MissingCredentialException if the token is not stored.
     * @throws com.unified.health.core.ble.driver.AuthenticationException on a rejected token.
     */
    suspend fun authenticateV2(link: XiaomiLink, credentials: CredentialReader): XiaomiAuthResult

    /**
     * V2 local (no-cloud) bind (protocol §7.2 [V], `LocalWearBinderV2`): ECDH-P256 + HKDF, run only
     * when [probeBindMode] reports [XiaomiBindProbe.verifyMode] `== 2`. Persists the new token/
     * appDeviceId/userId via [credentialWriter] on success.
     */
    suspend fun localBind(link: XiaomiLink, credentialWriter: CredentialWriter): XiaomiAuthResult

    /**
     * V1 (protocol version 0) auth: OS bond + `CMD_SEND_USERID` (protocol §6.2 [V]). Core BLE-bond
     * support does not exist in this app yet, so until then this throws
     * [com.unified.health.core.ble.driver.UnsupportedDeviceException] with an actionable message.
     */
    suspend fun authenticateV1(link: XiaomiLink, credentials: CredentialReader): XiaomiAuthResult
}

/**
 * `ha0` (protocol §7.1 [V]): which bind mode the watch offers. [verifyMode] `1` = PSK/cloud,
 * `2` = local ECDH (the only no-cloud path). [oobMode] `0`/`2`/`3` (`3` = button confirm on the watch).
 */
internal data class XiaomiBindProbe(
    val verifyMode: Int,
    val oobMode: Int?,
    val serialNumber: String?,
    val mac: String?,
    val model: String?,
    val did: String?,
)

/**
 * Outcome of a successful [XiaomiAuthenticator] call.
 * @property token the 16-byte permanent credential, present when auth generated/confirmed one
 *  (always after [XiaomiAuthenticator.localBind]; after [XiaomiAuthenticator.authenticateV2] only
 *  if the token was rotated).
 * @property appDeviceId optional device-binding id some firmwares require (protocol §7.2 [V]).
 * @property deviceCapability / [deviceCapabilityV2] vendor feature-gating bits (protocol §6.1
 *  [V]); not decoded into [capabilities] yet (TODO(xiaomi-protocol): no known mandatory bit was
 *  found during RE -- see protocol §6.1 "Capability handling" -- so this driver currently assumes
 *  every V2 watch supports [DeviceCapability.HISTORY_SYNC] and treats any extra bits as
 *  diagnostics only).
 */
internal data class XiaomiAuthResult(
    val token: ByteArray? = null,
    val appDeviceId: String? = null,
    val deviceCapability: Int? = null,
    val deviceCapabilityV2: Int? = null,
    val capabilities: Set<DeviceCapability> = setOf(DeviceCapability.HISTORY_SYNC),
)
