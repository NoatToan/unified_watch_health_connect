package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.os.Looper;
import android.view.View;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.ViewCompat;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.hwcommonmodel.application.BaseApplication;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes16.dex */
public class qqn {
    public static int c(int i, float f, boolean z) {
        if (f < 0.0f || f > 1.0f) {
            return i;
        }
        return (i & ViewCompat.MEASURED_SIZE_MASK) | (((int) (f * (z ? 255 : 255 & (i >> 24)))) << 24);
    }

    public static int d(int i) {
        return BaseApplication.getContext().getResources().getColor(i);
    }

    public static int b(Context context, int i) {
        if (context == null) {
            return 0;
        }
        return context.getResources().getColor(i);
    }

    public static int b(int i, float f) {
        return c(i, f, true);
    }

    public static int d(int i, float f) {
        return ColorUtils.setAlphaComponent(i, (int) UnitUtil.d(Math.min(Math.max(f, 0.0f), 1.0f) * 255.0f, 0));
    }

    public static int c(int i) {
        return ((int) (((((double) Color.red(i)) * 0.299d) + (((double) Color.green(i)) * 0.587d)) + (((double) Color.blue(i)) * 0.114d))) >= 192 ? 1 : 0;
    }

    public static void d(final View view) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            view.setLayerType(2, a(0.0f));
        } else {
            HandlerExecutor.c(new Runnable() { // from class: qqn.2
                @Override // java.lang.Runnable
                public void run() {
                    qqn.d(view);
                }
            });
        }
    }

    public static void a(final View view) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            view.setLayerType(2, a(1.0f));
        } else {
            HandlerExecutor.c(new Runnable() { // from class: qqn.5
                @Override // java.lang.Runnable
                public void run() {
                    qqn.a(view);
                }
            });
        }
    }

    private static Paint a(float f) {
        Paint paint = new Paint();
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(f);
        paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        return paint;
    }
}
