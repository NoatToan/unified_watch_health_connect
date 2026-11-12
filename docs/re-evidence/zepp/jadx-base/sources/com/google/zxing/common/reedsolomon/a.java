package com.google.zxing.common.reedsolomon;

/* JADX INFO: loaded from: classes4.dex */
final class a {
    private final GenericGF a;
    private final int[] b;

    public a(GenericGF genericGF, int[] iArr) {
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        this.a = genericGF;
        int length = iArr.length;
        if (length <= 1 || iArr[0] != 0) {
            this.b = iArr;
            return;
        }
        int i = 1;
        while (i < length && iArr[i] == 0) {
            i++;
        }
        if (i == length) {
            this.b = new int[]{0};
            return;
        }
        int[] iArr2 = new int[length - i];
        this.b = iArr2;
        System.arraycopy(iArr, i, iArr2, 0, iArr2.length);
    }

    public a a(a aVar) {
        if (!this.a.equals(aVar.a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (g()) {
            return aVar;
        }
        if (aVar.g()) {
            return this;
        }
        int[] iArr = this.b;
        int[] iArr2 = aVar.b;
        if (iArr.length <= iArr2.length) {
            iArr = iArr2;
            iArr2 = iArr;
        }
        int[] iArr3 = new int[iArr.length];
        int length = iArr.length - iArr2.length;
        System.arraycopy(iArr, 0, iArr3, 0, length);
        for (int i = length; i < iArr.length; i++) {
            iArr3[i] = GenericGF.a(iArr2[i - length], iArr[i]);
        }
        return new a(this.a, iArr3);
    }

    public a[] b(a aVar) {
        if (!this.a.equals(aVar.a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (aVar.g()) {
            throw new IllegalArgumentException("Divide by 0");
        }
        a aVarE = this.a.e();
        int iF = this.a.f(aVar.d(aVar.f()));
        a aVarA = this;
        while (aVarA.f() >= aVar.f() && !aVarA.g()) {
            int iF2 = aVarA.f() - aVar.f();
            int iH = this.a.h(aVarA.d(aVarA.f()), iF);
            a aVarJ = aVar.j(iF2, iH);
            aVarE = aVarE.a(this.a.b(iF2, iH));
            aVarA = aVarA.a(aVarJ);
        }
        return new a[]{aVarE, aVarA};
    }

    public int c(int i) {
        if (i == 0) {
            return d(0);
        }
        if (i == 1) {
            int iA = 0;
            for (int i2 : this.b) {
                iA = GenericGF.a(iA, i2);
            }
            return iA;
        }
        int[] iArr = this.b;
        int iA2 = iArr[0];
        int length = iArr.length;
        for (int i3 = 1; i3 < length; i3++) {
            iA2 = GenericGF.a(this.a.h(i, iA2), this.b[i3]);
        }
        return iA2;
    }

    public int d(int i) {
        int[] iArr = this.b;
        return iArr[(iArr.length - 1) - i];
    }

    public int[] e() {
        return this.b;
    }

    public int f() {
        return this.b.length - 1;
    }

    public boolean g() {
        return this.b[0] == 0;
    }

    public a h(int i) {
        if (i == 0) {
            return this.a.e();
        }
        if (i == 1) {
            return this;
        }
        int length = this.b.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = this.a.h(this.b[i2], i);
        }
        return new a(this.a, iArr);
    }

    public a i(a aVar) {
        if (!this.a.equals(aVar.a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (g() || aVar.g()) {
            return this.a.e();
        }
        int[] iArr = this.b;
        int length = iArr.length;
        int[] iArr2 = aVar.b;
        int length2 = iArr2.length;
        int[] iArr3 = new int[(length + length2) - 1];
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            for (int i3 = 0; i3 < length2; i3++) {
                int i4 = i + i3;
                iArr3[i4] = GenericGF.a(iArr3[i4], this.a.h(i2, iArr2[i3]));
            }
        }
        return new a(this.a, iArr3);
    }

    public a j(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        if (i2 == 0) {
            return this.a.e();
        }
        int length = this.b.length;
        int[] iArr = new int[i + length];
        for (int i3 = 0; i3 < length; i3++) {
            iArr[i3] = this.a.h(this.b[i3], i2);
        }
        return new a(this.a, iArr);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(f() * 8);
        for (int iF = f(); iF >= 0; iF--) {
            int iD = d(iF);
            if (iD != 0) {
                if (iD < 0) {
                    sb.append(" - ");
                    iD = -iD;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (iF == 0 || iD != 1) {
                    int iG = this.a.g(iD);
                    if (iG == 0) {
                        sb.append('1');
                    } else if (iG == 1) {
                        sb.append('a');
                    } else {
                        sb.append("a^");
                        sb.append(iG);
                    }
                }
                if (iF != 0) {
                    if (iF == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(iF);
                    }
                }
            }
        }
        return sb.toString();
    }
}
