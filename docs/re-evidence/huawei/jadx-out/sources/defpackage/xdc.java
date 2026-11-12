package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.util.Log;
import android.util.Size;
import android.view.WindowManager;
import com.huawei.openalliance.ad.constant.Constants;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes20.dex */
public class xdc {
    private static final String e = "HwDeviceUtils";

    public static boolean b() {
        String[] strArrSplit = b("ro.config.hw_fold_disp", "").split(",");
        try {
            return strArrSplit.length == 9 && Integer.parseInt(strArrSplit[8]) / 100 == 3;
        } catch (NumberFormatException unused) {
            Log.w(e, "number format Exception");
        }
    }

    public static boolean d() {
        String strB = b("ro.build.characteristics", "default");
        return strB != null && strB.equalsIgnoreCase("tablet");
    }

    public static boolean e(Context context) {
        return e(a(context));
    }

    private static boolean e(Size size) {
        return size != null && Float.compare(((float) size.getWidth()) / ((float) size.getHeight()), 0.875f) >= 0;
    }

    private static Size a(Context context) {
        Point point = new Point();
        ((WindowManager) context.getSystemService(Constants.NATIVE_WINDOW_SUB_DIR)).getDefaultDisplay().getRealSize(point);
        if (point.y < point.x) {
            return new Size(point.y, point.x);
        }
        return new Size(point.x, point.y);
    }

    private static String b(String str, String str2) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            Object objInvoke = cls.getMethod("get", String.class, String.class).invoke(cls, str, str2);
            if (objInvoke instanceof String) {
                return (String) objInvoke;
            }
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            Log.w(e, "getProperty() : Get property failed.");
        }
        return str2;
    }
}
