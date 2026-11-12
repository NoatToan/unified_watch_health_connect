package com.google.android.material.internal;

import am.j;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.w0;
import com.google.android.material.R;
import com.google.android.material.resources.MaterialAttributes;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
public final class ThemeEnforcement {
    private static final String APPCOMPAT_THEME_NAME = "Theme.AppCompat";
    private static final String MATERIAL_THEME_NAME = "Theme.MaterialComponents";
    private static final int[] APPCOMPAT_CHECK_ATTRS = {R.attr.colorPrimary};
    private static final int[] MATERIAL_CHECK_ATTRS = {R.attr.colorPrimaryVariant};

    private ThemeEnforcement() {
    }

    public static void checkAppCompatTheme(Context context) {
        checkTheme(context, APPCOMPAT_CHECK_ATTRS, APPCOMPAT_THEME_NAME);
    }

    private static void checkCompatibleTheme(Context context, AttributeSet attributeSet, int i14, int i15) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ThemeEnforcement, i14, i15);
        boolean z14 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.ThemeEnforcement_enforceMaterialTheme, false);
        typedArrayObtainStyledAttributes.recycle();
        if (z14) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                checkMaterialTheme(context);
            }
        }
        checkAppCompatTheme(context);
    }

    public static void checkMaterialTheme(Context context) {
        checkTheme(context, MATERIAL_CHECK_ATTRS, MATERIAL_THEME_NAME);
    }

    private static void checkTextAppearance(Context context, AttributeSet attributeSet, int[] iArr, int i14, int i15, int... iArr2) {
        boolean zIsCustomTextAppearanceValid;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ThemeEnforcement, i14, i15);
        if (!typedArrayObtainStyledAttributes.getBoolean(R.styleable.ThemeEnforcement_enforceTextAppearance, false)) {
            typedArrayObtainStyledAttributes.recycle();
            return;
        }
        if (iArr2 == null || iArr2.length == 0) {
            zIsCustomTextAppearanceValid = typedArrayObtainStyledAttributes.getResourceId(R.styleable.ThemeEnforcement_android_textAppearance, -1) != -1;
        } else {
            zIsCustomTextAppearanceValid = isCustomTextAppearanceValid(context, attributeSet, iArr, i14, i15, iArr2);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (zIsCustomTextAppearanceValid) {
            return;
        }
        h.s("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
    }

    private static void checkTheme(Context context, int[] iArr, String str) {
        if (isTheme(context, iArr)) {
            return;
        }
        h.s(j.m("The style on this component requires your app theme to be ", str, " (or a descendant)."));
    }

    public static boolean isAppCompatTheme(Context context) {
        return isTheme(context, APPCOMPAT_CHECK_ATTRS);
    }

    private static boolean isCustomTextAppearanceValid(Context context, AttributeSet attributeSet, int[] iArr, int i14, int i15, int... iArr2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i14, i15);
        for (int i16 : iArr2) {
            if (typedArrayObtainStyledAttributes.getResourceId(i16, -1) == -1) {
                typedArrayObtainStyledAttributes.recycle();
                return false;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return true;
    }

    public static boolean isMaterial3Theme(Context context) {
        return MaterialAttributes.resolveBoolean(context, R.attr.isMaterial3Theme, false);
    }

    public static boolean isMaterialTheme(Context context) {
        return isTheme(context, MATERIAL_CHECK_ATTRS);
    }

    private static boolean isTheme(Context context, int[] iArr) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i14 = 0; i14 < iArr.length; i14++) {
            if (!typedArrayObtainStyledAttributes.hasValue(i14)) {
                typedArrayObtainStyledAttributes.recycle();
                return false;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return true;
    }

    public static TypedArray obtainStyledAttributes(Context context, AttributeSet attributeSet, int[] iArr, int i14, int i15, int... iArr2) {
        checkCompatibleTheme(context, attributeSet, i14, i15);
        checkTextAppearance(context, attributeSet, iArr, i14, i15, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i14, i15);
    }

    public static w0 obtainTintedStyledAttributes(Context context, AttributeSet attributeSet, int[] iArr, int i14, int i15, int... iArr2) {
        checkCompatibleTheme(context, attributeSet, i14, i15);
        checkTextAppearance(context, attributeSet, iArr, i14, i15, iArr2);
        return w0.g(context, attributeSet, iArr, i14, i15);
    }
}
