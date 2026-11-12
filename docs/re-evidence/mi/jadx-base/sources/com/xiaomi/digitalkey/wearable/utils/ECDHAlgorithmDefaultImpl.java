package com.xiaomi.digitalkey.wearable.utils;

import android.content.Context;
import android.security.keystore.KeyGenParameterSpec;
import android.util.AtomicFile;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyAgreement;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.security.auth.x500.X500Principal;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class ECDHAlgorithmDefaultImpl implements IECDHAlgorithm {
    private static final String AES_KEY_ALIAS = "dev_aes_key";
    private static final String ELLIPTIC_CURVE_TYPE = "secp256r1";
    private static final String KEY_PAIR_FILE_NAME = "device.json";
    private static final String KEY_PRIVATE = "s";
    private static final String KEY_PUBLIC = "p";
    private static final String TRANSFORMATION_AES_GCM = "AES/GCM/NoPadding";
    private ECPublicKey mDevEncPK;
    private PrivateKey mDevEncSK;

    public ECDHAlgorithmDefaultImpl() throws IOException {
        loadKeyStoreKeyPair();
    }

    private void createAESSecretKey() throws IOException {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", IECDHAlgorithm.KEY_STORE);
            keyGenerator.init(new KeyGenParameterSpec.Builder(AES_KEY_ALIAS, 3).setCertificateSubject(new X500Principal("CN = Secured Preference Store, O = Delivering Online")).setCertificateSerialNumber(BigInteger.ONE).setKeySize(128).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build());
            keyGenerator.generateKey();
        } catch (InvalidAlgorithmParameterException | NoSuchAlgorithmException | NoSuchProviderException e) {
            e.printStackTrace();
            throw new IOException("Occur an error for creating aes secret key");
        }
    }

    private void generateDeviceKeyPair() throws IOException {
        try {
            ECGenParameterSpec eCGenParameterSpec = new ECGenParameterSpec(ELLIPTIC_CURVE_TYPE);
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC");
            keyPairGenerator.initialize(eCGenParameterSpec);
            KeyPair keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
            ECPublicKey eCPublicKey = (ECPublicKey) keyPairGenerateKeyPair.getPublic();
            byte[] byteArray = ((ECPrivateKey) keyPairGenerateKeyPair.getPrivate()).getS().toByteArray();
            if (byteArray.length > 32) {
                byteArray = ByteUtils.clone(byteArray, 1);
            }
            byte[] eCPKHex = CryptoUtil.getECPKHex(eCPublicKey);
            byte[] bArrEncryptKeyByAES = encryptKeyByAES(byteArray);
            byte[] bArrEncryptKeyByAES2 = encryptKeyByAES(eCPKHex);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(KEY_PRIVATE, ByteUtils.toHexString(bArrEncryptKeyByAES));
            jSONObject.put("p", ByteUtils.toHexString(bArrEncryptKeyByAES2));
            Context context = EnvironmentConfig.getContext();
            if (context == null) {
                throw new IOException();
            }
            AtomicFile atomicFile = new AtomicFile(new File(context.getApplicationInfo().dataDir, KEY_PAIR_FILE_NAME));
            FileOutputStream fileOutputStreamStartWrite = atomicFile.startWrite();
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStreamStartWrite, StandardCharsets.UTF_8);
            outputStreamWriter.write(jSONObject.toString());
            outputStreamWriter.flush();
            atomicFile.finishWrite(fileOutputStreamStartWrite);
        } catch (InvalidAlgorithmParameterException e) {
            e = e;
            e.printStackTrace();
            throw new IOException();
        } catch (NoSuchAlgorithmException e2) {
            e = e2;
            e.printStackTrace();
            throw new IOException();
        } catch (JSONException e3) {
            e = e3;
            e.printStackTrace();
            throw new IOException();
        }
    }

    private PrivateKey generatePrivate(String str) {
        BigInteger bigInteger = new BigInteger(1, ByteUtils.fromHexString(str));
        try {
            AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance("EC");
            algorithmParameters.init(new ECGenParameterSpec(ELLIPTIC_CURVE_TYPE));
            return KeyFactory.getInstance("EC").generatePrivate(new ECPrivateKeySpec(bigInteger, (ECParameterSpec) algorithmParameters.getParameterSpec(ECParameterSpec.class)));
        } catch (NoSuchAlgorithmException | InvalidKeySpecException | InvalidParameterSpecException e) {
            e.printStackTrace();
            return null;
        }
    }

    private void loadKeyStoreKeyPair() throws IOException {
        Context context = EnvironmentConfig.getContext();
        if (context == null) {
            throw new IOException();
        }
        AtomicFile atomicFile = new AtomicFile(new File(context.getApplicationInfo().dataDir, KEY_PAIR_FILE_NAME));
        if (!atomicFile.getBaseFile().exists()) {
            generateDeviceKeyPair();
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(atomicFile.openRead(), StandardCharsets.UTF_8));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    JSONObject jSONObject = new JSONObject(sb.toString());
                    this.mDevEncSK = generatePrivate(ByteUtils.toHexString(decryptKey(ByteUtils.fromHexString(jSONObject.optString(KEY_PRIVATE)))));
                    this.mDevEncPK = (ECPublicKey) CryptoUtil.getPkFromHex(decryptKey(ByteUtils.fromHexString(jSONObject.optString("p"))));
                    return;
                }
                sb.append(line);
            }
        } catch (JSONException unused) {
            throw new IOException();
        }
    }

    public byte[] decryptKey(byte[] bArr) {
        try {
            KeyStore keyStore = KeyStore.getInstance(IECDHAlgorithm.KEY_STORE);
            keyStore.load(null);
            SecretKey secretKey = (SecretKey) keyStore.getKey(AES_KEY_ALIAS, null);
            if (secretKey != null && bArr != null && bArr.length >= 12) {
                byte[] bArrClone = ByteUtils.clone(bArr, bArr.length - 12, 12);
                byte[] bArrClone2 = ByteUtils.clone(bArr, 0, bArr.length - 12);
                GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArrClone);
                Cipher cipher = Cipher.getInstance(TRANSFORMATION_AES_GCM);
                cipher.init(2, secretKey, gCMParameterSpec);
                return cipher.doFinal(bArrClone2);
            }
            return null;
        } catch (IOException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableKeyException | CertificateException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
            e.printStackTrace();
            return null;
        }
    }

    public byte[] encryptKeyByAES(byte[] bArr) throws IOException {
        try {
            KeyStore keyStore = KeyStore.getInstance(IECDHAlgorithm.KEY_STORE);
            keyStore.load(null);
            SecretKey secretKey = (SecretKey) keyStore.getKey(AES_KEY_ALIAS, null);
            if (secretKey == null) {
                createAESSecretKey();
                secretKey = (SecretKey) keyStore.getKey(AES_KEY_ALIAS, null);
            }
            Cipher cipher = Cipher.getInstance(TRANSFORMATION_AES_GCM);
            cipher.init(1, secretKey);
            return ByteUtils.concatenate(cipher.doFinal(bArr), cipher.getIV());
        } catch (InvalidKeyException e) {
            e = e;
            e.printStackTrace();
            throw new IOException("Encrypt value by AES");
        } catch (KeyStoreException e2) {
            e = e2;
            e.printStackTrace();
            throw new IOException("Encrypt value by AES");
        } catch (NoSuchAlgorithmException e3) {
            e = e3;
            e.printStackTrace();
            throw new IOException("Encrypt value by AES");
        } catch (UnrecoverableKeyException e4) {
            e = e4;
            e.printStackTrace();
            throw new IOException("Encrypt value by AES");
        } catch (CertificateException e5) {
            e = e5;
            e.printStackTrace();
            throw new IOException("Encrypt value by AES");
        } catch (BadPaddingException e6) {
            e = e6;
            e.printStackTrace();
            throw new IOException("Encrypt value by AES");
        } catch (IllegalBlockSizeException e7) {
            e = e7;
            e.printStackTrace();
            throw new IOException("Encrypt value by AES");
        } catch (NoSuchPaddingException e8) {
            e = e8;
            e.printStackTrace();
            throw new IOException("Encrypt value by AES");
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
        loadKeyStoreKeyPair();
        return this.mDevEncPK;
    }
}
