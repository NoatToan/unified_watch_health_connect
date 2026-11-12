package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes5.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class k8f {
    public static ColorStateList a(Context context, xfp xfpVar, int i) {
        int iN;
        ColorStateList colorStateListA;
        return (!xfpVar.s(i) || (iN = xfpVar.n(i, 0)) == 0 || (colorStateListA = of1.a(context, iN)) == null) ? xfpVar.c(i) : colorStateListA;
    }

    public static ColorStateList b(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList colorStateListA;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListA = of1.a(context, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListA;
    }

    public static int c(TypedValue typedValue) {
        return typedValue.getComplexUnit();
    }

    public static int d(Context context, TypedArray typedArray, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i, i2);
        }
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, i2);
        typedArrayObtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    public static Drawable e(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable drawableB;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (drawableB = of1.b(context, resourceId)) == null) ? typedArray.getDrawable(i) : drawableB;
    }

    public static int f(TypedArray typedArray, int i, int i2) {
        return typedArray.hasValue(i) ? i : i2;
    }

    public static j7p g(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return new j7p(context, resourceId);
    }

    public static int h(Context context, int i, int i2) {
        if (i == 0) {
            return i2;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, b4j.a9);
        TypedValue typedValue = new TypedValue();
        boolean value = typedArrayObtainStyledAttributes.getValue(b4j.b9, typedValue);
        typedArrayObtainStyledAttributes.recycle();
        if (value) {
            return c(typedValue) == 2 ? Math.round(TypedValue.complexToFloat(typedValue.data) * context.getResources().getDisplayMetrics().density) : TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
        }
        return i2;
    }

    public static boolean i(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static boolean j(Context context) {
        return context.getResources().getConfiguration().fontScale >= 2.0f;
    }
}
