package defpackage;

import com.google.android.exoplayer2.Format;
import java.util.Collections;

/* JADX INFO: loaded from: classes4.dex */
public final class rcb implements u68 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jrl f32401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f32402b;
    public snp c;
    public a d;
    public boolean e;
    public long l;
    public long m;
    public final boolean[] f = new boolean[3];
    public final jgg g = new jgg(32, 128);
    public final jgg h = new jgg(33, 128);
    public final jgg i = new jgg(34, 128);
    public final jgg j = new jgg(39, 128);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final jgg f32403k = new jgg(40, 128);
    public final okh n = new okh();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final snp f32404a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f32405b;
        public boolean c;
        public int d;
        public long e;
        public boolean f;
        public boolean g;
        public boolean h;
        public boolean i;
        public boolean j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public long f32406k;
        public long l;
        public boolean m;

        public a(snp snpVar) {
            this.f32404a = snpVar;
        }

        public static boolean b(int i) {
            return (32 <= i && i <= 35) || i == 39;
        }

        public static boolean c(int i) {
            return i < 32 || i == 40;
        }

        public void a(long j, int i, boolean z) {
            if (this.j && this.g) {
                this.m = this.c;
                this.j = false;
            } else if (this.h || this.g) {
                if (z && this.i) {
                    d(i + ((int) (j - this.f32405b)));
                }
                this.f32406k = this.f32405b;
                this.l = this.e;
                this.m = this.c;
                this.i = true;
            }
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final void d(int i) {
            boolean z = this.m;
            this.f32404a.e(this.l, z ? 1 : 0, (int) (this.f32405b - this.f32406k), i, null);
        }

        public void e(byte[] bArr, int i, int i2) {
            if (this.f) {
                int i3 = this.d;
                int i4 = (i + 2) - i3;
                if (i4 >= i2) {
                    this.d = i3 + (i2 - i);
                } else {
                    this.g = (bArr[i4] & 128) != 0;
                    this.f = false;
                }
            }
        }

        public void f() {
            this.f = false;
            this.g = false;
            this.h = false;
            this.i = false;
            this.j = false;
        }

        public void g(long j, int i, int i2, long j2, boolean z) {
            this.g = false;
            this.h = false;
            this.e = j2;
            this.d = 0;
            this.f32405b = j;
            if (!c(i2)) {
                if (this.i && !this.j) {
                    if (z) {
                        d(i);
                    }
                    this.i = false;
                }
                if (b(i2)) {
                    this.h = !this.j;
                    this.j = true;
                }
            }
            boolean z2 = i2 >= 16 && i2 <= 21;
            this.c = z2;
            this.f = z2 || i2 <= 9;
        }
    }

    public rcb(jrl jrlVar) {
        this.f32401a = jrlVar;
    }

    private void b() {
        rk1.i(this.c);
        wlq.j(this.d);
    }

    private void g(long j, int i, int i2, long j2) {
        this.d.a(j, i, this.e);
        if (!this.e) {
            this.g.b(i2);
            this.h.b(i2);
            this.i.b(i2);
            if (this.g.c() && this.h.c() && this.i.c()) {
                this.c.b(i(this.f32402b, this.g, this.h, this.i));
                this.e = true;
            }
        }
        if (this.j.b(i2)) {
            jgg jggVar = this.j;
            this.n.N(this.j.d, kgg.k(jggVar.d, jggVar.e));
            this.n.Q(5);
            this.f32401a.a(j2, this.n);
        }
        if (this.f32403k.b(i2)) {
            jgg jggVar2 = this.f32403k;
            this.n.N(this.f32403k.d, kgg.k(jggVar2.d, jggVar2.e));
            this.n.Q(5);
            this.f32401a.a(j2, this.n);
        }
    }

    private void h(byte[] bArr, int i, int i2) {
        this.d.e(bArr, i, i2);
        if (!this.e) {
            this.g.a(bArr, i, i2);
            this.h.a(bArr, i, i2);
            this.i.a(bArr, i, i2);
        }
        this.j.a(bArr, i, i2);
        this.f32403k.a(bArr, i, i2);
    }

    public static Format i(String str, jgg jggVar, jgg jggVar2, jgg jggVar3) {
        int i = jggVar.e;
        byte[] bArr = new byte[jggVar2.e + i + jggVar3.e];
        System.arraycopy(jggVar.d, 0, bArr, 0, i);
        System.arraycopy(jggVar2.d, 0, bArr, jggVar.e, jggVar2.e);
        System.arraycopy(jggVar3.d, 0, bArr, jggVar.e + jggVar2.e, jggVar3.e);
        pkh pkhVar = new pkh(jggVar2.d, 0, jggVar2.e);
        pkhVar.l(44);
        int iE = pkhVar.e(3);
        pkhVar.k();
        pkhVar.l(88);
        pkhVar.l(8);
        int i2 = 0;
        for (int i3 = 0; i3 < iE; i3++) {
            if (pkhVar.d()) {
                i2 += 89;
            }
            if (pkhVar.d()) {
                i2 += 8;
            }
        }
        pkhVar.l(i2);
        if (iE > 0) {
            pkhVar.l((8 - iE) * 2);
        }
        pkhVar.h();
        int iH = pkhVar.h();
        if (iH == 3) {
            pkhVar.k();
        }
        int iH2 = pkhVar.h();
        int iH3 = pkhVar.h();
        if (pkhVar.d()) {
            int iH4 = pkhVar.h();
            int iH5 = pkhVar.h();
            int iH6 = pkhVar.h();
            int iH7 = pkhVar.h();
            iH2 -= ((iH == 1 || iH == 2) ? 2 : 1) * (iH4 + iH5);
            iH3 -= (iH == 1 ? 2 : 1) * (iH6 + iH7);
        }
        pkhVar.h();
        pkhVar.h();
        int iH8 = pkhVar.h();
        for (int i4 = pkhVar.d() ? 0 : iE; i4 <= iE; i4++) {
            pkhVar.h();
            pkhVar.h();
            pkhVar.h();
        }
        pkhVar.h();
        pkhVar.h();
        pkhVar.h();
        pkhVar.h();
        pkhVar.h();
        pkhVar.h();
        if (pkhVar.d() && pkhVar.d()) {
            j(pkhVar);
        }
        pkhVar.l(2);
        if (pkhVar.d()) {
            pkhVar.l(8);
            pkhVar.h();
            pkhVar.h();
            pkhVar.k();
        }
        k(pkhVar);
        if (pkhVar.d()) {
            for (int i5 = 0; i5 < pkhVar.h(); i5++) {
                pkhVar.l(iH8 + 5);
            }
        }
        pkhVar.l(2);
        float f = 1.0f;
        if (pkhVar.d()) {
            if (pkhVar.d()) {
                int iE2 = pkhVar.e(8);
                if (iE2 == 255) {
                    int iE3 = pkhVar.e(16);
                    int iE4 = pkhVar.e(16);
                    if (iE3 != 0 && iE4 != 0) {
                        f = iE3 / iE4;
                    }
                } else {
                    float[] fArr = kgg.f23822b;
                    if (iE2 < fArr.length) {
                        f = fArr[iE2];
                    } else {
                        StringBuilder sb = new StringBuilder(46);
                        sb.append("Unexpected aspect_ratio_idc value: ");
                        sb.append(iE2);
                        toe.h("H265Reader", sb.toString());
                    }
                }
            }
            if (pkhVar.d()) {
                pkhVar.k();
            }
            if (pkhVar.d()) {
                pkhVar.l(4);
                if (pkhVar.d()) {
                    pkhVar.l(24);
                }
            }
            if (pkhVar.d()) {
                pkhVar.h();
                pkhVar.h();
            }
            pkhVar.k();
            if (pkhVar.d()) {
                iH3 *= 2;
            }
        }
        pkhVar.i(jggVar2.d, 0, jggVar2.e);
        pkhVar.l(24);
        return new Format.b().S(str).e0("video/hevc").I(m34.c(pkhVar)).j0(iH2).Q(iH3).a0(f).T(Collections.singletonList(bArr)).E();
    }

    public static void j(pkh pkhVar) {
        for (int i = 0; i < 4; i++) {
            int i2 = 0;
            while (i2 < 6) {
                int i3 = 1;
                if (pkhVar.d()) {
                    int iMin = Math.min(64, 1 << ((i << 1) + 4));
                    if (i > 1) {
                        pkhVar.g();
                    }
                    for (int i4 = 0; i4 < iMin; i4++) {
                        pkhVar.g();
                    }
                } else {
                    pkhVar.h();
                }
                if (i == 3) {
                    i3 = 3;
                }
                i2 += i3;
            }
        }
    }

    public static void k(pkh pkhVar) {
        int iH = pkhVar.h();
        boolean zD = false;
        int i = 0;
        for (int i2 = 0; i2 < iH; i2++) {
            if (i2 != 0) {
                zD = pkhVar.d();
            }
            if (zD) {
                pkhVar.k();
                pkhVar.h();
                for (int i3 = 0; i3 <= i; i3++) {
                    if (pkhVar.d()) {
                        pkhVar.k();
                    }
                }
            } else {
                int iH2 = pkhVar.h();
                int iH3 = pkhVar.h();
                int i4 = iH2 + iH3;
                for (int i5 = 0; i5 < iH2; i5++) {
                    pkhVar.h();
                    pkhVar.k();
                }
                for (int i6 = 0; i6 < iH3; i6++) {
                    pkhVar.h();
                    pkhVar.k();
                }
                i = i4;
            }
        }
    }

    @Override // defpackage.u68
    public void a(okh okhVar) {
        b();
        while (okhVar.a() > 0) {
            int iE = okhVar.e();
            int iF = okhVar.f();
            byte[] bArrD = okhVar.d();
            this.l += (long) okhVar.a();
            this.c.d(okhVar, okhVar.a());
            while (iE < iF) {
                int iC = kgg.c(bArrD, iE, iF, this.f);
                if (iC == iF) {
                    h(bArrD, iE, iF);
                    return;
                }
                int iE2 = kgg.e(bArrD, iC);
                int i = iC - iE;
                if (i > 0) {
                    h(bArrD, iE, iC);
                }
                int i2 = iF - iC;
                long j = this.l - ((long) i2);
                g(j, i2, i < 0 ? -i : 0, this.m);
                l(j, i2, iE2, this.m);
                iE = iC + 3;
            }
        }
    }

    @Override // defpackage.u68
    public void c() {
        this.l = 0L;
        kgg.a(this.f);
        this.g.d();
        this.h.d();
        this.i.d();
        this.j.d();
        this.f32403k.d();
        a aVar = this.d;
        if (aVar != null) {
            aVar.f();
        }
    }

    @Override // defpackage.u68
    public void d() {
    }

    @Override // defpackage.u68
    public void e(long j, int i) {
        this.m = j;
    }

    @Override // defpackage.u68
    public void f(kl8 kl8Var, i2q.d dVar) {
        dVar.a();
        this.f32402b = dVar.b();
        snp snpVarD = kl8Var.d(dVar.c(), 2);
        this.c = snpVarD;
        this.d = new a(snpVarD);
        this.f32401a.b(kl8Var, dVar);
    }

    public final void l(long j, int i, int i2, long j2) {
        this.d.g(j, i, i2, j2, this.e);
        if (!this.e) {
            this.g.e(i2);
            this.h.e(i2);
            this.i.e(i2);
        }
        this.j.e(i2);
        this.f32403k.e(i2);
    }
}
