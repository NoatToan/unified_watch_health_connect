package defpackage;

import android.util.Base64;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes20.dex */
public class yqo {
    public static String a(byte[] bArr, int i) throws yqj {
        if (bArr == null) {
            throw new yqj(1005L, "base64 encodeToString error: data is null");
        }
        try {
            return Base64.encodeToString(bArr, i);
        } catch (Exception unused) {
            throw new yqj(1005L, "base64 encodeToString error");
        }
    }

    public static String c(String str, int i) throws yqj {
        if (str == null) {
            return "";
        }
        try {
            return new String(Base64.decode(str, i), StandardCharsets.UTF_8);
        } catch (Exception unused) {
            throw new yqj(1005L, "base64 decode to string error");
        }
    }

    public static byte[] a(String str, int i) throws yqj {
        if (str == null) {
            return new byte[0];
        }
        try {
            return Base64.decode(str, i);
        } catch (Exception unused) {
            throw new yqj(1005L, "base64 decode error");
        }
    }
}
