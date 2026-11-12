package com.google.zxing.datamatrix.decoder;

/* JADX INFO: loaded from: classes4.dex */
final class b {
    private final int a;
    private final byte[] b;

    private b(int i, byte[] bArr) {
        this.a = i;
        this.b = bArr;
    }

    public static b[] b(byte[] bArr, Version version) {
        Version.c cVarB = version.b();
        Version.b[] bVarArrA = cVarB.a();
        int iA = 0;
        for (Version.b bVar : bVarArrA) {
            iA += bVar.a();
        }
        b[] bVarArr = new b[iA];
        int i = 0;
        for (Version.b bVar2 : bVarArrA) {
            int i2 = 0;
            while (i2 < bVar2.a()) {
                int iB = bVar2.b();
                bVarArr[i] = new b(iB, new byte[cVarB.b() + iB]);
                i2++;
                i++;
            }
        }
        int length = bVarArr[0].b.length - cVarB.b();
        int i3 = length - 1;
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            int i6 = 0;
            while (i6 < i) {
                bVarArr[i6].b[i5] = bArr[i4];
                i6++;
                i4++;
            }
        }
        boolean z = version.getVersionNumber() == 24;
        int i7 = z ? 8 : i;
        int i8 = 0;
        while (i8 < i7) {
            bVarArr[i8].b[i3] = bArr[i4];
            i8++;
            i4++;
        }
        int length2 = bVarArr[0].b.length;
        while (length < length2) {
            int i9 = 0;
            while (i9 < i) {
                int i10 = z ? (i9 + 8) % i : i9;
                bVarArr[i10].b[(!z || i10 <= 7) ? length : length - 1] = bArr[i4];
                i9++;
                i4++;
            }
            length++;
        }
        if (i4 == bArr.length) {
            return bVarArr;
        }
        throw new IllegalArgumentException();
    }

    public byte[] a() {
        return this.b;
    }

    public int c() {
        return this.a;
    }
}
