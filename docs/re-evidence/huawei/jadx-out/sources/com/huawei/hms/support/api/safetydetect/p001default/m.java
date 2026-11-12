package com.huawei.hms.support.api.safetydetect.p001default;

import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.ProviderException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/* JADX INFO: loaded from: classes34.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f16563a = "m";

    public static byte[] b(String str, String str2, byte[] bArr) {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            Key key = keyStore.getKey(str, null);
            if (key == null) {
                key = a(str);
            }
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(1, key, new GCMParameterSpec(128, d.a(str2)));
            return cipher.doFinal(bArr);
        } catch (s | IOException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableKeyException | CertificateException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
            Log.e(f16563a, "Android key store aes encrypt error. " + e.getMessage());
            return new byte[0];
        }
    }

    public static byte[] a(String str, String str2, byte[] bArr) {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            Key key = keyStore.getKey(str, null);
            if (key == null) {
                return new byte[0];
            }
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(2, key, new GCMParameterSpec(128, d.a(str2)));
            return cipher.doFinal(bArr);
        } catch (IOException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableKeyException | CertificateException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
            Log.e(f16563a, "Android key store aes decrypt error. " + e.getMessage());
            return new byte[0];
        }
    }

    private static Key a(String str) {
        SecretKey secretKeyGenerateKey;
        synchronized (m.class) {
            try {
                Log.i(f16563a, "Generate aes key.");
                KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                keyGenerator.init(new KeyGenParameterSpec.Builder(str, 3).setDigests("SHA-256", "SHA-384", "SHA-512").setKeySize(256).setRandomizedEncryptionRequired(false).setBlockModes("GCM").setEncryptionPaddings("NoPadding", "PKCS7Padding").build());
                secretKeyGenerateKey = keyGenerator.generateKey();
            } catch (InvalidAlgorithmParameterException | NoSuchAlgorithmException | NoSuchProviderException | ProviderException e) {
                Log.e(f16563a, "Android key store encrypt device token sk failed " + e.getMessage());
                throw new s("Generate aes key error. " + e.getMessage());
            }
        }
        return secretKeyGenerateKey;
    }
}
