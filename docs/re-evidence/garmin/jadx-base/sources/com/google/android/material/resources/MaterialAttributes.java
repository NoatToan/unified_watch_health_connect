package com.google.android.material.resources;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import com.google.android.material.R;
import org.apache.commons.lang3.e;

/* JADX INFO: loaded from: classes14.dex */
public class MaterialAttributes {
    public static TypedValue resolve(Context context, int i14) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i14, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean resolveBoolean(Context context, int i14, boolean z14) {
        TypedValue typedValueResolve = resolve(context, i14);
        if (typedValueResolve == null || typedValueResolve.type != 18) {
            return z14;
        }
        return typedValueResolve.data != 0;
    }

    public static boolean resolveBooleanOrThrow(Context context, int i14, String str) {
        return resolveOrThrow(context, i14, str) != 0;
    }

    public static int resolveDimension(Context context, int i14, int i15) {
        TypedValue typedValueResolve = resolve(context, i14);
        return (int) ((typedValueResolve == null || typedValueResolve.type != 5) ? context.getResources().getDimension(i15) : typedValueResolve.getDimension(context.getResources().getDisplayMetrics()));
    }

    public static int resolveInteger(Context context, int i14, int i15) {
        TypedValue typedValueResolve = resolve(context, i14);
        return (typedValueResolve == null || typedValueResolve.type != 16) ? i15 : typedValueResolve.data;
    }

    public static int resolveMinimumAccessibleTouchTarget(Context context) {
        return resolveDimension(context, R.attr.minTouchTargetSize, R.dimen.mtrl_min_touch_target_size);
    }

    public static int resolveOrThrow(Context context, int i14, String str) {
        return resolveTypedValueOrThrow(context, i14, str).data;
    }

    public static TypedValue resolveTypedValueOrThrow(Context context, int i14, String str) {
        TypedValue typedValueResolve = resolve(context, i14);
        if (typedValueResolve != null) {
            return typedValueResolve;
        }
        e.s("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", new Object[]{str, context.getResources().getResourceName(i14)});
        return null;
    }

    public static int resolveOrThrow(View view2, int i14) {
        return resolveTypedValueOrThrow(view2, i14).data;
    }

    public static TypedValue resolveTypedValueOrThrow(View view2, int i14) {
        return resolveTypedValueOrThrow(view2.getContext(), i14, view2.getClass().getCanonicalName());
    }
}
