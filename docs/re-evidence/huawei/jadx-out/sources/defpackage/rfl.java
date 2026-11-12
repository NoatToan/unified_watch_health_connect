package defpackage;

import android.graphics.PointF;
import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes16.dex */
public class rfl implements Interpolator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final PointF f47262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final PointF f47263c;
    private int e = 0;

    private double d(double d, double d2, double d3, double d4, double d5) {
        double d6 = 1.0d - d;
        double d7 = d * d;
        double d8 = d6 * d6;
        return (d8 * d6 * d2) + (d8 * 3.0d * d * d3) + (d6 * 3.0d * d7 * d4) + (d7 * d * d5);
    }

    public rfl(float f, float f2, float f3, float f4) {
        PointF pointF = new PointF();
        this.f47263c = pointF;
        PointF pointF2 = new PointF();
        this.f47262b = pointF2;
        pointF.x = f;
        pointF.y = f2;
        pointF2.x = f3;
        pointF2.y = f4;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        float f2 = f;
        for (int i = this.e; i < 4096; i++) {
            f2 = (i * 1.0f) / 4096.0f;
            if (d(f2, 0.0d, this.f47263c.x, this.f47262b.x, 1.0d) >= f) {
                this.e = i;
                break;
            }
        }
        double d = d(f2, 0.0d, this.f47263c.y, this.f47262b.y, 1.0d);
        if (d > 0.999d) {
            this.e = 0;
            d = 1.0d;
        }
        return (float) d;
    }
}
