package j1;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import b0.v0;

/* JADX INFO: loaded from: classes.dex */
public class m extends v0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final PointF f96292e = new PointF(2.0f, 2.0f);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f96293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Rect f96294c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Matrix f96295d;

    public m(j jVar) {
        this.f96293b = jVar;
    }

    public final PointF a(float f14, float f15) {
        float[] fArr = {f14, f15};
        synchronized (this) {
            try {
                Matrix matrix = this.f96295d;
                if (matrix == null) {
                    return f96292e;
                }
                matrix.mapPoints(fArr);
                return new PointF(fArr[0], fArr[1]);
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
