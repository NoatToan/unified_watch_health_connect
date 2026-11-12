package org.apache.commons.io.input.buffer;

import am.j;
import com.google.firebase.messaging.l;
import fb1.c;
import java.util.Objects;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public class CircularByteBuffer {
    private final byte[] buffer;
    private int currentNumberOfBytes;
    private int endOffset;
    private int startOffset;

    public CircularByteBuffer(int i14) {
        this.buffer = new byte[i14];
        this.startOffset = 0;
        this.endOffset = 0;
        this.currentNumberOfBytes = 0;
    }

    public void add(byte[] bArr, int i14, int i15) {
        Objects.requireNonNull(bArr, "Buffer");
        if (i14 < 0 || i14 >= bArr.length) {
            h.s(j.h(i14, "Invalid offset: "));
            return;
        }
        if (i15 < 0) {
            h.s(j.h(i15, "Invalid length: "));
            return;
        }
        if (this.currentNumberOfBytes + i15 > this.buffer.length) {
            h.z("No space available");
            return;
        }
        for (int i16 = 0; i16 < i15; i16++) {
            byte[] bArr2 = this.buffer;
            int i17 = this.endOffset;
            bArr2[i17] = bArr[i14 + i16];
            int i18 = i17 + 1;
            this.endOffset = i18;
            if (i18 == bArr2.length) {
                this.endOffset = 0;
            }
        }
        this.currentNumberOfBytes += i15;
    }

    public void clear() {
        this.startOffset = 0;
        this.endOffset = 0;
        this.currentNumberOfBytes = 0;
    }

    public int getCurrentNumberOfBytes() {
        return this.currentNumberOfBytes;
    }

    public int getSpace() {
        return this.buffer.length - this.currentNumberOfBytes;
    }

    public boolean hasBytes() {
        return this.currentNumberOfBytes > 0;
    }

    public boolean hasSpace(int i14) {
        return this.currentNumberOfBytes + i14 <= this.buffer.length;
    }

    public boolean peek(byte[] bArr, int i14, int i15) {
        Objects.requireNonNull(bArr, "Buffer");
        if (i14 < 0 || i14 >= bArr.length) {
            h.s(j.h(i14, "Invalid offset: "));
            return false;
        }
        if (i15 < 0 || i15 > this.buffer.length) {
            h.s(j.h(i15, "Invalid length: "));
            return false;
        }
        if (i15 < this.currentNumberOfBytes) {
            return false;
        }
        int i16 = this.startOffset;
        for (int i17 = 0; i17 < i15; i17++) {
            byte[] bArr2 = this.buffer;
            if (bArr2[i16] != bArr[i17 + i14]) {
                return false;
            }
            i16++;
            if (i16 == bArr2.length) {
                i16 = 0;
            }
        }
        return true;
    }

    public void read(byte[] bArr, int i14, int i15) {
        Objects.requireNonNull(bArr);
        if (i14 < 0 || i14 >= bArr.length) {
            h.s(j.h(i14, "Invalid offset: "));
            return;
        }
        if (i15 < 0 || i15 > this.buffer.length) {
            h.s(j.h(i15, "Invalid length: "));
            return;
        }
        int i16 = i14 + i15;
        if (i16 > bArr.length) {
            l.h(" bytes, but offset, and length would require ", bArr.length, i16 - 1, "The supplied byte array contains only ");
            return;
        }
        if (this.currentNumberOfBytes < i15) {
            c.v("in the buffer, not ", this.currentNumberOfBytes, i15, "Currently, there are only ");
            return;
        }
        int i17 = 0;
        while (i17 < i15) {
            int i18 = i14 + 1;
            byte[] bArr2 = this.buffer;
            int i19 = this.startOffset;
            bArr[i14] = bArr2[i19];
            this.currentNumberOfBytes--;
            int i24 = i19 + 1;
            this.startOffset = i24;
            if (i24 == bArr2.length) {
                this.startOffset = 0;
            }
            i17++;
            i14 = i18;
        }
    }

    public boolean hasSpace() {
        return this.currentNumberOfBytes < this.buffer.length;
    }

    public CircularByteBuffer() {
        this(8192);
    }

    public void add(byte b14) {
        int i14 = this.currentNumberOfBytes;
        byte[] bArr = this.buffer;
        if (i14 < bArr.length) {
            int i15 = this.endOffset;
            bArr[i15] = b14;
            this.currentNumberOfBytes = i14 + 1;
            int i16 = i15 + 1;
            this.endOffset = i16;
            if (i16 == bArr.length) {
                this.endOffset = 0;
                return;
            }
            return;
        }
        h.z("No space available");
    }

    public byte read() {
        int i14 = this.currentNumberOfBytes;
        if (i14 > 0) {
            byte[] bArr = this.buffer;
            int i15 = this.startOffset;
            byte b14 = bArr[i15];
            this.currentNumberOfBytes = i14 - 1;
            int i16 = i15 + 1;
            this.startOffset = i16;
            if (i16 == bArr.length) {
                this.startOffset = 0;
            }
            return b14;
        }
        h.z("No bytes available.");
        return (byte) 0;
    }
}
