package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.OpAnalyticsUtil;
import defpackage.lmh;
import health.compact.a.AuthorizationUtils;
import health.compact.a.CommonUtil;
import health.compact.a.Utils;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class lmf {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static lmf f40438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f40439c = {AnalyticsValue.HEALTH_HOME_STEP_DETAIL_2010002.value(), AnalyticsValue.BI_TRACK_ENTER_SPORT_SECOND_PAGE_1040044.value(), AnalyticsValue.MOTION_TRACK_1040023.value(), AnalyticsValue.MOTION_TRACK_1040027.value(), AnalyticsValue.BI_TRACK_SPORT_ADD_SPORT_KEY.value(), AnalyticsValue.HEALTH_MINE_SETTINGS_OFFINE_MAP_2040016.value(), AnalyticsValue.HEALTH_MINE_SETTINGS_HELP_2040049.value(), AnalyticsValue.BI_TRACK_SHOW_STAT_1040035.value(), AnalyticsValue.BI_TRACK_HISTORY_CHANGE_SPORT_TYPE_1040034.value(), AnalyticsValue.MOTION_TRACK_1040014.value(), AnalyticsValue.EVENT_ENTER_FITNESS_HISTORY.value(), AnalyticsValue.EVENT_CLICK_FITNESS_COURSE_MORE.value(), AnalyticsValue.HEALTH_HOME_CAL_DETAIL_2010006.value(), AnalyticsValue.HEALTH_HOME_STEP_DETAIL_2010002.value(), AnalyticsValue.HEALTH_HOME_STEP_CLIMB_2010047.value(), AnalyticsValue.EVENT_START_FITNESS_WORKOUT.value(), AnalyticsValue.HEALTH_SHOP_FEATURE_TAB_CLICK_2120017.value(), AnalyticsValue.HEALTH_DISCOVER_SCROLL_ACT_2020021.value(), AnalyticsValue.HEALTH_WONDERFUL_EVENT_SCROLL_2020025.value(), AnalyticsValue.HEALTH_MINE_MY_MEDAL_2040012.value(), AnalyticsValue.SUCCESSES_SHARE_1100011.value(), AnalyticsValue.SHARE_1140001.value(), AnalyticsValue.OPEN_SERVICE_MORE_20100060.value(), AnalyticsValue.HEALTH_HOME_SMART_CARD_MSG_CLICK_2010051.value(), AnalyticsValue.HEALTH_MINE_NOTICE_MSG_2040003.value(), AnalyticsValue.HEALTH_HOME_SHOW__CHIEVEMENT_CARD_KAKA_2010080.value(), AnalyticsValue.HEALTH_MINE_MY_KAKA_2040011.value(), AnalyticsValue.Group_1070010.value(), AnalyticsValue.HEALTH_HOME_OPERA_POSITION_CLICK_2010075.value(), AnalyticsValue.HEALTH_MINE_MY_INFO_2040007.value(), AnalyticsValue.HEALTH_MINE_MY_REPORT_2040010.value(), AnalyticsValue.ACHIEVE_REPORT_1100030.value(), AnalyticsValue.SUCCESSES_REPORT_1100009.value(), AnalyticsValue.HEALTH_HOME_SHOW__CHIEVEMENT_CARD_CUMULATE_DATA_2010079.value(), AnalyticsValue.HEALTH_MINE_MY_RANK_2040005.value(), AnalyticsValue.HEALTH_HOME_SLEEP_DETAIL_2010011.value(), AnalyticsValue.SLEEP_DAY_1150002.value(), AnalyticsValue.HEALTH_HOME_SLEEP_DETAIL_TAB_2010012.value(), AnalyticsValue.HEALTH_PRESSUER_CARD_CLICK_2160001.value(), AnalyticsValue.HEALTH_PRESSUER_MEASUREMENT_CLICK_2160009.value(), AnalyticsValue.HEALTH_PRESSUER_STRESSGAME_RETRY_2160023.value(), AnalyticsValue.HEALTH_PRESSUER_NODATA_BREATHEPARENT_CLICK_2160011.value(), AnalyticsValue.HEALTH_HOME_BLOOD_SUGAR_DETAIL_2010027.value(), AnalyticsValue.HEALTH_HOME_BLOOD_SUGAR_RECODE_IMPUT_2010028.value(), AnalyticsValue.HEALTH_HOME_BLOOD_PRESSURE_DETAIL_2010025.value(), AnalyticsValue.HEALTH_HOME_BLOOD_PRESSURE_RECODE_IMPUT_2010026.value(), AnalyticsValue.HEALTH_HOME_WIGHT_DETAIL_2010023.value(), AnalyticsValue.HEALTH_HOME_WIGHT_RECODE_IMPUT_2010024.value(), AnalyticsValue.HEALTH_HEALTH_MY_DEVICE_2030030.value(), AnalyticsValue.HEALTH_HEALTH_HEALTHSERVICE_HEALTHDATA_2030045.value(), AnalyticsValue.HEALTH_MINE_SETTINGS_2040013.value(), AnalyticsValue.HEALTH_MINE_TARGET_2040004.value(), AnalyticsValue.HEALTH_ACCESS_CARD_2060036.value(), AnalyticsValue.HEALTH_SMART_COACH_2010101.value(), AnalyticsValue.HEALTH_FAMILY_ZONE_2040078.value(), AnalyticsValue.HEALTH_HOME_NPS_COMMIT_SUCCESS_2010096.value(), AnalyticsValue.NPS_COMMIT_QUESTION_1090039.value(), AnalyticsValue.INVOICE_APPLY_2041099.value(), AnalyticsValue.INVOICE_SUCCESSFUL_2041100.value(), AnalyticsValue.HEALTH_HOME_TIPS_2040118.value(), AnalyticsValue.HEALTH_HOME_TIPS_2040119.value()};
    private static final String[] e = {AnalyticsValue.HEALTH_LOGIN_APP_WHITE_2050007.value(), AnalyticsValue.HEALTH_LOGIN_APP_2050009.value(), AnalyticsValue.HEALTH_GYM_EQUIP_CONNECT_RESULT_WHITE_2170017.value(), AnalyticsValue.HEALTH_PLUGIN_DEVICE_BIND_SUCCEED_WHITE_2060087.value(), AnalyticsValue.FA_ENTER_APP.value(), AnalyticsValue.SHARE_1140001.value(), AnalyticsValue.MARKETING_RESOURCE.value(), AnalyticsValue.TRADE_OFFERING_DETAIL.value(), AnalyticsValue.TRADE_BUY.value(), AnalyticsValue.TRADE_PAY_SUCCESS.value(), AnalyticsValue.HEALTH_MINE_SETTINGS_IMPROVE_PLAN_2040021.value()};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f40437a = String.valueOf(System.currentTimeMillis());

    public static lmf d() {
        if (f40438b == null) {
            lmp.b("BIAnalyticsUtil", "getInstance()");
            f40438b = new lmf();
        }
        return f40438b;
    }

    public void c(String str) {
        lmp.b("BIAnalyticsUtil", "setUserInfo()");
        lmh.c(str);
    }

    public void e(lmg... lmgVarArr) {
        lmp.b("BIAnalyticsUtil", "setBatchDeviceInfo()");
        lmh.d(lmgVarArr);
    }

    public void c(lmg... lmgVarArr) {
        lmp.b("BIAnalyticsUtil", "removeDeviceInfo()");
        lmh.b(lmgVarArr);
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        lmh.d(str);
    }

    public void b(String str, String str2) {
        lmh.d(str, str2);
    }

    public void e(final Context context, final String str, final Map<String, Object> map, final String str2, final int i) {
        ThreadPoolManager.c().b("BIAnalyticsUtil", new Runnable() { // from class: lmo
            @Override // java.lang.Runnable
            public final void run() {
                this.f40460c.a(i, str, map, str2, context);
            }
        });
    }

    /* synthetic */ void a(int i, String str, Map map, String str2, Context context) {
        int iD;
        if (!Utils.h()) {
            lmp.a("BIAnalyticsUtil", "setEvent() SUPPORT_ANALYTICS = true");
            return;
        }
        if (a(i)) {
            return;
        }
        if (e(str)) {
            if (!Utils.o() && b(str, f40439c)) {
                OpAnalyticsUtil.getInstance().setEvent2nd(str, e((Map<String, Object>) map));
            }
            if (TextUtils.equals(str2, "noAbTest")) {
                iD = lmh.b(context, str, map);
            } else {
                iD = lmh.d(context, str, map, str2);
            }
            a(context, str);
            lmp.b("BIAnalyticsUtil", "setEventResult = ", Integer.valueOf(iD));
            return;
        }
        lmp.a("BIAnalyticsUtil", "setEvent() AnalyticsStatus is false");
    }

    public void e(final Context context, final String str, final lmn lmnVar, final String str2, final int i) {
        ThreadPoolManager.c().b("BIAnalyticsUtil", new Runnable() { // from class: lmj
            @Override // java.lang.Runnable
            public final void run() {
                this.f40447c.e(i, lmnVar, str, str2, context);
            }
        });
    }

    /* synthetic */ void e(int i, lmn lmnVar, String str, String str2, Context context) {
        int iB;
        if (!Utils.h()) {
            lmp.a("BIAnalyticsUtil", "setEvent() SUPPORT_ANALYTICS = true");
            return;
        }
        if (a(i)) {
            return;
        }
        if (lmnVar.b() != null) {
            lmnVar.b(lmnVar.b(), f40437a);
        } else {
            HashMap map = new HashMap();
            map.put("sessionId", f40437a);
            lmnVar.d(map);
        }
        if (e(str)) {
            if (!Utils.o() && b(str, f40439c)) {
                OpAnalyticsUtil.getInstance().setEvent2nd(str, e(lmnVar));
            }
            if (TextUtils.equals(str2, "noAbTest")) {
                iB = lmh.a(context, str, lmnVar);
            } else {
                iB = lmh.b(context, str, lmnVar, str2);
            }
            a(context, str);
            lmp.b("BIAnalyticsUtil", "setEventResult = ", Integer.valueOf(iB));
            return;
        }
        lmp.a("BIAnalyticsUtil", "setEvent() AnalyticsStatus is false");
    }

    public static void c(long j) {
        f40437a = String.valueOf(j);
    }

    private boolean a(int i) {
        if (i == 0) {
            return false;
        }
        lmp.b("BIAnalyticsUtil", "setEvent() level =" + i + " BUILD_TYPE = release");
        return true;
    }

    public int c(Context context, String str, Map<String, Object> map, int i) {
        e(context, str, map, "noAbTest", i);
        return 0;
    }

    public int a(Context context, String str, lmn lmnVar, int i) {
        e(context, str, lmnVar, "noAbTest", i);
        return 0;
    }

    private boolean e(String str) {
        if (!b(str, e) && CommonUtil.af(BaseApplication.getContext())) {
            return a() && AuthorizationUtils.c(null);
        }
        if (!AuthorizationUtils.c(null)) {
            return false;
        }
        LogUtil.a("BIAnalyticsUtil", "getAnalyticsStatusWithWhiteList is true, white key:", str);
        return true;
    }

    public void b(Context context) {
        if (Utils.h()) {
            if (a()) {
                ThreadPoolManager.c().execute(new Runnable() { // from class: lmk
                    @Override // java.lang.Runnable
                    public final void run() {
                        lmh.e();
                    }
                });
            } else {
                lmp.a("BIAnalyticsUtil", "onReport() AnalyticsStatus is false");
            }
        }
    }

    private void a(Context context, String str) {
        if (Utils.h()) {
            if (b(str, e)) {
                LogUtil.a("BIAnalyticsUtil", "onReportWithWhiteList getAnalyticsStatusWithWhiteList true. Key:", str);
                lmh.e();
            } else {
                lmp.a("BIAnalyticsUtil", "onReportWithWhiteList() AnalyticsStatus is false");
            }
        }
    }

    public void e(final String str, final LinkedHashMap<String, String> linkedHashMap) {
        if (Utils.h()) {
            if (a()) {
                ThreadPoolManager.c().b("BIAnalyticsUtil", new Runnable() { // from class: lmi
                    @Override // java.lang.Runnable
                    public final void run() {
                        lmh.a(str, (LinkedHashMap<String, String>) linkedHashMap);
                    }
                });
            } else {
                lmp.a("BIAnalyticsUtil", "onReport() AnalyticsStatus is false");
            }
        }
    }

    public void c(final Context context) {
        if (Utils.h()) {
            if (a()) {
                ThreadPoolManager.c().b("BIAnalyticsUtil", new Runnable() { // from class: com.huawei.hwbimodel.impl.BIAnalyticsUtil$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        lmh.d(context);
                    }
                });
            } else {
                lmp.a("BIAnalyticsUtil", "onResume() AnalyticsStatus is false");
            }
        }
    }

    public void b(final String str, final LinkedHashMap<String, String> linkedHashMap) {
        if (Utils.h()) {
            if (a()) {
                ThreadPoolManager.c().b("BIAnalyticsUtil", new Runnable() { // from class: lml
                    @Override // java.lang.Runnable
                    public final void run() {
                        lmh.c(str, (LinkedHashMap<String, String>) linkedHashMap);
                    }
                });
            } else {
                lmp.a("BIAnalyticsUtil", "onPause() AnalyticsStatus is false");
            }
        }
    }

    public void d(final Context context) {
        if (Utils.h()) {
            if (a()) {
                ThreadPoolManager.c().b("BIAnalyticsUtil", new Runnable() { // from class: com.huawei.hwbimodel.impl.BIAnalyticsUtil$$ExternalSyntheticLambda6
                    @Override // java.lang.Runnable
                    public final void run() {
                        lmh.b(context);
                    }
                });
            } else {
                lmp.a("BIAnalyticsUtil", "onPause() AnalyticsStatus is false");
            }
        }
    }

    public static boolean b() {
        return Utils.h() && a();
    }

    public void d(lmm lmmVar) {
        int iC = lmmVar.c();
        LogUtil.a("BIAnalyticsUtil", "doBiFromOpenAppByPush type= ", Integer.valueOf(iC), " name= ", lmmVar.a(), " url= ", lmmVar.h(), " pushId = ", lmmVar.d(), " serviceId = ", lmmVar.b());
        HashMap map = new HashMap();
        map.put("click", 1);
        map.put("from", 0);
        c(BaseApplication.getContext(), AnalyticsValue.HEALTH_LOGIN_APP_WHITE_2050007.value(), map, 0);
        map.put("type", Integer.valueOf(lmmVar.c()));
        map.put("name", lmmVar.a());
        map.put("url", lmmVar.h());
        map.put("pushID", lmmVar.d());
        map.put("serviceID", lmmVar.b());
        map.put("details", lmmVar.e());
        c(BaseApplication.getContext(), AnalyticsValue.HEALTH_PUSH_OPEN_APP_2050008.value(), map, 0);
    }

    public LinkedHashMap<String, String> e(Map<String, Object> map) {
        if (map == null || map.isEmpty()) {
            return new LinkedHashMap<>();
        }
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            linkedHashMap.put(String.valueOf(entry.getKey()), String.valueOf(entry.getValue()));
        }
        return linkedHashMap;
    }

    public LinkedHashMap<String, String> e(lmn lmnVar) {
        if (lmnVar == null) {
            return new LinkedHashMap<>();
        }
        HashMap map = new HashMap();
        if (!CollectionUtils.c(lmnVar.c())) {
            map.putAll(lmnVar.c());
        }
        if (!CollectionUtils.a(lmnVar.e())) {
            map.put("pageProperties", lmnVar.e());
        }
        if (!CollectionUtils.c(lmnVar.b())) {
            map.putAll(lmnVar.b());
        }
        if (!CollectionUtils.c(lmnVar.a())) {
            map.putAll(lmnVar.a());
        }
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(String.valueOf(entry.getKey()), String.valueOf(entry.getValue()));
        }
        return linkedHashMap;
    }

    public boolean b(String str, String[] strArr) {
        if (strArr == null) {
            return false;
        }
        if (str == null) {
            for (String str2 : strArr) {
                if (str2 == null) {
                    return true;
                }
            }
        } else {
            for (String str3 : strArr) {
                if (str.equals(str3)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean a() {
        return (niz.c() || Utils.i()) && AuthorizationUtils.c(null);
    }

    public JSONObject c() {
        return lmh.b();
    }
}
