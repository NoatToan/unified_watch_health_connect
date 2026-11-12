package p5;

import h5.a1;
import h5.c1;
import h5.y1;
import h5.z1;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B)\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lp5/y;", "", "Lh4/r$c;", "outerSemanticsNode", "", "mergingEnabled", "Lh5/e0;", "layoutNode", "Lp5/q;", "unmergedConfig", "<init>", "(Lh4/r$c;ZLh5/e0;Lp5/q;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h4.r.c f136095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f136096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h5.e0 f136097c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q f136098d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public y f136099e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f136100f;

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"p5/y$a", "Lh5/y1;", "Lh4/r$c;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends h4.r.c implements y1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l<k0, Unit> f136101a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(e23.l<? super k0, Unit> lVar) {
            this.f136101a = lVar;
        }

        @Override // h5.y1
        public final void D1(k0 k0Var) {
            this.f136101a.invoke(k0Var);
        }
    }

    public y(h4.r.c cVar, boolean z14, h5.e0 e0Var, q qVar) {
        this.f136095a = cVar;
        this.f136096b = z14;
        this.f136097c = e0Var;
        this.f136098d = qVar;
        this.f136100f = e0Var.f81761b;
    }

    public static /* synthetic */ List j(int i14, y yVar) {
        return yVar.i((i14 & 1) != 0 ? !yVar.f136096b : false, (i14 & 2) == 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [h4.r$c] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [h4.r$c] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
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
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v7 */
    public final n4.d a(c1 c1Var) {
        ?? B;
        y yVarL = l();
        if (yVarL == null) {
            n4.d.f123545e.getClass();
            return n4.d.f123546f;
        }
        a1 a1Var = yVarL.f136097c.P;
        if ((a1Var.f81685f.getAggregateChildKindSet() & 8) == 0) {
            B = 0;
            break;
        }
        h4.r.c child = a1Var.f81685f;
        loop0: while (true) {
            if (child != null) {
                if ((child.getKindSet() & 8) != 0) {
                    B = child;
                    ?? cVar = 0;
                    while (B != 0) {
                        if (B instanceof y1) {
                            if (((y1) B).o1()) {
                                break loop0;
                            }
                        } else if ((B.getKindSet() & 8) != 0 && (B instanceof h5.m)) {
                            h4.r.c child2 = ((h5.m) B).f81888b;
                            int i14 = 0;
                            while (child2 != null) {
                                if ((child2.getKindSet() & 8) != 0) {
                                    i14++;
                                    if (i14 == 1) {
                                        B = B;
                                        cVar = cVar;
                                        cVar = cVar;
                                        B = child2;
                                    } else {
                                        if (cVar == 0) {
                                            cVar = new q3.c(new h4.r.c[16], 0);
                                        }
                                        if (B != 0) {
                                            cVar.b(B);
                                            B = 0;
                                        }
                                        cVar.b(child2);
                                    }
                                } else {
                                    B = B;
                                    cVar = cVar;
                                }
                                child2 = child2.getChild();
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
                if ((child.getAggregateChildKindSet() & 8) != 0) {
                    child = child.getChild();
                }
            }
            B = 0;
            break;
        }
        y1 y1Var = (y1) B;
        c1 c1VarE = y1Var != null ? h5.k.e(y1Var, 8) : null;
        return c1VarE == null ? yVarL.a(c1Var) : c1VarE.j0(c1Var, true);
    }

    public final y b(l lVar, e23.l<? super k0, Unit> lVar2) {
        q qVar = new q();
        qVar.f136088d = false;
        qVar.f136089e = false;
        lVar2.invoke(qVar);
        y yVar = new y(new a(lVar2), false, new h5.e0(true, this.f136100f + (lVar != null ? 1000000000 : 2000000000)), qVar);
        yVar.f136099e = this;
        return yVar;
    }

    public final void c(h5.e0 e0Var, ArrayList arrayList) {
        q3.c<h5.e0> cVarM = e0Var.M();
        h5.e0[] e0VarArr = cVarM.f142356a;
        int i14 = cVarM.f142358c;
        for (int i15 = 0; i15 < i14; i15++) {
            h5.e0 e0Var2 = e0VarArr[i15];
            if (e0Var2.isAttached() && !e0Var2.M0) {
                if (e0Var2.P.d(8)) {
                    arrayList.add(z.a(e0Var2, this.f136096b));
                } else {
                    c(e0Var2, arrayList);
                }
            }
        }
    }

    public final c1 d() {
        if (!p()) {
            y1 y1VarF = f();
            return y1VarF != null ? h5.k.e(y1VarF, 8) : this.f136097c.P.f81682c;
        }
        y yVarL = l();
        if (yVarL != null) {
            return yVarL.d();
        }
        return null;
    }

    public final void e(ArrayList arrayList, ArrayList arrayList2) {
        t(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            y yVar = (y) arrayList.get(size2);
            if (yVar.q()) {
                arrayList2.add(yVar);
            } else if (!yVar.f136098d.f136089e) {
                yVar.e(arrayList, arrayList2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11, types: [h4.r$c] */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [h4.r$c] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v3, types: [q3.c] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [q3.c] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v7 */
    public final y1 f() {
        ?? B;
        boolean z14;
        ?? r14;
        boolean z15 = this.f136098d.f136088d;
        ?? r15 = 0;
        r15 = 0;
        r15 = 0;
        r15 = 0;
        h5.e0 e0Var = this.f136097c;
        if (!z15) {
            a1 a1Var = e0Var.P;
            if ((a1Var.f81685f.getAggregateChildKindSet() & 8) != 0) {
                loop3: for (h4.r.c child = a1Var.f81685f; child != null; child = child.getChild()) {
                    if ((child.getKindSet() & 8) != 0) {
                        B = child;
                        ?? cVar = 0;
                        while (true) {
                            if (B != 0) {
                                if (B instanceof y1) {
                                    if (((y1) B).o1()) {
                                        r15 = B;
                                    }
                                } else if ((B.getKindSet() & 8) != 0 && (B instanceof h5.m)) {
                                    h4.r.c child2 = ((h5.m) B).f81888b;
                                    int i14 = 0;
                                    while (child2 != null) {
                                        if ((child2.getKindSet() & 8) != 0) {
                                            i14++;
                                            if (i14 == 1) {
                                                B = B;
                                                cVar = cVar;
                                                cVar = cVar;
                                                B = child2;
                                            } else {
                                                if (cVar == 0) {
                                                    cVar = new q3.c(new h4.r.c[16], 0);
                                                }
                                                if (B != 0) {
                                                    cVar.b(B);
                                                    B = 0;
                                                }
                                                cVar.b(child2);
                                            }
                                        } else {
                                            B = B;
                                            cVar = cVar;
                                        }
                                        child2 = child2.getChild();
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
                    }
                    if ((child.getAggregateChildKindSet() & 8) == 0) {
                        break;
                    }
                }
            }
        } else {
            a1 a1Var2 = e0Var.P;
            if ((a1Var2.f81685f.getAggregateChildKindSet() & 8) != 0) {
                h4.r.c child3 = a1Var2.f81685f;
                B = 0;
                while (child3 != null) {
                    if ((child3.getKindSet() & 8) != 0) {
                        h4.r.c cVarB = child3;
                        q3.c cVar2 = null;
                        while (cVarB != null) {
                            if (cVarB instanceof y1) {
                                y1 y1Var = (y1) cVarB;
                                if (y1Var.o1()) {
                                    if (y1Var.getF136009a()) {
                                        r14 = B;
                                        r14 = B;
                                        return y1Var;
                                    }
                                    if (B == 0) {
                                        r14 = y1Var;
                                    }
                                }
                                r14 = B;
                                z14 = false;
                                B = r14;
                            } else {
                                z14 = true;
                            }
                            if (z14) {
                                B = B;
                                if ((cVarB.getKindSet() & 8) != 0 && (cVarB instanceof h5.m)) {
                                    int i15 = 0;
                                    for (h4.r.c child4 = ((h5.m) cVarB).f81888b; child4 != null; child4 = child4.getChild()) {
                                        if ((child4.getKindSet() & 8) != 0) {
                                            i15++;
                                            if (i15 == 1) {
                                                cVarB = child4;
                                            } else {
                                                if (cVar2 == null) {
                                                    cVar2 = new q3.c(new h4.r.c[16], 0);
                                                }
                                                if (cVarB != null) {
                                                    cVar2.b(cVarB);
                                                    cVarB = null;
                                                }
                                                cVar2.b(child4);
                                            }
                                        }
                                    }
                                    if (i15 == 1) {
                                    }
                                }
                            } else {
                                B = B;
                            }
                            cVarB = h5.k.b(cVar2);
                        }
                    }
                    if ((child3.getAggregateChildKindSet() & 8) == 0) {
                        break;
                    }
                    child3 = child3.getChild();
                    B = B;
                }
                r15 = B;
            }
        }
        return (y1) r15;
    }

    public final n4.d g() {
        n4.d dVarJ0;
        c1 c1VarD = d();
        if (c1VarD != null) {
            if (!c1VarD.isAttached()) {
                c1VarD = null;
            }
            if (c1VarD != null && (dVarJ0 = f5.d0.c(c1VarD).j0(c1VarD, true)) != null) {
                return dVarJ0;
            }
        }
        n4.d.f123545e.getClass();
        return n4.d.f123546f;
    }

    public final n4.d h() {
        n4.d dVarB;
        c1 c1VarD = d();
        if (c1VarD != null) {
            if (!c1VarD.isAttached()) {
                c1VarD = null;
            }
            if (c1VarD != null && (dVarB = f5.d0.b(c1VarD, true)) != null) {
                return dVarB;
            }
        }
        n4.d.f123545e.getClass();
        return n4.d.f123546f;
    }

    public final List i(boolean z14, boolean z15) {
        if (!z14 && this.f136098d.f136089e) {
            return p13.j0.f134944a;
        }
        ArrayList arrayList = new ArrayList();
        if (!q()) {
            return t(arrayList, z15);
        }
        ArrayList arrayList2 = new ArrayList();
        e(arrayList, arrayList2);
        return arrayList2;
    }

    public final q k() {
        boolean zQ = q();
        q qVar = this.f136098d;
        if (!zQ) {
            return qVar;
        }
        q qVarB = qVar.b();
        s(new ArrayList(), qVarB);
        return qVarB;
    }

    public final y l() {
        h5.e0 e0VarK;
        y yVar = this.f136099e;
        if (yVar != null) {
            return yVar;
        }
        h5.e0 e0Var = this.f136097c;
        boolean z14 = this.f136096b;
        if (!z14) {
            e0VarK = null;
            break;
        }
        e0VarK = e0Var.K();
        while (true) {
            if (e0VarK == null) {
                e0VarK = null;
                break;
            }
            q qVarY = e0VarK.y();
            if (qVarY != null && qVarY.f136088d) {
                break;
            }
            e0VarK = e0VarK.K();
        }
        if (e0VarK == null) {
            for (h5.e0 e0VarK2 = e0Var.K(); e0VarK2 != null; e0VarK2 = e0VarK2.K()) {
                if (e0VarK2.P.d(8)) {
                    e0VarK = e0VarK2;
                }
            }
            e0VarK = null;
        }
        if (e0VarK == null) {
            return null;
        }
        return z.a(e0VarK, z14);
    }

    public final long m() {
        c1 c1VarD = d();
        if (c1VarD != null) {
            if (!c1VarD.isAttached()) {
                c1VarD = null;
            }
            if (c1VarD != null) {
                return f5.d0.e(c1VarD);
            }
        }
        n4.c.f123541b.getClass();
        return 0L;
    }

    public final n4.d n() {
        y1 y1VarF = f();
        if (y1VarF == null) {
            return this.f136097c.P.f81682c.h2();
        }
        h4.r.c node = y1VarF.getNode();
        p.f136057a.getClass();
        return z1.a(node, r.a(this.f136098d, p.f136059c) != null, true);
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final q getF136098d() {
        return this.f136098d;
    }

    public final boolean p() {
        return this.f136099e != null;
    }

    public final boolean q() {
        return this.f136096b && this.f136098d.f136088d;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:? A[RETURN, SYNTHETIC] */
    public final boolean r() {
        if (p() || !j(4, this).isEmpty()) {
            return false;
        }
        h5.e0 e0VarK = this.f136097c.K();
        while (e0VarK != null) {
            q qVarY = e0VarK.y();
            if (qVarY != null && qVarY.f136088d) {
                if (e0VarK == null) {
                    return true;
                }
                return false;
            }
            e0VarK = e0VarK.K();
        }
        e0VarK = null;
        if (e0VarK == null) {
            return true;
        }
        return false;
    }

    public final void s(ArrayList arrayList, q qVar) {
        if (this.f136098d.f136089e) {
            return;
        }
        t(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            y yVar = (y) arrayList.get(size2);
            if (!yVar.q()) {
                qVar.e(yVar.f136098d);
                yVar.s(arrayList, qVar);
            }
        }
    }

    public final List t(ArrayList arrayList, boolean z14) {
        if (p()) {
            return p13.j0.f134944a;
        }
        c(this.f136097c, arrayList);
        if (z14) {
            d0.f135959a.getClass();
            j0<l> j0Var = d0.A;
            q qVar = this.f136098d;
            l lVar = (l) r.a(qVar, j0Var);
            if (lVar != null && qVar.f136088d && !arrayList.isEmpty()) {
                arrayList.add(b(lVar, new w(lVar)));
            }
            j0<List<String>> j0Var2 = d0.f135960b;
            if (qVar.f136085a.b(j0Var2) && !arrayList.isEmpty() && qVar.f136088d) {
                List list = (List) r.a(qVar, j0Var2);
                String str = list != null ? (String) p13.h0.d0(list) : null;
                if (str != null) {
                    arrayList.add(0, b(null, new x(str)));
                }
            }
        }
        return arrayList;
    }
}
