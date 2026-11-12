package c2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lc2/y2;", "Lh5/c0;", "Lh4/r$c;", "Lg6/f;", "minWidth", "minHeight", "maxWidth", "maxHeight", "", "enforceIncoming", "<init>", "(FFFFZLkotlin/jvm/internal/j;)V", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class y2 extends h4.r.c implements h5.c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f22954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f22955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f22956c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f22957d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f22958e;

    /* JADX WARN: Illegal instructions before constructor call */
    public y2(float f14, float f15, float f16, float f17, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        if ((i14 & 1) != 0) {
            g6.f.f75994b.getClass();
            f14 = g6.f.f75996d;
        }
        float f18 = f14;
        if ((i14 & 2) != 0) {
            g6.f.f75994b.getClass();
            f15 = g6.f.f75996d;
        }
        float f19 = f15;
        if ((i14 & 4) != 0) {
            g6.f.f75994b.getClass();
            f16 = g6.f.f75996d;
        }
        float f22 = f16;
        if ((i14 & 8) != 0) {
            g6.f.f75994b.getClass();
            f17 = g6.f.f75996d;
        }
        this(f18, f19, f22, f17, z14, null);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    public final long U1(f5.b1 b1Var) {
        int iF0;
        int iF1;
        int iF2;
        int i14 = 0;
        if (Float.isNaN(this.f22956c)) {
            iF0 = Integer.MAX_VALUE;
        } else {
            iF0 = b1Var.f0(this.f22956c);
            if (iF0 < 0) {
                iF0 = 0;
            }
        }
        if (Float.isNaN(this.f22957d)) {
            iF1 = Integer.MAX_VALUE;
        } else {
            iF1 = b1Var.f0(this.f22957d);
            if (iF1 < 0) {
                iF1 = 0;
            }
        }
        if (Float.isNaN(this.f22954a)) {
            iF2 = 0;
        } else {
            iF2 = b1Var.f0(this.f22954a);
            if (iF2 < 0) {
                iF2 = 0;
            }
            if (iF2 > iF0) {
                iF2 = iF0;
            }
            if (iF2 == Integer.MAX_VALUE) {
                iF2 = 0;
            }
        }
        if (!Float.isNaN(this.f22955b)) {
            int iF3 = b1Var.f0(this.f22955b);
            if (iF3 < 0) {
                iF3 = 0;
            }
            if (iF3 > iF1) {
                iF3 = iF1;
            }
            if (iF3 != Integer.MAX_VALUE) {
                i14 = iF3;
            }
        }
        return g6.b.a(iF2, iF0, i14, iF1);
    }

    @Override // h5.c0
    public final int maxIntrinsicHeight(f5.x xVar, f5.w wVar, int i14) {
        long jU1 = U1((f5.b1) xVar);
        if (g6.a.g(jU1)) {
            return g6.a.i(jU1);
        }
        if (!this.f22958e) {
            i14 = g6.b.g(i14, jU1);
        }
        return g6.b.f(wVar.a0(i14), jU1);
    }

    @Override // h5.c0
    public final int maxIntrinsicWidth(f5.x xVar, f5.w wVar, int i14) {
        long jU1 = U1((f5.b1) xVar);
        if (g6.a.h(jU1)) {
            return g6.a.j(jU1);
        }
        if (!this.f22958e) {
            i14 = g6.b.f(i14, jU1);
        }
        return g6.b.g(wVar.l0(i14), jU1);
    }

    @Override // h5.c0
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final f5.a1 mo5measure3p2s80s(f5.b1 b1Var, f5.y0 y0Var, long j8) {
        int iL;
        int iJ;
        int iK;
        int i14;
        long jA;
        long jU1 = U1(b1Var);
        if (this.f22958e) {
            jA = g6.b.e(j8, jU1);
        } else {
            if (Float.isNaN(this.f22954a)) {
                iL = g6.a.l(j8);
                int iJ2 = g6.a.j(jU1);
                if (iL > iJ2) {
                    iL = iJ2;
                }
            } else {
                iL = g6.a.l(jU1);
            }
            if (Float.isNaN(this.f22956c)) {
                iJ = g6.a.j(j8);
                int iL2 = g6.a.l(jU1);
                if (iJ < iL2) {
                    iJ = iL2;
                }
            } else {
                iJ = g6.a.j(jU1);
            }
            if (Float.isNaN(this.f22955b)) {
                iK = g6.a.k(j8);
                int i15 = g6.a.i(jU1);
                if (iK > i15) {
                    iK = i15;
                }
            } else {
                iK = g6.a.k(jU1);
            }
            if (Float.isNaN(this.f22957d)) {
                i14 = g6.a.i(j8);
                int iK2 = g6.a.k(jU1);
                if (i14 < iK2) {
                    i14 = iK2;
                }
            } else {
                i14 = g6.a.i(jU1);
            }
            jA = g6.b.a(iL, iJ, iK, i14);
        }
        f5.v1 v1VarQ = y0Var.Q(jA);
        return f5.b1.h0(b1Var, v1VarQ.f69144a, v1VarQ.f69145b, new a03.k0(v1VarQ, 6));
    }

    @Override // h5.c0
    public final int minIntrinsicHeight(f5.x xVar, f5.w wVar, int i14) {
        long jU1 = U1((f5.b1) xVar);
        if (g6.a.g(jU1)) {
            return g6.a.i(jU1);
        }
        if (!this.f22958e) {
            i14 = g6.b.g(i14, jU1);
        }
        return g6.b.f(wVar.e0(i14), jU1);
    }

    @Override // h5.c0
    public final int minIntrinsicWidth(f5.x xVar, f5.w wVar, int i14) {
        long jU1 = U1((f5.b1) xVar);
        if (g6.a.h(jU1)) {
            return g6.a.j(jU1);
        }
        if (!this.f22958e) {
            i14 = g6.b.f(i14, jU1);
        }
        return g6.b.g(wVar.O(i14), jU1);
    }

    private y2(float f14, float f15, float f16, float f17, boolean z14) {
        this.f22954a = f14;
        this.f22955b = f15;
        this.f22956c = f16;
        this.f22957d = f17;
        this.f22958e = z14;
    }

    public /* synthetic */ y2(float f14, float f15, float f16, float f17, boolean z14, p005kotlin.jvm.internal.j jVar) {
        this(f14, f15, f16, f17, z14);
    }
}
