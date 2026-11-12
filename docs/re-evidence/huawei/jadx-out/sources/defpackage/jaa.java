package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.hardware.SensorManager;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.View;
import com.amap.api.location.AMapLocation;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.huawei.haf.common.utils.NetworkUtil;
import com.huawei.health.sport.utils.SportSupportUtil;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.ui.sporttypeconfig.bean.HwSportTypeInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.hwfoundationmodel.trackmodel.MotionPath;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwfoundationmodel.trackmodel.StepRateData;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.LanguageUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes10.dex */
public class jaa {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f38276b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f38277c = 1;
    private static String d = "WGS84";
    private static int g = 1;
    private static List<String> e = new ArrayList(10);
    private static List<String> f = new ArrayList(10);
    private static List<String> m = new ArrayList(10);
    private static boolean o = true;
    private static boolean h = false;
    private static boolean i = true;
    private static volatile Boolean j = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile Boolean f38275a = null;
    private static String l = null;

    public static float a(int i2, float f2) {
        return (i2 == 0 || i2 == 1) ? f2 * 1000.0f : f2;
    }

    public static int a(int i2) {
        return (int) ((((double) i2) * 0.6213712d) / 1000.0d);
    }

    public static double d(long j2) {
        if (j2 < 0) {
            return 0.0d;
        }
        return j2 / 1000.0d;
    }

    public static double f(int i2) {
        return ((double) i2) * 0.6213712d;
    }

    public static boolean h(int i2) {
        return i2 == 0 || i2 == 1 || i2 == 2;
    }

    public static boolean i(int i2) {
        return i2 == 264 || i2 == 258;
    }

    public static boolean j(int i2) {
        return i2 == 258 || i2 == 257 || i2 == 259 || i2 == 264;
    }

    static {
        e.add("IR");
        f.add("432");
    }

    public static String d(float f2, int i2) {
        return String.valueOf(new BigDecimal(f2).setScale(i2, 4).doubleValue());
    }

    public static String e(int i2) {
        int i3 = i2 % 100;
        if (i3 >= 10) {
            return String.valueOf(i3);
        }
        return "0" + i3;
    }

    public static String d() {
        String str = new SimpleDateFormat("yyyyMMddHHmmssSSS", Locale.ENGLISH).format(new Date());
        StringBuilder sb = new StringBuilder(16);
        sb.append("gps_maptracking_");
        sb.append(str);
        return sb.toString();
    }

    public static boolean l(Context context) {
        return NetworkUtil.k();
    }

    public static String b(int i2) {
        if (i2 == 0) {
            return "SPORT_TYPE_DEFAULT";
        }
        switch (i2) {
            case 257:
                return "SPORT_TYPE_WALK";
            case 258:
                return "SPORT_TYPE_RUN";
            case 259:
                return "SPORT_TYPE_BIKE";
            case 260:
                return "SPORT_TYPE_CLIMB_HILL";
            case 261:
                return "SPORT_TYPE_CLIMB_STAIRS";
            case 262:
                return "SPORT_TYPE_SWIM";
            case 263:
                return "SPORT_TYPE_GOLF";
            default:
                return "SPORT_TYPE_DEFAULT";
        }
    }

    public static boolean j() {
        return "com.huawei.health".equals(BaseApplication.getAppPackage());
    }

    public static void d(Context context) {
        jaq jaqVar = new jaq(context, new StorageParams(), Integer.toString(20002));
        g = jaqVar.x();
        f38276b = jaqVar.h();
    }

    public static int a(Context context) {
        d(context);
        int iA = a();
        ReleaseLogUtil.d("Track_MapTrackingUtils", "getSportMapType auto map", Integer.valueOf(iA));
        return ((iA == -1 && (h() || izt.d(context))) || iA == 0) ? b(context, izt.e(context), false) : iA;
    }

    public static int a() {
        return g;
    }

    public static int c() {
        return f38276b;
    }

    public static int b() {
        int i2 = g;
        return i2 != 0 ? i2 : f38276b;
    }

