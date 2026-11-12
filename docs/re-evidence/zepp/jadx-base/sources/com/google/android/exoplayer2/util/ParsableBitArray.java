package com.google.android.exoplayer2.util;

import com.google.common.base.Charsets;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public final class ParsableBitArray {
    private int a;
    private int b;
    private int c;
    public byte[] data;

    public ParsableBitArray() {
        this.data = Util.EMPTY_BYTE_ARRAY;
    }

    private void a() {
        int i;
        int i2 = this.a;
        Assertions.checkState(i2 >= 0 && (i2 < (i = this.c) || (i2 == i && this.b == 0)));
    }

    public int bitsLeft() {
        return ((this.c - this.a) * 8) - this.b;
    }

    public void byteAlign() {
        if (this.b == 0) {
            return;
        }
        this.b = 0;
        this.a++;
        a();
    }

    public int getBytePosition() {
        Assertions.checkState(this.b == 0);
        return this.a;
    }

    public int getPosition() {
        return (this.a * 8) + this.b;
    }

    public void putInt(int value, int numBits) {
        if (numBits < 32) {
            value &= (1 << numBits) - 1;
        }
        int iMin = Math.min(8 - this.b, numBits);
        int i = this.b;
        int i2 = (8 - i) - iMin;
        byte[] bArr = this.data;
        int i3 = this.a;
        bArr[i3] = (byte) (((65280 >> i) | ((1 << i2) - 1)) & bArr[i3]);
        int i4 = numBits - iMin;
        bArr[i3] = (byte) (((value >>> i4) << i2) | bArr[i3]);
        int i5 = i3 + 1;
        while (i4 > 8) {
            this.data[i5] = (byte) (value >>> (i4 - 8));
            i4 -= 8;
            i5++;
        }
        int i6 = 8 - i4;
        byte[] bArr2 = this.data;
        bArr2[i5] = (byte) (bArr2[i5] & ((1 << i6) - 1));
        bArr2[i5] = (byte) (((value & ((1 << i4) - 1)) << i6) | bArr2[i5]);
        skipBits(numBits);
        a();
    }

    public boolean readBit() {
        boolean z = (this.data[this.a] & (128 >> this.b)) != 0;
        skipBit();
        return z;
    }

    public int readBits(int numBits) {
        int i;
        if (numBits == 0) {
            return 0;
        }
        this.b += numBits;
        int i2 = 0;
        while (true) {
            i = this.b;
            if (i <= 8) {
                break;
            }
            int i3 = i - 8;
            this.b = i3;
            byte[] bArr = this.data;
            int i4 = this.a;
            this.a = i4 + 1;
            i2 |= (bArr[i4] & 255) << i3;
        }
        byte[] bArr2 = this.data;
        int i5 = this.a;
        int i6 = ((-1) >>> (32 - numBits)) & (i2 | ((bArr2[i5] & 255) >> (8 - i)));
        if (i == 8) {
            this.b = 0;
            this.a = i5 + 1;
        }
        a();
        return i6;
    }

    public long readBitsToLong(int numBits) {
        return numBits <= 32 ? Util.toUnsignedLong(readBits(numBits)) : Util.toLong(readBits(numBits - 32), readBits(32));
    }

    public void readBytes(byte[] buffer, int offset, int length) {
        Assertions.checkState(this.b == 0);
        System.arraycopy(this.data, this.a, buffer, offset, length);
        this.a += length;
        a();
    }

    public String readBytesAsString(int length) {
        return readBytesAsString(length, Charsets.UTF_8);
    }

    public void reset(byte[] data) {
        reset(data, data.length);
    }

    public void setPosition(int position) {
        int i = position / 8;
        this.a = i;
        this.b = position - (i * 8);
        a();
    }

    public void skipBit() {
        int i = this.b + 1;
        this.b = i;
        if (i == 8) {
            this.b = 0;
            this.a++;
        }
        a();
    }

    public void skipBits(int numBits) {
        int i = numBits / 8;
        int i2 = this.a + i;
        this.a = i2;
        int i3 = this.b + (numBits - (i * 8));
        this.b = i3;
        if (i3 > 7) {
            this.a = i2 + 1;
            this.b = i3 - 8;
        }
        a();
    }

    public void skipBytes(int length) {
        Assertions.checkState(this.b == 0);
        this.a += length;
        a();
    }

    public String readBytesAsString(int length, Charset charset) {
        byte[] bArr = new byte[length];
        readBytes(bArr, 0, length);
        return new String(bArr, charset);
    }

    public void reset(ParsableByteArray parsableByteArray) {
        reset(parsableByteArray.getData(), parsableByteArray.limit());
        setPosition(parsableByteArray.getPosition() * 8);
    }

    public ParsableBitArray(byte[] data) {
        this(data, data.length);
    }

    public ParsableBitArray(byte[] data, int limit) {
        this.data = data;
        this.c = limit;
    }

    public void reset(byte[] data, int limit) {
        this.data = data;
        this.a = 0;
        this.b = 0;
        this.c = limit;
    }

    public void readBits(byte[] buffer, int offset, int numBits) {
        int i = (numBits >> 3) + offset;
        while (offset < i) {
            byte[] bArr = this.data;
            int i2 = this.a;
            int i3 = i2 + 1;
            this.a = i3;
            byte b = bArr[i2];
            int i4 = this.b;
            buffer[offset] = (byte) (b << i4);
            buffer[offset] = (byte) (((255 & bArr[i3]) >> (8 - i4)) | buffer[offset]);
            offset++;
        }
        int i5 = numBits & 7;
        if (i5 == 0) {
            return;
        }
        buffer[i] = (byte) (buffer[i] & (255 >> i5));
        int i6 = this.b;
        if (i6 + i5 > 8) {
            int i7 = buffer[i];
            byte[] bArr2 = this.data;
            int i8 = this.a;
            this.a = i8 + 1;
            buffer[i] = (byte) (i7 | ((bArr2[i8] & 255) << i6));
            this.b = i6 - 8;
        }
        int i9 = this.b + i5;
        this.b = i9;
        byte[] bArr3 = this.data;
        int i10 = this.a;
        buffer[i] = (byte) (((byte) (((255 & bArr3[i10]) >> (8 - i9)) << (8 - i5))) | buffer[i]);
        if (i9 == 8) {
            this.b = 0;
            this.a = i10 + 1;
        }
        a();
    }
}
