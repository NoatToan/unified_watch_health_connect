package h5;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lh5/j0;", "", "Lh5/e0;", "layoutNode", "<init>", "(Lh5/e0;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0 f81838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f81839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f81840c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f81842e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f81843f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f81844g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f81845h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f81846i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f81847j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f81848k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f81849l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f81850m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f81851n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f81852o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public n0 f81854q;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e0.e f81841d = e0.e.Idle;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final r0 f81853p = new r0(this);

    public j0(e0 e0Var) {
        this.f81838a = e0Var;
    }

    public final c1 a() {
        return this.f81838a.P.f81683d;
    }

    public final void b() {
        e0.e eVar = this.f81838a.T.f81841d;
        if (eVar == e0.e.LayingOut || eVar == e0.e.LookaheadLayingOut) {
            if (this.f81853p.D) {
                g(true);
            } else {
                f(true);
            }
        }
        if (eVar == e0.e.LookaheadLayingOut) {
            n0 n0Var = this.f81854q;
            if (n0Var == null || !n0Var.f81914x) {
                h(true);
            } else {
                i(true);
            }
        }
    }

    public final void c(long j8) {
        n0 n0Var = this.f81854q;
        if (n0Var != null) {
            e0.e eVar = e0.e.LookaheadMeasuring;
            j0 j0Var = n0Var.f81898f;
            j0Var.f81841d = eVar;
            e0 e0Var = j0Var.f81838a;
            j0Var.f81842e = false;
            n0Var.B = j8;
            r1 snapshotObserver = i0.a(e0Var).getSnapshotObserver();
            n0.e eVar2 = n0Var.C;
            snapshotObserver.f81981a.d(e0Var, snapshotObserver.f81982b, eVar2);
            j0Var.f81843f = true;
            j0Var.f81844g = true;
            boolean zF = gl.b.F(e0Var);
            r0 r0Var = j0Var.f81853p;
            if (zF) {
                r0Var.f81973y = true;
                r0Var.f81974z = true;
            } else {
                r0Var.f81972x = true;
            }
            j0Var.f81841d = e0.e.Idle;
        }
    }

    public final void d(int i14) {
        int i15 = this.f81849l;
        this.f81849l = i14;
        if ((i15 == 0) != (i14 == 0)) {
            e0 e0VarK = this.f81838a.K();
            j0 j0Var = e0VarK != null ? e0VarK.T : null;
            if (j0Var != null) {
                int i16 = j0Var.f81849l;
                if (i14 == 0) {
                    j0Var.d(i16 - 1);
                } else {
                    j0Var.d(i16 + 1);
                }
            }
        }
    }

    public final void e(int i14) {
        int i15 = this.f81852o;
        this.f81852o = i14;
        if ((i15 == 0) != (i14 == 0)) {
            e0 e0VarK = this.f81838a.K();
            j0 j0Var = e0VarK != null ? e0VarK.T : null;
            if (j0Var != null) {
                int i16 = j0Var.f81852o;
                if (i14 == 0) {
                    j0Var.e(i16 - 1);
                } else {
                    j0Var.e(i16 + 1);
                }
            }
        }
    }

    public final void f(boolean z14) {
        if (this.f81848k != z14) {
            this.f81848k = z14;
            if (z14 && !this.f81847j) {
                d(this.f81849l + 1);
            } else {
                if (z14 || this.f81847j) {
                    return;
                }
                d(this.f81849l - 1);
            }
        }
    }

    public final void g(boolean z14) {
        if (this.f81847j != z14) {
            this.f81847j = z14;
            if (z14 && !this.f81848k) {
                d(this.f81849l + 1);
            } else {
                if (z14 || this.f81848k) {
                    return;
                }
                d(this.f81849l - 1);
            }
        }
    }

    public final void h(boolean z14) {
        if (this.f81851n != z14) {
            this.f81851n = z14;
            if (z14 && !this.f81850m) {
                e(this.f81852o + 1);
            } else {
                if (z14 || this.f81850m) {
                    return;
                }
                e(this.f81852o - 1);
            }
        }
    }

    public final void i(boolean z14) {
        if (this.f81850m != z14) {
            this.f81850m = z14;
            if (z14 && !this.f81851n) {
                e(this.f81852o + 1);
            } else {
                if (z14 || this.f81851n) {
                    return;
                }
                e(this.f81852o - 1);
            }
        }
    }

    public final void j() {
        r0 r0Var = this.f81853p;
        j0 j0Var = r0Var.f81955f;
        Object obj = r0Var.f81969t;
        e0 e0Var = this.f81838a;
        if ((obj != null || j0Var.a().getA() != null) && r0Var.f81968r) {
            r0Var.f81968r = false;
            r0Var.f81969t = j0Var.a().getA();
            e0 e0VarK = e0Var.K();
            if (e0VarK != null) {
                e0.j0(e0VarK, false, 7);
            }
        }
        n0 n0Var = this.f81854q;
        if (n0Var != null) {
            j0 j0Var2 = n0Var.f81898f;
            if (n0Var.A == null) {
                m0 m0VarD1 = j0Var2.a().D1();
                m0VarD1.getClass();
                if (m0VarD1.f81889p.getA() == null) {
                    return;
                }
            }
            if (n0Var.f81916z) {
                n0Var.f81916z = false;
                m0 m0VarD2 = j0Var2.a().D1();
                m0VarD2.getClass();
                n0Var.A = m0VarD2.f81889p.getA();
                if (gl.b.F(e0Var)) {
                    e0 e0VarK2 = e0Var.K();
                    if (e0VarK2 != null) {
                        e0.j0(e0VarK2, false, 7);
                        return;
                    }
                    return;
                }
                e0 e0VarK3 = e0Var.K();
                if (e0VarK3 != null) {
                    e0.h0(e0VarK3, false, 7);
                }
            }
        }
    }
}
