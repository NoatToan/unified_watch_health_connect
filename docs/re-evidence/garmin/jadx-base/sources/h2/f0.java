package h2;

import g2.d1;
import p005kotlin.Metadata;
import p005kotlin.math.MathKt;
import p008y1.o2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lh2/f0;", "Lg2/d1;", "Ly1/o2;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f0 implements d1, o2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o2 f80900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j0 f80901b;

    public f0(o2 o2Var, j0 j0Var) {
        this.f80901b = j0Var;
        this.f80900a = o2Var;
    }

    @Override // g2.d1
    public final int a() {
        return this.f80901b.f80930f;
    }

    @Override // g2.d1
    public final int b() {
        return this.f80901b.f80929e;
    }

    @Override // g2.d1
    public final int c() {
        return ((i) p13.h0.m0(this.f80901b.n().g())).getF80906a();
    }

    @Override // g2.d1
    public final void d(int i14, int i15) {
        j0 j0Var = this.f80901b;
        j0Var.x(i14, i15 / j0Var.q(), true);
    }

    @Override // g2.d1
    public final int e(int i14) {
        j0 j0Var = this.f80901b;
        return (int) (j23.t.g(gl.b.p(j0Var) + ((long) MathKt.c(((j0Var.q() * (i14 - j0Var.l())) - (j0Var.m() * j0Var.q())) + 0)), j0Var.f80932h, j0Var.f80931g) - gl.b.p(j0Var));
    }

    @Override // p008y1.o2
    public final float f(float f14) {
        return this.f80900a.f(f14);
    }

    @Override // g2.d1
    public final int getItemCount() {
        return this.f80901b.o();
    }
}
