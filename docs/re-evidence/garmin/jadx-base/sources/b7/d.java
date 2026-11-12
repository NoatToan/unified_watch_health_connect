package b7;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.util.Xml;
import com.garmin.android.gncs.NotificationConstants;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Shader f16239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ColorStateList f16240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f16241c;

    private d(Shader shader, ColorStateList colorStateList, int i14) {
        this.f16239a = shader;
        this.f16240b = colorStateList;
        this.f16241c = i14;
    }

    public static d a(int i14, Resources.Theme theme, Resources resources) throws XmlPullParserException, IOException {
        int next;
        float f14;
        float f15;
        Shader.TileMode tileMode;
        Shader radialGradient;
        Shader.TileMode tileMode2;
        XmlResourceParser xml = resources.getXml(i14);
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.getClass();
        if (!name.equals("gradient")) {
            if (name.equals("selector")) {
                ColorStateList colorStateListB = c.b(resources, xml, attributeSetAsAttributeSet, theme);
                return new d(null, colorStateListB, colorStateListB.getDefaultColor());
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        TypedArray typedArrayF = j.f(resources, theme, attributeSetAsAttributeSet, y6.a.f194591e);
        float f16 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startX") != null ? typedArrayF.getFloat(8, 0.0f) : 0.0f;
        float f17 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startY") != null ? typedArrayF.getFloat(9, 0.0f) : 0.0f;
        float f18 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endX") != null ? typedArrayF.getFloat(10, 0.0f) : 0.0f;
        float f19 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endY") != null ? typedArrayF.getFloat(11, 0.0f) : 0.0f;
        float f22 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerX") != null ? typedArrayF.getFloat(3, 0.0f) : 0.0f;
        float f24 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerY") != null ? typedArrayF.getFloat(4, 0.0f) : 0.0f;
        int i15 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", NotificationConstants.KEY_DATA_MIME_TYPE) != null ? typedArrayF.getInt(2, 0) : 0;
        int color = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startColor") != null ? typedArrayF.getColor(0, 0) : 0;
        boolean z14 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null;
        int color2 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null ? typedArrayF.getColor(7, 0) : 0;
        int color3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endColor") != null ? typedArrayF.getColor(1, 0) : 0;
        int i16 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "tileMode") != null ? typedArrayF.getInt(6, 0) : 0;
        float f25 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "gradientRadius") != null ? typedArrayF.getFloat(5, 0.0f) : 0.0f;
        typedArrayF.recycle();
        int depth = xml.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        float f26 = f25;
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next2 = xml.next();
            f14 = f18;
            if (next2 == 1) {
                f15 = f19;
                break;
            }
            int depth2 = xml.getDepth();
            f15 = f19;
            if (depth2 < depth && next2 == 3) {
                break;
            }
            if (next2 == 2 && depth2 <= depth && xml.getName().equals("item")) {
                TypedArray typedArrayF2 = j.f(resources, theme, attributeSetAsAttributeSet, y6.a.f194592f);
                boolean zHasValue = typedArrayF2.hasValue(0);
                boolean zHasValue2 = typedArrayF2.hasValue(1);
                if (!zHasValue || !zHasValue2) {
                    throw new XmlPullParserException(xml.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
                }
                int color4 = typedArrayF2.getColor(0, 0);
                float f27 = typedArrayF2.getFloat(1, 0.0f);
                typedArrayF2.recycle();
                arrayList2.add(Integer.valueOf(color4));
                arrayList.add(Float.valueOf(f27));
            }
            f18 = f14;
            f19 = f15;
        }
        f fVar = arrayList2.size() > 0 ? new f(arrayList2, arrayList) : null;
        if (fVar == null) {
            fVar = z14 ? new f(color, color2, color3) : new f(color, color3);
        }
        if (i15 != 1) {
            if (i15 != 2) {
                int[] iArr = fVar.f16253a;
                float[] fArr = fVar.f16254b;
                if (i16 != 1) {
                    tileMode2 = i16 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
                } else {
                    tileMode2 = Shader.TileMode.REPEAT;
                }
                radialGradient = new LinearGradient(f16, f17, f14, f15, iArr, fArr, tileMode2);
            } else {
                radialGradient = new SweepGradient(f22, f24, fVar.f16253a, fVar.f16254b);
            }
        } else {
            if (f26 <= 0.0f) {
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            }
            int[] iArr2 = fVar.f16253a;
            float[] fArr2 = fVar.f16254b;
            if (i16 != 1) {
                tileMode = i16 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
            } else {
                tileMode = Shader.TileMode.REPEAT;
            }
            radialGradient = new RadialGradient(f22, f24, f26, iArr2, fArr2, tileMode);
        }
        return new d(radialGradient, null, 0);
    }

    public static d b(int i14) {
        return new d(null, null, i14);
    }

    public final boolean c() {
        ColorStateList colorStateList;
        return this.f16239a == null && (colorStateList = this.f16240b) != null && colorStateList.isStateful();
    }
}
