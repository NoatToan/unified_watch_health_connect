package org.apache.commons.io.input;

import com.google.common.primitives.UnsignedBytes;
import java.io.InputStream;
import java.util.Objects;
import o2.c;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public class UnsynchronizedByteArrayInputStream extends InputStream {
    public static final int END_OF_STREAM = -1;
    private final byte[] data;
    private final int eod;
    private int markedOffset;
    private int offset;

    public UnsynchronizedByteArrayInputStream(byte[] bArr, int i14, int i15) {
        Objects.requireNonNull(bArr);
        if (i14 < 0) {
            h.s("offset cannot be negative");
            throw null;
        }
        if (i15 < 0) {
            h.s("length cannot be negative");
            throw null;
        }
        this.data = bArr;
        int iMin = Math.min(i14, bArr.length > 0 ? bArr.length : i14);
        this.offset = iMin;
        this.eod = Math.min(iMin + i15, bArr.length);
        this.markedOffset = this.offset;
    }

    @Override // java.io.InputStream
    public int available() {
        int i14 = this.offset;
        int i15 = this.eod;
        if (i14 < i15) {
            return i15 - i14;
        }
        return 0;
    }

    @Override // java.io.InputStream
    public void mark(int i14) {
        this.markedOffset = this.offset;
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i14, int i15) {
        Objects.requireNonNull(bArr);
        if (i14 < 0 || i15 < 0 || i14 + i15 > bArr.length) {
            c.q();
            return 0;
        }
        int i16 = this.offset;
        int i17 = this.eod;
        if (i16 >= i17) {
            return -1;
        }
        int i18 = i17 - i16;
        if (i15 >= i18) {
            i15 = i18;
        }
        if (i15 <= 0) {
            return 0;
        }
        System.arraycopy(this.data, i16, bArr, i14, i15);
        this.offset += i15;
        return i15;
    }

    @Override // java.io.InputStream
    public void reset() {
        this.offset = this.markedOffset;
    }

    @Override // java.io.InputStream
    public long skip(long j8) {
        if (j8 < 0) {
            h.s("Skipping backward is not supported");
            return 0L;
        }
        int i14 = this.eod;
        int i15 = this.offset;
        long j14 = i14 - i15;
        if (j8 >= j14) {
            j8 = j14;
        }
        this.offset = (int) (((long) i15) + j8);
        return j8;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        Objects.requireNonNull(bArr);
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read() {
        int i14 = this.offset;
        if (i14 >= this.eod) {
            return -1;
        }
        byte[] bArr = this.data;
        this.offset = i14 + 1;
        return bArr[i14] & UnsignedBytes.MAX_VALUE;
    }

    public UnsynchronizedByteArrayInputStream(byte[] bArr, int i14) {
        Objects.requireNonNull(bArr);
        if (i14 >= 0) {
            this.data = bArr;
            int iMin = Math.min(i14, bArr.length > 0 ? bArr.length : i14);
            this.offset = iMin;
            this.eod = bArr.length;
            this.markedOffset = iMin;
            return;
        }
        h.s("offset cannot be negative");
        throw null;
    }

    public UnsynchronizedByteArrayInputStream(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.data = bArr;
        this.offset = 0;
        this.eod = bArr.length;
        this.markedOffset = 0;
    }
}
