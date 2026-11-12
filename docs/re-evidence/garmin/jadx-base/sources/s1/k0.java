package s1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ls1/k0;", "Ls1/g0;", "", "duration", "delay", "Ls1/b0;", "easing", "<init>", "(IILs1/b0;)V", "animation-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class k0 implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f155617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b0 f155618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f155619c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f155620d;

    public k0(int i14, int i15, b0 b0Var, int i16, p005kotlin.jvm.internal.j jVar) {
        this((i16 & 1) != 0 ? 300 : i14, (i16 & 2) != 0 ? 0 : i15, (i16 & 4) != 0 ? e0.f155560a : b0Var);
    }

    @Override // s1.g0
    public final long b(float f14, float f15, float f16) {
        return this.f155620d + this.f155619c;
    }

    @Override // s1.g0
    public final float c(float f14, float f15, float f16, long j8) {
        long j14 = j8 - this.f155620d;
        if (j14 < 0) {
            j14 = 0;
        }
        long j15 = this.f155619c;
        long j16 = j14 > j15 ? j15 : j14;
        if (j16 == 0) {
            return f16;
        }
        return (d(f14, f15, f16, j16) - d(f14, f15, f16, j16 - 1000000)) * 1000.0f;
    }

    @Override // s1.g0
    public final float d(float f14, float f15, float f16, long j8) {
        long j14 = j8 - this.f155620d;
        if (j14 < 0) {
            j14 = 0;
        }
        long j15 = this.f155619c;
        if (j14 > j15) {
            j14 = j15;
        }
        float fA = this.f155618b.a(this.f155617a == 0 ? 1.0f : j14 / j15);
        return (f15 * fA) + ((1 - fA) * f14);
    }

    public k0() {
        this(0, 0, null, 7, null);
    }

    public k0(int i14, int i15, b0 b0Var) {
        this.f155617a = i14;
        this.f155618b = b0Var;
        this.f155619c = ((long) i14) * 1000000;
        this.f155620d = ((long) i15) * 1000000;
    }
}
