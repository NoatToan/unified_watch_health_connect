package com.huawei.hms.scankit.p;

/* JADX INFO: loaded from: classes34.dex */
final class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f16064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f16065b;

    private e1(int i, byte[] bArr) {
        this.f16064a = i;
        this.f16065b = bArr;
    }

    byte[] a() {
        return this.f16065b;
    }

    int b() {
        return this.f16064a;
    }

    static e1[] a(byte[] bArr, z7 z7Var) {
        z7.c cVarD = z7Var.d();
        z7.b[] bVarArrA = cVarD.a();
        int iA = 0;
        for (z7.b bVar : bVarArrA) {
            iA += bVar.a();
        }
        e1[] e1VarArr = new e1[iA];
        int i = 0;
        for (z7.b bVar2 : bVarArrA) {
            int i2 = 0;
            while (i2 < bVar2.a()) {
                int iB = bVar2.b();
                e1VarArr[i] = new e1(iB, new byte[cVarD.b() + iB]);
                i2++;
                i++;
            }
        }
        int length = e1VarArr[0].f16065b.length - cVarD.b();
        int i3 = length - 1;
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            int i6 = 0;
            while (i6 < i) {
                e1VarArr[i6].f16065b[i5] = bArr[i4];
                i6++;
                i4++;
            }
        }
        boolean z = z7Var.h() == 24;
        int i7 = z ? 8 : i;
        int i8 = 0;
        while (i8 < i7) {
            e1VarArr[i8].f16065b[i3] = bArr[i4];
            i8++;
            i4++;
        }
        int length2 = e1VarArr[0].f16065b.length;
        while (length < length2) {
            int i9 = 0;
            while (i9 < i) {
                int i10 = z ? (i9 + 8) % i : i9;
                e1VarArr[i10].f16065b[(!z || i10 <= 7) ? length : length - 1] = bArr[i4];
                i9++;
                i4++;
            }
            length++;
        }
        if (i4 == bArr.length) {
            return e1VarArr;
        }
        throw new IllegalArgumentException();
    }
}
