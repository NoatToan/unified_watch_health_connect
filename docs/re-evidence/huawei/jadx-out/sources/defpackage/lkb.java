package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.huawei.openalliance.ad.constant.SpKeys;
import health.compact.a.HuaweiHealth;
import health.compact.a.util.LogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class lkb {
    private static SharedPreferences w(Context context) {
        return context.getSharedPreferences("huawei_hihealth", 0);
    }

    public static boolean e(Context context) {
        if (context == null) {
            LogUtil.d("HiH_HiSharedPreferencesUtil", "getAggregateDeviceSteps context = null");
            return false;
        }
        return w(context).getBoolean("first_aggregate_device_steps", true);
    }

    public static void r(Context context) {
        if (context == null) {
            LogUtil.d("HiH_HiSharedPreferencesUtil", "saveAggregateDeviceSteps context = null");
        } else {
            w(context).edit().putBoolean("first_aggregate_device_steps", false).apply();
        }
    }

    public static void p(Context context, int i) {
        if (context == null) {
            LogUtil.d("HiH_HiSharedPreferencesUtil", "saveNoNeedStatOldData context = null");
            return;
        }
        w(context).edit().putBoolean(i + "need_stat_old_db_data", false).apply();
    }

    public static boolean e(Context context, int i) {
        if (context == null) {
            LogUtil.d("HiH_HiSharedPreferencesUtil", "getNeedStatOldData context = null");
            return false;
        }
        return w(context).getBoolean(i + "need_stat_old_db_data", true);
    }

    public static void c(Context context, int i, int i2) {
        if (context == null) {
            LogUtil.d("HiH_HiSharedPreferencesUtil", "saveStatOldDataVersion context = null");
            return;
        }
        w(context).edit().putInt(i + "stat_old_data_current_version", i2).apply();
    }

    public static int d(Context context, int i) {
        if (context == null) {
            return -1;
        }
        return w(context).getInt(i + "stat_old_data_current_version", 1);
    }

    public static void x(Context context) {
        if (context == null) {
            LogUtil.d("HiH_HiSharedPreferencesUtil", "saveFirstLogin context = null");
        } else {
            w(context).edit().putBoolean("hi_first_login", false).apply();
        }
    }

    public static boolean s(Context context) {
        if (context == null) {
            LogUtil.d("HiH_HiSharedPreferencesUtil", "getFirstLogin context = null");
            return false;
        }
        return w(context).getBoolean("hi_first_login", true);
    }

    public static void c(Context context, String str, int i) {
        if (context == null) {
            LogUtil.d("HiH_HiSharedPreferencesUtil", "saveStepSumDiffValueACC context = null");
            return;
        }
        w(context).edit().putInt(str + "step_sum_diff_value_acc", i).apply();
    }

    public static int a(Context context, String str) {
        if (context == null) {
            return 0;
        }
        return w(context).getInt(str + "step_sum_diff_value_acc", 0);
    }

    public static int m(Context context) {
        if (context == null) {
            return 20080808;
        }
        return w(context).getInt("date", 20080808);
    }

    public static int l(Context context) {
        if (context == null) {
            return 0;
        }
        return w(context).getInt("totalSync", 0);
    }

    public static int t(Context context) {
        if (context == null) {
            return 0;
        }
        return w(context).getInt("UISync", 0);
    }

    public static int p(Context context) {
        if (context == null) {
            return 0;
        }
        return w(context).getInt("userinfoSync", 0);
    }

    public static int k(Context context) {
        if (context == null) {
            return 0;
        }
        return w(context).getInt("insertSyncDetail", 0);
    }

    public static int n(Context context) {
        if (context == null) {
            return 0;
        }
        return w(context).getInt("insertSyncStat", 0);
    }

    public static int o(Context context) {
        if (context == null) {
            return 0;
        }
        return w(context).getInt("syncFail", 0);
    }

    public static int q(Context context) {
        if (context == null) {
            return 0;
        }
        return w(context).getInt("wearSync", 0);
    }

    public static void l(Context context, int i) {
        if (context == null) {
            LogUtil.d("HiH_HiSharedPreferencesUtil", "saveBiYesterdayDate context = null");
        } else {
            w(context).edit().putInt("date", i).apply();
        }
    }

    public static void n(Context context, int i) {
        if (context == null) {
            LogUtil.d("HiH_HiSharedPreferencesUtil", "saveBiYesterdayTotalSync context = null");
        } else {
            w(context).edit().putInt("totalSync", i).apply();
        }
    }

    public static void t(Context context, int i) {
        if (context == null) {
            LogUtil.d("HiH_HiSharedPreferencesUtil", "saveBiYesterdayUiSync context = null");
        } else {
            w(context).edit().putInt("UISync", i).apply();
        }
    }

    public static void r(Context context, int i) {
        if (context == null) {
            LogUtil.d("HiH_HiSharedPreferencesUtil", "saveBiYesterdayUserInfoSync context = null");
        } else {
            w(context).edit().putInt("userinfoSync", i).apply();
        }
    }

    public static void k(Context context, int i) {
        if (context == null) {
            LogUtil.d("HiH_HiSharedPreferencesUtil", "saveBiYesterdayUserInfoSync context = null");
        } else {
            w(context).edit().putInt("insertSyncDetail", i).apply();
        }
    }

    public static void m(Context context, int i) {
        if (context == null) {
            LogUtil.d("HiH_HiSharedPreferencesUtil", "saveBiYesterdayUserInfoSync context = null");
        } else {
            w(context).edit().putInt("insertSyncStat", i).apply();
        }
    }

    public static void o(Context context, int i) {
        if (context == null) {
            LogUtil.d("HiH_HiSharedPreferencesUtil", "saveBiYesterdayUserInfoSync context = null");
        } else {
            w(context).edit().putInt("syncFail", i).apply();
        }
    }

    public static void s(Context context, int i) {
        if (context == null) {
            LogUtil.d("HiH_HiSharedPreferencesUtil", "saveBiYesterdayUserInfoSync context = null");
        } else {
            w(context).edit().putInt("wearSync", i).apply();
        }
    }

    public static int b(Context context) {
        if (context == null) {
            return 20080808;
        }
        return w(context).getInt(SpKeys.TODAY_DATE, 20080808);
    }

    public static int h(Context context) {
        if (context == null) {
            return 0;
        }
        return w(context).getInt("today_totalSync", 0);
    }

    public static int j(Context context) {
        if (context == null) {
            return 0;
        }
        return w(context).getInt("today_UISync", 0);
    }

    public static int i(Context context) {
        if (context == null) {
            return 0;
        }
        return w(context).getInt("today_userinfoSync", 0);
    }

    public static int a(Context context) {
        if (context == null) {
            return 0;
        }
        return w(context).getInt("today_insertSyncDetail", 0);
    }

    public static int c(Context context) {
        if (context == null) {
            return 0;
        }
        return w(context).getInt("today_insertSyncStat", 0);
    }

    public static int g(Context context) {
        if (context == null) {
            return 0;
        }
        return w(context).getInt("today_syncFail", 0);
    }

    public static int f(Context context) {
        if (context == null) {
            return 0;
        }
        return w(context).getInt("today_wearSync", 0);
    }

    public static void a(Context context, int i) {
        if (context == null) {
            return;
        }
        w(context).edit().putInt(SpKeys.TODAY_DATE, i).apply();
    }

    public static void j(Context context, int i) {
        if (context == null) {
            return;
        }
        w(context).edit().putInt("today_totalSync", i).apply();
    }

    public static void i(Context context, int i) {
        if (context == null) {
            return;
        }
        w(context).edit().putInt("today_UISync", i).apply();
    }

    public static void h(Context context, int i) {
        if (context == null) {
            return;
        }
        w(context).edit().putInt("today_userinfoSync", i).apply();
    }

    public static void b(Context context, int i) {
        if (context == null) {
            return;
        }
        w(context).edit().putInt("today_insertSyncDetail", i).apply();
    }

    public static void c(Context context, int i) {
        if (context == null) {
            return;
        }
        w(context).edit().putInt("today_insertSyncStat", i).apply();
    }

    public static void f(Context context, int i) {
        if (context == null) {
            return;
        }
        w(context).edit().putInt("today_syncFail", i).apply();
    }

    public static void g(Context context, int i) {
        if (context == null) {
            return;
        }
        w(context).edit().putInt("today_wearSync", i).apply();
    }

    public static String d(Context context) {
        if (context == null) {
            return HuaweiHealth.c();
        }
        return w(context).getString("bi_oldHuid", HuaweiHealth.c());
    }

    public static void e(Context context, String str) {
        if (context == null) {
            return;
        }
        w(context).edit().putString("bi_oldHuid", str).apply();
    }

    public static boolean b(Context context, String str, int i, boolean z) {
        if (context == null) {
            return z;
        }
        return w(context).getBoolean(i + str, z);
    }

    public static void c(Context context, String str, boolean z, int i) {
        if (context == null) {
            return;
        }
        w(context).edit().putBoolean(i + str, z).apply();
    }

    public static int c(Context context, String str, int i, int i2) {
        if (context == null) {
            return i2;
        }
        return w(context).getInt(i + str, i2);
    }

    public static long a(Context context, String str, int i, long j) {
        if (context == null) {
            return j;
        }
        return w(context).getLong(i + str, j);
    }

    public static void c(Context context, String str, long j, int i) {
        if (context == null) {
            return;
        }
        w(context).edit().putLong(i + str, j).apply();
    }

    public static void b(Context context, String str, int i, int i2) {
        if (context == null) {
            return;
        }
        w(context).edit().putInt(i2 + str, i).apply();
    }

    public static void c(Context context, int i, long j, int i2) {
        if (context == null) {
            return;
        }
        w(context).edit().putLong("version_" + i2 + "_" + i, j).apply();
    }

    public static long a(Context context, int i, int i2, long j) {
        if (context == null) {
            return j;
        }
        return w(context).getLong("version_" + i2 + "_" + i, j);
    }
}
