package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwdevice.outofprocess.mgr.device.ProfileAgent;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.profile.client.connect.ServiceConnectCallback;
import com.huawei.ui.homehealth.R;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.LogAnonymous;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.Utils;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/* JADX INFO: loaded from: classes17.dex */
public class tfi {
    public static int f(Context context) {
        String strE = SharedPreferenceManager.e(context, Integer.toString(20002), "map_tracking_sport_type");
        if (a(strE)) {
            SharedPreferenceManager.e(context, Integer.toString(20002), "map_tracking_sport_type_sportting", "", new StorageParams());
            return 0;
        }
        try {
            SharedPreferenceManager.e(context, Integer.toString(20002), "map_tracking_sport_type_sportting", strE, new StorageParams());
            return Integer.parseInt(strE);
        } catch (NumberFormatException e) {
            LogUtil.e("PluginUtil", "getSportTypeFromSharePreference NumberFormatException", LogAnonymous.b(e));
            return 0;
        }
    }

    public static int g(Context context) {
        if (context == null) {
            LogUtil.j("PluginUtil", "getTargetTypeFromSharePreference context is null");
            return -1;
        }
        String strE = SharedPreferenceManager.e(context, Integer.toString(20002), "sport_target_type");
        if (a(strE)) {
            SharedPreferenceManager.e(context, Integer.toString(20002), "sport_target_type_sportting", "", new StorageParams());
        } else {
            try {
                SharedPreferenceManager.e(context, Integer.toString(20002), "sport_target_type_sportting", strE, new StorageParams());
                return Integer.parseInt(strE);
            } catch (NumberFormatException unused) {
                LogUtil.e("PluginUtil", "getTargetTypeFromSharePreference NumberFormatException");
            }
        }
        return -1;
    }

    public static int e(Context context, int i) {
        int iG = g(context);
        if (iG != -1) {
            b(context, i, iG);
            i(context, -1);
            return iG;
        }
        if (i == 258) {
            return a(context, "sport_target_type_outdoor_running");
        }
        if (i == 264) {
            return a(context, "sport_target_type_indoor_running");
        }
        if (i == 257) {
            return a(context, "sport_target_type_outdoor_walk");
        }
        if (i == 259) {
            return a(context, "sport_target_type_outdoor_bike");
        }
        if (i == 282) {
            return a(context, "sport_target_type_outdoor_hiking");
        }
        if (i == 260) {
            return a(context, "sport_target_type_outdoor_climb_hill");
        }
        if (i == 283) {
            return a(context, "sport_target_type_skip");
        }
        return -1;
    }

    private static int a(Context context, String str) {
        String strE = SharedPreferenceManager.e(context, Integer.toString(20002), str);
        if (a(strE)) {
            return -1;
        }
        try {
            return Integer.parseInt(strE);
        } catch (NumberFormatException unused) {
            LogUtil.e("PluginUtil", "getDifferentSportTargetType NumberFormatException");
            return -1;
        }
    }

    public static float i(Context context) {
        String strE = SharedPreferenceManager.e(context, Integer.toString(20002), "sport_target_value");
        if (a(strE)) {
            SharedPreferenceManager.e(context, Integer.toString(20002), "sport_target_value_sportting", "", new StorageParams());
            return -1.0f;
        }
        SharedPreferenceManager.e(context, Integer.toString(20002), "sport_target_value_sportting", strE, new StorageParams());
        try {
            return Float.parseFloat(strE);
        } catch (NumberFormatException unused) {
            LogUtil.e("PluginUtil", "getTargetValueFromSharePreference NumberFormatException");
            return -1.0f;
        }
    }

    public static float d(Context context, int i) {
        float fI = i(context);
        if (Math.abs(1.0f + fI) >= 1.0E-6d) {
            a(context, fI, i);
            b(context, -1.0f);
            return fI;
        }
        if (i == 258) {
            return c(context, "sport_target_value_outdoor_running");
        }
        if (i == 264) {
            return c(context, "sport_target_value_indoor_running");
        }
        if (i == 257) {
            return c(context, "sport_target_value_outdoor_walk");
        }
        if (i == 259) {
            return c(context, "sport_target_value_outdoor_bike");
        }
        if (i == 282) {
            return c(context, "sport_target_value_outdoor_hiking");
        }
        if (i == 260) {
            return c(context, "sport_target_value_outdoor_climb_hill");
        }
        if (i == 283) {
            return c(context, "sport_target_value_skip");
        }
        return -1.0f;
    }

