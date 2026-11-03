package com.unified.health.core.ble.credentials

import android.content.Context
import android.security.keystore.KeyGenParameterSpec
import android.security.keystore.KeyProperties
import android.util.Base64
import com.unified.health.core.ble.driver.CredentialReader
import com.unified.health.core.ble.driver.CredentialWriter
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.security.KeyStore
import javax.crypto.Cipher
import javax.crypto.KeyGenerator
import javax.crypto.SecretKey
import javax.crypto.spec.GCMParameterSpec
import javax.inject.Inject
import javax.inject.Singleton

/** Per-device secrets (auth keys…) entered by the user. */
interface DeviceCredentialStore {
    suspend fun get(address: String, key: String): ByteArray?
    suspend fun put(address: String, key: String, value: ByteArray)
    suspend fun remove(address: String, key: String)
    suspend fun keys(address: String): Set<String>
    suspend fun clear(address: String)
}

fun DeviceCredentialStore.readerFor(address: String) = CredentialReader { key -> get(address, key) }

fun DeviceCredentialStore.writerFor(address: String) = object : CredentialWriter {
    override suspend fun put(key: String, value: ByteArray) = this@writerFor.put(address, key, value)
    override suspend fun remove(key: String) = this@writerFor.remove(address, key)
}

/**
 * Stores values in SharedPreferences encrypted with AES-GCM under a non-exportable Android
 * Keystore key, so secrets are unreadable from backups or a copied data directory.
 */
@Singleton
internal class KeystoreDeviceCredentialStore @Inject constructor(
    @ApplicationContext context: Context,
) : DeviceCredentialStore {

    private val prefs = context.getSharedPreferences(PREFS, Context.MODE_PRIVATE)

    override suspend fun get(address: String, key: String): ByteArray? = withContext(Dispatchers.IO) {
        val stored = prefs.getString(prefKey(address, key), null) ?: return@withContext null
        runCatching { decrypt(Base64.decode(stored, Base64.NO_WRAP)) }.getOrNull()
    }

    override suspend fun put(address: String, key: String, value: ByteArray) = withContext(Dispatchers.IO) {
        prefs.edit().putString(prefKey(address, key), Base64.encodeToString(encrypt(value), Base64.NO_WRAP)).apply()
    }

    override suspend fun remove(address: String, key: String) = withContext(Dispatchers.IO) {
        prefs.edit().remove(prefKey(address, key)).apply()
    }

    override suspend fun keys(address: String): Set<String> = withContext(Dispatchers.IO) {
        val prefix = prefKey(address, "")
        prefs.all.keys.filter { it.startsWith(prefix) }.map { it.removePrefix(prefix) }.toSet()
    }

    override suspend fun clear(address: String) = withContext(Dispatchers.IO) {
        val prefix = prefKey(address, "")
        prefs.edit().apply { prefs.all.keys.filter { it.startsWith(prefix) }.forEach(::remove) }.apply()
    }

    private fun prefKey(address: String, key: String) = "${address.uppercase()}|$key"

    private fun secretKey(): SecretKey {
        val keyStore = KeyStore.getInstance(ANDROID_KEYSTORE).apply { load(null) }
        (keyStore.getKey(KEY_ALIAS, null) as? SecretKey)?.let { return it }
        return KeyGenerator.getInstance(KeyProperties.KEY_ALGORITHM_AES, ANDROID_KEYSTORE).apply {
            init(
                KeyGenParameterSpec.Builder(KEY_ALIAS, KeyProperties.PURPOSE_ENCRYPT or KeyProperties.PURPOSE_DECRYPT)
                    .setBlockModes(KeyProperties.BLOCK_MODE_GCM)
                    .setEncryptionPaddings(KeyProperties.ENCRYPTION_PADDING_NONE)
                    .setKeySize(256)
                    .build(),
            )
        }.generateKey()
    }

    /** Output: 12-byte IV ‖ ciphertext+tag. */
    private fun encrypt(plain: ByteArray): ByteArray {
        val cipher = Cipher.getInstance(TRANSFORMATION).apply { init(Cipher.ENCRYPT_MODE, secretKey()) }
        return cipher.iv + cipher.doFinal(plain)
    }

    private fun decrypt(blob: ByteArray): ByteArray {
        val cipher = Cipher.getInstance(TRANSFORMATION)
        cipher.init(Cipher.DECRYPT_MODE, secretKey(), GCMParameterSpec(128, blob, 0, IV_SIZE))
        return cipher.doFinal(blob, IV_SIZE, blob.size - IV_SIZE)
    }

    private companion object {
        const val PREFS = "device_credentials"
        const val ANDROID_KEYSTORE = "AndroidKeyStore"
        const val KEY_ALIAS = "unified_health_device_credentials"
        const val TRANSFORMATION = "AES/GCM/NoPadding"
        const val IV_SIZE = 12
    }
}
