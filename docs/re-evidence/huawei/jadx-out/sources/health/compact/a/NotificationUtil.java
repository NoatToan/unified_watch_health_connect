package health.compact.a;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import com.google.android.material.timepicker.TimeModel;
import com.huawei.health.manager.util.UnitUtilExt;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.plugindaemon.R;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class NotificationUtil {
    private static final double[] e = {6.7d, 10.0d, 13.3d, 16.7d, 20.0d, 23.3d, 26.7d, 30.0d, 33.3d, 36.7d, 40.0d, 43.3d, 46.7d, 50.0d, 53.3d, 56.7d, 60.0d, 63.3d, 66.7d, 70.0d, 73.3d, 76.7d, 80.0d, 83.3d, 86.7d, 90.0d, 96.0d, 100.0d};
    private static final int[] d = {R.drawable.progress_3_3, R.drawable.progress_6_7, R.drawable.progress_10, R.drawable.progress_13_3, R.drawable.progress_16_7, R.drawable.progress_20, R.drawable.progress_23_3, R.drawable.progress_26_7, R.drawable.progress_30, R.drawable.progress_33_3, R.drawable.progress_36_7, R.drawable.progress_40, R.drawable.progress_43_3, R.drawable.progress_46_7, R.drawable.progress_50, R.drawable.progress_53_3, R.drawable.progress_56_7, R.drawable.progress_60, R.drawable.progress_63_3, R.drawable.progress_66_7, R.drawable.progress_70, R.drawable.progress_73_3, R.drawable.progress_76_7, R.drawable.progress_80, R.drawable.progress_83_3, R.drawable.progress_86_7, R.drawable.progress_90, R.drawable.progress_96};

    private NotificationUtil() {
    }

    public static String c(Context context, String str) {
        int i;
        if (context == null) {
            com.huawei.hwlogsmodel.LogUtil.j("Step_NotificationUtil", "context is null");
            return "";
        }
        if (str == null) {
            i = 0;
        } else {
            try {
                i = Integer.parseInt(str);
            } catch (Resources.NotFoundException e2) {
                com.huawei.hwlogsmodel.LogUtil.a("Step_NotificationUtil", "getStepsString() NotFoundException", e2.getMessage());
                return null;
            } catch (NumberFormatException e3) {
                com.huawei.hwlogsmodel.LogUtil.a("Step_NotificationUtil", "getStepsString() NumberFormatException", e3.getMessage());
                return null;
            }
        }
        return context.getResources().getString(R.string.IDS_plugindameon_hw_show_notification_steps, context.getResources().getQuantityText(R.plurals.IDS_plugindameon_hw_show_sport_timeline_steps_string, i).toString().replace(TimeModel.NUMBER_FORMAT, UnitUtilExt.e(context, i, 1, 0)));
    }

    public static String a(Context context, String str) {
        int i;
        if (context == null) {
            com.huawei.hwlogsmodel.LogUtil.e("Step_NotificationUtil", "context is null");
            return "";
        }
        if (str == null) {
            i = 0;
        } else {
            try {
                i = Integer.parseInt(str);
            } catch (Resources.NotFoundException e2) {
                com.huawei.hwlogsmodel.LogUtil.e("Step_NotificationUtil", "loadDayData() Exception", e2.getMessage());
                return "";
            } catch (NumberFormatException e3) {
                com.huawei.hwlogsmodel.LogUtil.a("Step_NotificationUtil", "getHeadString() NumberFormatException", e3.getMessage());
                return "";
            }
        }
        return context.getResources().getString(R.string.IDS_plugindameon_hw_show_notification_info, context.getResources().getString(R.string.IDS_plugindameon_hw_show_sport_kcal_string, UnitUtilExt.e(context, i, 1, 0)), "");
    }

    public static String c(Object obj, String str) {
        if (obj == null || str == null) {
            com.huawei.hwlogsmodel.LogUtil.e("Step_NotificationUtil", "object or pattern is null");
            return "";
        }
        try {
            return new DecimalFormat(str).format(obj);
        } catch (IllegalArgumentException e2) {
            com.huawei.hwlogsmodel.LogUtil.e("Step_NotificationUtil", "formatString()", e2.getMessage());
            return null;
        }
    }

    public static void a(Context context, int i) {
        com.huawei.hwlogsmodel.LogUtil.a("Step_NotificationUtil", "deleteHealthNotification() ");
        if (context == null) {
            com.huawei.hwlogsmodel.LogUtil.e("Step_NotificationUtil", "context is null");
            return;
        }
        try {
            Object systemService = context.getSystemService(RemoteMessageConst.NOTIFICATION);
            if (!(systemService instanceof NotificationManager)) {
                com.huawei.hwlogsmodel.LogUtil.a("Step_NotificationUtil", "deleteHealthNotification object is not instanceof NotificationManager");
            } else {
                ((NotificationManager) systemService).cancel(i);
            }
        } catch (IllegalStateException e2) {
            com.huawei.hwlogsmodel.LogUtil.e("Step_NotificationUtil", "deleteHealthNotification() Exception", e2.getMessage());
        }
    }

    public static PendingIntent d(Context context) {
        Intent intentA = null;
        if (context == null) {
            com.huawei.hwlogsmodel.LogUtil.e("Step_NotificationUtil", "context is null");
            return null;
        }
        try {
            intentA = a(context);
            return PendingIntent.getActivity(context, 0, intentA, 201326592);
        } catch (IllegalStateException e2) {
            com.huawei.hwlogsmodel.LogUtil.e("Step_NotificationUtil", "getPendingIntent() Exception", e2.getMessage());
            return PendingIntent.getActivity(context, 0, intentA, 201326592);
        }
    }

    public static Intent a(Context context) {
        if (context == null) {
            com.huawei.hwlogsmodel.LogUtil.e("Step_NotificationUtil", "context is null");
            return null;
        }
        Intent intent = new Intent();
        try {
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (launchIntentForPackage == null) {
                com.huawei.hwlogsmodel.LogUtil.j("Step_NotificationUtil", "getHealthAppIntent launchIntent is null");
                return intent;
            }
            intent.setComponent(new ComponentName(context.getPackageName(), launchIntentForPackage.getComponent().getClassName()));
            intent.setAction("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.LAUNCHER");
            intent.setFlags(268435456);
            return intent;
        } catch (IllegalStateException | NullPointerException e2) {
            com.huawei.hwlogsmodel.LogUtil.e("Step_NotificationUtil", "getHealthAPPIntent()", e2.getMessage());
            return intent;
        }
    }

    public static int d(int i) {
        if (i <= 1) {
            return R.drawable.progress_0;
        }
        int i2 = 0;
        while (true) {
            double[] dArr = e;
            if (i2 >= dArr.length) {
                return R.drawable.progress_100;
            }
            if (i < dArr[i2]) {
                return d[i2];
            }
            i2++;
        }
    }

    public static String d(Context context, int i) {
        if (context == null) {
            com.huawei.hwlogsmodel.LogUtil.e("Step_NotificationUtil", "context is null");
            return "";
        }
        return UnitUtilExt.e(context, i, 1, 0);
    }

    public static String c(Context context, int i) {
        if (context == null) {
            com.huawei.hwlogsmodel.LogUtil.e("Step_NotificationUtil", "context is null");
            return "";
        }
        return UnitUtilExt.e(context, i, 2, 0);
    }

    public static String b(Context context, int i) {
        if (context == null) {
            com.huawei.hwlogsmodel.LogUtil.e("Step_NotificationUtil", "context is null");
            return "";
        }
        return UnitUtilExt.e(context, Math.round(i / 1000.0f), 1, 0);
    }

    public static String e(Context context, int i) {
        if (context == null) {
            com.huawei.hwlogsmodel.LogUtil.e("Step_NotificationUtil", "context is null");
            return "";
        }
        return UnitUtilExt.e(context, i, 1, 0);
    }

    public static String b(Context context, float f) {
        if (context == null) {
            com.huawei.hwlogsmodel.LogUtil.e("Step_NotificationUtil", "context is null");
            return "";
        }
        return UnitUtilExt.e(context, f, 1, 2);
    }

    public static boolean c() {
        return EnvironmentInfo.e("ro.config.hw_tint", false) || Build.VERSION.SDK_INT > 28;
    }

    public static boolean i() {
        int i = Calendar.getInstance(Locale.getDefault()).get(11);
        return i >= 17 && i < 19;
    }

    public static boolean j() {
        int i = Calendar.getInstance(Locale.getDefault()).get(11);
        return i >= 17 && i < 18;
    }

    public static float e() {
        return BaseApplication.getContext().getResources().getConfiguration().fontScale;
    }

    public static boolean d() {
        return e() > 1.0f;
    }

    public static boolean a() {
        return e() > 1.45f;
    }

    public static boolean b() {
        return e() > 3.2f;
    }

    public static PendingIntent b(Context context) {
        if (context == null) {
            com.huawei.hwlogsmodel.LogUtil.j("Step_NotificationUtil", "getStartAppIntent() context is null");
            return null;
        }
        Intent intentA = a(context);
        intentA.putExtra("mLaunchSource", 12);
        return PendingIntent.getActivity(context, 0, intentA, 201326592);
    }
}
