package org.apache.commons.io.input;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes23.dex */
public class UnixLineEndingInputStream extends InputStream {
    private boolean a = false;
    private boolean b = false;
    private boolean c = false;
    private final InputStream d;
    private final boolean e;

    public UnixLineEndingInputStream(InputStream inputStream, boolean z) {
        this.d = inputStream;
        this.e = z;
    }

    private int a(boolean z) {
        if (z || !this.e || this.a) {
            return -1;
        }
        this.a = true;
        return 10;
    }

    private int b() throws IOException {
        int i = this.d.read();
        boolean z = i == -1;
        this.c = z;
        if (z) {
            return i;
        }
        this.a = i == 10;
        this.b = i == 13;
        return i;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
        this.d.close();
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i) {
        throw new UnsupportedOperationException("Mark notsupported");
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        boolean z = this.b;
        if (this.c) {
            return a(z);
        }
        int iB = b();
        if (this.c) {
            return a(z);
        }
        if (this.b) {
            return 10;
        }
        return (z && this.a) ? read() : iB;
    }
}
