package androidx.constraintlayout.core;

import defpackage.z83;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public class d extends androidx.constraintlayout.core.b {
    public int g;
    public SolverVariable[] h;
    public SolverVariable[] i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public b f1890k;
    public z83 l;

    public class a implements Comparator<SolverVariable> {
        public a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(SolverVariable solverVariable, SolverVariable solverVariable2) {
            return solverVariable.c - solverVariable2.c;
        }
    }

    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public SolverVariable f1892a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public d f1893b;

        public b(d dVar) {
            this.f1893b = dVar;
        }

        public boolean a(SolverVariable solverVariable, float f) {
            boolean z = true;
            if (!this.f1892a.f1878a) {
                for (int i = 0; i < 9; i++) {
                    float f2 = solverVariable.i[i];
                    if (f2 != 0.0f) {
                        float f3 = f2 * f;
                        if (Math.abs(f3) < 1.0E-4f) {
                            f3 = 0.0f;
                        }
                        this.f1892a.i[i] = f3;
                    } else {
                        this.f1892a.i[i] = 0.0f;
                    }
                }
                return true;
            }
            for (int i2 = 0; i2 < 9; i2++) {
                float[] fArr = this.f1892a.i;
                float f4 = fArr[i2] + (solverVariable.i[i2] * f);
                fArr[i2] = f4;
                if (Math.abs(f4) < 1.0E-4f) {
                    this.f1892a.i[i2] = 0.0f;
                } else {
                    z = false;
                }
            }
            if (z) {
                d.this.G(this.f1892a);
            }
            return false;
        }

        public void b(SolverVariable solverVariable) {
            this.f1892a = solverVariable;
        }

        public final boolean c() {
            for (int i = 8; i >= 0; i--) {
                float f = this.f1892a.i[i];
                if (f > 0.0f) {
                    return false;
                }
                if (f < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        public final boolean d(SolverVariable solverVariable) {
            for (int i = 8; i >= 0; i--) {
                float f = solverVariable.i[i];
                float f2 = this.f1892a.i[i];
                if (f2 != f) {
                    if (f2 < f) {
                        return true;
                    }
                }
            }
            return false;
        }

        public void e() {
            Arrays.fill(this.f1892a.i, 0.0f);
        }

        public String toString() {
            String str = "[ ";
            if (this.f1892a != null) {
                for (int i = 0; i < 9; i++) {
                    str = str + this.f1892a.i[i] + " ";
                }
            }
            return str + "] " + this.f1892a;
        }
    }

    public d(z83 z83Var) {
        super(z83Var);
        this.g = 128;
        this.h = new SolverVariable[128];
        this.i = new SolverVariable[128];
        this.j = 0;
        this.f1890k = new b(this);
        this.l = z83Var;
    }

    @Override // androidx.constraintlayout.core.b
    public void B(c cVar, androidx.constraintlayout.core.b bVar, boolean z) {
        SolverVariable solverVariable = bVar.f1884a;
        if (solverVariable == null) {
            return;
        }
        androidx.constraintlayout.core.b.a aVar = bVar.e;
        int i = aVar.i();
        for (int i2 = 0; i2 < i; i2++) {
            SolverVariable solverVariableB = aVar.b(i2);
            float fK = aVar.k(i2);
            this.f1890k.b(solverVariableB);
            if (this.f1890k.a(solverVariable, fK)) {
                F(solverVariableB);
            }
            this.f1885b += bVar.f1885b * fK;
        }
        G(solverVariable);
    }

    public final void F(SolverVariable solverVariable) {
        int i;
        int i2 = this.j + 1;
        SolverVariable[] solverVariableArr = this.h;
        if (i2 > solverVariableArr.length) {
            SolverVariable[] solverVariableArr2 = (SolverVariable[]) Arrays.copyOf(solverVariableArr, solverVariableArr.length * 2);
            this.h = solverVariableArr2;
            this.i = (SolverVariable[]) Arrays.copyOf(solverVariableArr2, solverVariableArr2.length * 2);
        }
        SolverVariable[] solverVariableArr3 = this.h;
        int i3 = this.j;
        solverVariableArr3[i3] = solverVariable;
        int i4 = i3 + 1;
        this.j = i4;
        if (i4 > 1 && solverVariableArr3[i3].c > solverVariable.c) {
            int i5 = 0;
            while (true) {
                i = this.j;
                if (i5 >= i) {
                    break;
                }
                this.i[i5] = this.h[i5];
                i5++;
            }
            Arrays.sort(this.i, 0, i, new a());
            for (int i6 = 0; i6 < this.j; i6++) {
                this.h[i6] = this.i[i6];
            }
        }
        solverVariable.f1878a = true;
        solverVariable.a(this);
    }

    public final void G(SolverVariable solverVariable) {
        int i = 0;
        while (i < this.j) {
            if (this.h[i] == solverVariable) {
                while (true) {
                    int i2 = this.j;
                    if (i >= i2 - 1) {
                        this.j = i2 - 1;
                        solverVariable.f1878a = false;
                        return;
                    } else {
                        SolverVariable[] solverVariableArr = this.h;
                        int i3 = i + 1;
                        solverVariableArr[i] = solverVariableArr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002e  */
    @Override // androidx.constraintlayout.core.b, androidx.constraintlayout.core.c.a
    public SolverVariable a(c cVar, boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.j; i2++) {
            SolverVariable solverVariable = this.h[i2];
            if (!zArr[solverVariable.c]) {
                this.f1890k.b(solverVariable);
                if (i == -1) {
                    if (this.f1890k.c()) {
                        i = i2;
                    }
                } else if (this.f1890k.d(this.h[i])) {
                    i = i2;
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.h[i];
    }

    @Override // androidx.constraintlayout.core.b, androidx.constraintlayout.core.c.a
    public void c(SolverVariable solverVariable) {
        this.f1890k.b(solverVariable);
        this.f1890k.e();
        solverVariable.i[solverVariable.e] = 1.0f;
        F(solverVariable);
    }

    @Override // androidx.constraintlayout.core.b, androidx.constraintlayout.core.c.a
    public void clear() {
        this.j = 0;
        this.f1885b = 0.0f;
    }

    @Override // androidx.constraintlayout.core.b, androidx.constraintlayout.core.c.a
    public boolean isEmpty() {
        return this.j == 0;
    }

    @Override // androidx.constraintlayout.core.b
    public String toString() {
        String str = " goal -> (" + this.f1885b + ") : ";
        for (int i = 0; i < this.j; i++) {
            this.f1890k.b(this.h[i]);
            str = str + this.f1890k + " ";
        }
        return str;
    }
}
