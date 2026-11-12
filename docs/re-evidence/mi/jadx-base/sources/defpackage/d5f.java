package defpackage;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public class d5f extends FilterInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15104a;

    public d5f(InputStream inputStream) {
        super(inputStream);
        this.f15104a = Integer.MIN_VALUE;
    }

    public final long a(long j) {
        int i = this.f15104a;
        if (i == 0) {
            return -1L;
        }
        return (i == Integer.MIN_VALUE || j <= ((long) i)) ? j : i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        int i = this.f15104a;
        return i == Integer.MIN_VALUE ? super.available() : Math.min(i, super.available());
    }

    public final void b(long j) {
        int i = this.f15104a;
        if (i == Integer.MIN_VALUE || j == -1) {
            return;
        }
        this.f15104a = (int) (((long) i) - j);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i) {
        super.mark(i);
        this.f15104a = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (a(1L) == -1) {
            return -1;
        }
        int i = super.read();
        b(1L);
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        super.reset();
        this.f15104a = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        long jA = a(j);
        if (jA == -1) {
            return 0L;
        }
        long jSkip = super.skip(jA);
        b(jSkip);
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int iA = (int) a(i2);
        if (iA == -1) {
            return -1;
        }
        int i3 = super.read(bArr, i, iA);
        b(i3);
        return i3;
    }
}
