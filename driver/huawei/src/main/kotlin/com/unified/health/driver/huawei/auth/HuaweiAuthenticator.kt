package com.unified.health.driver.huawei.auth

import com.unified.health.core.ble.driver.SessionContext
import com.unified.health.driver.huawei.codec.CipherMode
import com.unified.health.driver.huawei.codec.LinkParameters
import com.unified.health.driver.huawei.transport.HuaweiCommandChannel

/**
 * Authentication mechanisms a Huawei watch may demand (HUAWEI_DEVICE_PROTOCOL.md §6.1-6.3).
 * None of them can be implemented by a third party today without vendor secrets:
 * - [LEGACY_HMAC] and the Kn step of [HICHAIN_LITE] need the CAK hidden in Huawei Health's
 *   white-box (`HealthWhiteBoxManager`), which this project must not extract;
 * - [HICHAIN] / [HICHAIN3] run the native OpenHarmony `deviceauth` PAKE (`libhichain_sdk_jni.so`).
 */
internal enum class HuaweiAuthMode(val label: String) {
    /** 0x0113 AccessValidityAuth HMAC challenge-response. [V] `cke.java:44-83`, `ckd.java` */
    LEGACY_HMAC("legacy HMAC"),

    /** PIN shown on the watch + PBKDF2, via 0x0133 / 0x012C / 0x0113 / 0x010E. [V] `cni.java` */
    HICHAIN_LITE("HiChainLite (PIN)"),

    /** Native deviceauth, data relayed through 0x0128. [V] `HiChainClient.java`, `cks.java` */
    HICHAIN("HiChain"),

    /** OpenHarmony deviceauth v3. [V] `cnd.java`, `cmz.java:9` */
    HICHAIN3("HiChain3"),
    ;

    companion object {
        /**
         * Mechanisms the app would try for link parameter TLV 7 ("deviceSupportType"), most preferred
         * first ([V] `cke.java:38-43`, `cnc.java:16-18`, `cni.java:18-20`, `cmz.java:9-11`):
         * 1/3 → HiChain, which the app only uses on Huawei phones (EMUI ≥ 25, `ckx.java:37-45`);
         * elsewhere it falls back to security mode 2 (HiChainLite); 2/8 → HiChainLite;
         * 4 → HiChain3; anything else → legacy HMAC.
         */
        fun candidatesFor(authType: Int): List<HuaweiAuthMode> = when (authType) {
            1, 3 -> listOf(HICHAIN, HICHAIN_LITE)
            2, 8 -> listOf(HICHAIN_LITE)
            4 -> listOf(HICHAIN3)
            else -> listOf(LEGACY_HMAC)
        }
    }
}

/**
 * Key material an authenticator hands back once the watch accepted the phone.
 *
 * @property workKey AES key for the 0x7C/0x7D/0x7E payload envelope (§6.4).
 * @property ivCounterSeed base counter from 0x010F TLV 9, or null/0 for random IVs (see `IvGenerator`).
 * @property cipherMode overrides the link's choice; null keeps [LinkParameters.cipherMode]
 *  (HiChain3 always uses GCM, [V] `cjy.java:193`).
 */
internal class HuaweiSessionKeys(
    workKey: ByteArray,
    val ivCounterSeed: Long? = null,
    val cipherMode: CipherMode? = null,
) {
    val workKey: ByteArray = workKey.copyOf()

    override fun toString(): String = "HuaweiSessionKeys(<redacted ${workKey.size} bytes>, cipherMode=$cipherMode)"
}

/**
 * Strategy for one [HuaweiAuthMode]. Contribute implementations with
 * `@Binds @IntoSet abstract fun bind(impl: MyAuthenticator): HuaweiAuthenticator` in this module's
 * DI; `HuaweiDriver` picks the first one matching [HuaweiAuthMode.candidatesFor] the watch's
 * link parameters. Implementations must not embed vendor secrets: anything user- or
 * device-specific comes from [SessionContext.credentials].
 */
internal interface HuaweiAuthenticator {
    val mode: HuaweiAuthMode

    /**
     * Runs the auth exchange over [channel] (clear-text commands, e.g. 0x0133 / 0x0113 / 0x0128).
     * @throws com.unified.health.core.ble.driver.AuthenticationException when the watch rejects us.
     */
    suspend fun authenticate(channel: HuaweiCommandChannel, link: LinkParameters, context: SessionContext): HuaweiSessionKeys
}

/** Picks the authenticator for a watch, or null when none of the required mechanisms is available. */
internal fun Set<HuaweiAuthenticator>.selectFor(link: LinkParameters): HuaweiAuthenticator? =
    HuaweiAuthMode.candidatesFor(link.authType).firstNotNullOfOrNull { mode -> firstOrNull { it.mode == mode } }
