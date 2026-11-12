package defpackage;

import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.health.suggestion.PluginSuggestion;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.utils.StringUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes29.dex */
public class gmy {
    public static void c(String str) {
        buh.d("needSendPlanFinish", str);
        String strValueOf = String.valueOf(btw.b(System.currentTimeMillis()));
        buh.d("needSendPlanFinishDeadline", strValueOf);
        buh.d("hasSendFinishPlanDevices", peh.c(new ArrayList()));
        ReleaseLogUtil.d("Suggestion_PlanFinishHelper", "setNeedSendFinishPlan, planid:", str, " time:", strValueOf);
        PluginSuggestion.getInstance().startSendIntelligentPlan();
    }

    public static String c() {
        if (System.currentTimeMillis() <= CommonUtil.i(buh.e("needSendPlanFinishDeadline"))) {
            return buh.e("needSendPlanFinish");
        }
        return "";
    }

    public static boolean d(String str) {
        if (e()) {
            return !peh.c(buh.e("hasSendFinishPlanDevices"), String[].class).contains(str);
        }
        return false;
    }

    public static void b(String str) {
        ArrayList arrayList = new ArrayList(peh.c(buh.e("hasSendFinishPlanDevices"), String[].class));
        arrayList.add(str);
        buh.d("hasSendFinishPlanDevices", peh.c(arrayList));
    }

    public static boolean e() {
        String strE = buh.e("needSendPlanFinish");
        long jI = CommonUtil.i(buh.e("needSendPlanFinishDeadline"));
        LogUtil.a("Suggestion_PlanFinishHelper", "isNeedSendFinishPlan, planid:", strE, " time:", Long.valueOf(jI));
        return System.currentTimeMillis() <= jI && StringUtils.j(strE);
    }

    public static void e(int i) {
        ReleaseLogUtil.d("Suggestion_PlanFinishHelper", "setNeedFinishPlanType ", Integer.valueOf(i));
        SharedPreferenceManager.c("MMKV_SUGGEST_MODULE_TAG", "sendFinishPlanType", String.valueOf(i));
    }

    public static int a() {
        return Integer.parseInt(SharedPreferenceManager.b("MMKV_SUGGEST_MODULE_TAG", "sendFinishPlanType", String.valueOf(IntPlan.PlanType.AI_RUN_PLAN.getType())));
    }
}
