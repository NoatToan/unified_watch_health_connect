package com.google.zxing.datamatrix.encoder;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public class DefaultPlacement {
    private final CharSequence a;
    private final int b;
    private final int c;
    private final byte[] d;

    public DefaultPlacement(CharSequence charSequence, int i, int i2) {
        this.a = charSequence;
        this.c = i;
        this.b = i2;
        byte[] bArr = new byte[i * i2];
        this.d = bArr;
        Arrays.fill(bArr, (byte) -1);
    }

    private void a(int i) {
        i(this.b - 1, 0, i, 1);
        i(this.b - 1, 1, i, 2);
        i(this.b - 1, 2, i, 3);
        i(0, this.c - 2, i, 4);
        i(0, this.c - 1, i, 5);
        i(1, this.c - 1, i, 6);
        i(2, this.c - 1, i, 7);
        i(3, this.c - 1, i, 8);
    }

    private void b(int i) {
        i(this.b - 3, 0, i, 1);
        i(this.b - 2, 0, i, 2);
        i(this.b - 1, 0, i, 3);
        i(0, this.c - 4, i, 4);
        i(0, this.c - 3, i, 5);
        i(0, this.c - 2, i, 6);
        i(0, this.c - 1, i, 7);
        i(1, this.c - 1, i, 8);
    }

    private void c(int i) {
        i(this.b - 3, 0, i, 1);
        i(this.b - 2, 0, i, 2);
        i(this.b - 1, 0, i, 3);
        i(0, this.c - 2, i, 4);
        i(0, this.c - 1, i, 5);
        i(1, this.c - 1, i, 6);
        i(2, this.c - 1, i, 7);
        i(3, this.c - 1, i, 8);
    }

    private void d(int i) {
        i(this.b - 1, 0, i, 1);
        i(this.b - 1, this.c - 1, i, 2);
        i(0, this.c - 3, i, 3);
        i(0, this.c - 2, i, 4);
        i(0, this.c - 1, i, 5);
        i(1, this.c - 3, i, 6);
        i(1, this.c - 2, i, 7);
        i(1, this.c - 1, i, 8);
    }

    private boolean h(int i, int i2) {
        return this.d[(i2 * this.c) + i] >= 0;
    }

    private void i(int i, int i2, int i3, int i4) {
        if (i < 0) {
            int i5 = this.b;
            i += i5;
            i2 += 4 - ((i5 + 4) % 8);
        }
        if (i2 < 0) {
            int i6 = this.c;
            i2 += i6;
            i += 4 - ((i6 + 4) % 8);
        }
        j(i2, i, (this.a.charAt(i3) & (1 << (8 - i4))) != 0);
    }

    private void j(int i, int i2, boolean z) {
        this.d[(i2 * this.c) + i] = z ? (byte) 1 : (byte) 0;
    }

    private void k(int i, int i2, int i3) {
        int i4 = i - 2;
        int i5 = i2 - 2;
        i(i4, i5, i3, 1);
        int i6 = i2 - 1;
        i(i4, i6, i3, 2);
        int i7 = i - 1;
        i(i7, i5, i3, 3);
        i(i7, i6, i3, 4);
        i(i7, i2, i3, 5);
        i(i, i5, i3, 6);
        i(i, i6, i3, 7);
        i(i, i2, i3, 8);
    }

    public final byte[] e() {
        return this.d;
    }

    public final int f() {
        return this.c;
    }

    public final int g() {
        return this.b;
    }

    public final boolean getBit(int i, int i2) {
        return this.d[(i2 * this.c) + i] == 1;
    }

    public final void place() {
        int i;
        int i2;
        int i3 = 0;
        int i4 = 0;
        int i5 = 4;
        while (true) {
            if (i5 == this.b && i3 == 0) {
                a(i4);
                i4++;
            }
            if (i5 == this.b - 2 && i3 == 0 && this.c % 4 != 0) {
                b(i4);
                i4++;
            }
            if (i5 == this.b - 2 && i3 == 0 && this.c % 8 == 4) {
                c(i4);
                i4++;
            }
            if (i5 == this.b + 4 && i3 == 2 && this.c % 8 == 0) {
                d(i4);
                i4++;
            }
            do {
                if (i5 < this.b && i3 >= 0 && !h(i3, i5)) {
                    k(i5, i3, i4);
                    i4++;
                }
                i5 -= 2;
                i3 += 2;
                if (i5 < 0) {
                    break;
                }
            } while (i3 < this.c);
            int i6 = i5 + 1;
            int i7 = i3 + 3;
            do {
                if (i6 >= 0 && i7 < this.c && !h(i7, i6)) {
                    k(i6, i7, i4);
                    i4++;
                }
                i6 += 2;
                i7 -= 2;
                i = this.b;
                if (i6 >= i) {
                    break;
                }
            } while (i7 >= 0);
            i5 = i6 + 3;
            i3 = i7 + 1;
            if (i5 >= i && i3 >= (i2 = this.c)) {
                break;
            }
        }
        if (h(i2 - 1, i - 1)) {
            return;
        }
        j(this.c - 1, this.b - 1, true);
        j(this.c - 2, this.b - 2, true);
    }
}
