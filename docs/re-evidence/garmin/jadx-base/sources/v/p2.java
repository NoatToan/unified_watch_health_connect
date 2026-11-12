package v;

/* JADX INFO: loaded from: classes.dex */
public class p2 implements b0.l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f173981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f173982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f173983c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f173984d;

    public p2(float f14, float f15) {
        this.f173982b = f14;
        this.f173983c = f15;
    }

    @Override // b0.l1
    public final float a() {
        return this.f173984d;
    }

    @Override // b0.l1
    public final float b() {
        return this.f173981a;
    }

    @Override // b0.l1
    public final float c() {
        return this.f173982b;
    }

    @Override // b0.l1
    public final float d() {
        return this.f173983c;
    }

    public final void e(float f14) {
        if (f14 <= 1.0f && f14 >= 0.0f) {
            this.f173984d = f14;
            this.f173981a = androidx.camera.core.impl.c.z(f14, this.f173983c, this.f173982b);
        } else {
            throw new IllegalArgumentException("Requested linearZoom " + f14 + " is not within valid range [0..1]");
        }
    }

    public final void f(float f14) {
        float f15 = this.f173982b;
        float f16 = this.f173983c;
        if (f14 > f15 || f14 < f16) {
            vb.h.s(e0.e(f15, "]", e0.i("Requested zoomRatio ", f14, " is not within valid range [", f16, " , ")));
        } else {
            this.f173981a = f14;
            this.f173984d = androidx.camera.core.impl.c.y(f14, f16, f15);
        }
    }
}
