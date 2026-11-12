package org.apache.commons.io.output;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes23.dex */
public class BrokenOutputStream extends OutputStream {
    private final IOException a;

    public BrokenOutputStream(IOException iOException) {
        this.a = iOException;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        throw this.a;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        throw this.a;
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        throw this.a;
    }

    public BrokenOutputStream() {
        this(new IOException("Broken output stream"));
    }
}