    public static float a(Context context, int i, int i2) {
        Object obj;
        String strD = d(i);
        String strE = SharedPreferenceManager.e(context, Integer.toString(20002), strD);
        LogUtil.a("PluginUtil", "getCustomTargetValueFromSharePreference:", "customSportType:", strD, "targetValueStr", strE);
        Map map = (Map) izn.d(strE, new TypeToken<Map<String, Float>>() { // from class: com.huawei.ui.homehealth.util.PluginUtil$1
        });
        if (map == null || map.isEmpty() || (obj = map.get(c(i, i2))) == null) {
            return -1.0f;
        }
        return ((Float) obj).floatValue();
    }

    private static float c(Context context, String str) {
        String strE = SharedPreferenceManager.e(context, Integer.toString(20002), str);
        if (a(strE)) {
            return -1.0f;
        }
        return CommonUtil.f(strE);
    }

    private static boolean a(String str) {
        return str == null || "".equals(str) || "-1".equals(str);
    }

    public static void h(Context context, int i) {
        SharedPreferenceManager.e(context, Integer.toString(20002), "map_tracking_sport_type", Integer.toString(i), new StorageParams());
        SharedPreferenceManager.e(context, Integer.toString(20002), "map_tracking_sport_type_sportting", Integer.toString(i), new StorageParams());
    }

    private static void i(Context context, int i) {
        SharedPreferenceManager.e(context, Integer.toString(20002), "sport_target_type", Integer.toString(i), new StorageParams());
        SharedPreferenceManager.e(context, Integer.toString(20002), "sport_target_type_sportting", Integer.toString(i), new StorageParams());
    }

    public static void b(Context context, int i, int i2) {
        if (i == 258) {
            SharedPreferenceManager.e(context, Integer.toString(20002), "sport_target_type_outdoor_running", Integer.toString(i2), new StorageParams());
            return;
        }
        if (i == 264) {
            SharedPreferenceManager.e(context, Integer.toString(20002), "sport_target_type_indoor_running", Integer.toString(i2), new StorageParams());
            return;
        }
        if (i == 257) {
            SharedPreferenceManager.e(context, Integer.toString(20002), "sport_target_type_outdoor_walk", Integer.toString(i2), new StorageParams());
            return;
        }
        if (i == 259) {
            SharedPreferenceManager.e(context, Integer.toString(20002), "sport_target_type_outdoor_bike", Integer.toString(i2), new StorageParams());
            return;
        }
        if (i == 282) {
            SharedPreferenceManager.e(context, Integer.toString(20002), "sport_target_type_outdoor_hiking", Integer.toString(i2), new StorageParams());
        } else if (i == 260) {
            SharedPreferenceManager.e(context, Integer.toString(20002), "sport_target_type_outdoor_climb_hill", Integer.toString(i2), new StorageParams());
        } else if (i == 283) {
            SharedPreferenceManager.e(context, Integer.toString(20002), "sport_target_type_skip", Integer.toString(i2), new StorageParams());
        }
    }

    private static void b(Context context, float f) {
        SharedPreferenceManager.e(context, Integer.toString(20002), "sport_target_value", Float.toString(f), new StorageParams());
        SharedPreferenceManager.e(context, Integer.toString(20002), "sport_target_value_sportting", Float.toString(f), new StorageParams());
    }

