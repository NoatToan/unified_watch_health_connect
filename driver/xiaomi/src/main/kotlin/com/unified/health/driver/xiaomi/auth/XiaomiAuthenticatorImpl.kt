package com.unified.health.driver.xiaomi.auth

import com.unified.health.core.ble.driver.CredentialReader
import com.unified.health.core.ble.driver.CredentialWriter
import com.unified.health.core.ble.driver.UnsupportedDeviceException
import com.unified.health.driver.xiaomi.transport.XiaomiLink
import javax.inject.Inject

/**
 * No cryptography lives in this module (`transport/Crc16Arc.kt` is a checksum, not a cipher).
 * Every method here is a placeholder for the crypto/auth agent (M2 in
 * `XIAOMI_IMPLEMENTATION_BRIEF.md`): HKDF-SHA256, HMAC-SHA256, AES-CCM, AES-CTR, ECDH-P256, the
 * MiWear token, the local/PSK bind handshakes and the `WearAuthV2` message bodies (`w90`/`ca0`/
 * `t90`/`z90`, plus the bind messages `sb0`/`ha0`/`na0`/`ta0`/`ka0`/`qa0`/`pb0`/`wa0`/`cc0`) all
 * belong there, built on `proto/P90.kt`, `Q90.kt`, `T7r.kt`, `S7r.kt` and `transport/XiaomiLink.kt`
 * (protocol §5/§6/§7 [V]).
 *
 * [authenticateV1] is the one exception: it is not a TODO because its blocker is not "not yet
 * implemented" but "the core BLE layer has no OS-bond support", so it throws
 * [UnsupportedDeviceException] directly with an actionable message.
 */
internal class XiaomiAuthenticatorImpl @Inject constructor() : XiaomiAuthenticator {

    override suspend fun probeBindMode(link: XiaomiLink): XiaomiBindProbe =
        TODO("M2: implemented by the crypto/auth agent (protocol §7.1, s7r e=1 f=17 getBindInfo / sb0 / ha0)")

    override suspend fun authenticateV2(link: XiaomiLink, credentials: CredentialReader): XiaomiAuthResult =
        TODO("M2: implemented by the crypto/auth agent (protocol §6.1, WearAuthV2: HKDF-SHA256 + HMAC-SHA256 nonce handshake)")

    override suspend fun localBind(link: XiaomiLink, credentialWriter: CredentialWriter): XiaomiAuthResult =
        TODO("M2: implemented by the crypto/auth agent (protocol §7.2, LocalWearBinderV2: ECDH-P256 + HKDF-SHA256 + AES-CCM)")

    override suspend fun authenticateV1(link: XiaomiLink, credentials: CredentialReader): XiaomiAuthResult {
        throw UnsupportedDeviceException(
            "This watch uses the legacy MiWear V1 protocol, which needs an OS-level Bluetooth bond. " +
                "Unified Health's BLE layer does not support creating that bond yet, so V1 devices " +
                "(some Mi Band 8 units, Redmi Watch 2 Lite, Xiaomi Watch S1 Active) cannot be added yet. " +
                "MiWear V2 devices (Xiaomi Smart Band 8/9/10, Redmi Watch 3/4/5, Xiaomi Watch S1/S2/S3/S4 " +
                "non-Wear-OS) are fully supported.",
        )
    }
}
