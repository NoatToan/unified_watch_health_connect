package androidx.constraintlayout.core;

import defpackage.z83;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class a implements b.a {
    public static float l = 0.001f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f1882b;
    public final z83 c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1881a = 0;
    public int d = 8;
    public SolverVariable e = null;
    public int[] f = new int[8];
    public int[] g = new int[8];
    public float[] h = new float[8];
    public int i = -1;
    public int j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f1883k = false;

    public a(b bVar, z83 z83Var) {
        this.f1882b = bVar;
        this.c = z83Var;
    }

    @Override // androidx.constraintlayout.core.b.a
    public boolean a(SolverVariable solverVariable) {
        int i = this.i;
        if (i == -1) {
            return false;
        }
        for (int i2 = 0; i != -1 && i2 < this.f1881a; i2++) {
            if (this.f[i] == solverVariable.c) {
                return true;
            }
            i = this.g[i];
        }
        return false;
    }

    @Override // androidx.constraintlayout.core.b.a
    public SolverVariable b(int i) {
        int i2 = this.i;
        for (int i3 = 0; i2 != -1 && i3 < this.f1881a; i3++) {
            if (i3 == i) {
                return this.c.d[this.f[i2]];
            }
            i2 = this.g[i2];
        }
        return null;
    }

    @Override // androidx.constraintlayout.core.b.a
    public final void c(SolverVariable solverVariable, float f) {
        if (f == 0.0f) {
            h(solverVariable, true);
            return;
        }
        int i = this.i;
        if (i == -1) {
            this.i = 0;
            this.h[0] = f;
            this.f[0] = solverVariable.c;
            this.g[0] = -1;
            solverVariable.m++;
            solverVariable.a(this.f1882b);
            this.f1881a++;
            if (this.f1883k) {
                return;
            }
            int i2 = this.j + 1;
            this.j = i2;
            int[] iArr = this.f;
            if (i2 >= iArr.length) {
                this.f1883k = true;
                this.j = iArr.length - 1;
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.f1881a; i4++) {
            int i5 = this.f[i];
            int i6 = solverVariable.c;
            if (i5 == i6) {
                this.h[i] = f;
                return;
            }
            if (i5 < i6) {
                i3 = i;
            }
            i = this.g[i];
        }
        int length = this.j;
        int i7 = length + 1;
        if (this.f1883k) {
            int[] iArr2 = this.f;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i7;
        }
        int[] iArr3 = this.f;
        if (length >= iArr3.length && this.f1881a < iArr3.length) {
            int i8 = 0;
            while (true) {
                int[] iArr4 = this.f;
                if (i8 >= iArr4.length) {
                    break;
                }
                if (iArr4[i8] == -1) {
                    length = i8;
                    break;
                }
                i8++;
            }
        }
        int[] iArr5 = this.f;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i9 = this.d * 2;
            this.d = i9;
            this.f1883k = false;
            this.j = length - 1;
            this.h = Arrays.copyOf(this.h, i9);
            this.f = Arrays.copyOf(this.f, this.d);
            this.g = Arrays.copyOf(this.g, this.d);
        }
        this.f[length] = solverVariable.c;
        this.h[length] = f;
        if (i3 != -1) {
            int[] iArr6 = this.g;
            iArr6[length] = iArr6[i3];
            iArr6[i3] = length;
        } else {
            this.g[length] = this.i;
            this.i = length;
        }
        solverVariable.m++;
        solverVariable.a(this.f1882b);
        int i10 = this.f1881a + 1;
        this.f1881a = i10;
        if (!this.f1883k) {
            this.j++;
        }
        int[] iArr7 = this.f;
        if (i10 >= iArr7.length) {
            this.f1883k = true;
        }
        if (this.j >= iArr7.length) {
            this.f1883k = true;
            this.j = iArr7.length - 1;
        }
    }

    @Override // androidx.constraintlayout.core.b.a
    public final void clear() {
        int i = this.i;
        for (int i2 = 0; i != -1 && i2 < this.f1881a; i2++) {
            SolverVariable solverVariable = this.c.d[this.f[i]];
            if (solverVariable != null) {
                solverVariable.d(this.f1882b);
            }
            i = this.g[i];
        }
        this.i = -1;
        this.j = -1;
        this.f1883k = false;
        this.f1881a = 0;
    }

    @Override // androidx.constraintlayout.core.b.a
    public final float d(SolverVariable solverVariable) {
        int i = this.i;
        for (int i2 = 0; i != -1 && i2 < this.f1881a; i2++) {
            if (this.f[i] == solverVariable.c) {
                return this.h[i];
            }
            i = this.g[i];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.b.a
    public void e(float f) {
        int i = this.i;
        for (int i2 = 0; i != -1 && i2 < this.f1881a; i2++) {
            float[] fArr = this.h;
            fArr[i] = fArr[i] / f;
            i = this.g[i];
        }
    }

    @Override // androidx.constraintlayout.core.b.a
    public void f(SolverVariable solverVariable, float f, boolean z) {
        float f2 = l;
        if (f <= (-f2) || f >= f2) {
            int i = this.i;
            if (i == -1) {
                this.i = 0;
                this.h[0] = f;
                this.f[0] = solverVariable.c;
                this.g[0] = -1;
                solverVariable.m++;
                solverVariable.a(this.f1882b);
                this.f1881a++;
                if (this.f1883k) {
                    return;
                }
                int i2 = this.j + 1;
                this.j = i2;
                int[] iArr = this.f;
                if (i2 >= iArr.length) {
                    this.f1883k = true;
                    this.j = iArr.length - 1;
                    return;
                }
                return;
            }
            int i3 = -1;
            for (int i4 = 0; i != -1 && i4 < this.f1881a; i4++) {
                int i5 = this.f[i];
                int i6 = solverVariable.c;
                if (i5 == i6) {
                    float[] fArr = this.h;
                    float f3 = fArr[i] + f;
                    float f4 = l;
                    if (f3 > (-f4) && f3 < f4) {
                        f3 = 0.0f;
                    }
                    fArr[i] = f3;
                    if (f3 == 0.0f) {
                        if (i == this.i) {
                            this.i = this.g[i];
                        } else {
                            int[] iArr2 = this.g;
                            iArr2[i3] = iArr2[i];
                        }
                        if (z) {
                            solverVariable.d(this.f1882b);
                        }
                        if (this.f1883k) {
                            this.j = i;
                        }
                        solverVariable.m--;
                        this.f1881a--;
                        return;
                    }
                    return;
                }
                if (i5 < i6) {
                    i3 = i;
                }
                i = this.g[i];
            }
            int length = this.j;
            int i7 = length + 1;
            if (this.f1883k) {
                int[] iArr3 = this.f;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i7;
            }
            int[] iArr4 = this.f;
            if (length >= iArr4.length && this.f1881a < iArr4.length) {
                int i8 = 0;
                while (true) {
                    int[] iArr5 = this.f;
                    if (i8 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i8] == -1) {
                        length = i8;
                        break;
                    }
                    i8++;
                }
            }
            int[] iArr6 = this.f;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i9 = this.d * 2;
                this.d = i9;
                this.f1883k = false;
                this.j = length - 1;
                this.h = Arrays.copyOf(this.h, i9);
                this.f = Arrays.copyOf(this.f, this.d);
                this.g = Arrays.copyOf(this.g, this.d);
            }
            this.f[length] = solverVariable.c;
            this.h[length] = f;
            if (i3 != -1) {
                int[] iArr7 = this.g;
                iArr7[length] = iArr7[i3];
                iArr7[i3] = length;
            } else {
                this.g[length] = this.i;
                this.i = length;
            }
            solverVariable.m++;
            solverVariable.a(this.f1882b);
            this.f1881a++;
            if (!this.f1883k) {
                this.j++;
            }
            int i10 = this.j;
            int[] iArr8 = this.f;
            if (i10 >= iArr8.length) {
                this.f1883k = true;
                this.j = iArr8.length - 1;
            }
        }
    }

    @Override // androidx.constraintlayout.core.b.a
    public void g() {
        int i = this.i;
        for (int i2 = 0; i != -1 && i2 < this.f1881a; i2++) {
            float[] fArr = this.h;
            fArr[i] = fArr[i] * (-1.0f);
            i = this.g[i];
        }
    }

    @Override // androidx.constraintlayout.core.b.a
    public final float h(SolverVariable solverVariable, boolean z) {
        if (this.e == solverVariable) {
            this.e = null;
        }
        int i = this.i;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f1881a) {
            if (this.f[i] == solverVariable.c) {
                if (i == this.i) {
                    this.i = this.g[i];
                } else {
                    int[] iArr = this.g;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    solverVariable.d(this.f1882b);
                }
                solverVariable.m--;
                this.f1881a--;
                this.f[i] = -1;
                if (this.f1883k) {
                    this.j = i;
                }
                return this.h[i];
            }
            i2++;
            i3 = i;
            i = this.g[i];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.b.a
    public int i() {
        return this.f1881a;
    }

    @Override // androidx.constraintlayout.core.b.a
    public float j(b bVar, boolean z) {
        float fD = d(bVar.f1884a);
        h(bVar.f1884a, z);
        b.a aVar = bVar.e;
        int i = aVar.i();
        for (int i2 = 0; i2 < i; i2++) {
            SolverVariable solverVariableB = aVar.b(i2);
            f(solverVariableB, aVar.d(solverVariableB) * fD, z);
        }
        return fD;
    }

    @Override // androidx.constraintlayout.core.b.a
    public float k(int i) {
        int i2 = this.i;
        for (int i3 = 0; i2 != -1 && i3 < this.f1881a; i3++) {
            if (i3 == i) {
                return this.h[i2];
            }
            i2 = this.g[i2];
        }
        return 0.0f;
    }

    public String toString() {
        int i = this.i;
        String str = "";
        for (int i2 = 0; i != -1 && i2 < this.f1881a; i2++) {
            str = ((str + " -> ") + this.h[i] + " : ") + this.c.d[this.f[i]];
            i = this.g[i];
        }
        return str;
    }
}
