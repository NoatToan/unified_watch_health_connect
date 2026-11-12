package com.tencent.open.utils;

import android.util.Base64;
import com.huami.identity.auth.alexa.ConstantsKt;
import com.tencent.open.log.SLog;
import java.security.MessageDigest;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes18.dex */
public class d {
    private static byte[] a = {1, 2, 3, 4, 5, 6, 7, 8};
    private static final char[] b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static String a(String str, String str2) {
        try {
            byte[] bArrDecode = Base64.decode(str, 0);
            IvParameterSpec ivParameterSpec = new IvParameterSpec(a);
            SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(), "DES");
            Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
            cipher.init(2, secretKeySpec, ivParameterSpec);
            return new String(cipher.doFinal(bArrDecode));
        } catch (Exception e) {
            SLog.e("DESUtils", "decryptDES", e);
            return null;
        }
    }

    public static String b(String str, String str2) {
        return a(str, str2, a);
    }

    public static String c(String str, String str2) {
        return b(str, str2, a);
    }

    public static String b(String str, String str2, byte[] bArr) {
        try {
            byte[] bArrDecode = Base64.decode(str, 0);
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
            SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(), com.huami.network.hmnetwork.utils.a.a);
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(2, secretKeySpec, ivParameterSpec);
            return new String(cipher.doFinal(bArrDecode));
        } catch (Exception e) {
            SLog.e("DESUtils", "decryptAES", e);
            return null;
        }
    }

    public static String a(String str, String str2, byte[] bArr) {
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
            SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(), com.huami.network.hmnetwork.utils.a.a);
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(1, secretKeySpec, ivParameterSpec);
            return Base64.encodeToString(cipher.doFinal(str.getBytes()), 0);
        } catch (Exception e) {
            SLog.e("DESUtils", "encryptAES", e);
            return null;
        }
    }

    public static byte[] a(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(ConstantsKt.ALGORITHM_SHA_256);
            messageDigest.update(str.getBytes());
            return messageDigest.digest();
        } catch (Exception e) {
            SLog.e("DESUtils", "encryptSha", e);
            return null;
        }
    }

    public static String a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return "";
        }
        char[] cArr = new char[bArr.length * 2];
        for (int i = 0; i < bArr.length; i++) {
            byte b2 = bArr[i];
            int i2 = i * 2;
            char[] cArr2 = b;
            cArr[i2 + 1] = cArr2[b2 & 15];
            cArr[i2] = cArr2[((byte) (b2 >>> 4)) & 15];
        }
        return new String(cArr);
    }
}
