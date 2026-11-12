package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.util.Assertions;

/* JADX INFO: loaded from: classes2.dex */
public final class VorbisBitArray {
    private final byte[] a;
    private final int b;
    private int c;
    private int d;

    public VorbisBitArray(byte[] data) {
        this.a = data;
        this.b = data.length;
    }

    private void a() {
        int i;
        int i2 = this.c;
        Assertions.checkState(i2 >= 0 && (i2 < (i = this.b) || (i2 == i && this.d == 0)));
    }

    public int bitsLeft() {
        return ((this.b - this.c) * 8) - this.d;
    }

    public int getPosition() {
        return (this.c * 8) + this.d;
    }

    public boolean readBit() {
        boolean z = (((this.a[this.c] & 255) >> this.d) & 1) == 1;
        skipBits(1);
        return z;
    }

    public int readBits(int numBits) {
        int i = this.c;
        int iMin = Math.min(numBits, 8 - this.d);
        int i2 = i + 1;
        int i3 = ((this.a[i] & 255) >> this.d) & (255 >> (8 - iMin));
        while (iMin < numBits) {
            i3 |= (this.a[i2] & 255) << iMin;
            iMin += 8;
            i2++;
        }
        int i4 = i3 & ((-1) >>> (32 - numBits));
        skipBits(numBits);
        return i4;
    }

    public void reset() {
        this.c = 0;
        this.d = 0;
    }

    public void setPosition(int position) {
        int i = position / 8;
        this.c = i;
        this.d = position - (i * 8);
        a();
    }

    public void skipBits(int numBits) {
        int i = numBits / 8;
        int i2 = this.c + i;
        this.c = i2;
        int i3 = this.d + (numBits - (i * 8));
        this.d = i3;
        if (i3 > 7) {
            this.c = i2 + 1;
            this.d = i3 - 8;
        }
        a();
    }
}
