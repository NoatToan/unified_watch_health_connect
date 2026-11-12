package defpackage;

import com.huawei.haf.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.threecircle.ActiveTipStringUtils;
import health.compact.a.SharedPreferenceManager;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class ujq {
    public static int b(int i, int i2, int i3, int i4) {
        if (i4 <= 0 || i3 != 4 || i == i4) {
            return i > i2 ? -1 : 1;
        }
        if (i2 == i4) {
            return i > i2 ? -3 : 3;
        }
        return i > i2 ? -4 : 4;
    }

    private static boolean f(int i) {
        return i == 1;
    }

    private static void b(AnalyticsValue analyticsValue, Map<String, Object> map) {
        if (analyticsValue == null || map == null) {
            LogUtil.j("R_ActiveBiUtils", "setEvent analyticsValue ", analyticsValue, " map ", map);
        } else {
            map.put("click", 1);
            lmf.d().c(BaseApplication.b(), analyticsValue.value(), map, 0);
        }
    }

    private static int d(ActiveTipStringUtils.TipType tipType, int i) {
        if (tipType == ActiveTipStringUtils.TipType.STAND_HOUR || tipType == ActiveTipStringUtils.TipType.TASK_STAND_HOUR) {
            return 3;
        }
        if (tipType == ActiveTipStringUtils.TipType.WORKOUT || tipType == ActiveTipStringUtils.TipType.TASK_WORKOUT) {
            return i == 257 ? 6 : 7;
        }
        if (tipType == ActiveTipStringUtils.TipType.CALORIES || tipType == ActiveTipStringUtils.TipType.TASK_CALORIES) {
            return i == 257 ? 8 : 9;
        }
        return 2;
    }

    public static void c(int i, int i2, int i3, ActiveTipStringUtils.TipType tipType) {
        HashMap map = new HashMap(4);
        map.put("event", Integer.valueOf(i));
        map.put("from", Integer.valueOf(i2));
        map.put("type", Integer.valueOf(d(tipType, i3)));
        b(AnalyticsValue.HEALTH_HOME_CIRCLE_RING_1040108, map);
    }

    public static void b(Map<String, Object> map, int i, int i2) {
        map.put("from", Integer.valueOf(i));
        map.put("event", Integer.valueOf(i2));
        b(AnalyticsValue.HEALTH_HOME_CIRCLE_RING_1040110, map);
    }

    public static void e(int i, int i2) {
        b(new HashMap(3), i, i2);
    }

    public static void a(int i, int i2, boolean z) {
        HashMap map = new HashMap(4);
        map.put("suggest", Boolean.valueOf(z));
        b(map, i, i2);
    }

    public static void e(String str, int i, int i2) {
        HashMap map = new HashMap();
        map.put("event", str);
        if (i2 != -1) {
            map.put("type", Integer.valueOf(i2));
        }
        map.put("from", Integer.valueOf(i));
        if ("3".equals(str)) {
            map.put("switchStatus", String.valueOf(SharedPreferenceManager.b("fitness_step_module_id", "active_hours_set_alert_toggle", f(i2))));
        }
        b(AnalyticsValue.REMINDER_SWITCH_IS_CHANGE_1040096, map);
    }

    public static void a(int i, String str, boolean z) {
        HashMap map = new HashMap(5);
        map.put("event", "3");
        map.put("type", Integer.valueOf(c(str)));
        map.put("from", Integer.valueOf(i));
        map.put("switchStatus", String.valueOf(z));
        b(AnalyticsValue.REMINDER_SWITCH_IS_CHANGE_1040096, map);
    }

    private static int c(String str) {
        byte b2;
        str.hashCode();
        switch (str) {
            case "900200004":
                b2 = 0;
                break;
            case "900200010":
                b2 = 1;
                break;
            case "900200011":
                b2 = 2;
                break;
            case "900200021":
                b2 = 3;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            return 1;
        }
        if (b2 == 1) {
            return 2;
        }
        if (b2 == 2) {
            return 3;
        }
        if (b2 == 3) {
            return 4;
        }
        LogUtil.j("R_ActiveBiUtils", "getConfigBiType with", str);
        return -1;
    }

    public static void a(int i) {
        HashMap map = new HashMap(2);
        map.put("from", Integer.valueOf(i));
        b(AnalyticsValue.HEALTH_HOME_CIRCLE_RING_1040113, map);
    }

    public static void c(int i) {
        HashMap map = new HashMap(2);
        map.put("type", Integer.valueOf(i));
        b(AnalyticsValue.HEALTH_HOME_CIRCLE_RING_1040112, map);
    }

    public static void e(int i, int i2, int i3, int i4) {
        HashMap map = new HashMap(5);
        map.put("type", Integer.valueOf(i));
        map.put("from", Integer.valueOf(i2));
        map.put("adjustType", Integer.valueOf(i3));
        map.put("value", Integer.valueOf(i4));
        b(AnalyticsValue.HEALTH_HOME_CIRCLE_RING_1040111, map);
    }

    public static void a(int i, int i2) {
        HashMap map = new HashMap(3);
        map.put("type", Integer.valueOf(i));
        map.put("event", Integer.valueOf(i2));
        b(AnalyticsValue.HEALTH_HOME_CIRCLE_RING_1040109, map);
    }

    public static void b(int i) {
        HashMap map = new HashMap(2);
        map.put("type", Integer.valueOf(i));
        b(AnalyticsValue.HEALTH_HOME_STEP_DETAIL_2010002, map);
    }

    public static void d() {
        b(AnalyticsValue.HEALTH_HOME_CAL_DETAIL_2010006, new HashMap(1));
    }

    public static void d(int i) {
        HashMap map = new HashMap(2);
        map.put("type", Integer.valueOf(i));
        b(AnalyticsValue.HEALTH_HOME_CIRCLE_RING_1040115, map);
    }

    public static void a(ActiveTipStringUtils.TipType tipType, int i) {
        int iE = e(tipType);
        if (iE < 0) {
            return;
        }
        HashMap map = new HashMap(3);
        map.put("type", Integer.valueOf(iE));
        map.put("event", Integer.valueOf(i));
        b(AnalyticsValue.HEALTH_CIRCLE_RING_TASK_TIP_2010232, map);
    }

    public static void b(ActiveTipStringUtils.TipType tipType) {
        a(tipType, e(tipType));
    }

    private static int e(ActiveTipStringUtils.TipType tipType) {
        if (ActiveTipStringUtils.TipType.TASK_SUBSCRIBE.equals(tipType)) {
            return 1;
        }
        if (ActiveTipStringUtils.TipType.TASK_BONUS_GET.equals(tipType)) {
            return 2;
        }
        return ActiveTipStringUtils.TipType.TASK_BONUS_USE.equals(tipType) ? 3 : -1;
    }

    public static void g(int i) {
        HashMap map = new HashMap(2);
        map.put("action", Integer.valueOf(i));
        b(AnalyticsValue.HEALTH_CIRCLE_RING_TASK_SUBSCRIBE_2010233, map);
    }

    public static void e(int i) {
        HashMap map = new HashMap(4);
        map.put("type", 1);
        map.put("from", 1);
        map.put("result", j(i));
        b(AnalyticsValue.HEALTH_CIRCLE_RING_TASK_GET_POINTS_2010234, map);
    }

    private static String j(int i) {
        if (i == 0) {
            return "true";
        }
        if (i == 12038138) {
            return "total_limit";
        }
        if (i == 12038139) {
            return "daily_limit";
        }
        if (i == 12038140) {
            return "account_problem";
        }
        if (i == 12030004) {
            return "network_problem";
        }
        return String.valueOf(i);
    }

    public static void b() {
        HashMap map = new HashMap(2);
        map.put("from", 1);
        b(AnalyticsValue.HEALTH_CIRCLE_RING_TASK_GO_VMALL_2010236, map);
    }
}
