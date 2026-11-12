package defpackage;

import net.lingala.zip4j.model.ZipHeader;

/* JADX INFO: loaded from: classes20.dex */
public class zpx extends ZipHeader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f54456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f54457b;
    private long e;

    public long a() {
        return this.e;
    }

    public void b(long j) {
        this.e = j;
    }

    public int c() {
        return this.f54457b;
    }

    public void b(int i) {
        this.f54457b = i;
    }

    public byte[] d() {
        return this.f54456a;
    }

    public void e(byte[] bArr) {
        this.f54456a = bArr;
    }
}
