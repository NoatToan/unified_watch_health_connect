package com.google.common.io;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;
import java.util.Objects;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
@ElementTypesAreNonnullByDefault
@J2ktIncompatible
@GwtIncompatible
final class CharSequenceReader extends Reader {
    private int mark;
    private int pos;
    private CharSequence seq;

    public CharSequenceReader(CharSequence charSequence) {
        this.seq = (CharSequence) Preconditions.checkNotNull(charSequence);
    }

    private void checkOpen() throws IOException {
        if (this.seq != null) {
            return;
        }
        h.C("reader closed");
    }

    private boolean hasRemaining() {
        return remaining() > 0;
    }

    private int remaining() {
        Objects.requireNonNull(this.seq);
        return this.seq.length() - this.pos;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.seq = null;
    }

    @Override // java.io.Reader
    public synchronized void mark(int i14) {
        Preconditions.checkArgument(i14 >= 0, "readAheadLimit (%s) may not be negative", i14);
        checkOpen();
        this.mark = this.pos;
    }

    @Override // java.io.Reader
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.Reader, java.lang.Readable
    public synchronized int read(CharBuffer charBuffer) {
        Preconditions.checkNotNull(charBuffer);
        checkOpen();
        Objects.requireNonNull(this.seq);
        if (!hasRemaining()) {
            return -1;
        }
        int iMin = Math.min(charBuffer.remaining(), remaining());
        for (int i14 = 0; i14 < iMin; i14++) {
            CharSequence charSequence = this.seq;
            int i15 = this.pos;
            this.pos = i15 + 1;
            charBuffer.put(charSequence.charAt(i15));
        }
        return iMin;
    }

    @Override // java.io.Reader
    public synchronized boolean ready() {
        checkOpen();
        return true;
    }

    @Override // java.io.Reader
    public synchronized void reset() {
        checkOpen();
        this.pos = this.mark;
    }

    @Override // java.io.Reader
    public synchronized long skip(long j8) {
        int iMin;
        Preconditions.checkArgument(j8 >= 0, "n (%s) may not be negative", j8);
        checkOpen();
        iMin = (int) Math.min(remaining(), j8);
        this.pos += iMin;
        return iMin;
    }

    @Override // java.io.Reader
    public synchronized int read() {
        int iCharAt;
        checkOpen();
        Objects.requireNonNull(this.seq);
        if (hasRemaining()) {
            CharSequence charSequence = this.seq;
            int i14 = this.pos;
            this.pos = i14 + 1;
            iCharAt = charSequence.charAt(i14);
        } else {
            iCharAt = -1;
        }
        return iCharAt;
    }

    @Override // java.io.Reader
    public synchronized int read(char[] cArr, int i14, int i15) {
        Preconditions.checkPositionIndexes(i14, i14 + i15, cArr.length);
        checkOpen();
        Objects.requireNonNull(this.seq);
        if (!hasRemaining()) {
            return -1;
        }
        int iMin = Math.min(i15, remaining());
        for (int i16 = 0; i16 < iMin; i16++) {
            CharSequence charSequence = this.seq;
            int i17 = this.pos;
            this.pos = i17 + 1;
            cArr[i14 + i16] = charSequence.charAt(i17);
        }
        return iMin;
    }
}
