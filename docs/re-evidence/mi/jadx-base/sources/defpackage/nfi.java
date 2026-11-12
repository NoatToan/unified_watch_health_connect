package defpackage;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes9.dex */
public class nfi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PointF f27884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PointF f27885b;
    public PointF c;
    public PointF d;
    public Path e;

    public PointF a(RectF rectF, float f) {
        float fWidth = (float) (((double) (rectF.width() / 2.0f)) * 3.141592653589793d);
        Path path = new Path();
        path.moveTo(rectF.left, (rectF.top + rectF.bottom) / 2.0f);
        path.arcTo(rectF, 180.0f, 180.0f, false);
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float[] fArr = new float[2];
        pathMeasure.getPosTan((fWidth * f) / 180.0f, fArr, null);
        return new PointF(fArr[0], fArr[1]);
    }

    public PointF b(RectF rectF, float f) {
        float fWidth = (float) (((double) (rectF.width() / 2.0f)) * 3.141592653589793d);
        Path path = new Path();
        path.moveTo(rectF.right, (rectF.top + rectF.bottom) / 2.0f);
        path.arcTo(rectF, 0.0f, -180.0f, false);
        float[] fArr = new float[2];
        new PathMeasure(path, false).getPosTan((fWidth * f) / 180.0f, fArr, null);
        return new PointF(fArr[0], fArr[1]);
    }

    public Path c() {
        Path path = new Path();
        this.e = path;
        PointF pointF = this.f27884a;
        path.moveTo(pointF.x, pointF.y);
        Path path2 = this.e;
        PointF pointF2 = this.c;
        float f = pointF2.x;
        float f2 = pointF2.y;
        PointF pointF3 = this.f27885b;
        path2.quadTo(f, f2, pointF3.x, pointF3.y);
        Path path3 = this.e;
        PointF pointF4 = this.d;
        path3.lineTo(pointF4.x, pointF4.y);
        this.e.close();
        return this.e;
    }
}
