package com.google.android.material.motion;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.TypedValue;
import android.view.animation.AnimationUtils;
import android.view.animation.PathInterpolator;
import c7.g;
import com.google.android.material.resources.MaterialAttributes;
import com.google.firebase.messaging.l;
import fb1.c;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
public class MotionUtils {
    private static final String EASING_TYPE_CUBIC_BEZIER = "cubic-bezier";
    private static final String EASING_TYPE_FORMAT_END = ")";
    private static final String EASING_TYPE_FORMAT_START = "(";
    private static final String EASING_TYPE_PATH = "path";

    private MotionUtils() {
    }

    private static float getLegacyControlPoint(String[] strArr, int i14) {
        float f14 = Float.parseFloat(strArr[i14]);
        if (f14 >= 0.0f && f14 <= 1.0f) {
            return f14;
        }
        l.d(f14, "Motion easing control point value must be between 0 and 1; instead got: ");
        return 0.0f;
    }

    private static String getLegacyEasingContent(String str, String str2) {
        return c.m(1, str2.length() + 1, str);
    }

    private static TimeInterpolator getLegacyThemeInterpolator(String str) {
        if (!isLegacyEasingType(str, EASING_TYPE_CUBIC_BEZIER)) {
            if (isLegacyEasingType(str, EASING_TYPE_PATH)) {
                return new PathInterpolator(g.c(getLegacyEasingContent(str, EASING_TYPE_PATH)));
            }
            h.s(c.n("Invalid motion easing type: ", str));
            return null;
        }
        String[] strArrSplit = getLegacyEasingContent(str, EASING_TYPE_CUBIC_BEZIER).split(",");
        if (strArrSplit.length == 4) {
            return new PathInterpolator(getLegacyControlPoint(strArrSplit, 0), getLegacyControlPoint(strArrSplit, 1), getLegacyControlPoint(strArrSplit, 2), getLegacyControlPoint(strArrSplit, 3));
        }
        sn.a.z(strArrSplit.length, "Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: ");
        return null;
    }

    private static boolean isLegacyEasingAttribute(String str) {
        return isLegacyEasingType(str, EASING_TYPE_CUBIC_BEZIER) || isLegacyEasingType(str, EASING_TYPE_PATH);
    }

    private static boolean isLegacyEasingType(String str, String str2) {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str2);
        sb3.append(EASING_TYPE_FORMAT_START);
        return str.startsWith(sb3.toString()) && str.endsWith(EASING_TYPE_FORMAT_END);
    }

    public static int resolveThemeDuration(Context context, int i14, int i15) {
        return MaterialAttributes.resolveInteger(context, i14, i15);
    }

    public static TimeInterpolator resolveThemeInterpolator(Context context, int i14, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i14, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type == 3) {
            String strValueOf = String.valueOf(typedValue.string);
            return isLegacyEasingAttribute(strValueOf) ? getLegacyThemeInterpolator(strValueOf) : AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        h.s("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        return null;
    }
}
