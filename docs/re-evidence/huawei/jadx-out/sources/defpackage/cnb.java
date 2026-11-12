package defpackage;

import health.compact.a.LogUtil;

/* JADX INFO: loaded from: classes4.dex */
public class cnb {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f1820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f1821c;
    private int d;
    private int e;

    public int a() {
        return this.e;
    }

    public void e(int i) {
        this.e = i;
    }

    public byte[] c() {
        byte[] bArr = this.f1821c;
        if (bArr != null) {
            return bArr;
        }
        LogUtil.e("getHiChainData", "mHiChainData is null.");
        return new byte[0];
    }

    public void a(byte[] bArr) {
        this.f1821c = bArr;
    }

    public long e() {
        return this.f1820b;
    }

    public void c(long j) {
        this.f1820b = j;
    }

    public int b() {
        return this.d;
    }

    public void b(int i) {
        this.d = i;
    }
}
