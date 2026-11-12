package defpackage;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class ai4 extends FilterInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1046b;

    public ai4(InputStream inputStream, long j) {
        super(inputStream);
        this.f1045a = j;
    }

    public static InputStream b(InputStream inputStream, long j) {
        return new ai4(inputStream, j);
    }

    public final int a(int i) throws IOException {
        if (i >= 0) {
            this.f1046b += i;
        } else if (this.f1045a - ((long) this.f1046b) > 0) {
            throw new IOException("Failed to read all expected data, expected: " + this.f1045a + ", but read: " + this.f1046b);
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() throws IOException {
        return (int) Math.max(this.f1045a - ((long) this.f1046b), ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() throws IOException {
        int i;
        i = super.read();
        a(i >= 0 ? 1 : -1);
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i, int i2) throws IOException {
        return a(super.read(bArr, i, i2));
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }
}
