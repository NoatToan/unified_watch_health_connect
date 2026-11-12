package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class p7g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o7g f30086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f30087b;

    public p7g(o7g o7gVar, int[] iArr) {
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        this.f30086a = o7gVar;
        int length = iArr.length;
        int i = 1;
        if (length <= 1 || iArr[0] != 0) {
            this.f30087b = iArr;
            return;
        }
        while (i < length && iArr[i] == 0) {
            i++;
        }
        if (i == length) {
            this.f30087b = new int[]{0};
            return;
        }
        int[] iArr2 = new int[length - i];
        this.f30087b = iArr2;
        System.arraycopy(iArr, i, iArr2, 0, iArr2.length);
    }

    public p7g a(p7g p7gVar) {
        if (!this.f30086a.equals(p7gVar.f30086a)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        }
        if (e()) {
            return p7gVar;
        }
        if (p7gVar.e()) {
            return this;
        }
        int[] iArr = this.f30087b;
        int[] iArr2 = p7gVar.f30087b;
        if (iArr.length <= iArr2.length) {
            iArr = iArr2;
            iArr2 = iArr;
        }
        int[] iArr3 = new int[iArr.length];
        int length = iArr.length - iArr2.length;
        System.arraycopy(iArr, 0, iArr3, 0, length);
        for (int i = length; i < iArr.length; i++) {
            iArr3[i] = this.f30086a.a(iArr2[i - length], iArr[i]);
        }
        return new p7g(this.f30086a, iArr3);
    }

    public int b(int i) {
        if (i == 0) {
            return c(0);
        }
        if (i == 1) {
            int iA = 0;
            for (int i2 : this.f30087b) {
                iA = this.f30086a.a(iA, i2);
            }
            return iA;
        }
        int[] iArr = this.f30087b;
        int iA2 = iArr[0];
        int length = iArr.length;
        for (int i3 = 1; i3 < length; i3++) {
            o7g o7gVar = this.f30086a;
            iA2 = o7gVar.a(o7gVar.i(i, iA2), this.f30087b[i3]);
        }
        return iA2;
    }

    public int c(int i) {
        int[] iArr = this.f30087b;
        return iArr[(iArr.length - 1) - i];
    }

    public int d() {
        return this.f30087b.length - 1;
    }

    public boolean e() {
        return this.f30087b[0] == 0;
    }

    public p7g f(int i) {
        if (i == 0) {
            return this.f30086a.f();
        }
        if (i == 1) {
            return this;
        }
        int length = this.f30087b.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = this.f30086a.i(this.f30087b[i2], i);
        }
        return new p7g(this.f30086a, iArr);
    }

    public p7g g(p7g p7gVar) {
        if (!this.f30086a.equals(p7gVar.f30086a)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        }
        if (e() || p7gVar.e()) {
            return this.f30086a.f();
        }
        int[] iArr = this.f30087b;
        int length = iArr.length;
        int[] iArr2 = p7gVar.f30087b;
        int length2 = iArr2.length;
        int[] iArr3 = new int[(length + length2) - 1];
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            for (int i3 = 0; i3 < length2; i3++) {
                int i4 = i + i3;
                o7g o7gVar = this.f30086a;
                iArr3[i4] = o7gVar.a(iArr3[i4], o7gVar.i(i2, iArr2[i3]));
            }
        }
        return new p7g(this.f30086a, iArr3);
    }

    public p7g h(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        if (i2 == 0) {
            return this.f30086a.f();
        }
        int length = this.f30087b.length;
        int[] iArr = new int[i + length];
        for (int i3 = 0; i3 < length; i3++) {
            iArr[i3] = this.f30086a.i(this.f30087b[i3], i2);
        }
        return new p7g(this.f30086a, iArr);
    }

    public p7g i() {
        int length = this.f30087b.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = this.f30086a.j(0, this.f30087b[i]);
        }
        return new p7g(this.f30086a, iArr);
    }

    public p7g j(p7g p7gVar) {
        if (this.f30086a.equals(p7gVar.f30086a)) {
            return p7gVar.e() ? this : a(p7gVar.i());
        }
        throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(d() * 8);
        for (int iD = d(); iD >= 0; iD--) {
            int iC = c(iD);
            if (iC != 0) {
                if (iC < 0) {
                    sb.append(" - ");
                    iC = -iC;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (iD == 0 || iC != 1) {
                    sb.append(iC);
                }
                if (iD != 0) {
                    if (iD == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(iD);
                    }
                }
            }
        }
        return sb.toString();
    }
}
