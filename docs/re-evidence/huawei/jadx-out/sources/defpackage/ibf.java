package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.huawei.basefitnessadvice.model.PlanRecord;
import com.huawei.health.plan.api.PlanApi;
import com.huawei.health.suggestion.receiver.NetworkStateReceiver;
import com.huawei.health.suggestion.ui.TrainReportActivity;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.Services;

/* JADX INFO: loaded from: classes9.dex */
public class ibf {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile ibf f37438b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f37439c = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f37440a = btx.c();
    private NetworkStateReceiver d;

    public static ibf e() {
        if (f37438b == null) {
            synchronized (ibf.class) {
                if (f37438b == null) {
                    f37438b = new ibf();
                }
            }
        }
        return f37438b;
    }

    private ibf() {
    }

    public void d() {
        if (a()) {
            return;
        }
        a(true);
        this.d = new NetworkStateReceiver();
        IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        intentFilter.setPriority(500);
        this.f37440a.registerReceiver(this.d, intentFilter);
    }

    public void e(String str) {
        if (ibl.a(str) == 0) {
            c(str);
        } else if (ibl.a(str) == 3) {
            a(str);
        } else {
            LogUtil.j("Suggestion_PlanSwitchProxy", "planType unSupport");
        }
    }

    private void a(String str) {
        LogUtil.a("Suggestion_PlanSwitchProxy", "switchToFitnessPlanReport");
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            LogUtil.e("Suggestion_PlanSwitchProxy", "switchToFitnessPlanReport, getPlanProgress : planApi is null.");
            return;
        }
        planApi.setPlanType(3);
        PlanRecord planProgress = planApi.getPlanProgress(str, false);
        if (planProgress == null) {
            LogUtil.j("Suggestion_PlanSwitchProxy", "planRecord is null and planId = ", str);
            return;
        }
        if (planProgress.acquireWorkoutTimes() > 0) {
            try {
                LogUtil.a("Suggestion_PlanSwitchProxy", "go to TrainReportActivity");
                Intent intent = new Intent(btx.c(), (Class<?>) TrainReportActivity.class);
                intent.setFlags(268435456);
                intent.putExtra("plan", planApi.getjoinedPlanById(str));
                intent.putExtra("finish_plan", true);
                this.f37440a.startActivity(intent);
            } catch (ActivityNotFoundException unused) {
                LogUtil.e("Suggestion_PlanSwitchProxy", "switchToFitnessPlanReport ActivityNotFoundException.");
            }
        }
    }

    private void c(String str) {
        LogUtil.a("Suggestion_PlanSwitchProxy", "switchToRunPlanReport");
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            LogUtil.e("Suggestion_PlanSwitchProxy", "switchToRunPlanReport, getPlanProgress : planApi is null.");
            return;
        }
        planApi.setPlanType(0);
        PlanRecord planProgress = planApi.getPlanProgress(str, true);
        if (planProgress == null) {
            LogUtil.j("Suggestion_PlanSwitchProxy", "PlanRecord is null when planId is ", str);
            return;
        }
        if (planProgress.acquireWorkoutTimes() != 0) {
            try {
                Intent intent = new Intent(btx.c(), (Class<?>) TrainReportActivity.class);
                intent.setFlags(268435456);
                intent.putExtra("plan", planApi.getjoinedPlanById(str));
                intent.putExtra("finish_plan", true);
                this.f37440a.startActivity(intent);
            } catch (ActivityNotFoundException unused) {
                LogUtil.e("Suggestion_PlanSwitchProxy", "switchToRunPlanReport ActivityNotFoundException.");
            }
        }
    }

    private static boolean a() {
        return f37439c;
    }

    private static void a(boolean z) {
        f37439c = z;
    }
}
