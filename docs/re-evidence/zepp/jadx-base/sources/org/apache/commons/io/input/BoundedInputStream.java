package org.apache.commons.io.input;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes23.dex */
public class BoundedInputStream extends InputStream {
    private final InputStream a;
    private final long b;
    private long c;
    private long d;
    private boolean e;

    public BoundedInputStream(InputStream inputStream, long j) {
        this.c = 0L;
        this.d = -1L;
        this.e = true;
        this.b = j;
        this.a = inputStream;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        long j = this.b;
        if (j < 0 || this.c < j) {
            return this.a.available();
        }
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.e) {
            this.a.close();
        }
    }

    public boolean isPropagateClose() {
        return this.e;
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i) {
        this.a.mark(i);
        this.d = this.c;
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.a.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        long j = this.b;
        if (j >= 0 && this.c >= j) {
            return -1;
        }
        int i = this.a.read();
        this.c++;
        return i;
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        this.a.reset();
        this.c = this.d;
    }

    public void setPropagateClose(boolean z) {
        this.e = z;
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        long j2 = this.b;
        if (j2 >= 0) {
            j = Math.min(j, j2 - this.c);
        }
        long jSkip = this.a.skip(j);
        this.c += jSkip;
        return jSkip;
    }

    public String toString() {
        return this.a.toString();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        long j = this.b;
        if (j >= 0 && this.c >= j) {
            return -1;
        }
        int i3 = this.a.read(bArr, i, (int) (j >= 0 ? Math.min(i2, j - this.c) : i2));
        if (i3 == -1) {
            return -1;
        }
        this.c += (long) i3;
        return i3;
    }

    public BoundedInputStream(InputStream inputStream) {
        this(inputStream, -1L);
    }
}
