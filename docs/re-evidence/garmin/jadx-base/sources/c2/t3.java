package c2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lc2/t3;", "Lh5/c0;", "Lh4/r$c;", "Lc2/i0;", "direction", "", "unbounded", "Lkotlin/Function2;", "Lg6/m;", "Lg6/o;", "Lg6/k;", "alignmentCallback", "<init>", "(Lc2/i0;ZLe23/p;)V", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class t3 extends h4.r.c implements h5.c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i0 f22882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f22883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e23.p<? super g6.m, ? super g6.o, g6.k> f22884c;

    public t3(i0 i0Var, boolean z14, e23.p<? super g6.m, ? super g6.o, g6.k> pVar) {
        this.f22882a = i0Var;
        this.f22883b = z14;
        this.f22884c = pVar;
    }

    @Override // h5.c0
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final f5.a1 mo5measure3p2s80s(f5.b1 b1Var, f5.y0 y0Var, long j8) {
        i0 i0Var = this.f22882a;
        i0 i0Var2 = i0.Vertical;
        int iL = i0Var != i0Var2 ? 0 : g6.a.l(j8);
        i0 i0Var3 = this.f22882a;
        i0 i0Var4 = i0.Horizontal;
        f5.v1 v1VarQ = y0Var.Q(g6.b.a(iL, (this.f22882a == i0Var2 || !this.f22883b) ? g6.a.j(j8) : Integer.MAX_VALUE, i0Var3 == i0Var4 ? g6.a.k(j8) : 0, (this.f22882a == i0Var4 || !this.f22883b) ? g6.a.i(j8) : Integer.MAX_VALUE));
        int iE = j23.t.e(v1VarQ.f69144a, g6.a.l(j8), g6.a.j(j8));
        int iE2 = j23.t.e(v1VarQ.f69145b, g6.a.k(j8), g6.a.i(j8));
        return f5.b1.h0(b1Var, iE, iE2, new r2(this, iE, v1VarQ, iE2, b1Var));
    }
}
