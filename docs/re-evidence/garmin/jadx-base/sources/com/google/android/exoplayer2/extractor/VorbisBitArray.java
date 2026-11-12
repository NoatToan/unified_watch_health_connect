package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.util.Assertions;
import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: loaded from: classes13.dex */
public final class VorbisBitArray {
    private int bitOffset;
    private final int byteLimit;
    private int byteOffset;
    private final byte[] data;

    public VorbisBitArray(byte[] bArr) {
        this.data = bArr;
        this.byteLimit = bArr.length;
    }

    private void assertValidOffset() {
        int i14;
        int i15 = this.byteOffset;
        Assertions.checkState(i15 >= 0 && (i15 < (i14 = this.byteLimit) || (i15 == i14 && this.bitOffset == 0)));
    }

    public int bitsLeft() {
        return ((this.byteLimit - this.byteOffset) * 8) - this.bitOffset;
    }

    public int getPosition() {
        return (this.byteOffset * 8) + this.bitOffset;
    }

    public boolean readBit() {
        boolean z14 = (((this.data[this.byteOffset] & UnsignedBytes.MAX_VALUE) >> this.bitOffset) & 1) == 1;
        skipBits(1);
        return z14;
    }

    public int readBits(int i14) {
        int i15 = this.byteOffset;
        int iMin = Math.min(i14, 8 - this.bitOffset);
        int i16 = i15 + 1;
        int i17 = ((this.data[i15] & UnsignedBytes.MAX_VALUE) >> this.bitOffset) & (255 >> (8 - iMin));
        while (iMin < i14) {
            i17 |= (this.data[i16] & UnsignedBytes.MAX_VALUE) << iMin;
            iMin += 8;
            i16++;
        }
        int i18 = i17 & ((-1) >>> (32 - i14));
        skipBits(i14);
        return i18;
    }

    public void reset() {
        this.byteOffset = 0;
        this.bitOffset = 0;
    }

    public void setPosition(int i14) {
        int i15 = i14 / 8;
        this.byteOffset = i15;
        this.bitOffset = i14 - (i15 * 8);
        assertValidOffset();
    }

    public void skipBits(int i14) {
        int i15 = i14 / 8;
        int i16 = this.byteOffset + i15;
        this.byteOffset = i16;
        int i17 = (i14 - (i15 * 8)) + this.bitOffset;
        this.bitOffset = i17;
        if (i17 > 7) {
            this.byteOffset = i16 + 1;
            this.bitOffset = i17 - 8;
        }
        assertValidOffset();
    }
}
