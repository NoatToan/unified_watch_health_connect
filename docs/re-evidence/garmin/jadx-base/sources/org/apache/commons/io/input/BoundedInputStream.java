package org.apache.commons.io.input;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public class BoundedInputStream extends InputStream {

    /* JADX INFO: renamed from: in, reason: collision with root package name */
    private final InputStream f133446in;
    private long mark;
    private final long max;
    private long pos;
    private boolean propagateClose;

    public BoundedInputStream(InputStream inputStream, long j8) {
        this.pos = 0L;
        this.mark = -1L;
        this.propagateClose = true;
        this.max = j8;
        this.f133446in = inputStream;
    }

    @Override // java.io.InputStream
    public int available() {
        long j8 = this.max;
        if (j8 < 0 || this.pos < j8) {
            return this.f133446in.available();
        }
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.propagateClose) {
            this.f133446in.close();
        }
    }

    public boolean isPropagateClose() {
        return this.propagateClose;
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i14) {
        this.f133446in.mark(i14);
        this.mark = this.pos;
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f133446in.markSupported();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i14, int i15) throws IOException {
        long j8 = this.max;
        if (j8 >= 0 && this.pos >= j8) {
            return -1;
        }
        int i16 = this.f133446in.read(bArr, i14, (int) (j8 >= 0 ? Math.min(i15, j8 - this.pos) : i15));
        if (i16 == -1) {
            return -1;
        }
        this.pos += (long) i16;
        return i16;
    }

    @Override // java.io.InputStream
    public synchronized void reset() {
        this.f133446in.reset();
        this.pos = this.mark;
    }

    public void setPropagateClose(boolean z14) {
        this.propagateClose = z14;
    }

    @Override // java.io.InputStream
    public long skip(long j8) throws IOException {
        long j14 = this.max;
        if (j14 >= 0) {
            j8 = Math.min(j8, j14 - this.pos);
        }
        long jSkip = this.f133446in.skip(j8);
        this.pos += jSkip;
        return jSkip;
    }

    public String toString() {
        return this.f133446in.toString();
    }

    public BoundedInputStream(InputStream inputStream) {
        this(inputStream, -1L);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        long j8 = this.max;
        if (j8 >= 0 && this.pos >= j8) {
            return -1;
        }
        int i14 = this.f133446in.read();
        this.pos++;
        return i14;
    }
}
