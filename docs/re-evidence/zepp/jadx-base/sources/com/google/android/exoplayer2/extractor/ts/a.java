package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.util.Assertions;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class a {
    private final int a;
    private boolean b;
    private boolean c;
    public byte[] d;
    public int e;

    public a(int targetType, int initialCapacity) {
        this.a = targetType;
        byte[] bArr = new byte[initialCapacity + 3];
        this.d = bArr;
        bArr[2] = 1;
    }

    public void a(byte[] data, int offset, int limit) {
        if (this.b) {
            int i = limit - offset;
            byte[] bArr = this.d;
            int length = bArr.length;
            int i2 = this.e;
            if (length < i2 + i) {
                this.d = Arrays.copyOf(bArr, (i2 + i) * 2);
            }
            System.arraycopy(data, offset, this.d, this.e, i);
            this.e += i;
        }
    }

    public boolean b(int discardPadding) {
        if (!this.b) {
            return false;
        }
        this.e -= discardPadding;
        this.b = false;
        this.c = true;
        return true;
    }

    public boolean c() {
        return this.c;
    }

    public void d() {
        this.b = false;
        this.c = false;
    }

    public void e(int type) {
        Assertions.checkState(!this.b);
        boolean z = type == this.a;
        this.b = z;
        if (z) {
            this.e = 3;
            this.c = false;
        }
    }
}
