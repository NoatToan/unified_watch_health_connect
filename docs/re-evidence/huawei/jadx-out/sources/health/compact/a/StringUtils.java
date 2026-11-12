package health.compact.a;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public class StringUtils {
    private StringUtils() {
    }

    private static byte[] c(String str, Charset charset) {
        if (str == null) {
            return new byte[0];
        }
        return str.getBytes(charset);
    }

    public static byte[] d(String str) {
        return c(str, Charsets.f36523c);
    }

    private static String e(byte[] bArr, Charset charset) {
        if (bArr == null) {
            return null;
        }
        return new String(bArr, charset);
    }

    public static String a(byte[] bArr) {
        return e(bArr, Charsets.f36523c);
    }
}
