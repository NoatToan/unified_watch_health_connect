package defpackage;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes3.dex */
public class wua extends t8f {
    public int[][] c;
    public int d;

    public wua(int i, int[][] iArr) {
        int[] iArr2 = iArr[0];
        if (iArr2.length != ((i + 31) >> 5)) {
            throw new ArithmeticException("Int array does not match given number of columns.");
        }
        this.f34453b = i;
        this.f34452a = iArr.length;
        this.d = iArr2.length;
        int i2 = i & 31;
        int i3 = i2 == 0 ? -1 : (1 << i2) - 1;
        for (int i4 = 0; i4 < this.f34452a; i4++) {
            int[] iArr3 = iArr[i4];
            int i5 = this.d - 1;
            iArr3[i5] = iArr3[i5] & i3;
        }
        this.c = iArr;
    }

    public byte[] c() {
        int i = (this.f34453b + 7) >>> 3;
        int i2 = this.f34452a;
        int i3 = 8;
        byte[] bArr = new byte[(i * i2) + 8];
        cie.a(i2, bArr, 0);
        cie.a(this.f34453b, bArr, 4);
        int i4 = this.f34453b;
        int i5 = i4 >>> 5;
        int i6 = i4 & 31;
        for (int i7 = 0; i7 < this.f34452a; i7++) {
            int i8 = 0;
            while (i8 < i5) {
                cie.a(this.c[i7][i8], bArr, i3);
                i8++;
                i3 += 4;
            }
            int i9 = 0;
            while (i9 < i6) {
                bArr[i3] = (byte) ((this.c[i7][i5] >>> i9) & 255);
                i9 += 8;
                i3++;
            }
        }
        return bArr;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof wua)) {
            return false;
        }
        wua wuaVar = (wua) obj;
        if (this.f34452a != wuaVar.f34452a || this.f34453b != wuaVar.f34453b || this.d != wuaVar.d) {
            return false;
        }
        for (int i = 0; i < this.f34452a; i++) {
            if (!icd.b(this.c[i], wuaVar.c[i])) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int iHashCode = (((this.f34452a * 31) + this.f34453b) * 31) + this.d;
        for (int i = 0; i < this.f34452a; i++) {
            iHashCode = (iHashCode * 31) + this.c[i].hashCode();
        }
        return iHashCode;
    }

    public String toString() {
        int i = this.f34453b & 31;
        int i2 = this.d;
        if (i != 0) {
            i2--;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i3 = 0; i3 < this.f34452a; i3++) {
            stringBuffer.append(i3 + ": ");
            for (int i4 = 0; i4 < i2; i4++) {
                int i5 = this.c[i3][i4];
                for (int i6 = 0; i6 < 32; i6++) {
                    if (((i5 >>> i6) & 1) == 0) {
                        stringBuffer.append('0');
                    } else {
                        stringBuffer.append('1');
                    }
                }
                stringBuffer.append(' ');
            }
            int i7 = this.c[i3][this.d - 1];
            for (int i8 = 0; i8 < i; i8++) {
                if (((i7 >>> i8) & 1) == 0) {
                    stringBuffer.append('0');
                } else {
                    stringBuffer.append('1');
                }
            }
            stringBuffer.append('\n');
        }
        return stringBuffer.toString();
    }

    public wua(wua wuaVar) {
        this.f34453b = wuaVar.a();
        this.f34452a = wuaVar.b();
        this.d = wuaVar.d;
        this.c = new int[wuaVar.c.length][];
        int i = 0;
        while (true) {
            int[][] iArr = this.c;
            if (i >= iArr.length) {
                return;
            }
            iArr[i] = icd.a(wuaVar.c[i]);
            i++;
        }
    }

    public wua(byte[] bArr) {
        if (bArr.length < 9) {
            throw new ArithmeticException("given array is not an encoded matrix over GF(2)");
        }
        this.f34452a = cie.e(bArr, 0);
        int iE = cie.e(bArr, 4);
        this.f34453b = iE;
        int i = this.f34452a;
        int i2 = ((iE + 7) >>> 3) * i;
        if (i > 0) {
            int i3 = 8;
            if (i2 == bArr.length - 8) {
                int i4 = (iE + 31) >>> 5;
                this.d = i4;
                this.c = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i, i4);
                int i5 = this.f34453b;
                int i6 = i5 >> 5;
                int i7 = i5 & 31;
                for (int i8 = 0; i8 < this.f34452a; i8++) {
                    int i9 = 0;
                    while (i9 < i6) {
                        this.c[i8][i9] = cie.e(bArr, i3);
                        i9++;
                        i3 += 4;
                    }
                    int i10 = 0;
                    while (i10 < i7) {
                        int[] iArr = this.c[i8];
                        iArr[i6] = ((bArr[i3] & 255) << i10) ^ iArr[i6];
                        i10 += 8;
                        i3++;
                    }
                }
                return;
            }
        }
        throw new ArithmeticException("given array is not an encoded matrix over GF(2)");
    }
}
