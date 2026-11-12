package defpackage;

import com.nimbusds.jose.shaded.ow2asm.MethodTooLargeException;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeSetViewModel;

/* JADX INFO: loaded from: classes6.dex */
public final class duf extends cuf {
    public static final int[] c0 = {0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 1, 1, 1, 2, 2, 1, 1, 1, 0, 0, 1, 2, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, -1, 0, -1, -1, -1, -1, -1, -2, -1, -2, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, -4, -3, -4, -3, -3, -3, -3, -1, -2, 1, 1, 1, 2, 2, 2, 0, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -2, -1, -2, -1, -2, 0, 1, 0, 1, -1, -1, 0, 0, 1, 1, -1, 0, -1, 0, 0, 0, -3, -1, -1, -3, -3, -1, -1, -1, -1, -1, -1, -2, -2, -2, -2, -2, -2, -2, -2, 0, 1, 0, -1, -1, -1, -2, -1, -2, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, -1, -1, 0, 0, -1, -1, 0, 0};
    public final int A;
    public kd1 B;
    public kd1 C;
    public int D;
    public kd1[] E;
    public int F;
    public kd1[] G;
    public kd1 H;
    public kd1 I;
    public z73 J;
    public int K;
    public z73 L;
    public em1 M;
    public final int N;
    public h2e O;
    public h2e P;
    public h2e Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int[] V;
    public int[] W;
    public boolean X;
    public boolean Y;
    public int Z;
    public int a0;
    public int b0;
    public final iso c;
    public final int d;
    public final int e;
    public final String f;
    public final int g;
    public final String h;
    public int i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final z73 f15935k;
    public hkb l;
    public hkb m;
    public int n;
    public z73 o;
    public int p;
    public z73 q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f15936r;
    public z73 s;
    public int t;
    public z73 u;
    public kd1 v;
    public kd1 w;
    public em1 x;
    public final int y;
    public final int[] z;

    public duf(iso isoVar, int i, String str, String str2, String str3, String[] strArr, int i2) {
        super(589824);
        this.f15935k = new z73();
        this.c = isoVar;
        this.d = "<init>".equals(str) ? 262144 | i : i;
        this.e = isoVar.D(str);
        this.f = str;
        this.g = isoVar.D(str2);
        this.h = str2;
        this.A = str3 == null ? 0 : isoVar.D(str3);
        if (strArr == null || strArr.length <= 0) {
            this.y = 0;
            this.z = null;
        } else {
            int length = strArr.length;
            this.y = length;
            this.z = new int[length];
            for (int i3 = 0; i3 < this.y; i3++) {
                this.z[i3] = isoVar.e(strArr[i3]).f18165a;
            }
        }
        this.N = i2;
        if (i2 != 0) {
            int iC = n4q.c(str2) >> 2;
            iC = (i & 8) != 0 ? iC - 1 : iC;
            this.j = iC;
            this.T = iC;
            h2e h2eVar = new h2e();
            this.O = h2eVar;
            o(h2eVar);
        }
    }

    @Override // defpackage.cuf
    public jd1 A(int i, x4q x4qVar, String str, boolean z) {
        if (z) {
            kd1 kd1VarI = kd1.i(this.c, i, x4qVar, str, this.v);
            this.v = kd1VarI;
            return kd1VarI;
        }
        kd1 kd1VarI2 = kd1.i(this.c, i, x4qVar, str, this.w);
        this.w = kd1VarI2;
        return kd1VarI2;
    }

    @Override // defpackage.cuf
    public void B(h2e h2eVar, h2e h2eVar2, h2e h2eVar3, String str) {
        hkb hkbVar = new hkb(h2eVar, h2eVar2, h2eVar3, str != null ? this.c.e(str).f18165a : 0, str);
        if (this.l == null) {
            this.l = hkbVar;
        } else {
            this.m.f = hkbVar;
        }
        this.m = hkbVar;
    }

    @Override // defpackage.cuf
    public jd1 C(int i, x4q x4qVar, String str, boolean z) {
        if (z) {
            kd1 kd1VarI = kd1.i(this.c, i, x4qVar, str, this.H);
            this.H = kd1VarI;
            return kd1VarI;
        }
        kd1 kd1VarI2 = kd1.i(this.c, i, x4qVar, str, this.I);
        this.I = kd1VarI2;
        return kd1VarI2;
    }

    @Override // defpackage.cuf
    public void D(int i, String str) {
        this.Z = this.f15935k.f40971b;
        fso fsoVarE = this.c.e(str);
        this.f15935k.e(i, fsoVarE.f18165a);
        h2e h2eVar = this.Q;
        if (h2eVar != null) {
            int i2 = this.N;
            if (i2 == 4 || i2 == 3) {
                h2eVar.j.d(i, this.Z, fsoVarE, this.c);
            } else if (i == 187) {
                int i3 = this.R + 1;
                if (i3 > this.S) {
                    this.S = i3;
                }
                this.R = i3;
            }
        }
    }

    @Override // defpackage.cuf
    public void E(int i, int i2) {
        z73 z73Var = this.f15935k;
        this.Z = z73Var.f40971b;
        if (i2 < 4 && i != 169) {
            z73Var.g((i < 54 ? ((i - 21) << 2) + 26 : ((i - 54) << 2) + 59) + i2);
        } else if (i2 >= 256) {
            z73Var.g(SportReportBaseParser.ReportType.oxygenConcentration).e(i, i2);
        } else {
            z73Var.c(i, i2);
        }
        h2e h2eVar = this.Q;
        if (h2eVar != null) {
            int i3 = this.N;
            if (i3 == 4 || i3 == 3) {
                h2eVar.j.d(i, i2, null, null);
            } else if (i == 169) {
                h2eVar.f19609a = (short) (h2eVar.f19609a | 64);
                h2eVar.g = (short) this.R;
                L();
            } else {
                int i4 = this.R + c0[i];
                if (i4 > this.S) {
                    this.S = i4;
                }
                this.R = i4;
            }
        }
        int i5 = this.N;
        if (i5 != 0) {
            int i6 = (i == 22 || i == 24 || i == 55 || i == 57) ? i2 + 2 : i2 + 1;
            if (i6 > this.j) {
                this.j = i6;
            }
        }
        if (i < 54 || i5 != 4 || this.l == null) {
            return;
        }
        o(new h2e());
    }

