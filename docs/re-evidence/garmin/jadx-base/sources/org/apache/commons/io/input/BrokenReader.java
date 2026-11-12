package org.apache.commons.io.input;

import java.io.IOException;
import java.io.Reader;

/* JADX INFO: loaded from: classes3.dex */
public class BrokenReader extends Reader {
    private final IOException exception;

    public BrokenReader() {
        this(new IOException("Broken reader"));
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        throw this.exception;
    }

    @Override // java.io.Reader
    public void mark(int i14) throws IOException {
        throw this.exception;
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i14, int i15) throws IOException {
        throw this.exception;
    }

    @Override // java.io.Reader
    public boolean ready() throws IOException {
        throw this.exception;
    }

    @Override // java.io.Reader
    public synchronized void reset() {
        throw this.exception;
    }

    @Override // java.io.Reader
    public long skip(long j8) throws IOException {
        throw this.exception;
    }

    public BrokenReader(IOException iOException) {
        this.exception = iOException;
    }
}
