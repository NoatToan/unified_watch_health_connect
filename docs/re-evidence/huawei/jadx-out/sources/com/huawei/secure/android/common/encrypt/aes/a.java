package com.huawei.secure.android.common.encrypt.aes;

import android.text.TextUtils;
import com.huawei.secure.android.common.encrypt.utils.b;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes3.dex */
final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f22786a = "security:";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f22787b = "";

    private a() {
    }

    static byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    static byte[] b(byte[] bArr, int i, String str) {
        if (bArr != null && bArr.length >= i) {
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, i);
            return bArr2;
        }
        b.b(str, "getIV error: bt length less than " + i + " bytes.");
        return new byte[0];
    }

    static byte[] a(byte[] bArr, int i, String str) {
        if (bArr != null && bArr.length > i) {
            byte[] bArr2 = new byte[bArr.length - i];
            System.arraycopy(bArr, i, bArr2, 0, bArr.length - i);
            return bArr2;
        }
        b.b(str, "get content error, because bt length is less than " + i);
        return new byte[0];
    }

    static boolean b(byte[] bArr, String str, String str2) {
        if (bArr != null) {
            return false;
        }
        b.b(str, str2);
        return true;
    }

    static boolean b(byte[] bArr, int i, String str, String str2) {
        if (bArr.length >= i) {
            return false;
        }
        b.b(str, str2);
        return true;
    }

    static String a(String str) {
        return (TextUtils.isEmpty(str) || str.indexOf(f22786a) == -1) ? "" : str.substring(9);
    }

    static byte[] a(byte[] bArr, String str) {
        String str2;
        try {
            str2 = new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            b.b(str, "stripCryptHead: exception : " + e.getMessage());
            str2 = "";
        }
        if (!str2.startsWith(f22786a)) {
            return new byte[0];
        }
        if (bArr.length > 9) {
            int length = bArr.length - 9;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 9, bArr2, 0, length);
            return bArr2;
        }
        return new byte[0];
    }

    static boolean a(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str)) {
            return false;
        }
        b.b(str2, str3);
        return true;
    }

    static boolean a(byte[] bArr, String str, String str2) {
        if (bArr != null && bArr.length != 0) {
            return false;
        }
        b.b(str, str2);
        return true;
    }

    static boolean a(byte[] bArr, int i, String str, String str2) {
        if (bArr.length >= i) {
            return false;
        }
        b.b(str, str2);
        return true;
    }

    static int a(byte[] bArr, int i) {
        if (bArr[i] == 58) {
            return i;
        }
        return -1;
    }
}
