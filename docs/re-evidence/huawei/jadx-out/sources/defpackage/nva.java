package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import java.io.File;
import java.util.Date;

/* JADX INFO: loaded from: classes11.dex */
public class nva {
    public static String e(Context context, String str) {
        String strE = SharedPreferenceManager.e(context, String.valueOf(1003), "update_key_scale_auto_check_time" + str);
        LogUtil.a("Scale_ScaleUpdateUtil", "getScaleAutoCheckTime,mAutoCheckTime ", strE);
        return strE;
    }

    public static void a(String str, Context context, String str2) {
        LogUtil.a("Scale_ScaleUpdateUtil", "setScaleAutoCheckTime,time ", str);
        StorageParams storageParams = new StorageParams();
        storageParams.e(0);
        SharedPreferenceManager.e(context, String.valueOf(1003), "update_key_scale_auto_check_time" + str2, str, storageParams);
    }

    public static boolean d(String str) {
        Date dateD;
        LogUtil.a("Scale_ScaleUpdateUtil", "isAlreadyUpdated isAlreadyUpdatedOfBand: strLastTime = ", str);
        if (TextUtils.isEmpty(str) || (dateD = nvd.d(str)) == null) {
            return false;
        }
        long time = dateD.getTime();
        LogUtil.a("Scale_ScaleUpdateUtil", "isAlreadyUpdated last = ", Long.valueOf(time));
        return Math.abs(System.currentTimeMillis() - time) <= 259200000;
    }

    public static void d(String str, Context context, String str2) {
        LogUtil.a("Scale_ScaleUpdateUtil", "setScaleCheckNewVersion,version ", str);
        StorageParams storageParams = new StorageParams();
        storageParams.e(0);
        SharedPreferenceManager.e(context, String.valueOf(1003), "update_key_scale_new_version" + str2, str, storageParams);
    }

    public static String c(Context context, String str) {
        String strE = SharedPreferenceManager.e(context, String.valueOf(1003), "update_key_scale_new_version" + str);
        LogUtil.a("Scale_ScaleUpdateUtil", "getScaleCheckNewVersion,mVersion ", strE);
        return strE;
    }

    public static void e(String str, Context context, String str2) {
        LogUtil.a("Scale_ScaleUpdateUtil", "setScaleLastVersionCode, lastVersionCode ", str);
        StorageParams storageParams = new StorageParams();
        storageParams.e(0);
        SharedPreferenceManager.e(context, String.valueOf(1003), "update_key_scale_last_version_code" + str2, str, storageParams);
    }

    public static String d(Context context, String str) {
        String strE = SharedPreferenceManager.e(context, String.valueOf(1003), "update_key_scale_store_path" + str);
        LogUtil.a("Scale_ScaleUpdateUtil", "getScaleStorePath,mStorePath ", strE);
        return strE;
    }

    public static void i(String str, Context context, String str2) {
        LogUtil.a("Scale_ScaleUpdateUtil", "setScaleStorePath, storePath ", str);
        StorageParams storageParams = new StorageParams();
        storageParams.e(0);
        SharedPreferenceManager.e(context, String.valueOf(1003), "update_key_scale_store_path" + str2, str, storageParams);
    }

    public static void c(String str, Context context, String str2) {
        LogUtil.a("Scale_ScaleUpdateUtil", "setScaleDeviceVersion,Version ", str);
        StorageParams storageParams = new StorageParams();
        storageParams.e(0);
        SharedPreferenceManager.e(context, String.valueOf(1003), "update_key_scale_device_version" + str2, str, storageParams);
    }

    public static void b(Context context, String str) {
        String strD = d(context, str);
        LogUtil.a("Scale_ScaleUpdateUtil", "deleteScaleUpdateDfu: path = ", strD);
        if (TextUtils.isEmpty(strD)) {
            return;
        }
        File file = new File(strD);
        if (!file.exists() || file.delete()) {
            return;
        }
        LogUtil.e("Scale_ScaleUpdateUtil", "deleteScaleUpdateDfu: path = ", strD, " failed!");
    }

    public static void c(Context context, boolean z, String str) {
        LogUtil.a("Scale_ScaleUpdateUtil", "setHaveNewScaleVersion,isHaveResult ", Boolean.valueOf(z));
        StorageParams storageParams = new StorageParams();
        storageParams.e(0);
        SharedPreferenceManager.e(context, String.valueOf(1003), "update_key_scale_new_version_tip" + str, "" + z, storageParams);
    }

    public static boolean g(Context context, String str) {
        String str2 = "is_new_honor" + nio.e(str);
        String strE = SharedPreferenceManager.e(context, String.valueOf(1003), str2);
        boolean z = Boolean.parseBoolean(strE);
        LogUtil.a("Scale_ScaleUpdateUtil", "isNewWeightHonor,isNewHonor ", strE, " newHonorKey ", str2);
        return z;
    }

    public static boolean f(Context context, String str) {
        String strA = a(context, str);
        LogUtil.a("Scale_ScaleUpdateUtil", "haveWeightDeviceNewVersion currentVersion: ", strA);
        if (TextUtils.isEmpty(strA)) {
            return false;
        }
        String strJ = j(context, str);
        LogUtil.a("Scale_ScaleUpdateUtil", "haveWeightDeviceNewVersion newVersion: ", strJ);
        if (TextUtils.isEmpty(strJ)) {
            return false;
        }
        return !strA.equals(strJ);
    }

    public static void b(String str, Context context, String str2) {
        LogUtil.a("Scale_ScaleUpdateUtil", "setDeviceCurrentVersion,version：", str);
        if (context == null) {
            LogUtil.j("Scale_ScaleUpdateUtil", "setDeviceCurrentVersion context is null");
            return;
        }
        StorageParams storageParams = new StorageParams();
        storageParams.e(0);
        SharedPreferenceManager.e(context, String.valueOf(1003), "update_key_scale_device_current_version" + str2, str, storageParams);
    }

    public static String a(Context context, String str) {
        if (context == null) {
            LogUtil.j("Scale_ScaleUpdateUtil", "getDeviceCurrentVersion context is null");
            return "";
        }
        String strE = SharedPreferenceManager.e(context, String.valueOf(1003), "update_key_scale_device_current_version" + str);
        LogUtil.a("Scale_ScaleUpdateUtil", "getDeviceCurrentVersion,version :", strE);
        return strE;
    }

    public static void g(String str, Context context, String str2) {
        LogUtil.a("Scale_ScaleUpdateUtil", "setWeightDeviceNewVersion,version：", str);
        if (context == null) {
            LogUtil.j("Scale_ScaleUpdateUtil", "setWeightDeviceNewVersion context is null");
            return;
        }
        StorageParams storageParams = new StorageParams();
        storageParams.e(0);
        SharedPreferenceManager.e(context, String.valueOf(1003), "update_key_scale_device_new_version" + str2, str, storageParams);
    }

    public static String j(Context context, String str) {
        if (context == null) {
            LogUtil.j("Scale_ScaleUpdateUtil", "getWeightDeviceNewVersion context is null");
            return "";
        }
        String strE = SharedPreferenceManager.e(context, String.valueOf(1003), "update_key_scale_device_new_version" + str);
        LogUtil.a("Scale_ScaleUpdateUtil", "getWeightDeviceNewVersion,version :", strE);
        return strE;
    }

    public static void e(Context context, String str, String str2) {
        LogUtil.a("Scale_ScaleUpdateUtil", "resetScaleUpdateInfo");
        c(context, false, str);
        a("", context, str);
        d("", context, str);
        c("", context, str);
        e("", context, str);
        g("", context, str2);
    }
}
