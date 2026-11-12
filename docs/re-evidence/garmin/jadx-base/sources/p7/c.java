package p7;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EdgeEffect;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    public static class a {
        private a() {
        }

        public static EdgeEffect a(Context context, AttributeSet attributeSet) {
            try {
                return new EdgeEffect(context, attributeSet);
            } catch (Throwable unused) {
                return new EdgeEffect(context);
            }
        }

        public static float b(EdgeEffect edgeEffect) {
            try {
                return edgeEffect.getDistance();
            } catch (Throwable unused) {
                return 0.0f;
            }
        }

        public static float c(EdgeEffect edgeEffect, float f14, float f15) {
            try {
                return edgeEffect.onPullDistance(f14, f15);
            } catch (Throwable unused) {
                edgeEffect.onPull(f14, f15);
                return 0.0f;
            }
        }
    }

    @Deprecated
    public c(Context context) {
        new EdgeEffect(context);
    }

    public static float a(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return a.b(edgeEffect);
        }
        return 0.0f;
    }

    public static float b(EdgeEffect edgeEffect, float f14, float f15) {
        if (Build.VERSION.SDK_INT >= 31) {
            return a.c(edgeEffect, f14, f15);
        }
        edgeEffect.onPull(f14, f15);
        return f14;
    }
}
