package m4;

import android.os.Trace;
import android.view.KeyEvent;
import h5.a1;
import h5.o1;
import h5.x0;
import java.util.ArrayList;
import java.util.List;
import kotlin.m2;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lm4/v;", "Lm4/u;", "Lm4/q0;", "platformFocusOwner", "Lh5/o1;", "owner", "<init>", "(Lm4/q0;Lh5/o1;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class v implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q0 f116526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o1 f116527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j0 f116528c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o f116529d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f116530e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public p1.n0 f116531f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p1.q0<p> f116532g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public j0 f116533h;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f116534a;

        static {
            int[] iArr = new int[m4.c.values().length];
            try {
                iArr[m4.c.Redirected.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[m4.c.Cancelled.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[m4.c.RedirectCancelled.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[m4.c.None.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f116534a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm4/j0;", "it", "", "invoke", "(Lm4/j0;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class b extends p005kotlin.jvm.internal.w implements e23.l<j0, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j0 f116535a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ v f116536b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.l<j0, Boolean> f116537c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(j0 j0Var, v vVar, e23.l<? super j0, Boolean> lVar) {
            super(1);
            this.f116535a = j0Var;
            this.f116536b = vVar;
            this.f116537c = lVar;
        }

        @Override // e23.l
        public final Boolean invoke(j0 j0Var) {
            boolean zBooleanValue;
            j0 j0Var2 = j0Var;
            if (p005kotlin.jvm.internal.s.g(j0Var2, this.f116535a)) {
                zBooleanValue = false;
            } else {
                if (p005kotlin.jvm.internal.s.g(j0Var2, this.f116536b.f116528c)) {
                    vb.h.z("Focus search landed at the root.");
                    return null;
                }
                zBooleanValue = this.f116537c.invoke(j0Var2).booleanValue();
            }
            return Boolean.valueOf(zBooleanValue);
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"m4/v$c", "Lh5/x0;", "Lm4/j0;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c extends x0<j0> {
        public c() {
        }

        @Override // h5.x0
        public final h4.r.c create() {
            return v.this.f116528c;
        }

        @Override // h5.x0
        public final boolean equals(Object obj) {
            return obj == this;
        }

        @Override // h5.x0
        public final int hashCode() {
            return v.this.f116528c.hashCode();
        }

        @Override // h5.x0
        public final void inspectableProperties(m2 m2Var) {
            m2Var.f91341a = "RootFocusTarget";
        }

        @Override // h5.x0
        public final /* bridge */ /* synthetic */ void update(h4.r.c cVar) {
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm4/j0;", "it", "", "invoke", "(Lm4/j0;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class d extends p005kotlin.jvm.internal.w implements e23.l<j0, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p005kotlin.jvm.internal.r0<Boolean> f116539a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f116540b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(p005kotlin.jvm.internal.r0<Boolean> r0Var, int i14) {
            super(1);
            this.f116539a = r0Var;
            this.f116540b = i14;
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [T, java.lang.Boolean] */
        @Override // e23.l
        public final Boolean invoke(j0 j0Var) {
            ?? ValueOf = Boolean.valueOf(j0Var.n1(this.f116540b));
            this.f116539a.f105810a = ValueOf;
            return ValueOf;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm4/j0;", "it", "", "invoke", "(Lm4/j0;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class e extends p005kotlin.jvm.internal.w implements e23.l<j0, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f116541a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(int i14) {
            super(1);
            this.f116541a = i14;
        }

        @Override // e23.l
        public final Boolean invoke(j0 j0Var) {
            return Boolean.valueOf(j0Var.n1(this.f116541a));
        }
    }

    public v(q0 q0Var, o1 o1Var) {
        this.f116526a = q0Var;
        this.f116527b = o1Var;
        n0.f116502b.getClass();
        this.f116528c = new j0(n0.f116504d, false, null, null, 14, null);
        this.f116529d = new o(this, o1Var);
        this.f116530e = new c();
        this.f116532g = new p1.q0<>(1);
    }

    public final boolean A(KeyEvent keyEvent) {
        long jA = z4.d.a(keyEvent);
        int iB = z4.d.b(keyEvent);
        z4.c.f202307b.getClass();
        if (iB == z4.c.f202309d) {
            p1.n0 n0Var = this.f116531f;
            if (n0Var == null) {
                n0Var = new p1.n0(3);
                this.f116531f = n0Var;
            }
            n0Var.d(jA);
            return true;
        }
        if (iB == z4.c.f202308c) {
            p1.n0 n0Var2 = this.f116531f;
            if (n0Var2 == null || !n0Var2.a(jA)) {
                return false;
            }
            p1.n0 n0Var3 = this.f116531f;
            if (n0Var3 != null) {
                n0Var3.e(jA);
                return true;
            }
        }
        return true;
    }

    @Override // m4.u
    public final boolean a() {
        return this.f116526a.a();
    }

    @Override // m4.u
    public final void b() {
        this.f116526a.b();
    }

    @Override // m4.u
    public final void c(k kVar) {
        o oVar = this.f116529d;
        if (oVar.f116509d.d(kVar)) {
            oVar.a();
        }
    }

    @Override // m4.u
    public final void d(j0 j0Var) {
        o oVar = this.f116529d;
        if (oVar.f116508c.d(j0Var)) {
            oVar.a();
        }
    }

    /* JADX WARN: Code duplicated, block: B:112:0x0174  */
    /* JADX WARN: Code duplicated, block: B:117:0x0182  */
    /* JADX WARN: Code duplicated, block: B:139:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:144:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:165:0x021a  */
    /* JADX WARN: Code duplicated, block: B:167:0x0221  */
    /* JADX WARN: Code duplicated, block: B:170:0x022e A[LOOP:13: B:166:0x021f->B:170:0x022e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:219:0x022d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:221:0x0178 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:232:0x022d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:234:0x01ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:245:0x022d A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v10, types: [h4.r$c] */
    /* JADX WARN: Type inference failed for: r14v11, types: [h4.r$c] */
    /* JADX WARN: Type inference failed for: r14v12, types: [h4.r$c] */
    /* JADX WARN: Type inference failed for: r14v13, types: [h4.r$c] */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v20, types: [h4.r$c] */
    /* JADX WARN: Type inference failed for: r14v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r14v26 */
    /* JADX WARN: Type inference failed for: r14v29 */
    /* JADX WARN: Type inference failed for: r14v30, types: [h4.r$c] */
    /* JADX WARN: Type inference failed for: r14v31, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v32 */
    /* JADX WARN: Type inference failed for: r14v33 */
    /* JADX WARN: Type inference failed for: r14v34 */
    /* JADX WARN: Type inference failed for: r14v36 */
    /* JADX WARN: Type inference failed for: r14v54 */
    /* JADX WARN: Type inference failed for: r14v55 */
    /* JADX WARN: Type inference failed for: r14v56 */
    /* JADX WARN: Type inference failed for: r14v57 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [q3.c] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14, types: [q3.c] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17, types: [q3.c] */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20, types: [q3.c] */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21, types: [h4.r$c] */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23, types: [h4.r$c] */
    /* JADX WARN: Type inference failed for: r7v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v32, types: [q3.c] */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r8v34 */
    /* JADX WARN: Type inference failed for: r8v35, types: [q3.c] */
    /* JADX WARN: Type inference failed for: r8v37 */
    /* JADX WARN: Type inference failed for: r8v38 */
    /* JADX WARN: Type inference failed for: r8v39 */
    /* JADX WARN: Type inference failed for: r8v40 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r9v19 */
    @Override // m4.u
    public final boolean e(KeyEvent keyEvent) {
        z4.i iVar;
        ?? node;
        ?? cVar;
        ?? node2;
        ?? cVar2;
        int size;
        int i14;
        a1 a1Var;
        boolean z14;
        ?? B;
        a1 a1Var2;
        if (this.f116529d.f116510e) {
            System.out.println((Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            return false;
        }
        j0 j0VarA = m0.a(this.f116528c);
        if (j0VarA != null) {
            if (!j0VarA.getNode().getIsAttached()) {
                e5.a.b("visitAncestors called on an unattached node");
            }
            h4.r.c node3 = j0VarA.getNode();
            h5.e0 e0VarG = h5.k.g(j0VarA);
            loop0: while (true) {
                if (e0VarG == null) {
                    B = 0;
                    break;
                }
                if ((e0VarG.P.f81685f.getAggregateChildKindSet() & 131072) != 0) {
                    while (node3 != null) {
                        if ((node3.getKindSet() & 131072) != 0) {
                            ?? cVar3 = 0;
                            B = node3;
                            while (B != 0) {
                                if (B instanceof z4.i) {
                                    break loop0;
                                }
                                if ((B.getKindSet() & 131072) != 0 && (B instanceof h5.m)) {
                                    h4.r.c child = ((h5.m) B).f81888b;
                                    int i15 = 0;
                                    while (child != null) {
                                        if ((child.getKindSet() & 131072) != 0) {
                                            i15++;
                                            if (i15 == 1) {
                                                B = B;
                                                cVar3 = cVar3;
                                                cVar3 = cVar3;
                                                Unit unit = Unit.INSTANCE;
                                                B = child;
                                            } else {
                                                if (cVar3 == 0) {
                                                    cVar3 = new q3.c(new h4.r.c[16], 0);
                                                }
                                                if (B != 0) {
                                                    cVar3.b(B);
                                                    B = 0;
                                                }
                                                cVar3.b(child);
                                            }
                                        } else {
                                            B = B;
                                            cVar3 = cVar3;
                                        }
                                        child = child.getChild();
                                        B = B;
                                        cVar3 = cVar3;
                                    }
                                    if (i15 == 1) {
                                        B = B;
                                        cVar3 = cVar3;
                                    } else {
                                        B = B;
                                        cVar3 = cVar3;
                                    }
                                }
                                B = h5.k.b(cVar3);
                            }
                        }
                        node3 = node3.getParent();
                    }
                }
                e0VarG = e0VarG.K();
                node3 = (e0VarG == null || (a1Var2 = e0VarG.P) == null) ? null : a1Var2.f81684e;
            }
            iVar = (z4.i) B;
        } else {
            iVar = null;
        }
        if (iVar != null) {
            if (!iVar.getNode().getIsAttached()) {
                e5.a.b("visitAncestors called on an unattached node");
            }
            h4.r.c parent = iVar.getNode().getParent();
            h5.e0 e0VarG2 = h5.k.g(iVar);
            ArrayList arrayList = null;
            while (e0VarG2 != null) {
                if ((e0VarG2.P.f81685f.getAggregateChildKindSet() & 131072) != 0) {
                    while (parent != null) {
                        if ((parent.getKindSet() & 131072) != 0) {
                            h4.r.c cVarB = parent;
                            q3.c cVar4 = null;
                            while (cVarB != null) {
                                if (cVarB instanceof z4.i) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(cVarB);
                                    z14 = false;
                                } else {
                                    z14 = true;
                                }
                                if (z14 && (cVarB.getKindSet() & 131072) != 0 && (cVarB instanceof h5.m)) {
                                    int i16 = 0;
                                    for (h4.r.c child2 = ((h5.m) cVarB).f81888b; child2 != null; child2 = child2.getChild()) {
                                        if ((child2.getKindSet() & 131072) != 0) {
                                            i16++;
                                            if (i16 == 1) {
                                                Unit unit2 = Unit.INSTANCE;
                                                cVarB = child2;
                                            } else {
                                                if (cVar4 == null) {
                                                    cVar4 = new q3.c(new h4.r.c[16], 0);
                                                }
                                                if (cVarB != null) {
                                                    cVar4.b(cVarB);
                                                    cVarB = null;
                                                }
                                                cVar4.b(child2);
                                            }
                                        }
                                    }
                                    if (i16 == 1) {
                                    }
                                }
                                cVarB = h5.k.b(cVar4);
                            }
                        }
                        parent = parent.getParent();
                    }
                }
                e0VarG2 = e0VarG2.K();
                parent = (e0VarG2 == null || (a1Var = e0VarG2.P) == null) ? null : a1Var.f81684e;
            }
            if (arrayList == null) {
                node = iVar.getNode();
                cVar = 0;
                while (node != 0) {
                    if (node instanceof z4.i) {
                        if (((z4.i) node).B()) {
                        }
                    } else if ((node.getKindSet() & 131072) == 0 && (node instanceof h5.m)) {
                        h4.r.c child3 = ((h5.m) node).f81888b;
                        int i17 = 0;
                        while (child3 != null) {
                            if ((child3.getKindSet() & 131072) != 0) {
                                i17++;
                                if (i17 == 1) {
                                    cVar = cVar;
                                    node = node;
                                    cVar = cVar;
                                    Unit unit3 = Unit.INSTANCE;
                                    node = child3;
                                } else {
                                    if (cVar == 0) {
                                        cVar = new q3.c(new h4.r.c[16], 0);
                                    }
                                    if (node != 0) {
                                        cVar.b(node);
                                        node = 0;
                                    }
                                    cVar.b(child3);
                                }
                            } else {
                                cVar = cVar;
                                node = node;
                            }
                            child3 = child3.getChild();
                            cVar = cVar;
                            node = node;
                        }
                        if (i17 == 1) {
                            cVar = cVar;
                            node = node;
                        } else {
                            cVar = cVar;
                            node = node;
                        }
                    }
                    node = h5.k.b(cVar);
                }
                node2 = iVar.getNode();
                cVar2 = 0;
                while (node2 != 0) {
                    if (node2 instanceof z4.i) {
                        if (((z4.i) node2).R1()) {
                        }
                    } else if ((node2.getKindSet() & 131072) == 0 && (node2 instanceof h5.m)) {
                        h4.r.c child4 = ((h5.m) node2).f81888b;
                        int i18 = 0;
                        while (child4 != null) {
                            if ((child4.getKindSet() & 131072) != 0) {
                                i18++;
                                if (i18 == 1) {
                                    cVar2 = cVar2;
                                    node2 = node2;
                                    cVar2 = cVar2;
                                    Unit unit4 = Unit.INSTANCE;
                                    node2 = child4;
                                } else {
                                    if (cVar2 == 0) {
                                        cVar2 = new q3.c(new h4.r.c[16], 0);
                                    }
                                    if (node2 != 0) {
                                        cVar2.b(node2);
                                        node2 = 0;
                                    }
                                    cVar2.b(child4);
                                }
                            } else {
                                cVar2 = cVar2;
                                node2 = node2;
                            }
                            child4 = child4.getChild();
                            cVar2 = cVar2;
                            node2 = node2;
                        }
                        if (i18 == 1) {
                            cVar2 = cVar2;
                            node2 = node2;
                        } else {
                            cVar2 = cVar2;
                            node2 = node2;
                        }
                    }
                    node2 = h5.k.b(cVar2);
                }
                if (arrayList != null) {
                    size = arrayList.size();
                    for (i14 = 0; i14 < size; i14++) {
                        if (((z4.i) arrayList.get(i14)).R1()) {
                        }
                    }
                    Unit unit5 = Unit.INSTANCE;
                }
                Unit unit6 = Unit.INSTANCE;
            } else {
                int size2 = arrayList.size() - 1;
                if (size2 >= 0) {
                    while (true) {
                        int i19 = size2 - 1;
                        if (!((z4.i) arrayList.get(size2)).B()) {
                            if (i19 < 0) {
                                break;
                            }
                            size2 = i19;
                        }
                    }
                }
                Unit unit7 = Unit.INSTANCE;
                node = iVar.getNode();
                cVar = 0;
                while (node != 0) {
                    if (node instanceof z4.i) {
                        if (((z4.i) node).B()) {
                        }
                    } else if ((node.getKindSet() & 131072) == 0) {
                    }
                    node = h5.k.b(cVar);
                }
                node2 = iVar.getNode();
                cVar2 = 0;
                while (node2 != 0) {
                    if (node2 instanceof z4.i) {
                        if (((z4.i) node2).R1()) {
                        }
                    } else if ((node2.getKindSet() & 131072) == 0) {
                    }
                    node2 = h5.k.b(cVar2);
                }
                if (arrayList != null) {
                    size = arrayList.size();
                    while (i14 < size) {
                        if (((z4.i) arrayList.get(i14)).R1()) {
                        }
                    }
                    Unit unit8 = Unit.INSTANCE;
                }
                Unit unit9 = Unit.INSTANCE;
            }
            return true;
        }
        return false;
    }

    @Override // m4.u
    public final j0 f() {
        j0 j0Var = this.f116533h;
        if (j0Var == null || !j0Var.getIsAttached()) {
            return null;
        }
        return this.f116533h;
    }

    @Override // m4.u
    /* JADX INFO: renamed from: g, reason: from getter */
    public final c getF116530e() {
        return this.f116530e;
    }

    @Override // m4.u
    public final p1.q0<p> getListeners() {
        return this.f116532g;
    }

    @Override // m4.u
    public final boolean h() {
        return false;
    }

    @Override // m4.u
    public final boolean i(int i14) {
        if (!o(i14, false, false)) {
            return false;
        }
        Boolean boolM = m(i14, null, new e(i14));
        boolean zBooleanValue = boolM != null ? boolM.booleanValue() : false;
        if (!zBooleanValue) {
            b();
        }
        return zBooleanValue;
    }

    @Override // m4.u
    public final void j(j0 j0Var) {
        j0 j0Var2 = this.f116533h;
        this.f116533h = j0Var;
        p1.q0<p> q0Var = this.f116532g;
        Object[] objArr = q0Var.f134667a;
        int i14 = q0Var.f134668b;
        for (int i15 = 0; i15 < i14; i15++) {
            ((p) objArr[i15]).v(j0Var2, j0Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [T, java.lang.Boolean] */
    @Override // m4.u
    public final boolean k(int i14, boolean z14) {
        j0 j0VarF;
        boolean z15 = h4.i.f81559a;
        q0 q0Var = this.f116526a;
        if (!z15 || (j0VarF = f()) == null || !j0VarF.f116483a || !q0Var.H(i14)) {
            p005kotlin.jvm.internal.r0 r0Var = new p005kotlin.jvm.internal.r0();
            r0Var.f105810a = Boolean.FALSE;
            j0 j0VarF2 = f();
            Boolean boolM = m(i14, q0Var.getEmbeddedViewFocusRect(), new d(r0Var, i14));
            if (!p005kotlin.jvm.internal.s.g(boolM, Boolean.TRUE) || j0VarF2 == f()) {
                if (boolM != null && r0Var.f105810a != 0) {
                    if (!boolM.booleanValue() || !((Boolean) r0Var.f105810a).booleanValue()) {
                        if (x.a(i14) && z14) {
                            if (o(i14, false, false)) {
                                Boolean boolM2 = m(i14, null, new w(i14));
                                if (boolM2 != null ? boolM2.booleanValue() : false) {
                                }
                            }
                        } else if (!z15) {
                            return q0Var.H(i14);
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    @Override // m4.q
    public final boolean l(int i14) {
        return k(i14, true);
    }

    @Override // m4.u
    public final Boolean m(int i14, n4.d dVar, e23.l<? super j0, Boolean> lVar) {
        boolean zA;
        int i15;
        a1 a1Var;
        b0 b0Var;
        boolean z14;
        j0 j0Var = this.f116528c;
        j0 j0VarA = m0.a(j0Var);
        o1 o1Var = this.f116527b;
        j0 j0Var2 = null;
        if (j0VarA != null) {
            g6.o layoutDirection = o1Var.getLayoutDirection();
            z zVarW1 = j0VarA.W1();
            b0 b0Var2 = zVarW1.f116553i;
            b0 b0Var3 = zVarW1.f116554j;
            g.f116466b.getClass();
            if (i14 == g.f116467c) {
                b0Var = zVarW1.f116547c;
            } else if (i14 == g.f116468d) {
                b0Var = zVarW1.f116548d;
            } else if (i14 == g.f116471g) {
                b0Var = zVarW1.f116549e;
            } else if (i14 == g.f116472h) {
                b0Var = zVarW1.f116550f;
            } else if (i14 == g.f116469e) {
                int i16 = m0.a.f116500a[layoutDirection.ordinal()];
                if (i16 != 1) {
                    if (i16 != 2) {
                        u0.r();
                        return null;
                    }
                    b0Var2 = b0Var3;
                }
                b0.f116451b.getClass();
                b0Var = b0Var2 == b0.f116452c ? null : b0Var2;
                if (b0Var == null) {
                    b0Var = zVarW1.f116551g;
                }
            } else if (i14 == g.f116470f) {
                int i17 = m0.a.f116500a[layoutDirection.ordinal()];
                if (i17 == 1) {
                    b0Var2 = b0Var3;
                } else if (i17 != 2) {
                    u0.r();
                    return null;
                }
                b0.f116451b.getClass();
                b0Var = b0Var2 == b0.f116452c ? null : b0Var2;
                if (b0Var == null) {
                    b0Var = zVarW1.f116552h;
                }
            } else {
                int i18 = g.f116473i;
                if (i14 != i18 && i14 != g.f116474j) {
                    vb.h.z("invalid FocusDirection");
                    return null;
                }
                m4.b bVar = new m4.b(i14, null);
                u focusOwner = h5.k.h(j0VarA).getFocusOwner();
                j0 j0VarF = focusOwner.f();
                if (i14 == i18) {
                    zVarW1.f116555k.invoke(bVar);
                } else {
                    zVarW1.f116556l.invoke(bVar);
                }
                if (bVar.f116450b) {
                    b0.f116451b.getClass();
                    b0Var = b0.f116453d;
                } else if (j0VarF != focusOwner.f()) {
                    b0.f116451b.getClass();
                    b0Var = b0.f116454e;
                } else {
                    b0.f116451b.getClass();
                    b0Var = b0.f116452c;
                }
            }
            b0.f116451b.getClass();
            b0 b0Var4 = b0.f116453d;
            if (!p005kotlin.jvm.internal.s.g(b0Var, b0Var4)) {
                if (p005kotlin.jvm.internal.s.g(b0Var, b0.f116454e)) {
                    j0 j0VarA2 = m0.a(j0Var);
                    if (j0VarA2 != null) {
                        return lVar.invoke(j0VarA2);
                    }
                } else {
                    b0 b0Var5 = b0.f116452c;
                    if (!p005kotlin.jvm.internal.s.g(b0Var, b0Var5)) {
                        if (b0Var == b0Var5) {
                            vb.h.z("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                            return null;
                        }
                        if (b0Var == b0Var4) {
                            vb.h.z("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                            return null;
                        }
                        q3.c<e0> cVar = b0Var.f116455a;
                        int i19 = cVar.f142358c;
                        if (i19 == 0) {
                            System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
                            z14 = false;
                        } else {
                            e0[] e0VarArr = cVar.f142356a;
                            boolean z15 = false;
                            for (int i24 = 0; i24 < i19; i24++) {
                                e0 e0Var = e0VarArr[i24];
                                if (!e0Var.getNode().getIsAttached()) {
                                    e5.a.b("visitChildren called on an unattached node");
                                }
                                q3.c cVar2 = new q3.c(new h4.r.c[16], 0);
                                h4.r.c child = e0Var.getNode().getChild();
                                if (child == null) {
                                    h5.k.a(cVar2, e0Var.getNode());
                                } else {
                                    cVar2.b(child);
                                }
                                while (true) {
                                    int i25 = cVar2.f142358c;
                                    if (i25 == 0) {
                                        break;
                                    }
                                    h4.r.c cVarB = (h4.r.c) cVar2.k(i25 - 1);
                                    if ((cVarB.getAggregateChildKindSet() & 1024) == 0) {
                                        h5.k.a(cVar2, cVarB);
                                    } else {
                                        while (cVarB != null) {
                                            if ((cVarB.getKindSet() & 1024) != 0) {
                                                q3.c cVar3 = null;
                                                while (cVarB != null) {
                                                    if (cVarB instanceof j0) {
                                                        if (lVar.invoke((j0) cVarB).booleanValue()) {
                                                            z15 = true;
                                                            break;
                                                        }
                                                    } else if ((cVarB.getKindSet() & 1024) != 0 && (cVarB instanceof h5.m)) {
                                                        int i26 = 0;
                                                        for (h4.r.c child2 = ((h5.m) cVarB).f81888b; child2 != null; child2 = child2.getChild()) {
                                                            if ((child2.getKindSet() & 1024) != 0) {
                                                                i26++;
                                                                if (i26 == 1) {
                                                                    cVarB = child2;
                                                                } else {
                                                                    if (cVar3 == null) {
                                                                        cVar3 = new q3.c(new h4.r.c[16], 0);
                                                                    }
                                                                    if (cVarB != null) {
                                                                        cVar3.b(cVarB);
                                                                        cVarB = null;
                                                                    }
                                                                    cVar3.b(child2);
                                                                }
                                                            }
                                                        }
                                                        if (i26 == 1) {
                                                        }
                                                    }
                                                    cVarB = h5.k.b(cVar3);
                                                }
                                                break;
                                            }
                                            cVarB = cVarB.getChild();
                                        }
                                    }
                                }
                            }
                            z14 = z15;
                        }
                        return Boolean.valueOf(z14);
                    }
                }
            }
            return null;
        }
        j0VarA = null;
        g6.o layoutDirection2 = o1Var.getLayoutDirection();
        b bVar2 = new b(j0VarA, this, lVar);
        g.f116466b.getClass();
        int i27 = g.f116467c;
        if (i14 == i27 || i14 == g.f116468d) {
            if (i14 == i27) {
                zA = p0.b(j0Var, bVar2);
            } else {
                if (i14 != g.f116468d) {
                    vb.h.z("This function should only be used for 1-D focus search");
                    return null;
                }
                zA = p0.a(j0Var, bVar2);
            }
            return Boolean.valueOf(zA);
        }
        int i28 = g.f116469e;
        if (i14 == i28 || i14 == (i15 = g.f116470f) || i14 == g.f116471g || i14 == g.f116472h) {
            return r0.k(j0Var, i14, dVar, bVar2);
        }
        if (i14 == g.f116473i) {
            int i29 = m0.a.f116500a[layoutDirection2.ordinal()];
            if (i29 == 1) {
                i28 = i15;
            } else if (i29 != 2) {
                u0.r();
                return null;
            }
            j0 j0VarA3 = m0.a(j0Var);
            if (j0VarA3 != null) {
                return r0.k(j0VarA3, i28, dVar, bVar2);
            }
            return null;
        }
        if (i14 != g.f116474j) {
            androidx.core.view.j.x(g.b(i14), "Focus search invoked with invalid FocusDirection ");
            return null;
        }
        j0 j0VarA4 = m0.a(j0Var);
        if (j0VarA4 != null) {
            if (!j0VarA4.getNode().getIsAttached()) {
                e5.a.b("visitAncestors called on an unattached node");
            }
            h4.r.c parent = j0VarA4.getNode().getParent();
            h5.e0 e0VarG = h5.k.g(j0VarA4);
            loop5: while (e0VarG != null) {
                if ((e0VarG.P.f81685f.getAggregateChildKindSet() & 1024) != 0) {
                    while (parent != null) {
                        if ((parent.getKindSet() & 1024) != 0) {
                            h4.r.c cVarB2 = parent;
                            q3.c cVar4 = null;
                            while (cVarB2 != null) {
                                if (cVarB2 instanceof j0) {
                                    j0 j0Var3 = (j0) cVarB2;
                                    if (j0Var3.W1().f116546b) {
                                        j0Var2 = j0Var3;
                                        break loop5;
                                    }
                                } else if ((cVarB2.getKindSet() & 1024) != 0 && (cVarB2 instanceof h5.m)) {
                                    int i30 = 0;
                                    for (h4.r.c child3 = ((h5.m) cVarB2).f81888b; child3 != null; child3 = child3.getChild()) {
                                        if ((child3.getKindSet() & 1024) != 0) {
                                            i30++;
                                            if (i30 == 1) {
                                                cVarB2 = child3;
                                            } else {
                                                if (cVar4 == null) {
                                                    cVar4 = new q3.c(new h4.r.c[16], 0);
                                                }
                                                if (cVarB2 != null) {
                                                    cVar4.b(cVarB2);
                                                    cVarB2 = null;
                                                }
                                                cVar4.b(child3);
                                            }
                                        }
                                    }
                                    if (i30 != 1) {
                                        cVarB2 = h5.k.b(cVar4);
                                    }
                                }
                                cVarB2 = h5.k.b(cVar4);
                            }
                        }
                        parent = parent.getParent();
                    }
                }
                e0VarG = e0VarG.K();
                parent = (e0VarG == null || (a1Var = e0VarG.P) == null) ? null : a1Var.f81684e;
            }
        }
        return Boolean.valueOf((j0Var2 == null || j0Var2.equals(j0Var)) ? false : ((Boolean) bVar2.invoke(j0Var2)).booleanValue());
    }

    /* JADX WARN: Code duplicated, block: B:118:0x0190 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x003c, B:20:0x0041, B:22:0x004d, B:24:0x0054, B:26:0x005c, B:30:0x0066, B:128:0x01a6, B:130:0x01b0, B:131:0x01b3, B:133:0x01c2, B:136:0x01d0, B:140:0x01dc, B:143:0x01e2, B:144:0x01e7, B:147:0x01ef, B:149:0x01f7, B:151:0x01fb, B:153:0x0203, B:155:0x020b, B:157:0x020f, B:159:0x0215, B:161:0x021e, B:162:0x0222, B:163:0x0225, B:166:0x022d, B:167:0x0232, B:168:0x0237, B:170:0x023d, B:172:0x0241, B:175:0x024a, B:177:0x0252, B:184:0x0269, B:185:0x026b, B:187:0x0272, B:189:0x0276, B:212:0x02c0, B:193:0x0282, B:195:0x028a, B:197:0x028e, B:199:0x0296, B:201:0x029e, B:203:0x02a2, B:205:0x02a8, B:207:0x02b1, B:208:0x02b5, B:209:0x02b8, B:213:0x02c5, B:217:0x02d5, B:219:0x02dc, B:221:0x02e0, B:244:0x032a, B:225:0x02ec, B:227:0x02f4, B:229:0x02f8, B:231:0x0300, B:233:0x0308, B:235:0x030c, B:237:0x0312, B:239:0x031b, B:240:0x031f, B:241:0x0322, B:246:0x0331, B:248:0x0338, B:253:0x034b, B:254:0x034d, B:34:0x0070, B:36:0x007a, B:37:0x007d, B:39:0x0087, B:42:0x0095, B:46:0x00a1, B:77:0x00fe, B:79:0x0102, B:49:0x00a6, B:51:0x00ae, B:53:0x00b2, B:55:0x00ba, B:57:0x00c2, B:59:0x00c6, B:61:0x00cc, B:63:0x00d5, B:64:0x00d9, B:65:0x00dc, B:68:0x00e4, B:69:0x00e9, B:70:0x00ee, B:72:0x00f4, B:74:0x00f8, B:80:0x0108, B:82:0x0112, B:83:0x0115, B:85:0x0123, B:88:0x0131, B:92:0x013d, B:123:0x019a, B:125:0x019e, B:95:0x0142, B:97:0x014a, B:99:0x014e, B:101:0x0156, B:103:0x015e, B:105:0x0162, B:107:0x0168, B:109:0x0171, B:110:0x0175, B:111:0x0178, B:114:0x0180, B:115:0x0185, B:116:0x018a, B:118:0x0190, B:120:0x0194), top: B:259:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:125:0x019e A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x003c, B:20:0x0041, B:22:0x004d, B:24:0x0054, B:26:0x005c, B:30:0x0066, B:128:0x01a6, B:130:0x01b0, B:131:0x01b3, B:133:0x01c2, B:136:0x01d0, B:140:0x01dc, B:143:0x01e2, B:144:0x01e7, B:147:0x01ef, B:149:0x01f7, B:151:0x01fb, B:153:0x0203, B:155:0x020b, B:157:0x020f, B:159:0x0215, B:161:0x021e, B:162:0x0222, B:163:0x0225, B:166:0x022d, B:167:0x0232, B:168:0x0237, B:170:0x023d, B:172:0x0241, B:175:0x024a, B:177:0x0252, B:184:0x0269, B:185:0x026b, B:187:0x0272, B:189:0x0276, B:212:0x02c0, B:193:0x0282, B:195:0x028a, B:197:0x028e, B:199:0x0296, B:201:0x029e, B:203:0x02a2, B:205:0x02a8, B:207:0x02b1, B:208:0x02b5, B:209:0x02b8, B:213:0x02c5, B:217:0x02d5, B:219:0x02dc, B:221:0x02e0, B:244:0x032a, B:225:0x02ec, B:227:0x02f4, B:229:0x02f8, B:231:0x0300, B:233:0x0308, B:235:0x030c, B:237:0x0312, B:239:0x031b, B:240:0x031f, B:241:0x0322, B:246:0x0331, B:248:0x0338, B:253:0x034b, B:254:0x034d, B:34:0x0070, B:36:0x007a, B:37:0x007d, B:39:0x0087, B:42:0x0095, B:46:0x00a1, B:77:0x00fe, B:79:0x0102, B:49:0x00a6, B:51:0x00ae, B:53:0x00b2, B:55:0x00ba, B:57:0x00c2, B:59:0x00c6, B:61:0x00cc, B:63:0x00d5, B:64:0x00d9, B:65:0x00dc, B:68:0x00e4, B:69:0x00e9, B:70:0x00ee, B:72:0x00f4, B:74:0x00f8, B:80:0x0108, B:82:0x0112, B:83:0x0115, B:85:0x0123, B:88:0x0131, B:92:0x013d, B:123:0x019a, B:125:0x019e, B:95:0x0142, B:97:0x014a, B:99:0x014e, B:101:0x0156, B:103:0x015e, B:105:0x0162, B:107:0x0168, B:109:0x0171, B:110:0x0175, B:111:0x0178, B:114:0x0180, B:115:0x0185, B:116:0x018a, B:118:0x0190, B:120:0x0194), top: B:259:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:126:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:320:0x00fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:321:0x00a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:327:0x00e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x006e  */
    /* JADX WARN: Code duplicated, block: B:340:0x0199 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:341:0x0141 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:342:0x0197 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:349:0x0185 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0070 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x003c, B:20:0x0041, B:22:0x004d, B:24:0x0054, B:26:0x005c, B:30:0x0066, B:128:0x01a6, B:130:0x01b0, B:131:0x01b3, B:133:0x01c2, B:136:0x01d0, B:140:0x01dc, B:143:0x01e2, B:144:0x01e7, B:147:0x01ef, B:149:0x01f7, B:151:0x01fb, B:153:0x0203, B:155:0x020b, B:157:0x020f, B:159:0x0215, B:161:0x021e, B:162:0x0222, B:163:0x0225, B:166:0x022d, B:167:0x0232, B:168:0x0237, B:170:0x023d, B:172:0x0241, B:175:0x024a, B:177:0x0252, B:184:0x0269, B:185:0x026b, B:187:0x0272, B:189:0x0276, B:212:0x02c0, B:193:0x0282, B:195:0x028a, B:197:0x028e, B:199:0x0296, B:201:0x029e, B:203:0x02a2, B:205:0x02a8, B:207:0x02b1, B:208:0x02b5, B:209:0x02b8, B:213:0x02c5, B:217:0x02d5, B:219:0x02dc, B:221:0x02e0, B:244:0x032a, B:225:0x02ec, B:227:0x02f4, B:229:0x02f8, B:231:0x0300, B:233:0x0308, B:235:0x030c, B:237:0x0312, B:239:0x031b, B:240:0x031f, B:241:0x0322, B:246:0x0331, B:248:0x0338, B:253:0x034b, B:254:0x034d, B:34:0x0070, B:36:0x007a, B:37:0x007d, B:39:0x0087, B:42:0x0095, B:46:0x00a1, B:77:0x00fe, B:79:0x0102, B:49:0x00a6, B:51:0x00ae, B:53:0x00b2, B:55:0x00ba, B:57:0x00c2, B:59:0x00c6, B:61:0x00cc, B:63:0x00d5, B:64:0x00d9, B:65:0x00dc, B:68:0x00e4, B:69:0x00e9, B:70:0x00ee, B:72:0x00f4, B:74:0x00f8, B:80:0x0108, B:82:0x0112, B:83:0x0115, B:85:0x0123, B:88:0x0131, B:92:0x013d, B:123:0x019a, B:125:0x019e, B:95:0x0142, B:97:0x014a, B:99:0x014e, B:101:0x0156, B:103:0x015e, B:105:0x0162, B:107:0x0168, B:109:0x0171, B:110:0x0175, B:111:0x0178, B:114:0x0180, B:115:0x0185, B:116:0x018a, B:118:0x0190, B:120:0x0194), top: B:259:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:351:0x0180 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x007a A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x003c, B:20:0x0041, B:22:0x004d, B:24:0x0054, B:26:0x005c, B:30:0x0066, B:128:0x01a6, B:130:0x01b0, B:131:0x01b3, B:133:0x01c2, B:136:0x01d0, B:140:0x01dc, B:143:0x01e2, B:144:0x01e7, B:147:0x01ef, B:149:0x01f7, B:151:0x01fb, B:153:0x0203, B:155:0x020b, B:157:0x020f, B:159:0x0215, B:161:0x021e, B:162:0x0222, B:163:0x0225, B:166:0x022d, B:167:0x0232, B:168:0x0237, B:170:0x023d, B:172:0x0241, B:175:0x024a, B:177:0x0252, B:184:0x0269, B:185:0x026b, B:187:0x0272, B:189:0x0276, B:212:0x02c0, B:193:0x0282, B:195:0x028a, B:197:0x028e, B:199:0x0296, B:201:0x029e, B:203:0x02a2, B:205:0x02a8, B:207:0x02b1, B:208:0x02b5, B:209:0x02b8, B:213:0x02c5, B:217:0x02d5, B:219:0x02dc, B:221:0x02e0, B:244:0x032a, B:225:0x02ec, B:227:0x02f4, B:229:0x02f8, B:231:0x0300, B:233:0x0308, B:235:0x030c, B:237:0x0312, B:239:0x031b, B:240:0x031f, B:241:0x0322, B:246:0x0331, B:248:0x0338, B:253:0x034b, B:254:0x034d, B:34:0x0070, B:36:0x007a, B:37:0x007d, B:39:0x0087, B:42:0x0095, B:46:0x00a1, B:77:0x00fe, B:79:0x0102, B:49:0x00a6, B:51:0x00ae, B:53:0x00b2, B:55:0x00ba, B:57:0x00c2, B:59:0x00c6, B:61:0x00cc, B:63:0x00d5, B:64:0x00d9, B:65:0x00dc, B:68:0x00e4, B:69:0x00e9, B:70:0x00ee, B:72:0x00f4, B:74:0x00f8, B:80:0x0108, B:82:0x0112, B:83:0x0115, B:85:0x0123, B:88:0x0131, B:92:0x013d, B:123:0x019a, B:125:0x019e, B:95:0x0142, B:97:0x014a, B:99:0x014e, B:101:0x0156, B:103:0x015e, B:105:0x0162, B:107:0x0168, B:109:0x0171, B:110:0x0175, B:111:0x0178, B:114:0x0180, B:115:0x0185, B:116:0x018a, B:118:0x0190, B:120:0x0194), top: B:259:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0087 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x003c, B:20:0x0041, B:22:0x004d, B:24:0x0054, B:26:0x005c, B:30:0x0066, B:128:0x01a6, B:130:0x01b0, B:131:0x01b3, B:133:0x01c2, B:136:0x01d0, B:140:0x01dc, B:143:0x01e2, B:144:0x01e7, B:147:0x01ef, B:149:0x01f7, B:151:0x01fb, B:153:0x0203, B:155:0x020b, B:157:0x020f, B:159:0x0215, B:161:0x021e, B:162:0x0222, B:163:0x0225, B:166:0x022d, B:167:0x0232, B:168:0x0237, B:170:0x023d, B:172:0x0241, B:175:0x024a, B:177:0x0252, B:184:0x0269, B:185:0x026b, B:187:0x0272, B:189:0x0276, B:212:0x02c0, B:193:0x0282, B:195:0x028a, B:197:0x028e, B:199:0x0296, B:201:0x029e, B:203:0x02a2, B:205:0x02a8, B:207:0x02b1, B:208:0x02b5, B:209:0x02b8, B:213:0x02c5, B:217:0x02d5, B:219:0x02dc, B:221:0x02e0, B:244:0x032a, B:225:0x02ec, B:227:0x02f4, B:229:0x02f8, B:231:0x0300, B:233:0x0308, B:235:0x030c, B:237:0x0312, B:239:0x031b, B:240:0x031f, B:241:0x0322, B:246:0x0331, B:248:0x0338, B:253:0x034b, B:254:0x034d, B:34:0x0070, B:36:0x007a, B:37:0x007d, B:39:0x0087, B:42:0x0095, B:46:0x00a1, B:77:0x00fe, B:79:0x0102, B:49:0x00a6, B:51:0x00ae, B:53:0x00b2, B:55:0x00ba, B:57:0x00c2, B:59:0x00c6, B:61:0x00cc, B:63:0x00d5, B:64:0x00d9, B:65:0x00dc, B:68:0x00e4, B:69:0x00e9, B:70:0x00ee, B:72:0x00f4, B:74:0x00f8, B:80:0x0108, B:82:0x0112, B:83:0x0115, B:85:0x0123, B:88:0x0131, B:92:0x013d, B:123:0x019a, B:125:0x019e, B:95:0x0142, B:97:0x014a, B:99:0x014e, B:101:0x0156, B:103:0x015e, B:105:0x0162, B:107:0x0168, B:109:0x0171, B:110:0x0175, B:111:0x0178, B:114:0x0180, B:115:0x0185, B:116:0x018a, B:118:0x0190, B:120:0x0194), top: B:259:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x0093 A[ADDED_TO_REGION, LOOP:12: B:41:0x0093->B:69:0x00e9, LOOP_START, PHI: r7
      0x0093: PHI (r7v27 h4.r$c) = (r7v22 h4.r$c), (r7v28 h4.r$c) binds: [B:40:0x0091, B:69:0x00e9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x0095 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x003c, B:20:0x0041, B:22:0x004d, B:24:0x0054, B:26:0x005c, B:30:0x0066, B:128:0x01a6, B:130:0x01b0, B:131:0x01b3, B:133:0x01c2, B:136:0x01d0, B:140:0x01dc, B:143:0x01e2, B:144:0x01e7, B:147:0x01ef, B:149:0x01f7, B:151:0x01fb, B:153:0x0203, B:155:0x020b, B:157:0x020f, B:159:0x0215, B:161:0x021e, B:162:0x0222, B:163:0x0225, B:166:0x022d, B:167:0x0232, B:168:0x0237, B:170:0x023d, B:172:0x0241, B:175:0x024a, B:177:0x0252, B:184:0x0269, B:185:0x026b, B:187:0x0272, B:189:0x0276, B:212:0x02c0, B:193:0x0282, B:195:0x028a, B:197:0x028e, B:199:0x0296, B:201:0x029e, B:203:0x02a2, B:205:0x02a8, B:207:0x02b1, B:208:0x02b5, B:209:0x02b8, B:213:0x02c5, B:217:0x02d5, B:219:0x02dc, B:221:0x02e0, B:244:0x032a, B:225:0x02ec, B:227:0x02f4, B:229:0x02f8, B:231:0x0300, B:233:0x0308, B:235:0x030c, B:237:0x0312, B:239:0x031b, B:240:0x031f, B:241:0x0322, B:246:0x0331, B:248:0x0338, B:253:0x034b, B:254:0x034d, B:34:0x0070, B:36:0x007a, B:37:0x007d, B:39:0x0087, B:42:0x0095, B:46:0x00a1, B:77:0x00fe, B:79:0x0102, B:49:0x00a6, B:51:0x00ae, B:53:0x00b2, B:55:0x00ba, B:57:0x00c2, B:59:0x00c6, B:61:0x00cc, B:63:0x00d5, B:64:0x00d9, B:65:0x00dc, B:68:0x00e4, B:69:0x00e9, B:70:0x00ee, B:72:0x00f4, B:74:0x00f8, B:80:0x0108, B:82:0x0112, B:83:0x0115, B:85:0x0123, B:88:0x0131, B:92:0x013d, B:123:0x019a, B:125:0x019e, B:95:0x0142, B:97:0x014a, B:99:0x014e, B:101:0x0156, B:103:0x015e, B:105:0x0162, B:107:0x0168, B:109:0x0171, B:110:0x0175, B:111:0x0178, B:114:0x0180, B:115:0x0185, B:116:0x018a, B:118:0x0190, B:120:0x0194), top: B:259:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x009d  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a1 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x003c, B:20:0x0041, B:22:0x004d, B:24:0x0054, B:26:0x005c, B:30:0x0066, B:128:0x01a6, B:130:0x01b0, B:131:0x01b3, B:133:0x01c2, B:136:0x01d0, B:140:0x01dc, B:143:0x01e2, B:144:0x01e7, B:147:0x01ef, B:149:0x01f7, B:151:0x01fb, B:153:0x0203, B:155:0x020b, B:157:0x020f, B:159:0x0215, B:161:0x021e, B:162:0x0222, B:163:0x0225, B:166:0x022d, B:167:0x0232, B:168:0x0237, B:170:0x023d, B:172:0x0241, B:175:0x024a, B:177:0x0252, B:184:0x0269, B:185:0x026b, B:187:0x0272, B:189:0x0276, B:212:0x02c0, B:193:0x0282, B:195:0x028a, B:197:0x028e, B:199:0x0296, B:201:0x029e, B:203:0x02a2, B:205:0x02a8, B:207:0x02b1, B:208:0x02b5, B:209:0x02b8, B:213:0x02c5, B:217:0x02d5, B:219:0x02dc, B:221:0x02e0, B:244:0x032a, B:225:0x02ec, B:227:0x02f4, B:229:0x02f8, B:231:0x0300, B:233:0x0308, B:235:0x030c, B:237:0x0312, B:239:0x031b, B:240:0x031f, B:241:0x0322, B:246:0x0331, B:248:0x0338, B:253:0x034b, B:254:0x034d, B:34:0x0070, B:36:0x007a, B:37:0x007d, B:39:0x0087, B:42:0x0095, B:46:0x00a1, B:77:0x00fe, B:79:0x0102, B:49:0x00a6, B:51:0x00ae, B:53:0x00b2, B:55:0x00ba, B:57:0x00c2, B:59:0x00c6, B:61:0x00cc, B:63:0x00d5, B:64:0x00d9, B:65:0x00dc, B:68:0x00e4, B:69:0x00e9, B:70:0x00ee, B:72:0x00f4, B:74:0x00f8, B:80:0x0108, B:82:0x0112, B:83:0x0115, B:85:0x0123, B:88:0x0131, B:92:0x013d, B:123:0x019a, B:125:0x019e, B:95:0x0142, B:97:0x014a, B:99:0x014e, B:101:0x0156, B:103:0x015e, B:105:0x0162, B:107:0x0168, B:109:0x0171, B:110:0x0175, B:111:0x0178, B:114:0x0180, B:115:0x0185, B:116:0x018a, B:118:0x0190, B:120:0x0194), top: B:259:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00a6 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x003c, B:20:0x0041, B:22:0x004d, B:24:0x0054, B:26:0x005c, B:30:0x0066, B:128:0x01a6, B:130:0x01b0, B:131:0x01b3, B:133:0x01c2, B:136:0x01d0, B:140:0x01dc, B:143:0x01e2, B:144:0x01e7, B:147:0x01ef, B:149:0x01f7, B:151:0x01fb, B:153:0x0203, B:155:0x020b, B:157:0x020f, B:159:0x0215, B:161:0x021e, B:162:0x0222, B:163:0x0225, B:166:0x022d, B:167:0x0232, B:168:0x0237, B:170:0x023d, B:172:0x0241, B:175:0x024a, B:177:0x0252, B:184:0x0269, B:185:0x026b, B:187:0x0272, B:189:0x0276, B:212:0x02c0, B:193:0x0282, B:195:0x028a, B:197:0x028e, B:199:0x0296, B:201:0x029e, B:203:0x02a2, B:205:0x02a8, B:207:0x02b1, B:208:0x02b5, B:209:0x02b8, B:213:0x02c5, B:217:0x02d5, B:219:0x02dc, B:221:0x02e0, B:244:0x032a, B:225:0x02ec, B:227:0x02f4, B:229:0x02f8, B:231:0x0300, B:233:0x0308, B:235:0x030c, B:237:0x0312, B:239:0x031b, B:240:0x031f, B:241:0x0322, B:246:0x0331, B:248:0x0338, B:253:0x034b, B:254:0x034d, B:34:0x0070, B:36:0x007a, B:37:0x007d, B:39:0x0087, B:42:0x0095, B:46:0x00a1, B:77:0x00fe, B:79:0x0102, B:49:0x00a6, B:51:0x00ae, B:53:0x00b2, B:55:0x00ba, B:57:0x00c2, B:59:0x00c6, B:61:0x00cc, B:63:0x00d5, B:64:0x00d9, B:65:0x00dc, B:68:0x00e4, B:69:0x00e9, B:70:0x00ee, B:72:0x00f4, B:74:0x00f8, B:80:0x0108, B:82:0x0112, B:83:0x0115, B:85:0x0123, B:88:0x0131, B:92:0x013d, B:123:0x019a, B:125:0x019e, B:95:0x0142, B:97:0x014a, B:99:0x014e, B:101:0x0156, B:103:0x015e, B:105:0x0162, B:107:0x0168, B:109:0x0171, B:110:0x0175, B:111:0x0178, B:114:0x0180, B:115:0x0185, B:116:0x018a, B:118:0x0190, B:120:0x0194), top: B:259:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0102 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x003c, B:20:0x0041, B:22:0x004d, B:24:0x0054, B:26:0x005c, B:30:0x0066, B:128:0x01a6, B:130:0x01b0, B:131:0x01b3, B:133:0x01c2, B:136:0x01d0, B:140:0x01dc, B:143:0x01e2, B:144:0x01e7, B:147:0x01ef, B:149:0x01f7, B:151:0x01fb, B:153:0x0203, B:155:0x020b, B:157:0x020f, B:159:0x0215, B:161:0x021e, B:162:0x0222, B:163:0x0225, B:166:0x022d, B:167:0x0232, B:168:0x0237, B:170:0x023d, B:172:0x0241, B:175:0x024a, B:177:0x0252, B:184:0x0269, B:185:0x026b, B:187:0x0272, B:189:0x0276, B:212:0x02c0, B:193:0x0282, B:195:0x028a, B:197:0x028e, B:199:0x0296, B:201:0x029e, B:203:0x02a2, B:205:0x02a8, B:207:0x02b1, B:208:0x02b5, B:209:0x02b8, B:213:0x02c5, B:217:0x02d5, B:219:0x02dc, B:221:0x02e0, B:244:0x032a, B:225:0x02ec, B:227:0x02f4, B:229:0x02f8, B:231:0x0300, B:233:0x0308, B:235:0x030c, B:237:0x0312, B:239:0x031b, B:240:0x031f, B:241:0x0322, B:246:0x0331, B:248:0x0338, B:253:0x034b, B:254:0x034d, B:34:0x0070, B:36:0x007a, B:37:0x007d, B:39:0x0087, B:42:0x0095, B:46:0x00a1, B:77:0x00fe, B:79:0x0102, B:49:0x00a6, B:51:0x00ae, B:53:0x00b2, B:55:0x00ba, B:57:0x00c2, B:59:0x00c6, B:61:0x00cc, B:63:0x00d5, B:64:0x00d9, B:65:0x00dc, B:68:0x00e4, B:69:0x00e9, B:70:0x00ee, B:72:0x00f4, B:74:0x00f8, B:80:0x0108, B:82:0x0112, B:83:0x0115, B:85:0x0123, B:88:0x0131, B:92:0x013d, B:123:0x019a, B:125:0x019e, B:95:0x0142, B:97:0x014a, B:99:0x014e, B:101:0x0156, B:103:0x015e, B:105:0x0162, B:107:0x0168, B:109:0x0171, B:110:0x0175, B:111:0x0178, B:114:0x0180, B:115:0x0185, B:116:0x018a, B:118:0x0190, B:120:0x0194), top: B:259:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x0108 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x003c, B:20:0x0041, B:22:0x004d, B:24:0x0054, B:26:0x005c, B:30:0x0066, B:128:0x01a6, B:130:0x01b0, B:131:0x01b3, B:133:0x01c2, B:136:0x01d0, B:140:0x01dc, B:143:0x01e2, B:144:0x01e7, B:147:0x01ef, B:149:0x01f7, B:151:0x01fb, B:153:0x0203, B:155:0x020b, B:157:0x020f, B:159:0x0215, B:161:0x021e, B:162:0x0222, B:163:0x0225, B:166:0x022d, B:167:0x0232, B:168:0x0237, B:170:0x023d, B:172:0x0241, B:175:0x024a, B:177:0x0252, B:184:0x0269, B:185:0x026b, B:187:0x0272, B:189:0x0276, B:212:0x02c0, B:193:0x0282, B:195:0x028a, B:197:0x028e, B:199:0x0296, B:201:0x029e, B:203:0x02a2, B:205:0x02a8, B:207:0x02b1, B:208:0x02b5, B:209:0x02b8, B:213:0x02c5, B:217:0x02d5, B:219:0x02dc, B:221:0x02e0, B:244:0x032a, B:225:0x02ec, B:227:0x02f4, B:229:0x02f8, B:231:0x0300, B:233:0x0308, B:235:0x030c, B:237:0x0312, B:239:0x031b, B:240:0x031f, B:241:0x0322, B:246:0x0331, B:248:0x0338, B:253:0x034b, B:254:0x034d, B:34:0x0070, B:36:0x007a, B:37:0x007d, B:39:0x0087, B:42:0x0095, B:46:0x00a1, B:77:0x00fe, B:79:0x0102, B:49:0x00a6, B:51:0x00ae, B:53:0x00b2, B:55:0x00ba, B:57:0x00c2, B:59:0x00c6, B:61:0x00cc, B:63:0x00d5, B:64:0x00d9, B:65:0x00dc, B:68:0x00e4, B:69:0x00e9, B:70:0x00ee, B:72:0x00f4, B:74:0x00f8, B:80:0x0108, B:82:0x0112, B:83:0x0115, B:85:0x0123, B:88:0x0131, B:92:0x013d, B:123:0x019a, B:125:0x019e, B:95:0x0142, B:97:0x014a, B:99:0x014e, B:101:0x0156, B:103:0x015e, B:105:0x0162, B:107:0x0168, B:109:0x0171, B:110:0x0175, B:111:0x0178, B:114:0x0180, B:115:0x0185, B:116:0x018a, B:118:0x0190, B:120:0x0194), top: B:259:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x0112 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x003c, B:20:0x0041, B:22:0x004d, B:24:0x0054, B:26:0x005c, B:30:0x0066, B:128:0x01a6, B:130:0x01b0, B:131:0x01b3, B:133:0x01c2, B:136:0x01d0, B:140:0x01dc, B:143:0x01e2, B:144:0x01e7, B:147:0x01ef, B:149:0x01f7, B:151:0x01fb, B:153:0x0203, B:155:0x020b, B:157:0x020f, B:159:0x0215, B:161:0x021e, B:162:0x0222, B:163:0x0225, B:166:0x022d, B:167:0x0232, B:168:0x0237, B:170:0x023d, B:172:0x0241, B:175:0x024a, B:177:0x0252, B:184:0x0269, B:185:0x026b, B:187:0x0272, B:189:0x0276, B:212:0x02c0, B:193:0x0282, B:195:0x028a, B:197:0x028e, B:199:0x0296, B:201:0x029e, B:203:0x02a2, B:205:0x02a8, B:207:0x02b1, B:208:0x02b5, B:209:0x02b8, B:213:0x02c5, B:217:0x02d5, B:219:0x02dc, B:221:0x02e0, B:244:0x032a, B:225:0x02ec, B:227:0x02f4, B:229:0x02f8, B:231:0x0300, B:233:0x0308, B:235:0x030c, B:237:0x0312, B:239:0x031b, B:240:0x031f, B:241:0x0322, B:246:0x0331, B:248:0x0338, B:253:0x034b, B:254:0x034d, B:34:0x0070, B:36:0x007a, B:37:0x007d, B:39:0x0087, B:42:0x0095, B:46:0x00a1, B:77:0x00fe, B:79:0x0102, B:49:0x00a6, B:51:0x00ae, B:53:0x00b2, B:55:0x00ba, B:57:0x00c2, B:59:0x00c6, B:61:0x00cc, B:63:0x00d5, B:64:0x00d9, B:65:0x00dc, B:68:0x00e4, B:69:0x00e9, B:70:0x00ee, B:72:0x00f4, B:74:0x00f8, B:80:0x0108, B:82:0x0112, B:83:0x0115, B:85:0x0123, B:88:0x0131, B:92:0x013d, B:123:0x019a, B:125:0x019e, B:95:0x0142, B:97:0x014a, B:99:0x014e, B:101:0x0156, B:103:0x015e, B:105:0x0162, B:107:0x0168, B:109:0x0171, B:110:0x0175, B:111:0x0178, B:114:0x0180, B:115:0x0185, B:116:0x018a, B:118:0x0190, B:120:0x0194), top: B:259:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x0123 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x003c, B:20:0x0041, B:22:0x004d, B:24:0x0054, B:26:0x005c, B:30:0x0066, B:128:0x01a6, B:130:0x01b0, B:131:0x01b3, B:133:0x01c2, B:136:0x01d0, B:140:0x01dc, B:143:0x01e2, B:144:0x01e7, B:147:0x01ef, B:149:0x01f7, B:151:0x01fb, B:153:0x0203, B:155:0x020b, B:157:0x020f, B:159:0x0215, B:161:0x021e, B:162:0x0222, B:163:0x0225, B:166:0x022d, B:167:0x0232, B:168:0x0237, B:170:0x023d, B:172:0x0241, B:175:0x024a, B:177:0x0252, B:184:0x0269, B:185:0x026b, B:187:0x0272, B:189:0x0276, B:212:0x02c0, B:193:0x0282, B:195:0x028a, B:197:0x028e, B:199:0x0296, B:201:0x029e, B:203:0x02a2, B:205:0x02a8, B:207:0x02b1, B:208:0x02b5, B:209:0x02b8, B:213:0x02c5, B:217:0x02d5, B:219:0x02dc, B:221:0x02e0, B:244:0x032a, B:225:0x02ec, B:227:0x02f4, B:229:0x02f8, B:231:0x0300, B:233:0x0308, B:235:0x030c, B:237:0x0312, B:239:0x031b, B:240:0x031f, B:241:0x0322, B:246:0x0331, B:248:0x0338, B:253:0x034b, B:254:0x034d, B:34:0x0070, B:36:0x007a, B:37:0x007d, B:39:0x0087, B:42:0x0095, B:46:0x00a1, B:77:0x00fe, B:79:0x0102, B:49:0x00a6, B:51:0x00ae, B:53:0x00b2, B:55:0x00ba, B:57:0x00c2, B:59:0x00c6, B:61:0x00cc, B:63:0x00d5, B:64:0x00d9, B:65:0x00dc, B:68:0x00e4, B:69:0x00e9, B:70:0x00ee, B:72:0x00f4, B:74:0x00f8, B:80:0x0108, B:82:0x0112, B:83:0x0115, B:85:0x0123, B:88:0x0131, B:92:0x013d, B:123:0x019a, B:125:0x019e, B:95:0x0142, B:97:0x014a, B:99:0x014e, B:101:0x0156, B:103:0x015e, B:105:0x0162, B:107:0x0168, B:109:0x0171, B:110:0x0175, B:111:0x0178, B:114:0x0180, B:115:0x0185, B:116:0x018a, B:118:0x0190, B:120:0x0194), top: B:259:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x012f A[ADDED_TO_REGION, LOOP:16: B:87:0x012f->B:115:0x0185, LOOP_START, PHI: r1
      0x012f: PHI (r1v14 h4.r$c) = (r1v9 h4.r$c), (r1v15 h4.r$c) binds: [B:86:0x012d, B:115:0x0185] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:88:0x0131 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x003c, B:20:0x0041, B:22:0x004d, B:24:0x0054, B:26:0x005c, B:30:0x0066, B:128:0x01a6, B:130:0x01b0, B:131:0x01b3, B:133:0x01c2, B:136:0x01d0, B:140:0x01dc, B:143:0x01e2, B:144:0x01e7, B:147:0x01ef, B:149:0x01f7, B:151:0x01fb, B:153:0x0203, B:155:0x020b, B:157:0x020f, B:159:0x0215, B:161:0x021e, B:162:0x0222, B:163:0x0225, B:166:0x022d, B:167:0x0232, B:168:0x0237, B:170:0x023d, B:172:0x0241, B:175:0x024a, B:177:0x0252, B:184:0x0269, B:185:0x026b, B:187:0x0272, B:189:0x0276, B:212:0x02c0, B:193:0x0282, B:195:0x028a, B:197:0x028e, B:199:0x0296, B:201:0x029e, B:203:0x02a2, B:205:0x02a8, B:207:0x02b1, B:208:0x02b5, B:209:0x02b8, B:213:0x02c5, B:217:0x02d5, B:219:0x02dc, B:221:0x02e0, B:244:0x032a, B:225:0x02ec, B:227:0x02f4, B:229:0x02f8, B:231:0x0300, B:233:0x0308, B:235:0x030c, B:237:0x0312, B:239:0x031b, B:240:0x031f, B:241:0x0322, B:246:0x0331, B:248:0x0338, B:253:0x034b, B:254:0x034d, B:34:0x0070, B:36:0x007a, B:37:0x007d, B:39:0x0087, B:42:0x0095, B:46:0x00a1, B:77:0x00fe, B:79:0x0102, B:49:0x00a6, B:51:0x00ae, B:53:0x00b2, B:55:0x00ba, B:57:0x00c2, B:59:0x00c6, B:61:0x00cc, B:63:0x00d5, B:64:0x00d9, B:65:0x00dc, B:68:0x00e4, B:69:0x00e9, B:70:0x00ee, B:72:0x00f4, B:74:0x00f8, B:80:0x0108, B:82:0x0112, B:83:0x0115, B:85:0x0123, B:88:0x0131, B:92:0x013d, B:123:0x019a, B:125:0x019e, B:95:0x0142, B:97:0x014a, B:99:0x014e, B:101:0x0156, B:103:0x015e, B:105:0x0162, B:107:0x0168, B:109:0x0171, B:110:0x0175, B:111:0x0178, B:114:0x0180, B:115:0x0185, B:116:0x018a, B:118:0x0190, B:120:0x0194), top: B:259:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x0139  */
    /* JADX WARN: Code duplicated, block: B:92:0x013d A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x003c, B:20:0x0041, B:22:0x004d, B:24:0x0054, B:26:0x005c, B:30:0x0066, B:128:0x01a6, B:130:0x01b0, B:131:0x01b3, B:133:0x01c2, B:136:0x01d0, B:140:0x01dc, B:143:0x01e2, B:144:0x01e7, B:147:0x01ef, B:149:0x01f7, B:151:0x01fb, B:153:0x0203, B:155:0x020b, B:157:0x020f, B:159:0x0215, B:161:0x021e, B:162:0x0222, B:163:0x0225, B:166:0x022d, B:167:0x0232, B:168:0x0237, B:170:0x023d, B:172:0x0241, B:175:0x024a, B:177:0x0252, B:184:0x0269, B:185:0x026b, B:187:0x0272, B:189:0x0276, B:212:0x02c0, B:193:0x0282, B:195:0x028a, B:197:0x028e, B:199:0x0296, B:201:0x029e, B:203:0x02a2, B:205:0x02a8, B:207:0x02b1, B:208:0x02b5, B:209:0x02b8, B:213:0x02c5, B:217:0x02d5, B:219:0x02dc, B:221:0x02e0, B:244:0x032a, B:225:0x02ec, B:227:0x02f4, B:229:0x02f8, B:231:0x0300, B:233:0x0308, B:235:0x030c, B:237:0x0312, B:239:0x031b, B:240:0x031f, B:241:0x0322, B:246:0x0331, B:248:0x0338, B:253:0x034b, B:254:0x034d, B:34:0x0070, B:36:0x007a, B:37:0x007d, B:39:0x0087, B:42:0x0095, B:46:0x00a1, B:77:0x00fe, B:79:0x0102, B:49:0x00a6, B:51:0x00ae, B:53:0x00b2, B:55:0x00ba, B:57:0x00c2, B:59:0x00c6, B:61:0x00cc, B:63:0x00d5, B:64:0x00d9, B:65:0x00dc, B:68:0x00e4, B:69:0x00e9, B:70:0x00ee, B:72:0x00f4, B:74:0x00f8, B:80:0x0108, B:82:0x0112, B:83:0x0115, B:85:0x0123, B:88:0x0131, B:92:0x013d, B:123:0x019a, B:125:0x019e, B:95:0x0142, B:97:0x014a, B:99:0x014e, B:101:0x0156, B:103:0x015e, B:105:0x0162, B:107:0x0168, B:109:0x0171, B:110:0x0175, B:111:0x0178, B:114:0x0180, B:115:0x0185, B:116:0x018a, B:118:0x0190, B:120:0x0194), top: B:259:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x0142 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x003c, B:20:0x0041, B:22:0x004d, B:24:0x0054, B:26:0x005c, B:30:0x0066, B:128:0x01a6, B:130:0x01b0, B:131:0x01b3, B:133:0x01c2, B:136:0x01d0, B:140:0x01dc, B:143:0x01e2, B:144:0x01e7, B:147:0x01ef, B:149:0x01f7, B:151:0x01fb, B:153:0x0203, B:155:0x020b, B:157:0x020f, B:159:0x0215, B:161:0x021e, B:162:0x0222, B:163:0x0225, B:166:0x022d, B:167:0x0232, B:168:0x0237, B:170:0x023d, B:172:0x0241, B:175:0x024a, B:177:0x0252, B:184:0x0269, B:185:0x026b, B:187:0x0272, B:189:0x0276, B:212:0x02c0, B:193:0x0282, B:195:0x028a, B:197:0x028e, B:199:0x0296, B:201:0x029e, B:203:0x02a2, B:205:0x02a8, B:207:0x02b1, B:208:0x02b5, B:209:0x02b8, B:213:0x02c5, B:217:0x02d5, B:219:0x02dc, B:221:0x02e0, B:244:0x032a, B:225:0x02ec, B:227:0x02f4, B:229:0x02f8, B:231:0x0300, B:233:0x0308, B:235:0x030c, B:237:0x0312, B:239:0x031b, B:240:0x031f, B:241:0x0322, B:246:0x0331, B:248:0x0338, B:253:0x034b, B:254:0x034d, B:34:0x0070, B:36:0x007a, B:37:0x007d, B:39:0x0087, B:42:0x0095, B:46:0x00a1, B:77:0x00fe, B:79:0x0102, B:49:0x00a6, B:51:0x00ae, B:53:0x00b2, B:55:0x00ba, B:57:0x00c2, B:59:0x00c6, B:61:0x00cc, B:63:0x00d5, B:64:0x00d9, B:65:0x00dc, B:68:0x00e4, B:69:0x00e9, B:70:0x00ee, B:72:0x00f4, B:74:0x00f8, B:80:0x0108, B:82:0x0112, B:83:0x0115, B:85:0x0123, B:88:0x0131, B:92:0x013d, B:123:0x019a, B:125:0x019e, B:95:0x0142, B:97:0x014a, B:99:0x014e, B:101:0x0156, B:103:0x015e, B:105:0x0162, B:107:0x0168, B:109:0x0171, B:110:0x0175, B:111:0x0178, B:114:0x0180, B:115:0x0185, B:116:0x018a, B:118:0x0190, B:120:0x0194), top: B:259:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x014a A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x003c, B:20:0x0041, B:22:0x004d, B:24:0x0054, B:26:0x005c, B:30:0x0066, B:128:0x01a6, B:130:0x01b0, B:131:0x01b3, B:133:0x01c2, B:136:0x01d0, B:140:0x01dc, B:143:0x01e2, B:144:0x01e7, B:147:0x01ef, B:149:0x01f7, B:151:0x01fb, B:153:0x0203, B:155:0x020b, B:157:0x020f, B:159:0x0215, B:161:0x021e, B:162:0x0222, B:163:0x0225, B:166:0x022d, B:167:0x0232, B:168:0x0237, B:170:0x023d, B:172:0x0241, B:175:0x024a, B:177:0x0252, B:184:0x0269, B:185:0x026b, B:187:0x0272, B:189:0x0276, B:212:0x02c0, B:193:0x0282, B:195:0x028a, B:197:0x028e, B:199:0x0296, B:201:0x029e, B:203:0x02a2, B:205:0x02a8, B:207:0x02b1, B:208:0x02b5, B:209:0x02b8, B:213:0x02c5, B:217:0x02d5, B:219:0x02dc, B:221:0x02e0, B:244:0x032a, B:225:0x02ec, B:227:0x02f4, B:229:0x02f8, B:231:0x0300, B:233:0x0308, B:235:0x030c, B:237:0x0312, B:239:0x031b, B:240:0x031f, B:241:0x0322, B:246:0x0331, B:248:0x0338, B:253:0x034b, B:254:0x034d, B:34:0x0070, B:36:0x007a, B:37:0x007d, B:39:0x0087, B:42:0x0095, B:46:0x00a1, B:77:0x00fe, B:79:0x0102, B:49:0x00a6, B:51:0x00ae, B:53:0x00b2, B:55:0x00ba, B:57:0x00c2, B:59:0x00c6, B:61:0x00cc, B:63:0x00d5, B:64:0x00d9, B:65:0x00dc, B:68:0x00e4, B:69:0x00e9, B:70:0x00ee, B:72:0x00f4, B:74:0x00f8, B:80:0x0108, B:82:0x0112, B:83:0x0115, B:85:0x0123, B:88:0x0131, B:92:0x013d, B:123:0x019a, B:125:0x019e, B:95:0x0142, B:97:0x014a, B:99:0x014e, B:101:0x0156, B:103:0x015e, B:105:0x0162, B:107:0x0168, B:109:0x0171, B:110:0x0175, B:111:0x0178, B:114:0x0180, B:115:0x0185, B:116:0x018a, B:118:0x0190, B:120:0x0194), top: B:259:0x0007 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [h4.r$c] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v16, types: [q3.c] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20, types: [q3.c] */
    /* JADX WARN: Type inference failed for: r0v24, types: [h4.r$c] */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r0v9, types: [h4.r$c] */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v4, types: [h4.r$c] */
    /* JADX WARN: Type inference failed for: r15v5, types: [h4.r$c] */
    /* JADX WARN: Type inference failed for: r15v9, types: [h4.r$c] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v35, types: [q3.c] */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39, types: [q3.c] */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v46 */
    /* JADX WARN: Type inference failed for: r7v37 */
    @Override // m4.u
    public final boolean n(KeyEvent keyEvent, e23.a<Boolean> aVar) {
        h4.r.c parent;
        h5.e0 e0VarG;
        Object obj;
        z4.g gVar;
        h4.r.c node;
        a1 a1Var;
        h4.r.c cVarB;
        q3.c cVar;
        h4.r.c node2;
        h5.e0 e0VarG2;
        Object obj2;
        z4.g gVar2;
        a1 a1Var2;
        q3.c cVar2;
        h4.r.c cVarB2;
        a1 a1Var3;
        boolean z14;
        j0 j0Var = this.f116528c;
        Trace.beginSection("FocusOwnerImpl:dispatchKeyEvent");
        try {
            if (this.f116529d.f116510e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching key event while focus system is invalidated.");
                Trace.endSection();
                return false;
            }
            if (!A(keyEvent)) {
                Trace.endSection();
                return false;
            }
            j0 j0VarA = m0.a(j0Var);
            if (j0VarA != null) {
                if (!j0VarA.getNode().getIsAttached()) {
                    e5.a.b("visitLocalDescendants called on an unattached node");
                }
                h4.r.c node3 = j0VarA.getNode();
                if ((node3.getAggregateChildKindSet() & 9216) != 0) {
                    node = null;
                    for (h4.r.c child = node3.getChild(); child != null; child = child.getChild()) {
                        if ((child.getKindSet() & 9216) != 0) {
                            if ((child.getKindSet() & 1024) != 0) {
                                break;
                            }
                            node = child;
                        }
                    }
                } else {
                    node = null;
                }
                if (node == null) {
                    if (j0VarA == null) {
                        if (!j0Var.getNode().getIsAttached()) {
                            e5.a.b("visitAncestors called on an unattached node");
                        }
                        parent = j0Var.getNode().getParent();
                        e0VarG = h5.k.g(j0Var);
                        loop15: while (true) {
                            if (e0VarG != null) {
                                obj = null;
                                break;
                            }
                            if ((e0VarG.P.f81685f.getAggregateChildKindSet() & 8192) != 0) {
                                while (parent != null) {
                                    if ((parent.getKindSet() & 8192) != 0) {
                                        cVarB = parent;
                                        cVar = null;
                                        while (cVarB != null) {
                                            if (cVarB instanceof z4.g) {
                                                obj = cVarB;
                                                break loop15;
                                            }
                                            if ((cVarB.getKindSet() & 8192) == 0) {
                                            }
                                            cVarB = h5.k.b(cVar);
                                        }
                                    }
                                    parent = parent.getParent();
                                }
                            }
                            e0VarG = e0VarG.K();
                            if (e0VarG != null) {
                            }
                        }
                        gVar = (z4.g) obj;
                        if (gVar != null) {
                            node = gVar.getNode();
                        } else {
                            node = null;
                        }
                    } else {
                        if (!j0VarA.getNode().getIsAttached()) {
                            e5.a.b("visitAncestors called on an unattached node");
                        }
                        node2 = j0VarA.getNode();
                        e0VarG2 = h5.k.g(j0VarA);
                        loop11: while (true) {
                            if (e0VarG2 != null) {
                                obj2 = null;
                                break;
                            }
                            if ((e0VarG2.P.f81685f.getAggregateChildKindSet() & 8192) != 0) {
                                while (node2 != null) {
                                    if ((node2.getKindSet() & 8192) != 0) {
                                        cVar2 = null;
                                        cVarB2 = node2;
                                        while (cVarB2 != null) {
                                            if (cVarB2 instanceof z4.g) {
                                                obj2 = cVarB2;
                                                break loop11;
                                            }
                                            if ((cVarB2.getKindSet() & 8192) == 0) {
                                            }
                                            cVarB2 = h5.k.b(cVar2);
                                        }
                                    }
                                    node2 = node2.getParent();
                                }
                            }
                            e0VarG2 = e0VarG2.K();
                            if (e0VarG2 != null) {
                            }
                        }
                        gVar2 = (z4.g) obj2;
                        if (gVar2 != null) {
                            node = gVar2.getNode();
                        } else {
                            if (!j0Var.getNode().getIsAttached()) {
                                e5.a.b("visitAncestors called on an unattached node");
                            }
                            parent = j0Var.getNode().getParent();
                            e0VarG = h5.k.g(j0Var);
                            loop15: while (true) {
                                if (e0VarG != null) {
                                    obj = null;
                                    break;
                                }
                                if ((e0VarG.P.f81685f.getAggregateChildKindSet() & 8192) != 0) {
                                    while (parent != null) {
                                        if ((parent.getKindSet() & 8192) != 0) {
                                            cVarB = parent;
                                            cVar = null;
                                            while (cVarB != null) {
                                                if (cVarB instanceof z4.g) {
                                                    obj = cVarB;
                                                    break loop15;
                                                }
                                                if ((cVarB.getKindSet() & 8192) == 0) {
                                                }
                                                cVarB = h5.k.b(cVar);
                                            }
                                        }
                                        parent = parent.getParent();
                                    }
                                }
                                e0VarG = e0VarG.K();
                                if (e0VarG != null) {
                                }
                            }
                            gVar = (z4.g) obj;
                            if (gVar != null) {
                                node = gVar.getNode();
                            } else {
                                node = null;
                            }
                        }
                    }
                }
            } else if (j0VarA == null) {
                if (!j0Var.getNode().getIsAttached()) {
                    e5.a.b("visitAncestors called on an unattached node");
                }
                parent = j0Var.getNode().getParent();
                e0VarG = h5.k.g(j0Var);
                loop15: while (true) {
                    if (e0VarG != null) {
                        obj = null;
                        break;
                    }
                    if ((e0VarG.P.f81685f.getAggregateChildKindSet() & 8192) != 0) {
                        while (parent != null) {
                            if ((parent.getKindSet() & 8192) != 0) {
                                cVarB = parent;
                                cVar = null;
                                while (cVarB != null) {
                                    if (cVarB instanceof z4.g) {
                                        obj = cVarB;
                                        break loop15;
                                    }
                                    if ((cVarB.getKindSet() & 8192) == 0 && (cVarB instanceof h5.m)) {
                                        h4.r.c child2 = ((h5.m) cVarB).f81888b;
                                        int i14 = 0;
                                        while (child2 != null) {
                                            if ((child2.getKindSet() & 8192) != 0) {
                                                i14++;
                                                if (i14 == 1) {
                                                    cVarB = cVarB;
                                                    cVar = cVar;
                                                    cVar = cVar;
                                                    Unit unit = Unit.INSTANCE;
                                                    cVarB = child2;
                                                } else {
                                                    if (cVar == null) {
                                                        cVar = new q3.c(new h4.r.c[16], 0);
                                                    }
                                                    if (cVarB != null) {
                                                        cVar.b(cVarB);
                                                        cVarB = null;
                                                    }
                                                    cVar.b(child2);
                                                }
                                            } else {
                                                cVarB = cVarB;
                                                cVar = cVar;
                                            }
                                            child2 = child2.getChild();
                                            cVarB = cVarB;
                                            cVar = cVar;
                                        }
                                        if (i14 == 1) {
                                            cVarB = cVarB;
                                            cVar = cVar;
                                        } else {
                                            cVarB = cVarB;
                                            cVar = cVar;
                                        }
                                    }
                                    cVarB = h5.k.b(cVar);
                                }
                            }
                            parent = parent.getParent();
                        }
                    }
                    e0VarG = e0VarG.K();
                    parent = (e0VarG != null || (a1Var = e0VarG.P) == null) ? null : a1Var.f81684e;
                }
                gVar = (z4.g) obj;
                if (gVar != null) {
                    node = gVar.getNode();
                } else {
                    node = null;
                }
            } else {
                if (!j0VarA.getNode().getIsAttached()) {
                    e5.a.b("visitAncestors called on an unattached node");
                }
                node2 = j0VarA.getNode();
                e0VarG2 = h5.k.g(j0VarA);
                loop11: while (true) {
                    if (e0VarG2 != null) {
                        obj2 = null;
                        break;
                    }
                    if ((e0VarG2.P.f81685f.getAggregateChildKindSet() & 8192) != 0) {
                        while (node2 != null) {
                            if ((node2.getKindSet() & 8192) != 0) {
                                cVar2 = null;
                                cVarB2 = node2;
                                while (cVarB2 != null) {
                                    if (cVarB2 instanceof z4.g) {
                                        obj2 = cVarB2;
                                        break loop11;
                                    }
                                    if ((cVarB2.getKindSet() & 8192) == 0 && (cVarB2 instanceof h5.m)) {
                                        h4.r.c child3 = ((h5.m) cVarB2).f81888b;
                                        int i15 = 0;
                                        while (child3 != null) {
                                            if ((child3.getKindSet() & 8192) != 0) {
                                                i15++;
                                                if (i15 == 1) {
                                                    cVarB2 = cVarB2;
                                                    cVar2 = cVar2;
                                                    cVar2 = cVar2;
                                                    Unit unit2 = Unit.INSTANCE;
                                                    cVarB2 = child3;
                                                } else {
                                                    if (cVar2 == null) {
                                                        cVar2 = new q3.c(new h4.r.c[16], 0);
                                                    }
                                                    if (cVarB2 != null) {
                                                        cVar2.b(cVarB2);
                                                        cVarB2 = null;
                                                    }
                                                    cVar2.b(child3);
                                                }
                                            } else {
                                                cVarB2 = cVarB2;
                                                cVar2 = cVar2;
                                            }
                                            child3 = child3.getChild();
                                            cVarB2 = cVarB2;
                                            cVar2 = cVar2;
                                        }
                                        if (i15 == 1) {
                                            cVarB2 = cVarB2;
                                            cVar2 = cVar2;
                                        } else {
                                            cVarB2 = cVarB2;
                                            cVar2 = cVar2;
                                        }
                                    }
                                    cVarB2 = h5.k.b(cVar2);
                                }
                            }
                            node2 = node2.getParent();
                        }
                    }
                    e0VarG2 = e0VarG2.K();
                    node2 = (e0VarG2 != null || (a1Var2 = e0VarG2.P) == null) ? null : a1Var2.f81684e;
                }
                gVar2 = (z4.g) obj2;
                if (gVar2 != null) {
                    node = gVar2.getNode();
                } else {
                    if (!j0Var.getNode().getIsAttached()) {
                        e5.a.b("visitAncestors called on an unattached node");
                    }
                    parent = j0Var.getNode().getParent();
                    e0VarG = h5.k.g(j0Var);
                    loop15: while (true) {
                        if (e0VarG != null) {
                            obj = null;
                            break;
                        }
                        if ((e0VarG.P.f81685f.getAggregateChildKindSet() & 8192) != 0) {
                            while (parent != null) {
                                if ((parent.getKindSet() & 8192) != 0) {
                                    cVarB = parent;
                                    cVar = null;
                                    while (cVarB != null) {
                                        if (cVarB instanceof z4.g) {
                                            obj = cVarB;
                                            break loop15;
                                        }
                                        if ((cVarB.getKindSet() & 8192) == 0) {
                                        }
                                        cVarB = h5.k.b(cVar);
                                    }
                                }
                                parent = parent.getParent();
                            }
                        }
                        e0VarG = e0VarG.K();
                        if (e0VarG != null) {
                        }
                    }
                    gVar = (z4.g) obj;
                    if (gVar != null) {
                        node = gVar.getNode();
                    } else {
                        node = null;
                    }
                }
            }
            if (node != null) {
                if (!node.getNode().getIsAttached()) {
                    e5.a.b("visitAncestors called on an unattached node");
                }
                h4.r.c parent2 = node.getNode().getParent();
                h5.e0 e0VarG3 = h5.k.g(node);
                ArrayList arrayList = null;
                while (e0VarG3 != null) {
                    if ((e0VarG3.P.f81685f.getAggregateChildKindSet() & 8192) != 0) {
                        while (parent2 != null) {
                            if ((parent2.getKindSet() & 8192) != 0) {
                                h4.r.c cVarB3 = parent2;
                                q3.c cVar3 = null;
                                while (cVarB3 != null) {
                                    if (cVarB3 instanceof z4.g) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        arrayList.add(cVarB3);
                                        z14 = false;
                                    } else {
                                        z14 = true;
                                    }
                                    if (z14 && (cVarB3.getKindSet() & 8192) != 0 && (cVarB3 instanceof h5.m)) {
                                        int i16 = 0;
                                        for (h4.r.c child4 = ((h5.m) cVarB3).f81888b; child4 != null; child4 = child4.getChild()) {
                                            if ((child4.getKindSet() & 8192) != 0) {
                                                i16++;
                                                if (i16 == 1) {
                                                    Unit unit3 = Unit.INSTANCE;
                                                    cVarB3 = child4;
                                                } else {
                                                    if (cVar3 == null) {
                                                        cVar3 = new q3.c(new h4.r.c[16], 0);
                                                    }
                                                    if (cVarB3 != null) {
                                                        cVar3.b(cVarB3);
                                                        cVarB3 = null;
                                                    }
                                                    cVar3.b(child4);
                                                }
                                            }
                                        }
                                        if (i16 == 1) {
                                        }
                                    }
                                    cVarB3 = h5.k.b(cVar3);
                                }
                            }
                            parent2 = parent2.getParent();
                        }
                    }
                    e0VarG3 = e0VarG3.K();
                    parent2 = (e0VarG3 == null || (a1Var3 = e0VarG3.P) == null) ? null : a1Var3.f81684e;
                }
                if (arrayList != null) {
                    int size = arrayList.size() - 1;
                    if (size >= 0) {
                        while (true) {
                            int i17 = size - 1;
                            if (((z4.g) arrayList.get(size)).J(keyEvent)) {
                                Trace.endSection();
                                return true;
                            }
                            if (i17 < 0) {
                                break;
                            }
                            size = i17;
                        }
                    }
                    Unit unit4 = Unit.INSTANCE;
                }
                ?? node4 = node.getNode();
                ?? cVar4 = 0;
                while (node4 != 0) {
                    if (node4 instanceof z4.g) {
                        if (((z4.g) node4).J(keyEvent)) {
                            Trace.endSection();
                            return true;
                        }
                    } else if ((node4.getKindSet() & 8192) != 0 && (node4 instanceof h5.m)) {
                        h4.r.c child5 = ((h5.m) node4).f81888b;
                        int i18 = 0;
                        while (child5 != null) {
                            if ((child5.getKindSet() & 8192) != 0) {
                                i18++;
                                if (i18 == 1) {
                                    node4 = node4;
                                    cVar4 = cVar4;
                                    cVar4 = cVar4;
                                    Unit unit5 = Unit.INSTANCE;
                                    node4 = child5;
                                } else {
                                    if (cVar4 == 0) {
                                        cVar4 = new q3.c(new h4.r.c[16], 0);
                                    }
                                    if (node4 != 0) {
                                        cVar4.b(node4);
                                        node4 = 0;
                                    }
                                    cVar4.b(child5);
                                }
                            } else {
                                node4 = node4;
                                cVar4 = cVar4;
                            }
                            child5 = child5.getChild();
                            node4 = node4;
                            cVar4 = cVar4;
                        }
                        if (i18 == 1) {
                            node4 = node4;
                            cVar4 = cVar4;
                        } else {
                            node4 = node4;
                            cVar4 = cVar4;
                        }
                    }
                    node4 = h5.k.b(cVar4);
                }
                if (aVar.invoke().booleanValue()) {
                    Trace.endSection();
                    return true;
                }
                ?? node5 = node.getNode();
                ?? cVar5 = 0;
                while (node5 != 0) {
                    if (node5 instanceof z4.g) {
                        if (((z4.g) node5).M1(keyEvent)) {
                            Trace.endSection();
                            return true;
                        }
                    } else if ((node5.getKindSet() & 8192) != 0 && (node5 instanceof h5.m)) {
                        h4.r.c child6 = ((h5.m) node5).f81888b;
                        int i19 = 0;
                        while (child6 != null) {
                            if ((child6.getKindSet() & 8192) != 0) {
                                i19++;
                                if (i19 == 1) {
                                    cVar5 = cVar5;
                                    node5 = node5;
                                    cVar5 = cVar5;
                                    Unit unit6 = Unit.INSTANCE;
                                    node5 = child6;
                                } else {
                                    if (cVar5 == 0) {
                                        cVar5 = new q3.c(new h4.r.c[16], 0);
                                    }
                                    if (node5 != 0) {
                                        cVar5.b(node5);
                                        node5 = 0;
                                    }
                                    cVar5.b(child6);
                                }
                            } else {
                                cVar5 = cVar5;
                                node5 = node5;
                            }
                            child6 = child6.getChild();
                            cVar5 = cVar5;
                            node5 = node5;
                        }
                        if (i19 == 1) {
                            cVar5 = cVar5;
                            node5 = node5;
                        } else {
                            cVar5 = cVar5;
                            node5 = node5;
                        }
                    }
                    node5 = h5.k.b(cVar5);
                }
                if (arrayList != null) {
                    int size2 = arrayList.size();
                    for (int i24 = 0; i24 < size2; i24++) {
                        if (((z4.g) arrayList.get(i24)).M1(keyEvent)) {
                            Trace.endSection();
                            return true;
                        }
                    }
                    Unit unit7 = Unit.INSTANCE;
                }
                Unit unit8 = Unit.INSTANCE;
            }
            Trace.endSection();
            return false;
        } catch (Throwable th3) {
            Trace.endSection();
            throw th3;
        }
    }

    @Override // m4.u
    public final boolean o(int i14, boolean z14, boolean z15) {
        boolean z16 = true;
        if (z14) {
            z(z14);
        } else {
            int i15 = a.f116534a[k0.b(this.f116528c, i14).ordinal()];
            if (i15 == 1 || i15 == 2 || i15 == 3) {
                z16 = false;
            } else {
                if (i15 != 4) {
                    u0.r();
                    return false;
                }
                z(z14);
            }
        }
        if (z16 && z15) {
            b();
        }
        return z16;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10, types: [h4.r$c] */
    /* JADX WARN: Type inference failed for: r13v11, types: [h4.r$c] */
    /* JADX WARN: Type inference failed for: r13v15, types: [h4.r$c] */
    /* JADX WARN: Type inference failed for: r13v16, types: [h4.r$c] */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v22, types: [h4.r$c] */
    /* JADX WARN: Type inference failed for: r13v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r13v30 */
    /* JADX WARN: Type inference failed for: r13v31, types: [h4.r$c] */
    /* JADX WARN: Type inference failed for: r13v32, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v33 */
    /* JADX WARN: Type inference failed for: r13v34 */
    /* JADX WARN: Type inference failed for: r13v35 */
    /* JADX WARN: Type inference failed for: r13v37 */
    /* JADX WARN: Type inference failed for: r13v54 */
    /* JADX WARN: Type inference failed for: r13v55 */
    /* JADX WARN: Type inference failed for: r13v56 */
    /* JADX WARN: Type inference failed for: r13v57 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10, types: [q3.c] */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [q3.c] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17, types: [q3.c] */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20, types: [q3.c] */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16, types: [h4.r$c] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18, types: [h4.r$c] */
    /* JADX WARN: Type inference failed for: r6v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31, types: [q3.c] */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v34, types: [q3.c] */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r7v39 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r8v16 */
    @Override // m4.u
    public final boolean p(d5.b bVar, kotlin.o oVar) {
        d5.a aVar;
        a1 a1Var;
        boolean z14;
        ?? B;
        a1 a1Var2;
        if (this.f116529d.f116510e) {
            System.out.println((Object) "FocusRelatedWarning: Dispatching rotary event while the focus system is invalidated.");
            return false;
        }
        j0 j0VarA = m0.a(this.f116528c);
        if (j0VarA != null) {
            if (!j0VarA.getNode().getIsAttached()) {
                e5.a.b("visitAncestors called on an unattached node");
            }
            h4.r.c node = j0VarA.getNode();
            h5.e0 e0VarG = h5.k.g(j0VarA);
            loop0: while (true) {
                if (e0VarG == null) {
                    B = 0;
                    break;
                }
                if ((e0VarG.P.f81685f.getAggregateChildKindSet() & 16384) != 0) {
                    while (node != null) {
                        if ((node.getKindSet() & 16384) != 0) {
                            ?? cVar = 0;
                            B = node;
                            while (B != 0) {
                                if (B instanceof d5.a) {
                                    break loop0;
                                }
                                if ((B.getKindSet() & 16384) != 0 && (B instanceof h5.m)) {
                                    h4.r.c child = ((h5.m) B).f81888b;
                                    int i14 = 0;
                                    while (child != null) {
                                        if ((child.getKindSet() & 16384) != 0) {
                                            i14++;
                                            if (i14 == 1) {
                                                B = B;
                                                cVar = cVar;
                                                cVar = cVar;
                                                Unit unit = Unit.INSTANCE;
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
                                    if (i14 == 1) {
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
                        node = node.getParent();
                    }
                }
                e0VarG = e0VarG.K();
                node = (e0VarG == null || (a1Var2 = e0VarG.P) == null) ? null : a1Var2.f81684e;
            }
            aVar = (d5.a) B;
        } else {
            aVar = null;
        }
        if (aVar != null) {
            if (!aVar.getNode().getIsAttached()) {
                e5.a.b("visitAncestors called on an unattached node");
            }
            h4.r.c parent = aVar.getNode().getParent();
            h5.e0 e0VarG2 = h5.k.g(aVar);
            ArrayList arrayList = null;
            while (e0VarG2 != null) {
                if ((e0VarG2.P.f81685f.getAggregateChildKindSet() & 16384) != 0) {
                    while (parent != null) {
                        if ((parent.getKindSet() & 16384) != 0) {
                            h4.r.c cVarB = parent;
                            q3.c cVar2 = null;
                            while (cVarB != null) {
                                if (cVarB instanceof d5.a) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(cVarB);
                                    z14 = false;
                                } else {
                                    z14 = true;
                                }
                                if (z14 && (cVarB.getKindSet() & 16384) != 0 && (cVarB instanceof h5.m)) {
                                    int i15 = 0;
                                    for (h4.r.c child2 = ((h5.m) cVarB).f81888b; child2 != null; child2 = child2.getChild()) {
                                        if ((child2.getKindSet() & 16384) != 0) {
                                            i15++;
                                            if (i15 == 1) {
                                                Unit unit2 = Unit.INSTANCE;
                                                cVarB = child2;
                                            } else {
                                                if (cVar2 == null) {
                                                    cVar2 = new q3.c(new h4.r.c[16], 0);
                                                }
                                                if (cVarB != null) {
                                                    cVar2.b(cVarB);
                                                    cVarB = null;
                                                }
                                                cVar2.b(child2);
                                            }
                                        }
                                    }
                                    if (i15 == 1) {
                                    }
                                }
                                cVarB = h5.k.b(cVar2);
                            }
                        }
                        parent = parent.getParent();
                    }
                }
                e0VarG2 = e0VarG2.K();
                parent = (e0VarG2 == null || (a1Var = e0VarG2.P) == null) ? null : a1Var.f81684e;
            }
            if (arrayList != null) {
                int size = arrayList.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i16 = size - 1;
                        ((d5.a) arrayList.get(size)).getClass();
                        if (i16 < 0) {
                            break;
                        }
                        size = i16;
                    }
                }
                Unit unit3 = Unit.INSTANCE;
            }
            ?? node2 = aVar.getNode();
            ?? cVar3 = 0;
            while (node2 != 0) {
                if (node2 instanceof d5.a) {
                } else if ((node2.getKindSet() & 16384) != 0 && (node2 instanceof h5.m)) {
                    h4.r.c child3 = ((h5.m) node2).f81888b;
                    int i17 = 0;
                    while (child3 != null) {
                        if ((child3.getKindSet() & 16384) != 0) {
                            i17++;
                            if (i17 == 1) {
                                cVar3 = cVar3;
                                node2 = node2;
                                cVar3 = cVar3;
                                Unit unit4 = Unit.INSTANCE;
                                node2 = child3;
                            } else {
                                if (cVar3 == 0) {
                                    cVar3 = new q3.c(new h4.r.c[16], 0);
                                }
                                if (node2 != 0) {
                                    cVar3.b(node2);
                                    node2 = 0;
                                }
                                cVar3.b(child3);
                            }
                        } else {
                            cVar3 = cVar3;
                            node2 = node2;
                        }
                        child3 = child3.getChild();
                        cVar3 = cVar3;
                        node2 = node2;
                    }
                    if (i17 == 1) {
                        cVar3 = cVar3;
                        node2 = node2;
                    } else {
                        cVar3 = cVar3;
                        node2 = node2;
                    }
                }
                node2 = h5.k.b(cVar3);
            }
            if (((Boolean) oVar.invoke()).booleanValue()) {
                return true;
            }
            ?? node3 = aVar.getNode();
            ?? cVar4 = 0;
            while (node3 != 0) {
                if (node3 instanceof d5.a) {
                } else if ((node3.getKindSet() & 16384) != 0 && (node3 instanceof h5.m)) {
                    h4.r.c child4 = ((h5.m) node3).f81888b;
                    int i18 = 0;
                    while (child4 != null) {
                        if ((child4.getKindSet() & 16384) != 0) {
                            i18++;
                            if (i18 == 1) {
                                node3 = node3;
                                cVar4 = cVar4;
                                cVar4 = cVar4;
                                Unit unit5 = Unit.INSTANCE;
                                node3 = child4;
                            } else {
                                if (cVar4 == 0) {
                                    cVar4 = new q3.c(new h4.r.c[16], 0);
                                }
                                if (node3 != 0) {
                                    cVar4.b(node3);
                                    node3 = 0;
                                }
                                cVar4.b(child4);
                            }
                        } else {
                            node3 = node3;
                            cVar4 = cVar4;
                        }
                        child4 = child4.getChild();
                        node3 = node3;
                        cVar4 = cVar4;
                    }
                    if (i18 == 1) {
                        node3 = node3;
                        cVar4 = cVar4;
                    } else {
                        node3 = node3;
                        cVar4 = cVar4;
                    }
                }
                node3 = h5.k.b(cVar4);
            }
            if (arrayList != null) {
                int size2 = arrayList.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    ((d5.a) arrayList.get(i19)).getClass();
                }
                Unit unit6 = Unit.INSTANCE;
            }
            Unit unit7 = Unit.INSTANCE;
        }
        return false;
    }

    @Override // m4.u
    public final void q() {
        this.f116529d.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12, types: [h4.r$c] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14, types: [h4.r$c] */
    /* JADX WARN: Type inference failed for: r8v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18, types: [q3.c] */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21, types: [q3.c] */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26 */
    @Override // m4.u
    public final void r() {
        y4.e eVar;
        a1 a1Var;
        boolean z14;
        ?? B;
        a1 a1Var2;
        j0 j0VarF = f();
        if (j0VarF != null) {
            if (!j0VarF.getNode().getIsAttached()) {
                e5.a.b("visitAncestors called on an unattached node");
            }
            h4.r.c node = j0VarF.getNode();
            h5.e0 e0VarG = h5.k.g(j0VarF);
            loop0: while (true) {
                if (e0VarG == null) {
                    B = 0;
                    break;
                }
                if ((e0VarG.P.f81685f.getAggregateChildKindSet() & 2097152) != 0) {
                    while (node != null) {
                        if ((node.getKindSet() & 2097152) != 0) {
                            ?? cVar = 0;
                            B = node;
                            while (B != 0) {
                                if (B instanceof y4.e) {
                                    break loop0;
                                }
                                if ((B.getKindSet() & 2097152) != 0 && (B instanceof h5.m)) {
                                    h4.r.c child = ((h5.m) B).f81888b;
                                    int i14 = 0;
                                    while (child != null) {
                                        if ((child.getKindSet() & 2097152) != 0) {
                                            i14++;
                                            if (i14 == 1) {
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
                                    if (i14 == 1) {
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
                        node = node.getParent();
                    }
                }
                e0VarG = e0VarG.K();
                node = (e0VarG == null || (a1Var2 = e0VarG.P) == null) ? null : a1Var2.f81684e;
            }
            eVar = (y4.e) B;
        } else {
            eVar = null;
        }
        if (eVar != null) {
            if (!eVar.getNode().getIsAttached()) {
                e5.a.b("visitAncestors called on an unattached node");
            }
            h4.r.c parent = eVar.getNode().getParent();
            h5.e0 e0VarG2 = h5.k.g(eVar);
            ArrayList arrayList = null;
            while (e0VarG2 != null) {
                if ((e0VarG2.P.f81685f.getAggregateChildKindSet() & 2097152) != 0) {
                    while (parent != null) {
                        if ((parent.getKindSet() & 2097152) != 0) {
                            h4.r.c cVarB = parent;
                            q3.c cVar2 = null;
                            while (cVarB != null) {
                                if (cVarB instanceof y4.e) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(cVarB);
                                    z14 = false;
                                } else {
                                    z14 = true;
                                }
                                if (z14 && (cVarB.getKindSet() & 2097152) != 0 && (cVarB instanceof h5.m)) {
                                    int i15 = 0;
                                    for (h4.r.c child2 = ((h5.m) cVarB).f81888b; child2 != null; child2 = child2.getChild()) {
                                        if ((child2.getKindSet() & 2097152) != 0) {
                                            i15++;
                                            if (i15 == 1) {
                                                cVarB = child2;
                                            } else {
                                                if (cVar2 == null) {
                                                    cVar2 = new q3.c(new h4.r.c[16], 0);
                                                }
                                                if (cVarB != null) {
                                                    cVar2.b(cVarB);
                                                    cVarB = null;
                                                }
                                                cVar2.b(child2);
                                            }
                                        }
                                    }
                                    if (i15 == 1) {
                                    }
                                }
                                cVarB = h5.k.b(cVar2);
                            }
                        }
                        parent = parent.getParent();
                    }
                }
                e0VarG2 = e0VarG2.K();
                parent = (e0VarG2 == null || (a1Var = e0VarG2.P) == null) ? null : a1Var.f81684e;
            }
            eVar.u0();
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i16 = 0; i16 < size; i16++) {
                    ((y4.e) arrayList.get(i16)).u0();
                }
            }
        }
    }

    @Override // m4.u
    public final boolean s() {
        j0 j0Var = this.f116528c;
        if (j0Var.getIsAttached()) {
            if (!j0Var.getNode().getIsAttached()) {
                e5.a.b("visitSubtreeIf called on an unattached node");
            }
            q3.c cVar = new q3.c(new h4.r.c[16], 0);
            h4.r.c child = j0Var.getNode().getChild();
            if (child == null) {
                h5.k.a(cVar, j0Var.getNode());
            } else {
                cVar.b(child);
            }
            while (true) {
                int i14 = cVar.f142358c;
                if (i14 == 0) {
                    break;
                }
                h4.r.c cVar2 = (h4.r.c) cVar.k(i14 - 1);
                if ((cVar2.getAggregateChildKindSet() & 1024) != 0) {
                    for (h4.r.c child2 = cVar2; child2 != null && child2.getIsAttached(); child2 = child2.getChild()) {
                        if ((child2.getKindSet() & 1024) != 0) {
                            h4.r.c cVarB = child2;
                            q3.c cVar3 = null;
                            while (cVarB != null) {
                                if (cVarB instanceof j0) {
                                    j0 j0Var2 = (j0) cVarB;
                                    if (j0Var2.getIsAttached() && j0Var2.W1().f116546b) {
                                        return true;
                                    }
                                } else if ((cVarB.getKindSet() & 1024) != 0 && (cVarB instanceof h5.m)) {
                                    int i15 = 0;
                                    for (h4.r.c child3 = ((h5.m) cVarB).f81888b; child3 != null; child3 = child3.getChild()) {
                                        if ((child3.getKindSet() & 1024) != 0) {
                                            i15++;
                                            if (i15 == 1) {
                                                cVarB = child3;
                                            } else {
                                                if (cVar3 == null) {
                                                    cVar3 = new q3.c(new h4.r.c[16], 0);
                                                }
                                                if (cVarB != null) {
                                                    cVar3.b(cVarB);
                                                    cVarB = null;
                                                }
                                                cVar3.b(child3);
                                            }
                                        }
                                    }
                                    if (i15 == 1) {
                                    }
                                }
                                cVarB = h5.k.b(cVar3);
                            }
                        }
                    }
                }
                h5.k.a(cVar, cVar2);
            }
        }
        return false;
    }

    @Override // m4.u
    public final boolean t() {
        j0 j0Var = this.f116528c;
        if (j0Var.getIsAttached()) {
            if (!j0Var.getNode().getIsAttached()) {
                e5.a.b("visitSubtreeIf called on an unattached node");
            }
            q3.c cVar = new q3.c(new h4.r.c[16], 0);
            h4.r.c child = j0Var.getNode().getChild();
            if (child == null) {
                h5.k.a(cVar, j0Var.getNode());
            } else {
                cVar.b(child);
            }
            while (true) {
                int i14 = cVar.f142358c;
                if (i14 == 0) {
                    break;
                }
                h4.r.c cVar2 = (h4.r.c) cVar.k(i14 - 1);
                if ((cVar2.getAggregateChildKindSet() & 1024) != 0) {
                    for (h4.r.c child2 = cVar2; child2 != null && child2.getIsAttached(); child2 = child2.getChild()) {
                        if ((child2.getKindSet() & 1024) != 0) {
                            h4.r.c cVarB = child2;
                            q3.c cVar3 = null;
                            while (cVarB != null) {
                                if (cVarB instanceof j0) {
                                    j0 j0Var2 = (j0) cVarB;
                                    if (j0Var2.getIsAttached()) {
                                        z zVarW1 = j0Var2.W1();
                                        if (j0Var2.getIsAttached() && !j0Var2.f116483a && zVarW1.f116546b) {
                                            return true;
                                        }
                                    }
                                } else if ((cVarB.getKindSet() & 1024) != 0 && (cVarB instanceof h5.m)) {
                                    int i15 = 0;
                                    for (h4.r.c child3 = ((h5.m) cVarB).f81888b; child3 != null; child3 = child3.getChild()) {
                                        if ((child3.getKindSet() & 1024) != 0) {
                                            i15++;
                                            if (i15 == 1) {
                                                cVarB = child3;
                                            } else {
                                                if (cVar3 == null) {
                                                    cVar3 = new q3.c(new h4.r.c[16], 0);
                                                }
                                                if (cVarB != null) {
                                                    cVar3.b(cVarB);
                                                    cVarB = null;
                                                }
                                                cVar3.b(child3);
                                            }
                                        }
                                    }
                                    if (i15 == 1) {
                                    }
                                }
                                cVarB = h5.k.b(cVar3);
                            }
                        }
                    }
                }
                h5.k.a(cVar, cVar2);
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12, types: [h4.r$c] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14, types: [h4.r$c] */
    /* JADX WARN: Type inference failed for: r8v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18, types: [q3.c] */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21, types: [q3.c] */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26 */
    @Override // m4.u
    public final boolean u(y4.a aVar) {
        y4.e eVar;
        int size;
        int size2;
        a1 a1Var;
        boolean z14;
        ?? B;
        a1 a1Var2;
        if (this.f116529d.f116510e) {
            System.out.println((Object) "FocusRelatedWarning: Dispatching indirect pointer event while the focus system is invalidated.");
            return false;
        }
        j0 j0VarF = f();
        if (j0VarF != null) {
            if (!j0VarF.getNode().getIsAttached()) {
                e5.a.b("visitAncestors called on an unattached node");
            }
            h4.r.c node = j0VarF.getNode();
            h5.e0 e0VarG = h5.k.g(j0VarF);
            loop0: while (true) {
                if (e0VarG == null) {
                    B = 0;
                    break;
                }
                if ((e0VarG.P.f81685f.getAggregateChildKindSet() & 2097152) != 0) {
                    while (node != null) {
                        if ((node.getKindSet() & 2097152) != 0) {
                            ?? cVar = 0;
                            B = node;
                            while (B != 0) {
                                if (B instanceof y4.e) {
                                    break loop0;
                                }
                                if ((B.getKindSet() & 2097152) != 0 && (B instanceof h5.m)) {
                                    h4.r.c child = ((h5.m) B).f81888b;
                                    int i14 = 0;
                                    while (child != null) {
                                        if ((child.getKindSet() & 2097152) != 0) {
                                            i14++;
                                            if (i14 == 1) {
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
                                    if (i14 == 1) {
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
                        node = node.getParent();
                    }
                }
                e0VarG = e0VarG.K();
                node = (e0VarG == null || (a1Var2 = e0VarG.P) == null) ? null : a1Var2.f81684e;
            }
            eVar = (y4.e) B;
        } else {
            eVar = null;
        }
        if (eVar != null) {
            if (!eVar.getNode().getIsAttached()) {
                e5.a.b("visitAncestors called on an unattached node");
            }
            h4.r.c parent = eVar.getNode().getParent();
            h5.e0 e0VarG2 = h5.k.g(eVar);
            ArrayList arrayList = null;
            while (e0VarG2 != null) {
                if ((e0VarG2.P.f81685f.getAggregateChildKindSet() & 2097152) != 0) {
                    while (parent != null) {
                        if ((parent.getKindSet() & 2097152) != 0) {
                            h4.r.c cVarB = parent;
                            q3.c cVar2 = null;
                            while (cVarB != null) {
                                if (cVarB instanceof y4.e) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(cVarB);
                                    z14 = false;
                                } else {
                                    z14 = true;
                                }
                                if (z14 && (cVarB.getKindSet() & 2097152) != 0 && (cVarB instanceof h5.m)) {
                                    int i15 = 0;
                                    for (h4.r.c child2 = ((h5.m) cVarB).f81888b; child2 != null; child2 = child2.getChild()) {
                                        if ((child2.getKindSet() & 2097152) != 0) {
                                            i15++;
                                            if (i15 == 1) {
                                                cVarB = child2;
                                            } else {
                                                if (cVar2 == null) {
                                                    cVar2 = new q3.c(new h4.r.c[16], 0);
                                                }
                                                if (cVarB != null) {
                                                    cVar2.b(cVarB);
                                                    cVarB = null;
                                                }
                                                cVar2.b(child2);
                                            }
                                        }
                                    }
                                    if (i15 == 1) {
                                    }
                                }
                                cVarB = h5.k.b(cVar2);
                            }
                        }
                        parent = parent.getParent();
                    }
                }
                e0VarG2 = e0VarG2.K();
                parent = (e0VarG2 == null || (a1Var = e0VarG2.P) == null) ? null : a1Var.f81684e;
            }
            if (arrayList != null && (size2 = arrayList.size() - 1) >= 0) {
                while (true) {
                    int i16 = size2 - 1;
                    ((y4.e) arrayList.get(size2)).b0(aVar, b5.s.Initial);
                    if (i16 < 0) {
                        break;
                    }
                    size2 = i16;
                }
            }
            eVar.b0(aVar, b5.s.Initial);
            eVar.b0(aVar, b5.s.Main);
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i17 = 0; i17 < size3; i17++) {
                    ((y4.e) arrayList.get(i17)).b0(aVar, b5.s.Main);
                }
            }
            if (arrayList != null && (size = arrayList.size() - 1) >= 0) {
                while (true) {
                    int i18 = size - 1;
                    ((y4.e) arrayList.get(size)).b0(aVar, b5.s.Final);
                    if (i18 < 0) {
                        break;
                    }
                    size = i18;
                }
            }
            eVar.b0(aVar, b5.s.Final);
        }
        List<y4.d> list = aVar.f194370a;
        int size4 = list.size();
        for (int i19 = 0; i19 < size4; i19++) {
            if (list.get(i19).f194390i) {
                return true;
            }
        }
        return false;
    }

    @Override // m4.u
    public final h0 v() {
        return this.f116528c.a0();
    }

    @Override // m4.u
    public final n4.d w() {
        j0 j0VarA = m0.a(this.f116528c);
        if (j0VarA != null) {
            return m0.b(j0VarA);
        }
        return null;
    }

    @Override // m4.u
    public final void x() {
        k0.a(this.f116528c, true);
        if (!h4.i.f81561c || f() == null) {
            return;
        }
        j0 j0VarF = f();
        j(null);
        if (j0VarF != null) {
            j0VarF.V1(h0.Active, h0.Inactive);
        }
    }

    @Override // m4.q
    public final void y(boolean z14) {
        g.f116466b.getClass();
        o(g.f116474j, z14, true);
    }

    public final boolean z(boolean z14) {
        a1 a1Var;
        if (f() != null) {
            j0 j0VarF = f();
            j(null);
            if (j0VarF != null) {
                j0VarF.V1(h0.Active, h0.Inactive);
                if (!j0VarF.getNode().getIsAttached()) {
                    e5.a.b("visitAncestors called on an unattached node");
                }
                h4.r.c parent = j0VarF.getNode().getParent();
                h5.e0 e0VarG = h5.k.g(j0VarF);
                while (e0VarG != null) {
                    if ((e0VarG.P.f81685f.getAggregateChildKindSet() & 1024) != 0) {
                        while (parent != null) {
                            if ((parent.getKindSet() & 1024) != 0) {
                                q3.c cVar = null;
                                h4.r.c cVarB = parent;
                                while (cVarB != null) {
                                    if (cVarB instanceof j0) {
                                        ((j0) cVarB).V1(h0.ActiveParent, h0.Inactive);
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
        }
        return true;
    }
}
