package com.google.android.exoplayer2.util;

/* JADX INFO: loaded from: classes3.dex */
public final class ParsableNalUnitBitArray {
    private byte[] a;
    private int b;
    private int c;
    private int d;

    public ParsableNalUnitBitArray(byte[] data, int offset, int limit) {
        reset(data, offset, limit);
    }

    private void a() {
        int i;
        int i2 = this.c;
        Assertions.checkState(i2 >= 0 && (i2 < (i = this.b) || (i2 == i && this.d == 0)));
    }

    private int b() {
        int i = 0;
        while (!readBit()) {
            i++;
        }
        return ((1 << i) - 1) + (i > 0 ? readBits(i) : 0);
    }

    private boolean c(int offset) {
        if (2 <= offset && offset < this.b) {
            byte[] bArr = this.a;
            if (bArr[offset] == 3 && bArr[offset - 2] == 0 && bArr[offset - 1] == 0) {
                return true;
            }
        }
        return false;
    }

    public boolean canReadBits(int numBits) {
        int i = this.c;
        int i2 = numBits / 8;
        int i3 = i + i2;
        int i4 = (this.d + numBits) - (i2 * 8);
        if (i4 > 7) {
            i3++;
            i4 -= 8;
        }
        while (true) {
            i++;
            if (i > i3 || i3 >= this.b) {
                break;
            }
            if (c(i)) {
                i3++;
                i += 2;
            }
        }
        int i5 = this.b;
        if (i3 >= i5) {
            return i3 == i5 && i4 == 0;
        }
        return true;
    }

    public boolean canReadExpGolombCodedNum() {
        int i = this.c;
        int i2 = this.d;
        int i3 = 0;
        while (this.c < this.b && !readBit()) {
            i3++;
        }
        boolean z = this.c == this.b;
        this.c = i;
        this.d = i2;
        return !z && canReadBits((i3 * 2) + 1);
    }

    public boolean readBit() {
        boolean z = (this.a[this.c] & (128 >> this.d)) != 0;
        skipBit();
        return z;
    }

    public int readBits(int numBits) {
        int i;
        this.d += numBits;
        int i2 = 0;
        while (true) {
            i = this.d;
            int i3 = 2;
            if (i <= 8) {
                break;
            }
            int i4 = i - 8;
            this.d = i4;
            byte[] bArr = this.a;
            int i5 = this.c;
            i2 |= (bArr[i5] & 255) << i4;
            if (!c(i5 + 1)) {
                i3 = 1;
            }
            this.c = i5 + i3;
        }
        byte[] bArr2 = this.a;
        int i6 = this.c;
        int i7 = ((-1) >>> (32 - numBits)) & (i2 | ((bArr2[i6] & 255) >> (8 - i)));
        if (i == 8) {
            this.d = 0;
            this.c = i6 + (c(i6 + 1) ? 2 : 1);
        }
        a();
        return i7;
    }

    public int readSignedExpGolombCodedInt() {
        int iB = b();
        return (iB % 2 == 0 ? -1 : 1) * ((iB + 1) / 2);
    }

    public int readUnsignedExpGolombCodedInt() {
        return b();
    }

    public void reset(byte[] data, int offset, int limit) {
        this.a = data;
        this.c = offset;
        this.b = limit;
        this.d = 0;
        a();
    }

    public void skipBit() {
        int i = this.d + 1;
        this.d = i;
        if (i == 8) {
            this.d = 0;
            int i2 = this.c;
            this.c = i2 + (c(i2 + 1) ? 2 : 1);
        }
        a();
    }

    public void skipBits(int numBits) {
        int i = this.c;
        int i2 = numBits / 8;
        int i3 = i + i2;
        this.c = i3;
        int i4 = this.d + (numBits - (i2 * 8));
        this.d = i4;
        if (i4 > 7) {
            this.c = i3 + 1;
            this.d = i4 - 8;
        }
        while (true) {
            i++;
            if (i > this.c) {
                a();
                return;
            } else if (c(i)) {
                this.c++;
                i += 2;
            }
        }
    }
}
