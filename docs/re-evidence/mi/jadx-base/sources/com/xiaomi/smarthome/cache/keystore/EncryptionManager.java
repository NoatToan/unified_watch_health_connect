package com.xiaomi.smarthome.cache.keystore;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.security.KeyPairGeneratorSpec;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import com.miuipub.internal.hybrid.SignUtils;
import com.xiaomi.digitalkey.wearable.utils.IECDHAlgorithm;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.security.UnrecoverableEntryException;
import java.security.cert.CertificateException;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/* JADX INFO: loaded from: classes4.dex */
public class EncryptionManager {
    private static final String AES_KEY_ALIAS_NAME = "aes_key";
    private static final String BLOCK_MODE_CBC = "CBC";
    private static final String BLOCK_MODE_ECB = "ECB";
    private static final String BLOCK_MODE_GCM = "GCM";
    private static final String DEFAULT_CHARSET = "UTF-8";
    protected static final String DEFAULT_KEY_ALIAS_PREFIX = "sps";
    private static final String ENCRYPTION_PADDING_NONE = "NoPadding";
    private static final String ENCRYPTION_PADDING_PKCS7 = "PKCS7Padding";
    private static final String ENCRYPTION_PADDING_RSA_PKCS1 = "PKCS1Padding";
    private static final String IS_COMPAT_MODE_KEY_ALIAS_NAME = "data_in_compat";
    private static final String KEY_ALGORITHM_AES = "AES";
    private static final String KEY_ALGORITHM_RSA = "RSA";
    private static final String MAC_ALGORITHM_HMAC_SHA256 = "HmacSHA256";
    private static final String MAC_KEY_ALIAS_NAME = "mac_key";
    protected static final String OVERRIDING_KEY_ALIAS_PREFIX_NAME = "OverridingAlias";
    private static final String RSA_KEY_ALIAS_NAME = "rsa_key";
    private final int AES_BIT_LENGTH;
    private final String AES_CIPHER;
    private final String AES_CIPHER_COMPAT;
    protected final String AES_KEY_ALIAS;
    private final String BOUNCY_CASTLE_PROVIDER;
    private final int COMPAT_IV_LENGTH;
    private final String DELIMITER;
    private final int GCM_TAG_LENGTH;
    protected final String IS_COMPAT_MODE_KEY_ALIAS;
    private final int IV_LENGTH;
    private final String KEYSTORE_PROVIDER;
    private final int MAC_BIT_LENGTH;
    private final String MAC_CIPHER;
    protected final String MAC_KEY_ALIAS;
    private final int RSA_BIT_LENGTH;
    private final String RSA_CIPHER;
    private final String RSA_KEY_ALIAS;
    private final byte[] SHIFTING_KEY;
    private final String SSL_PROVIDER;
    private SecretKey aesKey;
    private boolean isCompatMode;
    private Context mContext;
    private String mKeyAliasPrefix;
    ICacheStore mPrefs;
    private KeyStore mStore;
    private SecretKey macKey;
    private RSAPrivateKey privateKey;
    private RSAPublicKey publicKey;

    public class InvalidMacException extends GeneralSecurityException {
        public InvalidMacException() {
            super("Invalid Mac, failed to verify integrity.");
        }
    }

    public EncryptionManager(Context context, ICacheStore iCacheStore) throws NoSuchPaddingException, NoSuchAlgorithmException, IOException, InvalidKeyException, CertificateException, KeyStoreException, NoSuchProviderException, UnrecoverableEntryException, InvalidAlgorithmParameterException {
        this(context, iCacheStore, null, null);
    }

    public static byte[] base64Decode(String str) {
        return Base64.decode(str, 2);
    }

    public static String base64Encode(byte[] bArr) {
        return Base64.encodeToString(bArr, 2);
    }

    public static String getHashed(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        return toHex(MessageDigest.getInstance(PluginPackageConstant.RN_BUNDLE_HASH_ALGORITHM).digest(str.getBytes("UTF-8")));
    }

