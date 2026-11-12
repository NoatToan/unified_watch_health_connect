package com.xiaomi.smarthome.library.common.widget.nestscroll;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;

/* JADX INFO: loaded from: classes2.dex */
public class UIUtils {
    public static final int dpToPx(float f) {
        return (int) ((f * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    public static Point getDisplaySize(Activity activity) {
        Point point = new Point();
        activity.getWindowManager().getDefaultDisplay().getSize(point);
        return point;
    }

    public static int getScreenWidth(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }
}
