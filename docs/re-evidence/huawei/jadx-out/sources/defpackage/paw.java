package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import com.alipay.sdk.m.s.e;
import com.huawei.hms.mlsdk.asr.MLAsrConstants;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.R;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import com.huawei.pluginachievement.manager.model.SingleDayRecord;
import com.huawei.pluginachievement.ui.model.BestAchievementBasic;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import health.compact.a.CommonUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.UnitUtil;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class paw {
    public static int a(double d, double d2) {
        double d3 = d - d2;
        if (d3 <= -1.0d) {
            return -1;
        }
        return d3 >= 1.0d ? 1 : 0;
    }

    public static int b(double d, double d2) {
        double d3 = d - d2;
        if (d3 < -0.001d) {
            return -1;
        }
        return d3 > 0.001d ? 1 : 0;
    }

    public static boolean b(int i) {
        return i == 11;
    }

    public static boolean c(int i) {
        return i == 1 || i == 3 || i == 10;
    }

    public static boolean f(int i) {
        return i == 2;
    }

    public static boolean h(int i) {
        return i == 12 || i == 13 || i == 14 || i == 15;
    }

    public static boolean i(int i) {
        return i < 4 || i > 9;
    }

    public static boolean j(int i) {
        return i == 16;
    }

    public static boolean c(String[] strArr, String str) {
        return (strArr == null || str == null || !Arrays.asList(strArr).contains(str)) ? false : true;
    }

    public static void a(Context context) {
        LogUtil.a("PLGACHIEVE_ReportUtil", "showNetworkErrorDialog()");
        if (context == null) {
            LogUtil.a("PLGACHIEVE_ReportUtil", "showNetworkErrorDialog() context is null");
            return;
        }
        CustomTextAlertDialog.Builder builder = new CustomTextAlertDialog.Builder(context);
        builder.a(R.string.IDS_plugin_achievement_network_error_msg_title).b(R.string.IDS_plugin_achievement_network_error_msg_content_2).a(R.string.IDS_plugin_achievement_network_error_msg_btn, new View.OnClickListener() { // from class: paw.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        });
        CustomTextAlertDialog customTextAlertDialogB = builder.b();
        customTextAlertDialogB.setCancelable(true);
        customTextAlertDialogB.show();
    }

    public static boolean c() {
        return MLAsrConstants.LAN_ZH.equalsIgnoreCase(BaseApplication.getContext().getResources().getConfiguration().locale.getLanguage()) && "CN".equalsIgnoreCase(BaseApplication.getContext().getResources().getConfiguration().locale.getCountry());
    }

    public static ozm c(String str) {
        JSONException e;
        LogUtil.a("PLGACHIEVE_ReportUtil", "Enter parseBestMotion");
        ozm ozmVar = null;
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                if (jSONArray.length() != 0) {
                    ozm ozmVar2 = new ozm();
                    long j = 0;
                    for (int i = 0; i < jSONArray.length(); i++) {
                        try {
                            JSONObject jSONObject = jSONArray.getJSONObject(i);
                            long jE = osv.e("value", jSONObject);
                            long jE2 = osv.e("startTime", jSONObject);
                            int iA = osv.a("source", jSONObject);
                            if (jE > j) {
                                ozmVar2.c(jE);
                                ozmVar2.d(jE2);
                                ozmVar2.b(iA);
                                j = jE;
                            }
                        } catch (JSONException e2) {
                            e = e2;
                            ozmVar = ozmVar2;
                            LogUtil.e("PLGACHIEVE_ReportUtil", "getStartTimeAndEndTime Exception:", e.getMessage());
                            return ozmVar;
                        }
                    }
                    return ozmVar2;
                }
            } catch (JSONException e3) {
                e = e3;
            }
        }
        return null;
    }

    public static ozn b(String str) {
        JSONException e;
        LogUtil.a("PLGACHIEVE_ReportUtil", "parseBestMotionPace bestMotionPace.");
        ozn oznVar = null;
        if (TextUtils.isEmpty(str)) {
            LogUtil.a("PLGACHIEVE_ReportUtil", "parseBestMotionPace reportData is null");
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() == 0) {
                return null;
            }
            ozn oznVar2 = new ozn();
            double d = 0.0d;
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    double d2 = osv.d("value", jSONObject);
                    long jE = osv.e("startTime", jSONObject);
                    if (d == 0.0d) {
                        oznVar2.c(d2);
                        oznVar2.a(jE);
                        d = d2;
                    }
                    if (b(d2, d) < 0) {
                        int iA = osv.a("source", jSONObject);
                        oznVar2.c(d2);
                        oznVar2.a(jE);
                        oznVar2.c(iA);
                        d = d2;
                    }
                } catch (JSONException e2) {
                    e = e2;
                    oznVar = oznVar2;
                }
            }
            return oznVar2;
        } catch (JSONException e3) {
            e = e3;
        }
        LogUtil.e("PLGACHIEVE_ReportUtil", "getStartTimeAndEndTime Exception:", e.getMessage());
        return oznVar;
    }

    public static ArrayList<ozn> a(String str, int i) {
        ArrayList<ozn> arrayList = new ArrayList<>(5);
        if (TextUtils.isEmpty(str)) {
            LogUtil.a("PLGACHIEVE_ReportUtil", "parseBestMotionPace reportData is null");
            return arrayList;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() != 0) {
                int length = jSONArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    ozn oznVar = new ozn();
                    JSONObject jSONObject = jSONArray.getJSONObject(i2);
                    double d = osv.d("value", jSONObject);
                    long jE = osv.e("startTime", jSONObject);
                    long jE2 = osv.e("endTime", jSONObject);
                    int iA = osv.a("source", jSONObject);
                    oznVar.c(d);
                    oznVar.a(jE);
                    oznVar.e(jE2);
                    oznVar.c(iA);
                    arrayList.add(oznVar);
                }
                b(arrayList);
                if (arrayList.size() > i) {
                    return e(arrayList, i);
                }
            }
        } catch (JSONException e) {
            LogUtil.e("PLGACHIEVE_ReportUtil", "getStartTimeAndEndTime Exception ", e.getMessage());
        }
        return arrayList;
    }

    public static ArrayList<ozm> b(String str, int i) {
        ArrayList<ozm> arrayList = new ArrayList<>(5);
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("PLGACHIEVE_ReportUtil", "parseMaxNMotion reportData is null");
            return arrayList;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() != 0) {
                int length = jSONArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    ozm ozmVar = new ozm();
                    JSONObject jSONObject = jSONArray.getJSONObject(i2);
                    long jE = osv.e("value", jSONObject);
                    long jE2 = osv.e("startTime", jSONObject);
                    long jE3 = osv.e("endTime", jSONObject);
                    int iA = osv.a("source", jSONObject);
                    ozmVar.c(jE);
                    ozmVar.d(jE2);
                    ozmVar.e(jE3);
                    ozmVar.b(iA);
                    arrayList.add(ozmVar);
                }
                a(arrayList);
                if (arrayList.size() > i) {
                    return e(arrayList, i);
                }
            }
        } catch (JSONException e) {
            LogUtil.e("PLGACHIEVE_ReportUtil", "getStartTimeAndEndTime Exception:", e.getMessage());
        }
        return arrayList;
    }

    private static ArrayList e(ArrayList arrayList, int i) {
        LogUtil.a("PLGACHIEVE_ReportUtil", "getMaxList N:", Integer.valueOf(i));
        ArrayList arrayList2 = new ArrayList(5);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList2.add(arrayList.get(i2));
        }
        return arrayList2;
    }

    public static void a(ArrayList arrayList) {
        if (arrayList == null) {
            return;
        }
        Collections.sort(arrayList, new Comparator<ozm>() { // from class: paw.3
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public int compare(ozm ozmVar, ozm ozmVar2) {
                if (ozmVar.c() - ozmVar2.c() < 0) {
                    return 1;
                }
                return ozmVar.c() - ozmVar2.c() == 0 ? 0 : -1;
            }
        });
    }

    public static void b(ArrayList arrayList) {
        if (arrayList == null) {
            return;
        }
        Collections.sort(arrayList, new Comparator<ozn>() { // from class: paw.2
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public int compare(ozn oznVar, ozn oznVar2) {
                return paw.b(oznVar.e(), oznVar2.e());
            }
        });
    }

    public static ozp h(String str) {
        JSONException e;
        ozp ozpVar = null;
        if (TextUtils.isEmpty(str)) {
            LogUtil.a("PLGACHIEVE_ReportUtil", "parseBestStep reportData is null");
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() == 0) {
                return null;
            }
            ozp ozpVar2 = new ozp();
            int i = 0;
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i2);
                    int iA = osv.a("value", jSONObject);
                    int iA2 = osv.a(ParsedFieldTag.RECORD_DAY, jSONObject);
                    if (iA > i) {
                        ozpVar2.d(iA);
                        ozpVar2.a(iA2);
                        i = iA;
                    }
                } catch (JSONException e2) {
                    e = e2;
                    ozpVar = ozpVar2;
                }
            }
            return ozpVar2;
        } catch (JSONException e3) {
            e = e3;
        }
        LogUtil.e("PLGACHIEVE_ReportUtil", "getStartTimeAndEndTime Exception:", e.getMessage());
        return ozpVar;
    }

    public static String e(String str, BestAchievementBasic bestAchievementBasic) {
        if (TextUtils.isEmpty(str) || bestAchievementBasic == null) {
            LogUtil.a("PLGACHIEVE_ReportUtil", "getRefreshJsonStr reportData/bestAchievementBasic is null");
            return "";
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            if (bestAchievementBasic instanceof ozp) {
                jSONArray.put(length, e((ozp) bestAchievementBasic));
            } else if (bestAchievementBasic instanceof ozm) {
                jSONArray.put(length, e((ozm) bestAchievementBasic));
            } else if (bestAchievementBasic instanceof ozn) {
                jSONArray.put(length, c((ozn) bestAchievementBasic));
            } else {
                LogUtil.j("PLGACHIEVE_ReportUtil", "bestAchievementBasic instance type error");
            }
            return jSONArray.toString();
        } catch (JSONException e) {
            LogUtil.e("PLGACHIEVE_ReportUtil", "getRefreshJsonStr Exception:", e.getMessage());
            return "";
        }
    }

    public static String c(String str, String str2, int i) {
        if (TextUtils.isEmpty(str2) || "[]".equals(str2)) {
            LogUtil.j("PLGACHIEVE_ReportUtil", "getMergedJsonStr: newData empty");
            return "";
        }
        LogUtil.a("PLGACHIEVE_ReportUtil", "getMergedJsonStr oldData ", str, " newData ", str2);
        try {
            JSONArray jSONArray = new JSONArray(str2);
            int length = jSONArray.length();
            if (g(i)) {
                ozn oznVarB = b(str);
                ozn oznVarB2 = b(str2);
                if (oznVarB != null && oznVarB2 != null && b(oznVarB.e(), 0.0d) != 0) {
                    if (oznVarB.c() != oznVarB2.c() && oznVarB.a() == 0 && b(oznVarB.e(), oznVarB2.e()) < 0) {
                        LogUtil.a("PLGACHIEVE_ReportUtil", "old pace");
                        jSONArray.put(length, a(oznVarB, oznVarB2));
                    }
                }
                return jSONArray.toString();
            }
            if (c(i) || h(i)) {
                ozm ozmVarC = c(str);
                ozm ozmVarC2 = c(str2);
                if (ozmVarC != null && ozmVarC2 != null) {
                    if (ozmVarC.d() != ozmVarC2.d() && ozmVarC.e() == 0 && b(ozmVarC.c(), ozmVarC2.c()) > 0) {
                        LogUtil.d("PLGACHIEVE_ReportUtil", "old value");
                        jSONArray.put(length, b(ozmVarC, ozmVarC2));
                    }
                }
                return jSONArray.toString();
            }
            LogUtil.d("PLGACHIEVE_ReportUtil", "getMergedJsonStr type error", Integer.valueOf(i));
            return jSONArray.toString();
        } catch (JSONException e) {
            LogUtil.e("PLGACHIEVE_ReportUtil", "getRefreshJsonStr Exception:", e.getMessage());
            return str2;
        }
    }

    private static JSONObject a(ozn oznVar, ozn oznVar2) {
        long jC = oznVar.c();
        long jCurrentTimeMillis = System.currentTimeMillis() - jC;
        LogUtil.a("PLGACHIEVE_ReportUtil", "getMergedJsonStr checkBestMotionPace startTime ", Long.valueOf(jC), " interval ", Long.valueOf(jCurrentTimeMillis));
        if (jCurrentTimeMillis > 2592000000L) {
            LogUtil.a("PLGACHIEVE_ReportUtil", "getMergedJsonStr new pace");
            return c(oznVar2);
        }
        return c(oznVar);
    }

    private static JSONObject b(ozm ozmVar, ozm ozmVar2) {
        long jD = ozmVar.d();
        long jCurrentTimeMillis = System.currentTimeMillis() - jD;
        LogUtil.a("PLGACHIEVE_ReportUtil", "getMergedJsonStr checkBestMotion startTime ", Long.valueOf(jD), " interval ", Long.valueOf(jCurrentTimeMillis));
        if (jCurrentTimeMillis > 2592000000L) {
            LogUtil.a("PLGACHIEVE_ReportUtil", "getMergedJsonStr new value");
            return e(ozmVar2);
        }
        return e(ozmVar);
    }

    private static JSONObject e(ozp ozpVar) {
        if (ozpVar == null) {
            LogUtil.j("PLGACHIEVE_ReportUtil", "getBestSteps: bestStep is null");
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("value", ozpVar.d());
            jSONObject.put(ParsedFieldTag.RECORD_DAY, ozpVar.a());
            return jSONObject;
        } catch (JSONException e) {
            LogUtil.e("PLGACHIEVE_ReportUtil", "JSONException ", e.getMessage());
            return null;
        }
    }

    public static JSONObject e(ozm ozmVar) {
        if (ozmVar == null) {
            LogUtil.j("PLGACHIEVE_ReportUtil", "getBestMotion: bestMotion is null");
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("value", ozmVar.c());
            jSONObject.put("source", ozmVar.e());
            jSONObject.put("deviceCode", ozmVar.b());
            jSONObject.put("startTime", ozmVar.d());
            jSONObject.put("endTime", ozmVar.a());
            return jSONObject;
        } catch (JSONException e) {
            LogUtil.e("PLGACHIEVE_ReportUtil", "JSONException ", e.getMessage());
            return null;
        }
    }

    public static JSONObject c(ozn oznVar) {
        if (oznVar == null) {
            LogUtil.j("PLGACHIEVE_ReportUtil", "getBestMotonPace: bestMotionPace is null");
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("value", oznVar.e());
            jSONObject.put("source", oznVar.a());
            jSONObject.put("deviceCode", oznVar.d());
            jSONObject.put("startTime", oznVar.c());
            jSONObject.put("endTime", oznVar.b());
            return jSONObject;
        } catch (JSONException e) {
            LogUtil.e("PLGACHIEVE_ReportUtil", "JSONException ", e.getMessage());
            return null;
        }
    }

    public static String d(JSONObject jSONObject) {
        JSONArray jSONArray = new JSONArray();
        try {
            jSONArray.put(0, jSONObject);
            return jSONArray.toString();
        } catch (JSONException e) {
            LogUtil.e("PLGACHIEVE_ReportUtil", "JSONException ", e.getMessage());
            return "";
        }
    }

    public static double b(float f) {
        try {
            return Double.parseDouble(String.valueOf(f));
        } catch (NumberFormatException e) {
            LogUtil.e("PLGACHIEVE_ReportUtil", "NumberFormatException ", e.getMessage());
            return 0.0d;
        }
    }

    public static String b(long j, String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("PLGACHIEVE_ReportUtil", "deleteTrackData reportData is null");
            return "";
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            boolean z = false;
            for (int i = 0; i < jSONArray.length(); i++) {
                if (j == osv.e("startTime", jSONArray.getJSONObject(i))) {
                    jSONArray.remove(i);
                    z = true;
                }
            }
            return (!z || jSONArray.length() == 0) ? "" : jSONArray.toString();
        } catch (JSONException e) {
            LogUtil.e("PLGACHIEVE_ReportUtil", "deleteTrackData Exception:", e.getMessage());
        }
        return "";
    }

    public static Pair<Double, Long> e(String str, long j, long j2, int i) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.a("PLGACHIEVE_ReportUtil", "parseBestStep reportData is null");
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (g(i)) {
                return b(jSONArray, j, j2);
            }
            if (i == 2) {
                return e(jSONArray, j, j2);
            }
            if (c(i)) {
                return c(jSONArray, j, j2);
            }
            return null;
        } catch (JSONException e) {
            LogUtil.e("PLGACHIEVE_ReportUtil", "getStartTimeAndEndTime Exception:", e.getMessage());
            return null;
        }
    }

    private static Pair<Double, Long> b(JSONArray jSONArray, long j, long j2) throws JSONException {
        if (jSONArray == null) {
            LogUtil.j("PLGACHIEVE_ReportUtil", "getPacePBRecord: jsonArray is null");
            return null;
        }
        long j3 = 0;
        double d = 0.0d;
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            double d2 = osv.d("value", jSONObject);
            long jE = osv.e("startTime", jSONObject);
            if (jE >= j && jE <= j2) {
                if (d == 0.0d) {
                    d = d2;
                    j3 = jE;
                }
                if (b(d2, d) < 0) {
                    d = d2;
                    j3 = jE;
                }
            }
        }
        if (d == 0.0d || j3 == 0) {
            return null;
        }
        LogUtil.d("PLGACHIEVE_ReportUtil", "showTypeIsPace");
        return new Pair<>(Double.valueOf(d), Long.valueOf(j3));
    }

    private static Pair<Double, Long> e(JSONArray jSONArray, long j, long j2) throws JSONException {
        if (jSONArray == null) {
            LogUtil.j("PLGACHIEVE_ReportUtil", "getWalkMostPBRecord: jsonArray is null");
            return null;
        }
        long j3 = 0;
        int i = 0;
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i2);
            int iA = osv.a("value", jSONObject);
            long jA = a(String.valueOf(osv.a(ParsedFieldTag.RECORD_DAY, jSONObject)));
            if (jA >= j && jA <= j2 && iA > i) {
                i = iA;
                j3 = jA;
            }
        }
        if (i == 0 || j3 == 0) {
            return null;
        }
        LogUtil.d("PLGACHIEVE_ReportUtil", "WALK_MOST_KEY");
        return new Pair<>(Double.valueOf(((double) i) * 1.0d), Long.valueOf(j3));
    }

    private static Pair<Double, Long> c(JSONArray jSONArray, long j, long j2) throws JSONException {
        if (jSONArray == null) {
            LogUtil.j("PLGACHIEVE_ReportUtil", "getDistancePBRecord: jsonArray is null");
            return null;
        }
        long j3 = 0;
        long j4 = 0;
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            long jE = osv.e("value", jSONObject);
            long jE2 = osv.e("startTime", jSONObject);
            if (jE2 >= j && jE2 <= j2 && jE > j3) {
                j3 = jE;
                j4 = jE2;
            }
        }
        if (j3 == 0 || j4 == 0) {
            return null;
        }
        LogUtil.d("PLGACHIEVE_ReportUtil", "RUN_DISTANCE_KEY");
        return new Pair<>(Double.valueOf(j3 * 1.0d), Long.valueOf(j4));
    }

    public static String b(int i, Context context) {
        if (context == null) {
            LogUtil.j("PLGACHIEVE_ReportUtil", "getBreakDescByType: context is null");
            return "";
        }
        switch (i) {
            case 1:
                return context.getString(R.string.IDS_plugin_achievement_report_walk_distance_record);
            case 2:
                return context.getString(R.string.IDS_plugin_achievement_report_single_day_most_steps);
            case 3:
                return context.getString(R.string.IDS_plugin_achievement_report_run_distance_record);
            case 4:
                return context.getString(R.string.IDS_plugin_achievement_report_single_day_best_run_match_speed);
            case 5:
                return String.format(Locale.ROOT, context.getString(R.string.IDS_plugin_achievement_report_3km_pace_record), 3);
            case 6:
                return String.format(Locale.ROOT, context.getString(R.string.IDS_plugin_achievement_report_3km_pace_record), 5);
            case 7:
                return String.format(Locale.ROOT, context.getString(R.string.IDS_plugin_achievement_report_3km_pace_record), 10);
            case 8:
                return context.getString(R.string.IDS_plugin_achievement_report_hm_pace_record);
            case 9:
                return context.getString(R.string.IDS_plugin_achievement_report_fm_pace_record);
            case 10:
                return context.getString(R.string.IDS_plugin_achievement_report_cycle_distance_record);
            case 11:
                return context.getString(R.string.IDS_plugin_achievement_report_cycle_speed_record);
            case 12:
                return com.huawei.haf.application.BaseApplication.b().getString(R.string.IDS_achieve_rope_sing_count_title);
            case 13:
                return com.huawei.haf.application.BaseApplication.b().getString(R.string.IDS_achieve_rope_con_count_title);
            case 14:
                return com.huawei.haf.application.BaseApplication.b().getString(R.string.IDS_achieve_rope_speed_title);
            case 15:
                return com.huawei.haf.application.BaseApplication.b().getString(R.string.IDS_achieve_rope_duration_title);
            default:
                return "";
        }
    }

    public static SingleDayRecord d(int i, SingleDayRecord singleDayRecord, String str) {
        if (singleDayRecord == null) {
            LogUtil.a("PLGACHIEVE_ReportUtil", "sRecord null");
            return singleDayRecord;
        }
        e(i, singleDayRecord, str);
        return singleDayRecord;
    }

    private static void e(int i, SingleDayRecord singleDayRecord, String str) {
        switch (i) {
            case 1:
                singleDayRecord.saveBestWalkDistance(str);
                break;
            case 2:
                singleDayRecord.saveBestStepDay(str);
                break;
            case 3:
                singleDayRecord.saveBestRunDistance(str);
                break;
            case 4:
                singleDayRecord.saveBestRunPace(str);
                break;
            case 5:
                singleDayRecord.saveBestRun3KMPace(str);
                break;
            case 6:
                singleDayRecord.saveBestRun5KMPace(str);
                break;
            case 7:
                singleDayRecord.saveBestRun10KMPace(str);
                break;
            case 8:
                singleDayRecord.saveBestRunHMPace(str);
                break;
            case 9:
                singleDayRecord.saveBestRunFMPace(str);
                break;
            case 10:
                singleDayRecord.saveBestCycleDistance(str);
                break;
            case 11:
                singleDayRecord.saveBestCycleSpeed(str);
                break;
            case 12:
                singleDayRecord.saveBestRopeSingCount(str);
                break;
            case 13:
                singleDayRecord.saveBestRopeContinuousCount(str);
                break;
            case 14:
                singleDayRecord.saveBestRopeSpeed(str);
                break;
            case 15:
                singleDayRecord.saveBestRopeDuration(str);
                break;
        }
    }

    public static String a(int i, SingleDayRecord singleDayRecord) {
        if (singleDayRecord == null) {
            LogUtil.a("PLGACHIEVE_ReportUtil", "sRecord null");
            return "";
        }
        String strC = c(i, singleDayRecord);
        LogUtil.d("PLGACHIEVE_ReportUtil", "key=", Integer.valueOf(i), " result=", strC);
        return strC;
    }

    private static String c(int i, SingleDayRecord singleDayRecord) {
        switch (i) {
            case 1:
                return singleDayRecord.acquireBestWalkDistance();
            case 2:
                return singleDayRecord.acquireBestStepDay();
            case 3:
                return singleDayRecord.acquireBestRunDistance();
            case 4:
                return singleDayRecord.acquireBestRunPace();
            case 5:
                return singleDayRecord.acquireBestRun3KMPace();
            case 6:
                return singleDayRecord.acquireBestRun5KMPace();
            case 7:
                return singleDayRecord.acquireBestRun10KMPace();
            case 8:
                return singleDayRecord.acquireBestRunHMPace();
            case 9:
                return singleDayRecord.acquireBestRunFMPace();
            case 10:
                return singleDayRecord.acquireBestCycleDistance();
            case 11:
                return singleDayRecord.acquireBestCycleSpeed();
            case 12:
                return singleDayRecord.acquireBestRopeSingCount();
            case 13:
                return singleDayRecord.acquireBestRopeContinuousCount();
            case 14:
                return singleDayRecord.acquireBestRopeSpeed();
            case 15:
                return singleDayRecord.acquireBestRopeDuration();
            case 16:
                return singleDayRecord.getNpeBestResult();
            default:
                return "";
        }
    }

    public static String e(int i, Context context) {
        if (context == null) {
            LogUtil.j("PLGACHIEVE_ReportUtil", "getUnitByKey: context is null");
            return "";
        }
        if (i != 1) {
            if (i == 2) {
                return context.getString(R.string.IDS_plugin_achievement_report_steps);
            }
            if (i != 3 && i != 10) {
                if (i != 11) {
                    return "";
                }
                return context.getString(R.string.IDS_motiontrack_show_detail_average_speed);
            }
        }
        return context.getString(R.string.IDS_plugin_achievement_report_km);
    }

    public static String a(int i, Context context) {
        if (context == null) {
            LogUtil.j("PLGACHIEVE_ReportUtil", "getInchUnitByKey: context is null");
            return "";
        }
        if (i != 1) {
            if (i == 2) {
                return context.getString(R.string.IDS_plugin_achievement_report_steps);
            }
            if (i != 3 && i != 10) {
                if (i != 11) {
                    return "";
                }
                return context.getString(R.string.IDS_motiontrack_show_detail_average_speed_imp);
            }
        }
        return context.getString(R.string.IDS_hwh_motiontrack_show_speed_pace_mi);
    }

    public static boolean g(int i) {
        return !i(i) || b(i);
    }

    public static String d(int i) {
        return UnitUtil.e(i);
    }

    public static String a(double d) {
        if (d != 0.0d) {
            return ltc.c(c(3600.0d / d), 1, 2);
        }
        LogUtil.a("PLGACHIEVE_ReportUtil", "getCycleDistanceStr value Invalid");
        return "";
    }

    public static float e(double d) {
        return (float) c(3600.0d / d);
    }

    public static double c(long j) {
        return a(j, true);
    }

    public static double a(long j, boolean z) {
        double d = (j * 1.0d) / 1000.0d;
        return z ? c(d) : d;
    }

    public static double a(long j) {
        return c(UnitUtil.e(j * 1.0d, 3) / 1000.0d);
    }

    public static double c(double d) {
        NumberFormat numberFormat = NumberFormat.getInstance();
        numberFormat.setRoundingMode(RoundingMode.HALF_UP);
        numberFormat.setMaximumFractionDigits(2);
        numberFormat.setMinimumFractionDigits(2);
        try {
            return numberFormat.parse(numberFormat.format(d)).doubleValue();
        } catch (ParseException e) {
            LogUtil.e("PLGACHIEVE_ReportUtil", e.getMessage());
            return 0.0d;
        }
    }

    public static String e(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            return UnitUtil.a(new Date(Long.parseLong(str)), 20);
        } catch (NumberFormatException unused) {
            LogUtil.e("PLGACHIEVE_ReportUtil", "setGainTime NumberFormatException");
            return str;
        }
    }

    public static String d(long j, int i) {
        int i2;
        if (i == 0) {
            i2 = 52;
        } else if (i == 1) {
            i2 = 24;
        } else if (i == 2) {
            i2 = 131076;
        } else if (i != 3) {
            i2 = i != 5 ? 20 : 36;
        } else {
            i2 = 131080;
        }
        return UnitUtil.a(new Date(j), i2);
    }

    public static String d(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("PLGACHIEVE_ReportUtil", "getStepString: value empty");
            return "";
        }
        try {
            return UnitUtil.a(new SimpleDateFormat("yyyyMMdd", Locale.ENGLISH).parse(str), 20);
        } catch (ParseException unused) {
            LogUtil.e("PLGACHIEVE_ReportUtil", "getStepString ParseException");
            return "";
        }
    }

    public static long a(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        try {
            return new SimpleDateFormat("yyyyMMdd", Locale.ENGLISH).parse(str).getTime();
        } catch (ParseException unused) {
            LogUtil.e("PLGACHIEVE_ReportUtil", "getStepString ParseException");
            return 0L;
        }
    }

    public static int e(int i) {
        if (!i(i) || i == 3) {
            return R.mipmap.ic_pb_medal_run;
        }
        if (b(i) || i == 10) {
            return R.mipmap.ic_pb_medal_ride;
        }
        if (h(i)) {
            return R.drawable.pic_pb_robe;
        }
        return R.mipmap.ic_pb_medal_steps;
    }

    public static String a(int i) {
        switch (i) {
            case 5:
                return "3km";
            case 6:
                return "5km";
            case 7:
                return "10km";
            case 8:
                return "21.0975km";
            case 9:
                return "42.195km";
            default:
                return "";
        }
    }

    public static List<Integer> e() {
        ArrayList arrayList = new ArrayList(10);
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), "30004", "ai-report-annual-001");
        LogUtil.j("PLGACHIEVE_ReportUtil", "fetchConfigAnnualShowList config ", strE);
        if (!TextUtils.isEmpty(strE)) {
            try {
                JSONObject jSONObject = new JSONObject(strE).getJSONObject(e.n);
                for (int iA = oxi.a(oxi.b(System.currentTimeMillis())); iA >= 2017; iA--) {
                    if (jSONObject.has(String.valueOf(iA))) {
                        boolean zF = f(jSONObject.getString(String.valueOf(iA)));
                        LogUtil.a("PLGACHIEVE_ReportUtil", "fetchConfigAnnualShowList year ", Integer.valueOf(iA), " isShow ", Boolean.valueOf(zF));
                        if (zF) {
                            arrayList.add(Integer.valueOf(iA));
                        } else {
                            continue;
                        }
                    }
                }
            } catch (JSONException unused) {
                LogUtil.e("PLGACHIEVE_ReportUtil", "fetchConfigAnnualShowList JSONException");
            }
        }
        return arrayList;
    }

    private static boolean f(String str) {
        str.hashCode();
        if (str.equals("1")) {
            return CommonUtil.ap() || CommonUtil.ao();
        }
        return !str.equals("2");
    }
}
