package ohos.security.deviceauth.sdk.utils;

import android.security.keystore.KeyGenParameterSpec;
import defpackage.zua;
import defpackage.zud;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/* JADX INFO: loaded from: classes46.dex */
public class KeyStoreHelper {
    private static final String AES_GCM_NOPADDING = "AES/GCM/NoPadding";
    private static final String ANDROID_KEYSTORE_PROVIDER = "AndroidKeyStore";
    private static final int DEFAULT_IV_SIZE = 12;
    private static final int DEFAULT_KEY_SIZE = 256;
    private static final int DEFAULT_TAG_SIZE = 128;
    private static final byte EMPTY_BYTE = 0;
    private static final String SUFFIX = "_for_hichain";
    private static final String TAG = "KeyStoreHelper";

    private KeyStoreHelper() {
    }

    private static SecretKey generateKey() {
        SecretKey secretKeyLoadAppSecretKey = loadAppSecretKey();
        if (secretKeyLoadAppSecretKey != null) {
            zud.b(TAG, "Master key is already generated");
            return secretKeyLoadAppSecretKey;
        }
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", ANDROID_KEYSTORE_PROVIDER);
            keyGenerator.init(new KeyGenParameterSpec.Builder(zua.d() + SUFFIX, 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(256).build());
            return keyGenerator.generateKey();
        } catch (InvalidAlgorithmParameterException | NoSuchAlgorithmException | NoSuchProviderException unused) {
            zud.d(TAG, "Error happens in generating key.");
            return secretKeyLoadAppSecretKey;
        }
    }

    public static byte[] encrypt(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            zud.d(TAG, "Invalid input data.");
            return new byte[0];
        }
        SecretKey secretKeyGenerateKey = generateKey();
        if (secretKeyGenerateKey == null) {
            zud.b(TAG, "Secret key is null.");
            return new byte[0];
        }
        try {
            Cipher cipher = Cipher.getInstance(AES_GCM_NOPADDING);
            cipher.init(1, secretKeyGenerateKey);
            byte[] bArrDoFinal = cipher.doFinal(bArr);
            byte[] iv = cipher.getIV();
            if (bArrDoFinal != null && bArrDoFinal.length != 0 && iv != null && iv.length != 0) {
                byte[] bArr2 = new byte[bArrDoFinal.length + iv.length];
                System.arraycopy(iv, 0, bArr2, 0, iv.length);
                System.arraycopy(bArrDoFinal, 0, bArr2, iv.length, bArrDoFinal.length);
                Arrays.fill(bArrDoFinal, (byte) 0);
                Arrays.fill(iv, (byte) 0);
                return bArr2;
            }
            zud.d(TAG, "Encrypt failed.");
            return new byte[0];
        } catch (InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException unused) {
            zud.d(TAG, "Error happens in encryption.");
            return new byte[0];
        }
    }

    public static byte[] decrypt(byte[] bArr) {
        if (bArr == null || bArr.length < 12) {
            zud.d(TAG, "Invalid cipher.");
            return new byte[0];
        }
        SecretKey secretKeyLoadAppSecretKey = loadAppSecretKey();
        if (secretKeyLoadAppSecretKey == null) {
            zud.b(TAG, "secKey = null");
            return new byte[0];
        }
        try {
            Cipher cipher = Cipher.getInstance(AES_GCM_NOPADDING);
            byte[] bArr2 = new byte[12];
            System.arraycopy(bArr, 0, bArr2, 0, 12);
            cipher.init(2, secretKeyLoadAppSecretKey, new GCMParameterSpec(128, bArr2));
            int length = bArr.length - 12;
            byte[] bArr3 = new byte[length];
            System.arraycopy(bArr, 12, bArr3, 0, length);
            byte[] bArrDoFinal = cipher.doFinal(bArr3);
            if (bArrDoFinal != null && bArrDoFinal.length != 0) {
                Arrays.fill(bArr3, (byte) 0);
                Arrays.fill(bArr2, (byte) 0);
                return bArrDoFinal;
            }
            zud.b(TAG, "Decrypt failed.");
            return new byte[0];
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException unused) {
            zud.d(TAG, "Error happens in decrypting.");
            return new byte[0];
        }
    }

    private static SecretKey loadAppSecretKey() {
        try {
            KeyStore keyStore = KeyStore.getInstance(ANDROID_KEYSTORE_PROVIDER);
            keyStore.load(null);
            Key key = keyStore.getKey(zua.d() + SUFFIX, null);
            if (key instanceof SecretKey) {
                return (SecretKey) key;
            }
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableKeyException | CertificateException unused) {
            zud.d(TAG, "Load app secret key failed");
        }
        return null;
    }
}
