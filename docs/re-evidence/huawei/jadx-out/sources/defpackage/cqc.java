package defpackage;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes4.dex */
public class cqc {
    private static byte[] e(String str, Charset charset) {
        if (str == null) {
            return new byte[0];
        }
        return str.getBytes(charset);
    }

    public static byte[] a(String str) {
        return e(str, cqw.d);
    }

    private static String c(byte[] bArr, Charset charset) {
        if (bArr == null) {
            return null;
        }
        return new String(bArr, charset);
    }

    public static String c(byte[] bArr) {
        return c(bArr, cqw.d);
    }

    public static String a(Object obj) {
        return obj == null ? "" : obj.toString().trim();
    }
}
