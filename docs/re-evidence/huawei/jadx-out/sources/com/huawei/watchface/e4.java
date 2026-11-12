package com.huawei.watchface;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.huawei.watchface.api.HwWatchFaceApi;
import com.huawei.watchface.environment.Environment;
import com.huawei.watchface.utils.ArrayUtils;
import com.huawei.watchface.utils.BackgroundTaskUtils;
import com.huawei.watchface.utils.FileHelper;
import com.huawei.watchface.utils.HwLog;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes20.dex */
public abstract class e4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Map f30131a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Comparator f30132b = new a();

    public class a implements Comparator {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Map.Entry entry, Map.Entry entry2) {
            return ((Long) entry2.getValue()).compareTo((Long) entry.getValue());
        }
    }

    public static void a(String str, Set set, String str2) {
        SharedPreferences sharedPreferencesB = b(Environment.getApplicationContext(), str2);
        if (sharedPreferencesB == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = sharedPreferencesB.edit();
        editorEdit.putStringSet(str, set);
        editorEdit.apply();
    }

    public static void b(String str, String str2, String str3) {
        SharedPreferences sharedPreferencesB = (SharedPreferences) f30131a.get(str3);
        if (sharedPreferencesB == null) {
            sharedPreferencesB = b(Environment.getApplicationContext(), str3);
            if (sharedPreferencesB == null) {
                HwLog.i("SharepreferenceUtils", str3 + "sp is null");
                return;
            }
            f30131a.put(str3, sharedPreferencesB);
        }
        SharedPreferences.Editor editorEdit = sharedPreferencesB.edit();
        editorEdit.putString(str, str2);
        editorEdit.apply();
    }

    public static String c(String str, String str2) {
        SharedPreferences sharedPreferencesB = b(Environment.getApplicationContext(), str2);
        if (sharedPreferencesB == null) {
            return null;
        }
        return sharedPreferencesB.getString(str, null);
    }

    public static boolean d(String str) {
        return a(str, "themename");
    }

    public static void e(String str, String str2) {
        SharedPreferences sharedPreferencesB = b(Environment.getApplicationContext(), str2);
        if (sharedPreferencesB == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = sharedPreferencesB.edit();
        editorEdit.remove(str);
        editorEdit.apply();
    }

    public static void f(String str, String str2) {
        SharedPreferences sharedPreferencesB = b(Environment.getApplicationContext(), "themename");
        if (sharedPreferencesB == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = sharedPreferencesB.edit();
        editorEdit.putString(str, str2);
        editorEdit.apply();
    }

    public static boolean g(Context context) {
        if (context == null) {
            HwLog.d("SharepreferenceUtils", "isSaveUpDataWatchFaceUrlData context is null");
            return false;
        }
        String str = new SimpleDateFormat("yyyyMMdd").format(new Date());
        HwLog.i("SharepreferenceUtils", "isSaveUpDataWatchFaceUrlData currentData=" + str);
        SharedPreferences sharedPreferences = context.getSharedPreferences("goal_steps_perference", 0);
        String string = "";
        if (sharedPreferences != null) {
            string = sharedPreferences.getString("watch_face_updata_data", "");
            HwLog.i("SharepreferenceUtils", "isSaveUpDataWatchFaceUrlData data=" + string);
        }
        return str.equals(string);
    }

    public static void h(Context context, String str) {
        HwLog.i("SharepreferenceUtils", "setSaveUpDataWatchFaceUrlData=" + str);
        if (context == null) {
            HwLog.d("SharepreferenceUtils", "setSaveUpDataWatchFaceUrlData context is null");
            return;
        }
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("goal_steps_perference", 0).edit();
        if (editorEdit != null) {
            editorEdit.putString("watch_face_updata_data", str);
            editorEdit.commit();
        }
    }

    public static void i(Context context, String str) {
        if (context == null) {
            HwLog.d("SharepreferenceUtils", "setWatchFaceInfo context is null");
            return;
        }
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("goal_steps_perference", 0).edit();
        if (editorEdit != null) {
            editorEdit.putString("watch_face_url", str);
            editorEdit.apply();
        }
    }

    public static void j(Context context, String str) {
        HwLog.i("SharepreferenceUtils", "setWatchFaceVersion:" + str);
        if (context == null) {
            HwLog.w("SharepreferenceUtils", "setWatchFaceVersion context is null");
            return;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("goal_steps_perference", 0);
        if (sharedPreferences == null) {
            HwLog.w("SharepreferenceUtils", "setWatchFaceVersion sp is null");
            return;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        if (editorEdit != null) {
            editorEdit.putString("watch_face_version", str);
            editorEdit.commit();
        }
    }

    public static void k(Context context, String str) {
        if (context == null) {
            HwLog.d("SharepreferenceUtils", "setWearBtName context is null");
            return;
        }
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("goal_steps_perference", 0).edit();
        if (editorEdit != null) {
            editorEdit.putString("watch_bt_info", str);
            editorEdit.commit();
        }
    }

    public static String d(String str, String str2) {
        SharedPreferences sharedPreferencesB = b(Environment.getApplicationContext(), "themename");
        return sharedPreferencesB != null ? sharedPreferencesB.getString(str, str2) : str2;
    }

    public static String c(Context context, String str) {
        String string = "";
        if (context == null) {
            HwLog.e("SharepreferenceUtils", "getWatchFaceH5Url context is null.");
            return "";
        }
        if (TextUtils.isEmpty(str)) {
            HwLog.e("SharepreferenceUtils", "getWatchFaceH5Url countryCode is empty.");
            return "";
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("goal_steps_perference", 0);
        if (sharedPreferences != null) {
            string = sharedPreferences.getString("watchFaceH5" + str, "");
        }
        return !TextUtils.isEmpty(string) ? k5.a(string, "storagePw") : string;
    }

    public static String d(Context context) {
        if (context == null) {
            HwLog.d("SharepreferenceUtils", "getWatchFaceInfo context is null");
            return "";
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("goal_steps_perference", 0);
        return sharedPreferences != null ? sharedPreferences.getString("watch_face_url", "") : "";
    }

    public static Set a(String str, String str2, Set set) {
        SharedPreferences sharedPreferencesB = b(Environment.getApplicationContext(), str2);
        return sharedPreferencesB != null ? sharedPreferencesB.getStringSet(str, set) : set;
    }

    public static String e(Context context) {
        if (context == null) {
            HwLog.w("SharepreferenceUtils", "getWatchFaceVersion context is null");
            return "";
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("goal_steps_perference", 0);
        String string = sharedPreferences != null ? sharedPreferences.getString("watch_face_version", "") : "";
        HwLog.i("SharepreferenceUtils", "getWatchFaceVersion:" + string);
        return string;
    }

    public static void i(final Context context) {
        if (context == null) {
            HwLog.d("SharepreferenceUtils", "setWatchFaceUrl context is null");
            return;
        }
        final String commonCountryCode = HwWatchFaceApi.getInstance(context).getCommonCountryCode();
        if (TextUtils.isEmpty(commonCountryCode)) {
            HwLog.e("SharepreferenceUtils", "setWatchFaceUrl countryCode is empty.");
        } else {
            BackgroundTaskUtils.submit(new Runnable() { // from class: com.huawei.watchface.e4$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    String str = commonCountryCode;
                    e4.b(context, str, v0.a().a("watchFace", str));
                }
            });
        }
    }

    public static String f(Context context) {
        if (context == null) {
            HwLog.d("SharepreferenceUtils", "getWearBtName context is null");
            return "";
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("goal_steps_perference", 0);
        return sharedPreferences != null ? sharedPreferences.getString("watch_bt_info", "") : "";
    }

    public static boolean a(String str, boolean z) {
        return a(str, "themename", z);
    }

    public static void h(final Context context) {
        if (context == null) {
            HwLog.d("SharepreferenceUtils", "setWatchFaceH5Url context is null");
            return;
        }
        final String commonCountryCode = HwWatchFaceApi.getInstance(context).getCommonCountryCode();
        if (TextUtils.isEmpty(commonCountryCode)) {
            HwLog.e("SharepreferenceUtils", "setWatchFaceH5Url countryCode is empty.");
        } else {
            BackgroundTaskUtils.submit(new Runnable() { // from class: com.huawei.watchface.e4$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    String str = commonCountryCode;
                    e4.a(context, str, v0.a().a("watchFaceH5", str));
                }
            });
        }
    }

    public static boolean a(String str, String str2) {
        return a(str, str2, false);
    }

    public static boolean a(String str, String str2, boolean z) {
        SharedPreferences sharedPreferencesB = b(Environment.getApplicationContext(), str2);
        if (sharedPreferencesB == null) {
            return false;
        }
        return sharedPreferencesB.getBoolean(str, z);
    }

    public static void b(String str, long j) {
        SharedPreferences sharedPreferencesB = (SharedPreferences) f30131a.get("themename");
        if (sharedPreferencesB == null) {
            sharedPreferencesB = b(Environment.getApplicationContext(), "themename");
            if (sharedPreferencesB == null) {
                HwLog.i("SharepreferenceUtils", "theme_name sp is null");
                return;
            }
            f30131a.put("themename", sharedPreferencesB);
        }
        SharedPreferences.Editor editorEdit = sharedPreferencesB.edit();
        editorEdit.putLong(str, j);
        editorEdit.apply();
    }

    public static String d(Context context, String str) {
        String string = "";
        if (context == null) {
            HwLog.e("SharepreferenceUtils", "getWatchFaceUrl context is null.");
            return "";
        }
        if (TextUtils.isEmpty(str)) {
            HwLog.e("SharepreferenceUtils", "getWatchFaceUrl countryCode is empty.");
            return "";
        }
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences("goal_steps_perference", 0);
            if (sharedPreferences != null) {
                string = sharedPreferences.getString("watchFace" + str, "");
            }
            return !TextUtils.isEmpty(string) ? k5.a(string, "storagePw") : string;
        } catch (Exception e) {
            HwLog.e("SharepreferenceUtils", "getWatchFaceUrl Exception:" + HwLog.printException(e));
            return string;
        }
    }

    public static void g(Context context, String str) {
        if (context == null) {
            HwLog.d("SharepreferenceUtils", "saveCurrentLanguage context is null");
            return;
        }
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("goal_steps_perference", 0).edit();
        if (editorEdit != null) {
            editorEdit.putString("save_devices_current_language", str);
            editorEdit.commit();
        }
    }

    public static boolean e(Context context, String str) {
        if (context == null) {
            HwLog.d("SharepreferenceUtils", "judgeCurrentLanguage context is null");
            return false;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("goal_steps_perference", 0);
        String string = sharedPreferences != null ? sharedPreferences.getString("save_devices_current_language", "") : "";
        HwLog.w("SharepreferenceUtils", "Last time:" + string);
        HwLog.w("SharepreferenceUtils", "current time:" + str);
        return string.equals(str);
    }

    public static String a(String str, String str2, String str3) {
        SharedPreferences sharedPreferencesB = b(Environment.getApplicationContext(), str2);
        if (sharedPreferencesB == null) {
            return null;
        }
        return sharedPreferencesB.getString(str, str3);
    }

    public static void f(Context context, String str) {
        HwLog.i("SharepreferenceUtils", "saveCacheScreenWidth:" + str);
        if (context == null) {
            HwLog.w("SharepreferenceUtils", "saveCacheScreenWidth context is null");
            return;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("goal_steps_perference", 0);
        if (sharedPreferences == null) {
            HwLog.w("SharepreferenceUtils", "saveCacheScreenWidth sp is null");
            return;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        if (editorEdit != null) {
            editorEdit.putString("PHONE_SCREEN_WIDTH", str);
            editorEdit.commit();
        }
    }

    public static long a(String str, long j) {
        SharedPreferences sharedPreferencesB = b(Environment.getApplicationContext(), "themename");
        if (sharedPreferencesB == null) {
            return 0L;
        }
        return sharedPreferencesB.getLong(str, j);
    }

    public static boolean c(Context context) {
        if (context == null) {
            HwLog.d("SharepreferenceUtils", "getPersonalizedStatus context is null");
            return false;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("goal_steps_perference", 0);
        if (sharedPreferences != null) {
            return sharedPreferences.getBoolean("current_personalized_status", false);
        }
        return false;
    }

    public static void b(String str, boolean z) {
        a(str, z, "themename");
    }

    public static SharedPreferences b(Context context, String str) {
        try {
            return g0.a(context).getSharedPreferences(str, 0);
        } catch (IllegalArgumentException e) {
            HwLog.e("SharepreferenceUtils", "getSharedPreferences IllegalArgumentException " + HwLog.printException((Exception) e));
            return null;
        } catch (Exception e2) {
            HwLog.e("SharepreferenceUtils", "getSharedPreferences Exception " + HwLog.printException(e2));
            return null;
        }
    }

    public static void a(String str, boolean z, String str2) {
        SharedPreferences sharedPreferencesB = b(Environment.getApplicationContext(), str2);
        if (sharedPreferencesB == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = sharedPreferencesB.edit();
        editorEdit.putBoolean(str, z);
        editorEdit.apply();
    }

    public static void c(String str) {
        SharedPreferences sharedPreferencesB = b(Environment.getApplicationContext(), str);
        if (sharedPreferencesB == null) {
            HwLog.i("SharepreferenceUtils", "clearDeSpFile sharedPreferences is null");
            return;
        }
        SharedPreferences.Editor editorEdit = sharedPreferencesB.edit();
        editorEdit.clear();
        editorEdit.apply();
        HwLog.i("SharepreferenceUtils", "clearDeSpFile name:" + str);
    }

    public static void b(String str, int i) {
        SharedPreferences sharedPreferencesB = b(Environment.getApplicationContext(), "themename");
        if (sharedPreferencesB == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = sharedPreferencesB.edit();
        editorEdit.putInt(str, i);
        editorEdit.apply();
    }

    public static SharedPreferences a(Context context, String str) {
        if (context == null) {
            return null;
        }
        try {
            return context.getSharedPreferences(str, 0);
        } catch (IllegalArgumentException e) {
            HwLog.e("SharepreferenceUtils", "getCeSharedPreferences IllegalArgumentException " + HwLog.printException((Exception) e));
            return null;
        } catch (Exception e2) {
            HwLog.e("SharepreferenceUtils", "getCeSharedPreferences Exception " + HwLog.printException(e2));
            return null;
        }
    }

    public static void a(ConcurrentHashMap concurrentHashMap, String str) {
        if (ArrayUtils.a(concurrentHashMap)) {
            HwLog.e("SharepreferenceUtils", "writeMap map is null");
            return;
        }
        SharedPreferences sharedPreferencesB = (SharedPreferences) f30131a.get(str);
        if (sharedPreferencesB == null) {
            sharedPreferencesB = b(Environment.getApplicationContext(), str);
            if (sharedPreferencesB == null) {
                HwLog.e("SharepreferenceUtils", "writeMap sharedPreferences is null");
                return;
            }
            f30131a.put(str, sharedPreferencesB);
        }
        SharedPreferences.Editor editorEdit = sharedPreferencesB.edit();
        Iterator it = concurrentHashMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str2 = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Boolean) {
                editorEdit.putBoolean(str2, ((Boolean) value).booleanValue());
            } else if (value instanceof Long) {
                editorEdit.putLong(str2, ((Long) value).longValue());
            } else if (value instanceof String) {
                editorEdit.putString(str2, (String) value);
            } else if (value instanceof Set) {
                editorEdit.putStringSet(str2, (Set) value);
            }
            it.remove();
        }
        editorEdit.apply();
    }

    public static void b(Context context, String str, String str2) {
        if (context == null) {
            HwLog.d("SharepreferenceUtils", "setWatchFaceUrl context is null");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            HwLog.e("SharepreferenceUtils", "setWatchFaceUrl countryCode is empty.");
            return;
        }
        try {
            SharedPreferences.Editor editorEdit = context.getSharedPreferences("goal_steps_perference", 0).edit();
            if (editorEdit != null) {
                editorEdit.putString("watchFace" + str, k5.c(str2, "storagePw"));
                editorEdit.apply();
            }
        } catch (Exception e) {
            HwLog.e("SharepreferenceUtils", "setWatchFaceUrl Exception:" + HwLog.printException(e));
        }
    }

    public static String b(String str, String str2) {
        SharedPreferences sharedPreferencesB = b(Environment.getApplicationContext(), str2);
        return sharedPreferencesB == null ? "" : sharedPreferencesB.getString(str, "");
    }

    public static void b(Context context, boolean z) {
        if (context == null) {
            HwLog.d("SharepreferenceUtils", "savePersonalizedStatus context is null");
            return;
        }
        HwLog.i("SharepreferenceUtils", "savePersonalizedStatus personalizedChange:" + z);
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("goal_steps_perference", 0).edit();
        if (editorEdit != null) {
            editorEdit.putBoolean("current_personalized_status", z);
            editorEdit.apply();
        }
    }

    public static int a(String str, int i) {
        SharedPreferences sharedPreferencesB = b(Environment.getApplicationContext(), "themename");
        if (sharedPreferencesB == null) {
            return 0;
        }
        return sharedPreferencesB.getInt(str, i);
    }

    public static boolean b(Context context) {
        if (context == null) {
            HwLog.d("SharepreferenceUtils", "getNeedRefreshWatchFace context is null");
            return false;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("goal_steps_perference", 0);
        if (sharedPreferences != null) {
            return sharedPreferences.getBoolean("need_refresh_watch_face_date", false);
        }
        return false;
    }

    public static String a(Context context) {
        if (context == null) {
            HwLog.w("SharepreferenceUtils", "getWatchFaceVersion context is null");
            return "";
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("goal_steps_perference", 0);
        String string = sharedPreferences != null ? sharedPreferences.getString("PHONE_SCREEN_WIDTH", "0") : "";
        HwLog.i("SharepreferenceUtils", "getCacheScreenWidth:" + string);
        return string;
    }

    public static void b(String str) {
        FileHelper.a(str);
        HwLog.i("SharepreferenceUtils", "clearDeSp name:" + str);
    }

    public static void a(Context context, String str, String str2) {
        if (context == null) {
            HwLog.d("SharepreferenceUtils", "setWatchFaceH5Url context is null");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            HwLog.e("SharepreferenceUtils", "setWatchFaceH5Url countryCode is empty.");
            return;
        }
        try {
            SharedPreferences.Editor editorEdit = context.getSharedPreferences("goal_steps_perference", 0).edit();
            if (editorEdit != null) {
                editorEdit.putString("watchFaceH5" + str, k5.c(str2, "storagePw"));
                editorEdit.apply();
            }
        } catch (Exception e) {
            HwLog.e("SharepreferenceUtils", "setWatchFaceH5Url Exception:" + HwLog.printException(e));
        }
    }

    public static void a(Context context, boolean z) {
        if (context == null) {
            HwLog.d("SharepreferenceUtils", "saveNeedRefreshWatchFace context is null");
            return;
        }
        HwLog.i("SharepreferenceUtils", "saveNeedRefreshWatchFace needRefresh:" + z);
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("goal_steps_perference", 0).edit();
        if (editorEdit != null) {
            editorEdit.putBoolean("need_refresh_watch_face_date", z);
            editorEdit.apply();
        }
    }

    public static boolean a(String str) {
        if (f4.b(str)) {
            HwLog.i("SharepreferenceUtils", "checkDeviceIsChange deviceName is null");
            return false;
        }
        if (str.equalsIgnoreCase(d("cache_device_name", ""))) {
            return false;
        }
        HwLog.i("SharepreferenceUtils", "checkDeviceIsChange deviceName is change");
        f("cache_device_name", str);
        return true;
    }

    public static void a() {
        try {
            b("USER_TOKEN_FILE_PREF");
            b("WATCH_FACE_DOWNLOAD_QUEUE");
            b("MEMBERSHIP_INFO_DATA");
            b("supportonline");
            b("permissionList");
            b("album_background");
            b("KeyPref");
            b("SystemParamFile");
            b("themename");
            b("hianalytics_global_v2_" + Environment.b());
            b("watch_face_shared_preference");
            b("my_watch_face");
            b("DEFAULT_WATCH_FACE_OPERATION_RESULT_PREF");
        } catch (Exception e) {
            HwLog.e("SharepreferenceUtils", "clearAllSp Exception: " + HwLog.printException(e));
        }
    }
}
