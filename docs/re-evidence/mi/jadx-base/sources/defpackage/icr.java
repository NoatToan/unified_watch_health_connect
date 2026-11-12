package defpackage;

import com.xiaomi.smarthome.library.apache.http.protocol.HTTP;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes4.dex */
public class icr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f21006a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f21007b = true;
    public static final boolean c = e();
    public static hcr d = null;
    public static boolean e = false;
    public static final byte[] f = a("RIFF");
    public static final byte[] g = a("WEBP");
    public static final byte[] h = a("VP8 ");
    public static final byte[] i = a("VP8L");
    public static final byte[] j = a("VP8X");

    public static byte[] a(String str) {
        try {
            return str.getBytes(HTTP.ASCII);
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException("ASCII not found!", e2);
        }
    }

    public static boolean b(byte[] bArr, int i2) {
        return j(bArr, i2 + 12, j) && ((bArr[i2 + 20] & 2) == 2);
    }

    public static boolean c(byte[] bArr, int i2, int i3) {
        return i3 >= 21 && j(bArr, i2 + 12, j);
    }

    public static boolean d(byte[] bArr, int i2) {
        return j(bArr, i2 + 12, j) && ((bArr[i2 + 20] & 16) == 16);
    }

    public static boolean e() {
        return true;
    }

    public static boolean f(byte[] bArr, int i2) {
        return j(bArr, i2 + 12, i);
    }

    public static boolean g(byte[] bArr, int i2) {
        return j(bArr, i2 + 12, h);
    }

    public static boolean h(byte[] bArr, int i2, int i3) {
        return i3 >= 20 && j(bArr, i2, f) && j(bArr, i2 + 8, g);
    }

    public static hcr i() {
        hcr hcrVar;
        if (e) {
            return d;
        }
        try {
            hcrVar = (hcr) Class.forName("com.facebook.webpsupport.WebpBitmapFactoryImpl").newInstance();
        } catch (Throwable unused) {
            hcrVar = null;
        }
        e = true;
        return hcrVar;
    }

    public static boolean j(byte[] bArr, int i2, byte[] bArr2) {
        if (bArr2 == null || bArr == null || bArr2.length + i2 > bArr.length) {
            return false;
        }
        for (int i3 = 0; i3 < bArr2.length; i3++) {
            if (bArr[i3 + i2] != bArr2[i3]) {
                return false;
            }
        }
        return true;
    }
}
