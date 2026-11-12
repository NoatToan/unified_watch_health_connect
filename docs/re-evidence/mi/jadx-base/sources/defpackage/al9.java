package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class al9 implements Cloneable {
    public static final bl9 e = new bl9();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f1165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f1166b;
    public bl9[] c;
    public int d;

    public al9() {
        this(10);
    }

    public final boolean a(int[] iArr, int[] iArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (iArr[i2] != iArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    public final boolean b(bl9[] bl9VarArr, bl9[] bl9VarArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (!bl9VarArr[i2].equals(bl9VarArr2[i2])) {
                return false;
            }
        }
        return true;
    }

    public final int c(int i) {
        int i2 = this.d - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            int i5 = this.f1166b[i4];
            if (i5 < i) {
                i3 = i4 + 1;
            } else {
                if (i5 <= i) {
                    return i4;
                }
                i2 = i4 - 1;
            }
        }
        return ~i3;
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final al9 clone() {
        int iK = k();
        al9 al9Var = new al9(iK);
        System.arraycopy(this.f1166b, 0, al9Var.f1166b, 0, iK);
        for (int i = 0; i < iK; i++) {
            bl9 bl9Var = this.c[i];
            if (bl9Var != null) {
                al9Var.c[i] = bl9Var.clone();
            }
        }
        al9Var.d = iK;
        return al9Var;
    }

    public bl9 e(int i) {
        if (this.f1165a) {
            f();
        }
        return this.c[i];
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof al9)) {
            return false;
        }
        al9 al9Var = (al9) obj;
        if (k() != al9Var.k()) {
            return false;
        }
        return a(this.f1166b, al9Var.f1166b, this.d) && b(this.c, al9Var.c, this.d);
    }

    public final void f() {
        int i = this.d;
        int[] iArr = this.f1166b;
        bl9[] bl9VarArr = this.c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            bl9 bl9Var = bl9VarArr[i3];
            if (bl9Var != e) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    bl9VarArr[i2] = bl9Var;
                    bl9VarArr[i3] = null;
                }
                i2++;
            }
        }
        this.f1165a = false;
        this.d = i2;
    }

    public bl9 g(int i) {
        bl9 bl9Var;
        int iC = c(i);
        if (iC < 0 || (bl9Var = this.c[iC]) == e) {
            return null;
        }
        return bl9Var;
    }

    public final int h(int i) {
        for (int i2 = 4; i2 < 32; i2++) {
            int i3 = (1 << i2) - 12;
            if (i <= i3) {
                return i3;
            }
        }
        return i;
    }

    public int hashCode() {
        if (this.f1165a) {
            f();
        }
        int iHashCode = 17;
        for (int i = 0; i < this.d; i++) {
            iHashCode = (((iHashCode * 31) + this.f1166b[i]) * 31) + this.c[i].hashCode();
        }
        return iHashCode;
    }

    public final int i(int i) {
        return h(i * 4) / 4;
    }

    public void j(int i, bl9 bl9Var) {
        int iC = c(i);
        if (iC >= 0) {
            this.c[iC] = bl9Var;
            return;
        }
        int i2 = ~iC;
        int i3 = this.d;
        if (i2 < i3) {
            bl9[] bl9VarArr = this.c;
            if (bl9VarArr[i2] == e) {
                this.f1166b[i2] = i;
                bl9VarArr[i2] = bl9Var;
                return;
            }
        }
        if (this.f1165a && i3 >= this.f1166b.length) {
            f();
            i2 = ~c(i);
        }
        int i4 = this.d;
        if (i4 >= this.f1166b.length) {
            int i5 = i(i4 + 1);
            int[] iArr = new int[i5];
            bl9[] bl9VarArr2 = new bl9[i5];
            int[] iArr2 = this.f1166b;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            bl9[] bl9VarArr3 = this.c;
            System.arraycopy(bl9VarArr3, 0, bl9VarArr2, 0, bl9VarArr3.length);
            this.f1166b = iArr;
            this.c = bl9VarArr2;
        }
        int i6 = this.d;
        if (i6 - i2 != 0) {
            int[] iArr3 = this.f1166b;
            int i7 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i7, i6 - i2);
            bl9[] bl9VarArr4 = this.c;
            System.arraycopy(bl9VarArr4, i2, bl9VarArr4, i7, this.d - i2);
        }
        this.f1166b[i2] = i;
        this.c[i2] = bl9Var;
        this.d++;
    }

    public int k() {
        if (this.f1165a) {
            f();
        }
        return this.d;
    }

    public al9(int i) {
        this.f1165a = false;
        int i2 = i(i);
        this.f1166b = new int[i2];
        this.c = new bl9[i2];
        this.d = 0;
    }
}
