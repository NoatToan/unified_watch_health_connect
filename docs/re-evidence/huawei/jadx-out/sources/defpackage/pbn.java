package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.Window;
import com.huawei.health.device.open.data.model.HealthData;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.manager.model.KakaConstants;

/* JADX INFO: loaded from: classes13.dex */
public class pbn {
    public static int g(Context context) {
        return qrs.i(context);
    }

    public static int j(Context context) {
        return qrs.g(context);
    }

    public static int b(Context context) {
        return ((g(context) / 2) - qrs.d(context, 140.0f)) / 2;
    }

    public static int i(Context context) {
        return ((g(context) / 2) - e(context)) / 2;
    }

    public static int e(Context context) {
        return qrs.d(context, 150.0f);
    }

    public static int a(Context context) {
        return qrs.d(context, 140.0f);
    }

    public static int d(Context context) {
        if (qrs.af(context)) {
            return (c(context) * 660) / KakaConstants.TASK_RUN_BEHAVIOR;
        }
        return (c(context) * 686) / 720;
    }

    public static int h(Context context) {
        if (qrs.af(context)) {
            return qrs.d(context, 65.0f);
        }
        return qrs.d(context, 72.0f);
    }

    public static int c(Context context) {
        return g(context);
    }

    public static void c(Activity activity) {
        if (activity == null) {
            LogUtil.j("PLGACHIEVE_ScreenUtil", "setImmersive activity is null");
            return;
        }
        Window window = activity.getWindow();
        if (window == null) {
            LogUtil.j("PLGACHIEVE_ScreenUtil", "setImmersive window is null");
            return;
        }
        window.clearFlags(201326592);
        window.getDecorView().setSystemUiVisibility(HealthData.WEIGHT);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
    }
}
