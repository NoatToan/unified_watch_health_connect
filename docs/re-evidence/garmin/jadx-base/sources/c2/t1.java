package c2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lc2/t1;", "Lc2/r1;", "Lc2/q1;", "width", "", "enforceIncoming", "<init>", "(Lc2/q1;Z)V", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class t1 extends r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public q1 f22880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f22881b;

    public t1(q1 q1Var, boolean z14) {
        this.f22880a = q1Var;
        this.f22881b = z14;
    }

    @Override // c2.r1
    public final long U1(f5.y0 y0Var, long j8) {
        int iO = this.f22880a == q1.Min ? y0Var.O(g6.a.i(j8)) : y0Var.l0(g6.a.i(j8));
        if (iO < 0) {
            iO = 0;
        }
        g6.a.f75987b.getClass();
        if (iO < 0) {
            g6.j.a("width must be >= 0");
        }
        return g6.b.h(iO, iO, 0, Integer.MAX_VALUE);
    }

    @Override // c2.r1
    /* JADX INFO: renamed from: V1, reason: from getter */
    public final boolean getF22881b() {
        return this.f22881b;
    }

    @Override // c2.r1, h5.c0
    public final int maxIntrinsicWidth(f5.x xVar, f5.w wVar, int i14) {
        return this.f22880a == q1.Min ? wVar.O(i14) : wVar.l0(i14);
    }

    @Override // c2.r1, h5.c0
    public final int minIntrinsicWidth(f5.x xVar, f5.w wVar, int i14) {
        return this.f22880a == q1.Min ? wVar.O(i14) : wVar.l0(i14);
    }
}
