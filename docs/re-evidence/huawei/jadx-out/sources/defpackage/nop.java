package defpackage;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class nop {
    public static String a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        if (bArr.length == 0) {
            return "";
        }
        char[] cArr = new char[bArr.length * 2];
        char[] cArr2 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        for (int i = 0; i < bArr.length; i++) {
            byte b2 = bArr[i];
            int i2 = i * 2;
            cArr[i2] = cArr2[(b2 & 240) >> 4];
            cArr[i2 + 1] = cArr2[b2 & 15];
        }
        return new String(cArr);
    }

    public static byte[] b(String str) {
        if (TextUtils.isEmpty(str)) {
            nox.a("CommonUtils", "getUTF8Bytes, str is empty", true);
            return new byte[0];
        }
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            nox.a("CommonUtils", "getBytes error" + e.getClass().getSimpleName(), true);
            return new byte[0];
        }
    }

    public static boolean c(String str) {
        nox.b("CommonUtils", "the loginUrl is:" + str, false);
        try {
            String host = new URL(str.replaceAll("[\\\\#]", "/")).getHost();
            ArrayList<String> arrayListR = nom.r();
            if (arrayListR == null || arrayListR.size() == 0 || TextUtils.isEmpty(host) || !arrayListR.contains(host)) {
                nox.b("CommonUtils", "host  is not in whitelist", true);
                return false;
            }
            nox.b("CommonUtils", "host is in whitelist", true);
            return true;
        } catch (MalformedURLException unused) {
            nox.b("CommonUtils", "MalformedURLException", true);
            return false;
        }
    }
}
