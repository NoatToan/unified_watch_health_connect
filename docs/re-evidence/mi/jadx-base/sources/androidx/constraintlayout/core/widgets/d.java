package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.SolverVariable;
import defpackage.euf;
import defpackage.gx6;
import defpackage.hz5;
import defpackage.mg2;
import defpackage.z3b;
import defpackage.zhr;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class d extends zhr {
    public int Y0;
    public int c1;
    public int d1;
    public int e1;
    public int f1;
    public mg2 W0 = new mg2(this);
    public hz5 X0 = new hz5(this);
    public mg2.b Z0 = null;
    public boolean a1 = false;
    public androidx.constraintlayout.core.c b1 = new androidx.constraintlayout.core.c();
    public int g1 = 0;
    public int h1 = 0;
    public c[] i1 = new c[4];
    public c[] j1 = new c[4];
    public boolean k1 = false;
    public boolean l1 = false;
    public boolean m1 = false;
    public int n1 = 0;
    public int o1 = 0;
    public int p1 = 257;
    public boolean q1 = false;
    public boolean r1 = false;
    public boolean s1 = false;
    public int t1 = 0;
    public WeakReference<ConstraintAnchor> u1 = null;
    public WeakReference<ConstraintAnchor> v1 = null;
    public WeakReference<ConstraintAnchor> w1 = null;
    public WeakReference<ConstraintAnchor> x1 = null;
    public HashSet<ConstraintWidget> y1 = new HashSet<>();
    public mg2.a z1 = new mg2.a();

    public static boolean X1(int i, ConstraintWidget constraintWidget, mg2.b bVar, mg2.a aVar, int i2) {
        int i3;
        int i4;
        if (bVar == null) {
            return false;
        }
        if (constraintWidget.X() == 8 || (constraintWidget instanceof f) || (constraintWidget instanceof a)) {
            aVar.e = 0;
            aVar.f = 0;
            return false;
        }
        aVar.f26125a = constraintWidget.C();
        aVar.f26126b = constraintWidget.V();
        aVar.c = constraintWidget.Y();
        aVar.d = constraintWidget.z();
        aVar.i = false;
        aVar.j = i2;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = aVar.f26125a;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        boolean z = dimensionBehaviour == dimensionBehaviour2;
        boolean z2 = aVar.f26126b == dimensionBehaviour2;
        boolean z3 = z && constraintWidget.f0 > 0.0f;
        boolean z4 = z2 && constraintWidget.f0 > 0.0f;
        if (z && constraintWidget.c0(0) && constraintWidget.w == 0 && !z3) {
            aVar.f26125a = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (z2 && constraintWidget.x == 0) {
                aVar.f26125a = ConstraintWidget.DimensionBehaviour.FIXED;
            }
            z = false;
        }
        if (z2 && constraintWidget.c0(1) && constraintWidget.x == 0 && !z4) {
            aVar.f26126b = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (z && constraintWidget.w == 0) {
                aVar.f26126b = ConstraintWidget.DimensionBehaviour.FIXED;
            }
            z2 = false;
        }
        if (constraintWidget.p0()) {
            aVar.f26125a = ConstraintWidget.DimensionBehaviour.FIXED;
            z = false;
        }
        if (constraintWidget.q0()) {
            aVar.f26126b = ConstraintWidget.DimensionBehaviour.FIXED;
            z2 = false;
        }
        if (z3) {
            if (constraintWidget.y[0] == 4) {
                aVar.f26125a = ConstraintWidget.DimensionBehaviour.FIXED;
            } else if (!z2) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = aVar.f26126b;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.FIXED;
                if (dimensionBehaviour3 == dimensionBehaviour4) {
                    i4 = aVar.d;
                } else {
                    aVar.f26125a = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    bVar.a(constraintWidget, aVar);
                    i4 = aVar.f;
                }
                aVar.f26125a = dimensionBehaviour4;
                aVar.c = (int) (constraintWidget.x() * i4);
            }
        }
        if (z4) {
            if (constraintWidget.y[1] == 4) {
                aVar.f26126b = ConstraintWidget.DimensionBehaviour.FIXED;
            } else if (!z) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = aVar.f26125a;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.FIXED;
                if (dimensionBehaviour5 == dimensionBehaviour6) {
                    i3 = aVar.c;
                } else {
                    aVar.f26126b = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    bVar.a(constraintWidget, aVar);
                    i3 = aVar.e;
                }
                aVar.f26126b = dimensionBehaviour6;
                if (constraintWidget.y() == -1) {
                    aVar.d = (int) (i3 / constraintWidget.x());
                } else {
                    aVar.d = (int) (constraintWidget.x() * i3);
                }
            }
        }
        bVar.a(constraintWidget, aVar);
        constraintWidget.o1(aVar.e);
        constraintWidget.P0(aVar.f);
        constraintWidget.O0(aVar.h);
        constraintWidget.E0(aVar.g);
        aVar.j = mg2.a.f26124k;
        return aVar.i;
    }

    public boolean A1(androidx.constraintlayout.core.c cVar) {
        boolean zY1 = Y1(64);
        g(cVar, zY1);
        int size = this.V0.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = this.V0.get(i);
            constraintWidget.W0(0, false);
            constraintWidget.W0(1, false);
            if (constraintWidget instanceof a) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                ConstraintWidget constraintWidget2 = this.V0.get(i2);
                if (constraintWidget2 instanceof a) {
                    ((a) constraintWidget2).C1();
                }
            }
        }
        this.y1.clear();
        for (int i3 = 0; i3 < size; i3++) {
            ConstraintWidget constraintWidget3 = this.V0.get(i3);
            if (constraintWidget3.f()) {
                if (constraintWidget3 instanceof i) {
                    this.y1.add(constraintWidget3);
                } else {
                    constraintWidget3.g(cVar, zY1);
                }
            }
        }
        while (this.y1.size() > 0) {
            int size2 = this.y1.size();
            Iterator<ConstraintWidget> it = this.y1.iterator();
            while (it.hasNext()) {
                i iVar = (i) it.next();
                if (iVar.z1(this.y1)) {
                    iVar.g(cVar, zY1);
                    this.y1.remove(iVar);
                    break;
                }
            }
            if (size2 == this.y1.size()) {
                Iterator<ConstraintWidget> it2 = this.y1.iterator();
                while (it2.hasNext()) {
                    it2.next().g(cVar, zY1);
                }
                this.y1.clear();
            }
        }
        if (androidx.constraintlayout.core.c.f1886r) {
            HashSet<ConstraintWidget> hashSet = new HashSet<>();
            for (int i4 = 0; i4 < size; i4++) {
                ConstraintWidget constraintWidget4 = this.V0.get(i4);
                if (!constraintWidget4.f()) {
                    hashSet.add(constraintWidget4);
                }
            }
            e(this, cVar, hashSet, C() == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT ? 0 : 1, false);
            for (ConstraintWidget constraintWidget5 : hashSet) {
                g.a(this, cVar, constraintWidget5);
                constraintWidget5.g(cVar, zY1);
            }
        } else {
            for (int i5 = 0; i5 < size; i5++) {
                ConstraintWidget constraintWidget6 = this.V0.get(i5);
                if (constraintWidget6 instanceof d) {
                    ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget6.b0;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[1];
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    if (dimensionBehaviour == dimensionBehaviour3) {
                        constraintWidget6.T0(ConstraintWidget.DimensionBehaviour.FIXED);
                    }
                    if (dimensionBehaviour2 == dimensionBehaviour3) {
                        constraintWidget6.k1(ConstraintWidget.DimensionBehaviour.FIXED);
                    }
                    constraintWidget6.g(cVar, zY1);
                    if (dimensionBehaviour == dimensionBehaviour3) {
                        constraintWidget6.T0(dimensionBehaviour);
                    }
                    if (dimensionBehaviour2 == dimensionBehaviour3) {
                        constraintWidget6.k1(dimensionBehaviour2);
                    }
                } else {
                    g.a(this, cVar, constraintWidget6);
                    if (!constraintWidget6.f()) {
                        constraintWidget6.g(cVar, zY1);
                    }
                }
            }
        }
        if (this.g1 > 0) {
            b.b(this, cVar, null, 0);
        }
        if (this.h1 > 0) {
            b.b(this, cVar, null, 1);
        }
        return true;
    }

    public final void B1(ConstraintWidget constraintWidget) {
        int i = this.g1 + 1;
        c[] cVarArr = this.j1;
        if (i >= cVarArr.length) {
            this.j1 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.j1[this.g1] = new c(constraintWidget, 0, U1());
        this.g1++;
    }

    public void C1(ConstraintAnchor constraintAnchor) {
        WeakReference<ConstraintAnchor> weakReference = this.x1;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.e() > this.x1.get().e()) {
            this.x1 = new WeakReference<>(constraintAnchor);
        }
    }

    public void D1(ConstraintAnchor constraintAnchor) {
        WeakReference<ConstraintAnchor> weakReference = this.v1;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.e() > this.v1.get().e()) {
            this.v1 = new WeakReference<>(constraintAnchor);
        }
    }

    public final void E1(ConstraintAnchor constraintAnchor, SolverVariable solverVariable) {
        this.b1.h(solverVariable, this.b1.q(constraintAnchor), 0, 5);
    }

    public final void F1(ConstraintAnchor constraintAnchor, SolverVariable solverVariable) {
        this.b1.h(this.b1.q(constraintAnchor), solverVariable, 0, 5);
    }

    public final void G1(ConstraintWidget constraintWidget) {
        int i = this.h1 + 1;
        c[] cVarArr = this.i1;
        if (i >= cVarArr.length) {
            this.i1 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.i1[this.h1] = new c(constraintWidget, 1, U1());
        this.h1++;
    }

    public void H1(ConstraintAnchor constraintAnchor) {
        WeakReference<ConstraintAnchor> weakReference = this.w1;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.e() > this.w1.get().e()) {
            this.w1 = new WeakReference<>(constraintAnchor);
        }
    }

    public void I1(ConstraintAnchor constraintAnchor) {
        WeakReference<ConstraintAnchor> weakReference = this.u1;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.e() > this.u1.get().e()) {
            this.u1 = new WeakReference<>(constraintAnchor);
        }
    }

    public boolean J1(boolean z) {
        return this.X0.f(z);
    }

    public boolean K1(boolean z) {
        return this.X0.g(z);
    }

    public boolean L1(boolean z, int i) {
        return this.X0.h(z, i);
    }

    public void M1(euf eufVar) {
        this.b1.v(eufVar);
    }

    public mg2.b N1() {
        return this.Z0;
    }

    public int O1() {
        return this.p1;
    }

    public androidx.constraintlayout.core.c P1() {
        return this.b1;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void Q(StringBuilder sb) {
        sb.append(this.o + ":{\n");
        sb.append("  actualWidth:" + this.d0);
        sb.append("\n");
        sb.append("  actualHeight:" + this.e0);
        sb.append("\n");
        Iterator<ConstraintWidget> it = v1().iterator();
        while (it.hasNext()) {
            it.next().Q(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }

    public boolean Q1() {
        return false;
    }

    public void R1() {
        this.X0.j();
    }

    public void S1() {
        this.X0.k();
    }

    public boolean T1() {
        return this.s1;
    }

    public boolean U1() {
        return this.a1;
    }

    public boolean V1() {
        return this.r1;
    }

    public long W1(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.c1 = i8;
        this.d1 = i9;
        return this.W0.d(this, i, i8, i9, i2, i3, i4, i5, i6, i7);
    }

    public boolean Y1(int i) {
        return (this.p1 & i) == i;
    }

    public final void Z1() {
        this.g1 = 0;
        this.h1 = 0;
    }

    public void a2(mg2.b bVar) {
        this.Z0 = bVar;
        this.X0.n(bVar);
    }

    public void b2(int i) {
        this.p1 = i;
        androidx.constraintlayout.core.c.f1886r = Y1(512);
    }

    public void c2(int i) {
        this.Y0 = i;
    }

    public void d2(boolean z) {
        this.a1 = z;
    }

    public boolean e2(androidx.constraintlayout.core.c cVar, boolean[] zArr) {
        zArr[2] = false;
        boolean zY1 = Y1(64);
        u1(cVar, zY1);
        int size = this.V0.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = this.V0.get(i);
            constraintWidget.u1(cVar, zY1);
            if (constraintWidget.e0()) {
                z = true;
            }
        }
        return z;
    }

    public void f2() {
        this.W0.e(this);
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void t1(boolean z, boolean z2) {
        super.t1(z, z2);
        int size = this.V0.size();
        for (int i = 0; i < size; i++) {
            this.V0.get(i).t1(z, z2);
        }
    }

    @Override // defpackage.zhr, androidx.constraintlayout.core.widgets.ConstraintWidget
    public void v0() {
        this.b1.E();
        this.c1 = 0;
        this.e1 = 0;
        this.d1 = 0;
        this.f1 = 0;
        this.q1 = false;
        super.v0();
    }

    /* JADX WARN: Code duplicated, block: B:151:0x0307 A[PHI: r2 r16
      0x0307: PHI (r2v15 ??) = (r2v14 ??), (r2v19 ??), (r2v19 ??), (r2v19 ??) binds: [B:138:0x02c8, B:146:0x02ed, B:147:0x02ef, B:149:0x02f5] A[DONT_GENERATE, DONT_INLINE]
      0x0307: PHI (r16v4 boolean) = (r16v3 boolean), (r16v5 boolean), (r16v5 boolean), (r16v5 boolean) binds: [B:138:0x02c8, B:146:0x02ed, B:147:0x02ef, B:149:0x02f5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v6 */
    @Override // defpackage.zhr
    public void w1() {
        int i;
        int i2;
        boolean z;
        boolean zE2;
        boolean z2;
        ?? r6;
        ?? r2;
        ?? r13;
        boolean z3;
        int i3;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        int i4 = 0;
        this.h0 = 0;
        this.i0 = 0;
        this.r1 = false;
        this.s1 = false;
        int size = this.V0.size();
        int iMax = Math.max(0, Y());
        int iMax2 = Math.max(0, z());
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = this.b0;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[1];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = dimensionBehaviourArr[0];
        if (this.Y0 == 0 && g.b(this.p1, 1)) {
            gx6.h(this, N1());
            for (int i5 = 0; i5 < size; i5++) {
                ConstraintWidget constraintWidget = this.V0.get(i5);
                if (constraintWidget.o0() && !(constraintWidget instanceof f) && !(constraintWidget instanceof a) && !(constraintWidget instanceof i) && !constraintWidget.n0()) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviourW = constraintWidget.w(0);
                    ConstraintWidget.DimensionBehaviour dimensionBehaviourW2 = constraintWidget.w(1);
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                    if (dimensionBehaviourW != dimensionBehaviour4 || constraintWidget.w == 1 || dimensionBehaviourW2 != dimensionBehaviour4 || constraintWidget.x == 1) {
                        X1(0, constraintWidget, this.Z0, new mg2.a(), mg2.a.f26124k);
                    }
                }
            }
        }
        if (size <= 2 || !((dimensionBehaviour3 == (dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || dimensionBehaviour2 == dimensionBehaviour) && g.b(this.p1, 1024) && z3b.c(this, N1()))) {
            i = iMax2;
            i2 = iMax;
            z = false;
        } else {
            if (dimensionBehaviour3 == dimensionBehaviour) {
                if (iMax >= Y() || iMax <= 0) {
                    iMax = Y();
                } else {
                    o1(iMax);
                    this.r1 = true;
                }
            }
            if (dimensionBehaviour2 == dimensionBehaviour) {
                if (iMax2 >= z() || iMax2 <= 0) {
                    iMax2 = z();
                } else {
                    P0(iMax2);
                    this.s1 = true;
                }
            }
            i = iMax2;
            i2 = iMax;
            z = true;
        }
        boolean z4 = Y1(64) || Y1(128);
        androidx.constraintlayout.core.c cVar = this.b1;
        cVar.h = false;
        cVar.i = false;
        if (this.p1 != 0 && z4) {
            cVar.i = true;
        }
        ArrayList<ConstraintWidget> arrayList = this.V0;
        ConstraintWidget.DimensionBehaviour dimensionBehaviourC = C();
        ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        boolean z5 = dimensionBehaviourC == dimensionBehaviour5 || V() == dimensionBehaviour5;
        Z1();
        for (int i6 = 0; i6 < size; i6++) {
            ConstraintWidget constraintWidget2 = this.V0.get(i6);
            if (constraintWidget2 instanceof zhr) {
                ((zhr) constraintWidget2).w1();
            }
        }
        boolean zY1 = Y1(64);
        ?? r14 = z;
        int i7 = 0;
        boolean zA1 = true;
        while (zA1) {
            int i8 = i7 + 1;
            try {
                this.b1.E();
                Z1();
                o(this.b1);
                for (int i9 = i4; i9 < size; i9++) {
                    this.V0.get(i9).o(this.b1);
                }
                zA1 = A1(this.b1);
                WeakReference<ConstraintAnchor> weakReference = this.u1;
                if (weakReference != null && weakReference.get() != null) {
                    F1(this.u1.get(), this.b1.q(this.R));
                    this.u1 = null;
                }
                WeakReference<ConstraintAnchor> weakReference2 = this.w1;
                if (weakReference2 != null && weakReference2.get() != null) {
                    E1(this.w1.get(), this.b1.q(this.T));
                    this.w1 = null;
                }
                WeakReference<ConstraintAnchor> weakReference3 = this.v1;
                if (weakReference3 != null && weakReference3.get() != null) {
                    F1(this.v1.get(), this.b1.q(this.Q));
                    this.v1 = null;
                }
                WeakReference<ConstraintAnchor> weakReference4 = this.x1;
                if (weakReference4 != null && weakReference4.get() != null) {
                    E1(this.x1.get(), this.b1.q(this.S));
                    this.x1 = null;
                }
                if (zA1) {
                    this.b1.A();
                }
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("EXCEPTION : " + e);
            }
            if (zA1) {
                zE2 = e2(this.b1, g.f1915a);
            } else {
                u1(this.b1, zY1);
                for (int i10 = 0; i10 < size; i10++) {
                    this.V0.get(i10).u1(this.b1, zY1);
                }
                zE2 = false;
            }
            if (z5 && i8 < 8 && g.f1915a[2]) {
                int i11 = 0;
                int iMax3 = 0;
                int iMax4 = 0;
                while (i11 < size) {
                    ConstraintWidget constraintWidget3 = this.V0.get(i11);
                    iMax4 = Math.max(iMax4, constraintWidget3.h0 + constraintWidget3.Y());
                    iMax3 = Math.max(iMax3, constraintWidget3.i0 + constraintWidget3.z());
                    i11++;
                    zE2 = zE2;
                }
                z2 = zE2;
                int iMax5 = Math.max(this.o0, iMax4);
                int iMax6 = Math.max(this.p0, iMax3);
                ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                r14 = r14;
                if (dimensionBehaviour3 == dimensionBehaviour6 && Y() < iMax5) {
                    r14 = r14;
                    o1(iMax5);
                    this.b0[0] = dimensionBehaviour6;
                    r14 = 1;
                    z2 = true;
                }
                if (dimensionBehaviour2 == dimensionBehaviour6 && z() < iMax6) {
                    P0(iMax6);
                    this.b0[1] = dimensionBehaviour6;
                    r14 = 1;
                    z2 = true;
                }
            } else {
                z2 = zE2;
            }
            int iMax7 = Math.max(this.o0, Y());
            ?? r15 = r14;
            if (iMax7 > Y()) {
                o1(iMax7);
                this.b0[0] = ConstraintWidget.DimensionBehaviour.FIXED;
                r15 = 1;
                z2 = true;
            }
            int iMax8 = Math.max(this.p0, z());
            if (iMax8 > z()) {
                P0(iMax8);
                r6 = 1;
                this.b0[1] = ConstraintWidget.DimensionBehaviour.FIXED;
                r2 = 1;
                z2 = true;
            } else {
                r6 = 1;
                r2 = r15;
            }
            if (r2 == 0) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour7 = this.b0[0];
                ConstraintWidget.DimensionBehaviour dimensionBehaviour8 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                if (dimensionBehaviour7 == dimensionBehaviour8 && i2 > 0) {
                    r2 = r2;
                    if (Y() > i2) {
                        this.r1 = r6;
                        this.b0[0] = ConstraintWidget.DimensionBehaviour.FIXED;
                        o1(i2);
                        ?? r3 = r6;
                        z2 = r3 == true ? 1 : 0;
                        r2 = r3;
                    }
                }
                r2 = r2;
                r2 = r2;
                if (this.b0[r6] != dimensionBehaviour8 || i <= 0 || z() <= i) {
                    r13 = r2;
                    z3 = z2;
                    i3 = 8;
                } else {
                    this.s1 = r6;
                    this.b0[r6] = ConstraintWidget.DimensionBehaviour.FIXED;
                    P0(i);
                    i3 = 8;
                    z3 = true;
                    r13 = 1;
                }
            } else {
                r13 = r2;
                z3 = z2;
                i3 = 8;
            }
            zA1 = i8 > i3 ? false : z3;
            i7 = i8;
            i4 = 0;
            r14 = r13;
        }
        this.V0 = arrayList;
        if (r14 != 0) {
            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr2 = this.b0;
            dimensionBehaviourArr2[0] = dimensionBehaviour3;
            dimensionBehaviourArr2[1] = dimensionBehaviour2;
        }
        z0(this.b1.w());
    }

    public void z1(ConstraintWidget constraintWidget, int i) {
        if (i == 0) {
            B1(constraintWidget);
        } else if (i == 1) {
            G1(constraintWidget);
        }
    }
}
