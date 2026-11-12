package com.huawei.secure.android.common.encrypt.aes;

import android.text.TextUtils;
import com.huawei.secure.android.common.encrypt.utils.EncryptUtil;
import com.huawei.secure.android.common.encrypt.utils.HexUtil;
import com.huawei.secure.android.common.encrypt.utils.b;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes3.dex */
public final class AesGcm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f22777a = "AES/GCM/NoPadding";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f22778b = "AES";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f22779c = "GCM";
    private static final String d = "";
    private static final int e = 16;
    private static final int f = 12;
    private static final int g = 2;

    private AesGcm() {
    }

    private static byte[] a(String str, byte[] bArr, byte[] bArr2) {
        if (a.a(str, f22779c, "GCM encrypt 5 content is null")) {
            return new byte[0];
        }
        if (a.b(bArr, f22779c, "GCM encrypt 5 key is null")) {
            return new byte[0];
        }
        if (a.b(bArr, 16, f22779c, "GCM encrypt 5 key error: key length less than 16 bytes.")) {
            return new byte[0];
        }
        if (a.b(bArr2, f22779c, "GCM encrypt 5 iv is null")) {
            return new byte[0];
        }
        if (a.a(bArr2, 12, f22779c, "GCM encrypt 5 iv error: iv length less than 12 bytes.")) {
            return new byte[0];
        }
        if (!isBuildVersionHigherThan19()) {
            b.b(f22779c, "encrypt 5 build version not higher than 19");
            return new byte[0];
        }
        try {
            return encrypt(str.getBytes("UTF-8"), bArr, bArr2);
        } catch (UnsupportedEncodingException e2) {
            b.b(f22779c, "GCM encrypt data error" + e2.getMessage());
            return new byte[0];
        }
    }

    private static byte[] b(byte[] bArr) {
        return a.b(bArr, 12, f22779c);
    }

    public static String decrypt(String str, String str2) {
        if (a.a(str, f22779c, "GCM decrypt 1 content is null") || a.a(str2, f22779c, "GCM decrypt 1 key is null")) {
            return "";
        }
        if (isBuildVersionHigherThan19()) {
            byte[] bArrHexStr2ByteArray = HexUtil.hexStr2ByteArray(str2);
            return a.b(bArrHexStr2ByteArray, 16, f22779c, "GCM decrypt 1 key error: key length less than 16 bytes.") ? "" : decrypt(str, bArrHexStr2ByteArray);
        }
        b.b(f22779c, "decrypt 1 build version not higher than 19");
        return "";
    }

    public static String decryptWithCryptHead(String str, byte[] bArr) {
        if (!TextUtils.isEmpty(str) && bArr != null && bArr.length >= 16) {
            String strA = a.a(str);
            if ("".equals(strA)) {
                return "";
            }
            int iIndexOf = strA.indexOf(58);
            if (iIndexOf >= 0) {
                return decrypt(HexUtil.byteArray2HexStr(HexUtil.hexStr2ByteArray(strA.substring(iIndexOf + 1))), bArr, HexUtil.hexStr2ByteArray(strA.substring(0, iIndexOf)));
            }
            b.b(f22779c, " gcm cipherText data missing colon");
        }
        return "";
    }

    public static byte[] decryptWithCryptHeadReturnByte(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null || bArr2.length < 16) {
            return new byte[0];
        }
        byte[] bArrA = a.a(bArr, f22779c);
        if (bArrA.length == 0) {
            return new byte[0];
        }
        int iA = a.a(bArrA, 12);
        if (iA < 0) {
            b.b(f22779c, " gcm cipherText data missing colon");
            return new byte[0];
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArrA, iA);
        int length = (bArrA.length - bArrCopyOf.length) - 1;
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArrA, iA + 1, bArr3, 0, length);
        return decrypt(bArr3, bArr2, bArrCopyOf);
    }

    public static String encrypt(String str, String str2) {
        if (a.a(str, f22779c, "GCM encrypt 1 content is null") || a.a(str2, f22779c, "GCM encrypt 1 key is null")) {
            return "";
        }
        if (isBuildVersionHigherThan19()) {
            byte[] bArrHexStr2ByteArray = HexUtil.hexStr2ByteArray(str2);
            return a.b(bArrHexStr2ByteArray, 16, f22779c, "GCM encrypt key error: key length less than 16 bytes.") ? "" : encrypt(str, bArrHexStr2ByteArray);
        }
        b.b(f22779c, "encrypt 1 build version not higher than 19");
        return "";
    }

    public static boolean isBuildVersionHigherThan19() {
        return true;
    }

    private static String b(String str) {
        if (!TextUtils.isEmpty(str) && str.length() >= 24) {
            return str.substring(0, 24);
        }
        b.b(f22779c, "IV is invalid.");
        return "";
    }

    public static AlgorithmParameterSpec getGcmAlgorithmParams(byte[] bArr) {
        return new GCMParameterSpec(128, bArr);
    }

    public static String decrypt(String str, byte[] bArr) {
        if (a.a(str, f22779c, "GCM decrypt 2 content is null") || a.b(bArr, f22779c, "GCM decrypt 2 key is null") || a.b(bArr, 16, f22779c, "GCM decrypt 2 key error: key length less than 16 bytes.")) {
            return "";
        }
        if (!isBuildVersionHigherThan19()) {
            b.b(f22779c, "decrypt 2 build version not higher than 19");
            return "";
        }
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, f22778b);
            Cipher cipher = Cipher.getInstance(f22777a);
            String strB = b(str);
            String strA = a(str);
            if (a.a(strB, f22779c, "GCM decrypt 2 iv is null") || a.a(strA, f22779c, "GCM decrypt 2 encrypt content is null")) {
                return "";
            }
            cipher.init(2, secretKeySpec, getGcmAlgorithmParams(HexUtil.hexStr2ByteArray(strB)));
            return new String(cipher.doFinal(HexUtil.hexStr2ByteArray(strA)), "UTF-8");
        } catch (UnsupportedEncodingException | NullPointerException | GeneralSecurityException e2) {
            b.b(f22779c, "GCM decrypt data exception: " + e2.getMessage());
            return "";
        }
    }

    public static String encrypt(String str, byte[] bArr) {
        if (a.a(str, f22779c, "GCM encrypt 2 content is null") || a.b(bArr, f22779c, "GCM encrypt 2 key is null") || a.b(bArr, 16, f22779c, "GCM encrypt 2 key error: key length less than 16 bytes.")) {
            return "";
        }
        if (!isBuildVersionHigherThan19()) {
            b.b(f22779c, "encrypt 2 build version not higher than 19");
            return "";
        }
        byte[] bArrGenerateSecureRandom = EncryptUtil.generateSecureRandom(12);
        byte[] bArrA = a(str, bArr, bArrGenerateSecureRandom);
        if (bArrA == null || bArrA.length == 0) {
            return "";
        }
        return HexUtil.byteArray2HexStr(bArrGenerateSecureRandom) + HexUtil.byteArray2HexStr(bArrA);
    }

    public static String decryptWithCryptHead(byte[] bArr, byte[] bArr2) {
        try {
            return new String(decryptWithCryptHeadReturnByte(bArr, bArr2), "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            b.b(f22779c, "UnsupportedEncodingException");
            return "";
        }
    }

    private static byte[] a(byte[] bArr, byte[] bArr2) {
        return a.a(bArr, bArr2);
    }

    private static byte[] a(byte[] bArr) {
        return a.a(bArr, 12, f22779c);
    }

    private static String a(String str) {
        if (!TextUtils.isEmpty(str) && str.length() >= 24) {
            return str.substring(24);
        }
        return "";
    }

    public static String encrypt(String str, String str2, String str3) {
        if (a.a(str, f22779c, "GCM encrypt 3 content is null") || a.a(str2, f22779c, "GCM encrypt 3 key is null") || a.a(str3, f22779c, "GCM encrypt 3 iv is null")) {
            return "";
        }
        if (!isBuildVersionHigherThan19()) {
            b.b(f22779c, "encrypt 3 build version not higher than 19");
            return "";
        }
        byte[] bArrHexStr2ByteArray = HexUtil.hexStr2ByteArray(str2);
        byte[] bArrHexStr2ByteArray2 = HexUtil.hexStr2ByteArray(str3);
        return (a.b(bArrHexStr2ByteArray, 16, f22779c, "GCM encrypt 3 key error: key length less than 16 bytes.") || a.a(bArrHexStr2ByteArray2, 12, f22779c, "GCM encrypt 3 iv error: iv length less than 12 bytes.")) ? "" : encrypt(str, bArrHexStr2ByteArray, bArrHexStr2ByteArray2);
    }

    public static String decrypt(String str, String str2, String str3) {
        if (a.a(str, f22779c, "GCM decrypt 3 content is null") || a.a(str2, f22779c, "GCM decrypt 3 key is null") || a.a(str3, f22779c, "GCM decrypt 3 iv is null")) {
            return "";
        }
        if (!isBuildVersionHigherThan19()) {
            b.b(f22779c, "decrypt 3 build version not higher than 19");
            return "";
        }
        byte[] bArrHexStr2ByteArray = HexUtil.hexStr2ByteArray(str2);
        byte[] bArrHexStr2ByteArray2 = HexUtil.hexStr2ByteArray(str3);
        return (a.b(bArrHexStr2ByteArray, 16, f22779c, "GCM decrypt 3 key error: key length less than 16 bytes.") || a.a(bArrHexStr2ByteArray2, 12, f22779c, "GCM decrypt 3 iv error: iv length less than 12 bytes.")) ? "" : decrypt(str, bArrHexStr2ByteArray, bArrHexStr2ByteArray2);
    }

    public static String encrypt(String str, byte[] bArr, byte[] bArr2) {
        if (a.a(str, f22779c, "GCM encrypt 4 content is null") || a.b(bArr, f22779c, "GCM encrypt 4 key is null") || a.b(bArr, 16, f22779c, "GCM encrypt 4 key error: key length less than 16 bytes.") || a.b(bArr2, f22779c, "GCM encrypt 4 iv is null") || a.a(bArr2, 12, f22779c, "GCM encrypt 4 iv error: iv length less than 12 bytes.")) {
            return "";
        }
        if (!isBuildVersionHigherThan19()) {
            b.b(f22779c, "encrypt 4 build version not higher than 19");
            return "";
        }
        return HexUtil.byteArray2HexStr(a(str, bArr, bArr2));
    }

    public static String decrypt(String str, byte[] bArr, byte[] bArr2) {
        if (a.a(str, f22779c, "GCM decrypt 4 content is null") || a.b(bArr, f22779c, "GCM decrypt 4 key is null") || a.b(bArr, 16, f22779c, "GCM decrypt 4 key error: key length less than 16 bytes.") || a.b(bArr2, f22779c, "GCM decrypt 4 iv is null") || a.a(bArr2, 12, f22779c, "GCM decrypt 4 iv error: iv length less than 12 bytes.")) {
            return "";
        }
        if (!isBuildVersionHigherThan19()) {
            b.b(f22779c, "decrypt 4 build version not higher than 19");
            return "";
        }
        try {
            return new String(decrypt(HexUtil.hexStr2ByteArray(str), bArr, bArr2), "UTF-8");
        } catch (UnsupportedEncodingException e2) {
            b.b(f22779c, "GCM decrypt data exception: " + e2.getMessage());
            return "";
        }
    }

    public static byte[] encrypt(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (a.a(bArr, f22779c, "GCM encrypt 6 content is null or empty")) {
            return new byte[0];
        }
        if (a.b(bArr2, f22779c, "GCM encrypt 6 key is null")) {
            return new byte[0];
        }
        if (a.b(bArr2, 16, f22779c, "GCM encrypt 6 key error: key length less than 16 bytes.")) {
            return new byte[0];
        }
        if (a.b(bArr3, f22779c, "GCM encrypt 6 iv is null")) {
            return new byte[0];
        }
        if (a.a(bArr3, 12, f22779c, "GCM encrypt 6 iv error: iv length less than 12 bytes.")) {
            return new byte[0];
        }
        if (!isBuildVersionHigherThan19()) {
            b.b(f22779c, "encrypt 6 build version not higher than 19");
            return new byte[0];
        }
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, f22778b);
            Cipher cipher = Cipher.getInstance(f22777a);
            cipher.init(1, secretKeySpec, getGcmAlgorithmParams(bArr3));
            return cipher.doFinal(bArr);
        } catch (NullPointerException e2) {
            b.b(f22779c, "GCM encrypt data error" + e2.getMessage());
            return new byte[0];
        } catch (GeneralSecurityException e3) {
            b.b(f22779c, "GCM encrypt data error" + e3.getMessage());
            return new byte[0];
        }
    }

    public static byte[] decrypt(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (a.a(bArr, f22779c, "GCM decrypt 6 content is null or empty")) {
            return new byte[0];
        }
        if (a.b(bArr2, f22779c, "GCM decrypt 6 key is null")) {
            return new byte[0];
        }
        if (a.b(bArr2, 16, f22779c, "GCM decrypt 6 key error: key length less than 16 bytes.")) {
            return new byte[0];
        }
        if (a.b(bArr3, f22779c, "GCM decrypt 6 iv is null")) {
            return new byte[0];
        }
        if (a.a(bArr3, 12, f22779c, "GCM decrypt 6 iv error: iv length less than 12 bytes.")) {
            return new byte[0];
        }
        if (!isBuildVersionHigherThan19()) {
            b.b(f22779c, "decrypt 6 build version not higher than 19");
            return new byte[0];
        }
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, f22778b);
            Cipher cipher = Cipher.getInstance(f22777a);
            cipher.init(2, secretKeySpec, getGcmAlgorithmParams(bArr3));
            return cipher.doFinal(bArr);
        } catch (GeneralSecurityException e2) {
            b.b(f22779c, "GCM decrypt data exception: " + e2.getMessage());
            return new byte[0];
        }
    }

    public static byte[] encrypt(byte[] bArr, byte[] bArr2) {
        if (a.a(bArr, f22779c, "GCM encrypt 7 content is null or empty")) {
            return new byte[0];
        }
        if (a.b(bArr2, f22779c, "GCM encrypt 7 key is null")) {
            return new byte[0];
        }
        if (a.b(bArr2, 16, f22779c, "GCM encrypt 7 key error: key length less than 16 bytes.")) {
            return new byte[0];
        }
        byte[] bArrGenerateSecureRandom = EncryptUtil.generateSecureRandom(12);
        return a(bArrGenerateSecureRandom, encrypt(bArr, bArr2, bArrGenerateSecureRandom));
    }

    public static byte[] decrypt(byte[] bArr, byte[] bArr2) {
        if (a.a(bArr, f22779c, "GCM decrypt 7 content is null or empty")) {
            return new byte[0];
        }
        if (a.b(bArr2, f22779c, "GCM decrypt 7 key is null")) {
            return new byte[0];
        }
        if (a.b(bArr2, 16, f22779c, "GCM decrypt 7 key error: key length less than 16 bytes.")) {
            return new byte[0];
        }
        byte[] bArrB = b(bArr);
        if (bArrB.length < 12) {
            b.b(f22779c, "get iv from content error.");
            return new byte[0];
        }
        return decrypt(a(bArr), bArr2, bArrB);
    }
}
