package com.huawei.hms.scankit.p;

/* JADX INFO: loaded from: classes34.dex */
final class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f16034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f16035b;

    private d1(int i, byte[] bArr) {
        this.f16034a = i;
        this.f16035b = bArr;
    }

    private static d1[] a(d1[] d1VarArr, byte[] bArr, int i, b8.b bVar, int i2, int i3) {
        int iB = i - bVar.b();
        int i4 = 0;
        for (int i5 = 0; i5 < iB; i5++) {
            int i6 = 0;
            while (i6 < i2) {
                d1VarArr[i6].f16035b[i5] = bArr[i4];
                i6++;
                i4++;
            }
        }
        int i7 = i3;
        while (i7 < i2) {
            d1VarArr[i7].f16035b[iB] = bArr[i4];
            i7++;
            i4++;
        }
        int length = d1VarArr[0].f16035b.length;
        while (iB < length) {
            int i8 = 0;
            while (i8 < i2) {
                int i9 = i8 < i3 ? iB : iB + 1;
                if (i8 >= 0 && i8 < d1VarArr.length && w7.a(d1VarArr[i8].f16035b, i9) && w7.a(bArr, i4)) {
                    d1VarArr[i8].f16035b[i9] = bArr[i4];
                    i8++;
                    i4++;
                } else {
                    throw new ArrayIndexOutOfBoundsException();
                }
            }
            iB++;
        }
        return d1VarArr;
    }

    int b() {
        return this.f16034a;
    }

    byte[] a() {
        return this.f16035b;
    }

    static d1[] a(byte[] bArr, b8 b8Var, b3 b3Var) {
        if (bArr.length == b8Var.e()) {
            b8.b bVarA = b8Var.a(b3Var);
            b8.a[] aVarArrA = bVarA.a();
            int iA = 0;
            for (b8.a aVar : aVarArrA) {
                iA += aVar.a();
            }
            d1[] d1VarArr = new d1[iA];
            int i = 0;
            for (b8.a aVar2 : aVarArrA) {
                int i2 = 0;
                while (i2 < aVar2.a()) {
                    int iB = aVar2.b();
                    d1VarArr[i] = new d1(iB, new byte[bVarA.b() + iB]);
                    i2++;
                    i++;
                }
            }
            int length = d1VarArr[0].f16035b.length;
            do {
                iA--;
                if (iA < 0) {
                    break;
                }
            } while (d1VarArr[iA].f16035b.length != length);
            return a(d1VarArr, bArr, length, bVarA, i, iA + 1);
        }
        throw new IllegalArgumentException();
    }
}