    public final void F(int i, h2e h2eVar) {
        h2e h2eVar2 = this.Q;
        h2eVar2.l = new vz7(i, h2eVar, h2eVar2.l);
    }

    public boolean G(a04 a04Var, boolean z, boolean z2, int i, int i2, int i3) {
        if (a04Var == this.c.S() && i == this.g && i2 == this.A) {
            if (z2 == ((this.d & 131072) != 0)) {
                if (z != (this.c.R() < 49 && (this.d & 4096) != 0)) {
                    return false;
                }
                if (i3 == 0) {
                    if (this.y != 0) {
                        return false;
                    }
                } else if (a04Var.I(i3) == this.y) {
                    int i4 = i3 + 2;
                    for (int i5 = 0; i5 < this.y; i5++) {
                        if (a04Var.I(i4) != this.z[i5]) {
                            return false;
                        }
                        i4 += 2;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void H(em1.a aVar) {
        aVar.b(this.M);
        aVar.b(this.x);
    }

    public final void I() {
        hkb hkbVar = this.l;
        while (true) {
            if (hkbVar == null) {
                break;
            }
            String str = hkbVar.e;
            int iG = eoa.g(this.c, str != null ? str : "java/lang/Throwable");
            h2e h2eVarE = hkbVar.c.e();
            h2eVarE.f19609a = (short) (h2eVarE.f19609a | 2);
            h2e h2eVarE2 = hkbVar.f20161b.e();
            for (h2e h2eVarE3 = hkbVar.f20160a.e(); h2eVarE3 != h2eVarE2; h2eVarE3 = h2eVarE3.f19611k) {
                h2eVarE3.l = new vz7(iG, h2eVarE, h2eVarE3.l);
            }
            hkbVar = hkbVar.f;
        }
        eoa eoaVar = this.O.j;
        eoaVar.u(this.c, this.d, this.h, this.j);
        eoaVar.a(this);
        h2e h2eVar = this.O;
        h2eVar.m = h2e.n;
        int iMax = 0;
        while (h2eVar != h2e.n) {
            h2e h2eVar2 = h2eVar.m;
            h2eVar.m = null;
            h2eVar.f19609a = (short) (h2eVar.f19609a | 8);
            int iJ = h2eVar.j.j() + h2eVar.h;
            if (iJ > iMax) {
                iMax = iJ;
            }
            for (vz7 vz7Var = h2eVar.l; vz7Var != null; vz7Var = vz7Var.c) {
                h2e h2eVarE4 = vz7Var.f37387b.e();
                if (h2eVar.j.m(this.c, h2eVarE4.j, vz7Var.f37386a) && h2eVarE4.m == null) {
                    h2eVarE4.m = h2eVar2;
                    h2eVar2 = h2eVarE4;
                }
            }
            h2eVar = h2eVar2;
        }
        for (h2e h2eVar3 = this.O; h2eVar3 != null; h2eVar3 = h2eVar3.f19611k) {
            if ((h2eVar3.f19609a & 10) == 10) {
                h2eVar3.j.a(this);
            }
            if ((h2eVar3.f19609a & 8) == 0) {
                h2e h2eVar4 = h2eVar3.f19611k;
                int i = h2eVar3.d;
                int i2 = (h2eVar4 == null ? this.f15935k.f40971b : h2eVar4.d) - 1;
                if (i2 >= i) {
                    for (int i3 = i; i3 < i2; i3++) {
                        this.f15935k.f40970a[i3] = 0;
                    }
                    this.f15935k.f40970a[i2] = -65;
                    this.W[V(i, 0, 1)] = eoa.g(this.c, "java/lang/Throwable");
                    U();
                    this.l = hkb.d(this.l, h2eVar3, h2eVar4);
                    iMax = Math.max(iMax, 1);
                }
            }
        }
        this.i = iMax;
    }

    public final void J() {
        for (hkb hkbVar = this.l; hkbVar != null; hkbVar = hkbVar.f) {
            h2e h2eVar = hkbVar.c;
            h2e h2eVar2 = hkbVar.f20161b;
            for (h2e h2eVar3 = hkbVar.f20160a; h2eVar3 != h2eVar2; h2eVar3 = h2eVar3.f19611k) {
                if ((h2eVar3.f19609a & 16) == 0) {
                    h2eVar3.l = new vz7(Integer.MAX_VALUE, h2eVar, h2eVar3.l);
                } else {
                    vz7 vz7Var = h2eVar3.l.c;
                    vz7Var.c = new vz7(Integer.MAX_VALUE, h2eVar, vz7Var.c);
                }
            }
        }
        if (this.X) {
            this.O.f((short) 1);
            short s = 1;
            for (short s2 = 1; s2 <= s; s2 = (short) (s2 + 1)) {
                for (h2e h2eVar4 = this.O; h2eVar4 != null; h2eVar4 = h2eVar4.f19611k) {
                    if ((h2eVar4.f19609a & 16) != 0 && h2eVar4.i == s2) {
                        h2e h2eVar5 = h2eVar4.l.c.f37387b;
                        if (h2eVar5.i == 0) {
                            s = (short) (s + 1);
                            h2eVar5.f(s);
                        }
                    }
                }
            }
            for (h2e h2eVar6 = this.O; h2eVar6 != null; h2eVar6 = h2eVar6.f19611k) {
                if ((h2eVar6.f19609a & 16) != 0) {
                    h2eVar6.l.c.f37387b.d(h2eVar6);
                }
            }
        }
        h2e h2eVar7 = this.O;
        h2eVar7.m = h2e.n;
        int i = this.i;
        while (h2eVar7 != h2e.n) {
            h2e h2eVar8 = h2eVar7.m;
            short s3 = h2eVar7.f;
            int i2 = h2eVar7.h + s3;
            if (i2 > i) {
                i = i2;
            }
            vz7 vz7Var2 = h2eVar7.l;
            if ((h2eVar7.f19609a & 16) != 0) {
                vz7Var2 = vz7Var2.c;
            }
            h2eVar7 = h2eVar8;
            while (vz7Var2 != null) {
                h2e h2eVar9 = vz7Var2.f37387b;
                if (h2eVar9.m == null) {
                    int i3 = vz7Var2.f37386a;
                    h2eVar9.f = (short) (i3 == Integer.MAX_VALUE ? 1 : i3 + s3);
                    h2eVar9.m = h2eVar7;
                    h2eVar7 = h2eVar9;
                }
                vz7Var2 = vz7Var2.c;
            }
        }
        this.i = i;
    }

    public int K() {
        int iB;
        if (this.a0 != 0) {
            return this.b0 + 6;
        }
        int i = this.f15935k.f40971b;
        if (i <= 0) {
            iB = 8;
        } else {
            if (i > 65535) {
                throw new MethodTooLargeException(this.c.O(), this.f, this.h, this.f15935k.f40971b);
            }
            this.c.D("Code");
            iB = this.f15935k.f40971b + 16 + hkb.b(this.l) + 8;
            if (this.u != null) {
                this.c.D(this.c.R() >= 50 ? "StackMapTable" : "StackMap");
                iB += this.u.f40971b + 8;
            }
            if (this.o != null) {
                this.c.D("LineNumberTable");
                iB += this.o.f40971b + 8;
            }
            if (this.q != null) {
                this.c.D("LocalVariableTable");
                iB += this.q.f40971b + 8;
            }
            if (this.s != null) {
                this.c.D("LocalVariableTypeTable");
                iB += this.s.f40971b + 8;
            }
            kd1 kd1Var = this.v;
            if (kd1Var != null) {
                iB += kd1Var.g("RuntimeVisibleTypeAnnotations");
            }
            kd1 kd1Var2 = this.w;
            if (kd1Var2 != null) {
                iB += kd1Var2.g("RuntimeInvisibleTypeAnnotations");
            }
            em1 em1Var = this.x;
            if (em1Var != null) {
                iso isoVar = this.c;
                z73 z73Var = this.f15935k;
                iB += em1Var.c(isoVar, z73Var.f40970a, z73Var.f40971b, this.i, this.j);
            }
        }
        if (this.y > 0) {
            this.c.D("Exceptions");
            iB += (this.y * 2) + 8;
        }
        int iB2 = iB + em1.b(this.c, this.d, this.A) + kd1.f(this.B, this.C, this.H, this.I);
        kd1[] kd1VarArr = this.E;
        if (kd1VarArr != null) {
            int length = this.D;
            if (length == 0) {
                length = kd1VarArr.length;
            }
            iB2 += kd1.h("RuntimeVisibleParameterAnnotations", kd1VarArr, length);
        }
        kd1[] kd1VarArr2 = this.G;
        if (kd1VarArr2 != null) {
            int length2 = this.F;
            if (length2 == 0) {
                length2 = kd1VarArr2.length;
            }
            iB2 += kd1.h("RuntimeInvisibleParameterAnnotations", kd1VarArr2, length2);
        }
        if (this.J != null) {
            this.c.D("AnnotationDefault");
            iB2 += this.J.f40971b + 6;
        }
        if (this.L != null) {
            this.c.D("MethodParameters");
            iB2 += this.L.f40971b + 7;
        }
        em1 em1Var2 = this.M;
        return em1Var2 != null ? iB2 + em1Var2.a(this.c) : iB2;
    }

    public final void L() {
        int i = this.N;
        if (i != 4) {
            if (i == 1) {
                this.Q.h = (short) this.S;
                this.Q = null;
                return;
            }
            return;
        }
        h2e h2eVar = new h2e();
        h2eVar.j = new eoa(h2eVar);
        z73 z73Var = this.f15935k;
        h2eVar.i(z73Var.f40970a, z73Var.f40971b);
        this.P.f19611k = h2eVar;
        this.P = h2eVar;
        this.Q = null;
    }

    public boolean M() {
        return this.Y;
    }

    public boolean N() {
        return this.t > 0;
    }

    public final void O(int i, int i2) {
        while (i < i2) {
            eoa.s(this.c, this.W[i], this.u);
            i++;
        }
    }

    public final void P() {
        char c;
        int[] iArr = this.W;
        int i = iArr[1];
        int i2 = iArr[2];
        if (this.c.R() < 50) {
            this.u.k(this.W[0]).k(i);
            int i3 = i + 3;
            O(3, i3);
            this.u.k(i2);
            O(i3, i2 + i3);
            return;
        }
        int i4 = this.t == 0 ? this.W[0] : (this.W[0] - this.V[0]) - 1;
        int i5 = this.V[1];
        int i6 = i - i5;
        if (i2 == 0) {
            switch (i6) {
                case -3:
                case -2:
                case -1:
                    c = 248;
                    break;
                case 0:
                    c = i4 < 64 ? (char) 0 : (char) 251;
                    break;
                case 1:
                case 2:
                case 3:
                    c = 252;
                    break;
                default:
                    c = 255;
                    break;
            }
        } else if (i6 == 0 && i2 == 1) {
            c = i4 < 63 ? '@' : (char) 247;
        } else {
            c = 255;
        }
        if (c != 255) {
            int i7 = 3;
            for (int i8 = 0; i8 < i5 && i8 < i; i8++) {
                if (this.W[i7] != this.V[i7]) {
                    c = 255;
                } else {
                    i7++;
                }
            }
        }
        if (c == 0) {
            this.u.g(i4);
            return;
        }
        if (c == '@') {
            this.u.g(i4 + 64);
            O(i + 3, i + 4);
            return;
        }
        if (c == 247) {
            this.u.g(247).k(i4);
            O(i + 3, i + 4);
            return;
        }
        if (c == 248) {
            this.u.g(i6 + VibrateModeSetViewModel.DEFAULT_BBJI).k(i4);
            return;
        }
        if (c == 251) {
            this.u.g(VibrateModeSetViewModel.DEFAULT_BBJI).k(i4);
            return;
        }
        if (c == 252) {
            this.u.g(i6 + VibrateModeSetViewModel.DEFAULT_BBJI).k(i4);
            O(i5 + 3, i + 3);
            return;
        }
        this.u.g(255).k(i4).k(i);
        int i9 = i + 3;
        O(3, i9);
        this.u.k(i2);
        O(i9, i2 + i9);
    }

    public final void Q(Object obj) {
        if (obj instanceof Integer) {
            this.u.g(((Integer) obj).intValue());
        } else if (obj instanceof String) {
            this.u.g(7).k(this.c.e((String) obj).f18165a);
        } else {
            this.u.g(8).k(((h2e) obj).d);
        }
    }

    public void R(z73 z73Var) {
        int iD;
        boolean z = this.c.R() < 49;
        z73Var.k((~(z ? 4096 : 0)) & this.d).k(this.e).k(this.g);
        if (this.a0 != 0) {
            z73Var.h(this.c.S().c, this.a0, this.b0);
            return;
        }
        int iD2 = this.f15935k.f40971b > 0 ? 1 : 0;
        if (this.y > 0) {
            iD2++;
        }
        int i = this.d;
        if ((i & 4096) != 0 && z) {
            iD2++;
        }
        if (this.A != 0) {
            iD2++;
        }
        if ((131072 & i) != 0) {
            iD2++;
        }
        if (this.B != null) {
            iD2++;
        }
        if (this.C != null) {
            iD2++;
        }
        if (this.E != null) {
            iD2++;
        }
        if (this.G != null) {
            iD2++;
        }
        if (this.H != null) {
            iD2++;
        }
        if (this.I != null) {
            iD2++;
        }
        if (this.J != null) {
            iD2++;
        }
        if (this.L != null) {
            iD2++;
        }
        em1 em1Var = this.M;
        if (em1Var != null) {
            iD2 += em1Var.d();
        }
        z73Var.k(iD2);
        int i2 = this.f15935k.f40971b;
        if (i2 > 0) {
            int iB = i2 + 10 + hkb.b(this.l);
            z73 z73Var2 = this.u;
            if (z73Var2 != null) {
                iB += z73Var2.f40971b + 8;
                iD = 1;
            } else {
                iD = 0;
            }
            z73 z73Var3 = this.o;
            if (z73Var3 != null) {
                iB += z73Var3.f40971b + 8;
                iD++;
            }
            z73 z73Var4 = this.q;
            if (z73Var4 != null) {
                iB += z73Var4.f40971b + 8;
                iD++;
            }
            z73 z73Var5 = this.s;
            if (z73Var5 != null) {
                iB += z73Var5.f40971b + 8;
                iD++;
            }
            kd1 kd1Var = this.v;
            if (kd1Var != null) {
                iB += kd1Var.g("RuntimeVisibleTypeAnnotations");
                iD++;
            }
            kd1 kd1Var2 = this.w;
            if (kd1Var2 != null) {
                iB += kd1Var2.g("RuntimeInvisibleTypeAnnotations");
                iD++;
            }
            em1 em1Var2 = this.x;
            if (em1Var2 != null) {
                iso isoVar = this.c;
                z73 z73Var6 = this.f15935k;
                iB += em1Var2.c(isoVar, z73Var6.f40970a, z73Var6.f40971b, this.i, this.j);
                iD += this.x.d();
            }
            z73 z73VarI = z73Var.k(this.c.D("Code")).i(iB).k(this.i).k(this.j).i(this.f15935k.f40971b);
            z73 z73Var7 = this.f15935k;
            z73VarI.h(z73Var7.f40970a, 0, z73Var7.f40971b);
            hkb.c(this.l, z73Var);
            z73Var.k(iD);
            if (this.u != null) {
                z73 z73VarK = z73Var.k(this.c.D(this.c.R() >= 50 ? "StackMapTable" : "StackMap")).i(this.u.f40971b + 2).k(this.t);
                z73 z73Var8 = this.u;
                z73VarK.h(z73Var8.f40970a, 0, z73Var8.f40971b);
            }
            if (this.o != null) {
                z73 z73VarK2 = z73Var.k(this.c.D("LineNumberTable")).i(this.o.f40971b + 2).k(this.n);
                z73 z73Var9 = this.o;
                z73VarK2.h(z73Var9.f40970a, 0, z73Var9.f40971b);
            }
            if (this.q != null) {
                z73 z73VarK3 = z73Var.k(this.c.D("LocalVariableTable")).i(this.q.f40971b + 2).k(this.p);
                z73 z73Var10 = this.q;
                z73VarK3.h(z73Var10.f40970a, 0, z73Var10.f40971b);
            }
            if (this.s != null) {
                z73 z73VarK4 = z73Var.k(this.c.D("LocalVariableTypeTable")).i(this.s.f40971b + 2).k(this.f15936r);
                z73 z73Var11 = this.s;
                z73VarK4.h(z73Var11.f40970a, 0, z73Var11.f40971b);
            }
            kd1 kd1Var3 = this.v;
            if (kd1Var3 != null) {
                kd1Var3.k(this.c.D("RuntimeVisibleTypeAnnotations"), z73Var);
            }
            kd1 kd1Var4 = this.w;
            if (kd1Var4 != null) {
                kd1Var4.k(this.c.D("RuntimeInvisibleTypeAnnotations"), z73Var);
            }
            em1 em1Var3 = this.x;
            if (em1Var3 != null) {
                iso isoVar2 = this.c;
                z73 z73Var12 = this.f15935k;
                em1Var3.h(isoVar2, z73Var12.f40970a, z73Var12.f40971b, this.i, this.j, z73Var);
            }
        }
        if (this.y > 0) {
            z73Var.k(this.c.D("Exceptions")).i((this.y * 2) + 2).k(this.y);
            for (int i3 : this.z) {
                z73Var.k(i3);
            }
        }
        em1.f(this.c, this.d, this.A, z73Var);
        kd1.l(this.c, this.B, this.C, this.H, this.I, z73Var);
        if (this.E != null) {
            int iD3 = this.c.D("RuntimeVisibleParameterAnnotations");
            kd1[] kd1VarArr = this.E;
            int length = this.D;
            if (length == 0) {
                length = kd1VarArr.length;
            }
            kd1.m(iD3, kd1VarArr, length, z73Var);
        }
        if (this.G != null) {
            int iD4 = this.c.D("RuntimeInvisibleParameterAnnotations");
            kd1[] kd1VarArr2 = this.G;
            int length2 = this.F;
            if (length2 == 0) {
                length2 = kd1VarArr2.length;
            }
            kd1.m(iD4, kd1VarArr2, length2, z73Var);
        }
        if (this.J != null) {
            z73 z73VarI2 = z73Var.k(this.c.D("AnnotationDefault")).i(this.J.f40971b);
            z73 z73Var13 = this.J;
            z73VarI2.h(z73Var13.f40970a, 0, z73Var13.f40971b);
        }
        if (this.L != null) {
            z73 z73VarG = z73Var.k(this.c.D("MethodParameters")).i(this.L.f40971b + 1).g(this.K);
            z73 z73Var14 = this.L;
            z73VarG.h(z73Var14.f40970a, 0, z73Var14.f40971b);
        }
        em1 em1Var4 = this.M;
        if (em1Var4 != null) {
            em1Var4.g(this.c, z73Var);
        }
    }

    public void S(int i, int i2) {
        this.a0 = i + 6;
        this.b0 = i2 - 6;
    }

    public void T(int i, int i2) {
        this.W[i] = i2;
    }

    public void U() {
        if (this.V != null) {
            if (this.u == null) {
                this.u = new z73();
            }
            P();
            this.t++;
        }
        this.V = this.W;
        this.W = null;
    }

    public int V(int i, int i2, int i3) {
        int i4 = i2 + 3 + i3;
        int[] iArr = this.W;
        if (iArr == null || iArr.length < i4) {
            this.W = new int[i4];
        }
        int[] iArr2 = this.W;
        iArr2[0] = i;
        iArr2[1] = i2;
        iArr2[2] = i3;
        return 3;
    }

    public final void W(h2e h2eVar, h2e[] h2eVarArr) {
        h2e h2eVar2 = this.Q;
        if (h2eVar2 != null) {
            int i = this.N;
            if (i == 4) {
                h2eVar2.j.d(171, 0, null, null);
                F(0, h2eVar);
                h2e h2eVarE = h2eVar.e();
                h2eVarE.f19609a = (short) (h2eVarE.f19609a | 2);
                for (h2e h2eVar3 : h2eVarArr) {
                    F(0, h2eVar3);
                    h2e h2eVarE2 = h2eVar3.e();
                    h2eVarE2.f19609a = (short) (h2eVarE2.f19609a | 2);
                }
            } else if (i == 1) {
                int i2 = this.R - 1;
                this.R = i2;
                F(i2, h2eVar);
                for (h2e h2eVar4 : h2eVarArr) {
                    F(this.R, h2eVar4);
                }
            }
            L();
        }
    }

    @Override // defpackage.cuf
    public void a(int i, boolean z) {
        if (z) {
            this.D = i;
        } else {
            this.F = i;
        }
    }

    @Override // defpackage.cuf
    public jd1 b(String str, boolean z) {
        if (z) {
            kd1 kd1VarJ = kd1.j(this.c, str, this.B);
            this.B = kd1VarJ;
            return kd1VarJ;
        }
        kd1 kd1VarJ2 = kd1.j(this.c, str, this.C);
        this.C = kd1VarJ2;
        return kd1VarJ2;
    }

    @Override // defpackage.cuf
    public jd1 c() {
        z73 z73Var = new z73();
        this.J = z73Var;
        return new kd1(this.c, false, z73Var, null);
    }

    @Override // defpackage.cuf
    public void d(em1 em1Var) {
        if (em1Var.e()) {
            em1Var.c = this.x;
            this.x = em1Var;
        } else {
            em1Var.c = this.M;
            this.M = em1Var;
        }
    }

    @Override // defpackage.cuf
    public void e() {
    }

    @Override // defpackage.cuf
    public void f() {
    }

    @Override // defpackage.cuf
    public void g(int i, String str, String str2, String str3) {
        int i2;
        int i3;
        this.Z = this.f15935k.f40971b;
        fso fsoVarJ = this.c.j(str, str2, str3);
        this.f15935k.e(i, fsoVarJ.f18165a);
        h2e h2eVar = this.Q;
        if (h2eVar != null) {
            int i4 = this.N;
            if (i4 == 4 || i4 == 3) {
                h2eVar.j.d(i, 0, fsoVarJ, this.c);
                return;
            }
            char cCharAt = str3.charAt(0);
            int i5 = -2;
            switch (i) {
                case 178:
                    i2 = this.R + ((cCharAt == 'D' || cCharAt == 'J') ? 2 : 1);
                    break;
                case 179:
                    i3 = this.R;
                    if (cCharAt != 'D' && cCharAt != 'J') {
                        i5 = -1;
                    }
                    i2 = i3 + i5;
                    break;
                case 180:
                    i2 = this.R + ((cCharAt == 'D' || cCharAt == 'J') ? 1 : 0);
                    break;
                default:
                    i3 = this.R;
                    if (cCharAt == 'D' || cCharAt == 'J') {
                        i5 = -3;
                    }
                    i2 = i3 + i5;
                    break;
            }
            if (i2 > this.S) {
                this.S = i2;
            }
            this.R = i2;
        }
    }

    @Override // defpackage.cuf
    public void h(int i, int i2, Object[] objArr, int i3, Object[] objArr2) {
        int i4;
        int i5 = this.N;
        if (i5 == 4) {
            return;
        }
        if (i5 == 3) {
            h2e h2eVar = this.Q;
            eoa eoaVar = h2eVar.j;
            if (eoaVar == null) {
                h2eVar.j = new j55(h2eVar);
                this.Q.j.u(this.c, this.d, this.h, i2);
                this.Q.j.a(this);
            } else {
                if (i == -1) {
                    eoaVar.t(this.c, i2, objArr, i3, objArr2);
                }
                this.Q.j.a(this);
            }
        } else if (i == -1) {
            if (this.V == null) {
                int iC = n4q.c(this.h) >> 2;
                eoa eoaVar2 = new eoa(new h2e());
                eoaVar2.u(this.c, this.d, this.h, iC);
                eoaVar2.a(this);
            }
            this.T = i2;
            int iV = V(this.f15935k.f40971b, i2, i3);
            int i6 = 0;
            while (i6 < i2) {
                this.W[iV] = eoa.e(this.c, objArr[i6]);
                i6++;
                iV++;
            }
            int i7 = 0;
            while (i7 < i3) {
                this.W[iV] = eoa.e(this.c, objArr2[i7]);
                i7++;
                iV++;
            }
            U();
        } else {
            if (this.c.R() < 50) {
                throw new IllegalArgumentException("Class versions V1_5 or less must use F_NEW frames.");
            }
            if (this.u == null) {
                this.u = new z73();
                i4 = this.f15935k.f40971b;
            } else {
                i4 = (this.f15935k.f40971b - this.U) - 1;
                if (i4 < 0) {
                    if (i != 3) {
                        throw new IllegalStateException();
                    }
                    return;
                }
            }
            if (i == 0) {
                this.T = i2;
                this.u.g(255).k(i4).k(i2);
                for (int i8 = 0; i8 < i2; i8++) {
                    Q(objArr[i8]);
                }
                this.u.k(i3);
                for (int i9 = 0; i9 < i3; i9++) {
                    Q(objArr2[i9]);
                }
            } else if (i == 1) {
                this.T += i2;
                this.u.g(i2 + VibrateModeSetViewModel.DEFAULT_BBJI).k(i4);
                for (int i10 = 0; i10 < i2; i10++) {
                    Q(objArr[i10]);
                }
            } else if (i == 2) {
                this.T -= i2;
                this.u.g(VibrateModeSetViewModel.DEFAULT_BBJI - i2).k(i4);
            } else if (i != 3) {
                if (i != 4) {
                    throw new IllegalArgumentException();
                }
                if (i4 < 64) {
                    this.u.g(i4 + 64);
                } else {
                    this.u.g(247).k(i4);
                }
                Q(objArr2[0]);
            } else if (i4 < 64) {
                this.u.g(i4);
            } else {
                this.u.g(VibrateModeSetViewModel.DEFAULT_BBJI).k(i4);
            }
            this.U = this.f15935k.f40971b;
            this.t++;
        }
        if (this.N == 2) {
            this.R = i3;
            for (int i11 = 0; i11 < i3; i11++) {
                Object obj = objArr2[i11];
                if (obj == wah.e || obj == wah.d) {
                    this.R++;
                }
            }
            int i12 = this.R;
            if (i12 > this.S) {
                this.S = i12;
            }
        }
        this.i = Math.max(this.i, i3);
        this.j = Math.max(this.j, this.T);
    }

    @Override // defpackage.cuf
    public void i(int i, int i2) {
        int i3;
        int i4;
        z73 z73Var = this.f15935k;
        this.Z = z73Var.f40971b;
        if (i > 255 || i2 > 127 || i2 < -128) {
            z73Var.g(SportReportBaseParser.ReportType.oxygenConcentration).e(132, i).k(i2);
        } else {
            z73Var.g(132).c(i, i2);
        }
        h2e h2eVar = this.Q;
        if (h2eVar != null && ((i4 = this.N) == 4 || i4 == 3)) {
            h2eVar.j.d(132, i, null, null);
        }
        if (this.N == 0 || (i3 = i + 1) <= this.j) {
            return;
        }
        this.j = i3;
    }

    @Override // defpackage.cuf
    public void j(int i) {
        z73 z73Var = this.f15935k;
        this.Z = z73Var.f40971b;
        z73Var.g(i);
        h2e h2eVar = this.Q;
        if (h2eVar != null) {
            int i2 = this.N;
            if (i2 == 4 || i2 == 3) {
                h2eVar.j.d(i, 0, null, null);
            } else {
                int i3 = this.R + c0[i];
                if (i3 > this.S) {
                    this.S = i3;
                }
                this.R = i3;
            }
            if ((i < 172 || i > 177) && i != 191) {
                return;
            }
            L();
        }
    }

    @Override // defpackage.cuf
    public jd1 k(int i, x4q x4qVar, String str, boolean z) {
        if (z) {
            kd1 kd1VarI = kd1.i(this.c, (i & (-16776961)) | (this.Z << 8), x4qVar, str, this.v);
            this.v = kd1VarI;
            return kd1VarI;
        }
        kd1 kd1VarI2 = kd1.i(this.c, (i & (-16776961)) | (this.Z << 8), x4qVar, str, this.w);
        this.w = kd1VarI2;
        return kd1VarI2;
    }

    @Override // defpackage.cuf
    public void l(int i, int i2) {
        z73 z73Var = this.f15935k;
        this.Z = z73Var.f40971b;
        if (i == 17) {
            z73Var.e(i, i2);
        } else {
            z73Var.c(i, i2);
        }
        h2e h2eVar = this.Q;
        if (h2eVar != null) {
            int i3 = this.N;
            if (i3 == 4 || i3 == 3) {
                h2eVar.j.d(i, i2, null, null);
            } else if (i != 188) {
                int i4 = this.R + 1;
                if (i4 > this.S) {
                    this.S = i4;
                }
                this.R = i4;
            }
        }
    }

    @Override // defpackage.cuf
    public void m(String str, String str2, gkb gkbVar, Object... objArr) {
        this.Z = this.f15935k.f40971b;
        fso fsoVarO = this.c.o(str, str2, gkbVar, objArr);
        this.f15935k.e(SportReportBaseParser.ReportType.avgDivingDepth, fsoVarO.f18165a);
        this.f15935k.k(0);
        h2e h2eVar = this.Q;
        if (h2eVar != null) {
            int i = this.N;
            if (i == 4 || i == 3) {
                h2eVar.j.d(SportReportBaseParser.ReportType.avgDivingDepth, 0, fsoVarO, this.c);
                return;
            }
            int iA = fsoVarO.a();
            int i2 = this.R + ((iA & 3) - (iA >> 2)) + 1;
            if (i2 > this.S) {
                this.S = i2;
            }
            this.R = i2;
        }
    }

    @Override // defpackage.cuf
    public void n(int i, h2e h2eVar) {
        boolean z;
        z73 z73Var = this.f15935k;
        int i2 = z73Var.f40971b;
        this.Z = i2;
        int i3 = i >= 200 ? i - 33 : i;
        if ((h2eVar.f19609a & 4) == 0 || h2eVar.d - i2 >= -32768) {
            if (i3 != i) {
                z73Var.g(i);
                z73 z73Var2 = this.f15935k;
                h2eVar.h(z73Var2, z73Var2.f40971b - 1, true);
            } else {
                z73Var.g(i3);
                z73 z73Var3 = this.f15935k;
                h2eVar.h(z73Var3, z73Var3.f40971b - 1, false);
            }
            z = false;
        } else {
            if (i3 == 167) {
                z73Var.g(200);
            } else {
                if (i3 == 168) {
                    z73Var.g(201);
                } else {
                    z73Var.g(i3 >= 198 ? i3 ^ 1 : ((i3 + 1) ^ 1) - 1);
                    this.f15935k.k(8);
                    this.f15935k.g(220);
                    this.Y = true;
                    z = true;
                }
                z73 z73Var4 = this.f15935k;
                h2eVar.h(z73Var4, z73Var4.f40971b - 1, true);
            }
            z = false;
            z73 z73Var5 = this.f15935k;
            h2eVar.h(z73Var5, z73Var5.f40971b - 1, true);
        }
        h2e h2eVar2 = this.Q;
        if (h2eVar2 != null) {
            int i4 = this.N;
            h2e h2eVar3 = null;
            if (i4 == 4) {
                h2eVar2.j.d(i3, 0, null, null);
                h2e h2eVarE = h2eVar.e();
                h2eVarE.f19609a = (short) (h2eVarE.f19609a | 2);
                F(0, h2eVar);
                if (i3 != 167) {
                    h2eVar3 = new h2e();
                }
            } else if (i4 == 3) {
                h2eVar2.j.d(i3, 0, null, null);
            } else if (i4 == 2) {
                this.R += c0[i3];
            } else if (i3 == 168) {
                short s = h2eVar.f19609a;
                if ((s & 32) == 0) {
                    h2eVar.f19609a = (short) (s | 32);
                    this.X = true;
                }
                h2eVar2.f19609a = (short) (h2eVar2.f19609a | 16);
                F(this.R + 1, h2eVar);
                h2eVar3 = new h2e();
            } else {
                int i5 = this.R + c0[i3];
                this.R = i5;
                F(i5, h2eVar);
            }
            if (h2eVar3 != null) {
                if (z) {
                    h2eVar3.f19609a = (short) (h2eVar3.f19609a | 2);
                }
                o(h2eVar3);
            }
            if (i3 == 167) {
                L();
            }
        }
    }

    @Override // defpackage.cuf
    public void o(h2e h2eVar) {
        boolean z = this.Y;
        z73 z73Var = this.f15935k;
        this.Y = z | h2eVar.i(z73Var.f40970a, z73Var.f40971b);
        short s = h2eVar.f19609a;
        if ((s & 1) != 0) {
            return;
        }
        int i = this.N;
        if (i == 4) {
            h2e h2eVar2 = this.Q;
            if (h2eVar2 != null) {
                if (h2eVar.d == h2eVar2.d) {
                    h2eVar2.f19609a = (short) ((s & 2) | h2eVar2.f19609a);
                    h2eVar.j = h2eVar2.j;
                    return;
                }
                F(0, h2eVar);
            }
            h2e h2eVar3 = this.P;
            if (h2eVar3 != null) {
                if (h2eVar.d == h2eVar3.d) {
                    h2eVar3.f19609a = (short) (h2eVar3.f19609a | (h2eVar.f19609a & 2));
                    h2eVar.j = h2eVar3.j;
                    this.Q = h2eVar3;
                    return;
                }
                h2eVar3.f19611k = h2eVar;
            }
            this.P = h2eVar;
            this.Q = h2eVar;
            h2eVar.j = new eoa(h2eVar);
            return;
        }
        if (i == 3) {
            h2e h2eVar4 = this.Q;
            if (h2eVar4 == null) {
                this.Q = h2eVar;
                return;
            } else {
                h2eVar4.j.f16872a = h2eVar;
                return;
            }
        }
        if (i != 1) {
            if (i == 2 && this.Q == null) {
                this.Q = h2eVar;
                return;
            }
            return;
        }
        h2e h2eVar5 = this.Q;
        if (h2eVar5 != null) {
            h2eVar5.h = (short) this.S;
            F(this.R, h2eVar);
        }
        this.Q = h2eVar;
        this.R = 0;
        this.S = 0;
        h2e h2eVar6 = this.P;
        if (h2eVar6 != null) {
            h2eVar6.f19611k = h2eVar;
        }
        this.P = h2eVar;
    }

    @Override // defpackage.cuf
    public void p(Object obj) {
        char cCharAt;
        this.Z = this.f15935k.f40971b;
        fso fsoVarD = this.c.d(obj);
        int i = fsoVarD.f18165a;
        int i2 = fsoVarD.f18166b;
        boolean z = i2 == 5 || i2 == 6 || (i2 == 17 && ((cCharAt = fsoVarD.e.charAt(0)) == 'J' || cCharAt == 'D'));
        if (z) {
            this.f15935k.e(20, i);
        } else if (i >= 256) {
            this.f15935k.e(19, i);
        } else {
            this.f15935k.c(18, i);
        }
        h2e h2eVar = this.Q;
        if (h2eVar != null) {
            int i3 = this.N;
            if (i3 == 4 || i3 == 3) {
                h2eVar.j.d(18, 0, fsoVarD, this.c);
                return;
            }
            int i4 = this.R + (z ? 2 : 1);
            if (i4 > this.S) {
                this.S = i4;
            }
            this.R = i4;
        }
    }

    @Override // defpackage.cuf
    public void q(int i, h2e h2eVar) {
        if (this.o == null) {
            this.o = new z73();
        }
        this.n++;
        this.o.k(h2eVar.d);
        this.o.k(i);
    }

    @Override // defpackage.cuf
    public void r(String str, String str2, String str3, h2e h2eVar, h2e h2eVar2, int i) {
        if (str3 != null) {
            if (this.s == null) {
                this.s = new z73();
            }
            this.f15936r++;
            this.s.k(h2eVar.d).k(h2eVar2.d - h2eVar.d).k(this.c.D(str)).k(this.c.D(str3)).k(i);
        }
        if (this.q == null) {
            this.q = new z73();
        }
        this.p++;
        this.q.k(h2eVar.d).k(h2eVar2.d - h2eVar.d).k(this.c.D(str)).k(this.c.D(str2)).k(i);
        if (this.N != 0) {
            char cCharAt = str2.charAt(0);
            int i2 = i + ((cCharAt == 'J' || cCharAt == 'D') ? 2 : 1);
            if (i2 > this.j) {
                this.j = i2;
            }
        }
    }

    @Override // defpackage.cuf
    public jd1 s(int i, x4q x4qVar, h2e[] h2eVarArr, h2e[] h2eVarArr2, int[] iArr, String str, boolean z) {
        z73 z73Var = new z73();
        z73Var.g(i >>> 24).k(h2eVarArr.length);
        for (int i2 = 0; i2 < h2eVarArr.length; i2++) {
            z73Var.k(h2eVarArr[i2].d).k(h2eVarArr2[i2].d - h2eVarArr[i2].d).k(iArr[i2]);
        }
        x4q.d(x4qVar, z73Var);
        z73Var.k(this.c.D(str)).k(0);
        if (z) {
            kd1 kd1Var = new kd1(this.c, true, z73Var, this.v);
            this.v = kd1Var;
            return kd1Var;
        }
        kd1 kd1Var2 = new kd1(this.c, true, z73Var, this.w);
        this.w = kd1Var2;
        return kd1Var2;
    }

    @Override // defpackage.cuf
    public void t(h2e h2eVar, int[] iArr, h2e[] h2eVarArr) {
        z73 z73Var = this.f15935k;
        this.Z = z73Var.f40971b;
        z73Var.g(171).h(null, 0, (4 - (this.f15935k.f40971b % 4)) % 4);
        h2eVar.h(this.f15935k, this.Z, true);
        this.f15935k.i(h2eVarArr.length);
        for (int i = 0; i < h2eVarArr.length; i++) {
            this.f15935k.i(iArr[i]);
            h2eVarArr[i].h(this.f15935k, this.Z, true);
        }
        W(h2eVar, h2eVarArr);
    }

    @Override // defpackage.cuf
    public void u(int i, int i2) {
        int i3 = this.N;
        if (i3 == 4) {
            I();
            return;
        }
        if (i3 == 1) {
            J();
        } else if (i3 == 2) {
            this.i = this.S;
        } else {
            this.i = i;
            this.j = i2;
        }
    }

    @Override // defpackage.cuf
    public void v(int i, String str, String str2, String str3, boolean z) {
        this.Z = this.f15935k.f40971b;
        fso fsoVarX = this.c.x(str, str2, str3, z);
        if (i == 185) {
            this.f15935k.e(185, fsoVarX.f18165a).c(fsoVarX.a() >> 2, 0);
        } else {
            this.f15935k.e(i, fsoVarX.f18165a);
        }
        h2e h2eVar = this.Q;
        if (h2eVar != null) {
            int i2 = this.N;
            if (i2 == 4 || i2 == 3) {
                h2eVar.j.d(i, 0, fsoVarX, this.c);
                return;
            }
            int iA = fsoVarX.a();
            int i3 = (iA & 3) - (iA >> 2);
            int i4 = i == 184 ? this.R + i3 + 1 : this.R + i3;
            if (i4 > this.S) {
                this.S = i4;
            }
            this.R = i4;
        }
    }

    @Override // defpackage.cuf
    public void w(String str, int i) {
        this.Z = this.f15935k.f40971b;
        fso fsoVarE = this.c.e(str);
        this.f15935k.e(SportReportBaseParser.ReportType.noFlyDuration, fsoVarE.f18165a).g(i);
        h2e h2eVar = this.Q;
        if (h2eVar != null) {
            int i2 = this.N;
            if (i2 == 4 || i2 == 3) {
                h2eVar.j.d(SportReportBaseParser.ReportType.noFlyDuration, i, fsoVarE, this.c);
            } else {
                this.R += 1 - i;
            }
        }
    }

    @Override // defpackage.cuf
    public void x(String str, int i) {
        if (this.L == null) {
            this.L = new z73();
        }
        this.K++;
        this.L.k(str == null ? 0 : this.c.D(str)).k(i);
    }

    @Override // defpackage.cuf
    public jd1 y(int i, String str, boolean z) {
        if (z) {
            if (this.E == null) {
                this.E = new kd1[n4q.b(this.h).length];
            }
            kd1[] kd1VarArr = this.E;
            kd1 kd1VarJ = kd1.j(this.c, str, kd1VarArr[i]);
            kd1VarArr[i] = kd1VarJ;
            return kd1VarJ;
        }
        if (this.G == null) {
            this.G = new kd1[n4q.b(this.h).length];
        }
        kd1[] kd1VarArr2 = this.G;
        kd1 kd1VarJ2 = kd1.j(this.c, str, kd1VarArr2[i]);
        kd1VarArr2[i] = kd1VarJ2;
        return kd1VarJ2;
    }

    @Override // defpackage.cuf
    public void z(int i, int i2, h2e h2eVar, h2e... h2eVarArr) {
        z73 z73Var = this.f15935k;
        this.Z = z73Var.f40971b;
        z73Var.g(170).h(null, 0, (4 - (this.f15935k.f40971b % 4)) % 4);
        h2eVar.h(this.f15935k, this.Z, true);
        this.f15935k.i(i).i(i2);
        for (h2e h2eVar2 : h2eVarArr) {
            h2eVar2.h(this.f15935k, this.Z, true);
        }
        W(h2eVar, h2eVarArr);
    }
}
