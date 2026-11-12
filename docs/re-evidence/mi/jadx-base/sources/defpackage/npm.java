package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes7.dex */
public class npm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f28233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f28234b;
    public int e;
    public long f;
    public long g;
    public boolean h;
    public int c = -1;
    public int d = -1;
    public int i = 0;
    public int j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f28235k = 0;
    public int l = 0;

    public static int c(int i) {
        if (i == 0) {
            return x44.a(aji.V);
        }
        if (i == 1) {
            return x44.a(aji.R);
        }
        if (i == 2) {
            return x44.a(aji.T);
        }
        if (i != 3) {
            return i != 4 ? x44.a(aji.common_transparent) : x44.a(aji.S);
        }
        return x44.a(aji.Q);
    }

    public static int d(Context context, int i) {
        if (i == 0) {
            return x44.a(aji.V);
        }
        if (i == 1) {
            return x44.a(aji.R);
        }
        if (i == 2) {
            return x44.a(aji.T);
        }
        if (i != 3) {
            return i != 4 ? x44.a(aji.common_transparent) : x44.a(aji.S);
        }
        return x44.a(aji.Q);
    }

    public int a(qim qimVar) {
        int i = this.c;
        if (i == -1) {
            return 0;
        }
        if (i == 0) {
            return qimVar.N0;
        }
        if (i == 1) {
            return qimVar.M0;
        }
        if (i != 2) {
            return i != 4 ? qimVar.K0 : qimVar.O0;
        }
        return qimVar.L0;
    }

    public long b() {
        return this.g - this.f;
    }
}
