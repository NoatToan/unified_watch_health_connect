package defpackage;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;

/* JADX INFO: loaded from: classes3.dex */
public class hm1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TypedValue f20225a = new TypedValue();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f20226b = new ThreadLocal<>();

    public static TypedValue a(Context context) {
        if (context.getMainLooper().getThread() == Thread.currentThread()) {
            return f20225a;
        }
        ThreadLocal<TypedValue> threadLocal = f20226b;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    public static Integer b(Context context, int i) {
        TypedValue typedValueA = a(context);
        if (!context.getTheme().resolveAttribute(i, typedValueA, true)) {
            return null;
        }
        if (typedValueA.resourceId > 0) {
            return Integer.valueOf(context.getResources().getColor(typedValueA.resourceId));
        }
        int i2 = typedValueA.type;
        if (i2 < 28 || i2 > 31) {
            return null;
        }
        return Integer.valueOf(typedValueA.data);
    }

    public static int c(Context context, int i) {
        TypedValue typedValueA = a(context);
        if (context.getTheme().resolveAttribute(i, typedValueA, true)) {
            return typedValueA.resourceId;
        }
        return -1;
    }

    public static boolean d(Context context, int i, boolean z) {
        TypedValue typedValueA = a(context);
        if (!context.getTheme().resolveAttribute(i, typedValueA, true) || typedValueA.type != 18) {
            return z;
        }
        if (typedValueA.resourceId > 0) {
            return context.getResources().getBoolean(typedValueA.resourceId);
        }
        return typedValueA.data != 0;
    }

    public static int e(Context context, int i) {
        Integer numB = b(context, i);
        return numB != null ? numB.intValue() : context.getResources().getColor(-1);
    }

    public static int f(Context context, int i, int i2) {
        Integer numB = b(context, i);
        return numB != null ? numB.intValue() : i2;
    }

    public static int g(Context context, int i) {
        TypedValue typedValueK = k(context, i);
        if (typedValueK != null && typedValueK.type == 5) {
            return typedValueK.resourceId > 0 ? context.getResources().getDimensionPixelSize(typedValueK.resourceId) : TypedValue.complexToDimensionPixelSize(typedValueK.data, context.getResources().getDisplayMetrics());
        }
        return 0;
    }

    public static Drawable h(Context context, int i) {
        TypedValue typedValueA = a(context);
        if (!context.getTheme().resolveAttribute(i, typedValueA, true)) {
            return null;
        }
        if (typedValueA.resourceId > 0) {
            return context.getResources().getDrawable(typedValueA.resourceId, context.getTheme());
        }
        int i2 = typedValueA.type;
        if (i2 < 28 || i2 > 31) {
            return null;
        }
        return new ColorDrawable(typedValueA.data);
    }

    public static float i(Context context, int i, float f) {
        TypedValue typedValueA = a(context);
        if (!context.getTheme().resolveAttribute(i, typedValueA, true) || typedValueA.type != 4) {
            return f;
        }
        if (typedValueA.resourceId > 0) {
            return Build.VERSION.SDK_INT >= 29 ? context.getResources().getFloat(typedValueA.resourceId) : f;
        }
        return typedValueA.data;
    }

    public static int j(Context context, int i, int i2) {
        TypedValue typedValueA = a(context);
        if (!context.getTheme().resolveAttribute(i, typedValueA, true)) {
            return i2;
        }
        if (typedValueA.resourceId > 0) {
            return context.getResources().getInteger(typedValueA.resourceId);
        }
        int i3 = typedValueA.type;
        return (i3 < 16 || i3 > 31) ? i2 : typedValueA.data;
    }

    public static TypedValue k(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }
}
