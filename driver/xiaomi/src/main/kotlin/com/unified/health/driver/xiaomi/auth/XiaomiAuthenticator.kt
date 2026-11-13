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
     * A pure protocol probe (no crypto, beyond the non-secret `MD5(userId)` identity hint) --
     * only its result (verify/oob mode, model/SN/MAC/DID) decides between [localBind] and the
     * feature-flagged, not-implemented-here cloud/PSK bind (protocol §7.3/§8.5).
     *
     * @param userId the app's own locally-generated bind identity (`xiaomi.user_id`); not a
     *  Xiaomi account id.
     * @throws com.unified.health.core.ble.driver.AuthenticationException if the watch reports it
     *  is already bound (protocol §7.1/§7.5 field 3 code `1`) -- see the implementation's KDoc for
     *  why this is a hard failure rather than a probe result.
     */
    suspend fun probeBindMode(link: XiaomiLink, userId: String): XiaomiBindProbe

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
     *
     * @param userId the app's own locally-generated bind identity (`xiaomi.user_id`), sent as
     *  `wa0.userId` in the final bind result.
     * @param appDeviceId sent as `na0.appDeviceId`; the credential the app already generated for
     *  `xiaomi.app_device_id` (protocol §7.2 step 2 says the vendor derives this from an Android
     *  device id, MAC and userId -- "any stable string is probably accepted" [I], so this driver
     *  reuses whatever was already generated for the `APP_DEVICE_ID` credential instead of
     *  reproducing that formula).
     * @throws com.unified.health.core.ble.driver.AuthenticationException if the watch rejects the
     *  ECDH signature, or declines the local bind (e.g. the user did not confirm on the watch).
     */
    suspend fun localBind(
        link: XiaomiLink,
        userId: String,
        appDeviceId: String,
        credentialWriter: CredentialWriter,
    ): XiaomiAuthResult

    /**
     * V1 (protocol version 0) session auth: `CMD_SEND_USERID` (protocol §6.2 [V], `WearAuthV1`).
     * The caller ([com.unified.health.driver.xiaomi.XiaomiDriver.doOpenSession]) must already have
     * created the mandatory OS bond before calling this -- that is a GATT-level, pre-[link]-start
     * step owned by the driver, not this method. No token, no HKDF/AES: traffic stays plaintext
     * after the bond, so a successful call does not install [link]'s `encrypt`/`decrypt` hooks.
     *
     * @param credentials reads `xiaomi.user_id`: the identity this watch must already know (e.g.
     *  imported from a prior Mi Fitness bind). V1 first-time bind (`WearBinderV1`, protocol §7.4)
     *  needs a cloud bind key this app does not fetch (D-1193) and is out of scope here.
     * @throws com.unified.health.core.ble.driver.MissingCredentialException if no user id is stored.
     * @throws com.unified.health.core.ble.driver.AuthenticationException if the watch reports the
     *  identity is not bound (error code 4) or otherwise rejects/does not confirm the request.
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
