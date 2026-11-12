package s1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ls1/p;", "Ls1/r;", "", "v1", "v2", "v3", "<init>", "(FFF)V", "animation-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class p extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f155683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f155684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f155685c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f155686d;

    public p(float f14, float f15, float f16) {
        super(null);
        this.f155683a = f14;
        this.f155684b = f15;
        this.f155685c = f16;
        this.f155686d = 3;
    }

    @Override // s1.r
    public final float a(int i14) {
        if (i14 == 0) {
            return this.f155683a;
        }
        if (i14 == 1) {
            return this.f155684b;
        }
        if (i14 != 2) {
            return 0.0f;
        }
        return this.f155685c;
    }

    @Override // s1.r
    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getF155686d() {
        return this.f155686d;
    }

    @Override // s1.r
    public final r c() {
        return new p(0.0f, 0.0f, 0.0f);
    }

    @Override // s1.r
    public final void d() {
        this.f155683a = 0.0f;
        this.f155684b = 0.0f;
        this.f155685c = 0.0f;
    }

    @Override // s1.r
    public final void e(float f14, int i14) {
        if (i14 == 0) {
            this.f155683a = f14;
        } else if (i14 == 1) {
            this.f155684b = f14;
        } else {
            if (i14 != 2) {
                return;
            }
            this.f155685c = f14;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return pVar.f155683a == this.f155683a && pVar.f155684b == this.f155684b && pVar.f155685c == this.f155685c;
    }

    public final int hashCode() {
        return Float.hashCode(this.f155685c) + q6.f.d(this.f155684b, Float.hashCode(this.f155683a) * 31, 31);
    }

    public final String toString() {
        return "AnimationVector3D: v1 = " + this.f155683a + ", v2 = " + this.f155684b + ", v3 = " + this.f155685c;
    }
}
