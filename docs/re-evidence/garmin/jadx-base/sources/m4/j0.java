package m4;

import android.os.Trace;
import h5.a1;
import h5.c1;
import h5.i1;
import h5.j1;
import h5.x0;
import kotlin.m2;
import kotlin.t1;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0001\u0013BQ\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u001c\b\u0002\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b\u0012\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\r\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lm4/j0;", "Lh5/h;", "Lh5/b0;", "Lm4/i0;", "Lh5/i1;", "Lg5/g;", "Lh4/r$c;", "Lm4/n0;", "focusability", "", "isInteropViewHost", "Lkotlin/Function2;", "Lm4/g0;", "", "onFocusChange", "Lkotlin/Function1;", "onDispatchEventsCompleted", "<init>", "(IZLe23/p;Le23/l;Lkotlin/jvm/internal/j;)V", "a", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j0 extends h4.r.c implements h5.h, h5.b0, i0, i1, g5.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f116483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.p<g0, g0, Unit> f116484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e23.l<j0, Unit> f116485c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f116486d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f116487e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f116488f;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lm4/j0$a;", "Lh5/x0;", "Lm4/j0;", "<init>", "()V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends x0<j0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f116489a = new a();

        private a() {
        }

        @Override // h5.x0
        public final h4.r.c create() {
            return new j0(0, false, null, null, 15, null);
        }

        @Override // h5.x0
        public final boolean equals(Object obj) {
            return obj == this;
        }

        @Override // h5.x0
        public final int hashCode() {
            return 1739042953;
        }

        @Override // h5.x0
        public final void inspectableProperties(m2 m2Var) {
            m2Var.f91341a = "focusTarget";
        }

        @Override // h5.x0
        public final /* bridge */ /* synthetic */ void update(h4.r.c cVar) {
        }
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f116490a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f116491b;

        static {
            int[] iArr = new int[m4.c.values().length];
            try {
                iArr[m4.c.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[m4.c.Redirected.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[m4.c.Cancelled.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[m4.c.RedirectCancelled.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f116490a = iArr;
            int[] iArr2 = new int[h0.values().length];
            try {
                iArr2[h0.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[h0.Captured.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[h0.ActiveParent.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[h0.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            f116491b = iArr2;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class c extends p005kotlin.jvm.internal.w implements e23.a<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p005kotlin.jvm.internal.r0<y> f116492a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ j0 f116493b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(p005kotlin.jvm.internal.r0<y> r0Var, j0 j0Var) {
            super(0);
            this.f116492a = r0Var;
            this.f116493b = j0Var;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [T, m4.z] */
        @Override // e23.a
        public final Unit invoke() {
            this.f116492a.f105810a = this.f116493b.W1();
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm4/j0;", "it", "", "invoke", "(Lm4/j0;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class d extends p005kotlin.jvm.internal.w implements e23.l<j0, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f116494a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i14) {
            super(1);
            this.f116494a = i14;
        }

        @Override // e23.l
        public final Boolean invoke(j0 j0Var) {
            return Boolean.valueOf(j0Var.U1(this.f116494a));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public j0(int i14, boolean z14, e23.p pVar, e23.l lVar, int i15, p005kotlin.jvm.internal.j jVar) {
        if ((i15 & 1) != 0) {
            n0.f116502b.getClass();
            i14 = n0.f116503c;
        }
        this(i14, (i15 & 2) != 0 ? false : z14, (i15 & 4) != 0 ? null : pVar, (i15 & 8) != 0 ? null : lVar, null);
    }

    public final boolean U1(int i14) {
        int i15 = b.f116490a[k0.d(this, i14).ordinal()];
        if (i15 == 1) {
            return k0.e(this);
        }
        if (i15 == 2) {
            return true;
        }
        if (i15 == 3 || i15 == 4) {
            return false;
        }
        u0.r();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12, types: [h4.r$c] */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9, types: [h4.r$c] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [q3.c] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [q3.c] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v5 */
    public final void V1(g0 g0Var, g0 g0Var2) {
        a1 a1Var;
        e23.p<g0, g0, Unit> pVar;
        u focusOwner = h5.k.h(this).getFocusOwner();
        j0 j0VarF = focusOwner.f();
        if (!p005kotlin.jvm.internal.s.g(g0Var, g0Var2) && (pVar = this.f116484b) != null) {
            pVar.invoke(g0Var, g0Var2);
        }
        h4.r.c node = getNode();
        if (!getNode().getIsAttached()) {
            e5.a.b("visitAncestors called on an unattached node");
        }
        h4.r.c node2 = getNode();
        h5.e0 e0VarG = h5.k.g(this);
        loop0: while (e0VarG != null) {
            if ((e0VarG.P.f81685f.getAggregateChildKindSet() & 5120) != 0) {
                while (node2 != null) {
                    if ((node2.getKindSet() & 5120) != 0) {
                        if (node2 != node && (node2.getKindSet() & 1024) != 0) {
                            break loop0;
                        }
                        if ((node2.getKindSet() & 4096) != 0) {
                            ?? B = node2;
                            ?? cVar = 0;
                            while (B != 0) {
                                if (B instanceof k) {
                                    k kVar = (k) B;
                                    if (j0VarF == focusOwner.f()) {
                                        kVar.u(g0Var2);
                                    }
                                } else if ((B.getKindSet() & 4096) != 0 && (B instanceof h5.m)) {
                                    h4.r.c child = ((h5.m) B).f81888b;
                                    int i14 = 0;
                                    B = B;
                                    cVar = cVar;
                                    while (child != null) {
                                        if ((child.getKindSet() & 4096) != 0) {
                                            i14++;
                                            if (i14 == 1) {
                                                cVar = cVar;
                                                B = child;
                                            } else {
                                                if (cVar == 0) {
                                                    cVar = new q3.c(new h4.r.c[16], 0);
                                                }
                                                if (B != 0) {
                                                    cVar.b(B);
                                                    B = 0;
                                                }
                                                cVar.b(child);
                                            }
                                        }
                                        child = child.getChild();
                                        B = B;
                                        cVar = cVar;
                                    }
                                    if (i14 == 1) {
                                    }
                                }
                                B = h5.k.b(cVar);
                            }
                        }
                    }
                    node2 = node2.getParent();
                }
            }
            e0VarG = e0VarG.K();
            node2 = (e0VarG == null || (a1Var = e0VarG.P) == null) ? null : a1Var.f81684e;
        }
        e23.l<j0, Unit> lVar = this.f116485c;
        if (lVar != null) {
            lVar.invoke(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12, types: [h4.r$c] */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9, types: [h4.r$c] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [q3.c] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [q3.c] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v4 */
    public final z W1() {
        boolean z14;
        a1 a1Var;
        z zVar = new z();
        int i14 = n0.f116503c;
        int i15 = this.f116488f;
        if (i15 == i14) {
            z14 = true;
        } else if (i15 == 0) {
            int iA = ((x4.c) h5.i.a(this, t1.f91495m)).a();
            x4.a.f188647b.getClass();
            z14 = !(iA == x4.a.f188648c);
        } else {
            if (i15 != n0.f116504d) {
                vb.h.z("Unknown Focusability");
                return null;
            }
            z14 = false;
        }
        zVar.f116546b = z14;
        h4.r.c node = getNode();
        if (!getNode().getIsAttached()) {
            e5.a.b("visitAncestors called on an unattached node");
        }
        h4.r.c node2 = getNode();
        h5.e0 e0VarG = h5.k.g(this);
        loop0: while (e0VarG != null) {
            if ((e0VarG.P.f81685f.getAggregateChildKindSet() & 3072) != 0) {
                while (node2 != null) {
                    if ((node2.getKindSet() & 3072) != 0) {
                        if (node2 != node && (node2.getKindSet() & 1024) != 0) {
                            break loop0;
                        }
                        if ((node2.getKindSet() & 2048) != 0) {
                            ?? B = node2;
                            ?? cVar = 0;
                            while (B != 0) {
                                if (B instanceof a0) {
                                    ((a0) B).P1(zVar);
                                } else if ((B.getKindSet() & 2048) != 0 && (B instanceof h5.m)) {
                                    h4.r.c child = ((h5.m) B).f81888b;
                                    int i16 = 0;
                                    while (child != null) {
                                        if ((child.getKindSet() & 2048) != 0) {
                                            i16++;
                                            if (i16 == 1) {
                                                B = B;
                                                cVar = cVar;
                                                cVar = cVar;
                                                B = child;
                                            } else {
                                                if (cVar == 0) {
                                                    cVar = new q3.c(new h4.r.c[16], 0);
                                                }
                                                if (B != 0) {
                                                    cVar.b(B);
                                                    B = 0;
                                                }
                                                cVar.b(child);
                                            }
                                        } else {
                                            B = B;
                                            cVar = cVar;
                                        }
                                        child = child.getChild();
                                        B = B;
                                        cVar = cVar;
                                    }
                                    if (i16 == 1) {
                                        B = B;
                                        cVar = cVar;
                                    } else {
                                        B = B;
                                        cVar = cVar;
                                    }
                                }
                                B = h5.k.b(cVar);
                            }
                        }
                    }
                    node2 = node2.getParent();
                }
            }
            e0VarG = e0VarG.K();
            node2 = (e0VarG == null || (a1Var = e0VarG.P) == null) ? null : a1Var.f81684e;
        }
        return zVar;
    }

    public final n4.d X1(f5.c0 c0Var) {
        n4.d dVarJ0;
        n4.d dVar = W1().f116557m;
        y.f116543a.getClass();
        if (dVar != y.a.f116545b) {
            if (c0Var == null) {
                return dVar;
            }
            c1 c1VarF = h5.k.f(this);
            n4.c.f123541b.getClass();
            return dVar.o(c0Var.X(c1VarF, 0L));
        }
        if (c0Var != null && (dVarJ0 = c0Var.j0(h5.k.f(this), false)) != null) {
            return dVarJ0;
        }
        n4.c.f123541b.getClass();
        return g8.i.g(0L, g6.n.c(h5.k.f(this).f69146c));
    }

    public final f5.g Y1() {
        a1 a1Var;
        h4.r.c parent;
        Object obj;
        if (!getNode().getIsAttached()) {
            e5.a.b("visitAncestors called on an unattached node");
        }
        h4.r.c parent2 = getNode().getParent();
        h5.e0 e0VarG = h5.k.g(this);
        loop0: while (e0VarG != null) {
            if ((e0VarG.P.f81685f.getAggregateChildKindSet() & 8388640) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & 8388640) != 0) {
                        if ((8388608 & parent.getKindSet()) != 0) {
                            boolean z14 = parent instanceof f5.i;
                            Object obj2 = parent;
                            if (!z14) {
                                if (parent instanceof h5.m) {
                                    h4.r.c cVar = null;
                                    for (h4.r.c child = ((h5.m) parent).f81888b; child != null; child = child.getChild()) {
                                        if (child instanceof f5.i) {
                                            cVar = child;
                                        }
                                    }
                                    obj2 = cVar;
                                } else {
                                    obj2 = null;
                                }
                            }
                            f5.i iVar = (f5.i) obj2;
                            if (iVar == null) {
                                break loop0;
                            }
                            return iVar.T();
                        }
                        if ((parent.getKindSet() & 32) == 0) {
                            continue;
                        } else {
                            if (parent instanceof g5.g) {
                                obj = parent;
                            } else if (parent instanceof h5.m) {
                                h4.r.c child2 = ((h5.m) parent).f81888b;
                                obj = null;
                                while (child2 != null) {
                                    if (child2 instanceof g5.g) {
                                        obj = child2;
                                    }
                                    child2 = child2.getChild();
                                    obj = obj;
                                }
                            } else {
                                obj = null;
                            }
                            g5.g gVar = (g5.g) obj;
                            if (gVar != null) {
                                g5.f fVarP0 = gVar.P0();
                                g5.i<f5.g> iVar2 = f5.h.f68953a;
                                if (fVarP0.a(iVar2)) {
                                    return (f5.g) gVar.P0().b(iVar2);
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    parent = parent.getParent();
                }
            }
            parent = parent2;
            e0VarG = e0VarG.K();
            parent2 = (e0VarG == null || (a1Var = e0VarG.P) == null) ? null : a1Var.f81684e;
        }
        return null;
    }

    @Override // m4.i0
    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public final h0 a0() {
        u focusOwner;
        j0 j0VarF;
        a1 a1Var;
        if (getIsAttached() && (j0VarF = (focusOwner = h5.k.h(this).getFocusOwner()).f()) != null) {
            if (this == j0VarF) {
                return focusOwner.h() ? h0.Captured : h0.Active;
            }
            if (j0VarF.getIsAttached()) {
                if (!j0VarF.getNode().getIsAttached()) {
                    e5.a.b("visitAncestors called on an unattached node");
                }
                h4.r.c parent = j0VarF.getNode().getParent();
                h5.e0 e0VarG = h5.k.g(j0VarF);
                while (e0VarG != null) {
                    if ((e0VarG.P.f81685f.getAggregateChildKindSet() & 1024) != 0) {
                        while (parent != null) {
                            if ((parent.getKindSet() & 1024) != 0) {
                                h4.r.c cVarB = parent;
                                q3.c cVar = null;
                                while (cVarB != null) {
                                    if (cVarB instanceof j0) {
                                        if (this == ((j0) cVarB)) {
                                            return h0.ActiveParent;
                                        }
                                    } else if ((cVarB.getKindSet() & 1024) != 0 && (cVarB instanceof h5.m)) {
                                        int i14 = 0;
                                        for (h4.r.c child = ((h5.m) cVarB).f81888b; child != null; child = child.getChild()) {
                                            if ((child.getKindSet() & 1024) != 0) {
                                                i14++;
                                                if (i14 == 1) {
                                                    cVarB = child;
                                                } else {
                                                    if (cVar == null) {
                                                        cVar = new q3.c(new h4.r.c[16], 0);
                                                    }
                                                    if (cVarB != null) {
                                                        cVar.b(cVarB);
                                                        cVarB = null;
                                                    }
                                                    cVar.b(child);
                                                }
                                            }
                                        }
                                        if (i14 == 1) {
                                        }
                                    }
                                    cVarB = h5.k.b(cVar);
                                }
                            }
                            parent = parent.getParent();
                        }
                    }
                    e0VarG = e0VarG.K();
                    parent = (e0VarG == null || (a1Var = e0VarG.P) == null) ? null : a1Var.f81684e;
                }
            }
            return h0.Inactive;
        }
        return h0.Inactive;
    }

    public final void a2() {
        int i14 = b.f116491b[a0().ordinal()];
        if (i14 != 1 && i14 != 2) {
            if (i14 == 3 || i14 == 4) {
                return;
            }
            u0.r();
            return;
        }
        p005kotlin.jvm.internal.r0 r0Var = new p005kotlin.jvm.internal.r0();
        j1.a(this, new c(r0Var, this));
        T t7 = r0Var.f105810a;
        if (t7 == 0) {
            p005kotlin.jvm.internal.s.m("focusProperties");
            throw null;
        }
        if (((y) t7).getF116546b()) {
            return;
        }
        h5.k.h(this).getFocusOwner().y(true);
    }

    @Override // h5.b0
    public final void f(f5.c0 c0Var) {
        boolean z14 = h4.i.f81559a;
    }

    @Override // h4.r.c
    /* JADX INFO: renamed from: getShouldAutoInvalidate */
    public final boolean getF69013b() {
        return false;
    }

    @Override // m4.i0
    public final boolean n1(int i14) {
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            return W1().f116546b ? U1(i14) : r0.e(this, i14, new d(i14));
        } finally {
            Trace.endSection();
        }
    }

    @Override // h4.r.c
    public final void onDetach() {
        int i14 = b.f116491b[a0().ordinal()];
        if (i14 == 1 || i14 == 2) {
            u focusOwner = h5.k.h(this).getFocusOwner();
            g.f116466b.getClass();
            focusOwner.o(g.f116474j, true, false);
            if (this.f116483a) {
                focusOwner.a();
            }
            focusOwner.q();
            return;
        }
        if (i14 != 3) {
            if (i14 == 4) {
                return;
            }
            u0.r();
            return;
        }
        u focusOwner2 = h5.k.h(this).getFocusOwner();
        j0 j0VarA = m0.a(this);
        if (j0VarA == null || !j0VarA.f116483a) {
            return;
        }
        focusOwner2.a();
        focusOwner2.q();
    }

    @Override // h4.r.c
    public final void onReset() {
        if (a0().a()) {
            u focusOwner = h5.k.h(this).getFocusOwner();
            g.f116466b.getClass();
            focusOwner.o(g.f116474j, true, true);
        }
    }

    @Override // h5.i1
    public final void x1() {
        a2();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private j0(int i14, boolean z14, e23.p<? super g0, ? super g0, Unit> pVar, e23.l<? super j0, Unit> lVar) {
        this.f116483a = z14;
        this.f116484b = pVar;
        this.f116485c = lVar;
        this.f116488f = i14;
    }

    public /* synthetic */ j0(int i14, boolean z14, e23.p pVar, e23.l lVar, p005kotlin.jvm.internal.j jVar) {
        this(i14, z14, pVar, lVar);
    }
}
