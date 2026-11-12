package com.huawei.openalliance.ad.utils;

import android.text.TextUtils;
import com.huawei.openalliance.ad.hw;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes12.dex */
public abstract class g {
    private static boolean a() {
        return true;
    }

    private static String d(String str, byte[] bArr) {
        if (!TextUtils.isEmpty(str) && b(bArr) && a()) {
            try {
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
                Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                String strA = a(str);
                String strB = b(str);
                if (TextUtils.isEmpty(strA) || TextUtils.isEmpty(strB)) {
                    hw.b("Aes128", "ivParameter or encrypedWord is null");
                    return "";
                }
                cipher.init(2, secretKeySpec, c(ar.a(strA)));
                return new String(cipher.doFinal(ar.a(strB)), "UTF-8");
            } catch (UnsupportedEncodingException | GeneralSecurityException e) {
                hw.d("Aes128", "GCM decrypt data exception: " + e.getMessage());
            }
        }
        return "";
    }

    private static AlgorithmParameterSpec c(byte[] bArr) {
        return new GCMParameterSpec(128, bArr);
    }

    private static String c(String str, byte[] bArr) {
        byte[] bArrA;
        byte[] bArrA2;
        if (TextUtils.isEmpty(str) || !b(bArr) || !a() || (bArrA2 = a(str, bArr, (bArrA = cw.a(12)))) == null || bArrA2.length == 0) {
            return "";
        }
        return ar.a(bArrA) + ar.a(bArrA2);
    }

    private static boolean b(byte[] bArr) {
        return bArr != null && bArr.length >= 16;
    }

    public static String b(String str, byte[] bArr) {
        if (dg.b(str) || str.length() < 32 || bArr == null || bArr.length == 0) {
            return "";
        }
        try {
            return a() ? d(str, bArr) : "";
        } catch (Exception e) {
            e = e;
            hw.c("Aes128", "fail to decrypt: " + e.getClass().getSimpleName());
            hw.a("Aes128", "input: %s", ds.a(ar.a(bArr)));
            hw.a(3, e);
            return "";
        } catch (Throwable th) {
            e = th;
            hw.c("Aes128", "fail to decrypt: " + e.getClass().getSimpleName());
            hw.a("Aes128", "input: %s", ds.a(ar.a(bArr)));
            hw.a(3, e);
            return "";
        }
    }

    private static String b(String str) {
        return (TextUtils.isEmpty(str) || str.length() < 24) ? "" : str.substring(24);
    }

    public static byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bm.a(bArr)) {
            return new byte[0];
        }
        if (b(bArr2) && a(bArr3) && a()) {
            try {
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
                Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                cipher.init(1, secretKeySpec, c(bArr3));
                return cipher.doFinal(bArr);
            } catch (GeneralSecurityException e) {
                hw.d("Aes128", "GCM encrypt data error" + e.getMessage());
            }
        } else {
            hw.b("Aes128", "gcm encrypt param is not right");
        }
        return new byte[0];
    }

    private static byte[] a(String str, byte[] bArr, byte[] bArr2) {
        if (!TextUtils.isEmpty(str) && b(bArr) && a(bArr2) && a()) {
            try {
                return a(str.getBytes("UTF-8"), bArr, bArr2);
            } catch (UnsupportedEncodingException e) {
                hw.d("Aes128", "GCM encrypt data error" + e.getMessage());
            }
        } else {
            hw.b("Aes128", "gcm encrypt param is not right");
        }
        return new byte[0];
    }

    private static boolean a(byte[] bArr) {
        return bArr != null && bArr.length >= 12;
    }

    public static String a(String str, byte[] bArr) {
        StringBuilder sb;
        if (dg.b(str) || bArr == null || bArr.length == 0) {
            return "";
        }
        try {
            return a() ? c(str, bArr) : "";
        } catch (Exception e) {
            e = e;
            sb = new StringBuilder("fail to cipher: ");
            sb.append(e.getClass().getSimpleName());
            hw.c("Aes128", sb.toString());
            hw.a(3, e);
            return "";
        } catch (Throwable th) {
            e = th;
            sb = new StringBuilder("fail to cipher: ");
            sb.append(e.getClass().getSimpleName());
            hw.c("Aes128", sb.toString());
            hw.a(3, e);
            return "";
        }
    }

    private static String a(String str) {
        if (!TextUtils.isEmpty(str) && str.length() >= 24) {
            return str.substring(0, 24);
        }
        hw.b("Aes128", "IV is invalid.");
        return "";
    }
}
