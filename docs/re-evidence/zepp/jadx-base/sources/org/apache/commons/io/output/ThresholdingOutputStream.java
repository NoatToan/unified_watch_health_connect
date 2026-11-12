package org.apache.commons.io.output;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes23.dex */
public abstract class ThresholdingOutputStream extends OutputStream {
    private final int a;
    private long b;
    private boolean c;

    public ThresholdingOutputStream(int i) {
        this.a = i;
    }

    public void checkThreshold(int i) throws IOException {
        if (this.c || this.b + ((long) i) <= this.a) {
            return;
        }
        this.c = true;
        thresholdReached();
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            flush();
        } catch (IOException unused) {
        }
        getStream().close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        getStream().flush();
    }

    public long getByteCount() {
        return this.b;
    }

    public abstract OutputStream getStream() throws IOException;

    public int getThreshold() {
        return this.a;
    }

    public boolean isThresholdExceeded() {
        return this.b > ((long) this.a);
    }

    public void resetByteCount() {
        this.c = false;
        this.b = 0L;
    }

    public void setByteCount(long j) {
        this.b = j;
    }

    public abstract void thresholdReached() throws IOException;

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        checkThreshold(1);
        getStream().write(i);
        this.b++;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        checkThreshold(bArr.length);
        getStream().write(bArr);
        this.b += (long) bArr.length;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        checkThreshold(i2);
        getStream().write(bArr, i, i2);
        this.b += (long) i2;
    }
}
