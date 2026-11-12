package com.xiaomi.digitalkey.wearable.utils;

import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import java.io.IOException;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.UnrecoverableEntryException;
import java.security.cert.CertificateException;
import java.security.interfaces.ECPublicKey;
import java.util.Calendar;
import javax.crypto.KeyAgreement;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: loaded from: classes7.dex */
public class ECDHAlgorithm32Impl implements IECDHAlgorithm {
    private static final String ENC_KEY_ALIAS = "dev_enc_key";
    private ECPublicKey mDevEncPK;
    private PrivateKey mDevEncSK;

    public ECDHAlgorithm32Impl() throws IOException {
        loadKeystoreKeyPair();
    }

    private void generateKeystoreKeyPair() {
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                Calendar calendar = Calendar.getInstance();
                Calendar calendar2 = Calendar.getInstance();
                calendar.set(2021, 3, 1);
                calendar2.set(2052, 12, 12);
                KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC", IECDHAlgorithm.KEY_STORE);
                keyPairGenerator.initialize(new KeyGenParameterSpec.Builder(ENC_KEY_ALIAS, 64).setKeySize(256).setCertificateNotAfter(calendar2.getTime()).setCertificateNotBefore(calendar.getTime()).setCertificateSubject(new X500Principal("CN=Device Enc key")).setCertificateSerialNumber(BigInteger.ONE).build());
                KeyPair keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
                this.mDevEncPK = (ECPublicKey) keyPairGenerateKeyPair.getPublic();
                this.mDevEncSK = keyPairGenerateKeyPair.getPrivate();
            } catch (InvalidAlgorithmParameterException | NoSuchAlgorithmException | NoSuchProviderException e) {
                e.printStackTrace();
            }
        }
    }

    private void loadKeystoreKeyPair() throws IOException {
        try {
            KeyStore keyStore = KeyStore.getInstance(IECDHAlgorithm.KEY_STORE);
            keyStore.load(null);
            KeyStore.PrivateKeyEntry privateKeyEntry = (KeyStore.PrivateKeyEntry) keyStore.getEntry(ENC_KEY_ALIAS, null);
            if (privateKeyEntry == null) {
                generateKeystoreKeyPair();
            } else {
                this.mDevEncSK = privateKeyEntry.getPrivateKey();
                this.mDevEncPK = (ECPublicKey) privateKeyEntry.getCertificate().getPublicKey();
            }
        } catch (IOException e) {
            e = e;
            e.printStackTrace();
            throw new IOException();
        } catch (KeyStoreException e2) {
            e = e2;
            e.printStackTrace();
            throw new IOException();
        } catch (NoSuchAlgorithmException e3) {
            e = e3;
            e.printStackTrace();
            throw new IOException();
        } catch (UnrecoverableEntryException e4) {
            e = e4;
            e.printStackTrace();
            throw new IOException();
        } catch (CertificateException e5) {
            e = e5;
            e.printStackTrace();
            throw new IOException();
        }
    }

    @Override // com.xiaomi.digitalkey.wearable.utils.IECDHAlgorithm
    public byte[] generateSharedSecret(PublicKey publicKey) throws IOException {
        try {
            KeyAgreement keyAgreement = KeyAgreement.getInstance(IECDHAlgorithm.ALGORITHM_ECDH);
            keyAgreement.init(this.mDevEncSK);
            keyAgreement.doPhase(publicKey, true);
            return keyAgreement.generateSecret();
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            e.printStackTrace();
            throw new IOException("Occur an error for generating shared secret");
        }
    }

    @Override // com.xiaomi.digitalkey.wearable.utils.IECDHAlgorithm
    public ECPublicKey getPublicKey() throws IOException {
        ECPublicKey eCPublicKey = this.mDevEncPK;
        if (eCPublicKey != null) {
            return eCPublicKey;
        }
        loadKeystoreKeyPair();
        return this.mDevEncPK;
    }
}
