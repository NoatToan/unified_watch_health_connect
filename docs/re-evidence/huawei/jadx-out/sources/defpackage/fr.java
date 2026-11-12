package defpackage;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes21.dex */
public class fr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PointF f34426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final PointF f34427b;
    private final PointF e;

    public fr() {
        this.f34426a = new PointF();
        this.f34427b = new PointF();
        this.e = new PointF();
    }

    public fr(PointF pointF, PointF pointF2, PointF pointF3) {
        this.f34426a = pointF;
        this.f34427b = pointF2;
        this.e = pointF3;
    }

    public void e(float f, float f2) {
        this.f34426a.set(f, f2);
    }

    public PointF a() {
        return this.f34426a;
    }

    public void b(float f, float f2) {
        this.f34427b.set(f, f2);
    }

    public PointF b() {
        return this.f34427b;
    }

    public void a(float f, float f2) {
        this.e.set(f, f2);
    }

    public PointF c() {
        return this.e;
    }

    public String toString() {
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", Float.valueOf(this.e.x), Float.valueOf(this.e.y), Float.valueOf(this.f34426a.x), Float.valueOf(this.f34426a.y), Float.valueOf(this.f34427b.x), Float.valueOf(this.f34427b.y));
    }
}
