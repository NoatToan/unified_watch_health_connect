package com.huawei.hms.scankit.p;

/* JADX INFO: loaded from: classes34.dex */
public class q3 extends o {
    private static final byte[] d = new byte[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte[] f16277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int[] f16278c;

    public q3(p4 p4Var) {
        super(p4Var);
        this.f16277b = d;
        this.f16278c = new int[32];
    }

    private static int a(int[] iArr, boolean z) throws a {
        int length = iArr.length;
        boolean z2 = false;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = iArr[i4];
            if (i5 > i) {
                i3 = i4;
                i = i5;
            }
            if (i5 > i2) {
                i2 = i5;
            }
        }
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < length; i8++) {
            int i9 = i8 - i3;
            int i10 = iArr[i8] * i9 * i9;
            if (i10 > i7) {
                i6 = i8;
                i7 = i10;
            }
        }
        if (i3 <= i6) {
            int i11 = i3;
            i3 = i6;
            i6 = i11;
        }
        int i12 = i3 - i6;
        if (i12 <= length / 16) {
            throw a.a();
        }
        int i13 = i3 - 1;
        int i14 = -1;
        int i15 = i13;
        while (i13 > i6) {
            int i16 = i13 - i6;
            int i17 = i16 * i16 * (i3 - i13) * (i2 - iArr[i13]);
            if (i17 > i14) {
                i15 = i13;
                i14 = i17;
            }
            i13--;
        }
        if (z) {
            if (i15 < 10 && i14 < 100000 && i12 < 10) {
                z2 = true;
            }
            r3.t = z2;
        }
        return i15 << 3;
    }

    @Override // com.huawei.hms.scankit.p.o
    public s a() throws a {
        p4 p4VarC = c();
        int iC = p4VarC.c();
        int iA = p4VarC.a();
        a(iC);
        int[] iArr = this.f16278c;
        for (int i = 1; i < 5; i++) {
            byte[] bArrA = p4VarC.a((iA * i) / 5, this.f16277b);
            int i2 = (iC * 4) / 5;
            for (int i3 = iC / 5; i3 < i2; i3++) {
                int i4 = (bArrA[i3] & 255) >> 3;
                iArr[i4] = iArr[i4] + 1;
            }
        }
        int iA2 = a(iArr, true);
        byte[] bArrB = p4VarC.b();
        int i5 = (iC + 31) / 32;
        int[] iArr2 = new int[i5 * iA];
        for (int i6 = 0; i6 < iA; i6++) {
            for (int i7 = 0; i7 < iC; i7++) {
                if ((bArrB[(i6 * iC) + i7] & 255) < iA2) {
                    int i8 = (i6 * i5) + (i7 >> 5);
                    iArr2[i8] = iArr2[i8] | (1 << (i7 & 31));
                }
            }
        }
        return new s(iC, iA, i5, iArr2);
    }

    @Override // com.huawei.hms.scankit.p.o
    public r a(int i, r rVar) throws a {
        p4 p4VarC = c();
        int iC = p4VarC.c();
        if (rVar != null && rVar.d() >= iC) {
            rVar.a();
        } else {
            rVar = new r(iC);
        }
        a(iC);
        byte[] bArrA = p4VarC.a(i, this.f16277b);
        int[] iArr = this.f16278c;
        for (int i2 = 0; i2 < iC; i2++) {
            int i3 = (bArrA[i2] & 255) >> 3;
            iArr[i3] = iArr[i3] + 1;
        }
        int iA = a(iArr, false);
        if (iC < 3) {
            for (int i4 = 0; i4 < iC; i4++) {
                if ((bArrA[i4] & 255) < iA) {
                    rVar.g(i4);
                }
            }
        } else {
            int i5 = 1;
            int i6 = bArrA[0] & 255;
            int i7 = bArrA[1] & 255;
            while (i5 < iC - 1) {
                int i8 = i5 + 1;
                int i9 = bArrA[i8] & 255;
                if ((((i7 * 4) - i6) - i9) / 2 < iA) {
                    rVar.g(i5);
                }
                i6 = i7;
                i5 = i8;
                i7 = i9;
            }
        }
        return rVar;
    }

    private void a(int i) {
        if (this.f16277b.length < i) {
            this.f16277b = new byte[i];
        }
        for (int i2 = 0; i2 < 32; i2++) {
            this.f16278c[i2] = 0;
        }
    }

    @Override // com.huawei.hms.scankit.p.o
    public o a(p4 p4Var) {
        return new q3(p4Var);
    }
}
