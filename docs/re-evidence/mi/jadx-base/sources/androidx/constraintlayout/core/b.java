package androidx.constraintlayout.core;

import defpackage.z83;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class b implements c.a {
    public a e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SolverVariable f1884a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f1885b = 0.0f;
    public boolean c = false;
    public ArrayList<SolverVariable> d = new ArrayList<>();
    public boolean f = false;

    public interface a {
        boolean a(SolverVariable solverVariable);

        SolverVariable b(int i);

        void c(SolverVariable solverVariable, float f);

        void clear();

        float d(SolverVariable solverVariable);

        void e(float f);

        void f(SolverVariable solverVariable, float f, boolean z);

        void g();

        float h(SolverVariable solverVariable, boolean z);

        int i();

        float j(b bVar, boolean z);

        float k(int i);
    }

    public b() {
    }

    public void A(c cVar, SolverVariable solverVariable, boolean z) {
        if (solverVariable == null || !solverVariable.g) {
            return;
        }
        this.f1885b += solverVariable.f * this.e.d(solverVariable);
        this.e.h(solverVariable, z);
        if (z) {
            solverVariable.d(this);
        }
        if (c.t && this.e.i() == 0) {
            this.f = true;
            cVar.f1887a = true;
        }
    }

    public void B(c cVar, b bVar, boolean z) {
        this.f1885b += bVar.f1885b * this.e.j(bVar, z);
        if (z) {
            bVar.f1884a.d(this);
        }
        if (c.t && this.f1884a != null && this.e.i() == 0) {
            this.f = true;
            cVar.f1887a = true;
        }
    }

    public void C(c cVar, SolverVariable solverVariable, boolean z) {
        if (solverVariable == null || !solverVariable.n) {
            return;
        }
        float fD = this.e.d(solverVariable);
        this.f1885b += solverVariable.p * fD;
        this.e.h(solverVariable, z);
        if (z) {
            solverVariable.d(this);
        }
        this.e.f(cVar.n.d[solverVariable.o], fD, z);
        if (c.t && this.e.i() == 0) {
            this.f = true;
            cVar.f1887a = true;
        }
    }

    public void D(c cVar) {
        if (cVar.g.length == 0) {
            return;
        }
        boolean z = false;
        while (!z) {
            int i = this.e.i();
            for (int i2 = 0; i2 < i; i2++) {
                SolverVariable solverVariableB = this.e.b(i2);
                if (solverVariableB.d != -1 || solverVariableB.g || solverVariableB.n) {
                    this.d.add(solverVariableB);
                }
            }
            int size = this.d.size();
            if (size > 0) {
                for (int i3 = 0; i3 < size; i3++) {
                    SolverVariable solverVariable = this.d.get(i3);
                    if (solverVariable.g) {
                        A(cVar, solverVariable, true);
                    } else if (solverVariable.n) {
                        C(cVar, solverVariable, true);
                    } else {
                        B(cVar, cVar.g[solverVariable.d], true);
                    }
                }
                this.d.clear();
            } else {
                z = true;
            }
        }
        if (c.t && this.f1884a != null && this.e.i() == 0) {
            this.f = true;
            cVar.f1887a = true;
        }
    }

    @Override // androidx.constraintlayout.core.c.a
    public SolverVariable a(c cVar, boolean[] zArr) {
        return w(zArr, null);
    }

    @Override // androidx.constraintlayout.core.c.a
    public void b(c.a aVar) {
        if (aVar instanceof b) {
            b bVar = (b) aVar;
            this.f1884a = null;
            this.e.clear();
            for (int i = 0; i < bVar.e.i(); i++) {
                this.e.f(bVar.e.b(i), bVar.e.k(i), true);
            }
        }
    }

    @Override // androidx.constraintlayout.core.c.a
    public void c(SolverVariable solverVariable) {
        int i = solverVariable.e;
        float f = 1.0f;
        if (i != 1) {
            if (i == 2) {
                f = 1000.0f;
            } else if (i == 3) {
                f = 1000000.0f;
            } else if (i == 4) {
                f = 1.0E9f;
            } else if (i == 5) {
                f = 1.0E12f;
            }
        }
        this.e.c(solverVariable, f);
    }

    @Override // androidx.constraintlayout.core.c.a
    public void clear() {
        this.e.clear();
        this.f1884a = null;
        this.f1885b = 0.0f;
    }

    public b d(c cVar, int i) {
        this.e.c(cVar.o(i, "ep"), 1.0f);
        this.e.c(cVar.o(i, "em"), -1.0f);
        return this;
    }

    public b e(SolverVariable solverVariable, int i) {
        this.e.c(solverVariable, i);
        return this;
    }

    public boolean f(c cVar) {
        boolean z;
        SolverVariable solverVariableG = g(cVar);
        if (solverVariableG == null) {
            z = true;
        } else {
            x(solverVariableG);
            z = false;
        }
        if (this.e.i() == 0) {
            this.f = true;
        }
        return z;
    }

    public SolverVariable g(c cVar) {
        int i = this.e.i();
        SolverVariable solverVariable = null;
        float f = 0.0f;
        float f2 = 0.0f;
        boolean z = false;
        boolean z2 = false;
        SolverVariable solverVariable2 = null;
        for (int i2 = 0; i2 < i; i2++) {
            float fK = this.e.k(i2);
            SolverVariable solverVariableB = this.e.b(i2);
            if (solverVariableB.j == SolverVariable.Type.UNRESTRICTED) {
                if (solverVariable == null || f > fK) {
                    boolean zU = u(solverVariableB, cVar);
                    z = zU;
                    f = fK;
                    solverVariable = solverVariableB;
                } else if (!z && u(solverVariableB, cVar)) {
                    f = fK;
                    solverVariable = solverVariableB;
                    z = true;
                }
            } else if (solverVariable == null && fK < 0.0f) {
                if (solverVariable2 == null || f2 > fK) {
                    boolean zU2 = u(solverVariableB, cVar);
                    z2 = zU2;
                    f2 = fK;
                    solverVariable2 = solverVariableB;
                } else if (!z2 && u(solverVariableB, cVar)) {
                    f2 = fK;
                    solverVariable2 = solverVariableB;
                    z2 = true;
                }
            }
        }
        return solverVariable != null ? solverVariable : solverVariable2;
    }

    @Override // androidx.constraintlayout.core.c.a
    public SolverVariable getKey() {
        return this.f1884a;
    }

    public b h(SolverVariable solverVariable, SolverVariable solverVariable2, int i, float f, SolverVariable solverVariable3, SolverVariable solverVariable4, int i2) {
        if (solverVariable2 == solverVariable3) {
            this.e.c(solverVariable, 1.0f);
            this.e.c(solverVariable4, 1.0f);
            this.e.c(solverVariable2, -2.0f);
            return this;
        }
        if (f == 0.5f) {
            this.e.c(solverVariable, 1.0f);
            this.e.c(solverVariable2, -1.0f);
            this.e.c(solverVariable3, -1.0f);
            this.e.c(solverVariable4, 1.0f);
            if (i > 0 || i2 > 0) {
                this.f1885b = (-i) + i2;
            }
        } else if (f <= 0.0f) {
            this.e.c(solverVariable, -1.0f);
            this.e.c(solverVariable2, 1.0f);
            this.f1885b = i;
        } else if (f >= 1.0f) {
            this.e.c(solverVariable4, -1.0f);
            this.e.c(solverVariable3, 1.0f);
            this.f1885b = -i2;
        } else {
            float f2 = 1.0f - f;
            this.e.c(solverVariable, f2 * 1.0f);
            this.e.c(solverVariable2, f2 * (-1.0f));
            this.e.c(solverVariable3, (-1.0f) * f);
            this.e.c(solverVariable4, 1.0f * f);
            if (i > 0 || i2 > 0) {
                this.f1885b = ((-i) * f2) + (i2 * f);
            }
        }
        return this;
    }

    public b i(SolverVariable solverVariable, int i) {
        this.f1884a = solverVariable;
        float f = i;
        solverVariable.f = f;
        this.f1885b = f;
        this.f = true;
        return this;
    }

    @Override // androidx.constraintlayout.core.c.a
    public boolean isEmpty() {
        return this.f1884a == null && this.f1885b == 0.0f && this.e.i() == 0;
    }

    public b j(SolverVariable solverVariable, SolverVariable solverVariable2, float f) {
        this.e.c(solverVariable, -1.0f);
        this.e.c(solverVariable2, f);
        return this;
    }

    public b k(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f) {
        this.e.c(solverVariable, -1.0f);
        this.e.c(solverVariable2, 1.0f);
        this.e.c(solverVariable3, f);
        this.e.c(solverVariable4, -f);
        return this;
    }

    public b l(float f, float f2, float f3, SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4) {
        this.f1885b = 0.0f;
        if (f2 == 0.0f || f == f3) {
            this.e.c(solverVariable, 1.0f);
            this.e.c(solverVariable2, -1.0f);
            this.e.c(solverVariable4, 1.0f);
            this.e.c(solverVariable3, -1.0f);
        } else if (f == 0.0f) {
            this.e.c(solverVariable, 1.0f);
            this.e.c(solverVariable2, -1.0f);
        } else if (f3 == 0.0f) {
            this.e.c(solverVariable3, 1.0f);
            this.e.c(solverVariable4, -1.0f);
        } else {
            float f4 = (f / f2) / (f3 / f2);
            this.e.c(solverVariable, 1.0f);
            this.e.c(solverVariable2, -1.0f);
            this.e.c(solverVariable4, f4);
            this.e.c(solverVariable3, -f4);
        }
        return this;
    }

    public b m(SolverVariable solverVariable, int i) {
        if (i < 0) {
            this.f1885b = i * (-1);
            this.e.c(solverVariable, 1.0f);
        } else {
            this.f1885b = i;
            this.e.c(solverVariable, -1.0f);
        }
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001e  */
    public b n(SolverVariable solverVariable, SolverVariable solverVariable2, int i) {
        boolean z;
        if (i == 0) {
            this.e.c(solverVariable, -1.0f);
            this.e.c(solverVariable2, 1.0f);
        } else {
            if (i < 0) {
                i *= -1;
                z = true;
            } else {
                z = false;
            }
            this.f1885b = i;
            if (z) {
                this.e.c(solverVariable, 1.0f);
                this.e.c(solverVariable2, -1.0f);
            } else {
                this.e.c(solverVariable, -1.0f);
                this.e.c(solverVariable2, 1.0f);
            }
        }
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0023  */
    public b o(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i) {
        boolean z;
        if (i == 0) {
            this.e.c(solverVariable, -1.0f);
            this.e.c(solverVariable2, 1.0f);
            this.e.c(solverVariable3, 1.0f);
        } else {
            if (i < 0) {
                i *= -1;
                z = true;
            } else {
                z = false;
            }
            this.f1885b = i;
            if (z) {
                this.e.c(solverVariable, 1.0f);
                this.e.c(solverVariable2, -1.0f);
                this.e.c(solverVariable3, -1.0f);
            } else {
                this.e.c(solverVariable, -1.0f);
                this.e.c(solverVariable2, 1.0f);
                this.e.c(solverVariable3, 1.0f);
            }
        }
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0023  */
    public b p(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i) {
        boolean z;
        if (i == 0) {
            this.e.c(solverVariable, -1.0f);
            this.e.c(solverVariable2, 1.0f);
            this.e.c(solverVariable3, -1.0f);
        } else {
            if (i < 0) {
                i *= -1;
                z = true;
            } else {
                z = false;
            }
            this.f1885b = i;
            if (z) {
                this.e.c(solverVariable, 1.0f);
                this.e.c(solverVariable2, -1.0f);
                this.e.c(solverVariable3, 1.0f);
            } else {
                this.e.c(solverVariable, -1.0f);
                this.e.c(solverVariable2, 1.0f);
                this.e.c(solverVariable3, -1.0f);
            }
        }
        return this;
    }

    public b q(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f) {
        this.e.c(solverVariable3, 0.5f);
        this.e.c(solverVariable4, 0.5f);
        this.e.c(solverVariable, -0.5f);
        this.e.c(solverVariable2, -0.5f);
        this.f1885b = -f;
        return this;
    }

    public void r() {
        float f = this.f1885b;
        if (f < 0.0f) {
            this.f1885b = f * (-1.0f);
            this.e.g();
        }
    }

    public boolean s() {
        SolverVariable solverVariable = this.f1884a;
        return solverVariable != null && (solverVariable.j == SolverVariable.Type.UNRESTRICTED || this.f1885b >= 0.0f);
    }

    public boolean t(SolverVariable solverVariable) {
        return this.e.a(solverVariable);
    }

    public String toString() {
        return z();
    }

    public final boolean u(SolverVariable solverVariable, c cVar) {
        return solverVariable.m <= 1;
    }

    public SolverVariable v(SolverVariable solverVariable) {
        return w(null, solverVariable);
    }

    public final SolverVariable w(boolean[] zArr, SolverVariable solverVariable) {
        SolverVariable.Type type;
        int i = this.e.i();
        SolverVariable solverVariable2 = null;
        float f = 0.0f;
        for (int i2 = 0; i2 < i; i2++) {
            float fK = this.e.k(i2);
            if (fK < 0.0f) {
                SolverVariable solverVariableB = this.e.b(i2);
                if ((zArr == null || !zArr[solverVariableB.c]) && solverVariableB != solverVariable && (((type = solverVariableB.j) == SolverVariable.Type.SLACK || type == SolverVariable.Type.ERROR) && fK < f)) {
                    f = fK;
                    solverVariable2 = solverVariableB;
                }
            }
        }
        return solverVariable2;
    }

    public void x(SolverVariable solverVariable) {
        SolverVariable solverVariable2 = this.f1884a;
        if (solverVariable2 != null) {
            this.e.c(solverVariable2, -1.0f);
            this.f1884a.d = -1;
            this.f1884a = null;
        }
        float fH = this.e.h(solverVariable, true) * (-1.0f);
        this.f1884a = solverVariable;
        if (fH == 1.0f) {
            return;
        }
        this.f1885b /= fH;
        this.e.e(fH);
    }

    public void y() {
        this.f1884a = null;
        this.e.clear();
        this.f1885b = 0.0f;
        this.f = false;
    }

    public String z() {
        boolean z;
        String str = (this.f1884a == null ? "0" : "" + this.f1884a) + " = ";
        if (this.f1885b != 0.0f) {
            str = str + this.f1885b;
            z = true;
        } else {
            z = false;
        }
        int i = this.e.i();
        for (int i2 = 0; i2 < i; i2++) {
            SolverVariable solverVariableB = this.e.b(i2);
            if (solverVariableB != null) {
                float fK = this.e.k(i2);
                if (fK != 0.0f) {
                    String string = solverVariableB.toString();
                    if (z) {
                        if (fK > 0.0f) {
                            str = str + " + ";
                        } else {
                            str = str + " - ";
                            fK *= -1.0f;
                        }
                    } else if (fK < 0.0f) {
                        str = str + "- ";
                        fK *= -1.0f;
                    }
                    str = fK == 1.0f ? str + string : str + fK + " " + string;
                    z = true;
                }
            }
        }
        if (z) {
            return str;
        }
        return str + "0.0";
    }

    public b(z83 z83Var) {
        this.e = new androidx.constraintlayout.core.a(this, z83Var);
    }
}
