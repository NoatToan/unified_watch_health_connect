package defpackage;

import android.view.View;
import com.facebook.yoga.YogaMeasureMode;

/* JADX INFO: loaded from: classes4.dex */
public class lae {
    public static float a(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 0) {
            return Float.POSITIVE_INFINITY;
        }
        return size;
    }

    public static float b(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            return size;
        }
        return 0.0f;
    }

    public static YogaMeasureMode c(float f, float f2) {
        if (f == f2) {
            return YogaMeasureMode.EXACTLY;
        }
        return Float.isInfinite(f2) ? YogaMeasureMode.UNDEFINED : YogaMeasureMode.AT_MOST;
    }

    public static float d(float f, float f2) {
        if (f != f2 && Float.isInfinite(f2)) {
            return Float.POSITIVE_INFINITY;
        }
        return exh.c(f2);
    }
}
