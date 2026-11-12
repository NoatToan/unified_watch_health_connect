package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.WindowManager;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;

/* JADX INFO: loaded from: classes.dex */
public class qqv {
    public static boolean a(Context context) {
        return d(context, 1.7777778f);
    }

    public static int d(Context context) {
        if (context == null) {
            LogUtil.e("HealthDisplayUtils", "getDeviceWidthPixels error: context is null");
            return 0;
        }
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    public static int b(Context context) {
        if (context == null) {
            LogUtil.e("HealthDisplayUtils", "getDeviceWidthPixels error: context is null");
            return 0;
        }
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    public static boolean c(Context context) {
        return d(context, 2.0f);
    }

    private static boolean d(Context context, float f) {
        if (context == null) {
            LogUtil.j("HealthDisplayUtils", "isMoreThanResolutionDisplay: context is null");
            return false;
        }
        Object systemService = context.getSystemService(Constants.NATIVE_WINDOW_SUB_DIR);
        if (!(systemService instanceof WindowManager)) {
            LogUtil.j("HealthDisplayUtils", "object is invalid type");
            return false;
        }
        if (qrs.af(context) && qrs.t()) {
            return true;
        }
        WindowManager windowManager = (WindowManager) systemService;
        return ((float) windowManager.getDefaultDisplay().getHeight()) / ((float) windowManager.getDefaultDisplay().getWidth()) > f;
    }

    public static Resources a(Resources resources, float f) {
        Configuration configuration = resources.getConfiguration();
        if (configuration.fontScale > f) {
            configuration.fontScale = f;
            resources.updateConfiguration(null, null);
        }
        return resources;
    }
}
