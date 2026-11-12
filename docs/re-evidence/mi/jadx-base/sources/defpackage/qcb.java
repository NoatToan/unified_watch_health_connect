package defpackage;

import android.util.SparseArray;
import com.google.android.exoplayer2.Format;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class qcb implements u68 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jrl f31358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f31359b;
    public final boolean c;
    public long g;
    public String i;
    public snp j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public b f31360k;
    public boolean l;
    public long m;
    public boolean n;
    public final boolean[] h = new boolean[3];
    public final jgg d = new jgg(7, 128);
    public final jgg e = new jgg(8, 128);
    public final jgg f = new jgg(6, 128);
    public final okh o = new okh();

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final snp f31361a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f31362b;
        public final boolean c;
        public final SparseArray<kgg.b> d = new SparseArray<>();
        public final SparseArray<kgg.a> e = new SparseArray<>();
        public final pkh f;
        public byte[] g;
        public int h;
        public int i;
        public long j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f31363k;
        public long l;
        public a m;
        public a n;
        public boolean o;
        public long p;
        public long q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public boolean f31364r;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public boolean f31365a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public boolean f31366b;
            public kgg.b c;
            public int d;
            public int e;
            public int f;
            public int g;
            public boolean h;
            public boolean i;
            public boolean j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public boolean f31367k;
            public int l;
            public int m;
            public int n;
            public int o;
            public int p;

            public a() {
            }

            public void b() {
                this.f31366b = false;
                this.f31365a = false;
            }

            public final boolean c(a aVar) {
                int i;
                int i2;
                int i3;
                boolean z;
                if (!this.f31365a) {
                    return false;
                }
                if (!aVar.f31365a) {
                    return true;
                }
                kgg.b bVar = (kgg.b) rk1.i(this.c);
                kgg.b bVar2 = (kgg.b) rk1.i(aVar.c);
                return (this.f == aVar.f && this.g == aVar.g && this.h == aVar.h && (!this.i || !aVar.i || this.j == aVar.j) && (((i = this.d) == (i2 = aVar.d) || (i != 0 && i2 != 0)) && (((i3 = bVar.f23827k) != 0 || bVar2.f23827k != 0 || (this.m == aVar.m && this.n == aVar.n)) && ((i3 != 1 || bVar2.f23827k != 1 || (this.o == aVar.o && this.p == aVar.p)) && (z = this.f31367k) == aVar.f31367k && (!z || this.l == aVar.l))))) ? false : true;
            }

            public boolean d() {
                int i;
                return this.f31366b && ((i = this.e) == 7 || i == 2);
            }

            public void e(kgg.b bVar, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, int i5, int i6, int i7, int i8, int i9) {
                this.c = bVar;
                this.d = i;
                this.e = i2;
                this.f = i3;
                this.g = i4;
                this.h = z;
                this.i = z2;
                this.j = z3;
                this.f31367k = z4;
                this.l = i5;
                this.m = i6;
                this.n = i7;
                this.o = i8;
                this.p = i9;
                this.f31365a = true;
                this.f31366b = true;
            }

            public void f(int i) {
                this.e = i;
                this.f31366b = true;
            }
        }

        public b(snp snpVar, boolean z, boolean z2) {
            this.f31361a = snpVar;
            this.f31362b = z;
            this.c = z2;
            this.m = new a();
            this.n = new a();
            byte[] bArr = new byte[128];
            this.g = bArr;
            this.f = new pkh(bArr, 0, 0);
            g();
        }

        /* JADX WARN: Code duplicated, block: B:53:0x0100  */
        /* JADX WARN: Code duplicated, block: B:54:0x0103  */
        /* JADX WARN: Code duplicated, block: B:56:0x0107  */
        /* JADX WARN: Code duplicated, block: B:58:0x010f A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:59:0x0110  */
        /* JADX WARN: Code duplicated, block: B:60:0x0119  */
        /* JADX WARN: Code duplicated, block: B:63:0x011f  */
        /* JADX WARN: Code duplicated, block: B:65:0x0129 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:66:0x012a  */
        /* JADX WARN: Code duplicated, block: B:76:0x0157  */
        public void a(byte[] bArr, int i, int i2) {
            boolean z;
            boolean z2;
            boolean zD;
            boolean z3;
            int iH;
            int i3;
            int i4;
            int iG;
            int i5;
            int iG2;
            int iE;
            if (this.f31363k) {
                int i6 = i2 - i;
                byte[] bArr2 = this.g;
                int length = bArr2.length;
                int i7 = this.h;
                if (length < i7 + i6) {
                    this.g = Arrays.copyOf(bArr2, (i7 + i6) * 2);
                }
                System.arraycopy(bArr, i, this.g, this.h, i6);
                int i8 = this.h + i6;
                this.h = i8;
                this.f.i(this.g, 0, i8);
                if (this.f.b(8)) {
                    this.f.k();
                    int iE2 = this.f.e(2);
                    this.f.l(5);
                    if (this.f.c()) {
                        this.f.h();
                        if (this.f.c()) {
                            int iH2 = this.f.h();
                            if (!this.c) {
                                this.f31363k = false;
                                this.n.f(iH2);
                                return;
                            }
                            if (this.f.c()) {
                                int iH3 = this.f.h();
                                if (this.e.indexOfKey(iH3) < 0) {
                                    this.f31363k = false;
                                    return;
                                }
                                kgg.a aVar = this.e.get(iH3);
                                kgg.b bVar = this.d.get(aVar.f23824b);
                                if (bVar.h) {
                                    if (!this.f.b(2)) {
                                        return;
                                    } else {
                                        this.f.l(2);
                                    }
                                }
                                if (this.f.b(bVar.j)) {
                                    int iE3 = this.f.e(bVar.j);
                                    if (!bVar.i) {
                                        if (this.f.b(1)) {
                                            boolean zD2 = this.f.d();
                                            if (!zD2) {
                                                z = zD2;
                                                z2 = false;
                                            } else {
                                                if (!this.f.b(1)) {
                                                    return;
                                                }
                                                z = zD2;
                                                z2 = true;
                                                zD = this.f.d();
                                            }
                                            if (this.i == 5) {
                                                z3 = true;
                                            } else {
                                                z3 = false;
                                            }
                                            if (z3) {
                                                iH = 0;
                                            } else if (!this.f.c()) {
                                                return;
                                            } else {
                                                iH = this.f.h();
                                            }
                                            i3 = bVar.f23827k;
                                            if (i3 != 0) {
                                                if (this.f.b(bVar.l)) {
                                                    iE = this.f.e(bVar.l);
                                                    if (aVar.c || z) {
                                                        i4 = iE;
                                                        iG = 0;
                                                    } else {
                                                        if (!this.f.c()) {
                                                            return;
                                                        }
                                                        iG = this.f.g();
                                                        i4 = iE;
                                                        i5 = 0;
                                                    }
                                                    iG2 = i5;
                                                    this.n.e(bVar, iE2, iH2, iE3, iH3, z, z2, zD, z3, iH, i4, iG, i5, iG2);
                                                    this.f31363k = false;
                                                }
                                                return;
                                            }
                                            if (i3 == 1 || bVar.m) {
                                                i4 = 0;
                                                iG = 0;
                                            } else {
                                                if (!this.f.c()) {
                                                    return;
                                                }
                                                int iG3 = this.f.g();
                                                if (!aVar.c || z) {
                                                    i5 = iG3;
                                                    i4 = 0;
                                                    iG = 0;
                                                    iG2 = 0;
                                                } else {
                                                    if (!this.f.c()) {
                                                        return;
                                                    }
                                                    iG2 = this.f.g();
                                                    i5 = iG3;
                                                    i4 = 0;
                                                    iG = 0;
                                                }
                                            }
                                            this.n.e(bVar, iE2, iH2, iE3, iH3, z, z2, zD, z3, iH, i4, iG, i5, iG2);
                                            this.f31363k = false;
                                            i5 = iG;
                                            iG2 = i5;
                                            this.n.e(bVar, iE2, iH2, iE3, iH3, z, z2, zD, z3, iH, i4, iG, i5, iG2);
                                            this.f31363k = false;
                                        }
                                        return;
                                    }
                                    z = false;
                                    z2 = false;
                                    zD = z2;
                                    if (this.i == 5) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    if (z3) {
                                        iH = 0;
                                    } else if (!this.f.c()) {
                                        return;
                                    } else {
                                        iH = this.f.h();
                                    }
                                    i3 = bVar.f23827k;
                                    if (i3 != 0) {
                                        if (i3 == 1) {
                                        }
                                        i4 = 0;
                                        iG = 0;
                                    } else {
                                        if (this.f.b(bVar.l)) {
                                            return;
                                        }
                                        iE = this.f.e(bVar.l);
                                        if (aVar.c) {
                                        }
                                        i4 = iE;
                                        iG = 0;
                                    }
                                    i5 = iG;
                                    iG2 = i5;
                                    this.n.e(bVar, iE2, iH2, iE3, iH3, z, z2, zD, z3, iH, i4, iG, i5, iG2);
                                    this.f31363k = false;
                                }
                            }
                        }
                    }
                }
            }
        }

        public boolean b(long j, int i, boolean z, boolean z2) {
            boolean z3 = false;
            if (this.i == 9 || (this.c && this.n.c(this.m))) {
                if (z && this.o) {
                    d(i + ((int) (j - this.j)));
                }
                this.p = this.j;
                this.q = this.l;
                this.f31364r = false;
                this.o = true;
            }
            if (this.f31362b) {
                z2 = this.n.d();
            }
            boolean z4 = this.f31364r;
            int i2 = this.i;
            if (i2 == 5 || (z2 && i2 == 1)) {
                z3 = true;
            }
            boolean z5 = z4 | z3;
            this.f31364r = z5;
            return z5;
        }

        public boolean c() {
            return this.c;
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
            boolean z = this.f31364r;
            this.f31361a.e(this.q, z ? 1 : 0, (int) (this.j - this.p), i, null);
        }

        public void e(kgg.a aVar) {
            this.e.append(aVar.f23823a, aVar);
        }

        public void f(kgg.b bVar) {
            this.d.append(bVar.d, bVar);
        }

        public void g() {
            this.f31363k = false;
            this.o = false;
            this.n.b();
        }

        public void h(long j, int i, long j2) {
            this.i = i;
            this.l = j2;
            this.j = j;
            if (!this.f31362b || i != 1) {
                if (!this.c) {
                    return;
                }
                if (i != 5 && i != 1 && i != 2) {
                    return;
                }
            }
            a aVar = this.m;
            this.m = this.n;
            this.n = aVar;
            aVar.b();
            this.h = 0;
            this.f31363k = true;
        }
    }

    public qcb(jrl jrlVar, boolean z, boolean z2) {
        this.f31358a = jrlVar;
        this.f31359b = z;
        this.c = z2;
    }

    private void b() {
        rk1.i(this.j);
        wlq.j(this.f31360k);
    }

    @Override // defpackage.u68
    public void a(okh okhVar) {
        b();
        int iE = okhVar.e();
        int iF = okhVar.f();
        byte[] bArrD = okhVar.d();
        this.g += (long) okhVar.a();
        this.j.d(okhVar, okhVar.a());
        while (true) {
            int iC = kgg.c(bArrD, iE, iF, this.h);
            if (iC == iF) {
                h(bArrD, iE, iF);
                return;
            }
            int iF2 = kgg.f(bArrD, iC);
            int i = iC - iE;
            if (i > 0) {
                h(bArrD, iE, iC);
            }
            int i2 = iF - iC;
            long j = this.g - ((long) i2);
            g(j, i2, i < 0 ? -i : 0, this.m);
            i(j, iF2, this.m);
            iE = iC + 3;
        }
    }

    @Override // defpackage.u68
    public void c() {
        this.g = 0L;
        this.n = false;
        kgg.a(this.h);
        this.d.d();
        this.e.d();
        this.f.d();
        b bVar = this.f31360k;
        if (bVar != null) {
            bVar.g();
        }
    }

    @Override // defpackage.u68
    public void d() {
    }

    @Override // defpackage.u68
    public void e(long j, int i) {
        this.m = j;
        this.n |= (i & 2) != 0;
    }

    @Override // defpackage.u68
    public void f(kl8 kl8Var, i2q.d dVar) {
        dVar.a();
        this.i = dVar.b();
        snp snpVarD = kl8Var.d(dVar.c(), 2);
        this.j = snpVarD;
        this.f31360k = new b(snpVarD, this.f31359b, this.c);
        this.f31358a.b(kl8Var, dVar);
    }

    public final void g(long j, int i, int i2, long j2) {
        if (!this.l || this.f31360k.c()) {
            this.d.b(i2);
            this.e.b(i2);
            if (this.l) {
                if (this.d.c()) {
                    jgg jggVar = this.d;
                    this.f31360k.f(kgg.i(jggVar.d, 3, jggVar.e));
                    this.d.d();
                } else if (this.e.c()) {
                    jgg jggVar2 = this.e;
                    this.f31360k.e(kgg.h(jggVar2.d, 3, jggVar2.e));
                    this.e.d();
                }
            } else if (this.d.c() && this.e.c()) {
                ArrayList arrayList = new ArrayList();
                jgg jggVar3 = this.d;
                arrayList.add(Arrays.copyOf(jggVar3.d, jggVar3.e));
                jgg jggVar4 = this.e;
                arrayList.add(Arrays.copyOf(jggVar4.d, jggVar4.e));
                jgg jggVar5 = this.d;
                kgg.b bVarI = kgg.i(jggVar5.d, 3, jggVar5.e);
                jgg jggVar6 = this.e;
                kgg.a aVarH = kgg.h(jggVar6.d, 3, jggVar6.e);
                this.j.b(new Format.b().S(this.i).e0("video/avc").I(m34.a(bVarI.f23825a, bVarI.f23826b, bVarI.c)).j0(bVarI.e).Q(bVarI.f).a0(bVarI.g).T(arrayList).E());
                this.l = true;
                this.f31360k.f(bVarI);
                this.f31360k.e(aVarH);
                this.d.d();
                this.e.d();
            }
        }
        if (this.f.b(i2)) {
            jgg jggVar7 = this.f;
            this.o.N(this.f.d, kgg.k(jggVar7.d, jggVar7.e));
            this.o.P(4);
            this.f31358a.a(j2, this.o);
        }
        if (this.f31360k.b(j, i, this.l, this.n)) {
            this.n = false;
        }
    }

    public final void h(byte[] bArr, int i, int i2) {
        if (!this.l || this.f31360k.c()) {
            this.d.a(bArr, i, i2);
            this.e.a(bArr, i, i2);
        }
        this.f.a(bArr, i, i2);
        this.f31360k.a(bArr, i, i2);
    }

    public final void i(long j, int i, long j2) {
        if (!this.l || this.f31360k.c()) {
            this.d.e(i);
            this.e.e(i);
        }
        this.f.e(i);
        this.f31360k.h(j, i, j2);
    }
}
