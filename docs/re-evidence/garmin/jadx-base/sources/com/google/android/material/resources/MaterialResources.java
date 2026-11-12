package com.google.android.material.resources;

import a7.b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.appcompat.widget.w0;
import com.google.android.material.R;
import j.a;

/* JADX INFO: loaded from: classes14.dex */
public class MaterialResources {
    private static final float FONT_SCALE_1_3 = 1.3f;
    private static final float FONT_SCALE_2_0 = 2.0f;

    private MaterialResources() {
    }

    public static ColorStateList getColorStateList(Context context, w0 w0Var, int i14) {
        int resourceId;
        ColorStateList colorStateList;
        return (!w0Var.f5271b.hasValue(i14) || (resourceId = w0Var.f5271b.getResourceId(i14, 0)) == 0 || (colorStateList = b.getColorStateList(context, resourceId)) == null) ? w0Var.a(i14) : colorStateList;
    }

    private static int getComplexUnit(TypedValue typedValue) {
        return typedValue.getComplexUnit();
    }

    public static int getDimensionPixelSize(Context context, TypedArray typedArray, int i14, int i15) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i14, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i14, i15);
        }
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, i15);
        typedArrayObtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    public static Drawable getDrawable(Context context, TypedArray typedArray, int i14) {
        int resourceId;
        Drawable drawableA;
        return (!typedArray.hasValue(i14) || (resourceId = typedArray.getResourceId(i14, 0)) == 0 || (drawableA = a.a(context, resourceId)) == null) ? typedArray.getDrawable(i14) : drawableA;
    }

    public static float getFontScale(Context context) {
        return context.getResources().getConfiguration().fontScale;
    }

    public static int getIndexWithValue(TypedArray typedArray, int i14, int i15) {
        return typedArray.hasValue(i14) ? i14 : i15;
    }

    public static TextAppearance getTextAppearance(Context context, TypedArray typedArray, int i14) {
        int resourceId;
        if (!typedArray.hasValue(i14) || (resourceId = typedArray.getResourceId(i14, 0)) == 0) {
            return null;
        }
        return new TextAppearance(context, resourceId);
    }

    public static int getUnscaledTextSize(Context context, int i14, int i15) {
        if (i14 != 0) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i14, R.styleable.TextAppearance);
            TypedValue typedValue = new TypedValue();
            boolean value = typedArrayObtainStyledAttributes.getValue(R.styleable.TextAppearance_android_textSize, typedValue);
            typedArrayObtainStyledAttributes.recycle();
            if (value) {
                int complexUnit = getComplexUnit(typedValue);
                int i16 = typedValue.data;
                return complexUnit == 2 ? Math.round(TypedValue.complexToFloat(i16) * context.getResources().getDisplayMetrics().density) : TypedValue.complexToDimensionPixelSize(i16, context.getResources().getDisplayMetrics());
            }
        }
        return i15;
    }

    public static boolean isFontScaleAtLeast1_3(Context context) {
        return context.getResources().getConfiguration().fontScale >= FONT_SCALE_1_3;
    }

    public static boolean isFontScaleAtLeast2_0(Context context) {
        return context.getResources().getConfiguration().fontScale >= FONT_SCALE_2_0;
    }

    public static ColorStateList getColorStateList(Context context, TypedArray typedArray, int i14) {
        int resourceId;
        ColorStateList colorStateList;
        return (!typedArray.hasValue(i14) || (resourceId = typedArray.getResourceId(i14, 0)) == 0 || (colorStateList = b.getColorStateList(context, resourceId)) == null) ? typedArray.getColorStateList(i14) : colorStateList;
    }
}
