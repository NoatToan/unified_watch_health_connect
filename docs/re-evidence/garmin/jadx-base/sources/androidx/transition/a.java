package androidx.transition;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes7.dex */
public class a extends h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f11049d = (float) Math.tan(Math.toRadians(35.0d));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f11050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f11051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f11052c;

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11050a = 0.0f;
        this.f11051b = 0.0f;
        this.f11052c = f11049d;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f11127f);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        this.f11051b = a(!b7.j.e(xmlPullParser, "minimumVerticalAngle") ? 0.0f : typedArrayObtainStyledAttributes.getFloat(1, 0.0f));
        this.f11050a = a(xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "minimumHorizontalAngle") != null ? typedArrayObtainStyledAttributes.getFloat(0, 0.0f) : 0.0f);
        this.f11052c = a(xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "maximumAngle") != null ? typedArrayObtainStyledAttributes.getFloat(2, 70.0f) : 70.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static float a(float f14) {
        if (f14 >= 0.0f && f14 <= 90.0f) {
            return (float) Math.tan(Math.toRadians(f14 / 2.0f));
        }
        vb.h.s("Arc must be between 0 and 90 degrees");
        return 0.0f;
    }

    @Override // androidx.transition.h
    public final Path getPath(float f14, float f15, float f16, float f17) {
        float fA;
        float fA2;
        float f18;
        Path path = new Path();
        path.moveTo(f14, f15);
        float f19 = f16 - f14;
        float f22 = f17 - f15;
        float f24 = (f22 * f22) + (f19 * f19);
        float f25 = (f14 + f16) / 2.0f;
        float f26 = (f15 + f17) / 2.0f;
        float f27 = 0.25f * f24;
        boolean z14 = f15 > f17;
        if (Math.abs(f19) < Math.abs(f22)) {
            float fAbs = Math.abs(f24 / (f22 * 2.0f));
            if (z14) {
                fA2 = fAbs + f17;
                fA = f16;
            } else {
                fA2 = fAbs + f15;
                fA = f14;
            }
            f18 = this.f11051b;
        } else {
            float f28 = f24 / (f19 * 2.0f);
            if (z14) {
                fA2 = f15;
                fA = f28 + f14;
            } else {
                fA = f16 - f28;
                fA2 = f17;
            }
            f18 = this.f11050a;
        }
        float f29 = f27 * f18 * f18;
        float f34 = f25 - fA;
        float f35 = f26 - fA2;
        float f36 = (f35 * f35) + (f34 * f34);
        float f37 = this.f11052c;
        float f38 = f27 * f37 * f37;
        if (f36 >= f29) {
            f29 = f36 > f38 ? f38 : 0.0f;
        }
        if (f29 != 0.0f) {
            float fSqrt = (float) Math.sqrt(f29 / f36);
            fA = j20.x.a(fA, f25, fSqrt, f25);
            fA2 = j20.x.a(fA2, f26, fSqrt, f26);
        }
        path.cubicTo((f14 + fA) / 2.0f, (f15 + fA2) / 2.0f, (fA + f16) / 2.0f, (fA2 + f17) / 2.0f, f16, f17);
        return path;
    }

    public a() {
        this.f11050a = 0.0f;
        this.f11051b = 0.0f;
        this.f11052c = f11049d;
    }
}
