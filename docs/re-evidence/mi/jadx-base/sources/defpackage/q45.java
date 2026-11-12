package defpackage;

import com.xiaomi.wearable.core.CoreExtKt;
import kotlin.UShort;

/* JADX INFO: loaded from: classes2.dex */
public class q45 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public short f31072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public short f31073b;
    public short c;
    public short d;

    public void a() {
        short s = this.f31073b;
        short s2 = (short) (s + 1);
        this.f31073b = s2;
        if ((s & UShort.MAX_VALUE) > 32767 && (s2 & UShort.MAX_VALUE) < 32768) {
            this.f31072a = (short) (this.f31072a + 1);
        }
        sq1.f33878a.a((s2 & UShort.MAX_VALUE) | (this.f31072a << 16));
        CoreExtKt.logger.d("CryptoCounter", "addAppCount: high = " + ((int) this.f31072a) + ", low = " + ((int) this.f31073b) + ", count = " + ((65535 & this.f31073b) | (this.f31072a << 16)));
    }

    public short b() {
        return this.f31073b;
    }

    public byte[] c() {
        short s = this.f31073b;
        short s2 = this.f31072a;
        return new byte[]{(byte) (s & 255), (byte) (s >> 8), (byte) (s2 & 255), (byte) (s2 >> 8)};
    }

    public byte[] d() {
        short s = this.d;
        short s2 = this.c;
        return new byte[]{(byte) (s & 255), (byte) (s >> 8), (byte) (s2 & 255), (byte) (s2 >> 8)};
    }

    public void e() {
        this.f31072a = (short) 0;
        this.f31073b = (short) 0;
        this.c = (short) 0;
        this.d = (short) 0;
    }

    public boolean f(short s) {
        short s2 = this.c;
        short s3 = this.d;
        long j = (s2 << 16) | (s3 & UShort.MAX_VALUE);
        if ((s3 & UShort.MAX_VALUE) > 32767 && (s & UShort.MAX_VALUE) < 32768) {
            s2 = (short) (s2 + 1);
        }
        long j2 = (s2 << 16) | (s & UShort.MAX_VALUE);
        if (j >= j2 && j2 != 0) {
            return false;
        }
        this.c = s2;
        this.d = s;
        sq1.f33878a.b(j2);
        CoreExtKt.logger.d("CryptoCounter", "updateDeviceCount: high = " + ((int) this.c) + ", low = " + ((int) this.d) + ", count = " + j2);
        return true;
    }
}
