package org.apache.commons.io.input;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes23.dex */
public class BrokenInputStream extends InputStream {
    private final IOException a;

    public BrokenInputStream(IOException iOException) {
        this.a = iOException;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        throw this.a;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        throw this.a;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        throw this.a;
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        throw this.a;
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        throw this.a;
    }

    public BrokenInputStream() {
        this(new IOException("Broken input stream"));
    }
}
