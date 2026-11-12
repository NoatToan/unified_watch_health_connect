package androidx.constraintlayout.core;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import defpackage.euf;
import defpackage.z83;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static boolean f1886r = false;
    public static boolean s = true;
    public static boolean t = true;
    public static boolean u = true;
    public static boolean v = false;
    public static int w = 1000;
    public static long x;
    public static long y;
    public a d;
    public androidx.constraintlayout.core.b[] g;
    public final z83 n;
    public a q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f1887a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1888b = 0;
    public HashMap<String, SolverVariable> c = null;
    public int e = 32;
    public int f = 32;
    public boolean h = false;
    public boolean i = false;
    public boolean[] j = new boolean[32];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f1889k = 1;
    public int l = 0;
    public int m = 32;
    public SolverVariable[] o = new SolverVariable[w];
    public int p = 0;

    public interface a {
        SolverVariable a(c cVar, boolean[] zArr);

        void b(a aVar);

        void c(SolverVariable solverVariable);

        void clear();

        SolverVariable getKey();

        boolean isEmpty();
    }

    public class b extends androidx.constraintlayout.core.b {
        public b(z83 z83Var) {
            this.e = new e(this, z83Var);
        }
    }

    public c() {
        this.g = null;
        this.g = new androidx.constraintlayout.core.b[32];
        D();
        z83 z83Var = new z83();
        this.n = z83Var;
        this.d = new d(z83Var);
        if (v) {
            this.q = new b(z83Var);
        } else {
            this.q = new androidx.constraintlayout.core.b(z83Var);
        }
    }

    public static androidx.constraintlayout.core.b s(c cVar, SolverVariable solverVariable, SolverVariable solverVariable2, float f) {
        return cVar.r().j(solverVariable, solverVariable2, f);
    }

    public static euf x() {
        return null;
    }

    public void A() throws Exception {
        if (this.d.isEmpty()) {
            n();
            return;
        }
        if (!this.h && !this.i) {
            B(this.d);
            return;
        }
        for (int i = 0; i < this.l; i++) {
            if (!this.g[i].f) {
                B(this.d);
                return;
            }
        }
        n();
    }

    public void B(a aVar) throws Exception {
        u(aVar);
        C(aVar, false);
        n();
    }

    public final int C(a aVar, boolean z) {
        for (int i = 0; i < this.f1889k; i++) {
            this.j[i] = false;
        }
        boolean z2 = false;
        int i2 = 0;
        while (!z2) {
            i2++;
            if (i2 >= this.f1889k * 2) {
                return i2;
            }
            if (aVar.getKey() != null) {
                this.j[aVar.getKey().c] = true;
            }
            SolverVariable solverVariableA = aVar.a(this, this.j);
            if (solverVariableA != null) {
                boolean[] zArr = this.j;
                int i3 = solverVariableA.c;
                if (zArr[i3]) {
                    return i2;
                }
                zArr[i3] = true;
            }
            if (solverVariableA != null) {
                float f = Float.MAX_VALUE;
                int i4 = -1;
                for (int i5 = 0; i5 < this.l; i5++) {
                    androidx.constraintlayout.core.b bVar = this.g[i5];
                    if (bVar.f1884a.j != SolverVariable.Type.UNRESTRICTED && !bVar.f && bVar.t(solverVariableA)) {
                        float fD = bVar.e.d(solverVariableA);
                        if (fD < 0.0f) {
                            float f2 = (-bVar.f1885b) / fD;
                            if (f2 < f) {
                                i4 = i5;
                                f = f2;
                            }
                        }
                    }
                }
                if (i4 > -1) {
                    androidx.constraintlayout.core.b bVar2 = this.g[i4];
                    bVar2.f1884a.d = -1;
                    bVar2.x(solverVariableA);
                    SolverVariable solverVariable = bVar2.f1884a;
                    solverVariable.d = i4;
                    solverVariable.k(this, bVar2);
                }
            } else {
                z2 = true;
            }
        }
        return i2;
    }

    public final void D() {
        int i = 0;
        if (v) {
            while (i < this.l) {
                androidx.constraintlayout.core.b bVar = this.g[i];
                if (bVar != null) {
                    this.n.f41004a.release(bVar);
                }
                this.g[i] = null;
                i++;
            }
            return;
        }
        while (i < this.l) {
            androidx.constraintlayout.core.b bVar2 = this.g[i];
            if (bVar2 != null) {
                this.n.f41005b.release(bVar2);
            }
            this.g[i] = null;
            i++;
        }
    }

    public void E() {
        z83 z83Var;
        int i = 0;
        while (true) {
            z83Var = this.n;
            SolverVariable[] solverVariableArr = z83Var.d;
            if (i >= solverVariableArr.length) {
                break;
            }
            SolverVariable solverVariable = solverVariableArr[i];
            if (solverVariable != null) {
                solverVariable.e();
            }
            i++;
        }
        z83Var.c.a(this.o, this.p);
        this.p = 0;
        Arrays.fill(this.n.d, (Object) null);
        HashMap<String, SolverVariable> map = this.c;
        if (map != null) {
            map.clear();
        }
        this.f1888b = 0;
        this.d.clear();
        this.f1889k = 1;
        for (int i2 = 0; i2 < this.l; i2++) {
            androidx.constraintlayout.core.b bVar = this.g[i2];
            if (bVar != null) {
                bVar.c = false;
            }
        }
        D();
        this.l = 0;
        if (v) {
            this.q = new b(this.n);
        } else {
            this.q = new androidx.constraintlayout.core.b(this.n);
        }
    }

    public final SolverVariable a(SolverVariable.Type type, String str) {
        SolverVariable solverVariableAcquire = this.n.c.acquire();
        if (solverVariableAcquire == null) {
            solverVariableAcquire = new SolverVariable(type, str);
            solverVariableAcquire.i(type, str);
        } else {
            solverVariableAcquire.e();
            solverVariableAcquire.i(type, str);
        }
        int i = this.p;
        int i2 = w;
        if (i >= i2) {
            int i3 = i2 * 2;
            w = i3;
            this.o = (SolverVariable[]) Arrays.copyOf(this.o, i3);
        }
        SolverVariable[] solverVariableArr = this.o;
        int i4 = this.p;
        this.p = i4 + 1;
        solverVariableArr[i4] = solverVariableAcquire;
        return solverVariableAcquire;
    }

    public void b(ConstraintWidget constraintWidget, ConstraintWidget constraintWidget2, float f, int i) {
        ConstraintAnchor.Type type = ConstraintAnchor.Type.LEFT;
        SolverVariable solverVariableQ = q(constraintWidget.q(type));
        ConstraintAnchor.Type type2 = ConstraintAnchor.Type.TOP;
        SolverVariable solverVariableQ2 = q(constraintWidget.q(type2));
        ConstraintAnchor.Type type3 = ConstraintAnchor.Type.RIGHT;
        SolverVariable solverVariableQ3 = q(constraintWidget.q(type3));
        ConstraintAnchor.Type type4 = ConstraintAnchor.Type.BOTTOM;
        SolverVariable solverVariableQ4 = q(constraintWidget.q(type4));
        SolverVariable solverVariableQ5 = q(constraintWidget2.q(type));
        SolverVariable solverVariableQ6 = q(constraintWidget2.q(type2));
        SolverVariable solverVariableQ7 = q(constraintWidget2.q(type3));
        SolverVariable solverVariableQ8 = q(constraintWidget2.q(type4));
        androidx.constraintlayout.core.b bVarR = r();
        double d = f;
        double d2 = i;
        bVarR.q(solverVariableQ2, solverVariableQ4, solverVariableQ6, solverVariableQ8, (float) (Math.sin(d) * d2));
        d(bVarR);
        androidx.constraintlayout.core.b bVarR2 = r();
        bVarR2.q(solverVariableQ, solverVariableQ3, solverVariableQ5, solverVariableQ7, (float) (Math.cos(d) * d2));
        d(bVarR2);
    }

    public void c(SolverVariable solverVariable, SolverVariable solverVariable2, int i, float f, SolverVariable solverVariable3, SolverVariable solverVariable4, int i2, int i3) {
        androidx.constraintlayout.core.b bVarR = r();
        bVarR.h(solverVariable, solverVariable2, i, f, solverVariable3, solverVariable4, i2);
        if (i3 != 8) {
            bVarR.d(this, i3);
        }
        d(bVarR);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x007a  */
    public void d(androidx.constraintlayout.core.b bVar) {
        SolverVariable solverVariableV;
        if (bVar == null) {
            return;
        }
        boolean z = true;
        if (this.l + 1 >= this.m || this.f1889k + 1 >= this.f) {
            z();
        }
        if (!bVar.f) {
            bVar.D(this);
            if (bVar.isEmpty()) {
                return;
            }
            bVar.r();
            if (bVar.f(this)) {
                SolverVariable solverVariableP = p();
                bVar.f1884a = solverVariableP;
                int i = this.l;
                l(bVar);
                if (this.l == i + 1) {
                    this.q.b(bVar);
                    C(this.q, true);
                    if (solverVariableP.d == -1) {
                        if (bVar.f1884a == solverVariableP && (solverVariableV = bVar.v(solverVariableP)) != null) {
                            bVar.x(solverVariableV);
                        }
                        if (!bVar.f) {
                            bVar.f1884a.k(this, bVar);
                        }
                        if (v) {
                            this.n.f41004a.release(bVar);
                        } else {
                            this.n.f41005b.release(bVar);
                        }
                        this.l--;
                    }
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            if (!bVar.s() || z) {
                return;
            }
        }
        l(bVar);
    }

    public androidx.constraintlayout.core.b e(SolverVariable solverVariable, SolverVariable solverVariable2, int i, int i2) {
        if (s && i2 == 8 && solverVariable2.g && solverVariable.d == -1) {
            solverVariable.h(this, solverVariable2.f + i);
            return null;
        }
        androidx.constraintlayout.core.b bVarR = r();
        bVarR.n(solverVariable, solverVariable2, i);
        if (i2 != 8) {
            bVarR.d(this, i2);
        }
        d(bVarR);
        return bVarR;
    }

    public void f(SolverVariable solverVariable, int i) {
        if (s && solverVariable.d == -1) {
            float f = i;
            solverVariable.h(this, f);
            for (int i2 = 0; i2 < this.f1888b + 1; i2++) {
                SolverVariable solverVariable2 = this.n.d[i2];
                if (solverVariable2 != null && solverVariable2.n && solverVariable2.o == solverVariable.c) {
                    solverVariable2.h(this, solverVariable2.p + f);
                }
            }
            return;
        }
        int i3 = solverVariable.d;
        if (i3 == -1) {
            androidx.constraintlayout.core.b bVarR = r();
            bVarR.i(solverVariable, i);
            d(bVarR);
            return;
        }
        androidx.constraintlayout.core.b bVar = this.g[i3];
        if (bVar.f) {
            bVar.f1885b = i;
            return;
        }
        if (bVar.e.i() == 0) {
            bVar.f = true;
            bVar.f1885b = i;
        } else {
            androidx.constraintlayout.core.b bVarR2 = r();
            bVarR2.m(solverVariable, i);
            d(bVarR2);
        }
    }

    public void g(SolverVariable solverVariable, SolverVariable solverVariable2, int i, boolean z) {
        androidx.constraintlayout.core.b bVarR = r();
        SolverVariable solverVariableT = t();
        solverVariableT.e = 0;
        bVarR.o(solverVariable, solverVariable2, solverVariableT, i);
        d(bVarR);
    }

    public void h(SolverVariable solverVariable, SolverVariable solverVariable2, int i, int i2) {
        androidx.constraintlayout.core.b bVarR = r();
        SolverVariable solverVariableT = t();
        solverVariableT.e = 0;
        bVarR.o(solverVariable, solverVariable2, solverVariableT, i);
        if (i2 != 8) {
            m(bVarR, (int) (bVarR.e.d(solverVariableT) * (-1.0f)), i2);
        }
        d(bVarR);
    }

    public void i(SolverVariable solverVariable, SolverVariable solverVariable2, int i, boolean z) {
        androidx.constraintlayout.core.b bVarR = r();
        SolverVariable solverVariableT = t();
        solverVariableT.e = 0;
        bVarR.p(solverVariable, solverVariable2, solverVariableT, i);
        d(bVarR);
    }

    public void j(SolverVariable solverVariable, SolverVariable solverVariable2, int i, int i2) {
        androidx.constraintlayout.core.b bVarR = r();
        SolverVariable solverVariableT = t();
        solverVariableT.e = 0;
        bVarR.p(solverVariable, solverVariable2, solverVariableT, i);
        if (i2 != 8) {
            m(bVarR, (int) (bVarR.e.d(solverVariableT) * (-1.0f)), i2);
        }
        d(bVarR);
    }

    public void k(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f, int i) {
        androidx.constraintlayout.core.b bVarR = r();
        bVarR.k(solverVariable, solverVariable2, solverVariable3, solverVariable4, f);
        if (i != 8) {
            bVarR.d(this, i);
        }
        d(bVarR);
    }

    public final void l(androidx.constraintlayout.core.b bVar) {
        int i;
        if (t && bVar.f) {
            bVar.f1884a.h(this, bVar.f1885b);
        } else {
            androidx.constraintlayout.core.b[] bVarArr = this.g;
            int i2 = this.l;
            bVarArr[i2] = bVar;
            SolverVariable solverVariable = bVar.f1884a;
            solverVariable.d = i2;
            this.l = i2 + 1;
            solverVariable.k(this, bVar);
        }
        if (t && this.f1887a) {
            int i3 = 0;
            while (i3 < this.l) {
                if (this.g[i3] == null) {
                    System.out.println("WTF");
                }
                androidx.constraintlayout.core.b bVar2 = this.g[i3];
                if (bVar2 != null && bVar2.f) {
                    bVar2.f1884a.h(this, bVar2.f1885b);
                    if (v) {
                        this.n.f41004a.release(bVar2);
                    } else {
                        this.n.f41005b.release(bVar2);
                    }
                    this.g[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.l;
                        if (i4 >= i) {
                            break;
                        }
                        androidx.constraintlayout.core.b[] bVarArr2 = this.g;
                        int i6 = i4 - 1;
                        androidx.constraintlayout.core.b bVar3 = bVarArr2[i4];
                        bVarArr2[i6] = bVar3;
                        SolverVariable solverVariable2 = bVar3.f1884a;
                        if (solverVariable2.d == i4) {
                            solverVariable2.d = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.g[i5] = null;
                    }
                    this.l = i - 1;
                    i3--;
                }
                i3++;
            }
            this.f1887a = false;
        }
    }

    public void m(androidx.constraintlayout.core.b bVar, int i, int i2) {
        bVar.e(o(i2, null), i);
    }

    public final void n() {
        for (int i = 0; i < this.l; i++) {
            androidx.constraintlayout.core.b bVar = this.g[i];
            bVar.f1884a.f = bVar.f1885b;
        }
    }

    public SolverVariable o(int i, String str) {
        if (this.f1889k + 1 >= this.f) {
            z();
        }
        SolverVariable solverVariableA = a(SolverVariable.Type.ERROR, str);
        int i2 = this.f1888b + 1;
        this.f1888b = i2;
        this.f1889k++;
        solverVariableA.c = i2;
        solverVariableA.e = i;
        this.n.d[i2] = solverVariableA;
        this.d.c(solverVariableA);
        return solverVariableA;
    }

    public SolverVariable p() {
        if (this.f1889k + 1 >= this.f) {
            z();
        }
        SolverVariable solverVariableA = a(SolverVariable.Type.SLACK, null);
        int i = this.f1888b + 1;
        this.f1888b = i;
        this.f1889k++;
        solverVariableA.c = i;
        this.n.d[i] = solverVariableA;
        return solverVariableA;
    }

    public SolverVariable q(Object obj) {
        SolverVariable solverVariableI = null;
        if (obj == null) {
            return null;
        }
        if (this.f1889k + 1 >= this.f) {
            z();
        }
        if (obj instanceof ConstraintAnchor) {
            ConstraintAnchor constraintAnchor = (ConstraintAnchor) obj;
            solverVariableI = constraintAnchor.i();
            if (solverVariableI == null) {
                constraintAnchor.s(this.n);
                solverVariableI = constraintAnchor.i();
            }
            int i = solverVariableI.c;
            if (i == -1 || i > this.f1888b || this.n.d[i] == null) {
                if (i != -1) {
                    solverVariableI.e();
                }
                int i2 = this.f1888b + 1;
                this.f1888b = i2;
                this.f1889k++;
                solverVariableI.c = i2;
                solverVariableI.j = SolverVariable.Type.UNRESTRICTED;
                this.n.d[i2] = solverVariableI;
            }
        }
        return solverVariableI;
    }

    public androidx.constraintlayout.core.b r() {
        androidx.constraintlayout.core.b bVarAcquire;
        if (v) {
            bVarAcquire = this.n.f41004a.acquire();
            if (bVarAcquire == null) {
                bVarAcquire = new b(this.n);
                y++;
            } else {
                bVarAcquire.y();
            }
        } else {
            bVarAcquire = this.n.f41005b.acquire();
            if (bVarAcquire == null) {
                bVarAcquire = new androidx.constraintlayout.core.b(this.n);
                x++;
            } else {
                bVarAcquire.y();
            }
        }
        SolverVariable.c();
        return bVarAcquire;
    }

    public SolverVariable t() {
        if (this.f1889k + 1 >= this.f) {
            z();
        }
        SolverVariable solverVariableA = a(SolverVariable.Type.SLACK, null);
        int i = this.f1888b + 1;
        this.f1888b = i;
        this.f1889k++;
        solverVariableA.c = i;
        this.n.d[i] = solverVariableA;
        return solverVariableA;
    }

    public final int u(a aVar) throws Exception {
        for (int i = 0; i < this.l; i++) {
            androidx.constraintlayout.core.b bVar = this.g[i];
            if (bVar.f1884a.j != SolverVariable.Type.UNRESTRICTED && bVar.f1885b < 0.0f) {
                boolean z = false;
                int i2 = 0;
                while (!z) {
                    i2++;
                    float f = Float.MAX_VALUE;
                    int i3 = 0;
                    int i4 = -1;
                    int i5 = -1;
                    int i6 = 0;
                    while (true) {
                        if (i3 >= this.l) {
                            break;
                        }
                        androidx.constraintlayout.core.b bVar2 = this.g[i3];
                        if (bVar2.f1884a.j != SolverVariable.Type.UNRESTRICTED && !bVar2.f && bVar2.f1885b < 0.0f) {
                            int i7 = 9;
                            if (u) {
                                int i8 = bVar2.e.i();
                                int i9 = 0;
                                while (i9 < i8) {
                                    SolverVariable solverVariableB = bVar2.e.b(i9);
                                    float fD = bVar2.e.d(solverVariableB);
                                    if (fD > 0.0f) {
                                        int i10 = 0;
                                        while (i10 < i7) {
                                            float f2 = solverVariableB.h[i10] / fD;
                                            if ((f2 < f && i10 == i6) || i10 > i6) {
                                                i6 = i10;
                                                i5 = solverVariableB.c;
                                                i4 = i3;
                                                f = f2;
                                            }
                                            i10++;
                                            i7 = 9;
                                        }
                                    }
                                    i9++;
                                    i7 = 9;
                                }
                            } else {
                                for (int i11 = 1; i11 < this.f1889k; i11++) {
                                    SolverVariable solverVariable = this.n.d[i11];
                                    float fD2 = bVar2.e.d(solverVariable);
                                    if (fD2 > 0.0f) {
                                        for (int i12 = 0; i12 < 9; i12++) {
                                            float f3 = solverVariable.h[i12] / fD2;
                                            if ((f3 < f && i12 == i6) || i12 > i6) {
                                                i4 = i3;
                                                i5 = i11;
                                                i6 = i12;
                                                f = f3;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        i3++;
                    }
                    if (i4 != -1) {
                        androidx.constraintlayout.core.b bVar3 = this.g[i4];
                        bVar3.f1884a.d = -1;
                        bVar3.x(this.n.d[i5]);
                        SolverVariable solverVariable2 = bVar3.f1884a;
                        solverVariable2.d = i4;
                        solverVariable2.k(this, bVar3);
                    } else {
                        z = true;
                    }
                    if (i2 > this.f1889k / 2) {
                        z = true;
                    }
                }
                return i2;
            }
        }
        return 0;
    }

    public void v(euf eufVar) {
    }

    public z83 w() {
        return this.n;
    }

    public int y(Object obj) {
        SolverVariable solverVariableI = ((ConstraintAnchor) obj).i();
        if (solverVariableI != null) {
            return (int) (solverVariableI.f + 0.5f);
        }
        return 0;
    }

    public final void z() {
        int i = this.e * 2;
        this.e = i;
        this.g = (androidx.constraintlayout.core.b[]) Arrays.copyOf(this.g, i);
        z83 z83Var = this.n;
        z83Var.d = (SolverVariable[]) Arrays.copyOf(z83Var.d, this.e);
        int i2 = this.e;
        this.j = new boolean[i2];
        this.f = i2;
        this.m = i2;
    }
}
