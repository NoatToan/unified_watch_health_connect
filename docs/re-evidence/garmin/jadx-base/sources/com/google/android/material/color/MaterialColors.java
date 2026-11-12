package com.google.android.material.color;

import a7.b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import c7.d;
import com.google.android.material.R;
import com.google.android.material.color.utilities.Blend;
import com.google.android.material.color.utilities.Hct;
import com.google.android.material.resources.MaterialAttributes;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
public class MaterialColors {
    public static final float ALPHA_DISABLED = 0.38f;
    public static final float ALPHA_DISABLED_LOW = 0.12f;
    public static final float ALPHA_FULL = 1.0f;
    public static final float ALPHA_LOW = 0.32f;
    public static final float ALPHA_MEDIUM = 0.54f;
    private static final int CHROMA_NEUTRAL = 6;
    private static final int TONE_ACCENT_CONTAINER_DARK = 30;
    private static final int TONE_ACCENT_CONTAINER_LIGHT = 90;
    private static final int TONE_ACCENT_DARK = 80;
    private static final int TONE_ACCENT_LIGHT = 40;
    private static final int TONE_ON_ACCENT_CONTAINER_DARK = 90;
    private static final int TONE_ON_ACCENT_CONTAINER_LIGHT = 10;
    private static final int TONE_ON_ACCENT_DARK = 20;
    private static final int TONE_ON_ACCENT_LIGHT = 100;
    private static final int TONE_SURFACE_CONTAINER_DARK = 12;
    private static final int TONE_SURFACE_CONTAINER_HIGH_DARK = 17;
    private static final int TONE_SURFACE_CONTAINER_HIGH_LIGHT = 92;
    private static final int TONE_SURFACE_CONTAINER_LIGHT = 94;

    private MaterialColors() {
    }

    public static int compositeARGBWithAlpha(int i14, int i15) {
        return d.e(i14, (Color.alpha(i14) * i15) / 255);
    }

    public static int getColor(View view2, int i14) {
        return resolveColor(view2.getContext(), MaterialAttributes.resolveTypedValueOrThrow(view2, i14));
    }

    public static Integer getColorOrNull(Context context, int i14) {
        TypedValue typedValueResolve = MaterialAttributes.resolve(context, i14);
        if (typedValueResolve != null) {
            return Integer.valueOf(resolveColor(context, typedValueResolve));
        }
        return null;
    }

    private static int getColorRole(int i14, int i15, int i16) {
        Hct hctFromInt = Hct.fromInt(getColorRole(i14, i15));
        hctFromInt.setChroma(i16);
        return hctFromInt.toInt();
    }

    public static ColorRoles getColorRoles(int i14, boolean z14) {
        return z14 ? new ColorRoles(getColorRole(i14, 40), getColorRole(i14, 100), getColorRole(i14, 90), getColorRole(i14, 10)) : new ColorRoles(getColorRole(i14, 80), getColorRole(i14, 20), getColorRole(i14, 30), getColorRole(i14, 90));
    }

    public static ColorStateList getColorStateList(Context context, int i14, ColorStateList colorStateList) {
        TypedValue typedValueResolve = MaterialAttributes.resolve(context, i14);
        ColorStateList colorStateListResolveColorStateList = typedValueResolve != null ? resolveColorStateList(context, typedValueResolve) : null;
        return colorStateListResolveColorStateList == null ? colorStateList : colorStateListResolveColorStateList;
    }

    public static ColorStateList getColorStateListOrNull(Context context, int i14) {
        TypedValue typedValueResolve = MaterialAttributes.resolve(context, i14);
        if (typedValueResolve == null) {
            return null;
        }
        int i15 = typedValueResolve.resourceId;
        if (i15 != 0) {
            return b.getColorStateList(context, i15);
        }
        int i16 = typedValueResolve.data;
        if (i16 != 0) {
            return ColorStateList.valueOf(i16);
        }
        return null;
    }