    public static int e(Context context) {
        return new jaq(context, new StorageParams(), Integer.toString(20002)).l();
    }

    public static int b(Context context, Location location, boolean z) {
        int iC = location != null ? npl.c(location.getLatitude(), location.getLongitude()) : -1;
        if (iC == 1) {
            d = AMapLocation.COORD_TYPE_GCJ02;
        } else {
            d = AMapLocation.COORD_TYPE_WGS84;
        }
        s(context);
        int i2 = g;
        if (i2 != 0) {
            f38276b = i2;
            LogUtil.a("Track_MapTrackingUtils", "MapType ", Integer.valueOf(i2));
        } else if (CommonUtil.bg()) {
            f38276b = e(context, iC, location, z);
        } else {
            f38276b = c(context, iC);
        }
        LogUtil.a("Track_MapTrackingUtils", "MapType ", Integer.valueOf(f38276b));
        x(context);
        return f38276b;
    }

    private static void s(Context context) {
        int i2 = g;
        if (i2 == -1) {
            p(context);
            return;
        }
        if (i2 == 0) {
            k(context);
            return;
        }
        if (i2 == 1) {
            n(context);
        } else if (i2 == 2) {
            m(context);
        } else {
            if (i2 != 3) {
                return;
            }
            q(context);
        }
    }

    private static void k(Context context) {
        boolean zD = izt.d(context);
        boolean zH = h();
        if (!Utils.o()) {
            if (zH || zD) {
                return;
            }
            g = 1;
            qqu.c(context, 1);
            return;
        }
        if (!zH && !zD) {
            g = -1;
            qqu.c(context, -1);
        } else if (!zH) {
            g = 3;
            qqu.c(context, 3);
        } else {
            if (zD) {
                return;
            }
            g = 2;
            qqu.c(context, 2);
        }
    }

    private static void n(Context context) {
        if (Utils.o()) {
            boolean zH = h();
            boolean zD = izt.d(context);
            if (!zH && !zD) {
                g = -1;
                qqu.c(context, -1);
            } else if (!zH) {
                g = 3;
                qqu.c(context, 3);
            } else if (!zD) {
                g = 2;
                qqu.c(context, 2);
            } else {
                g = 0;
                qqu.c(context, 0);
            }
        }
    }

    private static void m(Context context) {
        boolean zH = h();
        boolean zD = izt.d(context);
        if (Utils.o()) {
            if (!zH && !zD) {
                g = -1;
                qqu.c(context, -1);
                return;
            } else {
                if (zH) {
                    return;
                }
                g = 3;
                qqu.c(context, 3);
                return;
            }
        }
        if (!zH && !zD) {
            g = 1;
            qqu.c(context, 1);
        } else {
            if (zH) {
                return;
            }
            g = 0;
            qqu.c(context, 0);
        }
    }

    private static void q(Context context) {
        boolean zH = h();
        boolean zD = izt.d(context);
        if (Utils.o()) {
            if (!zH && !zD) {
                g = -1;
                qqu.c(context, -1);
                return;
            } else {
                if (zD) {
                    return;
                }
                g = 2;
                qqu.c(context, 2);
                return;
            }
        }
        if (!zH && !zD) {
            g = 1;
            qqu.c(context, 1);
        } else {
            if (zD) {
                return;
            }
            g = 0;
            qqu.c(context, 0);
        }
    }

    private static void p(Context context) {
        boolean zH = h();
        boolean zD = izt.d(context);
        if (!Utils.o()) {
            if (!zH && !zD) {
                g = 1;
                qqu.c(context, 1);
                return;
            } else {
                if (zH || zD) {
                    g = 0;
                    qqu.c(context, 0);
                    return;
                }
                return;
            }
        }
        if (zH && zD) {
            g = 0;
            qqu.c(context, 0);
        } else if (zH) {
            g = 2;
            qqu.c(context, 2);
        } else if (zD) {
            g = 3;
            qqu.c(context, 3);
        }
    }

    private static int e(Context context, int i2, Location location, boolean z) {
        if (!Utils.o()) {
            return a(context, i2, location, z);
        }
        return c(context, i2, location, z);
    }

