package com.squareup.picasso;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes18.dex */
final class l extends InputStream {
    private static final int f = 4096;
    private final InputStream a;
    private long b;
    private long c;
    private long d;
    private long e;

    public l(InputStream inputStream) {
        this(inputStream, 4096);
    }

    private void c(long j) {
        try {
            long j2 = this.c;
            long j3 = this.b;
            if (j2 >= j3 || j3 > this.d) {
                this.c = j3;
                this.a.mark((int) (j - j3));
            } else {
                this.a.reset();
                this.a.mark((int) (j - this.c));
                d(this.c, this.b);
            }
            this.d = j;
        } catch (IOException e) {
            throw new IllegalStateException("Unable to mark: " + e);
        }
    }

    private void d(long j, long j2) throws IOException {
        while (j < j2) {
            long jSkip = this.a.skip(j2 - j);
            if (jSkip == 0) {
                if (read() == -1) {
                    return;
                } else {
                    jSkip = 1;
                }
            }
            j += jSkip;
        }
    }

    public void a(long j) throws IOException {
        if (this.b > this.d || j < this.c) {
            throw new IOException("Cannot reset");
        }
        this.a.reset();
        d(this.c, j);
        this.b = j;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.a.available();
    }

    public long b(int i) {
        long j = this.b + ((long) i);
        if (this.d < j) {
            c(j);
        }
        return this.b;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.a.close();
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        this.e = b(i);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.a.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        int i = this.a.read();
        if (i != -1) {
            this.b++;
        }
        return i;
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        a(this.e);
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        long jSkip = this.a.skip(j);
        this.b += jSkip;
        return jSkip;
    }

    public l(InputStream inputStream, int i) {
        this.e = -1L;
        this.a = inputStream.markSupported() ? inputStream : new BufferedInputStream(inputStream, i);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        int i = this.a.read(bArr);
        if (i != -1) {
            this.b += (long) i;
        }
        return i;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.a.read(bArr, i, i2);
        if (i3 != -1) {
            this.b += (long) i3;
        }
        return i3;
    }
}
