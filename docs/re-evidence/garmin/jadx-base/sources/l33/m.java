package l33;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p33.n1;
import p33.p1;
import p43.a2;
import p43.c2;
import p43.g2;
import p43.k1;
import p43.v1;
import t23.h1;
import t23.m1;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends w23.l implements j33.c {
    public static final Set<String> A;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final k33.i f109771i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final o33.f f109772j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final t23.e f109773k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final k33.i f109774l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final o13.t f109775m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final t23.f f109776n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t23.a0 f109777o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final m1 f109778p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f109779q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final b f109780r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final a0 f109781t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t23.w0<a0> f109782v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final i43.h f109783w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final b1 f109784x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final k33.f f109785y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final o43.j<List<t23.d1>> f109786z;

    public final class b extends p43.b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final o43.j<List<t23.d1>> f109787c;

        public b() {
            super(m.this.f109774l.f102785a.f102751a);
            this.f109787c = m.this.f109774l.f102785a.f102751a.g(new n(m.this));
        }

        @Override // p43.m1
        public final boolean C() {
            return true;
        }

        /* JADX WARN: Code duplicated, block: B:101:0x0229 A[LOOP:1: B:99:0x0223->B:101:0x0229, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:105:0x0245  */
        /* JADX WARN: Code duplicated, block: B:107:0x024a  */
        /* JADX WARN: Code duplicated, block: B:43:0x00a6  */
        /* JADX WARN: Code duplicated, block: B:48:0x00be  */
        /* JADX WARN: Code duplicated, block: B:4:0x002a  */
        /* JADX WARN: Code duplicated, block: B:73:0x0189  */
        /* JADX WARN: Code duplicated, block: B:75:0x01be  */
        /* JADX WARN: Code duplicated, block: B:78:0x01cc  */
        /* JADX WARN: Code duplicated, block: B:81:0x01d5  */
        /* JADX WARN: Code duplicated, block: B:82:0x01da  */
        /* JADX WARN: Code duplicated, block: B:91:0x01f0  */
        /* JADX WARN: Code duplicated, block: B:93:0x0204  */
        /* JADX WARN: Code duplicated, block: B:95:0x0209  */
        /* JADX WARN: Code duplicated, block: B:98:0x0212  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // p43.n
        public final Collection<p43.n0> d() {
            String str;
            x33.c cVar;
            x33.c cVar2;
            ArrayList arrayList;
            p43.v0 v0VarD;
            p43.n0 n0VarJ;
            ArrayList arrayList2;
            p43.n0 n0VarD;
            p43.n0 n0VarB;
            p43.m1 m1VarF0;
            p43.m1 m1VarF1;
            m mVar = m.this;
            o33.f fVar = mVar.f109772j;
            k33.i iVar = mVar.f109774l;
            Collection<o33.i> collectionB = fVar.b();
            ArrayList arrayList3 = new ArrayList(collectionB.size());
            ArrayList<o33.t> arrayList4 = new ArrayList(0);
            k33.f fVar2 = mVar.f109785y;
            x33.c cVar3 = h33.c0.f81432n;
            cVar3.getClass();
            u23.c cVarZ = fVar2.z(cVar3);
            if (cVarZ == null) {
                cVar = null;
                break;
            }
            Object objJ0 = p13.h0.J0(cVarZ.b().values());
            d43.x xVar = objJ0 instanceof d43.x ? (d43.x) objJ0 : null;
            if (xVar != null && (str = (String) xVar.f57481a) != null) {
                x33.k kVar = x33.k.BEGINNING;
                int length = str.length();
                int i14 = 0;
                while (true) {
                    if (i14 < length) {
                        char cCharAt = str.charAt(i14);
                        int i15 = x33.e.a.f188604a[kVar.ordinal()];
                        if (i15 != 1 && i15 != 2) {
                            if (i15 != 3) {
                                lc.u0.r();
                                return null;
                            }
                            if (cCharAt == '.') {
                                kVar = x33.k.AFTER_DOT;
                            } else if (!Character.isJavaIdentifierPart(cCharAt)) {
                            }
                            i14++;
                        } else if (Character.isJavaIdentifierStart(cCharAt)) {
                            kVar = x33.k.MIDDLE;
                            i14++;
                        }
                    } else if (kVar != x33.k.AFTER_DOT) {
                        cVar = new x33.c(str);
                        break;
                    }
                    cVar = null;
                    break;
                }
            } else {
                cVar = null;
                break;
            }
            if (cVar != null) {
                x33.d dVar = cVar.f188596a;
                if (dVar.c()) {
                    cVar = null;
                } else {
                    x33.f fVar3 = p005kotlin.reflect.jvm.internal.impl.builtins.f.f105859k;
                    fVar3.getClass();
                    if (!dVar.h(fVar3)) {
                        cVar = null;
                    }
                }
            } else {
                cVar = null;
            }
            if (cVar == null) {
                h33.n nVar = h33.n.f81479a;
                x33.c cVarG = f43.e.g(mVar);
                nVar.getClass();
                cVar2 = h33.n.f81481c.get(cVarG);
                if (cVar2 == null) {
                    v0VarD = null;
                }
                for (o33.i iVar2 : collectionB) {
                    n0VarD = iVar.f102788d.d(iVar2, gg.b.P(c2.SUPERTYPE, false, null, 7));
                    n1 n1Var = iVar.f102785a.f102768r;
                    n1Var.getClass();
                    n0VarB = n1Var.b(new p1(null, false, iVar, h33.c.TYPE_USE, true), n0VarD, p13.j0.f134944a, null, false);
                    if (n0VarB == null) {
                        n0VarB = n0VarD;
                    }
                    if (n0VarB.F0().t() instanceof t23.g0.b) {
                        arrayList4.add(iVar2);
                    }
                    m1VarF0 = n0VarB.F0();
                    if (v0VarD != null) {
                        m1VarF1 = v0VarD.F0();
                    } else {
                        m1VarF1 = null;
                    }
                    if (!p005kotlin.jvm.internal.s.g(m1VarF0, m1VarF1) && !p005kotlin.reflect.jvm.internal.impl.builtins.d.y(n0VarB)) {
                        arrayList3.add(n0VarB);
                    }
                }
                t23.e eVar = mVar.f109773k;
                n0VarJ = eVar != null ? a2.e(s23.a0.a(eVar, mVar)).j(g2.INVARIANT, eVar.p()) : null;
                if (n0VarJ != null) {
                    arrayList3.add(n0VarJ);
                }
                if (v0VarD != null) {
                    arrayList3.add(v0VarD);
                }
                if (!arrayList4.isEmpty()) {
                    l43.w wVar = iVar.f102785a.f102756f;
                    arrayList2 = new ArrayList(p13.y.r(arrayList4, 10));
                    for (o33.t tVar : arrayList4) {
                        tVar.getClass();
                        arrayList2.add(((o33.i) tVar).t());
                    }
                    wVar.a(mVar, arrayList2);
                }
                return !arrayList3.isEmpty() ? p13.h0.b1(arrayList3) : p13.w.c(iVar.f102785a.f102765o.e().e());
            }
            cVar2 = cVar;
            t23.c0 c0Var = iVar.f102785a.f102765o;
            b33.b bVar = b33.b.FROM_JAVA_LOADER;
            int i16 = f43.e.f68881a;
            c0Var.getClass();
            bVar.getClass();
            x33.d dVar2 = cVar2.f188596a;
            dVar2.c();
            t23.h hVarF = ((i43.a) c0Var.d0(cVar2.b()).i()).f(dVar2.g(), bVar);
            t23.e eVar2 = hVarF instanceof t23.e ? (t23.e) hVarF : null;
            if (eVar2 == null) {
                v0VarD = null;
            } else {
                int size = eVar2.h().getParameters().size();
                List<t23.d1> parameters = mVar.f109780r.getParameters();
                parameters.getClass();
                int size2 = parameters.size();
                if (size2 == size) {
                    arrayList = new ArrayList(p13.y.r(parameters, 10));
                    Iterator<T> it = parameters.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new v1(g2.INVARIANT, ((t23.d1) it.next()).p()));
                    }
                } else if (size2 == 1 && size > 1 && cVar == null) {
                    v1 v1Var = new v1(g2.INVARIANT, ((t23.d1) p13.h0.I0(parameters)).p());
                    j23.l lVar = new j23.l(1, size);
                    arrayList = new ArrayList(p13.y.r(lVar, 10));
                    Iterator<Integer> it3 = lVar.iterator();
                    while (((j23.k) it3).f96801c) {
                        ((p13.p0) it3).nextInt();
                        arrayList.add(v1Var);
                    }
                } else {
                    v0VarD = null;
                }
                k1.f135863b.getClass();
                v0VarD = p43.q0.d(k1.f135864c, eVar2, arrayList);
            }
            while (r2.hasNext()) {
                n0VarD = iVar.f102788d.d(iVar2, gg.b.P(c2.SUPERTYPE, false, null, 7));
                n1 n1Var2 = iVar.f102785a.f102768r;
                n1Var2.getClass();
                n0VarB = n1Var2.b(new p1(null, false, iVar, h33.c.TYPE_USE, true), n0VarD, p13.j0.f134944a, null, false);
                if (n0VarB == null) {
                    n0VarB = n0VarD;
                }
                if (n0VarB.F0().t() instanceof t23.g0.b) {
                    arrayList4.add(iVar2);
                }
                m1VarF0 = n0VarB.F0();
                if (v0VarD != null) {
                    m1VarF1 = v0VarD.F0();
                } else {
                    m1VarF1 = null;
                }
                if (!p005kotlin.jvm.internal.s.g(m1VarF0, m1VarF1)) {
                    arrayList3.add(n0VarB);
                }
            }
            t23.e eVar3 = mVar.f109773k;
            if (eVar3 != null) {
            }
            if (n0VarJ != null) {
                arrayList3.add(n0VarJ);
            }
            if (v0VarD != null) {
                arrayList3.add(v0VarD);
            }
            if (!arrayList4.isEmpty()) {
                l43.w wVar2 = iVar.f102785a.f102756f;
                arrayList2 = new ArrayList(p13.y.r(arrayList4, 10));
                while (r4.hasNext()) {
                    tVar.getClass();
                    arrayList2.add(((o33.i) tVar).t());
                }
                wVar2.a(mVar, arrayList2);
            }
            if (!arrayList3.isEmpty()) {
            }
        }

        @Override // p43.m1
        public final List<t23.d1> getParameters() {
            return this.f109787c.invoke();
        }

        @Override // p43.n
        public final t23.b1 h() {
            return m.this.f109774l.f102785a.f102763m;
        }

        @Override // p43.b
        /* JADX INFO: renamed from: m */
        public final t23.e t() {
            return m.this;
        }

        @Override // p43.b, p43.m1
        public final t23.h t() {
            return m.this;
        }

        public final String toString() {
            String strB = m.this.getName().b();
            strB.getClass();
            return strB;
        }
    }

    static {
        new a(null);
        A = p13.u.m0(new String[]{"equals", "hashCode", "getClass", "wait", "notify", "notifyAll", "toString"});
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public m(k33.i iVar, t23.l lVar, o33.f fVar, t23.e eVar) {
        t23.f fVar2;
        t23.a0 a0Var;
        iVar.getClass();
        lVar.getClass();
        fVar.getClass();
        k33.c cVar = iVar.f102785a;
        super(cVar.f102751a, lVar, fVar.getName(), cVar.f102760j.a(fVar), false);
        this.f109771i = iVar;
        this.f109772j = fVar;
        this.f109773k = eVar;
        k33.i iVarM = ge1.b.m(iVar, this, fVar, 4);
        this.f109774l = iVarM;
        k33.c cVar2 = iVarM.f102785a;
        o43.n nVar = cVar2.f102751a;
        ((i33.j.a) cVar2.f102757g).getClass();
        this.f109775m = o13.m.b(new j(this));
        if (fVar.q()) {
            fVar2 = t23.f.ANNOTATION_CLASS;
        } else if (fVar.n()) {
            fVar2 = t23.f.INTERFACE;
        } else {
            fVar2 = fVar.A() ? t23.f.ENUM_CLASS : t23.f.CLASS;
        }
        this.f109776n = fVar2;
        if (fVar.q() || fVar.A()) {
            a0Var = t23.a0.FINAL;
        } else {
            t23.a0.a aVar = t23.a0.f161986a;
            boolean zB = fVar.B();
            boolean z14 = fVar.B() || fVar.isAbstract() || fVar.n();
            boolean zIsFinal = fVar.isFinal();
            aVar.getClass();
            if (zB) {
                a0Var = t23.a0.SEALED;
            } else if (z14) {
                a0Var = t23.a0.ABSTRACT;
            } else {
                a0Var = !zIsFinal ? t23.a0.OPEN : t23.a0.FINAL;
            }
        }
        this.f109777o = a0Var;
        this.f109778p = fVar.getVisibility();
        this.f109779q = (fVar.k() == null || fVar.isStatic()) ? false : true;
        this.f109780r = new b();
        a0 a0Var2 = new a0(iVarM, this, fVar, eVar != null, null, 16, null);
        this.f109781t = a0Var2;
        t23.w0.a aVar2 = t23.w0.f162069e;
        q43.f fVarB = cVar2.f102771u.b();
        k kVar = new k(this);
        aVar2.getClass();
        nVar.getClass();
        fVarB.getClass();
        this.f109782v = new t23.w0<>(this, nVar, kVar, fVarB, null);
        this.f109783w = new i43.h(a0Var2);
        this.f109784x = new b1(iVarM, fVar, this);
        this.f109785y = gg.b.N(iVarM, fVar);
        this.f109786z = nVar.g(new l(this));
    }

    public final a0 E0() {
        return (a0) super.c0();
    }

    @Override // t23.e
    public final h1<p43.v0> J() {
        return null;
    }

    @Override // w23.e0
    public final i43.l N(q43.f fVar) {
        fVar.getClass();
        return (a0) this.f109782v.a(fVar);
    }

    @Override // t23.z
    public final boolean O() {
        return false;
    }

    @Override // t23.e
    public final i43.l P() {
        return this.f109784x;
    }

    @Override // t23.e
    public final boolean U() {
        return false;
    }

    @Override // w23.b, t23.e
    public final i43.l b0() {
        return this.f109783w;
    }

    @Override // w23.b, t23.e
    public final i43.l c0() {
        return (a0) super.c0();
    }

    @Override // t23.e, t23.z
    public final t23.a0 g() {
        return this.f109777o;
    }

    @Override // u23.a
    public final u23.h getAnnotations() {
        return this.f109785y;
    }

    @Override // t23.e
    public final t23.f getKind() {
        return this.f109776n;
    }

    @Override // t23.e, t23.z, t23.o
    public final t23.r getVisibility() {
        t23.q.d dVar = t23.q.f162046a;
        m1 m1Var = this.f109778p;
        if (!p005kotlin.jvm.internal.s.g(m1Var, dVar) || this.f109772j.k() != null) {
            return h33.l0.a(m1Var);
        }
        h33.s.a aVar = h33.s.f81496a;
        aVar.getClass();
        return aVar;
    }

    @Override // t23.h
    public final p43.m1 h() {
        return this.f109780r;
    }

    @Override // t23.e
    public final boolean isInline() {
        return false;
    }

    @Override // t23.e
    public final boolean k() {
        return false;
    }

    @Override // t23.i
    public final boolean l() {
        return this.f109779q;
    }

    @Override // t23.e
    public final Collection n() {
        return this.f109781t.f109697q.invoke();
    }

    @Override // t23.e, t23.i
    public final List<t23.d1> q() {
        return this.f109786z.invoke();
    }

    @Override // t23.z
    public final boolean q0() {
        return false;
    }

    @Override // t23.e
    public final t23.d s() {
        return null;
    }

    @Override // t23.e
    public final boolean s0() {
        return false;
    }

    @Override // t23.e
    public final boolean t0() {
        return false;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Lazy Java class ");
        int i14 = f43.e.f68881a;
        x33.d dVarF = b43.i.f(this);
        dVarF.getClass();
        sb3.append(dVarF);
        return sb3.toString();
    }

    @Override // t23.e
    public final t23.e u0() {
        return null;
    }

    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ m(k33.i iVar, t23.l lVar, o33.f fVar, t23.e eVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(iVar, lVar, fVar, (i14 & 8) != 0 ? null : eVar);
    }
}
