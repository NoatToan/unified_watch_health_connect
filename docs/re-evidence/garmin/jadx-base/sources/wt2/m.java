package wt2;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Locale;

/* JADX INFO: loaded from: classes11.dex */
public class m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f187219b = StandardCharsets.UTF_8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f187220a;

    public m(byte[] bArr) {
        this.f187220a = bArr;
        byte b14 = bArr[0];
        a();
        c();
        b();
    }

    public final String a() {
        byte[] bArr = this.f187220a;
        return new String(bArr, 2, bArr[1], f187219b);
    }

    public final String b() {
        byte[] bArr = this.f187220a;
        byte b14 = bArr[1];
        return new String(bArr, (byte) (bArr[b14 + 2] + ((byte) (b14 + 3)) + 1), bArr[bArr[b14 + 2] + ((byte) (b14 + 3))], f187219b);
    }

    public final String c() {
        byte[] bArr = this.f187220a;
        byte b14 = bArr[1];
        return new String(bArr, (byte) (b14 + 3), bArr[b14 + 2], f187219b);
    }

    public final String toString() {
        byte[] bArr = this.f187220a;
        byte b14 = bArr[0];
        return b14 == 0 ? String.format(Locale.getDefault(), "[gps ephemeris data request] format: %1$d (PGPS), mID: %2$s, user name: %3$s, password: %4$s", Integer.valueOf(b14), a(), c(), b()) : String.format(Locale.getDefault(), "[gps ephemeris data request] format: %1$d (UNKNOWN), original request: %2$s", Integer.valueOf(b14), dz2.c.a(bArr));
    }
}