    public static void a(Context context, float f, int i) {
        if (i == 258) {
            SharedPreferenceManager.e(context, Integer.toString(20002), "sport_target_value_outdoor_running", Float.toString(f), new StorageParams());
            return;
        }
        if (i == 264) {
            SharedPreferenceManager.e(context, Integer.toString(20002), "sport_target_value_indoor_running", Float.toString(f), new StorageParams());
            return;
        }
        if (i == 257) {
            SharedPreferenceManager.e(context, Integer.toString(20002), "sport_target_value_outdoor_walk", Float.toString(f), new StorageParams());
            return;
        }
        if (i == 259) {
            SharedPreferenceManager.e(context, Integer.toString(20002), "sport_target_value_outdoor_bike", Float.toString(f), new StorageParams());
            return;
        }
        if (i == 282) {
            SharedPreferenceManager.e(context, Integer.toString(20002), "sport_target_value_outdoor_hiking", Float.toString(f), new StorageParams());
        } else if (i == 260) {
            SharedPreferenceManager.e(context, Integer.toString(20002), "sport_target_value_outdoor_climb_hill", Float.toString(f), new StorageParams());
        } else if (i == 283) {
            SharedPreferenceManager.e(context, Integer.toString(20002), "sport_target_value_skip", Float.toString(f), new StorageParams());
        }
    }

    public static void b(Context context, int i, int i2, float f) {
        Map<String, Float> mapE = e(i, i2, f);
        SharedPreferenceManager.e(context, Integer.toString(20002), d(i), new Gson().toJson(mapE), new StorageParams());
    }

    private static Map<String, Float> e(int i, int i2, float f) {
        HashMap map = new HashMap(4);
        String strC = c(i, 0);
        Float fValueOf = Float.valueOf(-1.0f);
        map.put(strC, fValueOf);
        map.put(c(i, 1), fValueOf);
        map.put(c(i, 2), fValueOf);
        map.put(c(i, 5), fValueOf);
        map.put(c(i, i2), Float.valueOf(f));
        return map;
    }

    private static String c(int i, int i2) {
        return "custom_target_map_key_" + i + "_" + i2;
    }

    public static void a(Context context, int i, boolean z) {
        SharedPreferenceManager.e(context, Integer.toString(20002), e(i), Boolean.toString(z), new StorageParams());
    }

    private static String e(int i) {
        if (i != 264 && i != 283) {
            switch (i) {
                case 257:
                case 258:
                case 259:
                    break;
                default:
                    return "custom_target_default_flag";
            }
        }
        return "custom_target_flag_" + i;
    }

    private static String d(int i) {
        if (i != 264 && i != 283) {
            switch (i) {
                case 257:
                case 258:
                case 259:
                    break;
                default:
                    return "custom_target_default";
            }
        }
        return "custom_target_sport_type_" + i;
    }

    public static boolean d(Context context, String str) {
        String strE = SharedPreferenceManager.e(context, Integer.toString(20002), str);
        if (TextUtils.isEmpty(strE)) {
            if ("smart_coach_enable_type".equals(str)) {
                SharedPreferenceManager.e(context, Integer.toString(20002), str, Integer.toString(0), new StorageParams());
                return false;
            }
            SharedPreferenceManager.e(context, Integer.toString(20002), str, Integer.toString(1), new StorageParams());
            return true;
        }
        try {
            return Integer.parseInt(strE) == 1;
        } catch (NumberFormatException e) {
            LogUtil.e("PluginUtil", "getVoiceEnable NumberFormatException = ", e.getMessage());
            return false;
        }
    }

    public static void a(Context context, String str, boolean z) {
        if (z) {
            SharedPreferenceManager.e(context, Integer.toString(20002), str, Integer.toString(1), new StorageParams());
        } else {
            SharedPreferenceManager.e(context, Integer.toString(20002), str, Integer.toString(0), new StorageParams());
        }
    }

    public static int c(Context context) {
        String strE = SharedPreferenceManager.e(context, Integer.toString(20002), "voice_broadcast_interval_type");
        if (!TextUtils.isEmpty(strE)) {
            try {
                return Integer.parseInt(strE);
            } catch (NumberFormatException unused) {
                LogUtil.e("PluginUtil", "acquireVoiceIntervalSettingType NumberFormatException");
                return 0;
            }
        }
        LogUtil.j("PluginUtil", "acquireVoiceIntervalSettingType you should set it before get");
        return 0;
    }

