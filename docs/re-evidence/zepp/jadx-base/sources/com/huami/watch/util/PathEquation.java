package com.huami.watch.util;

import android.graphics.Path;
import android.graphics.PathMeasure;
import aurelienribon.tweenengine.TweenEquation;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0014\n\u0002\b\f\b\u0002\u0018\u0000 \u00182\u00020\u0001:\u0001\u0019B'\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0002J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0016R\u0016\u0010\u0010\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\b\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000b\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/huami/watch/util/PathEquation;", "Laurelienribon/tweenengine/TweenEquation;", "", "x1", "y1", "x2", "y2", "", "a", "Landroid/graphics/Path;", "path", "b", "t", "compute", "", "[F", "mX", "mY", "controlX1", "controlY1", "controlX2", "controlY2", "<init>", "(FFFF)V", GoogleApiAvailabilityLight.a, "Companion", "wififtp_release"}, k = 1, mv = {1, 4, 1})
final class PathEquation extends TweenEquation {
    private static final float c = 0.002f;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private float[] mX;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private float[] mY;

    public PathEquation(float f, float f2, float f3, float f4) {
        a(f, f2, f3, f4);
    }

    private final void a(float x1, float y1, float x2, float y2) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(x1, y1, x2, y2, 1.0f, 1.0f);
        b(path);
    }

    private final void b(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int i = ((int) (length / 0.002f)) + 1;
        this.mX = new float[i];
        this.mY = new float[i];
        float[] fArr = new float[2];
        for (int i2 = 0; i2 < i; i2++) {
            pathMeasure.getPosTan((i2 * length) / (i - 1), fArr, null);
            this.mX[i2] = fArr[0];
            this.mY[i2] = fArr[1];
        }
    }

    @Override // aurelienribon.tweenengine.TweenEquation
    public float compute(float t) {
        int i = 0;
        if (t <= 0) {
            return 0.0f;
        }
        if (t >= 1) {
            return 1.0f;
        }
        int length = this.mX.length - 1;
        while (length - i > 1) {
            int i2 = (i + length) / 2;
            if (t < this.mX[i2]) {
                length = i2;
            } else {
                i = i2;
            }
        }
        float f = this.mX[length] - this.mX[i];
        if (f == 0.0f) {
            return this.mY[i];
        }
        float f2 = (t - this.mX[i]) / f;
        float f3 = this.mY[i];
        return f3 + (f2 * (this.mY[length] - f3));
    }
}
