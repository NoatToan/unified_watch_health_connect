package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public abstract class dj1 extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f15580a = new byte[1];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f15581b = 0;

    public void a(int i) {
        b(i);
    }

    public void b(long j) {
        if (j != -1) {
            this.f15581b += j;
        }
    }

    public long c() {
        return this.f15581b;
    }

    public void d(long j) {
        this.f15581b -= j;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (read(this.f15580a, 0, 1) == -1) {
            return -1;
        }
        return this.f15580a[0] & 255;
    }
}
