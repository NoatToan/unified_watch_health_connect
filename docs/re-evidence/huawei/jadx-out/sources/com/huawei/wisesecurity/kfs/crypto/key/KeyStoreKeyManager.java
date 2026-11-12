package com.huawei.wisesecurity.kfs.crypto.key;

import android.util.Log;
import com.huawei.wisesecurity.kfs.crypto.cipher.KfsCipher;
import com.huawei.wisesecurity.kfs.crypto.signer.KfsSigner;
import defpackage.ynn;
import defpackage.yny;
import defpackage.yoa;
import defpackage.yob;
import defpackage.yoe;
import defpackage.yoj;
import defpackage.yol;
import java.io.IOException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes20.dex */
public abstract class KeyStoreKeyManager implements KfsKeyManager {
    private static final String TAG = "KeyStoreKeyManager";
    private KeyStore mKeyStore;
    private final KeyStoreProvider provider;

    protected abstract void generateKey(ynn ynnVar) throws yob;

    protected abstract void validateKey(ynn ynnVar) throws yob;

    protected abstract void validateParam(ynn ynnVar) throws yny;

    public KeyStoreKeyManager(KeyStoreProvider keyStoreProvider) {
        this.provider = keyStoreProvider;
    }

    public KeyStoreKeyManager() {
        this(KeyStoreProvider.ANDROID_KEYSTORE);
    }

    protected void initKeyStore() throws yob {
        if (this.mKeyStore != null) {
            return;
        }
        if (getProvider() == KeyStoreProvider.HUAWEI_KEYSTORE) {
            yoe.a();
        }
        try {
            KeyStore keyStore = KeyStore.getInstance(this.provider.getName());
            this.mKeyStore = keyStore;
            keyStore.load(null);
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e) {
            throw new yob("init keystore failed, " + e.getMessage());
        }
    }

    private void clearKey(String str) throws yob {
        if (hasAlias(str)) {
            try {
                this.mKeyStore.deleteEntry(str);
                Log.i(TAG, "keyEntry: " + str + " removed");
            } catch (KeyStoreException e) {
                throw new yob("delete key entry failed, " + e.getMessage());
            }
        }
    }

    @Override // com.huawei.wisesecurity.kfs.crypto.key.KfsKeyManager
    public void generate(ynn ynnVar) throws yob {
        yoj.d(ynnVar);
        validateParam(ynnVar);
        generateKey(ynnVar);
        try {
            validateKey(ynnVar);
        } catch (yob e) {
            Log.i(TAG, "validate key failed, try to remove the key entry for alias:" + ynnVar.c());
            clearKey(ynnVar.c());
            throw e;
        }
    }

    @Override // com.huawei.wisesecurity.kfs.crypto.key.KfsKeyManager
    public Key getKey(String str) throws yob {
        initKeyStore();
        try {
            return this.mKeyStore.getKey(str, null);
        } catch (KeyStoreException | NoSuchAlgorithmException | UnrecoverableKeyException e) {
            throw new yob("keystore get key failed, " + e.getMessage());
        }
    }

    @Override // com.huawei.wisesecurity.kfs.crypto.key.KfsKeyManager
    public boolean hasAlias(String str) throws yob {
        initKeyStore();
        try {
            return this.mKeyStore.containsAlias(str);
        } catch (KeyStoreException e) {
            throw new yob("keystore check alias failed, " + e.getMessage());
        }
    }

    @Override // com.huawei.wisesecurity.kfs.crypto.key.KfsKeyManager
    public PrivateKey getPrivateKey(String str) throws yob {
        initKeyStore();
        try {
            return (PrivateKey) this.mKeyStore.getKey(str, null);
        } catch (KeyStoreException | NoSuchAlgorithmException | UnrecoverableKeyException e) {
            throw new yob("keystore get private key failed, " + e.getMessage());
        }
    }

    @Override // com.huawei.wisesecurity.kfs.crypto.key.KfsKeyManager
    public PublicKey getPublicKey(String str) throws yob {
        initKeyStore();
        try {
            return this.mKeyStore.getCertificate(str).getPublicKey();
        } catch (KeyStoreException e) {
            throw new yob("keystore get public key failed, " + e.getMessage());
        }
    }

    @Override // com.huawei.wisesecurity.kfs.crypto.key.KfsKeyManager
    public Certificate[] getCertificateChain(String str) throws yob {
        initKeyStore();
        try {
            return this.mKeyStore.getCertificateChain(str);
        } catch (KeyStoreException e) {
            throw new yob("keystore get certificate chain failed, " + e.getMessage());
        }
    }

    protected void validateSign(KfsSigner kfsSigner) throws yob {
        byte[] bArrB = yol.b(32);
        if (!kfsSigner.getVerifyHandler().fromData(bArrB).verify(kfsSigner.getSignHandler().from(bArrB).sign())) {
            throw new yoa("validate sign key get bad result");
        }
    }

    protected void validateCrypto(KfsCipher kfsCipher) throws yob {
        byte[] bArrB = yol.b(32);
        if (!Arrays.equals(bArrB, kfsCipher.getDecryptHandler().from(kfsCipher.getEncryptHandler().from(bArrB).to()).to())) {
            throw new yoa("validate crypto key get bad result");
        }
    }

    public KeyStoreProvider getProvider() {
        return this.provider;
    }
}
