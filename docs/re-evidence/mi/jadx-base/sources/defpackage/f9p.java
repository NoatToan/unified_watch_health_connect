package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class f9p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f17576a = new ThreadLocal<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f17577b = {-16842910};
    public static final int[] c = {R.attr.state_focused};
    public static final int[] d = {R.attr.state_activated};
    public static final int[] e = {R.attr.state_pressed};
    public static final int[] f = {R.attr.state_checked};
    public static final int[] g = {R.attr.state_selected};
    public static final int[] h = {-16842919, -16842908};
    public static final int[] i = new int[0];
    public static final int[] j = new int[1];

    public static void a(View view, Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(z5j.A0);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(z5j.F0)) {
                StringBuilder sb = new StringBuilder();
                sb.append("View ");
                sb.append(view.getClass());
                sb.append(" is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static int b(Context context, int i2) {
        ColorStateList colorStateListE = e(context, i2);
        if (colorStateListE != null && colorStateListE.isStateful()) {
            return colorStateListE.getColorForState(f17577b, colorStateListE.getDefaultColor());
        }
        TypedValue typedValueF = f();
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValueF, true);
        return d(context, i2, typedValueF.getFloat());
    }

    public static int c(Context context, int i2) {
        int[] iArr = j;
        iArr[0] = i2;
        xfp xfpVarU = xfp.u(context, null, iArr);
        try {
            return xfpVarU.b(0, 0);
        } finally {
            xfpVarU.w();
        }
    }

    public static int d(Context context, int i2, float f2) {
        int iC = c(context, i2);
        return z44.p(iC, Math.round(Color.alpha(iC) * f2));
    }

    public static ColorStateList e(Context context, int i2) {
        int[] iArr = j;
        iArr[0] = i2;
        xfp xfpVarU = xfp.u(context, null, iArr);
        try {
            return xfpVarU.c(0);
        } finally {
            xfpVarU.w();
        }
    }

    public static TypedValue f() {
        ThreadLocal<TypedValue> threadLocal = f17576a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }
}
