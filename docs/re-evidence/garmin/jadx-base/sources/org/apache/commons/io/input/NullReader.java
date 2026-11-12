package org.apache.commons.io.input;

import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public class NullReader extends Reader {
    private boolean eof;
    private long mark;
    private final boolean markSupported;
    private long position;
    private long readlimit;
    private final long size;
    private final boolean throwEofException;

    public NullReader(long j8, boolean z14, boolean z15) {
        this.mark = -1L;
        this.size = j8;
        this.markSupported = z14;
        this.throwEofException = z15;
    }

    private int doEndOfFile() throws EOFException {
        this.eof = true;
        if (!this.throwEofException) {
            return -1;
        }
        h.m();
        return 0;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.eof = false;
        this.position = 0L;
        this.mark = -1L;
    }

    public long getPosition() {
        return this.position;
    }

    public long getSize() {
        return this.size;
    }

    @Override // java.io.Reader
    public synchronized void mark(int i14) {
        if (!this.markSupported) {
            throw new UnsupportedOperationException("Mark not supported");
        }
        this.mark = this.position;
        this.readlimit = i14;
    }

    @Override // java.io.Reader
    public boolean markSupported() {
        return this.markSupported;
    }

    public int processChar() {
        return 0;
    }

    public void processChars(char[] cArr, int i14, int i15) {
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i14, int i15) throws IOException {
        if (this.eof) {
            h.C("Read after end of file");
            return 0;
        }
        long j8 = this.position;
        long j14 = this.size;
        if (j8 == j14) {
            return doEndOfFile();
        }
        long j15 = j8 + ((long) i15);
        this.position = j15;
        if (j15 > j14) {
            i15 -= (int) (j15 - j14);
            this.position = j14;
        }
        processChars(cArr, i14, i15);
        return i15;
    }

    @Override // java.io.Reader
    public synchronized void reset() {
        if (!this.markSupported) {
            throw new UnsupportedOperationException("Mark not supported");
        }
        long j8 = this.mark;
        if (j8 < 0) {
            throw new IOException("No position has been marked");
        }
        if (this.position > this.readlimit + j8) {
            throw new IOException("Marked position [" + this.mark + "] is no longer valid - passed the read limit [" + this.readlimit + "]");
        }
        this.position = j8;
        this.eof = false;
    }

    @Override // java.io.Reader
    public long skip(long j8) throws IOException {
        if (this.eof) {
            h.C("Skip after end of file");
            return 0L;
        }
        long j14 = this.position;
        long j15 = this.size;
        if (j14 == j15) {
            return doEndOfFile();
        }
        long j16 = j14 + j8;
        this.position = j16;
        if (j16 <= j15) {
            return j8;
        }
        long j17 = j8 - (j16 - j15);
        this.position = j15;
        return j17;
    }

    public NullReader(long j8) {
        this(j8, true, false);
    }

    public NullReader() {
        this(0L, true, false);
    }

    @Override // java.io.Reader
    public int read(char[] cArr) {
        return read(cArr, 0, cArr.length);
    }

    @Override // java.io.Reader
    public int read() throws IOException {
        if (!this.eof) {
            long j8 = this.position;
            if (j8 == this.size) {
                return doEndOfFile();
            }
            this.position = j8 + 1;
            return processChar();
        }
        h.C("Read after end of file");
        return 0;
    }
}