    public static void f(Context context, int i) {
        SharedPreferenceManager.e(context, Integer.toString(20002), "voice_broadcast_interval_type", String.valueOf(i), new StorageParams());
    }

    public static int d(Context context) {
        String strE = SharedPreferenceManager.e(context, Integer.toString(20002), "voice_broadcast_time_interval_value");
        if (!TextUtils.isEmpty(strE)) {
            try {
                return Integer.parseInt(strE);
            } catch (NumberFormatException unused) {
                LogUtil.e("PluginUtil", "acquireVoiceTimeIntervalValue NumberFormatException");
                return 0;
            }
        }
        LogUtil.j("PluginUtil", "acquireVoiceTimeIntervalValue you should set it before get");
        return 0;
    }

    public static int a(Context context) {
        String strE = SharedPreferenceManager.e(context, Integer.toString(20002), "voice_broadcast_distance_interval_value");
        if (!TextUtils.isEmpty(strE)) {
            try {
                return Integer.parseInt(strE);
            } catch (NumberFormatException unused) {
                LogUtil.e("PluginUtil", "acquireVoiceDistanceIntervalValue NumberFormatException");
                return 0;
            }
        }
        LogUtil.j("PluginUtil", "acquireVoiceDistanceIntervalValue you should set it before get");
        return 0;
    }

    public static void j(Context context, int i) {
        SharedPreferenceManager.e(context, Integer.toString(20002), "voice_broadcast_time_interval_value", String.valueOf(i), new StorageParams());
    }

    public static void c(Context context, int i) {
        SharedPreferenceManager.e(context, Integer.toString(20002), "voice_broadcast_distance_interval_value", String.valueOf(i), new StorageParams());
    }

    public static boolean o(Context context) {
        String strE;
        return (context == null || (strE = SharedPreferenceManager.e(context, Integer.toString(20002), "HAS_SHOW_PLAN_TIP")) == null || !"true".equals(strE)) ? false : true;
    }

    public static void b(Context context, boolean z) {
        SharedPreferenceManager.e(context, Integer.toString(20002), "HAS_SHOW_PLAN_TIP", String.valueOf(z), new StorageParams());
    }

    public static int e(Context context) {
        if (context == null) {
            return 0;
        }
        String strE = SharedPreferenceManager.e(context, Integer.toString(20002), "sport_listen_type");
        if (TextUtils.isEmpty(strE)) {
            return 0;
        }
        try {
            return Integer.parseInt(strE);
        } catch (NumberFormatException e) {
            LogUtil.e("PluginUtil", "acquireSportListenerType NumberFormatException", LogAnonymous.b(e));
            return 0;
        }
    }

    public static void b(Context context, int i) {
        if (context != null) {
            SharedPreferenceManager.e(context, Integer.toString(20002), "sport_listen_type", String.valueOf(i), new StorageParams());
            return;
        }
        LogUtil.j("PluginUtil", "saveSportListenerType  context is null");
    }

    public static int b(Context context) {
        if (context != null) {
            return CommonUtil.e(SharedPreferenceManager.e(context, Integer.toString(20002), "sport_music_control_type"), 0);
        }
        return 0;
    }

    public static void a(Context context, int i) {
        if (context != null) {
            SharedPreferenceManager.e(context, Integer.toString(20002), "sport_music_control_type", String.valueOf(i), new StorageParams());
            return;
        }
        LogUtil.j("PluginUtil", "saveSportMusicControlType  context is null");
    }

