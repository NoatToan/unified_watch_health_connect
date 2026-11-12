package s1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ls1/n;", "Ls1/r;", "", "initVal", "<init>", "(F)V", "animation-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class n extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f155642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f155643b;

    public n(float f14) {
        super(null);
        this.f155642a = f14;
        this.f155643b = 1;
    }

    @Override // s1.r
    public final float a(int i14) {
        if (i14 == 0) {
            return this.f155642a;
        }
        return 0.0f;
    }

    @Override // s1.r
    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getF155643b() {
        return this.f155643b;
    }

    @Override // s1.r
    public final r c() {
        return new n(0.0f);
    }

    @Override // s1.r
    public final void d() {
        this.f155642a = 0.0f;
    }

    @Override // s1.r
    public final void e(float f14, int i14) {
        if (i14 == 0) {
            this.f155642a = f14;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof n) && ((n) obj).f155642a == this.f155642a;
    }

    public final int hashCode() {
        return Float.hashCode(this.f155642a);
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.f155642a;
    }
}
