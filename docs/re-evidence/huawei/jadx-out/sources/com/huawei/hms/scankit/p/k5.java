package com.huawei.hms.scankit.p;

/* JADX INFO: loaded from: classes34.dex */
public final class k5 extends q3 {
    private s e;
    private p4 f;

    public k5(p4 p4Var) {
        super(p4Var);
        this.f = p4Var;
    }

    @Override // com.huawei.hms.scankit.p.q3, com.huawei.hms.scankit.p.o
    public s a() {
        s sVar = this.e;
        if (sVar != null) {
            return sVar;
        }
        p4 p4VarC = c();
        int iC = p4VarC.c();
        int iA = p4VarC.a();
        byte[] bArrB = p4VarC.b();
        s sVar2 = new s(iC, iA);
        byte[] bArrB2 = this.f.b();
        int iC2 = this.f.c();
        int iA2 = this.f.a();
        int i = 256;
        int[] iArr = new int[256];
        for (int i2 = 0; i2 < iA2; i2++) {
            for (int i3 = 0; i3 < iC2; i3++) {
                int i4 = bArrB2[(i2 * iC2) + i3] & 255;
                iArr[i4] = iArr[i4] + 1;
            }
        }
        int i5 = 0;
        int i6 = 0;
        double d = 0.0d;
        while (i5 < i) {
            int i7 = 0;
            int i8 = 0;
            double d2 = 0.0d;
            while (i7 < i5) {
                int i9 = iArr[i7];
                i8 += i9;
                d2 += (double) (i9 * i7);
                i7++;
                iArr = iArr;
                i = 256;
            }
            int[] iArr2 = iArr;
            int i10 = 0;
            double d3 = 0.0d;
            int i11 = i5;
            for (int i12 = i; i11 < i12; i12 = 256) {
                int i13 = iArr2[i11];
                i10 += i13;
                d3 += (double) (i13 * i11);
                i11++;
                i8 = i8;
            }
            int i14 = i8;
            double d4 = i14;
            int i15 = iC2;
            int i16 = iA2;
            double d5 = iC2 * iA2;
            double d6 = d4 / d5;
            byte[] bArr = bArrB;
            double d7 = i10;
            double d8 = d7 / d5;
            double d9 = i14 > 0 ? d2 / d4 : 0.0d;
            double d10 = i10 > 0 ? d3 / d7 : 0.0d;
            double d11 = (d6 * d9) + (d8 * d10);
            double d12 = d9 - d11;
            double d13 = d10 - d11;
            double d14 = (d6 * d12 * d12) + (d8 * d13 * d13);
            if (d14 > d) {
                i6 = i5;
                d = d14;
            }
            i5++;
            bArrB = bArr;
            iC2 = i15;
            iArr = iArr2;
            iA2 = i16;
            i = 256;
        }
        byte[] bArr2 = bArrB;
        for (int i17 = 0; i17 < iA; i17++) {
            for (int i18 = 0; i18 < iC; i18++) {
                if ((bArr2[(i17 * iC) + i18] & 255) <= i6) {
                    sVar2.c(i18, i17);
                }
            }
        }
        this.e = sVar2;
        return sVar2;
    }
}
