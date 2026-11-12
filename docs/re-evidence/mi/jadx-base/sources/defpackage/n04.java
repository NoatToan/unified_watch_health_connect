package defpackage;

import com.nimbusds.jose.shaded.ow2asm.ClassTooLargeException;

/* JADX INFO: loaded from: classes6.dex */
public class n04 extends m04 {
    public int A;
    public z73 B;
    public int C;
    public z73 D;
    public tjj E;
    public tjj F;
    public em1 G;
    public int H;
    public int c;
    public final iso d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int[] i;
    public hl9 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public hl9 f27395k;
    public duf l;
    public duf m;
    public int n;
    public z73 o;
    public int p;
    public int q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f27396r;
    public int s;
    public z73 t;
    public kd1 u;
    public kd1 v;
    public kd1 w;
    public kd1 x;
    public m7g y;
    public int z;

    public n04(int i) {
        this(null, i);
    }

    @Override // defpackage.m04
    public final void a(int i, int i2, String str, String str2, String str3, String[] strArr) {
        this.c = i;
        this.e = i2;
        int i3 = i & 65535;
        this.f = this.d.f0(i3, str);
        if (str2 != null) {
            this.f27396r = this.d.D(str2);
        }
        this.g = str3 == null ? 0 : this.d.e(str3).f18165a;
        if (strArr != null && strArr.length > 0) {
            int length = strArr.length;
            this.h = length;
            this.i = new int[length];
            for (int i4 = 0; i4 < this.h; i4++) {
                this.i[i4] = this.d.e(strArr[i4]).f18165a;
            }
        }
        if (this.H != 1 || i3 < 51) {
            return;
        }
        this.H = 2;
    }

    @Override // defpackage.m04
    public final jd1 b(String str, boolean z) {
        if (z) {
            kd1 kd1VarJ = kd1.j(this.d, str, this.u);
            this.u = kd1VarJ;
            return kd1VarJ;
        }
        kd1 kd1VarJ2 = kd1.j(this.d, str, this.v);
        this.v = kd1VarJ2;
        return kd1VarJ2;
    }

    @Override // defpackage.m04
    public final void c(em1 em1Var) {
        em1Var.c = this.G;
        this.G = em1Var;
    }

    @Override // defpackage.m04
    public final void d() {
    }

    @Override // defpackage.m04
    public final gl9 e(int i, String str, String str2, String str3, Object obj) {
        hl9 hl9Var = new hl9(this.d, i, str, str2, str3, obj);
        if (this.j == null) {
            this.j = hl9Var;
        } else {
            this.f27395k.f19101b = hl9Var;
        }
        this.f27395k = hl9Var;
        return hl9Var;
    }

    @Override // defpackage.m04
    public final void f(String str, String str2, String str3, int i) {
        if (this.o == null) {
            this.o = new z73();
        }
        fso fsoVarE = this.d.e(str);
        if (fsoVarE.g == 0) {
            this.n++;
            this.o.k(fsoVarE.f18165a);
            this.o.k(str2 == null ? 0 : this.d.e(str2).f18165a);
            this.o.k(str3 != null ? this.d.D(str3) : 0);
            this.o.k(i);
            fsoVarE.g = this.n;
        }
    }

    @Override // defpackage.m04
    public final cuf g(int i, String str, String str2, String str3, String[] strArr) {
        duf dufVar = new duf(this.d, i, str, str2, str3, strArr, this.H);
        if (this.l == null) {
            this.l = dufVar;
        } else {
            this.m.f14725b = dufVar;
        }
        this.m = dufVar;
        return dufVar;
    }

    @Override // defpackage.m04
    public final l7g h(String str, int i, String str2) {
        iso isoVar = this.d;
        m7g m7gVar = new m7g(isoVar, isoVar.y(str).f18165a, i, str2 == null ? 0 : this.d.D(str2));
        this.y = m7gVar;
        return m7gVar;
    }

    @Override // defpackage.m04
    public final void i(String str) {
        this.z = this.d.e(str).f18165a;
    }

