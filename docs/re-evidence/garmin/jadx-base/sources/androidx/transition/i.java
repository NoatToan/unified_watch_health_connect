package androidx.transition;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes7.dex */
public class i extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f11117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Matrix f11118b;

    public i(Context context, AttributeSet attributeSet) {
        this.f11117a = new Path();
        this.f11118b = new Matrix();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f11128g);
        try {
            String string = !b7.j.e((XmlPullParser) attributeSet, "patternPathData") ? null : typedArrayObtainStyledAttributes.getString(0);
            if (string == null) {
                throw new RuntimeException("pathData must be supplied for patternPathMotion");
            }
            a(c7.g.c(string));
            typedArrayObtainStyledAttributes.recycle();
        } catch (Throwable th3) {
            typedArrayObtainStyledAttributes.recycle();
            throw th3;
        }
    }

    public final void a(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float[] fArr = new float[2];
        pathMeasure.getPosTan(pathMeasure.getLength(), fArr, null);
        float f14 = fArr[0];
        float f15 = fArr[1];
        pathMeasure.getPosTan(0.0f, fArr, null);
        float f16 = fArr[0];
        float f17 = fArr[1];
        if (f16 == f14 && f17 == f15) {
            vb.h.s("pattern must not end at the starting point");
            return;
        }
        Matrix matrix = this.f11118b;
        matrix.setTranslate(-f16, -f17);
        float f18 = f14 - f16;
        float f19 = f15 - f17;
        float fSqrt = 1.0f / ((float) Math.sqrt((f19 * f19) + (f18 * f18)));
        matrix.postScale(fSqrt, fSqrt);
        matrix.postRotate((float) Math.toDegrees(-Math.atan2(f19, f18)));
        path.transform(matrix, this.f11117a);
    }

    @Override // androidx.transition.h
    public final Path getPath(float f14, float f15, float f16, float f17) {
        float f18 = f16 - f14;
        float f19 = f17 - f15;
        float fSqrt = (float) Math.sqrt((f19 * f19) + (f18 * f18));
        double dAtan2 = Math.atan2(f19, f18);
        Matrix matrix = this.f11118b;
        matrix.setScale(fSqrt, fSqrt);
        matrix.postRotate((float) Math.toDegrees(dAtan2));
        matrix.postTranslate(f14, f15);
        Path path = new Path();
        this.f11117a.transform(matrix, path);
        return path;
    }

    public i() {
        Path path = new Path();
        this.f11117a = path;
        this.f11118b = new Matrix();
        path.lineTo(1.0f, 0.0f);
    }

    public i(Path path) {
        this.f11117a = new Path();
        this.f11118b = new Matrix();
        a(path);
    }
}
