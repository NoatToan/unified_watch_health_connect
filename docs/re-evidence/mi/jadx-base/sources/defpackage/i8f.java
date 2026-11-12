package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.collection.ScatterMapKt;

/* JADX INFO: loaded from: classes5.dex */
public class i8f {
    public static int a(int i, @IntRange(from = 0, to = ScatterMapKt.Sentinel) int i2) {
        return z44.p(i, (Color.alpha(i) * i2) / 255);
    }

    public static int b(Context context, int i, int i2) {
        TypedValue typedValueA = e8f.a(context, i);
        return typedValueA != null ? typedValueA.data : i2;
    }

    public static int c(Context context, int i, String str) {
        return e8f.d(context, i, str);
    }

    public static int d(View view, int i) {
        return e8f.e(view, i);
    }

    public static int e(View view, int i, int i2) {
        return b(view.getContext(), i, i2);
    }

    public static boolean f(int i) {
        return i != 0 && z44.e(i) > 0.5d;
    }

    public static int g(int i, int i2) {
        return z44.j(i2, i);
    }

    public static int h(int i, int i2, @FloatRange(from = 0.0d, to = 1.0d) float f) {
        return g(i, z44.p(i2, Math.round(Color.alpha(i2) * f)));
    }

    public static int i(View view, int i, int i2, @FloatRange(from = 0.0d, to = 1.0d) float f) {
        return h(d(view, i), d(view, i2), f);
    }
}
