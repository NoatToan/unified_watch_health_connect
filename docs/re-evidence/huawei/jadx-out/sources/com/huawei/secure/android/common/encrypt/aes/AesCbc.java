package com.huawei.secure.android.common.encrypt.aes;

import android.text.TextUtils;
import com.huawei.secure.android.common.encrypt.utils.EncryptUtil;
import com.huawei.secure.android.common.encrypt.utils.HexUtil;
import com.huawei.secure.android.common.encrypt.utils.b;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes3.dex */
public final class AesCbc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f22774a = "AES/CBC/PKCS5Padding";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f22775b = "AES";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f22776c = "CBC";
    private static final String d = "";
    private static final int e = 16;
    private static final int f = 16;

    private AesCbc() {
    }

    private static byte[] a(String str, byte[] bArr, byte[] bArr2) {
        if (a.a(str, f22776c, "CBC encrypt 5 content is null")) {
            return new byte[0];
        }
        if (a.b(bArr, f22776c, "CBC encrypt 5 key is null")) {
            return new byte[0];
        }
        if (a.b(bArr, 16, f22776c, "CBC encrypt 5 key error: key length less than 16 bytes.")) {
            return new byte[0];
        }
        if (a.b(bArr2, f22776c, "CBC encrypt 5 iv is null")) {
            return new byte[0];
        }
        if (a.a(bArr2, 16, f22776c, "CBC encrypt 5 iv error: iv length less than 16 bytes.")) {
            return new byte[0];
        }
        try {
            return encrypt(str.getBytes("UTF-8"), bArr, bArr2);
        } catch (UnsupportedEncodingException e2) {
            b.b(f22776c, " cbc encrypt data error" + e2.getMessage());
            return new byte[0];
        }
    }

    private static byte[] b(byte[] bArr) {
        return a.b(bArr, 16, f22776c);
    }

    static String c(String str) {
        return a.a(str);
    }

    public static String decrypt(String str, String str2) {
        if (a.a(str, f22776c, "CBC decrypt 1 content is null") || a.a(str2, f22776c, "CBC decrypt 1 key is null")) {
            return "";
        }
        byte[] bArrHexStr2ByteArray = HexUtil.hexStr2ByteArray(str2);
        return a.b(bArrHexStr2ByteArray, 16, f22776c, "CBC decrypt 1 key error: key length less than 16 bytes.") ? "" : decrypt(str, bArrHexStr2ByteArray);
    }

    public static String decryptWithCryptHead(String str, byte[] bArr) {
        if (!TextUtils.isEmpty(str) && bArr != null && bArr.length >= 16) {
            String strC = c(str);
            if ("".equals(strC)) {
                return "";
            }
            int iIndexOf = strC.indexOf(58);
            if (iIndexOf >= 0) {
                return decrypt(HexUtil.byteArray2HexStr(HexUtil.hexStr2ByteArray(strC.substring(iIndexOf + 1))), bArr, HexUtil.hexStr2ByteArray(strC.substring(0, iIndexOf)));
            }
            b.b(f22776c, " cbc cipherText data missing colon");
        }
        return "";
    }

    public static byte[] decryptWithCryptHeadReturnByte(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null || bArr2.length < 16) {
            return new byte[0];
        }
        byte[] bArrC = c(bArr);
        if (bArrC.length == 0) {
            return new byte[0];
        }
        int iA = a.a(bArrC, 16);
        if (iA < 0) {
            b.b(f22776c, " cbc cipherText data missing colon");
            return new byte[0];
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArrC, iA);
        int length = (bArrC.length - bArrCopyOf.length) - 1;
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArrC, iA + 1, bArr3, 0, length);
        return decrypt(bArr3, bArr2, bArrCopyOf);
    }

    public static String encrypt(String str, String str2) {
        if (a.a(str, f22776c, "CBC encrypt 1 content is null") || a.a(str2, f22776c, "CBC encrypt 1 key is null")) {
            return "";
        }
        byte[] bArrHexStr2ByteArray = HexUtil.hexStr2ByteArray(str2);
        return a.b(bArrHexStr2ByteArray, 16, f22776c, "CBC encrypt 1 key error: key length less than 16 bytes.") ? "" : encrypt(str, bArrHexStr2ByteArray);
    }

    private static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return str.substring(6, 12) + str.substring(16, 26) + str.substring(32, 48);
        } catch (Exception e2) {
            b.b(f22776c, "getIv exception : " + e2.getMessage());
            return "";
        }
    }

    static byte[] c(byte[] bArr) {
        return a.a(bArr, f22776c);
    }

    public static String decrypt(String str, byte[] bArr) {
        if (a.a(str, f22776c, "CBC decrypt 2 content is null") || a.b(bArr, f22776c, "CBC decrypt 2 key is null") || a.b(bArr, 16, f22776c, "CBC decrypt 2 key error: key length less than 16 bytes.")) {
            return "";
        }
        String strB = b(str);
        String strA = a(str);
        return (a.a(strB, f22776c, "CBC decrypt 2 iv is null") || a.a(strA, f22776c, "CBC decrypt 2 encrypt content is null")) ? "" : decrypt(strA, bArr, HexUtil.hexStr2ByteArray(strB));
    }

    public static String encrypt(String str, byte[] bArr) {
        byte[] bArrGenerateSecureRandom;
        byte[] bArrA;
        return (a.a(str, f22776c, "CBC encrypt 2 content is null") || a.b(bArr, f22776c, "CBC encrypt 2 key is null") || a.b(bArr, 16, f22776c, "CBC encrypt 2 key error: key length less than 16 bytes.") || (bArrA = a(str, bArr, (bArrGenerateSecureRandom = EncryptUtil.generateSecureRandom(16)))) == null || bArrA.length == 0) ? "" : a(HexUtil.byteArray2HexStr(bArrGenerateSecureRandom), HexUtil.byteArray2HexStr(bArrA));
    }

    public static String decryptWithCryptHead(byte[] bArr, byte[] bArr2) {
        try {
            return new String(decryptWithCryptHeadReturnByte(bArr, bArr2), "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            b.b(f22776c, "decryptWithCryptHead UnsupportedEncodingException ");
            return "";
        }
    }

    private static String a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return "";
        }
        try {
            return str2.substring(0, 6) + str.substring(0, 6) + str2.substring(6, 10) + str.substring(6, 16) + str2.substring(10, 16) + str.substring(16) + str2.substring(16);
        } catch (Exception e2) {
            b.b(f22776c, "mix exception: " + e2.getMessage());
            return "";
        }
    }

    public static String encrypt(String str, String str2, String str3) {
        if (a.a(str, f22776c, "CBC encrypt 3 content is null") || a.a(str2, f22776c, "CBC encrypt 3 key is null") || a.a(str3, f22776c, "CBC encrypt 3 iv is null")) {
            return "";
        }
        byte[] bArrHexStr2ByteArray = HexUtil.hexStr2ByteArray(str2);
        byte[] bArrHexStr2ByteArray2 = HexUtil.hexStr2ByteArray(str3);
        return (a.b(bArrHexStr2ByteArray, 16, f22776c, "CBC encrypt 3 key error: key length less than 16 bytes.") || a.a(bArrHexStr2ByteArray2, 16, f22776c, "CBC encrypt 3 iv error: iv length less than 16 bytes.")) ? "" : encrypt(str, bArrHexStr2ByteArray, bArrHexStr2ByteArray2);
    }

    public static String decrypt(String str, String str2, String str3) {
        if (a.a(str, f22776c, "CBC decrypt 3 content is null") || a.a(str2, f22776c, "CBC decrypt 3 key is null") || a.a(str3, f22776c, "CBC decrypt 3 iv is null")) {
            return "";
        }
        byte[] bArrHexStr2ByteArray = HexUtil.hexStr2ByteArray(str2);
        byte[] bArrHexStr2ByteArray2 = HexUtil.hexStr2ByteArray(str3);
        return (a.b(bArrHexStr2ByteArray, 16, f22776c, "CBC decrypt 3 key error: key length less than 16 bytes.") || a.a(bArrHexStr2ByteArray2, 16, f22776c, "CBC decrypt 3 iv error: iv length less than 16 bytes.")) ? "" : decrypt(str, bArrHexStr2ByteArray, bArrHexStr2ByteArray2);
    }

    private static byte[] a(byte[] bArr, byte[] bArr2) {
        return a.a(bArr, bArr2);
    }

    private static byte[] a(byte[] bArr) {
        return a.a(bArr, 16, f22776c);
    }

    private static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return str.substring(0, 6) + str.substring(12, 16) + str.substring(26, 32) + str.substring(48);
        } catch (Exception e2) {
            b.b(f22776c, "get encryptword exception : " + e2.getMessage());
            return "";
        }
    }

    public static String encrypt(String str, byte[] bArr, byte[] bArr2) {
        return (a.a(str, f22776c, "CBC encrypt 4 content is null") || a.b(bArr, f22776c, "CBC encrypt 4 key is null") || a.b(bArr, 16, f22776c, "CBC encrypt 4 key error: key length less than 16 bytes.") || a.b(bArr2, f22776c, "CBC encrypt 4 iv is null") || a.a(bArr2, 16, f22776c, "CBC encrypt 4 iv error: iv length less than 16 bytes.")) ? "" : HexUtil.byteArray2HexStr(a(str, bArr, bArr2));
    }

    public static String decrypt(String str, byte[] bArr, byte[] bArr2) {
        if (a.a(str, f22776c, "CBC decrypt 4 content is null") || a.b(bArr, f22776c, "CBC decrypt 4 key is null") || a.b(bArr, 16, f22776c, "CBC decrypt 4 key error: key length less than 16 bytes.") || a.b(bArr2, f22776c, "CBC decrypt 4 iv is null") || a.a(bArr2, 16, f22776c, "CBC decrypt 4 iv error: iv length less than 16 bytes.")) {
            return "";
        }
        try {
            return new String(decrypt(HexUtil.hexStr2ByteArray(str), bArr, bArr2), "UTF-8");
        } catch (UnsupportedEncodingException e2) {
            b.b(f22776c, " cbc decrypt data error" + e2.getMessage());
            return "";
        }
    }

    public static byte[] encrypt(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (a.a(bArr, f22776c, "CBC encrypt 6 content is null or empty")) {
            return new byte[0];
        }
        if (a.b(bArr2, f22776c, "CBC encrypt 6 key is null")) {
            return new byte[0];
        }
        if (a.b(bArr2, 16, f22776c, "CBC encrypt 6 key error: key length less than 16 bytes.")) {
            return new byte[0];
        }
        if (a.b(bArr3, f22776c, "CBC encrypt 6 iv is null")) {
            return new byte[0];
        }
        if (a.a(bArr3, 16, f22776c, "CBC encrypt 6 iv error: iv length less than 16 bytes.")) {
            return new byte[0];
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, f22775b);
        try {
            Cipher cipher = Cipher.getInstance(f22774a);
            cipher.init(1, secretKeySpec, new IvParameterSpec(bArr3));
            return cipher.doFinal(bArr);
        } catch (NullPointerException e2) {
            b.b(f22776c, "NullPointerException: " + e2.getMessage());
            return new byte[0];
        } catch (InvalidAlgorithmParameterException e3) {
            b.b(f22776c, "InvalidAlgorithmParameterException: " + e3.getMessage());
            return new byte[0];
        } catch (InvalidKeyException e4) {
            b.b(f22776c, "InvalidKeyException: " + e4.getMessage());
            return new byte[0];
        } catch (NoSuchAlgorithmException e5) {
            b.b(f22776c, "NoSuchAlgorithmException: " + e5.getMessage());
            return new byte[0];
        } catch (BadPaddingException e6) {
            b.b(f22776c, "BadPaddingException: " + e6.getMessage());
            return new byte[0];
        } catch (IllegalBlockSizeException e7) {
            b.b(f22776c, "IllegalBlockSizeException: " + e7.getMessage());
            return new byte[0];
        } catch (NoSuchPaddingException e8) {
            b.b(f22776c, "NoSuchPaddingException: " + e8.getMessage());
            return new byte[0];
        }
    }

    public static byte[] decrypt(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (a.a(bArr, f22776c, "CBC decrypt 6 content is null or empty")) {
            return new byte[0];
        }
        if (a.b(bArr2, f22776c, "CBC decrypt 6 key is null")) {
            return new byte[0];
        }
        if (a.b(bArr2, 16, f22776c, "CBC decrypt 6 key error: key length less than 16 bytes.")) {
            return new byte[0];
        }
        if (a.b(bArr3, f22776c, "CBC decrypt 6 iv is null")) {
            return new byte[0];
        }
        if (a.a(bArr3, 16, f22776c, "CBC decrypt 6 iv error: iv length less than 16 bytes.")) {
            return new byte[0];
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, f22775b);
        try {
            Cipher cipher = Cipher.getInstance(f22774a);
            cipher.init(2, secretKeySpec, new IvParameterSpec(bArr3));
            return cipher.doFinal(bArr);
        } catch (NullPointerException e2) {
            b.b(f22776c, "NullPointerException: " + e2.getMessage());
            return new byte[0];
        } catch (InvalidAlgorithmParameterException e3) {
            b.b(f22776c, "InvalidAlgorithmParameterException: " + e3.getMessage());
            return new byte[0];
        } catch (InvalidKeyException e4) {
            b.b(f22776c, "InvalidKeyException: " + e4.getMessage());
            return new byte[0];
        } catch (NoSuchAlgorithmException e5) {
            b.b(f22776c, "NoSuchAlgorithmException: " + e5.getMessage());
            return new byte[0];
        } catch (BadPaddingException e6) {
            b.b(f22776c, "BadPaddingException: " + e6.getMessage());
            b.b(f22776c, "key is not right");
            return new byte[0];
        } catch (IllegalBlockSizeException e7) {
            b.b(f22776c, "IllegalBlockSizeException: " + e7.getMessage());
            return new byte[0];
        } catch (NoSuchPaddingException e8) {
            b.b(f22776c, "NoSuchPaddingException: " + e8.getMessage());
            return new byte[0];
        }
    }

    public static byte[] encrypt(byte[] bArr, byte[] bArr2) {
        if (a.a(bArr, f22776c, "CBC encrypt 7 content is null or empty")) {
            return new byte[0];
        }
        if (a.b(bArr2, f22776c, "CBC encrypt 7 key is null")) {
            return new byte[0];
        }
        if (a.b(bArr2, 16, f22776c, "CBC encrypt 7 key error: key length less than 16 bytes.")) {
            return new byte[0];
        }
        byte[] bArrGenerateSecureRandom = EncryptUtil.generateSecureRandom(16);
        byte[] bArrEncrypt = encrypt(bArr, bArr2, bArrGenerateSecureRandom);
        if (Arrays.equals(bArrEncrypt, new byte[0])) {
            b.b(f22776c, "encrypt encryptContent is null");
            return new byte[0];
        }
        return a(bArrGenerateSecureRandom, bArrEncrypt);
    }

    public static byte[] decrypt(byte[] bArr, byte[] bArr2) {
        if (a.a(bArr, f22776c, "CBC decrypt 7 content is null or empty")) {
            return new byte[0];
        }
        if (a.b(bArr2, f22776c, "CBC decrypt 7 key is null")) {
            return new byte[0];
        }
        if (a.b(bArr2, 16, f22776c, "CBC decrypt 7 key error: key length less than 16 bytes.")) {
            return new byte[0];
        }
        return decrypt(a(bArr), bArr2, b(bArr));
    }
}
