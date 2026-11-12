package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class dya {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cya f16056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f16057b;

    public dya(cya cyaVar, int[] iArr) {
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        this.f16056a = cyaVar;
        int length = iArr.length;
        int i = 1;
        if (length <= 1 || iArr[0] != 0) {
            this.f16057b = iArr;
            return;
        }
        while (i < length && iArr[i] == 0) {
            i++;
        }
        if (i == length) {
            this.f16057b = new int[]{0};
            return;
        }
        int[] iArr2 = new int[length - i];
        this.f16057b = iArr2;
        System.arraycopy(iArr, i, iArr2, 0, iArr2.length);
    }

    public dya a(dya dyaVar) {
        if (!this.f16056a.equals(dyaVar.f16056a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (g()) {
            return dyaVar;
        }
        if (dyaVar.g()) {
            return this;
        }
        int[] iArr = this.f16057b;
        int[] iArr2 = dyaVar.f16057b;
        if (iArr.length <= iArr2.length) {
            iArr = iArr2;
            iArr2 = iArr;
        }
        int[] iArr3 = new int[iArr.length];
        int length = iArr.length - iArr2.length;
        System.arraycopy(iArr, 0, iArr3, 0, length);
        for (int i = length; i < iArr.length; i++) {
            iArr3[i] = cya.a(iArr2[i - length], iArr[i]);
        }
        return new dya(this.f16056a, iArr3);
    }

    public dya[] b(dya dyaVar) {
        if (!this.f16056a.equals(dyaVar.f16056a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (dyaVar.g()) {
            throw new IllegalArgumentException("Divide by 0");
        }
        dya dyaVarG = this.f16056a.g();
        int iH = this.f16056a.h(dyaVar.d(dyaVar.f()));
        dya dyaVarA = this;
        while (dyaVarA.f() >= dyaVar.f() && !dyaVarA.g()) {
            int iF = dyaVarA.f() - dyaVar.f();
            int iJ = this.f16056a.j(dyaVarA.d(dyaVarA.f()), iH);
            dya dyaVarJ = dyaVar.j(iF, iJ);
            dyaVarG = dyaVarG.a(this.f16056a.b(iF, iJ));
            dyaVarA = dyaVarA.a(dyaVarJ);
        }
        return new dya[]{dyaVarG, dyaVarA};
    }

    public int c(int i) {
        if (i == 0) {
            return d(0);
        }
        if (i == 1) {
            int iA = 0;
            for (int i2 : this.f16057b) {
                iA = cya.a(iA, i2);
            }
            return iA;
        }
        int[] iArr = this.f16057b;
        int iA2 = iArr[0];
        int length = iArr.length;
        for (int i3 = 1; i3 < length; i3++) {
            iA2 = cya.a(this.f16056a.j(i, iA2), this.f16057b[i3]);
        }
        return iA2;
    }

    public int d(int i) {
        int[] iArr = this.f16057b;
        return iArr[(iArr.length - 1) - i];
    }

    public int[] e() {
        return this.f16057b;
    }

    public int f() {
        return this.f16057b.length - 1;
    }

    public boolean g() {
        return this.f16057b[0] == 0;
    }

    public dya h(int i) {
        if (i == 0) {
            return this.f16056a.g();
        }
        if (i == 1) {
            return this;
        }
        int length = this.f16057b.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = this.f16056a.j(this.f16057b[i2], i);
        }
        return new dya(this.f16056a, iArr);
    }

    public dya i(dya dyaVar) {
        if (!this.f16056a.equals(dyaVar.f16056a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (g() || dyaVar.g()) {
            return this.f16056a.g();
        }
        int[] iArr = this.f16057b;
        int length = iArr.length;
        int[] iArr2 = dyaVar.f16057b;
        int length2 = iArr2.length;
        int[] iArr3 = new int[(length + length2) - 1];
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            for (int i3 = 0; i3 < length2; i3++) {
                int i4 = i + i3;
                iArr3[i4] = cya.a(iArr3[i4], this.f16056a.j(i2, iArr2[i3]));
            }
        }
        return new dya(this.f16056a, iArr3);
    }

    public dya j(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        if (i2 == 0) {
            return this.f16056a.g();
        }
        int length = this.f16057b.length;
        int[] iArr = new int[i + length];
        for (int i3 = 0; i3 < length; i3++) {
            iArr[i3] = this.f16056a.j(this.f16057b[i3], i2);
        }
        return new dya(this.f16056a, iArr);
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
                    int i = this.f16056a.i(iD);
                    if (i == 0) {
                        sb.append('1');
                    } else if (i == 1) {
                        sb.append('a');
                    } else {
                        sb.append("a^");
                        sb.append(i);
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