    private static int a(Context context, int i2, Location location, boolean z) {
        int iC = qqu.c(context);
        if (iC == 0) {
            if (i2 == 1 || location == null) {
                f38276b = 1;
            } else if (h()) {
                v(context);
                f38276b = 2;
            } else {
                f38276b = 3;
            }
            return f38276b;
        }
        if (iC == 1) {
            f38276b = 1;
            return 1;
        }
        if (iC == 2) {
            if (h() && (!qqu.a(context) || l(context))) {
                v(context);
                f38276b = 2;
            } else if (izt.d(context)) {
                if (!j(context)) {
                    d(context, z);
                }
                f38276b = 3;
            } else {
                d(context, z);
                v(context);
                f38276b = 2;
            }
            return f38276b;
        }
        f38276b = 1;
        return 1;
    }

    private static int c(Context context, int i2, Location location, boolean z) {
        int iC = qqu.c(context);
        if (iC == 0) {
            if (i2 == 1) {
                d(context, z);
                f38276b = 3;
            } else {
                v(context);
                f38276b = 2;
            }
            return f38276b;
        }
        if (iC == 1) {
            if (h() && !qqu.e(context) && !qqu.a(context)) {
                v(context);
                f38276b = 2;
            } else if (izt.d(context)) {
                d(context, z);
                f38276b = 3;
            } else {
                d(context, z);
                v(context);
                f38276b = 2;
            }
            return f38276b;
        }
        if (iC == 2) {
            if (h() && (!qqu.a(context) || l(context))) {
                v(context);
                f38276b = 2;
            } else {
                if (!j(context)) {
                    d(context, z);
                }
                f38276b = 3;
            }
            return f38276b;
        }
        if (h()) {
            v(context);
            f38276b = 2;
        } else {
            if (!j(context)) {
                d(context, z);
            }
            f38276b = 3;
        }
        return f38276b;
    }

    private static int c(Context context, int i2) {
        int iC = qqu.c(context);
        if (iC == 0) {
            if (i2 == 1) {
                f38276b = 1;
            } else if (i2 == 2 || i2 == 3) {
                v(context);
                f38276b = 2;
            } else {
                f38276b = 1;
            }
            return f38276b;
        }
        if (iC == 1) {
            f38276b = 1;
            return 1;
        }
        if (iC == 2) {
            v(context);
            f38276b = 2;
            return 2;
        }
        f38276b = 1;
        return 1;
    }

    private static void x(Context context) {
        SharedPreferenceManager.e(context, Integer.toString(20002), "auto_map_setting", Integer.toString(f38276b), new StorageParams());
    }

