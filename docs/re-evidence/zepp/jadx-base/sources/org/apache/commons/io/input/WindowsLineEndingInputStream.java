package org.apache.commons.io.input;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes23.dex */
public class WindowsLineEndingInputStream extends InputStream {
    private boolean a = false;
    private boolean b = false;
    private boolean c = false;
    private boolean d = false;
    private final InputStream e;
    private final boolean f;

    public WindowsLineEndingInputStream(InputStream inputStream, boolean z) {
        this.e = inputStream;
        this.f = z;
    }

    private int a() {
        if (!this.f) {
            return -1;
        }
        boolean z = this.b;
        if (!z && !this.a) {
            this.a = true;
            return 13;
        }
        if (z) {
            return -1;
        }
        this.a = false;
        this.b = true;
        return 10;
    }

    private int b() throws IOException {
        int i = this.e.read();
        boolean z = i == -1;
        this.d = z;
        if (z) {
            return i;
        }
        this.a = i == 13;
        this.b = i == 10;
        return i;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
        this.e.close();
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i) {
        throw new UnsupportedOperationException("Mark not supported");
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.d) {
            return a();
        }
        if (this.c) {
            this.c = false;
            return 10;
        }
        boolean z = this.a;
        int iB = b();
        if (this.d) {
            return a();
        }
        if (iB != 10 || z) {
            return iB;
        }
        this.c = true;
        return 13;
    }
}
