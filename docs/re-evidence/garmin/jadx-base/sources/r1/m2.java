package r1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lr1/m2;", "Ls1/h0;", "Lg6/c;", "density", "<init>", "(Lg6/c;)V", "animation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class m2 implements s1.h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z1 f149167a;

    public m2(g6.c cVar) {
        this.f149167a = new z1(n2.f149177a, cVar);
    }

    @Override // s1.h0
    /* JADX INFO: renamed from: a */
    public final float getF155595a() {
        return 0.0f;
    }

    @Override // s1.h0
    public final long b(float f14) {
        return ((long) (Math.exp(this.f149167a.b(f14) / (((double) a2.f148977a) - 1.0d)) * 1000.0d)) * 1000000;
    }

    @Override // s1.h0
    public final float c(float f14, float f15) {
        z1 z1Var = this.f149167a;
        double dB = z1Var.b(f15);
        double d14 = a2.f148977a;
        return (Math.signum(f15) * ((float) (Math.exp((d14 / (d14 - 1.0d)) * dB) * ((double) (z1Var.f149325a * z1Var.f149327c))))) + f14;
    }

    @Override // s1.h0
    public final float d(float f14, long j8) {
        long j14 = j8 / 1000000;
        z1.a aVarA = this.f149167a.a(f14);
        long j15 = aVarA.f149330c;
        float f15 = j15 > 0 ? j14 / j15 : 1.0f;
        a.f148963a.getClass();
        return (((Math.signum(aVarA.f149328a) * a.a(f15).f148966b) * aVarA.f149329b) / j15) * 1000.0f;
    }

    @Override // s1.h0
    public final float e(float f14, float f15, long j8) {
        long j14 = j8 / 1000000;
        z1.a aVarA = this.f149167a.a(f15);
        long j15 = aVarA.f149330c;
        float f16 = j15 > 0 ? j14 / j15 : 1.0f;
        float fSignum = Math.signum(aVarA.f149328a) * aVarA.f149329b;
        a.f148963a.getClass();
        return (fSignum * a.a(f16).f148965a) + f14;
    }
}
