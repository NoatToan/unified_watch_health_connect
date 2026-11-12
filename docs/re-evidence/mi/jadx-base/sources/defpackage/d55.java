package defpackage;

import android.annotation.SuppressLint;
import android.graphics.PointF;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class d55 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PointF f15098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PointF f15099b;
    public final PointF c;

    public d55() {
        this.f15098a = new PointF();
        this.f15099b = new PointF();
        this.c = new PointF();
    }

    public PointF a() {
        return this.f15098a;
    }

    public PointF b() {
        return this.f15099b;
    }

    public PointF c() {
        return this.c;
    }

    public void d(float f, float f2) {
        this.f15098a.set(f, f2);
    }

    public void e(float f, float f2) {
        this.f15099b.set(f, f2);
    }

    public void f(float f, float f2) {
        this.c.set(f, f2);
    }

    @SuppressLint({"DefaultLocale"})
    public String toString() {
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", Float.valueOf(this.c.x), Float.valueOf(this.c.y), Float.valueOf(this.f15098a.x), Float.valueOf(this.f15098a.y), Float.valueOf(this.f15099b.x), Float.valueOf(this.f15099b.y));
    }

    public d55(PointF pointF, PointF pointF2, PointF pointF3) {
        this.f15098a = pointF;
        this.f15099b = pointF2;
        this.c = pointF3;
    }
}