    @Override // defpackage.m04
    public final void j(String str) {
        if (this.B == null) {
            this.B = new z73();
        }
        this.A++;
        this.B.k(this.d.e(str).f18165a);
    }

    @Override // defpackage.m04
    public final void k(String str, String str2, String str3) {
        this.p = this.d.e(str).f18165a;
        if (str2 == null || str3 == null) {
            return;
        }
        this.q = this.d.z(str2, str3);
    }

    @Override // defpackage.m04
    public final void l(String str) {
        if (this.D == null) {
            this.D = new z73();
        }
        this.C++;
        this.D.k(this.d.e(str).f18165a);
    }

    @Override // defpackage.m04
    public final sjj m(String str, String str2, String str3) {
        tjj tjjVar = new tjj(this.d, str, str2, str3);
        if (this.E == null) {
            this.E = tjjVar;
        } else {
            this.F.f33709b = tjjVar;
        }
        this.F = tjjVar;
        return tjjVar;
    }

    @Override // defpackage.m04
    public final void n(String str, String str2) {
        if (str != null) {
            this.s = this.d.D(str);
        }
        if (str2 != null) {
            this.t = new z73().a(str2, 0, Integer.MAX_VALUE);
        }
    }

    @Override // defpackage.m04
    public final jd1 o(int i, x4q x4qVar, String str, boolean z) {
        if (z) {
            kd1 kd1VarI = kd1.i(this.d, i, x4qVar, str, this.w);
            this.w = kd1VarI;
            return kd1VarI;
        }
        kd1 kd1VarI2 = kd1.i(this.d, i, x4qVar, str, this.x);
        this.x = kd1VarI2;
        return kd1VarI2;
    }

    public final em1[] p() {
        em1.a aVar = new em1.a();
        aVar.b(this.G);
        for (hl9 hl9Var = this.j; hl9Var != null; hl9Var = (hl9) hl9Var.f19101b) {
            hl9Var.e(aVar);
        }
        for (duf dufVar = this.l; dufVar != null; dufVar = (duf) dufVar.f14725b) {
            dufVar.H(aVar);
        }
        for (tjj tjjVar = this.E; tjjVar != null; tjjVar = (tjj) tjjVar.f33709b) {
            tjjVar.e(aVar);
        }
        return aVar.d();
    }

    public ClassLoader q() {
        return getClass().getClassLoader();
    }

    public String r(String str, String str2) {
        ClassLoader classLoaderQ = q();
        try {
            Class<?> cls = Class.forName(str.replace('/', '.'), false, classLoaderQ);
            try {
                Class<?> cls2 = Class.forName(str2.replace('/', '.'), false, classLoaderQ);
                if (cls.isAssignableFrom(cls2)) {
                    return str;
                }
                if (cls2.isAssignableFrom(cls)) {
                    return str2;
                }
                if (cls.isInterface() || cls2.isInterface()) {
                    return "java/lang/Object";
                }
                do {
                    cls = cls.getSuperclass();
                } while (!cls.isAssignableFrom(cls2));
                return cls.getName().replace('.', '/');
            } catch (ClassNotFoundException e) {
                throw new TypeNotPresentException(str2, e);
            }
        } catch (ClassNotFoundException e2) {
            throw new TypeNotPresentException(str, e2);
        }
    }

    public final byte[] s(byte[] bArr, boolean z) {
        em1[] em1VarArrP = p();
        this.j = null;
        this.f27395k = null;
        this.l = null;
        this.m = null;
        this.u = null;
        this.v = null;
        this.w = null;
        this.x = null;
        this.y = null;
        this.z = 0;
        this.A = 0;
        this.B = null;
        this.C = 0;
        this.D = null;
        this.E = null;
        this.F = null;
        this.G = null;
        this.H = z ? 3 : 0;
        new a04(bArr, 0, false).a(this, em1VarArrP, (z ? 8 : 0) | 256);
        return t();
    }

