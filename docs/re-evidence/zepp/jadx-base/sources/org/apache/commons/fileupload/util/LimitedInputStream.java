package org.apache.commons.fileupload.util;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes23.dex */
public abstract class LimitedInputStream extends FilterInputStream implements Closeable {
    private final long a;
    private long b;
    private boolean c;

    public LimitedInputStream(InputStream inputStream, long j) {
        super(inputStream);
        this.a = j;
    }

    private void a() throws IOException {
        long j = this.b;
        long j2 = this.a;
        if (j > j2) {
            raiseError(j2, j);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable, org.apache.commons.fileupload.util.Closeable
    public void close() throws IOException {
        this.c = true;
        super.close();
    }

    @Override // org.apache.commons.fileupload.util.Closeable
    public boolean isClosed() throws IOException {
        return this.c;
    }

    public abstract void raiseError(long j, long j2) throws IOException;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i = super.read();
        if (i != -1) {
            this.b++;
            a();
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = super.read(bArr, i, i2);
        if (i3 > 0) {
            this.b += (long) i3;
            a();
        }
        return i3;
    }
}
