package h5;

import android.os.SystemClock;
import android.view.MotionEvent;
import java.util.HashSet;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b2\u00020\f2\u00020\r2\u00020\u000e2\u00020\u000fB\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lh5/c;", "Lh5/c0;", "Lh5/s;", "Lh5/y1;", "Lh5/u1;", "Lg5/g;", "", "Lh5/s1;", "Lh5/b0;", "Lh5/u;", "Lm4/k;", "Lm4/a0;", "Lm4/e0;", "Lh5/p1;", "Ll4/a;", "Lh4/r$c;", "Lh4/r$b;", "element", "<init>", "(Lh4/r$b;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c extends h4.r.c implements c0, s, y1, u1, g5.g, s1, b0, u, m4.k, m4.a0, m4.e0, p1, l4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h4.r.b f81698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f81699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g5.a f81700c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashSet<g5.c<?>> f81701d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public f5.c0 f81702e;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a extends p005kotlin.jvm.internal.w implements e23.a<Unit> {
        public a() {
            super(0);
        }

        @Override // e23.a
        public final Unit invoke() {
            c.this.W1();
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"h5/c$b", "Lh5/o1$b;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements o1.b {
        public b() {
        }

        @Override // h5.o1.b
        public final void h() {
            c cVar = c.this;
            if (cVar.f81702e == null) {
                cVar.f(k.e(cVar, 4194304));
            }
        }
    }

    /* JADX INFO: renamed from: h5.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C1621c extends p005kotlin.jvm.internal.w implements e23.a<Unit> {
        public C1621c() {
            super(0);
        }

        @Override // e23.a
        public final Unit invoke() {
            h4.r.b bVar = c.this.f81698a;
            bVar.getClass();
            ((g5.d) bVar).p0();
            return Unit.INSTANCE;
        }
    }

    public c(h4.r.b bVar) {
        setKindSet$ui(g1.e(bVar));
        this.f81698a = bVar;
        this.f81699b = true;
        this.f81701d = new HashSet<>();
    }

    @Override // h5.y1
    public final void D1(p5.k0 k0Var) {
        h4.r.b bVar = this.f81698a;
        bVar.getClass();
        p5.q qVarY = ((p5.u) bVar).y();
        k0Var.getClass();
        p5.q qVar = (p5.q) k0Var;
        p1.t0<p5.j0<?>, Object> t0Var = qVar.f136085a;
        if (qVarY.f136088d) {
            qVar.f136088d = true;
        }
        if (qVarY.f136089e) {
            qVar.f136089e = true;
        }
        p1.t0<p5.j0<?>, Object> t0Var2 = qVarY.f136085a;
        Object[] objArr = t0Var2.f134721b;
        Object[] objArr2 = t0Var2.f134722c;
        long[] jArr = t0Var2.f134720a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i14 = 0;
        while (true) {
            long j8 = jArr[i14];
            if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i15 = 8;
                int i16 = 8 - ((~(i14 - length)) >>> 31);
                int i17 = 0;
                while (i17 < i16) {
                    if ((255 & j8) < 128) {
                        int i18 = (i14 << 3) + i17;
                        Object obj = objArr[i18];
                        Object obj2 = objArr2[i18];
                        p5.j0<?> j0Var = (p5.j0) obj;
                        if (!t0Var.a(j0Var)) {
                            t0Var.m(j0Var, obj2);
                        } else if (obj2 instanceof p5.a) {
                            Object objD = t0Var.d(j0Var);
                            objD.getClass();
                            p5.a aVar = (p5.a) objD;
                            String str = aVar.f135945a;
                            if (str == null) {
                                str = ((p5.a) obj2).f135945a;
                            }
                            o13.h hVar = aVar.f135946b;
                            if (hVar == null) {
                                hVar = ((p5.a) obj2).f135946b;
                            }
                            t0Var.m(j0Var, new p5.a(str, hVar));
                        }
                    }
                    j8 >>= i15;
                    i17++;
                    i15 = i15;
                }
                if (i16 != i15) {
                    return;
                }
            }
            if (i14 == length) {
                return;
            } else {
                i14++;
            }
        }
    }

    @Override // h5.u1
    public final void E() {
        h4.r.b bVar = this.f81698a;
        bVar.getClass();
        ((b5.g0) bVar).getF15819d().getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [h4.r$c] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [h4.r$c] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [q3.c] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [q3.c] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v6 */
    @Override // g5.g
    public final <T> T I0(g5.c<T> cVar) {
        a1 a1Var;
        this.f81701d.add(cVar);
        if (!getNode().getIsAttached()) {
            e5.a.b("visitAncestors called on an unattached node");
        }
        h4.r.c parent = getNode().getParent();
        e0 e0VarG = k.g(this);
        while (e0VarG != null) {
            if ((e0VarG.P.f81685f.getAggregateChildKindSet() & 32) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & 32) != 0) {
                        ?? B = parent;
                        ?? cVar2 = 0;
                        while (B != 0) {
                            if (B instanceof g5.g) {
                                g5.g gVar = (g5.g) B;
                                if (gVar.P0().a(cVar)) {
                                    return (T) gVar.P0().b(cVar);
                                }
                            } else if ((B.getKindSet() & 32) != 0 && (B instanceof m)) {
                                h4.r.c child = ((m) B).f81888b;
                                int i14 = 0;
                                B = B;
                                cVar2 = cVar2;
                                while (child != null) {
                                    if ((child.getKindSet() & 32) != 0) {
                                        i14++;
                                        if (i14 == 1) {
                                            cVar2 = cVar2;
                                            B = child;
                                        } else {
                                            if (cVar2 == 0) {
                                                cVar2 = new q3.c(new h4.r.c[16], 0);
                                            }
                                            if (B != 0) {
                                                cVar2.b(B);
                                                B = 0;
                                            }
                                            cVar2.b(child);
                                        }
                                    }
                                    child = child.getChild();
                                    B = B;
                                    cVar2 = cVar2;
                                }
                                if (i14 == 1) {
                                }
                            }
                            B = k.b(cVar2);
                        }
                    }
                    parent = parent.getParent();
                }
            }
            e0VarG = e0VarG.K();
            parent = (e0VarG == null || (a1Var = e0VarG.P) == null) ? null : a1Var.f81684e;
        }
        return cVar.f75874a.invoke();
    }

    @Override // g5.g
    public final g5.f P0() {
        g5.a aVar = this.f81700c;
        return aVar != null ? aVar : g5.b.f75873a;
    }

    @Override // m4.a0
    public final void P1(m4.y yVar) {
        h4.r.b bVar = this.f81698a;
        if (!(bVar instanceof m4.s)) {
            e5.a.b("applyFocusProperties called on wrong node");
        }
        new m4.r(yVar);
        ((m4.s) bVar).T1();
    }

    @Override // h5.u1
    public final boolean S1() {
        h4.r.b bVar = this.f81698a;
        bVar.getClass();
        ((b5.g0) bVar).getF15819d().getClass();
        return true;
    }

    public final void U1(boolean z14) {
        if (!getIsAttached()) {
            e5.a.b("initializeModifier called on unattached node");
        }
        h4.r.b bVar = this.f81698a;
        if ((getKindSet() & 32) != 0) {
            if (bVar instanceof g5.d) {
                sideEffect(new a());
            }
            if (bVar instanceof g5.h) {
                g5.h hVar = (g5.h) bVar;
                g5.a aVar = this.f81700c;
                if (aVar == null || !aVar.a(hVar.getKey())) {
                    this.f81700c = new g5.a(hVar);
                    if (e.a(this)) {
                        g5.e modifierLocalManager = k.h(this).getModifierLocalManager();
                        g5.i key = hVar.getKey();
                        modifierLocalManager.f75876b.b(this);
                        modifierLocalManager.f75877c.b(key);
                        modifierLocalManager.a();
                    }
                } else {
                    g5.e modifierLocalManager2 = k.h(this).getModifierLocalManager();
                    g5.i key2 = hVar.getKey();
                    modifierLocalManager2.f75876b.b(this);
                    modifierLocalManager2.f75877c.b(key2);
                    modifierLocalManager2.a();
                }
            }
        }
        if ((getKindSet() & 4) != 0) {
            if (bVar instanceof l4.i) {
                this.f81699b = true;
            }
            if (!z14) {
                k.e(this, 2).R1();
            }
        }
        if ((getKindSet() & 2) != 0) {
            if (e.a(this)) {
                c1 coordinator = getCoordinator();
                coordinator.getClass();
                ((d0) coordinator).o2(this);
                n1 n1Var = coordinator.K0;
                if (n1Var != null) {
                    n1Var.invalidate();
                }
            }
            if (!z14) {
                k.e(this, 2).R1();
                k.g(this).T();
            }
        }
        if (bVar instanceof f5.a2) {
            ((f5.a2) bVar).I1(k.g(this));
        }
        if ((getKindSet() & 128) != 0 && (bVar instanceof f5.m1) && e.a(this)) {
            k.g(this).T();
        }
        if ((4194304 & getKindSet()) != 0 && (bVar instanceof f5.k1)) {
            this.f81702e = null;
            if (e.a(this)) {
                k.h(this).E(new b());
            }
        }
        if ((getKindSet() & 256) != 0 && (bVar instanceof f5.i1) && e.a(this)) {
            k.g(this).T();
        }
        if (bVar instanceof m4.d0) {
            ((m4.d0) bVar).N0().f116455a.b(this);
        }
        if ((getKindSet() & 16) != 0 && (bVar instanceof b5.g0)) {
            ((b5.g0) bVar).getF15819d().f15808a = getCoordinator();
        }
        if ((getKindSet() & 8) != 0) {
            k.h(this).D();
        }
    }

    public final void V1() {
        if (!getIsAttached()) {
            e5.a.b("unInitializeModifier called on unattached node");
        }
        h4.r.b bVar = this.f81698a;
        if ((getKindSet() & 32) != 0) {
            if (bVar instanceof g5.h) {
                g5.e modifierLocalManager = k.h(this).getModifierLocalManager();
                g5.i key = ((g5.h) bVar).getKey();
                modifierLocalManager.f75878d.b(k.g(this));
                modifierLocalManager.f75879e.b(key);
                modifierLocalManager.a();
            }
            if (bVar instanceof g5.d) {
                e.b bVar2 = e.f81756a;
                ((g5.d) bVar).p0();
            }
        }
        if ((getKindSet() & 8) != 0) {
            k.h(this).D();
        }
        if (bVar instanceof m4.d0) {
            ((m4.d0) bVar).N0().f116455a.j(this);
        }
    }

    public final void W1() {
        if (getIsAttached()) {
            this.f81701d.clear();
            r1 snapshotObserver = k.h(this).getSnapshotObserver();
            snapshotObserver.f81981a.d(this, e.f81757b, new C1621c());
        }
    }

    @Override // h5.u1
    public final void a1() {
        h4.r.b bVar = this.f81698a;
        bVar.getClass();
        b5.i0.b f15819d = ((b5.g0) bVar).getF15819d();
        b5.i0 i0Var = b5.i0.this;
        if (f15819d.f15824b == b5.i0.a.Dispatching) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            b5.j0 j0Var = new b5.j0(i0Var);
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            motionEventObtain.setSource(0);
            j0Var.invoke(motionEventObtain);
            motionEventObtain.recycle();
            f15819d.f15824b = b5.i0.a.Unknown;
            i0Var.f15818c = false;
            f15819d.f15825c = null;
        }
    }

    @Override // l4.a
    public final long b() {
        return g6.n.c(k.e(this, 128).f69146c);
    }

    @Override // h5.s
    public final void b1() {
        this.f81699b = true;
        t.a(this);
    }

    @Override // h5.b0, h5.w0
    public final void e(long j8) {
        h4.r.b bVar = this.f81698a;
        if (bVar instanceof f5.m1) {
            ((f5.m1) bVar).e(j8);
        }
    }

    @Override // h5.b0
    public final void f(f5.c0 c0Var) {
        this.f81702e = c0Var;
        h4.r.b bVar = this.f81698a;
        if (bVar instanceof f5.k1) {
            ((f5.k1) bVar).f(c0Var);
        }
    }

    @Override // l4.a
    public final g6.c getDensity() {
        return k.g(this).A;
    }

    @Override // l4.a
    public final g6.o getLayoutDirection() {
        return k.g(this).B;
    }

    @Override // h5.c0
    public final int maxIntrinsicHeight(f5.x xVar, f5.w wVar, int i14) {
        h4.r.b bVar = this.f81698a;
        bVar.getClass();
        return ((f5.o0) bVar).maxIntrinsicHeight(xVar, wVar, i14);
    }

    @Override // h5.c0
    public final int maxIntrinsicWidth(f5.x xVar, f5.w wVar, int i14) {
        h4.r.b bVar = this.f81698a;
        bVar.getClass();
        return ((f5.o0) bVar).maxIntrinsicWidth(xVar, wVar, i14);
    }

    @Override // h5.c0
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final f5.a1 mo5measure3p2s80s(f5.b1 b1Var, f5.y0 y0Var, long j8) {
        h4.r.b bVar = this.f81698a;
        bVar.getClass();
        return ((f5.o0) bVar).mo0measure3p2s80s(b1Var, y0Var, j8);
    }

    @Override // h5.c0
    public final int minIntrinsicHeight(f5.x xVar, f5.w wVar, int i14) {
        h4.r.b bVar = this.f81698a;
        bVar.getClass();
        return ((f5.o0) bVar).minIntrinsicHeight(xVar, wVar, i14);
    }

    @Override // h5.c0
    public final int minIntrinsicWidth(f5.x xVar, f5.w wVar, int i14) {
        h4.r.b bVar = this.f81698a;
        bVar.getClass();
        return ((f5.o0) bVar).minIntrinsicWidth(xVar, wVar, i14);
    }

    @Override // h5.u
    public final void o(c1 c1Var) {
        h4.r.b bVar = this.f81698a;
        bVar.getClass();
        ((f5.i1) bVar).o(c1Var);
    }

    @Override // h4.r.c
    public final void onAttach() {
        U1(true);
    }

    @Override // h5.j, h5.u1
    public final void onDensityChange() {
        if (this.f81698a instanceof b5.g0) {
            a1();
        }
    }

    @Override // h4.r.c
    public final void onDetach() {
        V1();
    }

    @Override // h5.s
    public final void p(h0 h0Var) {
        h4.r.b bVar = this.f81698a;
        bVar.getClass();
        l4.j jVar = (l4.j) bVar;
        if (this.f81699b && (bVar instanceof l4.i)) {
            h4.r.b bVar2 = this.f81698a;
            if (bVar2 instanceof l4.i) {
                r1 snapshotObserver = k.h(this).getSnapshotObserver();
                snapshotObserver.f81981a.d(this, e.f81756a, new d(bVar2, this));
            }
            this.f81699b = false;
        }
        jVar.p(h0Var);
    }

    @Override // h5.s1
    public final Object r(g6.c cVar, Object obj) {
        h4.r.b bVar = this.f81698a;
        bVar.getClass();
        return ((f5.s1) bVar).r(cVar, obj);
    }

    public final String toString() {
        return this.f81698a.toString();
    }

    @Override // m4.k
    public final void u(m4.g0 g0Var) {
        h4.r.b bVar = this.f81698a;
        if (!(bVar instanceof m4.j)) {
            e5.a.b("onFocusEvent called on wrong node");
        }
        ((m4.j) bVar).u(g0Var);
    }

    @Override // h5.u1
    public final void u1(b5.q qVar, b5.s sVar, long j8) {
        boolean z14;
        boolean z15;
        boolean z16;
        h4.r.b bVar = this.f81698a;
        bVar.getClass();
        b5.i0.b f15819d = ((b5.g0) bVar).getF15819d();
        b5.i0 i0Var = b5.i0.this;
        List<b5.a0> list = qVar.f15870a;
        int size = list.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size) {
                z14 = true;
                break;
            }
            b5.a0 a0Var = list.get(i14);
            if (b5.r.b(a0Var) || b5.r.d(a0Var)) {
                z14 = false;
                break;
            }
            i14++;
        }
        if (!z14) {
            z15 = false;
            break;
        }
        int size2 = list.size();
        int i15 = 0;
        while (true) {
            if (i15 >= size2) {
                z15 = true;
                break;
            } else {
                if (list.get(i15).b()) {
                    z15 = false;
                    break;
                }
                i15++;
            }
        }
        if (i0Var.f15818c) {
            z16 = true;
            break;
        }
        int size3 = list.size();
        int i16 = 0;
        while (true) {
            if (i16 >= size3) {
                if (!z15) {
                    z16 = false;
                    break;
                }
                break;
            } else {
                b5.a0 a0Var2 = list.get(i16);
                if (!b5.r.b(a0Var2) && !b5.r.d(a0Var2)) {
                    i16++;
                }
            }
            z16 = true;
            break;
        }
        if (f15819d.f15824b != b5.i0.a.NotDispatching) {
            if (sVar == b5.s.Initial && z16) {
                f15819d.f15825c = qVar;
                f15819d.a(qVar, !z14 || i0Var.f15818c);
            }
            if (sVar == b5.s.Main && z14 && qVar.equals(f15819d.f15825c) && i0Var.f15818c) {
                int size4 = list.size();
                for (int i17 = 0; i17 < size4; i17++) {
                    list.get(i17).a();
                }
            }
            if (sVar == b5.s.Final && !z16 && !qVar.equals(f15819d.f15825c)) {
                f15819d.a(qVar, true);
            }
        }
        if (sVar == b5.s.Final) {
            int size5 = list.size();
            int i18 = 0;
            while (true) {
                if (i18 >= size5) {
                    f15819d.f15824b = b5.i0.a.Unknown;
                    i0Var.f15818c = false;
                    f15819d.f15825c = null;
                    break;
                } else if (!b5.r.d(list.get(i18))) {
                    break;
                } else {
                    i18++;
                }
            }
            if (qVar.equals(f15819d.f15825c) && z14) {
                int size6 = list.size();
                for (int i19 = 0; i19 < size6; i19++) {
                    if (list.get(i19).b()) {
                        if (i0Var.f15818c) {
                            break;
                        }
                        f15819d.b(qVar);
                        return;
                    }
                }
                int size7 = list.size();
                for (int i24 = 0; i24 < size7; i24++) {
                    list.get(i24).a();
                }
            }
        }
    }
}
