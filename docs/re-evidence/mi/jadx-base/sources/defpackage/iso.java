package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class iso {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n04 f22055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a04 f22056b;
    public int c;
    public String d;
    public int e;
    public a[] f;
    public int g;
    public z73 h;
    public int i;
    public z73 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f22057k;
    public a[] l;

    public iso(n04 n04Var) {
        this.f22055a = n04Var;
        this.f22056b = null;
        this.f = new a[256];
        this.g = 1;
        this.h = new z73();
    }

    public static int U(int i, int i2) {
        return (i + i2) & Integer.MAX_VALUE;
    }

    public static int V(int i, long j) {
        return (i + ((int) j) + ((int) (j >>> 32))) & Integer.MAX_VALUE;
    }

    public static int W(int i, String str) {
        return (i + str.hashCode()) & Integer.MAX_VALUE;
    }

    public static int X(int i, String str, int i2) {
        return (i + str.hashCode() + i2) & Integer.MAX_VALUE;
    }

    public static int Y(int i, String str, String str2) {
        return (i + (str.hashCode() * str2.hashCode())) & Integer.MAX_VALUE;
    }

    public static int Z(int i, String str, String str2, int i2) {
        return (i + (str.hashCode() * str2.hashCode() * (i2 + 1))) & Integer.MAX_VALUE;
    }

    public static int a0(int i, String str, String str2, String str3) {
        return (i + (str.hashCode() * str2.hashCode() * str3.hashCode())) & Integer.MAX_VALUE;
    }

    public static int b0(int i, String str, String str2, String str3, int i2) {
        return (i + (str.hashCode() * str2.hashCode() * str3.hashCode() * i2)) & Integer.MAX_VALUE;
    }

    public final void A(int i, String str, String str2) {
        a(new a(i, 12, str, str2, Y(12, str, str2)));
    }

    public fso B(String str) {
        return F(20, str);
    }

    public fso C(String str) {
        return F(8, str);
    }

    public int D(String str) {
        int iW = W(1, str);
        for (a aVarN = N(iW); aVarN != null; aVarN = aVarN.i) {
            if (aVarN.f18166b == 1 && aVarN.h == iW && aVarN.e.equals(str)) {
                return aVarN.f18165a;
            }
        }
        this.h.g(1).l(str);
        int i = this.g;
        this.g = i + 1;
        return c0(new a(i, 1, str, iW)).f18165a;
    }

    public final void E(int i, String str) {
        a(new a(i, 1, str, W(1, str)));
    }

    public final fso F(int i, String str) {
        int iW = W(i, str);
        for (a aVarN = N(iW); aVarN != null; aVarN = aVarN.i) {
            if (aVarN.f18166b == i && aVarN.h == iW && aVarN.e.equals(str)) {
                return aVarN;
            }
        }
        this.h.e(i, D(str));
        int i2 = this.g;
        this.g = i2 + 1;
        return c0(new a(i2, i, str, iW));
    }

    public final void G(int i, int i2, String str) {
        a(new a(i, i2, str, W(i2, str)));
    }

    public int H(int i, int i2) {
        long j;
        long j2;
        if (i < i2) {
            j = i;
            j2 = i2;
        } else {
            j = i2;
            j2 = i;
        }
        long j3 = j | (j2 << 32);
        int iU = U(130, i + i2);
        for (a aVarN = N(iU); aVarN != null; aVarN = aVarN.i) {
            if (aVarN.f18166b == 130 && aVarN.h == iU && aVarN.f == j3) {
                return aVarN.g;
            }
        }
        a[] aVarArr = this.l;
        int I = I(this.f22055a.r(aVarArr[i].e, aVarArr[i2].e));
        c0(new a(this.f22057k, 130, j3, iU)).g = I;
        return I;
    }

    public int I(String str) {
        int iW = W(128, str);
        for (a aVarN = N(iW); aVarN != null; aVarN = aVarN.i) {
            if (aVarN.f18166b == 128 && aVarN.h == iW && aVarN.e.equals(str)) {
                return aVarN.f18165a;
            }
        }
        return J(new a(this.f22057k, 128, str, iW));
    }

    public final int J(a aVar) {
        if (this.l == null) {
            this.l = new a[16];
        }
        int i = this.f22057k;
        a[] aVarArr = this.l;
        if (i == aVarArr.length) {
            a[] aVarArr2 = new a[aVarArr.length * 2];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, aVarArr.length);
            this.l = aVarArr2;
        }
        a[] aVarArr3 = this.l;
        int i2 = this.f22057k;
        this.f22057k = i2 + 1;
        aVarArr3[i2] = aVar;
        return c0(aVar).f18165a;
    }

    public int K(String str, int i) {
        int iX = X(129, str, i);
        for (a aVarN = N(iX); aVarN != null; aVarN = aVarN.i) {
            if (aVarN.f18166b == 129 && aVarN.h == iX && aVarN.f == i && aVarN.e.equals(str)) {
                return aVarN.f18165a;
            }
        }
        return J(new a(this.f22057k, 129, str, i, iX));
    }

    public int L() {
        if (this.j == null) {
            return 0;
        }
        D("BootstrapMethods");
        return this.j.f40971b + 8;
    }

    public final void M(a04 a04Var, char[] cArr) {
        byte[] bArr = a04Var.c;
        int iE = a04Var.e();
        for (int I = a04Var.I(iE - 2); I > 0; I--) {
            if ("BootstrapMethods".equals(a04Var.H(iE, cArr))) {
                this.i = a04Var.I(iE + 6);
                break;
            }
            iE += a04Var.t(iE + 2) + 6;
        }
        if (this.i > 0) {
            int i = iE + 8;
            int iT = a04Var.t(iE + 2) - 2;
            z73 z73Var = new z73(iT);
            this.j = z73Var;
            z73Var.h(bArr, i, iT);
            int i2 = i;
            for (int i3 = 0; i3 < this.i; i3++) {
                int i4 = i2 - i;
                int I2 = a04Var.I(i2);
                int I3 = a04Var.I(i2 + 2);
                i2 += 4;
                int iHashCode = a04Var.o(I2, cArr).hashCode();
                while (true) {
                    int i5 = I3 - 1;
                    if (I3 > 0) {
                        int I4 = a04Var.I(i2);
                        i2 += 2;
                        iHashCode ^= a04Var.o(I4, cArr).hashCode();
                        I3 = i5;
                    }
                }
                a(new a(i3, 64, i4, iHashCode & Integer.MAX_VALUE));
            }
        }
    }

    public final a N(int i) {
        a[] aVarArr = this.f;
        return aVarArr[i % aVarArr.length];
    }

    public String O() {
        return this.d;
    }

    public int P() {
        return this.g;
    }

    public int Q() {
        return this.h.f40971b;
    }

    public int R() {
        return this.c;
    }

    public a04 S() {
        return this.f22056b;
    }

    public fso T(int i) {
        return this.l[i];
    }

    public final void a(a aVar) {
        this.e++;
        int i = aVar.h;
        a[] aVarArr = this.f;
        int length = i % aVarArr.length;
        aVar.i = aVarArr[length];
        aVarArr[length] = aVar;
    }

    public final fso b(int i, int i2, int i3) {
        byte[] bArr = this.j.f40970a;
        for (a aVarN = N(i3); aVarN != null; aVarN = aVarN.i) {
            if (aVarN.f18166b == 64 && aVarN.h == i3) {
                int i4 = (int) aVarN.f;
                int i5 = 0;
                while (true) {
                    if (i5 >= i2) {
                        this.j.f40971b = i;
                        return aVarN;
                    }
                    if (bArr[i + i5] != bArr[i4 + i5]) {
                        break;
                    }
                    i5++;
                }
            }
        }
        int i6 = this.i;
        this.i = i6 + 1;
        return c0(new a(i6, 64, i, i3));
    }

    public fso c(gkb gkbVar, Object... objArr) {
        z73 z73Var = this.j;
        if (z73Var == null) {
            z73Var = new z73();
            this.j = z73Var;
        }
        int length = objArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = d(objArr[i]).f18165a;
        }
        int i2 = z73Var.f40971b;
        z73Var.k(u(gkbVar.d(), gkbVar.c(), gkbVar.b(), gkbVar.a(), gkbVar.e()).f18165a);
        z73Var.k(length);
        for (int i3 = 0; i3 < length; i3++) {
            z73Var.k(iArr[i3]);
        }
        int i4 = z73Var.f40971b - i2;
        int iHashCode = gkbVar.hashCode();
        for (Object obj : objArr) {
            iHashCode ^= obj.hashCode();
        }
        return b(i2, i4, iHashCode & Integer.MAX_VALUE);
    }

    public final a c0(a aVar) {
        int i = this.e;
        a[] aVarArr = this.f;
        if (i > (aVarArr.length * 3) / 4) {
            int length = aVarArr.length;
            int i2 = (length * 2) + 1;
            a[] aVarArr2 = new a[i2];
            for (int i3 = length - 1; i3 >= 0; i3--) {
                a aVar2 = this.f[i3];
                while (aVar2 != null) {
                    int i4 = aVar2.h % i2;
                    a aVar3 = aVar2.i;
                    aVar2.i = aVarArr2[i4];
                    aVarArr2[i4] = aVar2;
                    aVar2 = aVar3;
                }
            }
            this.f = aVarArr2;
        }
        this.e++;
        int i5 = aVar.h;
        a[] aVarArr3 = this.f;
        int length2 = i5 % aVarArr3.length;
        aVar.i = aVarArr3[length2];
        aVarArr3[length2] = aVar;
        return aVar;
    }

    public fso d(Object obj) {
        if (obj instanceof Integer) {
            return l(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return l(((Byte) obj).intValue());
        }
        if (obj instanceof Character) {
            return l(((Character) obj).charValue());
        }
        if (obj instanceof Short) {
            return l(((Short) obj).intValue());
        }
        if (obj instanceof Boolean) {
            return l(((Boolean) obj).booleanValue() ? 1 : 0);
        }
        if (obj instanceof Float) {
            return k(((Float) obj).floatValue());
        }
        if (obj instanceof Long) {
            return p(((Long) obj).longValue());
        }
        if (obj instanceof Double) {
            return f(((Double) obj).doubleValue());
        }
        if (obj instanceof String) {
            return C((String) obj);
        }
        if (obj instanceof n4q) {
            n4q n4qVar = (n4q) obj;
            int iL = n4qVar.l();
            if (iL == 10) {
                return e(n4qVar.f());
            }
            return iL == 11 ? w(n4qVar.d()) : e(n4qVar.d());
        }
        if (obj instanceof gkb) {
            gkb gkbVar = (gkb) obj;
            return u(gkbVar.d(), gkbVar.c(), gkbVar.b(), gkbVar.a(), gkbVar.e());
        }
        if (obj instanceof mf4) {
            mf4 mf4Var = (mf4) obj;
            return g(mf4Var.d(), mf4Var.c(), mf4Var.a(), mf4Var.b());
        }
        throw new IllegalArgumentException("value " + obj);
    }

    public void d0(z73 z73Var) {
        if (this.j != null) {
            z73 z73VarK = z73Var.k(D("BootstrapMethods")).i(this.j.f40971b + 2).k(this.i);
            z73 z73Var2 = this.j;
            z73VarK.h(z73Var2.f40970a, 0, z73Var2.f40971b);
        }
    }

    public fso e(String str) {
        return F(7, str);
    }

    public void e0(z73 z73Var) {
        z73 z73VarK = z73Var.k(this.g);
        z73 z73Var2 = this.h;
        z73VarK.h(z73Var2.f40970a, 0, z73Var2.f40971b);
    }

    public fso f(double d) {
        return q(6, Double.doubleToRawLongBits(d));
    }

    public int f0(int i, String str) {
        this.c = i;
        this.d = str;
        return e(str).f18165a;
    }

    public fso g(String str, String str2, gkb gkbVar, Object... objArr) {
        return h(17, str, str2, c(gkbVar, objArr).f18165a);
    }

    public final fso h(int i, String str, String str2, int i2) {
        int iZ = Z(i, str, str2, i2);
        for (a aVarN = N(iZ); aVarN != null; aVarN = aVarN.i) {
            if (aVarN.f18166b == i && aVarN.h == iZ && aVarN.f == i2 && aVarN.d.equals(str) && aVarN.e.equals(str2)) {
                return aVarN;
            }
        }
        this.h.f(i, i2, z(str, str2));
        int i3 = this.g;
        this.g = i3 + 1;
        return c0(new a(i3, i, null, str, str2, i2, iZ));
    }

    public final void i(int i, int i2, String str, String str2, int i3) {
        a(new a(i2, i, null, str, str2, i3, Z(i, str, str2, i3)));
    }

    public fso j(String str, String str2, String str3) {
        return s(9, str, str2, str3);
    }

    public fso k(float f) {
        return m(4, Float.floatToRawIntBits(f));
    }

    public fso l(int i) {
        return m(3, i);
    }

    public final fso m(int i, int i2) {
        int iU = U(i, i2);
        for (a aVarN = N(iU); aVarN != null; aVarN = aVarN.i) {
            if (aVarN.f18166b == i && aVarN.h == iU && aVarN.f == i2) {
                return aVarN;
            }
        }
        this.h.g(i).i(i2);
        int i3 = this.g;
        this.g = i3 + 1;
        return c0(new a(i3, i, i2, iU));
    }

    public final void n(int i, int i2, int i3) {
        a(new a(i, i2, i3, U(i2, i3)));
    }

    public fso o(String str, String str2, gkb gkbVar, Object... objArr) {
        return h(18, str, str2, c(gkbVar, objArr).f18165a);
    }

    public fso p(long j) {
        return q(5, j);
    }

    public final fso q(int i, long j) {
        int iV = V(i, j);
        for (a aVarN = N(iV); aVarN != null; aVarN = aVarN.i) {
            if (aVarN.f18166b == i && aVarN.h == iV && aVarN.f == j) {
                return aVarN;
            }
        }
        int i2 = this.g;
        this.h.g(i).j(j);
        this.g += 2;
        return c0(new a(i2, i, j, iV));
    }

    public final void r(int i, int i2, long j) {
        a(new a(i, i2, j, V(i2, j)));
    }

    public final a s(int i, String str, String str2, String str3) {
        int iA0 = a0(i, str, str2, str3);
        for (a aVarN = N(iA0); aVarN != null; aVarN = aVarN.i) {
            if (aVarN.f18166b == i && aVarN.h == iA0 && aVarN.c.equals(str) && aVarN.d.equals(str2) && aVarN.e.equals(str3)) {
                return aVarN;
            }
        }
        this.h.f(i, e(str).f18165a, z(str2, str3));
        int i2 = this.g;
        this.g = i2 + 1;
        return c0(new a(i2, i, str, str2, str3, 0L, iA0));
    }

    public final void t(int i, int i2, String str, String str2, String str3) {
        a(new a(i, i2, str, str2, str3, 0L, a0(i2, str, str2, str3)));
    }

    public fso u(int i, String str, String str2, String str3, boolean z) {
        int iB0 = b0(15, str, str2, str3, i);
        for (a aVarN = N(iB0); aVarN != null; aVarN = aVarN.i) {
            if (aVarN.f18166b == 15 && aVarN.h == iB0 && aVarN.f == i && aVarN.c.equals(str) && aVarN.d.equals(str2) && aVarN.e.equals(str3)) {
                return aVarN;
            }
        }
        if (i <= 4) {
            this.h.d(15, i, j(str, str2, str3).f18165a);
        } else {
            this.h.d(15, i, x(str, str2, str3, z).f18165a);
        }
        int i2 = this.g;
        this.g = i2 + 1;
        return c0(new a(i2, 15, str, str2, str3, i, iB0));
    }

    public final void v(int i, int i2, String str, String str2, String str3) {
        a(new a(i, 15, str, str2, str3, i2, b0(15, str, str2, str3, i2)));
    }

    public fso w(String str) {
        return F(16, str);
    }

    public fso x(String str, String str2, String str3, boolean z) {
        return s(z ? 11 : 10, str, str2, str3);
    }

    public fso y(String str) {
        return F(19, str);
    }

    public int z(String str, String str2) {
        int iY = Y(12, str, str2);
        for (a aVarN = N(iY); aVarN != null; aVarN = aVarN.i) {
            if (aVarN.f18166b == 12 && aVarN.h == iY && aVarN.d.equals(str) && aVarN.e.equals(str2)) {
                return aVarN.f18165a;
            }
        }
        this.h.f(12, D(str), D(str2));
        int i = this.g;
        this.g = i + 1;
        return c0(new a(i, 12, str, str2, iY)).f18165a;
    }

    public static class a extends fso {
        public final int h;
        public a i;

        public a(int i, int i2, long j, int i3) {
            super(i, i2, null, null, null, j);
            this.h = i3;
        }

        public a(int i, int i2, String str, int i3) {
            super(i, i2, null, null, str, 0L);
            this.h = i3;
        }

        public a(int i, int i2, String str, long j, int i3) {
            super(i, i2, null, null, str, j);
            this.h = i3;
        }

        public a(int i, int i2, String str, String str2, int i3) {
            super(i, i2, null, str, str2, 0L);
            this.h = i3;
        }

        public a(int i, int i2, String str, String str2, String str3, long j, int i3) {
            super(i, i2, str, str2, str3, j);
            this.h = i3;
        }
    }

    public iso(n04 n04Var, a04 a04Var) {
        this.f22055a = n04Var;
        this.f22056b = a04Var;
        byte[] bArr = a04Var.c;
        int iF = a04Var.f(1) - 1;
        int i = a04Var.f463b - iF;
        this.g = a04Var.g();
        z73 z73Var = new z73(i);
        this.h = z73Var;
        z73Var.h(bArr, iF, i);
        this.f = new a[this.g * 2];
        char[] cArr = new char[a04Var.h()];
        boolean z = false;
        int i2 = 1;
        while (i2 < this.g) {
            int iF2 = a04Var.f(i2);
            byte b2 = bArr[iF2 - 1];
            switch (b2) {
                case 1:
                    E(i2, a04Var.K(i2, cArr));
                    break;
                case 2:
                case 13:
                case 14:
                default:
                    throw new IllegalArgumentException();
                case 3:
                case 4:
                    n(i2, b2, a04Var.t(iF2));
                    break;
                case 5:
                case 6:
                    r(i2, b2, a04Var.v(iF2));
                    break;
                case 7:
                case 8:
                case 16:
                case 19:
                case 20:
                    G(i2, b2, a04Var.H(iF2, cArr));
                    break;
                case 9:
                case 10:
                case 11:
                    int iF3 = a04Var.f(a04Var.I(iF2 + 2));
                    t(i2, b2, a04Var.m(iF2, cArr), a04Var.H(iF3, cArr), a04Var.H(iF3 + 2, cArr));
                    break;
                case 12:
                    A(i2, a04Var.H(iF2, cArr), a04Var.H(iF2 + 2, cArr));
                    break;
                case 15:
                    int iF4 = a04Var.f(a04Var.I(iF2 + 1));
                    int iF5 = a04Var.f(a04Var.I(iF4 + 2));
                    v(i2, a04Var.l(iF2), a04Var.m(iF4, cArr), a04Var.H(iF5, cArr), a04Var.H(iF5 + 2, cArr));
                    break;
                case 17:
                case 18:
                    int iF6 = a04Var.f(a04Var.I(iF2 + 2));
                    i(b2, i2, a04Var.H(iF6, cArr), a04Var.H(iF6 + 2, cArr), a04Var.I(iF2));
                    z = true;
                    break;
            }
            i2 += (b2 == 5 || b2 == 6) ? 2 : 1;
        }
        if (z) {
            M(a04Var, cArr);
        }
    }
}
