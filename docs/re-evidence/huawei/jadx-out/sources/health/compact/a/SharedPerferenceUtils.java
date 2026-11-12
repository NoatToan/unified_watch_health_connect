package health.compact.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.huawei.health.manager.util.TotalDetailStepsCacheBean;
import com.huawei.up.model.UserInfomation;
import defpackage.lsl;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public class SharedPerferenceUtils {
    private SharedPerferenceUtils() {
    }

    static {
        e();
    }

    private static void e() {
        String[] list;
        File file = new File("data/data/com.huawei.health/shared_prefs");
        if (file.exists() && file.isDirectory() && (list = file.list()) != null && list.length > 0) {
            LogUtil.c("Step_SPUtils", "data/data/com.huawei.health/shared_prefs", "file list: ", Arrays.toString(list));
            for (String str : list) {
                if ("daemonService_perference.xml".equals(str) || (str.contains("daemonService_perference") && !str.contains("_newFile") && !"daemonService_perference_common.xml".equals(str))) {
                    c(str);
                }
            }
        }
    }

    private static void c(String str) {
        File file = new File("data/data/com.huawei.health/shared_prefs/" + str);
        if (file.exists()) {
            StringBuilder sb = new StringBuilder(16);
            sb.append("data/data/com.huawei.health/shared_prefs/daemonService_perference_newFile.xml");
            LogUtil.b("Step_SPUtils", "rename shared file : ", Boolean.valueOf(file.renameTo(new File(sb.toString()))));
            return;
        }
        LogUtil.b("Step_SPUtils", "rename shared file false,file is not exists");
    }

    public static void c(Context context, String str) {
        if (context == null) {
            LogUtil.b("Step_SPUtils", "setVersion ", "context is null");
            return;
        }
        LogUtil.b("Step_SPUtils", "setVersion=", str);
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("daemonService_perference_newFile", 0).edit();
        if (editorEdit != null) {
            editorEdit.putString("plugin_daemon_version", str);
            editorEdit.commit();
        }
    }

    public static String aa(Context context) {
        if (context == null) {
            LogUtil.b("Step_SPUtils", "getVersion ", "context is null");
            return null;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("daemonService_perference_newFile", 0);
        String string = UserInfomation.BIRTHDAY_UNSETED;
        if (sharedPreferences != null) {
            string = sharedPreferences.getString("plugin_daemon_version", UserInfomation.BIRTHDAY_UNSETED);
        }
        LogUtil.b("Step_SPUtils", " getVersion= ", string);
        return string;
    }

    public static final String c() {
        try {
            return Base64.b(a().getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            LogUtil.e("Step_SPUtils", "getSerialNumberForMatBase64 error :", e.getMessage());
            return "";
        }
    }

    public static void b(Context context, int i) {
        SharedPreferences.Editor editorEdit;
        LogUtil.b("Step_SPUtils", "setDeviceClassType=", Integer.valueOf(i));
        if (context == null || (editorEdit = context.getSharedPreferences("daemonService_perference_newFile", 0).edit()) == null) {
            return;
        }
        editorEdit.putInt("device_class_type", i);
        editorEdit.commit();
        LogUtil.b("Step_SPUtils", "setDeviceClassType success");
    }

    public static int ad(Context context) {
        if (context == null) {
            LogUtil.b("Step_SPUtils", "getWriteDbLastDataMinute ", "context is null");
            return -1;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("daemonService_perference_newFile", 0);
        int i = sharedPreferences != null ? sharedPreferences.getInt("write_db_last_data_time", -1) : -1;
        LogUtil.b("Step_SPUtils", " getWriteDBLastDataMinute= ", Integer.valueOf(i));
        return i;
    }

    public static void a(Context context, int i) {
        SharedPreferences.Editor editorEdit;
        LogUtil.b("Step_SPUtils", "setWriteDbLastDataMinute=", Integer.valueOf(i));
        if (context == null || (editorEdit = context.getSharedPreferences("daemonService_perference_newFile", 0).edit()) == null) {
            return;
        }
        editorEdit.putInt("write_db_last_data_time", i);
        editorEdit.commit();
    }

    public static String r(Context context) {
        if (context == null) {
            LogUtil.b("Step_SPUtils", "getStepsNotificationShowStatus ", "context is null");
            return UserInfomation.BIRTHDAY_UNSETED;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("daemonService_perference_common", 0);
        if (sharedPreferences == null) {
            return UserInfomation.BIRTHDAY_UNSETED;
        }
        String string = sharedPreferences.getString("steps_notification_status", UserInfomation.BIRTHDAY_UNSETED);
        LogUtil.b("Step_SPUtils", " getStepsNotificationShowStatus= ", string);
        return string;
    }

    public static String h(Context context) {
        if (context == null) {
            LogUtil.b("Step_SPUtils", "getStepCounterStatus ", "context is null");
            return UserInfomation.BIRTHDAY_UNSETED;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("daemonService_perference_common", 0);
        if (sharedPreferences == null) {
            return UserInfomation.BIRTHDAY_UNSETED;
        }
        String string = sharedPreferences.getString("goal_notification_status", UserInfomation.BIRTHDAY_UNSETED);
        LogUtil.b("Step_SPUtils", " getGoalNotificationShowStatus= ", string);
        return string;
    }

    public static boolean p(Context context) {
        if (context == null) {
            LogUtil.b("Step_SPUtils", "getStepCounterStatus ", "context is null");
            return true;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("daemonService_perference_newFile", 0);
        if (sharedPreferences == null) {
            return true;
        }
        boolean z = sharedPreferences.getBoolean("stepCounter_status", true);
        LogUtil.b("Step_SPUtils", " getStepCounterStatus= ", Boolean.valueOf(z));
        return z;
    }

    public static void c(Context context, boolean z) {
        SharedPreferences.Editor editorEdit;
        LogUtil.b("Step_SPUtils", "setStepCounterStatus=", Boolean.valueOf(z));
        if (context == null || (editorEdit = context.getSharedPreferences("daemonService_perference_newFile", 0).edit()) == null) {
            return;
        }
        editorEdit.putBoolean("stepCounter_status", z);
        editorEdit.commit();
    }

    public static void e(Context context, boolean z) {
        LogUtil.b("Step_SPUtils", "setStepsNotificationShowStatus=", Boolean.valueOf(z));
        if (context != null) {
            SharedPreferences.Editor editorEdit = context.getSharedPreferences("daemonService_perference_common", 0).edit();
            String string = Boolean.toString(z);
            if (editorEdit != null) {
                editorEdit.putString("steps_notification_status", string);
                editorEdit.commit();
            }
        }
    }

    public static void d(Context context, boolean z) {
        LogUtil.b("Step_SPUtils", "setGoalNotificationShowStatus=", Boolean.valueOf(z));
        if (context != null) {
            SharedPreferences.Editor editorEdit = context.getSharedPreferences("daemonService_perference_common", 0).edit();
            String string = Boolean.toString(z);
            if (editorEdit != null) {
                editorEdit.putString("goal_notification_status", string);
                editorEdit.commit();
            }
        }
    }

    public static String[] y(Context context) {
        String string;
        if (context == null) {
            LogUtil.b("Step_SPUtils", "getTodayBasicStandardSteps ", "context is null");
            return null;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("daemonService_perference_newFile", 0);
        if (sharedPreferences != null) {
            string = sharedPreferences.getString("today_basic_standard_steps", null);
            LogUtil.b("Step_SPUtils", " getTodayBasicStandardSteps= ", string);
        } else {
            string = null;
        }
        if (TextUtils.isEmpty(string)) {
            return new String[]{"0", "0", "0"};
        }
        String[] strArrSplit = string.split("##");
        if (strArrSplit == null || strArrSplit.length < 3) {
            return null;
        }
        return strArrSplit;
    }

    public static void d(Context context, long j, int i, int i2) {
        long jR = lsl.r(j);
        LogUtil.b("Step_SPUtils", "setBasicStandardSteps basicStandardStep=", Integer.valueOf(i), " restartSteps=", Integer.valueOf(i2), "timeZero=", Long.valueOf(jR));
        if (context != null) {
            SharedPreferences.Editor editorEdit = context.getSharedPreferences("daemonService_perference_newFile", 0).edit();
            StringBuilder sb = new StringBuilder(16);
            sb.append(jR);
            sb.append("##");
            sb.append(i);
            sb.append("##");
            sb.append(i2);
            String string = sb.toString();
            if (editorEdit != null) {
                editorEdit.putString("today_basic_standard_steps", string);
                editorEdit.commit();
            }
        }
    }

    public static String[] x(Context context) {
        if (context == null) {
            LogUtil.b("Step_SPUtils", "getTodayTotalDetailSteps ", "context is null");
            return null;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("daemonService_perference_newFile", 0);
        String string = sharedPreferences != null ? sharedPreferences.getString("today_total_detail_steps", null) : null;
        if (TextUtils.isEmpty(string)) {
            return new String[]{"0", "0", "0", "0", "0", "0"};
        }
        String[] strArrSplit = string.split("##");
        if (strArrSplit == null || strArrSplit.length != 6) {
            return null;
        }
        return strArrSplit;
    }

    public static void b(Context context, TotalDetailStepsCacheBean totalDetailStepsCacheBean) {
        if (context == null) {
            LogUtil.b("Step_SPUtils", "setTodayTotalDetailSteps ", "context is null");
            return;
        }
        long jR = lsl.r(totalDetailStepsCacheBean.h());
        StringBuilder sb = new StringBuilder(16);
        sb.append(jR);
        sb.append("##");
        sb.append(totalDetailStepsCacheBean.f());
        sb.append("##");
        sb.append(totalDetailStepsCacheBean.j());
        sb.append("##");
        sb.append(totalDetailStepsCacheBean.c());
        sb.append("##");
        sb.append(totalDetailStepsCacheBean.e());
        sb.append("##");
        sb.append(totalDetailStepsCacheBean.b());
        String string = sb.toString();
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("daemonService_perference_newFile", 0).edit();
        if (editorEdit != null) {
            editorEdit.putString("today_total_detail_steps", string);
            editorEdit.commit();
        }
    }

    public static void d(Context context, TotalDetailStepsCacheBean totalDetailStepsCacheBean) {
        if (context == null) {
            LogUtil.e("Step_SPUtils", "getTodayTotalDetailSteps ", "context is null");
            return;
        }
        String json = new Gson().toJson(totalDetailStepsCacheBean);
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("daemonService_perference_newFile", 0).edit();
        if (editorEdit != null) {
            editorEdit.putString("today_total_detail_data", json);
            editorEdit.commit();
        }
    }

    public static TotalDetailStepsCacheBean u(Context context) {
        TotalDetailStepsCacheBean totalDetailStepsCacheBean;
        if (context == null) {
            LogUtil.e("Step_SPUtils", "getTodayTotalDetailSteps ", "context is null");
            return null;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("daemonService_perference_newFile", 0);
        if (sharedPreferences == null) {
            return null;
        }
        try {
            totalDetailStepsCacheBean = (TotalDetailStepsCacheBean) new Gson().fromJson(sharedPreferences.getString("today_total_detail_data", null), TotalDetailStepsCacheBean.class);
        } catch (JsonSyntaxException unused) {
            LogUtil.d("Step_SPUtils", "stepCardBean exception ");
            totalDetailStepsCacheBean = null;
        }
        if (totalDetailStepsCacheBean != null) {
            return totalDetailStepsCacheBean;
        }
        LogUtil.b("Step_SPUtils", "stepCardBean == null");
        return null;
    }

    public static int q(Context context) {
        if (context == null) {
            LogUtil.b("Step_SPUtils", "getStepsTarget ", "context is null");
            return 10000;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("daemonService_perference_newFile", 0);
        int i = sharedPreferences != null ? sharedPreferences.getInt("device_steps_target", 10000) : 10000;
        LogUtil.b("Step_SPUtils", "getStepsTarget ", Integer.valueOf(i));
        return i;
    }

    public static void d(Context context, int i) {
        if (context == null) {
            LogUtil.b("Step_SPUtils", "setStepsTarget ", "context is null");
            return;
        }
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("daemonService_perference_newFile", 0).edit();
        if (editorEdit != null) {
            editorEdit.putInt("device_steps_target", i);
            editorEdit.commit();
        }
    }

    public static String[] f(Context context) {
        if (context == null) {
            LogUtil.b("Step_SPUtils", "getDiffTotalSteps ", "context is null");
            return null;
        }
        StringBuilder sb = new StringBuilder(16);
        sb.append("0##0");
        String string = sb.toString();
        String string2 = sb.toString();
        SharedPreferences sharedPreferences = context.getSharedPreferences("daemonService_perference_newFile", 0);
        if (sharedPreferences != null) {
            string2 = sharedPreferences.getString("device_diff_steps", string2);
        }
        String[] strArrSplit = string2.split("##");
        return (strArrSplit == null || strArrSplit.length != 2) ? string.split("##") : strArrSplit;
    }

    public static void c(Context context, long j, int i) {
        if (context == null) {
            LogUtil.b("Step_SPUtils", "setDiffTotalSteps ", "context is null");
            return;
        }
        long jR = lsl.r(j);
        StringBuilder sb = new StringBuilder(16);
        sb.append(jR);
        sb.append("##");
        sb.append(i);
        String string = sb.toString();
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("daemonService_perference_newFile", 0).edit();
        if (editorEdit != null) {
            editorEdit.putString("device_diff_steps", string);
            editorEdit.commit();
        }
    }

    public static String[] j(Context context) {
        if (context == null) {
            LogUtil.b("Step_SPUtils", "getDiffTotalCalories ", "context is null");
            return null;
        }
        LogUtil.b("Step_SPUtils", "getDiffTotalCalories");
        StringBuilder sb = new StringBuilder(16);
        sb.append("0##0");
        String string = sb.toString();
        SharedPreferences sharedPreferences = context.getSharedPreferences("daemonService_perference_newFile", 0);
        if (sharedPreferences != null) {
            string = sharedPreferences.getString("device_diff_calories", string);
        }
        String[] strArrSplit = string.split("##");
        if (strArrSplit == null || strArrSplit.length != 2) {
            return null;
        }
        return strArrSplit;
    }

    public static void a(Context context, long j, double d) {
        if (context == null) {
            LogUtil.b("Step_SPUtils", "setDiffTotalCalories ", "context is null");
            return;
        }
        long jR = lsl.r(j);
        StringBuilder sb = new StringBuilder(16);
        sb.append(jR);
        sb.append("##");
        sb.append(d);
        String string = sb.toString();
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("daemonService_perference_newFile", 0).edit();
        if (editorEdit != null) {
            editorEdit.putString("device_diff_calories", string);
            editorEdit.commit();
        }
    }

    public static String[] i(Context context) {
        if (context == null) {
            LogUtil.b("Step_SPUtils", "getDiffTotalAltitude ", "context is null");
            return null;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("daemonService_perference_newFile", 0);
        String string = sharedPreferences != null ? sharedPreferences.getString("device_diff_altitude", null) : null;
        if (TextUtils.isEmpty(string)) {
            return new String[]{"0", "0"};
        }
        String[] strArrSplit = string.split("##");
        if (strArrSplit == null || strArrSplit.length != 2) {
            return null;
        }
        return strArrSplit;
    }

    public static void e(Context context, long j, double d) {
        if (context == null) {
            LogUtil.b("Step_SPUtils", "setDiffTotalAltitude ", "context is null");
            return;
        }
        long jR = lsl.r(j);
        StringBuilder sb = new StringBuilder(16);
        sb.append(jR);
        sb.append("##");
        sb.append(d);
        String string = sb.toString();
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("daemonService_perference_newFile", 0).edit();
        if (editorEdit != null) {
            editorEdit.putString("device_diff_altitude", string);
            editorEdit.commit();
        }
    }

    public static void d(Context context, long j, double d) {
        if (context == null) {
            LogUtil.b("Step_SPUtils", "setDiffTotalDistance ", "context is null");
            return;
        }
        long jR = lsl.r(j);
        StringBuilder sb = new StringBuilder(16);
        sb.append(jR);
        sb.append("##");
        sb.append(d);
        String string = sb.toString();
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("daemonService_perference_newFile", 0).edit();
        if (editorEdit != null) {
            editorEdit.putString("device_diff_distance", string);
            editorEdit.commit();
        }
    }

    public static void a(Context context, long j) {
        if (context == null) {
            LogUtil.b("Step_SPUtils", "setDeviceShutdownUtcValue ", "context is null");
            return;
        }
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("daemonService_perference_newFile", 0).edit();
        if (editorEdit != null) {
            editorEdit.putLong("device_shut_dowm_time_utc_", j);
            editorEdit.commit();
        }
    }

    public static long b(Context context) {
        if (context == null) {
            LogUtil.b("Step_SPUtils", "getDeviceShutdownTimeUtc ", "context is null");
            return 0L;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("daemonService_perference_newFile", 0);
        LogUtil.b("Step_SPUtils", "getDeviceShutdownTime shutdownTimeUTC=", Long.valueOf(sharedPreferences.getLong("device_shut_dowm_time_utc_", 0L)));
        return sharedPreferences.getLong("device_shut_dowm_time_utc_", 0L);
    }

    public static String[] d(Context context) {
        String[] strArrSplit;
        LogUtil.b("Step_SPUtils", "getArDebugConfig ");
        if (context == null || (strArrSplit = context.getSharedPreferences("dameonservice_debug", 0).getString("ar_config", "").split("##")) == null || strArrSplit.length != 3) {
            return null;
        }
        return strArrSplit;
    }

    public static void a(Context context, boolean z, int i, int i2) {
        LogUtil.b("Step_SPUtils", "setArDebugConfig ", Boolean.valueOf(z), " ", Integer.valueOf(i), " ", Integer.valueOf(i2));
        if (context != null) {
            StringBuilder sb = new StringBuilder(16);
            sb.append(String.valueOf(z));
            sb.append("##");
            sb.append(String.valueOf(i));
            sb.append("##");
            sb.append(String.valueOf(i2));
            SharedPreferences.Editor editorEdit = context.getSharedPreferences("dameonservice_debug", 0).edit();
            editorEdit.putString("ar_config", sb.toString());
            editorEdit.commit();
        }
    }

    public static String s(Context context) {
        if (context == null) {
            LogUtil.b("Step_SPUtils", "getServiceRestartRecord ", "context is null");
            return null;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("daemonService_perference_newFile", 0);
        if (sharedPreferences == null) {
            return null;
        }
        String string = sharedPreferences.getString("service_restart_record", null);
        if (!TextUtils.isEmpty(string) && string.length() > 13) {
            string = string.substring(string.length() - 13);
        }
        LogUtil.b("Step_SPUtils", " getServiceRestartRecord= ", string);
        return string;
    }

    public static void e(Context context, String str) {
        SharedPreferences.Editor editorEdit;
        LogUtil.b("Step_SPUtils", "setServiceRestartRecord=", str);
        if (context == null || (editorEdit = context.getSharedPreferences("daemonService_perference_newFile", 0).edit()) == null) {
            return;
        }
        editorEdit.putString("service_restart_record", str);
        editorEdit.commit();
    }

    public static long o(Context context) {
        if (context == null) {
            LogUtil.b("Step_SPUtils", "getLastSyncDbTime ", "context is null");
            return -1L;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("daemonService_perference_newFile", 0);
        if (sharedPreferences == null) {
            return -1L;
        }
        long j = sharedPreferences.getLong("last_sync_db_time", -1L);
        LogUtil.b("Step_SPUtils", " getLastSyncDbTime= ", Long.valueOf(j));
        return j;
    }

    public static void b(Context context, long j) {
        SharedPreferences.Editor editorEdit;
        LogUtil.b("Step_SPUtils", "setLastSyncDbTime=", Long.valueOf(j));
        if (context == null || (editorEdit = context.getSharedPreferences("daemonService_perference_newFile", 0).edit()) == null) {
            return;
        }
        editorEdit.putLong("last_sync_db_time", j);
        editorEdit.commit();
    }

    public static String[] g(Context context) {
        if (context == null) {
            LogUtil.b("Step_SPUtils", "getGoalNotificationShownRecord ", "context is null");
            return null;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("daemonService_perference_newFile", 0);
        String string = "";
        if (sharedPreferences != null) {
            string = sharedPreferences.getString("goal_notifi_shown_record", "");
            LogUtil.b("Step_SPUtils", " getGoalNotificationShownRecord= ", string);
        }
        String[] strArrSplit = string.split("##");
        if (strArrSplit == null || strArrSplit.length != 2) {
            return null;
        }
        try {
            Long.parseLong(strArrSplit[0]);
            return strArrSplit;
        } catch (NumberFormatException unused) {
            strArrSplit[0] = String.valueOf(System.currentTimeMillis());
            try {
                a(context, System.currentTimeMillis(), Boolean.parseBoolean(strArrSplit[1]));
            } catch (NumberFormatException e) {
                LogUtil.b("Step_SPUtils", "NumberFormatException ", e.getMessage());
            }
            return strArrSplit;
        }
    }

    public static void a(Context context, long j, boolean z) {
        long jR = lsl.r(j);
        LogUtil.b("Step_SPUtils", "setGoalNotificationShownRecord ", Long.valueOf(j), " ", Boolean.valueOf(z), " timeZero=", Long.valueOf(jR));
        if (context != null) {
            StringBuilder sb = new StringBuilder(16);
            sb.append(String.valueOf(jR));
            sb.append("##");
            sb.append(String.valueOf(z));
            SharedPreferences.Editor editorEdit = context.getSharedPreferences("daemonService_perference_newFile", 0).edit();
            if (editorEdit != null) {
                editorEdit.putString("goal_notifi_shown_record", sb.toString());
                editorEdit.commit();
            }
        }
    }

    public static void b(Context context, String str, float f, float f2, int i, int i2, int i3) {
        if (context != null) {
            StringBuilder sb = new StringBuilder(16);
            sb.append(str);
            sb.append("##");
            sb.append(f);
            sb.append("##");
            sb.append(f2);
            sb.append("##");
            sb.append(i);
            sb.append("##");
            sb.append(i2);
            sb.append("##");
            sb.append(i3);
            String string = sb.toString();
            SharedPreferences.Editor editorEdit = context.getSharedPreferences("daemonService_perference_newFile", 0).edit();
            if (editorEdit != null) {
                editorEdit.putString("user_info_all", string);
                editorEdit.commit();
            }
        }
    }

    public static String[] w(Context context) {
        if (context == null) {
            LogUtil.b("Step_SPUtils", "getUserInfoAllFromPreference ", "context is null");
            return null;
        }
        StringBuilder sb = new StringBuilder(16);
        sb.append("0##0##0##0##0##0");
        String string = sb.toString();
        SharedPreferences sharedPreferences = context.getSharedPreferences("daemonService_perference_newFile", 0);
        if (sharedPreferences != null) {
            string = sharedPreferences.getString("user_info_all", string);
        }
        String[] strArrSplit = string.split("##");
        if (strArrSplit == null || strArrSplit.length != 6) {
            return null;
        }
        return strArrSplit;
    }

    public static void c(Context context) {
        SharedPreferences.Editor editorEdit;
        if (context == null || (editorEdit = context.getSharedPreferences("daemonService_perference_newFile", 0).edit()) == null) {
            return;
        }
        editorEdit.putBoolean("THE_MAIN_UI_START_DAEMON_SERVICE", true);
        editorEdit.commit();
        LogUtil.b("Step_SPUtils", "setFirstStartDaemonFromUi success: ", true);
    }

    public static boolean af(Context context) {
        if (context == null) {
            LogUtil.b("Step_SPUtils", "isFirstStartDaemonFromUi ", "context is null");
            return false;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("daemonService_perference_newFile", 0);
        if (sharedPreferences == null) {
            return false;
        }
        boolean z = sharedPreferences.getBoolean("THE_MAIN_UI_START_DAEMON_SERVICE", false);
        LogUtil.b("Step_SPUtils", "isFirstStartDaemonFromUi: ", Boolean.valueOf(z));
        return z;
    }

    public static void e(Context context, int i) {
        SharedPreferences.Editor editorEdit;
        if (context == null || (editorEdit = context.getSharedPreferences("daemonService_perference_newFile", 0).edit()) == null) {
            return;
        }
        editorEdit.putInt("THE_FIRST_INIT_HEALTH_TIME", i);
        editorEdit.commit();
        LogUtil.b("Step_SPUtils", "setTheFirstInitHealthTime success: ", Integer.valueOf(i));
    }

    public static int t(Context context) {
        if (context == null) {
            LogUtil.b("Step_SPUtils", "getTheFirstInitHealthTime ", "context is null");
            return 0;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("daemonService_perference_newFile", 0);
        if (sharedPreferences == null) {
            return 0;
        }
        int i = sharedPreferences.getInt("THE_FIRST_INIT_HEALTH_TIME", 0);
        LogUtil.c("Step_SPUtils", "getTheFirs'tInitHealthTime: ", Integer.valueOf(i));
        return i;
    }

    public static void b(Context context, long j, long j2) {
        if (context != null) {
            StringBuilder sb = new StringBuilder(16);
            sb.append(j);
            sb.append("##");
            sb.append(j2);
            String string = sb.toString();
            SharedPreferences sharedPreferences = context.getSharedPreferences("daemonService_perference_newFile", 0);
            if (sharedPreferences == null) {
                LogUtil.e("Step_SPUtils", "setAliveRecord failed,sharedPreference null");
                return;
            }
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            if (editorEdit == null) {
                LogUtil.e("Step_SPUtils", "setAliveRecord failed,editor null");
                return;
            }
            editorEdit.putString("alive_record", string);
            editorEdit.commit();
            LogUtil.b("Step_SPUtils", "setAliveRecord success: ", "timestampArg=", Long.valueOf(j), " elapsedRealtimeArg=", Long.valueOf(j2));
        }
    }

    public static String[] e(Context context) {
        String string;
        if (context != null) {
            StringBuilder sb = new StringBuilder(16);
            sb.append("0##0");
            SharedPreferences sharedPreferences = context.getSharedPreferences("daemonService_perference_newFile", 0);
            if (sharedPreferences == null) {
                LogUtil.e("Step_SPUtils", "getAliveRecord failed,sharedPreference null,return null");
                return null;
            }
            try {
                string = sharedPreferences.getString("alive_record", sb.toString());
            } catch (ClassCastException e) {
                LogUtil.d("Step_SPUtils", "getAliveRecord ClassCastException ", e.getMessage());
                string = sb.toString();
            }
            LogUtil.b("Step_SPUtils", "getAliveRecord: ", string);
            String[] strArrSplit = string.split("##");
            if (strArrSplit != null && strArrSplit.length == 2) {
                return strArrSplit;
            }
        }
        return null;
    }

    public static void a(Context context) {
        if (context != null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("daemonService_perference_newFile", 0);
            if (sharedPreferences == null) {
                LogUtil.e("Step_SPUtils", "deleteAliveRecord failed,can not get sharedPreference obj,warning!!!");
                return;
            }
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            if (editorEdit == null) {
                LogUtil.e("Step_SPUtils", "deleteAliveRecord failed,editor null,warning!!!");
                return;
            }
            editorEdit.remove("alive_record");
            editorEdit.commit();
            LogUtil.b("Step_SPUtils", "deleteAliveRecord success");
        }
    }

    public static void b(Context context, boolean z) {
        SharedPreferences.Editor editorEdit;
        LogUtil.c("Step_SPUtils", "setStepCounterAbility =", Boolean.valueOf(z));
        if (context == null || (editorEdit = context.getSharedPreferences("daemonService_perference_newFile", 0).edit()) == null) {
            return;
        }
        editorEdit.putBoolean("step_counter_ability", z);
        editorEdit.commit();
    }

    public static boolean ai(Context context) {
        SharedPreferences sharedPreferences;
        if (context == null) {
            return false;
        }
        try {
            sharedPreferences = context.getSharedPreferences("daemonService_perference_newFile", 0);
        } catch (IncompatibleClassChangeError unused) {
            LogUtil.d("Step_SPUtils", "isStandardStepCounter IncompatibleClassChangeError exception");
            sharedPreferences = null;
        }
        if (sharedPreferences == null) {
            return false;
        }
        boolean z = sharedPreferences.getBoolean("step_counter_ability", false);
        LogUtil.c("Step_SPUtils", " isStandardStepCounter= ", Boolean.valueOf(z));
        return z;
    }

    public static void a(Context context, boolean z, long j) {
        SharedPreferences.Editor editorEdit;
        LogUtil.b("Step_SPUtils", "setWearDeviceCapability isAbilityOne=", Boolean.valueOf(z), " firstTimeMillis = ", Long.valueOf(j));
        StringBuilder sb = new StringBuilder(16);
        sb.append(j);
        sb.append("##");
        sb.append(z);
        String string = sb.toString();
        if (context == null || (editorEdit = context.getSharedPreferences("daemonService_perference_newFile", 0).edit()) == null) {
            return;
        }
        editorEdit.putString("WEAR_DEVICE_ABILITY", string);
        editorEdit.commit();
    }

    public static String[] ac(Context context) {
        LogUtil.b("Step_SPUtils", "getWearDeviceCapability");
        StringBuilder sb = new StringBuilder(16);
        sb.append("0##false");
        String string = sb.toString();
        if (context == null) {
            return null;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("daemonService_perference_newFile", 0);
        if (sharedPreferences != null) {
            string = sharedPreferences.getString("WEAR_DEVICE_ABILITY", string);
        }
        String[] strArrSplit = string.split("##");
        if (strArrSplit == null || strArrSplit.length != 2) {
            return null;
        }
        return strArrSplit;
    }

    public static String ab(Context context) {
        String string = null;
        if (context == null) {
            LogUtil.e("Step_SPUtils", "getVoiceUuid context is null");
            return null;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("daemonService_perference_newFile", 0);
        if (sharedPreferences != null) {
            string = sharedPreferences.getString("voice_kit_uuid", null);
            LogUtil.b("Step_SPUtils", "getVoiceUuid: ", string);
        }
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        String string2 = UUID.randomUUID().toString();
        b(context, string2);
        return string2;
    }

    private static void b(Context context, String str) {
        SharedPreferences.Editor editorEdit;
        LogUtil.b("Step_SPUtils", "setVoiceUuid enter");
        if (context == null || (editorEdit = context.getSharedPreferences("daemonService_perference_newFile", 0).edit()) == null) {
            return;
        }
        editorEdit.putString("voice_kit_uuid", str);
        editorEdit.commit();
    }

    public static String a() {
        return "unknown";
    }

    public static boolean n(Context context) {
        if (context == null) {
            LogUtil.b("Step_SPUtils", "getIsBrowseMode ", "context is null");
            return false;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("daemonService_perference_newFile", 0);
        if (sharedPreferences == null) {
            return false;
        }
        boolean z = sharedPreferences.getBoolean("daemonService_isBrowseMode", false);
        LogUtil.b("Step_SPUtils", "getIsBrowseMode: ", Boolean.valueOf(z));
        return z;
    }

    public static void a(Context context, boolean z) {
        SharedPreferences.Editor editorEdit;
        if (context == null || (editorEdit = context.getSharedPreferences("daemonService_perference_newFile", 0).edit()) == null) {
            return;
        }
        editorEdit.putBoolean("daemonService_isBrowseMode", z);
        editorEdit.commit();
    }

    public static long k(Context context) {
        if (context == null) {
            LogUtil.b("Step_SPUtils", "getLastQueryDbTime ", "context is null");
            return -1L;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("daemonService_perference_newFile", 0);
        if (sharedPreferences == null) {
            return -1L;
        }
        long j = sharedPreferences.getLong("last_query_db_time", -1L);
        ReleaseLogUtil.c("Step_SPUtils", " getLastQueryDbTime= ", Long.valueOf(j));
        return j;
    }

    public static void e(Context context, long j) {
        SharedPreferences.Editor editorEdit;
        ReleaseLogUtil.c("Step_SPUtils", "setLastQueryDbTime=", Long.valueOf(j));
        if (context == null || (editorEdit = context.getSharedPreferences("daemonService_perference_newFile", 0).edit()) == null) {
            return;
        }
        editorEdit.putLong("last_query_db_time", j);
        editorEdit.commit();
    }

    public static void ae(Context context) {
        if (context != null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("daemonService_perference_newFile", 0);
            int i = sharedPreferences.getInt("NOT_REPORT_TIME", 0);
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            if (editorEdit != null) {
                editorEdit.putInt("NOT_REPORT_TIME", i + 1);
                editorEdit.commit();
                LogUtil.b("Step_SPUtils", "setNotReportTime success: ", Integer.valueOf(i));
            }
        }
    }

    public static int m(Context context) {
        if (context == null) {
            LogUtil.e("Step_SPUtils", "getNotReportNum context == null");
            return 0;
        }
        return context.getSharedPreferences("daemonService_perference_newFile", 0).getInt("NOT_REPORT_TIME", 0);
    }

    public static void ag(Context context) {
        if (context != null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("daemonService_perference_newFile", 0);
            int i = sharedPreferences.getInt("SAME_REPORT_TIME", 0);
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            if (editorEdit != null) {
                editorEdit.putInt("SAME_REPORT_TIME", i + 1);
                editorEdit.commit();
                LogUtil.b("Step_SPUtils", "setSameReportNum success: ", Integer.valueOf(i));
            }
        }
    }

    public static int l(Context context) {
        if (context == null) {
            LogUtil.e("Step_SPUtils", "getNotReportNum context == null");
            return 0;
        }
        return context.getSharedPreferences("daemonService_perference_newFile", 0).getInt("SAME_REPORT_TIME", 0);
    }

    public static void j(Context context, int i) {
        SharedPreferences.Editor editorEdit;
        if (context == null || (editorEdit = context.getSharedPreferences("daemonService_perference_newFile", 0).edit()) == null) {
            return;
        }
        editorEdit.putInt("YESTERDAY_SUMMARY_REMIND_DAY", i);
        editorEdit.commit();
        LogUtil.b("Step_SPUtils", "setYesterdaySummaryRemindDay success: ", Integer.valueOf(i));
    }

    public static int z(Context context) {
        if (context == null) {
            LogUtil.e("Step_SPUtils", "getYesterdaySummaryRemindDay context == null");
            return 0;
        }
        return context.getSharedPreferences("daemonService_perference_newFile", 0).getInt("YESTERDAY_SUMMARY_REMIND_DAY", 0);
    }

    public static int v(Context context) {
        if (context == null) {
            LogUtil.e("Step_SPUtils", "getTodaySummaryRemindDay context == null");
            return 0;
        }
        return context.getSharedPreferences("daemonService_perference_newFile", 0).getInt("TODAY_SUMMARY_REMIND_DAY", 0);
    }

    public static void c(Context context, int i) {
        SharedPreferences.Editor editorEdit;
        if (context == null || (editorEdit = context.getSharedPreferences("daemonService_perference_newFile", 0).edit()) == null) {
            return;
        }
        editorEdit.putInt("TODAY_SUMMARY_REMIND_DAY", i);
        editorEdit.commit();
        LogUtil.b("Step_SPUtils", "setTodaySummaryRemindDay success: ", Integer.valueOf(i));
    }
}
