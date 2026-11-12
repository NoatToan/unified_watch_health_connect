package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class h5f extends s08 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f19714a;

    public h5f(float f) {
        this.f19714a = f - 0.001f;
    }

    @Override // defpackage.s08
    public boolean a() {
        return true;
    }

    @Override // defpackage.s08
    public void b(float f, float f2, float f3, d3m d3mVar) {
        float fSqrt = (float) ((((double) this.f19714a) * Math.sqrt(2.0d)) / 2.0d);
        float fSqrt2 = (float) Math.sqrt(Math.pow(this.f19714a, 2.0d) - Math.pow(fSqrt, 2.0d));
        d3mVar.n(f2 - fSqrt, ((float) (-((((double) this.f19714a) * Math.sqrt(2.0d)) - ((double) this.f19714a)))) + fSqrt2);
        d3mVar.m(f2, (float) (-((((double) this.f19714a) * Math.sqrt(2.0d)) - ((double) this.f19714a))));
        d3mVar.m(f2 + fSqrt, ((float) (-((((double) this.f19714a) * Math.sqrt(2.0d)) - ((double) this.f19714a)))) + fSqrt2);
    }
}
