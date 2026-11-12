package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.util.Log;
import android.util.Size;
import android.view.WindowManager;
import com.huawei.openalliance.ad.constant.Constants;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes20.dex */
public class xdv {
    private static final String d = "HwDeviceUtils";

    public static boolean a() {
        return b("ro.build.characteristics", "") != null && b("ro.build.characteristics", "").equalsIgnoreCase("tablet");
    }

    public static boolean b() {
        return (b("ro.config.hw_fold_disp", "").isEmpty() && b("persist.sys.fold.disp.size", "").isEmpty()) ? false : true;
    }

    public static boolean c() {
        String[] strArrSplit = b("ro.config.hw_fold_disp", "").split(",");
        try {
            return strArrSplit.length == 9 && Integer.parseInt(strArrSplit[8]) / 100 == 3;
        } catch (NumberFormatException unused) {
            Log.w(d, "number format Exception");
        }
    }

    public static boolean d() {
        String[] strArrSplit = b("ro.config.hw_fold_disp", "").split(",");
        try {
            return strArrSplit.length == 9 && Integer.parseInt(strArrSplit[8]) == 1;
        } catch (NumberFormatException unused) {
            Log.e(d, "NumberFormatException!");
            return false;
        }
    }

    public static boolean e(Context context) {
        return e(a(context));
    }

    private static boolean e(Size size) {
        return size.getHeight() > 0 && Float.compare(((float) size.getWidth()) / ((float) size.getHeight()), 0.875f) >= 0;
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
        } catch (ClassNotFoundException e) {
            Log.w(d, "getProperty() : Get property failed. classNotFoundException:" + e.getMessage());
        } catch (IllegalAccessException e2) {
            Log.w(d, "getProperty() : Get property failed. illegalAccessException:" + e2.getMessage());
        } catch (NoSuchMethodException e3) {
            Log.w(d, "getProperty() : Get property failed. noSuchMethodException:" + e3.getMessage());
        } catch (InvocationTargetException e4) {
            Log.w(d, "getProperty() : Get property failed. invocationTargetException:" + e4.getMessage());
        }
        return str2;
    }
}
