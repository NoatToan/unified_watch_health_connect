package com.google.crypto.tink.integration.android;

import am.j;
import android.security.keystore.KeyGenParameterSpec;
import com.google.crypto.tink.Aead;
import com.google.crypto.tink.KmsClient;
import com.google.crypto.tink.subtle.Random;
import com.google.crypto.tink.subtle.Validators;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.Arrays;
import java.util.Locale;
import javax.crypto.KeyGenerator;
import vb.h;
import yc.l2;

/* JADX INFO: loaded from: classes2.dex */
public final class AndroidKeystoreKmsClient implements KmsClient {
    public static final String PREFIX = "android-keystore://";
    private static final String TAG = "AndroidKeystoreKmsClient";
    private static final int WAIT_TIME_MILLISECONDS_BEFORE_RETRY = 20;
    private KeyStore keyStore;
    private final String keyUri;

    public static final class Builder {
        KeyStore keyStore;
        String keyUri = null;

        public Builder() {
            this.keyStore = null;
            if (!AndroidKeystoreKmsClient.isAtLeastM()) {
                h.z("need Android Keystore on Android M or newer");
                throw null;
            }
            try {
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                this.keyStore = keyStore;
                keyStore.load(null);
            } catch (IOException | GeneralSecurityException e4) {
                l2.p(e4);
                throw null;
            }
        }

        public AndroidKeystoreKmsClient build() {
            return new AndroidKeystoreKmsClient(this);
        }

        public Builder setKeyStore(KeyStore keyStore) {
            if (keyStore != null) {
                this.keyStore = keyStore;
                return this;
            }
            h.s("val cannot be null");
            return null;
        }

        public Builder setKeyUri(String str) {
            if (str == null || !str.toLowerCase(Locale.US).startsWith(AndroidKeystoreKmsClient.PREFIX)) {
                h.s("val must start with android-keystore://");
                return null;
            }
            this.keyUri = str;
            return this;
        }
    }

    @Deprecated
    public AndroidKeystoreKmsClient(String str) {
        this(new Builder().setKeyUri(str));
    }

    public static void generateNewAeadKey(String str) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException {
        if (new AndroidKeystoreKmsClient().hasKey(str)) {
            h.s(j.m("cannot generate a new key ", str, " because it already exists; please delete it with deleteKey() and try again"));
            return;
        }
        String strValidateKmsKeyUriAndRemovePrefix = Validators.validateKmsKeyUriAndRemovePrefix(PREFIX, str);
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        keyGenerator.init(new KeyGenParameterSpec.Builder(strValidateKmsKeyUriAndRemovePrefix, 3).setKeySize(256).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build());
        keyGenerator.generateKey();
    }

    public static Aead getOrGenerateNewAeadKey(String str) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException {
        AndroidKeystoreKmsClient androidKeystoreKmsClient = new AndroidKeystoreKmsClient();
        if (!androidKeystoreKmsClient.hasKey(str)) {
            StringBuilder sb3 = new StringBuilder("key URI ");
            sb3.append(str);
            sb3.append(" doesn't exist, generating a new one");
            generateNewAeadKey(str);
        }
        return androidKeystoreKmsClient.getAead(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isAtLeastM() {
        return true;
    }

    private static Aead validateAead(Aead aead) throws KeyStoreException {
        byte[] bArrRandBytes = Random.randBytes(10);
        byte[] bArr = new byte[0];
        if (Arrays.equals(bArrRandBytes, aead.decrypt(aead.encrypt(bArrRandBytes, bArr), bArr))) {
            return aead;
        }
        throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
    }

    public synchronized void deleteKey(String str) {
        this.keyStore.deleteEntry(Validators.validateKmsKeyUriAndRemovePrefix(PREFIX, str));
    }

    @Override // com.google.crypto.tink.KmsClient
    public synchronized boolean doesSupport(String str) {
        String str2 = this.keyUri;
        if (str2 == null || !str2.equals(str)) {
            return this.keyUri == null && str.toLowerCase(Locale.US).startsWith(PREFIX);
        }
        return true;
    }

    @Override // com.google.crypto.tink.KmsClient
    public synchronized Aead getAead(String str) {
        try {
            String str2 = this.keyUri;
            if (str2 != null && !str2.equals(str)) {
                throw new GeneralSecurityException("this client is bound to " + this.keyUri + ", cannot load keys bound to " + str);
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return validateAead(new AndroidKeystoreAesGcm(Validators.validateKmsKeyUriAndRemovePrefix(PREFIX, str), this.keyStore));
    }

    public synchronized boolean hasKey(String str) {
        String strValidateKmsKeyUriAndRemovePrefix;
        strValidateKmsKeyUriAndRemovePrefix = Validators.validateKmsKeyUriAndRemovePrefix(PREFIX, str);
        try {
        } catch (NullPointerException unused) {
            try {
                Thread.sleep(20L);
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                this.keyStore = keyStore;
                keyStore.load(null);
            } catch (IOException e4) {
                throw new GeneralSecurityException(e4);
            } catch (InterruptedException unused2) {
            }
            return this.keyStore.containsAlias(strValidateKmsKeyUriAndRemovePrefix);
        }
        return this.keyStore.containsAlias(strValidateKmsKeyUriAndRemovePrefix);
    }

    @Override // com.google.crypto.tink.KmsClient
    public KmsClient withCredentials(String str) {
        return new AndroidKeystoreKmsClient();
    }

    @Override // com.google.crypto.tink.KmsClient
    public KmsClient withDefaultCredentials() {
        return new AndroidKeystoreKmsClient();
    }

    public AndroidKeystoreKmsClient() {
        this(new Builder());
    }

    private AndroidKeystoreKmsClient(Builder builder) {
        this.keyUri = builder.keyUri;
        this.keyStore = builder.keyStore;
    }
}
