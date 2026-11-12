package com.google.android.exoplayer2.util;

import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: loaded from: classes14.dex */
public final class ParsableNalUnitBitArray {
    private int bitOffset;
    private int byteLimit;
    private int byteOffset;
    private byte[] data;

    public ParsableNalUnitBitArray(byte[] bArr, int i14, int i15) {
        reset(bArr, i14, i15);
    }

    private void assertValidOffset() {
        int i14;
        int i15 = this.byteOffset;
        Assertions.checkState(i15 >= 0 && (i15 < (i14 = this.byteLimit) || (i15 == i14 && this.bitOffset == 0)));
    }

    private int readExpGolombCodeNum() {
        int i14 = 0;
        while (!readBit()) {
            i14++;
        }
        return ((1 << i14) - 1) + (i14 > 0 ? readBits(i14) : 0);
    }

    private boolean shouldSkipByte(int i14) {
        if (2 > i14 || i14 >= this.byteLimit) {
            return false;
        }
        byte[] bArr = this.data;
        return bArr[i14] == 3 && bArr[i14 + (-2)] == 0 && bArr[i14 - 1] == 0;
    }

    public boolean canReadBits(int i14) {
        int i15 = this.byteOffset;
        int i16 = i14 / 8;
        int i17 = i15 + i16;
        int i18 = (this.bitOffset + i14) - (i16 * 8);
        if (i18 > 7) {
            i17++;
            i18 -= 8;
        }
        while (true) {
            i15++;
            if (i15 > i17 || i17 >= this.byteLimit) {
                break;
            }
            if (shouldSkipByte(i15)) {
                i17++;
                i15 += 2;
            }
        }
        int i19 = this.byteLimit;
        if (i17 >= i19) {
            return i17 == i19 && i18 == 0;
        }
        return true;
    }

    public boolean canReadExpGolombCodedNum() {
        int i14 = this.byteOffset;
        int i15 = this.bitOffset;
        int i16 = 0;
        while (this.byteOffset < this.byteLimit && !readBit()) {
            i16++;
        }
        boolean z14 = this.byteOffset == this.byteLimit;
        this.byteOffset = i14;
        this.bitOffset = i15;
        return !z14 && canReadBits((i16 * 2) + 1);
    }

    public boolean readBit() {
        boolean z14 = (this.data[this.byteOffset] & (128 >> this.bitOffset)) != 0;
        skipBit();
        return z14;
    }

    public int readBits(int i14) {
        int i15;
        this.bitOffset += i14;
        int i16 = 0;
        while (true) {
            i15 = this.bitOffset;
            int i17 = 2;
            if (i15 <= 8) {
                break;
            }
            int i18 = i15 - 8;
            this.bitOffset = i18;
            byte[] bArr = this.data;
            int i19 = this.byteOffset;
            i16 |= (bArr[i19] & UnsignedBytes.MAX_VALUE) << i18;
            if (!shouldSkipByte(i19 + 1)) {
                i17 = 1;
            }
            this.byteOffset = i19 + i17;
        }
        byte[] bArr2 = this.data;
        int i24 = this.byteOffset;
        int i25 = ((-1) >>> (32 - i14)) & (i16 | ((bArr2[i24] & UnsignedBytes.MAX_VALUE) >> (8 - i15)));
        if (i15 == 8) {
            this.bitOffset = 0;
            this.byteOffset = i24 + (shouldSkipByte(i24 + 1) ? 2 : 1);
        }
        assertValidOffset();
        return i25;
    }

    public int readSignedExpGolombCodedInt() {
        int expGolombCodeNum = readExpGolombCodeNum();
        return ((expGolombCodeNum + 1) / 2) * (expGolombCodeNum % 2 == 0 ? -1 : 1);
    }

    public int readUnsignedExpGolombCodedInt() {
        return readExpGolombCodeNum();
    }

    public void reset(byte[] bArr, int i14, int i15) {
        this.data = bArr;
        this.byteOffset = i14;
        this.byteLimit = i15;
        this.bitOffset = 0;
        assertValidOffset();
    }

    public void skipBit() {
        int i14 = this.bitOffset + 1;
        this.bitOffset = i14;
        if (i14 == 8) {
            this.bitOffset = 0;
            int i15 = this.byteOffset;
            this.byteOffset = i15 + (shouldSkipByte(i15 + 1) ? 2 : 1);
        }
        assertValidOffset();
    }

    public void skipBits(int i14) {
        int i15 = this.byteOffset;
        int i16 = i14 / 8;
        int i17 = i15 + i16;
        this.byteOffset = i17;
        int i18 = (i14 - (i16 * 8)) + this.bitOffset;
        this.bitOffset = i18;
        if (i18 > 7) {
            this.byteOffset = i17 + 1;
            this.bitOffset = i18 - 8;
        }
        while (true) {
            i15++;
            if (i15 > this.byteOffset) {
                assertValidOffset();
                return;
            } else if (shouldSkipByte(i15)) {
                this.byteOffset++;
                i15 += 2;
            }
        }
    }
}
