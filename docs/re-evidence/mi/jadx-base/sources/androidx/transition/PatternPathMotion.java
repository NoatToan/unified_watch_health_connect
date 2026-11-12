package androidx.transition;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import defpackage.amo;
import defpackage.p5q;
import defpackage.xlh;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
public class PatternPathMotion extends PathMotion {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Path f3050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path f3051b;
    public final Matrix c;

    public PatternPathMotion() {
        Path path = new Path();
        this.f3051b = path;
        this.c = new Matrix();
        path.lineTo(1.0f, 0.0f);
        this.f3050a = path;
    }

    public static float b(float f, float f2) {
        return (float) Math.sqrt((f * f) + (f2 * f2));
    }

    @Override // androidx.transition.PathMotion
    public Path a(float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        float fB = b(f5, f6);
        double dAtan2 = Math.atan2(f6, f5);
        this.c.setScale(fB, fB);
        this.c.postRotate((float) Math.toDegrees(dAtan2));
        this.c.postTranslate(f, f2);
        Path path = new Path();
        this.f3051b.transform(this.c, path);
        return path;
    }

    public void c(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float[] fArr = new float[2];
        pathMeasure.getPosTan(pathMeasure.getLength(), fArr, null);
        float f = fArr[0];
        float f2 = fArr[1];
        pathMeasure.getPosTan(0.0f, fArr, null);
        float f3 = fArr[0];
        float f4 = fArr[1];
        if (f3 == f && f4 == f2) {
            throw new IllegalArgumentException("pattern must not end at the starting point");
        }
        this.c.setTranslate(-f3, -f4);
        float f5 = f - f3;
        float f6 = f2 - f4;
        float fB = 1.0f / b(f5, f6);
        this.c.postScale(fB, fB);
        this.c.postRotate((float) Math.toDegrees(-Math.atan2(f6, f5)));
        path.transform(this.c, this.f3051b);
        this.f3050a = path;
    }

    @SuppressLint({"RestrictedApi"})
    public PatternPathMotion(Context context, AttributeSet attributeSet) {
        this.f3051b = new Path();
        this.c = new Matrix();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, amo.f1221k);
        try {
            String strM = p5q.m(typedArrayObtainStyledAttributes, (XmlPullParser) attributeSet, "patternPathData", 0);
            if (strM != null) {
                c(xlh.e(strM));
                typedArrayObtainStyledAttributes.recycle();
                return;
            }
            throw new RuntimeException("pathData must be supplied for patternPathMotion");
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }
}