    public static int getSurfaceContainerFromSeed(Context context, int i14) {
        return getColorRole(i14, isLightTheme(context) ? 94 : 12, 6);
    }

    public static int getSurfaceContainerHighFromSeed(Context context, int i14) {
        return getColorRole(i14, isLightTheme(context) ? 92 : 17, 6);
    }

    public static int harmonize(int i14, int i15) {
        return Blend.harmonize(i14, i15);
    }

    public static int harmonizeWithPrimary(Context context, int i14) {
        return harmonize(i14, getColor(context, R.attr.colorPrimary, MaterialColors.class.getCanonicalName()));
    }

    public static boolean isColorLight(int i14) {
        if (i14 == 0) {
            return false;
        }
        ThreadLocal<double[]> threadLocal = d.f25188a;
        double[] dArr = threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        int iRed = Color.red(i14);
        int iGreen = Color.green(i14);
        int iBlue = Color.blue(i14);
        if (dArr.length != 3) {
            h.s("outXyz must have a length of 3.");
            return false;
        }
        double d14 = ((double) iRed) / 255.0d;
        double dPow = d14 < 0.04045d ? d14 / 12.92d : Math.pow((d14 + 0.055d) / 1.055d, 2.4d);
        double d15 = ((double) iGreen) / 255.0d;
        double dPow2 = d15 < 0.04045d ? d15 / 12.92d : Math.pow((d15 + 0.055d) / 1.055d, 2.4d);
        double d16 = ((double) iBlue) / 255.0d;
        double dPow3 = d16 < 0.04045d ? d16 / 12.92d : Math.pow((d16 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.1805d * dPow3) + (0.3576d * dPow2) + (0.4124d * dPow)) * 100.0d;
        double d17 = ((0.0722d * dPow3) + (0.7152d * dPow2) + (0.2126d * dPow)) * 100.0d;
        dArr[1] = d17;
        dArr[2] = ((dPow3 * 0.9505d) + (dPow2 * 0.1192d) + (dPow * 0.0193d)) * 100.0d;
        return d17 / 100.0d > 0.5d;
    }

    public static boolean isLightTheme(Context context) {
        return MaterialAttributes.resolveBoolean(context, R.attr.isLightTheme, true);
    }

    public static int layer(int i14, int i15, float f14) {
        return layer(i14, d.e(i15, Math.round(Color.alpha(i15) * f14)));
    }

    private static int resolveColor(Context context, TypedValue typedValue) {
        int i14 = typedValue.resourceId;
        return i14 != 0 ? b.getColor(context, i14) : typedValue.data;
    }

    private static ColorStateList resolveColorStateList(Context context, TypedValue typedValue) {
        int i14 = typedValue.resourceId;
        return i14 != 0 ? b.getColorStateList(context, i14) : ColorStateList.valueOf(typedValue.data);
    }

    public static int getColor(Context context, int i14, String str) {
        return resolveColor(context, MaterialAttributes.resolveTypedValueOrThrow(context, i14, str));
    }

    public static int getColor(View view2, int i14, int i15) {
        return getColor(view2.getContext(), i14, i15);
    }

    public static int getColor(Context context, int i14, int i15) {
        Integer colorOrNull = getColorOrNull(context, i14);
        return colorOrNull != null ? colorOrNull.intValue() : i15;
    }

    private static int getColorRole(int i14, int i15) {
        Hct hctFromInt = Hct.fromInt(i14);
        hctFromInt.setTone(i15);
        return hctFromInt.toInt();
    }

    public static int layer(View view2, int i14, int i15, float f14) {
        return layer(getColor(view2, i14), getColor(view2, i15), f14);
    }

    public static int layer(View view2, int i14, int i15) {
        return layer(view2, i14, i15, 1.0f);
    }

    public static int layer(int i14, int i15) {
        return d.c(i15, i14);
    }

    public static ColorRoles getColorRoles(Context context, int i14) {
        return getColorRoles(i14, isLightTheme(context));
    }
}
