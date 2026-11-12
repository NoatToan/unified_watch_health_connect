package c2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lc2/o1;", "Lc2/r1;", "Lc2/q1;", "height", "", "enforceIncoming", "<init>", "(Lc2/q1;Z)V", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class o1 extends r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public q1 f22803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f22804b;

    public o1(q1 q1Var, boolean z14) {
        this.f22803a = q1Var;
        this.f22804b = z14;
    }

    @Override // c2.r1
    public final long U1(f5.y0 y0Var, long j8) {
        int iE0 = this.f22803a == q1.Min ? y0Var.e0(g6.a.j(j8)) : y0Var.a0(g6.a.j(j8));
        if (iE0 < 0) {
            iE0 = 0;
        }
        g6.a.f75987b.getClass();
        if (iE0 < 0) {
            g6.j.a("height must be >= 0");
        }
        return g6.b.h(0, Integer.MAX_VALUE, iE0, iE0);
    }

    @Override // c2.r1
    /* JADX INFO: renamed from: V1, reason: from getter */
    public final boolean getF22804b() {
        return this.f22804b;
    }

    @Override // c2.r1, h5.c0
    public final int maxIntrinsicHeight(f5.x xVar, f5.w wVar, int i14) {
        return this.f22803a == q1.Min ? wVar.e0(i14) : wVar.a0(i14);
    }

    @Override // c2.r1, h5.c0
    public final int minIntrinsicHeight(f5.x xVar, f5.w wVar, int i14) {
        return this.f22803a == q1.Min ? wVar.e0(i14) : wVar.a0(i14);
    }
}