    public static boolean e(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:sss");
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(new Date());
            int i = calendar.get(1);
            int i2 = calendar.get(2);
            int i3 = calendar.get(5);
            calendar.setTime(simpleDateFormat.parse(str));
            int i4 = calendar.get(1);
            int i5 = calendar.get(2);
            return i >= i4 && i2 >= i5 && (i > i4 || i2 > i5 || i3 > calendar.get(5));
        } catch (ParseException e) {
            LogUtil.j("PluginUtil", "diffDate:", LogAnonymous.b(e));
            return false;
        }
    }

    public static String j(Context context) {
        HiUserPreference userPreference = HiHealthManager.d(context).getUserPreference("com.huawei.health.mc");
        if (userPreference == null) {
            LogUtil.e("PluginUtil", "setPhysicalCycleSwitch userPreference is null.");
            return null;
        }
        return userPreference.getValue();
    }

    public static void c(final String str) {
        LogUtil.d("PluginUtil", "removeDeviceFromProfile:", str);
        if (Utils.o() || TextUtils.isEmpty(str)) {
            return;
        }
        ProfileAgent.PROFILE_AGENT.connectProfile(new ServiceConnectCallback() { // from class: tfi.5
            @Override // com.huawei.profile.client.connect.ServiceConnectCallback
            public void onConnect() {
                LogUtil.a("PluginUtil", "profile connected");
                lsy.a(new Runnable() { // from class: tfi.5.2
                    @Override // java.lang.Runnable
                    public void run() {
                        new mgz().a(str);
                        ProfileAgent.PROFILE_AGENT.disconnectProfile();
                    }
                });
                ProfileAgent.PROFILE_AGENT.setConnected(true);
            }

            @Override // com.huawei.profile.client.connect.ServiceConnectCallback
            public void onDisconnect() {
                ProfileAgent.PROFILE_AGENT.setConnected(false);
                LogUtil.a("PluginUtil", "profile disconnected");
            }
        });
    }

    public static boolean n(Context context) {
        if (context == null) {
            return false;
        }
        boolean zD = lsg.d(context, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"});
        LogUtil.a("PluginUtil", "get Location Permissions:", Boolean.valueOf(zD));
        return zD;
    }

    public static boolean h(Context context) {
        if (context == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT > 30) {
            return PermissionUtil.e(context, PermissionUtil.PermissionType.SCAN) == PermissionUtil.PermissionResult.GRANTED;
        }
        return n(context);
    }

    public static boolean l(Context context) {
        if (context == null) {
            return false;
        }
        String strE = SharedPreferenceManager.e(context, String.valueOf(10008), "auto_scan_device_time");
        if (!TextUtils.isEmpty(strE)) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            LogUtil.a("PluginUtil", "nowTime:", Long.valueOf(jCurrentTimeMillis), " lastScanTime:", strE);
            long jM = CommonUtil.m(context, strE);
            if (jM != 0 && jCurrentTimeMillis - jM > 86400000) {
                SharedPreferenceManager.e(context, String.valueOf(10008), "auto_scan_device_time", String.valueOf(jCurrentTimeMillis), null);
                LogUtil.a("PluginUtil", "The interval was more than one day");
                return true;
            }
            LogUtil.j("PluginUtil", "The interval was less than one day");
            return false;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        LogUtil.j("PluginUtil", "first update nowTime:", Long.valueOf(jCurrentTimeMillis2));
        SharedPreferenceManager.e(context, String.valueOf(10008), "auto_scan_device_time", String.valueOf(jCurrentTimeMillis2), null);
        return true;
    }

    public static boolean a(int i) {
        if (i != 258 && i != 259) {
            return false;
        }
        if (!Utils.o()) {
            return true;
        }
        String countryCode = GRSManager.c(BaseApplication.b()).getCountryCode();
        String[] strArrD = d();
        if (countryCode == null || CollectionUtils.d(strArrD)) {
            ReleaseLogUtil.c("PluginUtil", "isShowRouteDraw countryCode = ", countryCode);
            return false;
        }
        boolean zContains = ((List) Arrays.stream(strArrD).collect(Collectors.toList())).contains(countryCode);
        ReleaseLogUtil.c("PluginUtil", "isShowRouteDraw countryCode = ", countryCode);
        return zContains;
    }

    private static String[] d() {
        try {
            return BaseApplication.b().getResources().getStringArray(R.array.route_draw_country_code);
        } catch (Resources.NotFoundException e) {
            ReleaseLogUtil.b("PluginUtil", "getSupportCountry meet exception: ", e.getMessage());
            return new String[0];
        }
    }
}
