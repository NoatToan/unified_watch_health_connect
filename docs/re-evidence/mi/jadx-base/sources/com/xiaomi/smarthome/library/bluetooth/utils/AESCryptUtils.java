package com.xiaomi.smarthome.library.bluetooth.utils;

import android.text.TextUtils;
import android.util.Base64;
import com.xiaomi.smarthome.core.server.internal.plugin.util.ByteUtils;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes2.dex */
public final class AESCryptUtils {
    private static final String AES_MODE = "AES/CBC/PKCS7Padding";
    private static final String CHARSET = "UTF-8";
    private static final String HASH_ALGORITHM = "SHA-256";
    private static final String TAG = "AESCrypt";
    private static final byte[] ivBytes = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    private static final String ENCRYPT_KEY = getHashStrBySHA256("miotsdk").substring(0, 16);

    public static String decrypt(String str, String str2) throws Exception {
        return new String(decrypt(generateKey(str), ivBytes, Base64.decode(str2, 2)), "UTF-8");
    }

    public static String encrypt(String str, String str2) throws Exception {
        return Base64.encodeToString(encrypt(generateKey(str), ivBytes, str2.getBytes("UTF-8")), 2);
    }

    private static SecretKeySpec generateKey(String str) throws Exception {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = str.getBytes("UTF-8");
        messageDigest.update(bytes, 0, bytes.length);
        return new SecretKeySpec(messageDigest.digest(), "AES");
    }

    public static String getAESEncryptMacDid(String str) {
        byte[] bArrDoFinal;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[16]);
            SecretKeySpec secretKeySpec = new SecretKeySpec(ENCRYPT_KEY.getBytes(), "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(1, secretKeySpec, ivParameterSpec);
            bArrDoFinal = cipher.doFinal(str.getBytes("utf-8"));
        } catch (Exception e) {
            e.printStackTrace();
            bArrDoFinal = null;
        }
        return bArrDoFinal != null ? ByteUtils.toHexString(bArrDoFinal) : "";
    }

    public static String getAESEncryptString(String str, String str2) {
        byte[] bArrDoFinal;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[16]);
                SecretKeySpec secretKeySpec = new SecretKeySpec(getHashStrBySHA256(str2).substring(0, 16).getBytes(), "AES");
                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
                cipher.init(1, secretKeySpec, ivParameterSpec);
                bArrDoFinal = cipher.doFinal(str.getBytes("utf-8"));
            } catch (Exception e) {
                e.printStackTrace();
                bArrDoFinal = null;
            }
            if (bArrDoFinal != null) {
                return ByteUtils.toHexString(bArrDoFinal);
            }
        }
        return "";
    }

    public static String getHashStrBySHA256(Object obj) {
        String strValueOf = String.valueOf(obj);
        if (!TextUtils.isEmpty(strValueOf) && !TextUtils.equals(strValueOf, "0") && !TextUtils.equals(strValueOf, AbstractJsonLexerKt.NULL)) {
            try {
                String hexString = ByteUtils.toHexString(MessageDigest.getInstance("SHA-256").digest(strValueOf.getBytes()));
                return hexString.substring(2, hexString.length() - 2);
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return "";
    }

    private static byte[] encrypt(SecretKeySpec secretKeySpec, byte[] bArr, byte[] bArr2) throws Exception {
        Cipher cipher = Cipher.getInstance(AES_MODE);
        cipher.init(1, secretKeySpec, new IvParameterSpec(bArr));
        return cipher.doFinal(bArr2);
    }

    public static String decrypt(byte[] bArr, byte[] bArr2) throws Exception {
        return new String(decrypt(new SecretKeySpec(bArr, "AES"), ivBytes, bArr2), "UTF-8");
    }

    private static byte[] decrypt(SecretKeySpec secretKeySpec, byte[] bArr, byte[] bArr2) throws Exception {
        Cipher cipher = Cipher.getInstance(AES_MODE);
        cipher.init(2, secretKeySpec, new IvParameterSpec(bArr));
        return cipher.doFinal(bArr2);
    }
}
