package com.google.android.exoplayer2.util;

import com.google.common.base.Charsets;
import com.google.common.primitives.UnsignedBytes;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes14.dex */
public final class ParsableBitArray {
    private int bitOffset;
    private int byteLimit;
    private int byteOffset;
    public byte[] data;

    public ParsableBitArray() {
        this.data = Util.EMPTY_BYTE_ARRAY;
    }

    private void assertValidOffset() {
        int i14;
        int i15 = this.byteOffset;
        Assertions.checkState(i15 >= 0 && (i15 < (i14 = this.byteLimit) || (i15 == i14 && this.bitOffset == 0)));
    }

    public int bitsLeft() {
        return ((this.byteLimit - this.byteOffset) * 8) - this.bitOffset;
    }

    public void byteAlign() {
        if (this.bitOffset == 0) {
            return;
        }
        this.bitOffset = 0;
        this.byteOffset++;
        assertValidOffset();
    }

    public int getBytePosition() {
        Assertions.checkState(this.bitOffset == 0);
        return this.byteOffset;
    }

    public int getPosition() {
        return (this.byteOffset * 8) + this.bitOffset;
    }

    public void putInt(int i14, int i15) {
        if (i15 < 32) {
            i14 &= (1 << i15) - 1;
        }
        int iMin = Math.min(8 - this.bitOffset, i15);
        int i16 = this.bitOffset;
        int i17 = (8 - i16) - iMin;
        byte[] bArr = this.data;
        int i18 = this.byteOffset;
        byte b14 = (byte) (((65280 >> i16) | ((1 << i17) - 1)) & bArr[i18]);
        bArr[i18] = b14;
        int i19 = i15 - iMin;
        bArr[i18] = (byte) (b14 | ((i14 >>> i19) << i17));
        int i24 = i18 + 1;
        while (true) {
            byte[] bArr2 = this.data;
            if (i19 <= 8) {
                int i25 = 8 - i19;
                byte b15 = (byte) (bArr2[i24] & ((1 << i25) - 1));
                bArr2[i24] = b15;
                bArr2[i24] = (byte) (((i14 & ((1 << i19) - 1)) << i25) | b15);
                skipBits(i15);
                assertValidOffset();
                return;
            }
            bArr2[i24] = (byte) (i14 >>> (i19 - 8));
            i19 -= 8;
            i24++;
        }
    }

    public boolean readBit() {
        boolean z14 = (this.data[this.byteOffset] & (128 >> this.bitOffset)) != 0;
        skipBit();
        return z14;
    }

    public void readBits(byte[] bArr, int i14, int i15) {
        int i16 = (i15 >> 3) + i14;
        while (i14 < i16) {
            byte[] bArr2 = this.data;
            int i17 = this.byteOffset;
            int i18 = i17 + 1;
            this.byteOffset = i18;
            byte b14 = bArr2[i17];
            int i19 = this.bitOffset;
            byte b15 = (byte) (b14 << i19);
            bArr[i14] = b15;
            bArr[i14] = (byte) (((255 & bArr2[i18]) >> (8 - i19)) | b15);
            i14++;
        }
        int i24 = i15 & 7;
        if (i24 == 0) {
            return;
        }
        byte b16 = (byte) (bArr[i16] & (255 >> i24));
        bArr[i16] = b16;
        int i25 = this.bitOffset;
        if (i25 + i24 > 8) {
            byte[] bArr3 = this.data;
            int i26 = this.byteOffset;
            this.byteOffset = i26 + 1;
            bArr[i16] = (byte) (b16 | ((bArr3[i26] & UnsignedBytes.MAX_VALUE) << i25));
            this.bitOffset = i25 - 8;
        }
        int i27 = this.bitOffset + i24;
        this.bitOffset = i27;
        byte[] bArr4 = this.data;
        int i28 = this.byteOffset;
        bArr[i16] = (byte) (((byte) (((255 & bArr4[i28]) >> (8 - i27)) << (8 - i24))) | bArr[i16]);
        if (i27 == 8) {
            this.bitOffset = 0;
            this.byteOffset = i28 + 1;
        }
        assertValidOffset();
    }

    public long readBitsToLong(int i14) {
        return i14 <= 32 ? Util.toUnsignedLong(readBits(i14)) : Util.toLong(readBits(i14 - 32), readBits(32));
    }

    public void readBytes(byte[] bArr, int i14, int i15) {
        Assertions.checkState(this.bitOffset == 0);
        System.arraycopy(this.data, this.byteOffset, bArr, i14, i15);
        this.byteOffset += i15;
        assertValidOffset();
    }

    public String readBytesAsString(int i14, Charset charset) {
        byte[] bArr = new byte[i14];
        readBytes(bArr, 0, i14);
        return new String(bArr, charset);
    }

    public void reset(ParsableByteArray parsableByteArray) {
        reset(parsableByteArray.getData(), parsableByteArray.limit());
        setPosition(parsableByteArray.getPosition() * 8);
    }

    public void setPosition(int i14) {
        int i15 = i14 / 8;
        this.byteOffset = i15;
        this.bitOffset = i14 - (i15 * 8);
        assertValidOffset();
    }

    public void skipBit() {
        int i14 = this.bitOffset + 1;
        this.bitOffset = i14;
        if (i14 == 8) {
            this.bitOffset = 0;
            this.byteOffset++;
        }
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

    public void skipBytes(int i14) {
        Assertions.checkState(this.bitOffset == 0);
        this.byteOffset += i14;
        assertValidOffset();
    }

    public ParsableBitArray(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public ParsableBitArray(byte[] bArr, int i14) {
        this.data = bArr;
        this.byteLimit = i14;
    }

    public String readBytesAsString(int i14) {
        return readBytesAsString(i14, Charsets.UTF_8);
    }

    public void reset(byte[] bArr) {
        reset(bArr, bArr.length);
    }

    public void reset(byte[] bArr, int i14) {
        this.data = bArr;
        this.byteOffset = 0;
        this.bitOffset = 0;
        this.byteLimit = i14;
    }

    public int readBits(int i14) {
        int i15;
        if (i14 == 0) {
            return 0;
        }
        this.bitOffset += i14;
        int i16 = 0;
        while (true) {
            i15 = this.bitOffset;
            if (i15 <= 8) {
                break;
            }
            int i17 = i15 - 8;
            this.bitOffset = i17;
            byte[] bArr = this.data;
            int i18 = this.byteOffset;
            this.byteOffset = i18 + 1;
            i16 |= (bArr[i18] & UnsignedBytes.MAX_VALUE) << i17;
        }
        byte[] bArr2 = this.data;
        int i19 = this.byteOffset;
        int i24 = ((-1) >>> (32 - i14)) & (i16 | ((bArr2[i19] & UnsignedBytes.MAX_VALUE) >> (8 - i15)));
        if (i15 == 8) {
            this.bitOffset = 0;
            this.byteOffset = i19 + 1;
        }
        assertValidOffset();
        return i24;
    }
}
