package defpackage;

import android.view.View;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.basefitnessadvice.model.Plan;
import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.basefitnessadvice.R;
import com.huawei.health.plan.api.PlanApi;
import com.huawei.health.suggestion.PluginSuggestion;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import health.compact.a.Services;
import health.compact.a.Utils;

/* JADX INFO: loaded from: classes9.dex */
public class ifm {
    public void b() {
        btt.d().c(new Runnable() { // from class: ifm.1
            @Override // java.lang.Runnable
            public void run() {
                PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
                if (planApi == null) {
                    LogUtil.e("Track_RunPlanUtils", "refreshMyPlanBanner, getCurrentPlan : planApi is null.");
                } else {
                    planApi.getCurrentIntPlan(new b());
                }
            }
        });
    }

    static class b extends UiCallback<IntPlan> {
        private b() {
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
            LogUtil.j("Track_RunPlanUtils", "errorCode = ", Integer.valueOf(i), " errorInfo = ", str);
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onSuccess(IntPlan intPlan) {
            if (intPlan == null) {
                LogUtil.e("Track_RunPlanUtils", "GetMyPlanCallback : data is null.");
                return;
            }
            Plan compatiblePlan = intPlan.getCompatiblePlan();
            if (compatiblePlan == null || !intPlan.getPlanType().equals(IntPlan.PlanType.RUN_PLAN)) {
                return;
            }
            ifm.c(compatiblePlan);
        }
    }

    public static void c(final Plan plan) {
        HandlerExecutor.b(new Runnable() { // from class: ifl
            @Override // java.lang.Runnable
            public final void run() {
                ifm.a(plan);
            }
        });
    }

    static /* synthetic */ void a(final Plan plan) {
        if (BaseApplication.getActivity() == null) {
            LogUtil.j("Track_RunPlanUtils", "getActivity is null.");
            return;
        }
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(BaseApplication.getActivity());
        builder.b(R.string.IDS_sug_oversea_run_plan_offline);
        builder.a(R.string.sug_dialog_yes, new View.OnClickListener() { // from class: ifo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ifm.d(plan, view);
            }
        });
        if (!Utils.k()) {
            builder.c(R.string.IDS_sug_ai_run_plan_finish, new View.OnClickListener() { // from class: ifn
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ifm.e(plan, view);
                }
            });
        }
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
        if (noTitleCustomAlertDialogC != null) {
            noTitleCustomAlertDialogC.setCancelable(false);
            noTitleCustomAlertDialogC.show();
        }
    }

    static /* synthetic */ void d(Plan plan, View view) {
        LogUtil.a("Track_RunPlanUtils", "showOfflineDialog ok");
        e(plan, false);
    }

    static /* synthetic */ void e(Plan plan, View view) {
        LogUtil.a("Track_RunPlanUtils", "showOfflineDialog start ai run plan");
        e(plan, true);
    }

    public static void e(Plan plan, final boolean z) {
        if (plan == null) {
            LogUtil.j("Track_RunPlanUtils", "finishPlan currentPlan is null");
            return;
        }
        final String strAcquireId = plan.acquireId();
        if (strAcquireId != null) {
            PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
            if (planApi == null) {
                LogUtil.e("Track_RunPlanUtils", "finishPlan, getCurrentPlan : planApi is null.");
            } else {
                planApi.setPlanType(0);
                planApi.finishPlan(0, strAcquireId, new UiCallback<String>() { // from class: ifm.5
                    @Override // com.huawei.basefitnessadvice.callback.UiCallback
                    public void onFailure(int i, String str) {
                        LogUtil.e("Track_RunPlanUtils", "finish  plan failed  ", str);
                        qpx.b(BaseApplication.getActivity(), str);
                    }

                    @Override // com.huawei.basefitnessadvice.callback.UiCallback
                    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                    public void onSuccess(String str) {
                        btq.e().e("PLAN_UPDATE");
                        LogUtil.a("Track_RunPlanUtils", "finish  plan onSuccess  ", str);
                        if (z) {
                            ifm.d();
                        } else {
                            ifm.e(strAcquireId);
                        }
                    }
                });
            }
        }
    }

    public static void e(String str) {
        PluginSuggestion pluginSuggestion = (PluginSuggestion) Services.d("PluginFitnessAdvice", PluginSuggestion.class);
        if (pluginSuggestion != null) {
            pluginSuggestion.switchToPlanReport(str);
        }
    }

    public static void d() {
        PluginSuggestion pluginSuggestion = (PluginSuggestion) Services.d("PluginFitnessAdvice", PluginSuggestion.class);
        if (pluginSuggestion != null) {
            pluginSuggestion.jumpToPlanTab();
        }
    }
}
