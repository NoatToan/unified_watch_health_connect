package androidx.transition;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.util.AttributeSet;
import defpackage.amo;
import defpackage.p5q;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
public class ArcMotion extends PathMotion {
    public static final float g = (float) Math.tan(Math.toRadians(35.0d));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f3022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f3023b;
    public float c;
    public float d;
    public float e;
    public float f;

    public ArcMotion() {
        this.f3022a = 0.0f;
        this.f3023b = 0.0f;
        this.c = 70.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = g;
    }

    public static float e(float f) {
        if (f < 0.0f || f > 90.0f) {
            throw new IllegalArgumentException("Arc must be between 0 and 90 degrees");
        }
        return (float) Math.tan(Math.toRadians(f / 2.0f));
    }

    @Override // androidx.transition.PathMotion
    public Path a(float f, float f2, float f3, float f4) {
        float f5;
        float f6;
        float f7;
        Path path = new Path();
        path.moveTo(f, f2);
        float f8 = f3 - f;
        float f9 = f4 - f2;
        float f10 = (f8 * f8) + (f9 * f9);
        float f11 = (f + f3) / 2.0f;
        float f12 = (f2 + f4) / 2.0f;
        float f13 = 0.25f * f10;
        boolean z = f2 > f4;
        if (Math.abs(f8) < Math.abs(f9)) {
            float fAbs = Math.abs(f10 / (f9 * 2.0f));
            if (z) {
                f6 = fAbs + f4;
                f5 = f3;
            } else {
                f6 = fAbs + f2;
                f5 = f;
            }
            f7 = this.e;
        } else {
            float f14 = f10 / (f8 * 2.0f);
            if (z) {
                f6 = f2;
                f5 = f14 + f;
            } else {
                f5 = f3 - f14;
                f6 = f4;
            }
            f7 = this.d;
        }
        float f15 = f13 * f7 * f7;
        float f16 = f11 - f5;
        float f17 = f12 - f6;
        float f18 = (f16 * f16) + (f17 * f17);
        float f19 = this.f;
        float f20 = f13 * f19 * f19;
        if (f18 >= f15) {
            f15 = f18 > f20 ? f20 : 0.0f;
        }
        if (f15 != 0.0f) {
            float fSqrt = (float) Math.sqrt(f15 / f18);
            f5 = ((f5 - f11) * fSqrt) + f11;
            f6 = f12 + (fSqrt * (f6 - f12));
        }
        path.cubicTo((f + f5) / 2.0f, (f2 + f6) / 2.0f, (f5 + f3) / 2.0f, (f6 + f4) / 2.0f, f3, f4);
        return path;
    }

    public void b(float f) {
        this.c = f;
        this.f = e(f);
    }

    public void c(float f) {
        this.f3022a = f;
        this.d = e(f);
    }

    public void d(float f) {
        this.f3023b = f;
        this.e = e(f);
    }

    @SuppressLint({"RestrictedApi"})
    public ArcMotion(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3022a = 0.0f;
        this.f3023b = 0.0f;
        this.c = 70.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = g;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, amo.j);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        d(p5q.j(typedArrayObtainStyledAttributes, xmlPullParser, "minimumVerticalAngle", 1, 0.0f));
        c(p5q.j(typedArrayObtainStyledAttributes, xmlPullParser, "minimumHorizontalAngle", 0, 0.0f));
        b(p5q.j(typedArrayObtainStyledAttributes, xmlPullParser, "maximumAngle", 2, 70.0f));
        typedArrayObtainStyledAttributes.recycle();
    }
}
