package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes20.dex */
public class xfu {
    public static boolean c(Context context) {
        return xft.c(context) == 1;
    }

    public static boolean c(Rect rect, float f, float f2) {
        return rect != null && Float.compare(f, -8.0f) >= 0 && Float.compare(f2, -8.0f) >= 0 && Float.compare(f, ((float) (rect.right - rect.left)) + 8.0f) == -1 && Float.compare(f2, ((float) (rect.bottom - rect.top)) + 8.0f) == -1;
    }

    public static float d(Context context) {
        return context.getResources().getConfiguration().fontScale;
    }

    public static boolean e(Context context) {
        return context.getResources().getConfiguration().orientation == 1;
    }

    public static boolean a(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return ((Activity) context).isInMultiWindowMode();
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return false;
    }
}
