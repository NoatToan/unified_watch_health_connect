package androidx.constraintlayout.core;

import defpackage.z83;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class e implements b.a {
    public static float n = 0.001f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1894a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1895b = 16;
    public int c = 16;
    public int[] d = new int[16];
    public int[] e = new int[16];
    public int[] f = new int[16];
    public float[] g = new float[16];
    public int[] h = new int[16];
    public int[] i = new int[16];
    public int j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f1896k = -1;
    public final b l;
    public final z83 m;

    public e(b bVar, z83 z83Var) {
        this.l = bVar;
        this.m = z83Var;
        clear();
    }

    @Override // androidx.constraintlayout.core.b.a
    public boolean a(SolverVariable solverVariable) {
        return p(solverVariable) != -1;
    }

    @Override // androidx.constraintlayout.core.b.a
    public SolverVariable b(int i) {
        int i2 = this.j;
        if (i2 == 0) {
            return null;
        }
        int i3 = this.f1896k;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i && i3 != -1) {
                return this.m.d[this.f[i3]];
            }
            i3 = this.i[i3];
            if (i3 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // androidx.constraintlayout.core.b.a
    public void c(SolverVariable solverVariable, float f) {
        float f2 = n;
        if (f > (-f2) && f < f2) {
            h(solverVariable, true);
            return;
        }
        if (this.j == 0) {
            m(0, solverVariable, f);
            l(solverVariable, 0);
            this.f1896k = 0;
            return;
        }
        int iP = p(solverVariable);
        if (iP != -1) {
            this.g[iP] = f;
            return;
        }
        if (this.j + 1 >= this.f1895b) {
            o();
        }
        int i = this.j;
        int i2 = this.f1896k;
        int i3 = -1;
        for (int i4 = 0; i4 < i; i4++) {
            int i5 = this.f[i2];
            int i6 = solverVariable.c;
            if (i5 == i6) {
                this.g[i2] = f;
                return;
            }
            if (i5 < i6) {
                i3 = i2;
            }
            i2 = this.i[i2];
            if (i2 == -1) {
                break;
            }
        }
        q(i3, solverVariable, f);
    }

    @Override // androidx.constraintlayout.core.b.a
    public void clear() {
        int i = this.j;
        for (int i2 = 0; i2 < i; i2++) {
            SolverVariable solverVariableB = b(i2);
            if (solverVariableB != null) {
                solverVariableB.d(this.l);
            }
        }
        for (int i3 = 0; i3 < this.f1895b; i3++) {
            this.f[i3] = -1;
            this.e[i3] = -1;
        }
        for (int i4 = 0; i4 < this.c; i4++) {
            this.d[i4] = -1;
        }
        this.j = 0;
        this.f1896k = -1;
    }

    @Override // androidx.constraintlayout.core.b.a
    public float d(SolverVariable solverVariable) {
        int iP = p(solverVariable);
        if (iP != -1) {
            return this.g[iP];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.b.a
    public void e(float f) {
        int i = this.j;
        int i2 = this.f1896k;
        for (int i3 = 0; i3 < i; i3++) {
            float[] fArr = this.g;
            fArr[i2] = fArr[i2] / f;
            i2 = this.i[i2];
            if (i2 == -1) {
                return;
            }
        }
    }

    @Override // androidx.constraintlayout.core.b.a
    public void f(SolverVariable solverVariable, float f, boolean z) {
        float f2 = n;
        if (f <= (-f2) || f >= f2) {
            int iP = p(solverVariable);
            if (iP == -1) {
                c(solverVariable, f);
                return;
            }
            float[] fArr = this.g;
            float f3 = fArr[iP] + f;
            fArr[iP] = f3;
            float f4 = n;
            if (f3 <= (-f4) || f3 >= f4) {
                return;
            }
            fArr[iP] = 0.0f;
            h(solverVariable, z);
        }
    }

    @Override // androidx.constraintlayout.core.b.a
    public void g() {
        int i = this.j;
        int i2 = this.f1896k;
        for (int i3 = 0; i3 < i; i3++) {
            float[] fArr = this.g;
            fArr[i2] = fArr[i2] * (-1.0f);
            i2 = this.i[i2];
            if (i2 == -1) {
                return;
            }
        }
    }

    @Override // androidx.constraintlayout.core.b.a
    public float h(SolverVariable solverVariable, boolean z) {
        int iP = p(solverVariable);
        if (iP == -1) {
            return 0.0f;
        }
        r(solverVariable);
        float f = this.g[iP];
        if (this.f1896k == iP) {
            this.f1896k = this.i[iP];
        }
        this.f[iP] = -1;
        int[] iArr = this.h;
        int i = iArr[iP];
        if (i != -1) {
            int[] iArr2 = this.i;
            iArr2[i] = iArr2[iP];
        }
        int i2 = this.i[iP];
        if (i2 != -1) {
            iArr[i2] = iArr[iP];
        }
        this.j--;
        solverVariable.m--;
        if (z) {
            solverVariable.d(this.l);
        }
        return f;
    }

    @Override // androidx.constraintlayout.core.b.a
    public int i() {
        return this.j;
    }

    @Override // androidx.constraintlayout.core.b.a
    public float j(b bVar, boolean z) {
        float fD = d(bVar.f1884a);
        h(bVar.f1884a, z);
        e eVar = (e) bVar.e;
        int i = eVar.i();
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            int i4 = eVar.f[i3];
            if (i4 != -1) {
                f(this.m.d[i4], eVar.g[i3] * fD, z);
                i2++;
            }
            i3++;
        }
        return fD;
    }

    @Override // androidx.constraintlayout.core.b.a
    public float k(int i) {
        int i2 = this.j;
        int i3 = this.f1896k;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i) {
                return this.g[i3];
            }
            i3 = this.i[i3];
            if (i3 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    public final void l(SolverVariable solverVariable, int i) {
        int[] iArr;
        int i2 = solverVariable.c % this.c;
        int[] iArr2 = this.d;
        int i3 = iArr2[i2];
        if (i3 == -1) {
            iArr2[i2] = i;
        } else {
            while (true) {
                iArr = this.e;
                int i4 = iArr[i3];
                if (i4 == -1) {
                    break;
                } else {
                    i3 = i4;
                }
            }
            iArr[i3] = i;
        }
        this.e[i] = -1;
    }

    public final void m(int i, SolverVariable solverVariable, float f) {
        this.f[i] = solverVariable.c;
        this.g[i] = f;
        this.h[i] = -1;
        this.i[i] = -1;
        solverVariable.a(this.l);
        solverVariable.m++;
        this.j++;
    }

    public final int n() {
        for (int i = 0; i < this.f1895b; i++) {
            if (this.f[i] == -1) {
                return i;
            }
        }
        return -1;
    }

    public final void o() {
        int i = this.f1895b * 2;
        this.f = Arrays.copyOf(this.f, i);
        this.g = Arrays.copyOf(this.g, i);
        this.h = Arrays.copyOf(this.h, i);
        this.i = Arrays.copyOf(this.i, i);
        this.e = Arrays.copyOf(this.e, i);
        for (int i2 = this.f1895b; i2 < i; i2++) {
            this.f[i2] = -1;
            this.e[i2] = -1;
        }
        this.f1895b = i;
    }

    public int p(SolverVariable solverVariable) {
        if (this.j != 0 && solverVariable != null) {
            int i = solverVariable.c;
            int i2 = this.d[i % this.c];
            if (i2 == -1) {
                return -1;
            }
            if (this.f[i2] == i) {
                return i2;
            }
            do {
                i2 = this.e[i2];
                if (i2 == -1) {
                    break;
                }
            } while (this.f[i2] != i);
            if (i2 != -1 && this.f[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    public final void q(int i, SolverVariable solverVariable, float f) {
        int iN = n();
        m(iN, solverVariable, f);
        if (i != -1) {
            this.h[iN] = i;
            int[] iArr = this.i;
            iArr[iN] = iArr[i];
            iArr[i] = iN;
        } else {
            this.h[iN] = -1;
            if (this.j > 0) {
                this.i[iN] = this.f1896k;
                this.f1896k = iN;
            } else {
                this.i[iN] = -1;
            }
        }
        int i2 = this.i[iN];
        if (i2 != -1) {
            this.h[i2] = iN;
        }
        l(solverVariable, iN);
    }

    public final void r(SolverVariable solverVariable) {
        int[] iArr;
        int i;
        int i2 = solverVariable.c;
        int i3 = i2 % this.c;
        int[] iArr2 = this.d;
        int i4 = iArr2[i3];
        if (i4 == -1) {
            return;
        }
        if (this.f[i4] == i2) {
            int[] iArr3 = this.e;
            iArr2[i3] = iArr3[i4];
            iArr3[i4] = -1;
            return;
        }
        while (true) {
            iArr = this.e;
            i = iArr[i4];
            if (i == -1 || this.f[i] == i2) {
                break;
            } else {
                i4 = i;
            }
        }
        if (i == -1 || this.f[i] != i2) {
            return;
        }
        iArr[i4] = iArr[i];
        iArr[i] = -1;
    }

    public String toString() {
        String str = hashCode() + " { ";
        int i = this.j;
        for (int i2 = 0; i2 < i; i2++) {
            SolverVariable solverVariableB = b(i2);
            if (solverVariableB != null) {
                String str2 = str + solverVariableB + " = " + k(i2) + " ";
                int iP = p(solverVariableB);
                String str3 = str2 + "[p: ";
                String str4 = (this.h[iP] != -1 ? str3 + this.m.d[this.f[this.h[iP]]] : str3 + "none") + ", n: ";
                str = (this.i[iP] != -1 ? str4 + this.m.d[this.f[this.i[iP]]] : str4 + "none") + "]";
            }
        }
        return str + " }";
    }
}
