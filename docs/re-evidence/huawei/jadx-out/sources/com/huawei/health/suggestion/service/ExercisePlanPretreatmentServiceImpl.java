package com.huawei.health.suggestion.service;

import android.content.Context;
import android.net.Uri;
import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.framework.servicemgr.Consumer;
import com.huawei.haf.router.Guidepost;
import com.huawei.haf.router.facade.service.PretreatmentService;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.plan.api.PlanApi;
import com.huawei.health.plan.model.trainingplan.SmartPlanTypeEnum;
import com.huawei.health.suggestion.PluginSuggestion;
import com.huawei.health.suggestion.util.JumpUtil;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.hvu;
import defpackage.lmf;
import health.compact.a.Services;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class ExercisePlanPretreatmentServiceImpl implements PretreatmentService {
    @Override // com.huawei.haf.router.facade.service.PretreatmentService
    public boolean onPretreatment(final Context context, Guidepost guidepost) {
        LogUtil.a("Suggestion_ExercisePlanPretreatmentServiceImpl", "onPretreatment:", guidepost.g(), " path:", guidepost.l());
        Uri uriO = guidepost.o();
        if (uriO == null) {
            LogUtil.e("Suggestion_ExercisePlanPretreatmentServiceImpl", "uri is null.");
            return false;
        }
        LogUtil.a("Suggestion_ExercisePlanPretreatmentServiceImpl", "uri:", uriO.getQuery());
        if (((PluginSuggestion) Services.d("PluginFitnessAdvice", PluginSuggestion.class)) == null) {
            LogUtil.j("Suggestion_ExercisePlanPretreatmentServiceImpl", "plugin suggestion not install.");
            Services.c("PluginFitnessAdvice", PluginSuggestion.class, context, new Consumer() { // from class: hdu
                @Override // com.huawei.framework.servicemgr.Consumer
                public final void accept(Object obj) {
                    this.d.b(context, (PluginSuggestion) obj);
                }
            }, true);
        } else {
            b(context);
        }
        return false;
    }

    public /* synthetic */ void b(Context context, PluginSuggestion pluginSuggestion) {
        LogUtil.a("Suggestion_ExercisePlanPretreatmentServiceImpl", "PluginSuggestion installed.");
        b(context);
    }

    @Override // com.huawei.haf.router.facade.template.ServiceProvider
    public void init(Context context) {
        LogUtil.a("Suggestion_ExercisePlanPretreatmentServiceImpl", "init.");
    }

    private void b(final Context context) {
        final PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            LogUtil.e("Suggestion_ExercisePlanPretreatmentServiceImpl", "jumpToSmartTrainPlanTab intPlanApi is null");
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: hdw
                @Override // java.lang.Runnable
                public final void run() {
                    this.f36495c.c(planApi, context);
                }
            });
        }
    }

    public /* synthetic */ void c(PlanApi planApi, Context context) {
        IntPlan currentAllPlan = planApi.getCurrentAllPlan();
        if (currentAllPlan == null) {
            LogUtil.e("Suggestion_ExercisePlanPretreatmentServiceImpl", "intPlan is null");
            return;
        }
        if (SmartPlanTypeEnum.SMART_TRAINING_PLAN.getValue() == currentAllPlan.getSmartPlanType()) {
            JumpUtil.a(context, String.format("#/train_plan_detail?planId=%s", currentAllPlan.getPlanId()), "plan_page", "com.huawei.health.h5.intelligent-training-plan");
        } else if (currentAllPlan.getPlanType().getType() != IntPlan.PlanType.AI_RUN_PLAN.getType()) {
            LogUtil.e("Suggestion_ExercisePlanPretreatmentServiceImpl", "plan type is error");
        } else {
            a(currentAllPlan, context);
        }
    }

    private void a(IntPlan intPlan, Context context) {
        LogUtil.a("Suggestion_ExercisePlanPretreatmentServiceImpl", "goToOldPlanDetail");
        if (hvu.r(intPlan)) {
            JumpUtil.d(intPlan);
            return;
        }
        HashMap map = new HashMap(3);
        map.put("click", 1);
        map.put("type", Integer.valueOf(intPlan.getPlanType().getType()));
        map.put("plan_name", intPlan.getMetaInfo().getName());
        lmf.d().c(context, AnalyticsValue.INT_PLAN_2030079.value(), map, 0);
        if (intPlan.getIntroduction() != null && intPlan.getPlanType().equals(IntPlan.PlanType.FIT_PLAN)) {
            JumpUtil.b(context, "", IntPlan.PlanType.FIT_PLAN.getType());
        } else {
            JumpUtil.d(context);
        }
    }
}