    public byte[] t() {
        int iJ;
        int iF;
        int i;
        int i2;
        int i3;
        int iA = (this.h * 2) + 24;
        int i4 = 0;
        for (hl9 hl9Var = this.j; hl9Var != null; hl9Var = (hl9) hl9Var.f19101b) {
            i4++;
            iA += hl9Var.f();
        }
        int i5 = 0;
        for (duf dufVar = this.l; dufVar != null; dufVar = (duf) dufVar.f14725b) {
            i5++;
            iA += dufVar.K();
        }
        z73 z73Var = this.o;
        if (z73Var != null) {
            iA += z73Var.f40971b + 8;
            this.d.D("InnerClasses");
            iJ = 1;
        } else {
            iJ = 0;
        }
        if (this.p != 0) {
            iJ++;
            iA += 10;
            this.d.D("EnclosingMethod");
        }
        if ((this.e & 4096) != 0 && (this.c & 65535) < 49) {
            iJ++;
            iA += 6;
            this.d.D("Synthetic");
        }
        if (this.f27396r != 0) {
            iJ++;
            iA += 8;
            this.d.D("Signature");
        }
        if (this.s != 0) {
            iJ++;
            iA += 8;
            this.d.D("SourceFile");
        }
        z73 z73Var2 = this.t;
        if (z73Var2 != null) {
            iJ++;
            iA += z73Var2.f40971b + 6;
            this.d.D("SourceDebugExtension");
        }
        if ((this.e & 131072) != 0) {
            iJ++;
            iA += 6;
            this.d.D("Deprecated");
        }
        kd1 kd1Var = this.u;
        if (kd1Var != null) {
            iJ++;
            iA += kd1Var.g("RuntimeVisibleAnnotations");
        }
        kd1 kd1Var2 = this.v;
        if (kd1Var2 != null) {
            iJ++;
            iA += kd1Var2.g("RuntimeInvisibleAnnotations");
        }
        kd1 kd1Var3 = this.w;
        if (kd1Var3 != null) {
            iJ++;
            iA += kd1Var3.g("RuntimeVisibleTypeAnnotations");
        }
        kd1 kd1Var4 = this.x;
        if (kd1Var4 != null) {
            iJ++;
            iA += kd1Var4.g("RuntimeInvisibleTypeAnnotations");
        }
        if (this.d.L() > 0) {
            iJ++;
            iA += this.d.L();
        }
        m7g m7gVar = this.y;
        if (m7gVar != null) {
            iJ += m7gVar.j();
            iA += this.y.i();
        }
        if (this.z != 0) {
            iJ++;
            iA += 8;
            this.d.D("NestHost");
        }
        z73 z73Var3 = this.B;
        if (z73Var3 != null) {
            iJ++;
            iA += z73Var3.f40971b + 8;
            this.d.D("NestMembers");
        }
        z73 z73Var4 = this.D;
        if (z73Var4 != null) {
            iJ++;
            iA += z73Var4.f40971b + 8;
            this.d.D("PermittedSubclasses");
        }
        if ((this.e & 65536) == 0 && this.E == null) {
            iF = 0;
            i = 0;
        } else {
            iF = 0;
            i = 0;
            for (tjj tjjVar = this.E; tjjVar != null; tjjVar = (tjj) tjjVar.f33709b) {
                i++;
                iF += tjjVar.f();
            }
            iJ++;
            iA += iF + 8;
            this.d.D("Record");
        }
        em1 em1Var = this.G;
        if (em1Var != null) {
            int iD = iJ + em1Var.d();
            iA += this.G.a(this.d);
            iJ = iD;
        }
        int iQ = iA + this.d.Q();
        int iP = this.d.P();
        if (iP > 65535) {
            throw new ClassTooLargeException(this.d.O(), iP);
        }
        z73 z73Var5 = new z73(iQ);
        z73Var5.i(-889275714).i(this.c);
        this.d.e0(z73Var5);
        z73Var5.k((~((this.c & 65535) < 49 ? 4096 : 0)) & this.e).k(this.f).k(this.g);
        z73Var5.k(this.h);
        for (int i6 = 0; i6 < this.h; i6++) {
            z73Var5.k(this.i[i6]);
        }
        z73Var5.k(i4);
        for (hl9 hl9Var2 = this.j; hl9Var2 != null; hl9Var2 = (hl9) hl9Var2.f19101b) {
            hl9Var2.g(z73Var5);
        }
        z73Var5.k(i5);
        boolean zN = false;
        boolean zM = false;
        for (duf dufVar2 = this.l; dufVar2 != null; dufVar2 = (duf) dufVar2.f14725b) {
            zN |= dufVar2.N();
            zM |= dufVar2.M();
            dufVar2.R(z73Var5);
        }
        z73Var5.k(iJ);
        if (this.o != null) {
            z73 z73VarK = z73Var5.k(this.d.D("InnerClasses")).i(this.o.f40971b + 2).k(this.n);
            z73 z73Var6 = this.o;
            z73VarK.h(z73Var6.f40970a, 0, z73Var6.f40971b);
        }
        if (this.p != 0) {
            z73Var5.k(this.d.D("EnclosingMethod")).i(4).k(this.p).k(this.q);
        }
        if ((this.e & 4096) != 0 && (this.c & 65535) < 49) {
            z73Var5.k(this.d.D("Synthetic")).i(0);
        }
        if (this.f27396r != 0) {
            i2 = 2;
            z73Var5.k(this.d.D("Signature")).i(2).k(this.f27396r);
        } else {
            i2 = 2;
        }
        if (this.s != 0) {
            z73Var5.k(this.d.D("SourceFile")).i(i2).k(this.s);
        }
        z73 z73Var7 = this.t;
        if (z73Var7 != null) {
            int i7 = z73Var7.f40971b;
            i3 = 0;
            z73Var5.k(this.d.D("SourceDebugExtension")).i(i7).h(this.t.f40970a, 0, i7);
        } else {
            i3 = 0;
        }
        if ((this.e & 131072) != 0) {
            z73Var5.k(this.d.D("Deprecated")).i(i3);
        }
        kd1.l(this.d, this.u, this.v, this.w, this.x, z73Var5);
        this.d.d0(z73Var5);
        m7g m7gVar2 = this.y;
        if (m7gVar2 != null) {
            m7gVar2.k(z73Var5);
        }
        if (this.z != 0) {
            z73Var5.k(this.d.D("NestHost")).i(2).k(this.z);
        }
        if (this.B != null) {
            z73 z73VarK2 = z73Var5.k(this.d.D("NestMembers")).i(this.B.f40971b + 2).k(this.A);
            z73 z73Var8 = this.B;
            z73VarK2.h(z73Var8.f40970a, 0, z73Var8.f40971b);
        }
        if (this.D != null) {
            z73 z73VarK3 = z73Var5.k(this.d.D("PermittedSubclasses")).i(this.D.f40971b + 2).k(this.C);
            z73 z73Var9 = this.D;
            z73VarK3.h(z73Var9.f40970a, 0, z73Var9.f40971b);
        }
        if ((this.e & 65536) != 0 || this.E != null) {
            z73Var5.k(this.d.D("Record")).i(iF + 2).k(i);
            for (tjj tjjVar2 = this.E; tjjVar2 != null; tjjVar2 = (tjj) tjjVar2.f33709b) {
                tjjVar2.g(z73Var5);
            }
        }
        em1 em1Var2 = this.G;
        if (em1Var2 != null) {
            em1Var2.g(this.d, z73Var5);
        }
        return zM ? s(z73Var5.f40970a, zN) : z73Var5.f40970a;
    }

    public n04(a04 a04Var, int i) {
        super(589824);
        this.d = a04Var == null ? new iso(this) : new iso(this, a04Var);
        if ((i & 2) != 0) {
            this.H = 4;
        } else if ((i & 1) != 0) {
            this.H = 1;
        } else {
            this.H = 0;
        }
    }
}
