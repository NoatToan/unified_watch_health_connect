package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes46.dex */
public class zpi extends InputStream {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InputStream f54434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f54435c = 0;
    private byte[] d = new byte[1];
    private long e;

    public zpi(InputStream inputStream, long j) {
        this.f54434b = inputStream;
        this.e = j;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (read(this.d) == -1) {
            return -1;
        }
        return this.d[0];
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        long j = this.e;
        if (j != -1) {
            long j2 = this.f54435c;
            if (j2 >= j) {
                return -1;
            }
            long j3 = j - j2;
            if (i2 > j3) {
                i2 = (int) j3;
            }
        }
        int i3 = this.f54434b.read(bArr, i, i2);
        if (i3 > 0) {
            this.f54435c += (long) i3;
        }
        return i3;
    }

    public int a(byte[] bArr) throws IOException {
        int i = this.f54434b.read(bArr);
        if (i == -1) {
            throw new IOException("Unexpected EOF reached when trying to read stream");
        }
        if (i == bArr.length) {
            return i;
        }
        int iC = c(bArr, i);
        if (iC == bArr.length) {
            return iC;
        }
        throw new IOException("Cannot read fully into byte buffer");
    }

    private int c(byte[] bArr, int i) throws IOException {
        int length = bArr.length - i;
        int i2 = 0;
        for (int i3 = 0; i < bArr.length && i2 != -1 && i3 < 15; i3++) {
            i2 += this.f54434b.read(bArr, i, length);
            if (i2 > 0) {
                i += i2;
                length -= i2;
            }
        }
        return i;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f54434b.close();
    }

    public long b() {
        return this.f54435c;
    }
}
