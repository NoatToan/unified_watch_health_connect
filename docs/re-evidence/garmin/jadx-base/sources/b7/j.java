package b7;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
public class j {
    private j() {
    }

    public static int a(int i14, int i15, Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i14, typedValue, true);
        return typedValue.resourceId != 0 ? i14 : i15;
    }

    public static ColorStateList b(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, int i14) {
        if (!e(xmlPullParser, "tint")) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i14, typedValue);
        int i15 = typedValue.type;
        if (i15 == 2) {
            throw new UnsupportedOperationException("Failed to resolve attribute at index " + i14 + ": " + typedValue);
        }
        if (i15 >= 28 && i15 <= 31) {
            return ColorStateList.valueOf(typedValue.data);
        }
        Resources resources = typedArray.getResources();
        int resourceId = typedArray.getResourceId(i14, 0);
        ThreadLocal<TypedValue> threadLocal = c.f16238a;
        try {
            return c.a(resources, resources.getXml(resourceId), theme);
        } catch (Exception unused) {
            return null;
        }
    }

    public static d c(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i14) {
        d dVarA;
        if (e(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i14, typedValue);
            int i15 = typedValue.type;
            if (i15 >= 28 && i15 <= 31) {
                return d.b(typedValue.data);
            }
            try {
                dVarA = d.a(typedArray.getResourceId(i14, 0), theme, typedArray.getResources());
            } catch (Exception unused) {
                dVarA = null;
            }
            if (dVarA != null) {
                return dVarA;
            }
        }
        return d.b(0);
    }

    public static int d(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i14, int i15) {
        return !e(xmlPullParser, str) ? i15 : typedArray.getInt(i14, i15);
    }

    public static boolean e(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static TypedArray f(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}
