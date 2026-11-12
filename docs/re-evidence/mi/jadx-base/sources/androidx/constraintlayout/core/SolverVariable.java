package androidx.constraintlayout.core;

import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public class SolverVariable implements Comparable<SolverVariable> {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static int f1877r = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f1878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f1879b;
    public float f;
    public Type j;
    public int c = -1;
    public int d = -1;
    public int e = 0;
    public boolean g = false;
    public float[] h = new float[9];
    public float[] i = new float[9];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public b[] f1880k = new b[16];
    public int l = 0;
    public int m = 0;
    public boolean n = false;
    public int o = -1;
    public float p = 0.0f;
    public HashSet<b> q = null;

    public enum Type {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public SolverVariable(Type type, String str) {
        this.j = type;
    }

    public static void c() {
        f1877r++;
    }

    public final void a(b bVar) {
        int i = 0;
        while (true) {
            int i2 = this.l;
            if (i >= i2) {
                b[] bVarArr = this.f1880k;
                if (i2 >= bVarArr.length) {
                    this.f1880k = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.f1880k;
                int i3 = this.l;
                bVarArr2[i3] = bVar;
                this.l = i3 + 1;
                return;
            }
            if (this.f1880k[i] == bVar) {
                return;
            } else {
                i++;
            }
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(SolverVariable solverVariable) {
        return this.c - solverVariable.c;
    }

    public final void d(b bVar) {
        int i = this.l;
        int i2 = 0;
        while (i2 < i) {
            if (this.f1880k[i2] == bVar) {
                while (i2 < i - 1) {
                    b[] bVarArr = this.f1880k;
                    int i3 = i2 + 1;
                    bVarArr[i2] = bVarArr[i3];
                    i2 = i3;
                }
                this.l--;
                return;
            }
            i2++;
        }
    }

    public void e() {
        this.f1879b = null;
        this.j = Type.UNKNOWN;
        this.e = 0;
        this.c = -1;
        this.d = -1;
        this.f = 0.0f;
        this.g = false;
        this.n = false;
        this.o = -1;
        this.p = 0.0f;
        int i = this.l;
        for (int i2 = 0; i2 < i; i2++) {
            this.f1880k[i2] = null;
        }
        this.l = 0;
        this.m = 0;
        this.f1878a = false;
        Arrays.fill(this.i, 0.0f);
    }

    public void h(c cVar, float f) {
        this.f = f;
        this.g = true;
        this.n = false;
        this.o = -1;
        this.p = 0.0f;
        int i = this.l;
        this.d = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.f1880k[i2].A(cVar, this, false);
        }
        this.l = 0;
    }

    public void i(Type type, String str) {
        this.j = type;
    }

    public final void k(c cVar, b bVar) {
        int i = this.l;
        for (int i2 = 0; i2 < i; i2++) {
            this.f1880k[i2].B(cVar, bVar, false);
        }
        this.l = 0;
    }

    public String toString() {
        if (this.f1879b != null) {
            return "" + this.f1879b;
        }
        return "" + this.c;
    }
}
