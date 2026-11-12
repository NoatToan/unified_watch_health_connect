package s1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ls1/q;", "Ls1/r;", "", "v1", "v2", "v3", "v4", "<init>", "(FFFF)V", "animation-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class q extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f155695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f155696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f155697c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f155698d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f155699e;

    public q(float f14, float f15, float f16, float f17) {
        super(null);
        this.f155695a = f14;
        this.f155696b = f15;
        this.f155697c = f16;
        this.f155698d = f17;
        this.f155699e = 4;
    }

    @Override // s1.r
    public final float a(int i14) {
        if (i14 == 0) {
            return this.f155695a;
        }
        if (i14 == 1) {
            return this.f155696b;
        }
        if (i14 == 2) {
            return this.f155697c;
        }
        if (i14 != 3) {
            return 0.0f;
        }
        return this.f155698d;
    }

    @Override // s1.r
    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getF155699e() {
        return this.f155699e;
    }

    @Override // s1.r
    public final r c() {
        return new q(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // s1.r
    public final void d() {
        this.f155695a = 0.0f;
        this.f155696b = 0.0f;
        this.f155697c = 0.0f;
        this.f155698d = 0.0f;
    }

    @Override // s1.r
    public final void e(float f14, int i14) {
        if (i14 == 0) {
            this.f155695a = f14;
            return;
        }
        if (i14 == 1) {
            this.f155696b = f14;
        } else if (i14 == 2) {
            this.f155697c = f14;
        } else {
            if (i14 != 3) {
                return;
            }
            this.f155698d = f14;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return qVar.f155695a == this.f155695a && qVar.f155696b == this.f155696b && qVar.f155697c == this.f155697c && qVar.f155698d == this.f155698d;
    }

    public final int hashCode() {
        return Float.hashCode(this.f155698d) + q6.f.d(this.f155697c, q6.f.d(this.f155696b, Float.hashCode(this.f155695a) * 31, 31), 31);
    }

    public final String toString() {
        return "AnimationVector4D: v1 = " + this.f155695a + ", v2 = " + this.f155696b + ", v3 = " + this.f155697c + ", v4 = " + this.f155698d;
    }
}
