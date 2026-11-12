package com.amap.api.col.p0003sl;

import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes4.dex */
public final class jo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static byte[] f2902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String[] f2903b = {"kp6SsA", "cHE4dQ", "JKekrA", "XBxOHQ", "CSnpKw", "VwcThw", "wkp6Sg", "1cHE4Q"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int[] f2904c = null;

    private static int a(int i, int i2) {
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 = (i3 >> 1) | Integer.MIN_VALUE;
        }
        return ((i & i3) >>> (32 - i2)) | (i << i2);
    }

    private static int b(int i) {
        int i2 = 1;
        for (int i3 = 0; i3 < 15; i3++) {
            i2 = (i2 << 2) | 1;
        }
        return ((i & (i2 << 1)) >>> 1) | ((i & i2) << 1);
    }

    private static int[] b() {
        int[] iArr = f2904c;
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = new int[8];
        int i = 0;
        while (true) {
            String[] strArr = f2903b;
            if (i >= strArr.length) {
                return iArr2;
            }
            byte[] bArrB = iq.b(strArr[i]);
            iArr2[i] = ((bArrB[0] & 255) << 24) | (bArrB[3] & 255) | ((bArrB[2] & 255) << 8) | ((bArrB[1] & 255) << 16);
            i++;
        }
    }

    public static String a(String str) {
        return it.b(str);
    }

    public static String a() {
        SecureRandom secureRandom = new SecureRandom();
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance(iy.c("EQUVT"));
            keyGenerator.init(128, secureRandom);
            return jj.a(keyGenerator.generateKey().getEncoded());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String b(String str) {
        try {
            return jj.a(a(str.getBytes("UTF-8")));
        } catch (Throwable unused) {
            return null;
        }
    }

    private static byte[] a(byte[] bArr) {
        try {
            if (f2902a == null) {
                f2902a = iy.c("YAAAAAAAAAAAAAAAAAAAAAA").getBytes();
            }
            IvParameterSpec ivParameterSpec = new IvParameterSpec(f2902a);
            SecretKeySpec secretKeySpec = new SecretKeySpec(a(b()).getBytes("UTF-8"), iy.c("EQUVT"));
            Cipher cipher = Cipher.getInstance(iy.c("CQUVTL0NCQy9QS0NTNVBhZGRpbmc"));
            cipher.init(1, secretKeySpec, ivParameterSpec);
            return cipher.doFinal(bArr);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private static String a(int[] iArr) {
        StringBuilder sb = new StringBuilder();
        if (iArr != null) {
            for (int i = 0; i < iArr.length; i++) {
                sb.append(a(a(b(iArr[i]), i)));
            }
        }
        return sb.toString();
    }

    private static String a(int i) {
        char[] cArr = new char[4];
        for (int i2 = 0; i2 < 4; i2++) {
            char c2 = (char) ((i >>> (i2 * 8)) & 255);
            cArr[3 - i2] = c2;
            String str = " ";
            for (int i3 = 0; i3 < 32; i3++) {
                str = str + (((Integer.MIN_VALUE >>> i3) & c2) >>> (31 - i3));
            }
        }
        return new String(cArr);
    }
}
