package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;

/* JADX INFO: loaded from: classes10.dex */
public class jaq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private StorageParams f38309a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f38310c;
    private String e;

    public jaq(Context context, StorageParams storageParams, String str) {
        this.f38310c = context;
        this.f38309a = storageParams;
        this.e = str;
    }

    public static int c() {
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(20002), "voice_enable_type");
        if (TextUtils.isEmpty(strE)) {
            SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(20002), "voice_enable_type", "1", new StorageParams());
            return 1;
        }
        try {
            return Integer.parseInt(strE);
        } catch (NumberFormatException unused) {
            LogUtil.j("Track_TrackSharedPreferenceUtil", "getVoiceEnable ", 1);
            return 1;
        }
    }

    public static void e(int i) {
        SharedPreferenceManager.e(com.huawei.haf.application.BaseApplication.b(), Integer.toString(20002), "voice_enable_type", Integer.toString(i), new StorageParams());
    }

    public static boolean e() {
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(20002), "iscrash");
        if (TextUtils.isEmpty(strE)) {
            LogUtil.j("Track_TrackSharedPreferenceUtil", "isTrackCrash TRACK_CRASH_KEY is null!");
            SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(20002), "iscrash", "false", new StorageParams());
            return false;
        }
        return "true".equals(strE);
    }

    public static void c(boolean z) {
        SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(20002), "iscrash", String.valueOf(z), new StorageParams());
    }

    public String y() {
        Context context = this.f38310c;
        if (context == null) {
            LogUtil.a("Track_TrackSharedPreferenceUtil", "getLogOffset ", "mContext is null");
            return null;
        }
        return SharedPreferenceManager.e(context, this.e, "logoffset");
    }

    public void i(String str) {
        Context context = this.f38310c;
        if (context == null) {
            LogUtil.a("Track_TrackSharedPreferenceUtil", "setLogOffset ", "mContext is null");
        } else {
            SharedPreferenceManager.e(context, this.e, "logoffset", str, this.f38309a);
        }
    }

    public void e(long j) {
        if (this.f38310c == null) {
            LogUtil.a("Track_TrackSharedPreferenceUtil", "setLastSportStartElapsedTime mContext is null");
        } else {
            SharedPreferenceManager.e(this.f38310c, this.e, "LastSportStartElapsedTime", Long.toString(j), this.f38309a);
        }
    }

    public int x() {
        Context context = this.f38310c;
        if (context == null) {
            LogUtil.a("Track_TrackSharedPreferenceUtil", "getMapType mContext is null");
            return 0;
        }
        String strE = SharedPreferenceManager.e(context, this.e, "map_type_setting_key");
        if (TextUtils.isEmpty(strE)) {
            return 0;
        }
        try {
            return Integer.parseInt(strE);
        } catch (NumberFormatException e) {
            LogUtil.j("Track_TrackSharedPreferenceUtil", "getMapType ", e.getMessage());
            return 0;
        }
    }

    public int h() {
        Context context = this.f38310c;
        if (context == null) {
            LogUtil.a("Track_TrackSharedPreferenceUtil", "getAutoMapType mContext is null");
            return -1;
        }
        String strE = SharedPreferenceManager.e(context, this.e, "auto_map_setting");
        if (TextUtils.isEmpty(strE)) {
            return -1;
        }
        try {
            return Integer.parseInt(strE);
        } catch (NumberFormatException e) {
            LogUtil.j("Track_TrackSharedPreferenceUtil", "getAutoMapType ", e.getMessage());
            return -1;
        }
    }

    public int l() {
        Context context = this.f38310c;
        if (context == null) {
            LogUtil.a("Track_TrackSharedPreferenceUtil", "getAutoTrackMapType mContext is null");
            return -1;
        }
        String strE = SharedPreferenceManager.e(context, this.e, "auto_track_map_setting");
        if (TextUtils.isEmpty(strE)) {
            return -1;
        }
        try {
            return Integer.parseInt(strE);
        } catch (NumberFormatException e) {
            LogUtil.j("Track_TrackSharedPreferenceUtil", "getAutoTrackMapType ", e.getMessage());
            return -1;
        }
    }

    public long n() {
        Context context = this.f38310c;
        if (context == null) {
            LogUtil.a("Track_TrackSharedPreferenceUtil", "getDiffTimeBetweenGpsAndSystem mContext is null");
            return 0L;
        }
        String strE = SharedPreferenceManager.e(context, this.e, "diffTimeBetweenGpsAndSystem");
        if (TextUtils.isEmpty(strE)) {
            SharedPreferenceManager.e(this.f38310c, this.e, "diffTimeBetweenGpsAndSystem", "0", this.f38309a);
            return 0L;
        }
        try {
            return Long.parseLong(strE);
        } catch (NumberFormatException e) {
            LogUtil.a("Track_TrackSharedPreferenceUtil", "numberFormatException", e.getMessage());
            return 0L;
        }
    }

    public void b(long j) {
        if (this.f38310c == null) {
            LogUtil.a("Track_TrackSharedPreferenceUtil", "setDiffTimeBetweenGpsAndSystem ", "mContext is null");
        } else {
            SharedPreferenceManager.e(this.f38310c, this.e, "diffTimeBetweenGpsAndSystem", Long.toString(j), this.f38309a);
        }
    }

    public int j() {
        Context context = this.f38310c;
        if (context == null) {
            LogUtil.a("Track_TrackSharedPreferenceUtil", "acquireVoiceIntervalSettingType ", "mContext is null");
            return 0;
        }
        String strE = SharedPreferenceManager.e(context, this.e, "voice_broadcast_interval_type");
        if (!TextUtils.isEmpty(strE)) {
            try {
                return Integer.parseInt(strE);
            } catch (NumberFormatException e) {
                LogUtil.j("Track_TrackSharedPreferenceUtil", "acquireVoiceIntervalSettingType ", e.getMessage());
                return 0;
            }
        }
        LogUtil.j("Track_TrackSharedPreferenceUtil", "acquireVoiceIntervalSettingType you should set it before get");
        return 0;
    }

    public int i() {
        Context context = this.f38310c;
        if (context == null) {
            LogUtil.a("Track_TrackSharedPreferenceUtil", "acquireVoiceTimeIntervalValue ", "mContext is null");
            return 0;
        }
        String strE = SharedPreferenceManager.e(context, this.e, "voice_broadcast_time_interval_value");
        if (!TextUtils.isEmpty(strE)) {
            try {
                return Integer.parseInt(strE);
            } catch (NumberFormatException e) {
                LogUtil.j("Track_TrackSharedPreferenceUtil", "acquireVoiceTimeIntervalValue ", e.getMessage());
                return 0;
            }
        }
        LogUtil.j("Track_TrackSharedPreferenceUtil", "acquireVoiceTimeIntervalValue you should set it before get");
        return 0;
    }

    public int f() {
        Context context = this.f38310c;
        if (context == null) {
            LogUtil.a("Track_TrackSharedPreferenceUtil", "acquireVoiceDistanceIntervalValue ", "mContext is null");
            return 0;
        }
        String strE = SharedPreferenceManager.e(context, this.e, "voice_broadcast_distance_interval_value");
        if (!TextUtils.isEmpty(strE)) {
            try {
                return Integer.parseInt(strE);
            } catch (NumberFormatException e) {
                LogUtil.j("Track_TrackSharedPreferenceUtil", "acquireVoiceDistanceIntervalValue ", e.getMessage());
                return 0;
            }
        }
        LogUtil.j("Track_TrackSharedPreferenceUtil", "acquireVoiceDistanceIntervalValue you should set it before get");
        return 0;
    }

    public void d(long j) {
        if (this.f38310c == null) {
            LogUtil.a("Track_TrackSharedPreferenceUtil", "saveOnceDiffTime mContext is null");
        } else {
            SharedPreferenceManager.e(this.f38310c, this.e, "diffTimeOnce", Long.toString(j), this.f38309a);
        }
    }

    public long g() {
        Context context = this.f38310c;
        if (context == null) {
            LogUtil.a("Track_TrackSharedPreferenceUtil", "acquireOnceDiffTime ", "mContext is null");
            return 0L;
        }
        String strE = SharedPreferenceManager.e(context, this.e, "diffTimeOnce");
        if (TextUtils.isEmpty(strE)) {
            SharedPreferenceManager.e(this.f38310c, this.e, "diffTimeOnce", "0", this.f38309a);
            return 0L;
        }
        try {
            return Long.parseLong(strE);
        } catch (NumberFormatException e) {
            LogUtil.a("Track_TrackSharedPreferenceUtil", "acquireOnceDiffTime ", e.getMessage());
            return 0L;
        }
    }

    public String d(String str) {
        Context context = this.f38310c;
        if (context == null) {
            LogUtil.a("Track_TrackSharedPreferenceUtil", "acquireCalibrationData ", "mContext is null");
            return null;
        }
        return SharedPreferenceManager.e(context, this.e, str);
    }

    public void e(String str, String str2) {
        Context context = this.f38310c;
        if (context == null) {
            LogUtil.a("Track_TrackSharedPreferenceUtil", "saveCalibrationData ", "mContext is null");
        } else {
            SharedPreferenceManager.e(context, this.e, str, str2, this.f38309a);
        }
    }

    public static boolean c(Context context) {
        if (context == null) {
            LogUtil.a("Track_TrackSharedPreferenceUtil", "acquireAutoPauseEnableStatus ", "mContext is null");
            return false;
        }
        String strE = SharedPreferenceManager.e(context, Integer.toString(20002), "auto_pause_enable_status");
        if (TextUtils.isEmpty(strE)) {
            LogUtil.j("Track_TrackSharedPreferenceUtil", "acquireAutoPauseEnableStatus you should set it before get");
            return false;
        }
        return Boolean.parseBoolean(strE);
    }

    public static void b(Context context, boolean z) {
        SharedPreferenceManager.e(context, Integer.toString(20002), "auto_pause_enable_status", String.valueOf(z), new StorageParams());
    }

    public static boolean b() {
        return CommonUtil.au() || CommonUtil.bd();
    }

    public static int a(Context context) {
        if (context == null) {
            LogUtil.j("Track_TrackSharedPreferenceUtil", "acquireListenerType context is null");
            return 0;
        }
        String strE = SharedPreferenceManager.e(context, Integer.toString(20002), "sport_listen_type");
        if (TextUtils.isEmpty(strE)) {
            LogUtil.j("Track_TrackSharedPreferenceUtil", "acquireListenerType you should set it before get");
            return 0;
        }
        try {
            return Integer.parseInt(strE);
        } catch (NumberFormatException e) {
            LogUtil.j("Track_TrackSharedPreferenceUtil", "acquireSportListenerType ", e.getMessage());
            return 0;
        }
    }

    public boolean aa() {
        if (this.f38310c == null) {
            LogUtil.a("Track_TrackSharedPreferenceUtil", "isChartHorizontalHasShown ", "mContext is null");
            return false;
        }
        LogUtil.d("Track_TrackSharedPreferenceUtil", "isChartHorizontalHasShown ", this.e, " ", "track_horizontal_chart_tips_shown");
        String strE = SharedPreferenceManager.e(this.f38310c, this.e, "track_horizontal_chart_tips_shown");
        if (!TextUtils.isEmpty(strE)) {
            boolean z = Boolean.parseBoolean(strE);
            LogUtil.a("Track_TrackSharedPreferenceUtil", "isChartHorizontalHasShown bFlag:", Boolean.valueOf(z));
            return z;
        }
        LogUtil.a("Track_TrackSharedPreferenceUtil", "isChartHorizontalHasShown return default");
        return false;
    }

    public void a(boolean z) {
        if (this.f38310c == null) {
            LogUtil.a("Track_TrackSharedPreferenceUtil", "saveChartHorizontalHasShown ", "mContext is null");
            return;
        }
        LogUtil.a("Track_TrackSharedPreferenceUtil", "saveChartHorizontalHasShown bFlag:", Boolean.valueOf(z));
        LogUtil.d("Track_TrackSharedPreferenceUtil", "saveChartHorizontalHasShown ", this.e, " ", "track_horizontal_chart_tips_shown");
        SharedPreferenceManager.e(this.f38310c, this.e, "track_horizontal_chart_tips_shown", Boolean.toString(z), this.f38309a);
    }

    public boolean ac() {
        Context context = this.f38310c;
        if (context == null) {
            LogUtil.a("Track_TrackSharedPreferenceUtil", "isSecurityNoMoreRemind mContext is null");
            return false;
        }
        String strE = SharedPreferenceManager.e(context, this.e, "security_no_more_remind");
        LogUtil.a("Track_TrackSharedPreferenceUtil", "isSecurityNoMoreRemind ", strE);
        if (TextUtils.isEmpty(strE)) {
            return false;
        }
        return "true".equals(strE);
    }

    public void b(int i, int i2) {
        Context context = this.f38310c;
        if (context == null) {
            LogUtil.a("Track_TrackSharedPreferenceUtil", "setMusicOperatorType ", "mContext is null");
            return;
        }
        LogUtil.a("Track_TrackSharedPreferenceUtil", "setMusicOperatorType result ", Integer.valueOf(SharedPreferenceManager.e(context, this.e, "sport_music_operator_type" + i2, Integer.toString(i), this.f38309a)));
    }

    public int h(int i) {
        Context context = this.f38310c;
        if (context != null) {
            String strE = SharedPreferenceManager.e(context, this.e, "sport_music_operator_type" + i);
            LogUtil.a("Track_TrackSharedPreferenceUtil", "operatorTypeString ", strE);
            if (!TextUtils.isEmpty(strE)) {
                try {
                    return Integer.parseInt(strE);
                } catch (NumberFormatException e) {
                    LogUtil.j("Track_TrackSharedPreferenceUtil", "getSportMusicOperatorType ", e.getMessage());
                    return 0;
                }
            }
            LogUtil.j("Track_TrackSharedPreferenceUtil", "getSportMusicOperatorType you should set it before get");
            return 0;
        }
        LogUtil.j("Track_TrackSharedPreferenceUtil", "getSportMusicOperatorType context is null");
        return 0;
    }

    public void b(String str, int i) {
        Context context = this.f38310c;
        if (context == null) {
            LogUtil.a("Track_TrackSharedPreferenceUtil", "setSportMusicContentId ", "mContext is null");
            return;
        }
        SharedPreferenceManager.e(context, this.e, "sport_music_content_id" + i, str, this.f38309a);
    }

    public String a(int i) {
        Context context = this.f38310c;
        if (context == null) {
            return null;
        }
        return SharedPreferenceManager.e(context, this.e, "sport_music_content_id" + i);
    }

    public void c(String str, int i) {
        LogUtil.a("Track_TrackSharedPreferenceUtil", "setSportMusicContentType ", "contentType ", str);
        Context context = this.f38310c;
        if (context == null) {
            LogUtil.a("Track_TrackSharedPreferenceUtil", "setSportMusicContentId ", "mContext is null");
            return;
        }
        SharedPreferenceManager.e(context, this.e, "sport_music_content_type" + i, str, this.f38309a);
    }

    public String b(int i) {
        Context context = this.f38310c;
        if (context != null) {
            return SharedPreferenceManager.e(context, this.e, "sport_music_content_type" + i);
        }
        LogUtil.j("Track_TrackSharedPreferenceUtil", "getSportMusicContentType ", "mContext is null");
        return null;
    }

    public void d(String str, int i) {
        Context context = this.f38310c;
        if (context == null) {
            LogUtil.a("Track_TrackSharedPreferenceUtil", "setSportMusicContentId ", "mContext is null");
            return;
        }
        SharedPreferenceManager.e(context, this.e, "sport_music_content_element" + i, str, this.f38309a);
    }

    public String d(int i) {
        Context context = this.f38310c;
        if (context == null) {
            return null;
        }
        return SharedPreferenceManager.e(context, this.e, "sport_music_content_element" + i);
    }

    public void e(String str) {
        SharedPreferenceManager.e(this.f38310c, this.e, "music_information", str, this.f38309a);
    }

    public String o() {
        Context context = this.f38310c;
        if (context != null) {
            return SharedPreferenceManager.e(context, this.e, "music_information");
        }
        return null;
    }

    public void h(String str) {
        SharedPreferenceManager.e(this.f38310c, this.e, "dynamic_resource_version", str, this.f38309a);
    }

    public String q() {
        Context context = this.f38310c;
        if (context != null) {
            return SharedPreferenceManager.e(context, this.e, "dynamic_resource_version");
        }
        return null;
    }

    public void b(String str) {
        SharedPreferenceManager.e(this.f38310c, this.e, "dynamic_music_path", str, this.f38309a);
    }

    public String m() {
        Context context = this.f38310c;
        if (context != null) {
            return SharedPreferenceManager.e(context, this.e, "dynamic_music_path");
        }
        return null;
    }

    public void e(String str, int i) {
        String strE = jho.e(i);
        if (TextUtils.isEmpty(strE)) {
            LogUtil.e("Track_TrackSharedPreferenceUtil", "setDynamicCustomMapInformation storageKey is null.");
        } else {
            SharedPreferenceManager.e(this.f38310c, this.e, strE, str, this.f38309a);
        }
    }

    public String c(int i) {
        if (this.f38310c == null || TextUtils.isEmpty(jho.e(i))) {
            return null;
        }
        return SharedPreferenceManager.e(this.f38310c, this.e, jho.e(i));
    }

    public void c(String str) {
        SharedPreferenceManager.e(this.f38310c, this.e, "new_custom_mark_information", str, this.f38309a);
    }

    public String r() {
        Context context = this.f38310c;
        if (context != null) {
            return SharedPreferenceManager.e(context, this.e, "new_custom_mark_information");
        }
        return null;
    }

    public void g(String str) {
        SharedPreferenceManager.e(this.f38310c, this.e, "dynamic_map_resource_version", str, this.f38309a);
    }

    public String p() {
        Context context = this.f38310c;
        if (context != null) {
            return SharedPreferenceManager.e(context, this.e, "dynamic_map_resource_version");
        }
        return null;
    }

    public String s() {
        Context context = this.f38310c;
        if (context != null) {
            return SharedPreferenceManager.e(context, this.e, "dynamic_map_gaode_sdk_style_version");
        }
        return "";
    }

    public void f(String str) {
        SharedPreferenceManager.e(this.f38310c, this.e, "dynamic_map_gaode_sdk_style_version", str, this.f38309a);
    }

    public void l(String str) {
        SharedPreferenceManager.e(this.f38310c, this.e, "current_connected_foot_bolt", str, this.f38309a);
    }

    public String u() {
        Context context = this.f38310c;
        if (context != null) {
            return SharedPreferenceManager.e(context, this.e, "current_connected_foot_bolt");
        }
        return "";
    }

    public void n(String str) {
        SharedPreferenceManager.e(this.f38310c, this.e, "current_connected_waist_bolt", str, this.f38309a);
    }

    public String z() {
        Context context = this.f38310c;
        if (context != null) {
            return SharedPreferenceManager.e(context, this.e, "current_connected_waist_bolt");
        }
        return "";
    }

    public void m(String str) {
        SharedPreferenceManager.e(this.f38310c, this.e, "current_connected_bike_bolt", str, this.f38309a);
    }

    public String w() {
        Context context = this.f38310c;
        if (context != null) {
            return SharedPreferenceManager.e(context, this.e, "current_connected_bike_bolt");
        }
        return "";
    }

    public void j(String str) {
        SharedPreferenceManager.e(this.f38310c, this.e, "current_preemption_bolt", str, this.f38309a);
    }

    public void a(String str) {
        Context context = this.f38310c;
        if (context != null) {
            SharedPreferenceManager.e(context, this.e, "run_connect_bolt_tip_show", str, null);
        }
    }

    public String k() {
        Context context = this.f38310c;
        if (context != null) {
            return SharedPreferenceManager.e(context, this.e, "run_connect_bolt_tip_show");
        }
        return "";
    }

    public String v() {
        Context context = this.f38310c;
        if (context != null) {
            return SharedPreferenceManager.e(context, this.e, "current_preemption_bolt");
        }
        return "";
    }

    public boolean t() {
        return SharedPreferenceManager.b(this.e, "first_skip_tag", true);
    }

    public void b(boolean z) {
        SharedPreferenceManager.a(this.e, "first_skip_tag", z);
    }

    public boolean ab() {
        return SharedPreferenceManager.b(this.e, "is_s_r_p_tag", true);
    }

    public void e(boolean z) {
        SharedPreferenceManager.a(this.e, "is_s_r_p_tag", z);
    }

    public static boolean a() {
        if (c() == 0) {
            LogUtil.a("Track_TrackSharedPreferenceUtil", "getVoiceEnable() is false");
            return false;
        }
        LogUtil.a("Track_TrackSharedPreferenceUtil", "getVoiceEnable() is true ");
        return true;
    }

    public static void d(boolean z) {
        LogUtil.a("Track_TrackSharedPreferenceUtil", "setVoiceEnable() ", Boolean.valueOf(z));
        if (z) {
            e(1);
        } else {
            e(0);
        }
    }

    public static boolean d() {
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(20002), "voice_rope_skpping");
        return TextUtils.isEmpty(strE) || CommonUtil.j(strE) == 1;
    }
}
