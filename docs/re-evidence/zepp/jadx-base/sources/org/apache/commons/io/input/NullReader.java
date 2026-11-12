package org.apache.commons.io.input;

import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;

/* JADX INFO: loaded from: classes23.dex */
public class NullReader extends Reader {
    private final long a;
    private long b;
    private long c;
    private long d;
    private boolean e;
    private final boolean f;
    private final boolean g;

    public NullReader(long j) {
        this(j, true, false);
    }

    private int a() throws EOFException {
        this.e = true;
        if (this.f) {
            throw new EOFException();
        }
        return -1;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.e = false;
        this.b = 0L;
        this.c = -1L;
    }

    public long getPosition() {
        return this.b;
    }

    public long getSize() {
        return this.a;
    }

    @Override // java.io.Reader
    public synchronized void mark(int i) {
        if (!this.g) {
            throw new UnsupportedOperationException("Mark not supported");
        }
        this.c = this.b;
        this.d = i;
    }

    @Override // java.io.Reader
    public boolean markSupported() {
        return this.g;
    }

    public int processChar() {
        return 0;
    }

    public void processChars(char[] cArr, int i, int i2) {
    }

    @Override // java.io.Reader
    public int read() throws IOException {
        if (this.e) {
            throw new IOException("Read after end of file");
        }
        long j = this.b;
        if (j == this.a) {
            return a();
        }
        this.b = j + 1;
        return processChar();
    }

    @Override // java.io.Reader
    public synchronized void reset() throws IOException {
        if (!this.g) {
            throw new UnsupportedOperationException("Mark not supported");
        }
        long j = this.c;
        if (j < 0) {
            throw new IOException("No position has been marked");
        }
        if (this.b > this.d + j) {
            throw new IOException("Marked position [" + this.c + "] is no longer valid - passed the read limit [" + this.d + "]");
        }
        this.b = j;
        this.e = false;
    }

    @Override // java.io.Reader
    public long skip(long j) throws IOException {
        if (this.e) {
            throw new IOException("Skip after end of file");
        }
        long j2 = this.b;
        long j3 = this.a;
        if (j2 == j3) {
            return a();
        }
        long j4 = j2 + j;
        this.b = j4;
        if (j4 <= j3) {
            return j;
        }
        long j5 = j - (j4 - j3);
        this.b = j3;
        return j5;
    }

    public NullReader(long j, boolean z, boolean z2) {
        this.c = -1L;
        this.a = j;
        this.g = z;
        this.f = z2;
    }

    @Override // java.io.Reader
    public int read(char[] cArr) throws IOException {
        return read(cArr, 0, cArr.length);
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i, int i2) throws IOException {
        if (!this.e) {
            long j = this.b;
            long j2 = this.a;
            if (j == j2) {
                return a();
            }
            long j3 = j + ((long) i2);
            this.b = j3;
            if (j3 > j2) {
                i2 -= (int) (j3 - j2);
                this.b = j2;
            }
            processChars(cArr, i, i2);
            return i2;
        }
        throw new IOException("Read after end of file");
    }
}