    private static void v(Context context) {
        if (b(context)) {
            return;
        }
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(context);
        builder.a(context.getString(R.string.IDS_hwh_motiontrack_show_map_type_no_gms)).c(R.string.IDS_common_notification_know_tips, new View.OnClickListener() { // from class: jaa.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        });
        builder.c().show();
    }

    private static void d(Context context, boolean z) {
        if (!z) {
            LogUtil.a("Track_MapTrackingUtils", "not showing dialog");
            return;
        }
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(context);
        builder.a(context.getString(com.huawei.ui.commonui.R.string.IDS_hwh_motiontrack_map_type_area_remind_auto)).c(R.string.IDS_common_notification_know_tips, new View.OnClickListener() { // from class: jaa.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        });
        builder.c().show();
    }

    public static boolean g(Context context) {
        int iC = qqu.c(context);
        if (iC != 0) {
            return iC == 2;
        }
        return Utils.o();
    }

    public static boolean i(Context context) {
        int iC = qqu.c(context);
        if (iC != 0 && iC != 1) {
            return false;
        }
        boolean zO = Utils.o();
        return !zO;
    }

    public static boolean h(Context context) {
        if (qqu.c(context) == 2) {
            return !j(context);
        }
        return false;
    }

    public static int a(Context context, double d2, double d3) {
        int iC = npl.c(d2, d3);
        d(context);
        s(context);
        int i2 = g;
        if (i2 != 0) {
            f38277c = i2;
        } else if (Utils.o()) {
            a(context, d2, d3, iC);
        } else {
            c(context, d2, d3, iC);
        }
        LogUtil.a("Track_MapTrackingUtils", "pickTrackAutoMap mAutoTrackMapType: ", Integer.valueOf(f38277c));
        u(context);
        return f38277c;
    }

    private static void u(Context context) {
        SharedPreferenceManager.e(context, Integer.toString(20002), "auto_track_map_setting", Integer.toString(f38277c), new StorageParams());
    }

    private static void c(Context context, double d2, double d3, int i2) {
        if (i2 == 1) {
            f38277c = 1;
            return;
        }
        if (CommonUtil.bg()) {
            if (h() && !qqu.a(context)) {
                f38277c = 2;
                return;
            }
            if (izt.d(context)) {
                f38277c = 3;
                return;
            } else if (h()) {
                f38277c = 2;
                return;
            } else {
                f38277c = 1;
                return;
            }
        }
        if (h()) {
            f38277c = 2;
        } else {
            f38277c = 1;
        }
    }

    private static void a(Context context, double d2, double d3, int i2) {
        if (!qqu.a(context)) {
            f38277c = 2;
        } else if (qqu.c(context) != 1 && l(context)) {
            f38277c = 2;
        } else {
            f38277c = 3;
        }
    }

    public static boolean j(Context context) {
        if (!izt.d(context)) {
            return false;
        }
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager == null) {
            return true;
        }
        String networkOperator = telephonyManager.getNetworkOperator();
        if (TextUtils.isEmpty(networkOperator)) {
            return true;
        }
        return !f.contains(networkOperator.substring(0, 3));
    }

    public static boolean b(Context context, double d2, double d3) {
        if (!izt.d(context)) {
            return false;
        }
        if (izt.b(d2) || izt.d(d3)) {
            LogUtil.j("Track_MapTrackingUtils", "isSupportTomTom: data is invalid");
            return false;
        }
        try {
            List<Address> fromLocation = new Geocoder(context).getFromLocation(d2, d3, 1);
            if (fromLocation == null || fromLocation.size() <= 0) {
                return true;
            }
            return !e.contains(fromLocation.get(0).getCountryCode());
        } catch (IOException e2) {
            LogUtil.e("Track_MapTrackingUtils", LogAnonymous.c(e2));
            return true;
        }
    }

    public static boolean h() {
        return CommonUtil.cb();
    }

    public static boolean f() {
        d(BaseApplication.getContext());
        if (g == 2 || (!CommonUtil.bg() && Utils.o())) {
            return !b(BaseApplication.getContext());
        }
        return false;
    }

    public static boolean g() {
        return (BaseApplication.getContext().getSystemService("sensor") instanceof SensorManager) && ((SensorManager) BaseApplication.getContext().getSystemService("sensor")).getDefaultSensor(19) != null;
    }

    public static String b(long j2) {
        return new SimpleDateFormat("yyyyMMdd HHmmss", Locale.ENGLISH).format(Long.valueOf(j2)).substring(9, 15);
    }

    public static boolean b(Context context) {
        if (context != null) {
            return GooglePlayServicesUtil.isGooglePlayServicesAvailable(context) == 0;
        }
        LogUtil.j("Track_MapTrackingUtils", "isInstallGooglePlayServicesNoDialog context == null");
        return false;
    }

    public static int o(Context context) {
        if (context == null) {
            LogUtil.j("Track_MapTrackingUtils", "obtainPhoneState context == null");
            return 3;
        }
        if (Build.VERSION.SDK_INT >= 31 && !PermissionUtil.b(context, new String[]{"android.permission.READ_PHONE_STATE"})) {
            return 3;
        }
        Object systemService = context.getSystemService("phone");
        if (!(systemService instanceof TelephonyManager)) {
            LogUtil.a("Track_MapTrackingUtils", "object is not instanceof TelephonyManager");
            return 3;
        }
        int callState = ((TelephonyManager) systemService).getCallState();
        if (callState == 0) {
            return 0;
        }
        if (callState == 2) {
            return 1;
        }
        return callState == 1 ? 2 : 3;
    }

    public static int c(int i2) {
        return i2 / 1000;
    }

    public static String d(Context context, int i2) {
        if (context == null) {
            return "";
        }
        HwSportTypeInfo hwSportTypeInfoB = jry.a(context).b(i2);
        int iD = hwSportTypeInfoB != null ? jby.d(hwSportTypeInfoB.getSportTypeRes(), context) : 0;
        if (iD == 0) {
            return context.getResources().getString(R.string.IDS_start_track_sport_type_run);
        }
        return context.getResources().getString(iD);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:76:0x00e7  */
    private static String b(Context context, String str) {
        if (context == null) {
            return "";
        }
        str.hashCode();
        switch (str) {
            case "R008R":
                return context.getResources().getString(R.string.IDS_interval_zero);
            case "R009R":
                return context.getResources().getString(R.string.IDS_interval_primary);
            case "R010R":
                return context.getResources().getString(R.string.IDS_interval_advanced);
            case "R011R":
                return context.getResources().getString(R.string.IDS_interval_aerobic_primary);
            case "R012R":
                return context.getResources().getString(R.string.IDS_run_and_walk_primary);
            case "R013R":
                return context.getResources().getString(R.string.IDS_run_and_walk_advanced);
            case "R014R":
                return context.getResources().getString(R.string.IDS_easy_run);
            case "R015R":
                return context.getResources().getString(R.string.IDS_fat_burning_run_primary);
            case "R016R":
                return context.getResources().getString(R.string.IDS_fat_burning_run_advanced);
            case "R017R":
                return context.getResources().getString(R.string.IDS_burning_run_miit);
            case "R018R":
                return context.getResources().getString(R.string.IDS_aerobic_endurance_run);
            case "R019R":
                return context.getResources().getString(R.string.IDS_long_slow_distance_run);
            case "R020R":
                return context.getResources().getString(R.string.IDS_maf_primary);
            case "R021R":
                return context.getResources().getString(R.string.IDS_maf_advanced);
            case "R022R":
                return context.getResources().getString(R.string.IDS_cruise_interval_run);
            case "R023R":
                return context.getResources().getString(R.string.IDS_tempo_run);
            case "R024R":
                return context.getResources().getString(R.string.IDS_hiit_run);
            default:
                return "";
        }
    }

    public static String d(Context context, String str, String str2) {
        String strB;
        if (context == null) {
            return "";
        }
        if (TextUtils.isEmpty(str)) {
            strB = "";
        } else {
            strB = b(context, str);
        }
        return strB.equals("") ? str2 : strB;
    }

    public static boolean a(MotionPathSimplify motionPathSimplify) {
        String str;
        if (motionPathSimplify == null || motionPathSimplify.requestExtendDataMap() == null || motionPathSimplify.requestSportType() != 258) {
            return false;
        }
        Map<String, String> mapRequestExtendDataMap = motionPathSimplify.requestExtendDataMap();
        if (!mapRequestExtendDataMap.containsKey(HwExerciseConstants.JSON_NAME_RECORD_FLAG)) {
            str = "";
        } else {
            str = mapRequestExtendDataMap.get(HwExerciseConstants.JSON_NAME_RECORD_FLAG);
        }
        if (!TextUtils.isEmpty(str) && "7".equals(str)) {
            LogUtil.a("Track_MapTrackingUtils", "isLacticAcidData");
            return true;
        }
        return false;
    }

    public static String b(MotionPathSimplify motionPathSimplify) {
        if (motionPathSimplify == null) {
            return "";
        }
        return a(motionPathSimplify.requestExtendDataMap());
    }

    public static String a(Map<String, String> map) {
        if (map == null) {
            return "";
        }
        Context context = BaseApplication.getContext();
        if (!LanguageUtil.f(context)) {
            return "";
        }
        if (LanguageUtil.l(context) && map.containsKey("expNameCN")) {
            return map.get("expNameCN");
        }
        if (!map.containsKey("expNameHK")) {
            return "";
        }
        return map.get("expNameHK");
    }

    public static String b(Map<String, String> map) {
        Context context = BaseApplication.getContext();
        String strD = d(context, 222);
        if (map == null) {
            return strD;
        }
        String strA = a(map);
        if (map.containsKey("alias")) {
            return map.get("alias");
        }
        if (!TextUtils.isEmpty(strA)) {
            return String.format(context.getString(R.string.IDS_sport_history_run_course_name), strD, strA);
        }
        return d(context, 222);
    }

    public static final boolean d(MotionPathSimplify motionPathSimplify) {
        Map<String, Integer> mapRequestSportData;
        if (motionPathSimplify == null || (mapRequestSportData = motionPathSimplify.requestSportData()) == null) {
            return false;
        }
        int iRequestSportType = motionPathSimplify.requestSportType();
        return (iRequestSportType == 262 || iRequestSportType == 266) && mapRequestSportData.get(HwExerciseConstants.JSON_NAME_SWIM_POOL_LENGTH) == null && mapRequestSportData.get(HwExerciseConstants.JSON_NAME_SWIM_PULL_TIMES) == null;
    }

    private static boolean y(Context context) {
        ApplicationInfo applicationInfo;
        if (context == null || Utils.o()) {
            return false;
        }
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(izw.p, 128);
        } catch (PackageManager.NameNotFoundException e2) {
            LogUtil.e("Track_MapTrackingUtils", LogAnonymous.b(e2));
            applicationInfo = null;
        } catch (RuntimeException e3) {
            LogUtil.e("Track_MapTrackingUtils", LogAnonymous.b(e3));
            applicationInfo = null;
        }
        if (applicationInfo == null || applicationInfo.metaData == null) {
            return false;
        }
        return applicationInfo.metaData.getBoolean("app-meta-ex-api-support-health");
    }

    private static boolean r(Context context) {
        int i2;
        if (!h) {
            try {
                Uri uri = Uri.parse("content://com.android.mediacenter.healthprovider");
                LogUtil.a("Track_MapTrackingUtils", "enter healthprovider");
                Bundle bundleCall = context.getContentResolver().call(uri, "supportFlag", (String) null, new Bundle());
                if (bundleCall != null) {
                    LogUtil.a("Track_MapTrackingUtils", "supportFlag Value ", Integer.valueOf(bundleCall.getInt("supportFlag")));
                    i2 = bundleCall.getInt("supportFlag");
                } else {
                    i2 = 0;
                }
            } catch (Exception e2) {
                LogUtil.e("Track_MapTrackingUtils", "isSupportSportMusicInControlVersion", LogAnonymous.b(e2));
            }
            h = true;
            i = i2 == 1;
        }
        return i;
    }

    public static void c(String str) {
        if (TextUtils.isEmpty(l) || !l.equals(str)) {
            l = str;
            h = false;
        }
    }

    private static boolean t(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(izw.p, 128);
            try {
                return applicationInfo.metaData != null && applicationInfo.metaData.getInt("supportHealthRun") == 1;
            } catch (NumberFormatException e2) {
                LogUtil.e("Track_MapTrackingUtils", LogAnonymous.b(e2));
            }
        } catch (PackageManager.NameNotFoundException e3) {
            LogUtil.e("Track_MapTrackingUtils", LogAnonymous.b(e3));
        } catch (Exception unused) {
            LogUtil.e("Track_MapTrackingUtils", "Dead System Exception is happened catch it ");
        }
    }

    public static final boolean f(Context context) {
        if (context == null) {
            return false;
        }
        if (!izn.e()) {
            ReleaseLogUtil.d("Track_MapTrackingUtils", "isSupportSportMusic not isSupportMusicPresetHealthApp()");
            return false;
        }
        if (t(context)) {
            if (Utils.o()) {
                return r(context);
            }
            return true;
        }
        return y(context);
    }

    public static final boolean c(Context context) {
        if (j != null) {
            return j.booleanValue();
        }
        if (context == null) {
            j = false;
            return j.booleanValue();
        }
        if (!izn.e()) {
            ReleaseLogUtil.d("Track_MapTrackingUtils", "isSupportMusicControl not isSupportMusicPresetHealthApp()");
            j = false;
            return j.booleanValue();
        }
        if (t(context)) {
            if (Utils.o()) {
                j = Boolean.valueOf(r(context));
                return j.booleanValue();
            }
            j = true;
            return j.booleanValue();
        }
        j = false;
        return j.booleanValue();
    }

    public static boolean e() {
        if (f38275a != null) {
            return f38275a.booleanValue();
        }
        boolean z = true;
        if (jaq.a(BaseApplication.getContext()) != 1 && !f(com.huawei.haf.application.BaseApplication.b())) {
            z = false;
        }
        f38275a = Boolean.valueOf(z);
        return f38275a.booleanValue();
    }

    public static String b(Resources resources, int i2) {
        if (resources == null) {
            return "";
        }
        if (i2 == 1) {
            return resources.getString(R.string.IDS_hwh_motiontrack_breaststroke);
        }
        if (i2 == 2) {
            return resources.getString(R.string.IDS_hwh_motiontrack_freestyle);
        }
        if (i2 == 3) {
            return resources.getString(R.string.IDS_hwh_motiontrack_butterfly_stroke);
        }
        if (i2 == 4) {
            return resources.getString(R.string.IDS_hwh_motiontrack_backstroke);
        }
        if (i2 == 5) {
            return resources.getString(R.string.IDS_hwh_motiontrack_medley);
        }
        return resources.getString(R.string.IDS_hwh_motiontrack_freestyle);
    }

    public static MotionPath c(Map<Long, double[]> map, ArrayList<StepRateData> arrayList, Map<Integer, Float> map2, Map<Integer, Float> map3, ArrayList<njm> arrayList2, List<njj> list, List<njj> list2) {
        TreeMap treeMap = new TreeMap();
        if (map != null && map.size() > 0) {
            synchronized (iwy.f38154b) {
                for (Map.Entry<Long, double[]> entry : map.entrySet()) {
                    treeMap.put(entry.getKey(), entry.getValue());
                }
            }
        }
        MotionPath motionPath = new MotionPath();
        motionPath.saveLbsDataMap(treeMap);
        motionPath.savePaceMap(map2);
        motionPath.saveBritishPaceMap(map3);
        motionPath.savePaceV2(list);
        motionPath.saveBriPacesV2(list2);
        motionPath.saveStepRateList(arrayList);
        motionPath.saveAltitudeList(arrayList2);
        return motionPath;
    }

    public static boolean i() {
        if (BaseApplication.getContext() != null) {
            e(GRSManager.c(BaseApplication.getContext()).getMccCountryCode());
        }
        return o;
    }

    private static void e(String str) {
        l();
        if (m.size() == 0) {
            return;
        }
        o = m.contains(str);
    }

    private static void l() {
        try {
            JSONArray jSONArray = new JSONArray(SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(20002), "hms_forbidden_key"));
            ArrayList arrayList = new ArrayList(jSONArray.length());
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                arrayList.add(jSONArray.getString(i2));
            }
            m = arrayList;
        } catch (JSONException e2) {
            LogUtil.e("Track_MapTrackingUtils", "setHmsForbiddenCountry:", LogAnonymous.b(e2));
        }
    }

    public static int b(AudioManager audioManager) {
        if (audioManager == null) {
            return 0;
        }
        return audioManager.requestAudioFocus(null, 3, 3);
    }

    public static int e(AudioManager audioManager) {
        if (audioManager == null) {
            return 0;
        }
        return audioManager.abandonAudioFocus(null);
    }

    public static boolean d(int i2) {
        return i2 == 283 || SportSupportUtil.e(i2) || i2 == 700001;
    }

    public static boolean o() {
        int i2 = g;
        return (i2 == 0 && f38276b == 2) || i2 == 2;
    }
}
