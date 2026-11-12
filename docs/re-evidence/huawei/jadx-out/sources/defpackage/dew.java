package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;

/* JADX INFO: loaded from: classes7.dex */
public class dew {
    public static boolean b(Context context) {
        boolean zD = d(context, Integer.toString(20002), "course_end_config_type", true);
        LogUtil.a("SportSettingStorageUtils", "acquireCourseEndConfig isKeepMoving: ", Boolean.valueOf(zD));
        return zD;
    }

    public static void c(Context context, boolean z) {
        LogUtil.a("SportSettingStorageUtils", "saveCourseEndConfig isKeepMoving: ", Boolean.valueOf(z));
        c(context, z, Integer.toString(20002), "course_end_config_type");
    }

    public static boolean c(Context context) {
        return d(context, Integer.toString(20002), "course_end_config_dialog_shown", false);
    }

    public static void a(Context context, boolean z) {
        c(context, z, Integer.toString(20002), "course_end_config_dialog_shown");
    }

    private static boolean d(Context context, String str, String str2, boolean z) {
        if (context == null) {
            LogUtil.e("SportSettingStorageUtils", "acquireBoolean context is null");
            return z;
        }
        String strE = SharedPreferenceManager.e(context, str, str2);
        if (!TextUtils.isEmpty(strE)) {
            try {
                return Boolean.parseBoolean(strE);
            } catch (NumberFormatException e) {
                LogUtil.e("SportSettingStorageUtils", "acquireBoolean NumberFormatException", LogAnonymous.b(e));
            }
        }
        return z;
    }

    private static void c(Context context, boolean z, String str, String str2) {
        if (context == null) {
            LogUtil.e("SportSettingStorageUtils", "saveBoolean context is null");
        } else {
            SharedPreferenceManager.e(context, str, str2, String.valueOf(z), new StorageParams());
        }
    }
}
