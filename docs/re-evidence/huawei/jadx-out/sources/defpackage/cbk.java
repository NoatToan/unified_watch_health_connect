package defpackage;

import android.content.Context;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import health.compact.a.CommonUtil;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public class cbk {
    private static void a(AnalyticsValue analyticsValue, Map<String, Object> map) {
        if (analyticsValue == null || map == null) {
            LogUtil.j("R_HL_BasicHealthModelBiUtils", "setEvent analyticsValue ", analyticsValue, " map ", map);
        } else {
            map.put("click", 1);
            lmf.d().c(BaseApplication.b(), analyticsValue.value(), map, 0);
        }
    }

    public static void d(AnalyticsValue analyticsValue, int i) {
        if (analyticsValue == null) {
            LogUtil.j("R_HL_BasicHealthModelBiUtils", "setEventForFrom analyticsValue is null from ", Integer.valueOf(i));
            return;
        }
        HashMap map = new HashMap(2);
        map.put("from", Integer.valueOf(i));
        a(analyticsValue, map);
    }

    public static void a(AnalyticsValue analyticsValue, int i) {
        if (analyticsValue == null) {
            LogUtil.j("R_HL_BasicHealthModelBiUtils", "setEventForType analyticsValue is null type ", Integer.valueOf(i));
            return;
        }
        HashMap map = new HashMap(2);
        map.put("type", Integer.valueOf(i));
        a(analyticsValue, map);
    }

    public static void b(int i, int i2) {
        HashMap map = new HashMap(3);
        map.put("type", Integer.valueOf(i));
        map.put("reportType", Integer.valueOf(i2));
        a(AnalyticsValue.BP_Management_Program_Weekly_Report_2040167, map);
    }

    public static void c(int i, int i2) {
        HashMap map = new HashMap(5);
        map.put("click", 1);
        int iJ = CommonUtil.j(ccy.c("health_model_challenge_id"));
        map.put("planType", Integer.valueOf(iJ));
        map.put("completeType", Integer.valueOf(i2));
        map.put(ParsedFieldTag.TASK_TYPE, Integer.valueOf(i));
        Context contextB = BaseApplication.b();
        if (iJ == 200006 || iJ == 200007 || iJ == 200008) {
            map.put("from", 2);
            map.put("type", Integer.valueOf(i));
            lmf.d().c(contextB, AnalyticsValue.BLOOD_PRESSURE_JUMP_TO_HEALTH_LIFE_2040208.value(), map, 0);
        }
        lmf.d().c(contextB, AnalyticsValue.Health_Management_Plan_Tasks_2040166.value(), map, 0);
    }

    public static void d(String str, String str2, int i) {
        HashMap map = new HashMap(5);
        map.put("from", str);
        map.put("status", Integer.valueOf(i));
        map.put("uuid", str2);
        map.put("time", Long.valueOf(System.currentTimeMillis()));
        a(AnalyticsValue.HEALTH_MODEL_PLUGIN_RESOURCES_2119087, map);
    }

    public static void d(int i) {
        HashMap map = new HashMap(2);
        map.put("reminderType", Integer.valueOf(i));
        a(AnalyticsValue.HEALTH_MODEL_NOTIFICATION_MESSAGE_CLICK_2119029, map);
    }

    public static void a(int i) {
        HashMap map = new HashMap(2);
        map.put("taskId", Integer.valueOf(i));
        a(AnalyticsValue.HEALTH_MODEL_TASK_RULES_CLICK_2119005, map);
    }

    public static void d(int i, String str) {
        HashMap map = new HashMap(3);
        map.put("taskId", Integer.valueOf(i));
        map.put("button", str);
        a(AnalyticsValue.HEALTH_MODEL_MISSION_POPUP_CLICK_2119006, map);
    }

    public static void c(int i, boolean z) {
        HashMap map = new HashMap(4);
        map.put(ParsedFieldTag.TASK_TYPE, Integer.valueOf(i));
        map.put("isChecked", Boolean.valueOf(z));
        map.put("planType", Integer.valueOf(cbg.k()));
        a(AnalyticsValue.HEALTH_MODEL_TASK_CHECKBOX_CLICK_2119033, map);
    }

    public static void e() {
        HashMap map = new HashMap(5);
        map.put("from", 5);
        map.put(com.huawei.health.messagecenter.model.CommonUtil.PAGE_TYPE, 1);
        map.put(FunctionSetBeanReader.BI_HAS_DATA, 0);
        map.put("pageDate", DateFormatUtil.e(System.currentTimeMillis(), DateFormatUtil.DateFormatType.DATE_FORMAT_YYYY_MM_DD));
        a(AnalyticsValue.INPUT_SLEEP_ENTER_2030105, map);
    }

    public static void b(Calendar calendar, Calendar calendar2) {
        HashMap map = new HashMap(11);
        map.put("from", 5);
        map.put("type", 1);
        map.put("event", 1);
        map.put("sleepTime", "");
        map.put("after_bedTime", "");
        map.put("before_bedTime", "");
        map.put("recordDate", DateFormatUtil.e(System.currentTimeMillis(), DateFormatUtil.DateFormatType.DATE_FORMAT_YYYY_MM_DD));
        if (calendar != null && calendar2 != null) {
            map.put("bedTime", Long.valueOf((calendar.getTimeInMillis() - calendar2.getTimeInMillis()) / 60000));
            map.put("time_out_bed", DateFormatUtil.e(calendar.getTime().getTime(), DateFormatUtil.DateFormatType.DEFAULT_DATE_FORMAT));
            map.put("time_to_bed", DateFormatUtil.e(calendar2.getTime().getTime(), DateFormatUtil.DateFormatType.DEFAULT_DATE_FORMAT));
        }
        a(AnalyticsValue.INPUT_SLEEP_COMPLETE_2030106, map);
    }

    public static void c(String str, String str2, String str3, List<String> list) {
        HashMap map = new HashMap(6);
        map.put("PhysicianSource", str);
        map.put("lastChallengeDay", str2);
        map.put("lastChallengeId", str3);
        map.put(ParsedFieldTag.TASK_TYPE, list);
        map.put("challengeId", Integer.valueOf(cbg.k()));
        a(AnalyticsValue.HEALTH_MODEL_CHALLENGE_JOIN_2119078, map);
    }
}
