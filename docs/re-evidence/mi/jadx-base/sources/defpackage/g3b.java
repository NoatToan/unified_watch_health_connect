package defpackage;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import androidx.annotation.RestrictTo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class g3b {
    public static a a(a aVar, int i, int i2, boolean z, int i3) {
        if (aVar != null) {
            return aVar;
        }
        return z ? new a(i, i3, i2) : new a(i, i2);
    }

    public static Shader b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (!name.equals("gradient")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
        TypedArray typedArrayS = p5q.s(resources, theme, attributeSet, q5j.A);
        float fJ = p5q.j(typedArrayS, xmlPullParser, "startX", q5j.J, 0.0f);
        float fJ2 = p5q.j(typedArrayS, xmlPullParser, "startY", q5j.K, 0.0f);
        float fJ3 = p5q.j(typedArrayS, xmlPullParser, "endX", q5j.L, 0.0f);
        float fJ4 = p5q.j(typedArrayS, xmlPullParser, "endY", q5j.M, 0.0f);
        float fJ5 = p5q.j(typedArrayS, xmlPullParser, "centerX", q5j.E, 0.0f);
        float fJ6 = p5q.j(typedArrayS, xmlPullParser, "centerY", q5j.F, 0.0f);
        int iK = p5q.k(typedArrayS, xmlPullParser, "type", q5j.D, 0);
        int iF = p5q.f(typedArrayS, xmlPullParser, "startColor", q5j.B, 0);
        boolean zR = p5q.r(xmlPullParser, "centerColor");
        int iF2 = p5q.f(typedArrayS, xmlPullParser, "centerColor", q5j.I, 0);
        int iF3 = p5q.f(typedArrayS, xmlPullParser, "endColor", q5j.C, 0);
        int iK2 = p5q.k(typedArrayS, xmlPullParser, "tileMode", q5j.H, 0);
        float fJ7 = p5q.j(typedArrayS, xmlPullParser, "gradientRadius", q5j.G, 0.0f);
        typedArrayS.recycle();
        a aVarA = a(c(resources, xmlPullParser, attributeSet, theme), iF, iF3, zR, iF2);
        if (iK != 1) {
            return iK != 2 ? new LinearGradient(fJ, fJ2, fJ3, fJ4, aVarA.f18544a, aVarA.f18545b, d(iK2)) : new SweepGradient(fJ5, fJ6, aVarA.f18544a, aVarA.f18545b);
        }
        if (fJ7 > 0.0f) {
            return new RadialGradient(fJ5, fJ6, fJ7, aVarA.f18544a, aVarA.f18545b, d(iK2));
        }
        throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
    }

    public static a c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int depth2 = xmlPullParser.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                TypedArray typedArrayS = p5q.s(resources, theme, attributeSet, q5j.N);
                boolean zHasValue = typedArrayS.hasValue(q5j.O);
                boolean zHasValue2 = typedArrayS.hasValue(q5j.P);
                if (!zHasValue || !zHasValue2) {
                    throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
                }
                int color = typedArrayS.getColor(q5j.O, 0);
                float f = typedArrayS.getFloat(q5j.P, 0.0f);
                typedArrayS.recycle();
                arrayList2.add(Integer.valueOf(color));
                arrayList.add(Float.valueOf(f));
            }
        }
        if (arrayList2.size() > 0) {
            return new a(arrayList2, arrayList);
        }
        return null;
    }

    public static Shader.TileMode d(int i) {
        if (i != 1) {
            return i != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
        }
        return Shader.TileMode.REPEAT;
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int[] f18544a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float[] f18545b;

        public a(List<Integer> list, List<Float> list2) {
            int size = list.size();
            this.f18544a = new int[size];
            this.f18545b = new float[size];
            for (int i = 0; i < size; i++) {
                this.f18544a[i] = list.get(i).intValue();
                this.f18545b[i] = list2.get(i).floatValue();
            }
        }

        public a(int i, int i2) {
            this.f18544a = new int[]{i, i2};
            this.f18545b = new float[]{0.0f, 1.0f};
        }

        public a(int i, int i2, int i3) {
            this.f18544a = new int[]{i, i2, i3};
            this.f18545b = new float[]{0.0f, 0.5f, 1.0f};
        }
    }
}
