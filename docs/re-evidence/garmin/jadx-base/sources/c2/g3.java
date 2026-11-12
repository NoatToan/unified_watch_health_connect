package c2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lc2/g3;", "Lh5/c0;", "Lh4/r$c;", "Lg6/f;", "minWidth", "minHeight", "<init>", "(FFLkotlin/jvm/internal/j;)V", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g3 extends h4.r.c implements h5.c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f22667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f22668b;

    /* JADX WARN: Illegal instructions before constructor call */
    public g3(float f14, float f15, int i14, p005kotlin.jvm.internal.j jVar) {
        if ((i14 & 1) != 0) {
            g6.f.f75994b.getClass();
            f14 = g6.f.f75996d;
        }
        if ((i14 & 2) != 0) {
            g6.f.f75994b.getClass();
            f15 = g6.f.f75996d;
        }
        this(f14, f15, null);
    }

    @Override // h5.c0
    public final int maxIntrinsicHeight(f5.x xVar, f5.w wVar, int i14) {
        int iA0 = wVar.a0(i14);
        int iF0 = !Float.isNaN(this.f22668b) ? xVar.f0(this.f22668b) : 0;
        return iA0 < iF0 ? iF0 : iA0;
    }

    @Override // h5.c0
    public final int maxIntrinsicWidth(f5.x xVar, f5.w wVar, int i14) {
        int iL0 = wVar.l0(i14);
        int iF0 = !Float.isNaN(this.f22667a) ? xVar.f0(this.f22667a) : 0;
        return iL0 < iF0 ? iF0 : iL0;
    }

    @Override // h5.c0
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final f5.a1 mo5measure3p2s80s(f5.b1 b1Var, f5.y0 y0Var, long j8) {
        int iL;
        int iK;
        if (Float.isNaN(this.f22667a) || g6.a.l(j8) != 0) {
            iL = g6.a.l(j8);
        } else {
            int iF0 = b1Var.f0(this.f22667a);
            iL = g6.a.j(j8);
            if (iF0 < 0) {
                iF0 = 0;
            }
            if (iF0 <= iL) {
                iL = iF0;
            }
        }
        int iJ = g6.a.j(j8);
        if (Float.isNaN(this.f22668b) || g6.a.k(j8) != 0) {
            iK = g6.a.k(j8);
        } else {
            int iF1 = b1Var.f0(this.f22668b);
            iK = g6.a.i(j8);
            int i14 = iF1 >= 0 ? iF1 : 0;
            if (i14 <= iK) {
                iK = i14;
            }
        }
        f5.v1 v1VarQ = y0Var.Q(g6.b.a(iL, iJ, iK, g6.a.i(j8)));
        return f5.b1.h0(b1Var, v1VarQ.f69144a, v1VarQ.f69145b, new a03.k0(v1VarQ, 7));
    }

    @Override // h5.c0
    public final int minIntrinsicHeight(f5.x xVar, f5.w wVar, int i14) {
        int iE0 = wVar.e0(i14);
        int iF0 = !Float.isNaN(this.f22668b) ? xVar.f0(this.f22668b) : 0;
        return iE0 < iF0 ? iF0 : iE0;
    }

    @Override // h5.c0
    public final int minIntrinsicWidth(f5.x xVar, f5.w wVar, int i14) {
        int iO = wVar.O(i14);
        int iF0 = !Float.isNaN(this.f22667a) ? xVar.f0(this.f22667a) : 0;
        return iO < iF0 ? iF0 : iO;
    }

    private g3(float f14, float f15) {
        this.f22667a = f14;
        this.f22668b = f15;
    }

    public /* synthetic */ g3(float f14, float f15, p005kotlin.jvm.internal.j jVar) {
        this(f14, f15);
    }
}
