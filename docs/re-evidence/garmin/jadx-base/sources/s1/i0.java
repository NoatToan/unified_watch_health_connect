package s1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ls1/i0;", "Ls1/h0;", "", "frictionMultiplier", "absVelocityThreshold", "<init>", "(FF)V", "animation-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class i0 implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f155595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f155596b;

    public i0(float f14, float f15) {
        this.f155595a = Math.max(1.0E-7f, Math.abs(f15));
        this.f155596b = Math.max(1.0E-4f, f14) * (-4.2f);
    }

    @Override // s1.h0
    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getF155595a() {
        return this.f155595a;
    }

    @Override // s1.h0
    public final long b(float f14) {
        return ((long) ((((float) Math.log(this.f155595a / Math.abs(f14))) * 1000.0f) / this.f155596b)) * 1000000;
    }

    @Override // s1.h0
    public final float c(float f14, float f15) {
        float fAbs = Math.abs(f15);
        float f16 = this.f155595a;
        if (fAbs <= f16) {
            return f14;
        }
        double dLog = Math.log(Math.abs(f16 / f15));
        float f17 = this.f155596b;
        return ((f15 / f17) * ((float) Math.exp((((double) f17) * ((dLog / ((double) f17)) * ((double) 1000))) / ((double) 1000.0f)))) + (f14 - (f15 / f17));
    }

    @Override // s1.h0
    public final float d(float f14, long j8) {
        return f14 * ((float) Math.exp(((j8 / 1000000) / 1000.0f) * this.f155596b));
    }

    @Override // s1.h0
    public final float e(float f14, float f15, long j8) {
        float f16 = this.f155596b;
        return ((f15 / f16) * ((float) Math.exp((f16 * (j8 / 1000000)) / 1000.0f))) + (f14 - (f15 / f16));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public i0() {
        float f14 = 0.0f;
        this(f14, f14, 3, null);
    }

    public /* synthetic */ i0(float f14, float f15, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? 1.0f : f14, (i14 & 2) != 0 ? 0.1f : f15);
    }
}
