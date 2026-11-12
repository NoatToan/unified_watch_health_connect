package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes10.dex */
public class qad {
    public static int a(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        Point point = new Point();
        windowManager.getDefaultDisplay().getRealSize(point);
        return point.y;
    }

    public static int b(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        Point point = new Point();
        windowManager.getDefaultDisplay().getRealSize(point);
        return point.x;
    }
}