    public static String toHex(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b2 : bArr) {
            sb.append(String.format("%02X", Byte.valueOf(b2)));
        }
        return sb.toString();
    }

    private byte[] xorWithKey(byte[] bArr, byte[] bArr2) {
        if (bArr2 == null || bArr2.length == 0) {
            return bArr;
        }
        byte[] bArr3 = new byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i % bArr2.length]);
        }
        return bArr3;
    }

    public byte[] RSADecrypt(byte[] bArr) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, IOException, NoSuchProviderException {
        Cipher cipher = Cipher.getInstance(SignUtils.CIPHER_RSA, "AndroidOpenSSL");
        cipher.init(2, this.privateKey);
        CipherInputStream cipherInputStream = new CipherInputStream(new ByteArrayInputStream(bArr), cipher);
        ArrayList arrayList = new ArrayList();
        while (true) {
            int i = cipherInputStream.read();
            if (i == -1) {
                break;
            }
            arrayList.add(Byte.valueOf((byte) i));
        }
        int size = arrayList.size();
        byte[] bArr2 = new byte[size];
        for (int i2 = 0; i2 < size; i2++) {
            bArr2[i2] = ((Byte) arrayList.get(i2)).byteValue();
        }
        cipherInputStream.close();
        return bArr2;
    }

    public byte[] RSAEncrypt(byte[] bArr) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, IOException, KeyStoreException, NoSuchProviderException, UnrecoverableEntryException {
        Cipher cipher = Cipher.getInstance(SignUtils.CIPHER_RSA, "AndroidOpenSSL");
        cipher.init(1, this.publicKey);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        CipherOutputStream cipherOutputStream = new CipherOutputStream(byteArrayOutputStream, cipher);
        cipherOutputStream.write(bArr);
        cipherOutputStream.close();
        return byteArrayOutputStream.toByteArray();
    }

    public byte[] computeMac(byte[] bArr) throws NoSuchAlgorithmException, InvalidKeyException {
        Mac mac = Mac.getInstance(MAC_ALGORITHM_HMAC_SHA256);
        mac.init(this.macKey);
        return mac.doFinal(bArr);
    }

    public EncryptedData decodeEncryptedText(String str) {
        EncryptedData encryptedData = new EncryptedData();
        String[] strArrSplit = str.split("]");
        encryptedData.IV = base64Decode(strArrSplit[0]);
        encryptedData.encryptedData = base64Decode(strArrSplit[1]);
        if (strArrSplit.length > 2) {
            encryptedData.mac = base64Decode(strArrSplit[2]);
        }
        return encryptedData;
    }

    public byte[] decrypt(EncryptedData encryptedData) throws BadPaddingException, InvalidMacException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, IOException, InvalidKeyException, NoSuchProviderException, InvalidAlgorithmParameterException {
        if (encryptedData == null || encryptedData.encryptedData == null) {
            return null;
        }
        return this.isCompatMode ? decryptAESCompat(encryptedData) : decryptAES(encryptedData);
    }

    @TargetApi(19)
    public byte[] decryptAES(EncryptedData encryptedData) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, UnsupportedEncodingException, InvalidAlgorithmParameterException {
        return getCipherAES(encryptedData.IV, false).doFinal(encryptedData.encryptedData);
    }

    public byte[] decryptAESCompat(EncryptedData encryptedData) throws BadPaddingException, InvalidMacException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, UnsupportedEncodingException, NoSuchProviderException, InvalidAlgorithmParameterException {
        if (verifyMac(encryptedData.mac, encryptedData.getDataForMacComputation())) {
            return getCipherAESCompat(encryptedData.IV, false).doFinal(encryptedData.encryptedData);
        }
        throw new InvalidMacException();
    }

    public String encodeEncryptedData(EncryptedData encryptedData) {
        if (encryptedData.mac == null) {
            return base64Encode(encryptedData.IV) + "]" + base64Encode(encryptedData.encryptedData);
        }
        return base64Encode(encryptedData.IV) + "]" + base64Encode(encryptedData.encryptedData) + "]" + base64Encode(encryptedData.mac);
    }

    public EncryptedData encrypt(byte[] bArr) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, IOException, NoSuchProviderException, InvalidAlgorithmParameterException {
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        byte[] iv = getIV();
        return this.isCompatMode ? encryptAESCompat(bArr, iv) : encryptAES(bArr, iv);
    }

    @TargetApi(19)
    public EncryptedData encryptAES(byte[] bArr, byte[] bArr2) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, UnsupportedEncodingException, InvalidAlgorithmParameterException {
        Cipher cipherAES = getCipherAES(bArr2, true);
        EncryptedData encryptedData = new EncryptedData();
        encryptedData.IV = cipherAES.getIV();
        encryptedData.encryptedData = cipherAES.doFinal(bArr);
        return encryptedData;
    }

    public EncryptedData encryptAESCompat(byte[] bArr, byte[] bArr2) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, UnsupportedEncodingException, InvalidAlgorithmParameterException {
        Cipher cipherAESCompat = getCipherAESCompat(bArr2, true);
        EncryptedData encryptedData = new EncryptedData();
        encryptedData.IV = cipherAESCompat.getIV();
        encryptedData.encryptedData = cipherAESCompat.doFinal(bArr);
        encryptedData.mac = computeMac(encryptedData.getDataForMacComputation());
        return encryptedData;
    }

    @TargetApi(23)
    public boolean generateAESKey(byte[] bArr) throws NoSuchAlgorithmException, KeyStoreException, NoSuchProviderException, InvalidAlgorithmParameterException {
        if (this.mStore.containsAlias(this.AES_KEY_ALIAS)) {
            return false;
        }
        KeyGenerator keyGenerator = KeyGenerator.getInstance(KEY_ALGORITHM_AES, IECDHAlgorithm.KEY_STORE);
        KeyGenParameterSpec keyGenParameterSpecBuild = new KeyGenParameterSpec.Builder(this.AES_KEY_ALIAS, 3).setCertificateSubject(new X500Principal("CN = Secured Preference Store, O = Devliving Online")).setCertificateSerialNumber(BigInteger.ONE).setKeySize(256).setBlockModes(BLOCK_MODE_GCM).setEncryptionPaddings(ENCRYPTION_PADDING_NONE).setRandomizedEncryptionRequired(false).build();
        if (bArr == null || bArr.length <= 0) {
            keyGenerator.init(keyGenParameterSpecBuild);
        } else {
            keyGenerator.init(keyGenParameterSpecBuild, new SecureRandom(bArr));
        }
        keyGenerator.generateKey();
        return true;
    }

    public boolean generateFallbackAESKey(ICacheStore iCacheStore, byte[] bArr) throws NoSuchPaddingException, NoSuchAlgorithmException, IOException, InvalidKeyException, KeyStoreException, NoSuchProviderException, UnrecoverableEntryException {
        String hashed = getHashed(this.AES_KEY_ALIAS);
        if (iCacheStore.contains(hashed)) {
            return false;
        }
        KeyGenerator keyGenerator = KeyGenerator.getInstance(KEY_ALGORITHM_AES);
        if (bArr == null || bArr.length <= 0) {
            keyGenerator.init(256);
        } else {
            keyGenerator.init(256, new SecureRandom(bArr));
        }
        boolean zPutString = iCacheStore.putString(hashed, base64Encode(RSAEncrypt(xorWithKey(keyGenerator.generateKey().getEncoded(), this.SHIFTING_KEY))));
        iCacheStore.putBoolean(getHashed(this.IS_COMPAT_MODE_KEY_ALIAS), true);
        return zPutString;
    }

    public boolean generateKey(Context context, byte[] bArr, ICacheStore iCacheStore) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, IOException, KeyStoreException, NoSuchProviderException, InvalidAlgorithmParameterException, UnrecoverableEntryException {
        if (!this.isCompatMode) {
            return generateAESKey(bArr);
        }
        boolean zGenerateRSAKeys = generateRSAKeys(context, bArr);
        loadRSAKeys();
        return generateMacKey(iCacheStore, bArr) || (generateFallbackAESKey(iCacheStore, bArr) || zGenerateRSAKeys);
    }

    public boolean generateMacKey(ICacheStore iCacheStore, byte[] bArr) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, IOException, KeyStoreException, NoSuchProviderException, UnrecoverableEntryException {
        String hashed = getHashed(this.MAC_KEY_ALIAS);
        if (iCacheStore.contains(hashed)) {
            return false;
        }
        byte[] bArr2 = new byte[32];
        ((bArr == null || bArr.length <= 0) ? new SecureRandom() : new SecureRandom(bArr)).nextBytes(bArr2);
        return iCacheStore.putString(hashed, base64Encode(RSAEncrypt(bArr2)));
    }

    public boolean generateRSAKeys(Context context, byte[] bArr) throws NoSuchAlgorithmException, KeyStoreException, NoSuchProviderException, InvalidAlgorithmParameterException {
        if (this.mStore.containsAlias(this.RSA_KEY_ALIAS)) {
            return false;
        }
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA", IECDHAlgorithm.KEY_STORE);
        Calendar calendar = Calendar.getInstance();
        calendar.add(11, -26);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.add(1, 100);
        KeyPairGeneratorSpec keyPairGeneratorSpecBuild = new KeyPairGeneratorSpec.Builder(context).setAlias(this.RSA_KEY_ALIAS).setKeySize(2048).setKeyType("RSA").setSerialNumber(BigInteger.ONE).setSubject(new X500Principal("CN = Secured Preference Store, O = Devliving Online")).setStartDate(calendar.getTime()).setEndDate(calendar2.getTime()).build();
        if (bArr == null || bArr.length <= 0) {
            keyPairGenerator.initialize(keyPairGeneratorSpecBuild);
        } else {
            keyPairGenerator.initialize(keyPairGeneratorSpecBuild, new SecureRandom(bArr));
        }
        keyPairGenerator.generateKeyPair();
        return true;
    }

    @TargetApi(19)
    public Cipher getCipherAES(byte[] bArr, boolean z) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(z ? 1 : 2, this.aesKey, new GCMParameterSpec(128, bArr));
        return cipher;
    }

    public Cipher getCipherAESCompat(byte[] bArr, boolean z) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, InvalidAlgorithmParameterException {
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding", BouncyCastleProvider.PROVIDER_NAME);
        cipher.init(z ? 1 : 2, this.aesKey, new IvParameterSpec(bArr));
        return cipher;
    }

    public SecretKey getFallbackAESKey(ICacheStore iCacheStore) throws NoSuchPaddingException, NoSuchAlgorithmException, IOException, InvalidKeyException, NoSuchProviderException {
        String string = iCacheStore.getString(getHashed(this.AES_KEY_ALIAS), null);
        if (string != null) {
            return new SecretKeySpec(xorWithKey(RSADecrypt(base64Decode(string)), this.SHIFTING_KEY), KEY_ALGORITHM_AES);
        }
        return null;
    }

    public byte[] getIV() throws UnsupportedEncodingException {
        byte[] bArr = !this.isCompatMode ? new byte[12] : new byte[16];
        new SecureRandom().nextBytes(bArr);
        return bArr;
    }

    public SecretKey getMacKey(ICacheStore iCacheStore) throws NoSuchPaddingException, NoSuchAlgorithmException, IOException, InvalidKeyException, NoSuchProviderException {
        String string = iCacheStore.getString(getHashed(this.MAC_KEY_ALIAS), null);
        if (string != null) {
            return new SecretKeySpec(RSADecrypt(base64Decode(string)), MAC_ALGORITHM_HMAC_SHA256);
        }
        return null;
    }

    public List<String> keyAliases() {
        return Arrays.asList(this.AES_KEY_ALIAS, this.RSA_KEY_ALIAS);
    }

    public void loadKey(ICacheStore iCacheStore) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, IOException, KeyStoreException, NoSuchProviderException, UnrecoverableEntryException {
        if (this.isCompatMode) {
            this.aesKey = getFallbackAESKey(iCacheStore);
            this.macKey = getMacKey(iCacheStore);
        } else if (this.mStore.containsAlias(this.AES_KEY_ALIAS)) {
            if (Build.VERSION.SDK_INT >= 28) {
                this.aesKey = (SecretKey) this.mStore.getKey(this.AES_KEY_ALIAS, null);
            } else {
                this.aesKey = ((KeyStore.SecretKeyEntry) this.mStore.getEntry(this.AES_KEY_ALIAS, null)).getSecretKey();
            }
        }
    }

    public void loadKeyStore() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        KeyStore keyStore = KeyStore.getInstance(IECDHAlgorithm.KEY_STORE);
        this.mStore = keyStore;
        keyStore.load(null);
    }

    public void loadRSAKeys() throws NoSuchAlgorithmException, KeyStoreException, UnrecoverableEntryException {
        if (this.mStore.containsAlias(this.RSA_KEY_ALIAS) && this.mStore.entryInstanceOf(this.RSA_KEY_ALIAS, KeyStore.PrivateKeyEntry.class)) {
            KeyStore.PrivateKeyEntry privateKeyEntry = (KeyStore.PrivateKeyEntry) this.mStore.getEntry(this.RSA_KEY_ALIAS, null);
            this.publicKey = (RSAPublicKey) privateKeyEntry.getCertificate().getPublicKey();
            this.privateKey = (RSAPrivateKey) privateKeyEntry.getPrivateKey();
        }
    }

    public void setup(Context context, ICacheStore iCacheStore, byte[] bArr) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, IOException, KeyStoreException, NoSuchProviderException, UnrecoverableEntryException, InvalidAlgorithmParameterException {
        if (generateKey(context, bArr, iCacheStore)) {
            this.mPrefs.putString(getHashed(OVERRIDING_KEY_ALIAS_PREFIX_NAME), this.mKeyAliasPrefix);
        }
        loadKey(iCacheStore);
    }

    public byte[] tryDecrypt(EncryptedData encryptedData) throws BadPaddingException, InvalidMacException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, IOException, KeyStoreException, NoSuchProviderException, InvalidAlgorithmParameterException, UnrecoverableEntryException {
        return decrypt(encryptedData);
    }

    public EncryptedData tryEncrypt(byte[] bArr) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, IOException, InvalidKeyException, KeyStoreException, NoSuchProviderException, InvalidAlgorithmParameterException, UnrecoverableEntryException {
        return encrypt(bArr);
    }

    public boolean verifyMac(byte[] bArr, byte[] bArr2) throws NoSuchAlgorithmException, InvalidKeyException {
        if (bArr == null || bArr2 == null) {
            return false;
        }
        byte[] bArrComputeMac = computeMac(bArr2);
        if (bArrComputeMac.length != bArr.length) {
            return false;
        }
        int i = 0;
        for (int i2 = 0; i2 < bArrComputeMac.length; i2++) {
            i |= bArrComputeMac[i2] ^ bArr[i2];
        }
        return i == 0;
    }

    public EncryptionManager(Context context, ICacheStore iCacheStore, String str, byte[] bArr) throws IllegalStateException, NoSuchPaddingException, NoSuchAlgorithmException, IOException, InvalidKeyException, KeyStoreException, CertificateException, NoSuchProviderException, UnrecoverableEntryException, InvalidAlgorithmParameterException {
        this.RSA_BIT_LENGTH = 2048;
        this.AES_BIT_LENGTH = 256;
        this.MAC_BIT_LENGTH = 256;
        this.GCM_TAG_LENGTH = 128;
        this.COMPAT_IV_LENGTH = 16;
        this.IV_LENGTH = 12;
        this.KEYSTORE_PROVIDER = IECDHAlgorithm.KEY_STORE;
        this.SSL_PROVIDER = "AndroidOpenSSL";
        this.BOUNCY_CASTLE_PROVIDER = BouncyCastleProvider.PROVIDER_NAME;
        this.DELIMITER = "]";
        this.RSA_CIPHER = SignUtils.CIPHER_RSA;
        this.AES_CIPHER = "AES/GCM/NoPadding";
        this.AES_CIPHER_COMPAT = "AES/CBC/PKCS7Padding";
        this.MAC_CIPHER = MAC_ALGORITHM_HMAC_SHA256;
        this.isCompatMode = false;
        this.SHIFTING_KEY = bArr;
        String string = iCacheStore.getString(getHashed(OVERRIDING_KEY_ALIAS_PREFIX_NAME), str);
        string = string == null ? DEFAULT_KEY_ALIAS_PREFIX : string;
        this.mKeyAliasPrefix = string;
        String str2 = String.format("%s_%s", string, IS_COMPAT_MODE_KEY_ALIAS_NAME);
        this.IS_COMPAT_MODE_KEY_ALIAS = str2;
        this.RSA_KEY_ALIAS = String.format("%s_%s", this.mKeyAliasPrefix, RSA_KEY_ALIAS_NAME);
        this.AES_KEY_ALIAS = String.format("%s_%s", this.mKeyAliasPrefix, AES_KEY_ALIAS_NAME);
        this.MAC_KEY_ALIAS = String.format("%s_%s", this.mKeyAliasPrefix, "mac_key");
        this.isCompatMode = iCacheStore.getBoolean(getHashed(str2), false);
        this.mContext = context;
        this.mPrefs = iCacheStore;
        loadKeyStore();
        setup(context, iCacheStore, bArr);
    }

    public static class EncryptedData {
        byte[] IV;
        byte[] encryptedData;
        byte[] mac;

        public EncryptedData() {
            this.IV = null;
            this.encryptedData = null;
            this.mac = null;
        }

        public byte[] getDataForMacComputation() {
            byte[] bArr = this.IV;
            byte[] bArr2 = new byte[bArr.length + this.encryptedData.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            byte[] bArr3 = this.encryptedData;
            System.arraycopy(bArr3, 0, bArr2, this.IV.length, bArr3.length);
            return bArr2;
        }

        public byte[] getEncryptedData() {
            return this.encryptedData;
        }

        public byte[] getIV() {
            return this.IV;
        }

        public byte[] getMac() {
            return this.mac;
        }

        public void setEncryptedData(byte[] bArr) {
            this.encryptedData = bArr;
        }

        public void setIV(byte[] bArr) {
            this.IV = bArr;
        }

        public void setMac(byte[] bArr) {
            this.mac = bArr;
        }

        public EncryptedData(byte[] bArr, byte[] bArr2, byte[] bArr3) {
            this.IV = bArr;
            this.encryptedData = bArr2;
            this.mac = bArr3;
        }
    }

    public String decrypt(String str) throws BadPaddingException, InvalidMacException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, IOException, KeyStoreException, NoSuchProviderException, InvalidAlgorithmParameterException, UnrecoverableEntryException {
        if (str == null || str.length() <= 0) {
            return null;
        }
        byte[] bArrTryDecrypt = tryDecrypt(decodeEncryptedText(str));
        return new String(bArrTryDecrypt, 0, bArrTryDecrypt.length, "UTF-8");
    }

    public String encrypt(String str) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, IOException, KeyStoreException, NoSuchProviderException, InvalidAlgorithmParameterException, UnrecoverableEntryException {
        if (str == null || str.length() <= 0) {
            return null;
        }
        return encodeEncryptedData(tryEncrypt(str.getBytes("UTF-8")));
    }
}
