package f5;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lf5/w0;", "Lf5/v1$a;", "Lh5/l0;", "within", "<init>", "(Lh5/l0;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class w0 extends v1.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h5.l0 f69150b;

    public w0(h5.l0 l0Var) {
        this.f69150b = l0Var;
    }

    @Override // f5.v1.a
    public final float f(c2 c2Var) {
        int iM;
        e23.p<v1.a, Float, Float> pVar = c2Var.f68908a;
        if (pVar != null) {
            return pVar.invoke(this, Float.valueOf(Float.NaN)).floatValue();
        }
        h5.l0 l0Var = this.f69150b;
        if (l0Var.f81865k) {
            return Float.NaN;
        }
        h5.l0 l0Var2 = l0Var;
        while (true) {
            h5.x1 x1Var = l0Var2.f81867m;
            float f14 = (x1Var == null || (iM = p13.u.M(x1Var.f82015b, c2Var)) < 0) ? Float.NaN : x1Var.f82016c[iM];
            if (!Float.isNaN(f14)) {
                l0Var2.G0(l0Var.getF81711p(), c2Var);
                return c2Var.a(f14, l0Var2.Y0(), l0Var.Y0());
            }
            h5.l0 l0VarS0 = l0Var2.S0();
            if (l0VarS0 == null) {
                l0Var2.G0(l0Var.getF81711p(), c2Var);
                return Float.NaN;
            }
            l0Var2 = l0VarS0;
        }
    }

    @Override // f5.v1.a, g6.c
    /* JADX INFO: renamed from: getDensity */
    public final float getF69050b() {
        return this.f69150b.getF69050b();
    }

    @Override // f5.v1.a
    /* JADX INFO: renamed from: o */
    public final g6.o getF68958c() {
        return this.f69150b.getF69049a();
    }

    @Override // f5.v1.a
    /* JADX INFO: renamed from: p */
    public final int getF68957b() {
        return this.f69150b.n0();
    }

    @Override // f5.v1.a, g6.i
    /* JADX INFO: renamed from: r0 */
    public final float getF69051c() {
        return this.f69150b.getF69051c();
    }
}
