package org.apache.commons.io.output;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ThresholdingOutputStream extends OutputStream {
    private final int threshold;
    private boolean thresholdExceeded;
    private long written;

    public ThresholdingOutputStream(int i14) {
        this.threshold = i14;
    }

    public void checkThreshold(int i14) {
        if (this.thresholdExceeded || this.written + ((long) i14) <= this.threshold) {
            return;
        }
        this.thresholdExceeded = true;
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
        return this.written;
    }

    public abstract OutputStream getStream();

    public int getThreshold() {
        return this.threshold;
    }

    public boolean isThresholdExceeded() {
        return this.written > ((long) this.threshold);
    }

    public void resetByteCount() {
        this.thresholdExceeded = false;
        this.written = 0L;
    }

    public void setByteCount(long j8) {
        this.written = j8;
    }

    public abstract void thresholdReached();

    @Override // java.io.OutputStream
    public void write(int i14) throws IOException {
        checkThreshold(1);
        getStream().write(i14);
        this.written++;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        checkThreshold(bArr.length);
        getStream().write(bArr);
        this.written += (long) bArr.length;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i14, int i15) throws IOException {
        checkThreshold(i15);
        getStream().write(bArr, i14, i15);
        this.written += (long) i15;
    }
}
