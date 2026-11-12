package s1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ls1/o;", "Ls1/r;", "", "v1", "v2", "<init>", "(FF)V", "animation-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class o extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f155672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f155673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f155674c;

    public o(float f14, float f15) {
        super(null);
        this.f155672a = f14;
        this.f155673b = f15;
        this.f155674c = 2;
    }

    @Override // s1.r
    public final float a(int i14) {
        if (i14 == 0) {
            return this.f155672a;
        }
        if (i14 != 1) {
            return 0.0f;
        }
        return this.f155673b;
    }

    @Override // s1.r
    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getF155674c() {
        return this.f155674c;
    }

    @Override // s1.r
    public final r c() {
        return new o(0.0f, 0.0f);
    }

    @Override // s1.r
    public final void d() {
        this.f155672a = 0.0f;
        this.f155673b = 0.0f;
    }

    @Override // s1.r
    public final void e(float f14, int i14) {
        if (i14 == 0) {
            this.f155672a = f14;
        } else {
            if (i14 != 1) {
                return;
            }
            this.f155673b = f14;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return oVar.f155672a == this.f155672a && oVar.f155673b == this.f155673b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f155673b) + (Float.hashCode(this.f155672a) * 31);
    }

    public final String toString() {
        return "AnimationVector2D: v1 = " + this.f155672a + ", v2 = " + this.f155673b;
    }
}
