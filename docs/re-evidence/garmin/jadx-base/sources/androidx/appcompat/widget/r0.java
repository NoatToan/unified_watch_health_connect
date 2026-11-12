package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f5232a = new ThreadLocal<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f5233b = {-16842910};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f5234c = {R.attr.state_focused};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f5235d = {R.attr.state_pressed};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f5236e = {R.attr.state_checked};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f5237f = new int[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f5238g = new int[1];

    private r0() {
    }

    public static void a(Context context, View view2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(h.a.f80430j);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(117)) {
                view2.getClass().toString();
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static int b(int i14, Context context) {
        ColorStateList colorStateListD = d(i14, context);
        if (colorStateListD != null && colorStateListD.isStateful()) {
            return colorStateListD.getColorForState(f5233b, colorStateListD.getDefaultColor());
        }
        ThreadLocal<TypedValue> threadLocal = f5232a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f14 = typedValue.getFloat();
        int iC = c(i14, context);
        return c7.d.e(iC, Math.round(Color.alpha(iC) * f14));
    }

    public static int c(int i14, Context context) {
        int[] iArr = f5238g;
        iArr[0] = i14;
        w0 w0VarF = w0.f(context, null, iArr);
        try {
            return w0VarF.f5271b.getColor(0, 0);
        } finally {
            w0VarF.h();
        }
    }

    public static ColorStateList d(int i14, Context context) {
        int[] iArr = f5238g;
        iArr[0] = i14;
        w0 w0VarF = w0.f(context, null, iArr);
        try {
            return w0VarF.a(0);
        } finally {
            w0VarF.h();
        }
    }
}
