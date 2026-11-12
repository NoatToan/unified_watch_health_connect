package com.huawei.health.suggestion.service;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.framework.servicemgr.Consumer;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.router.Guidepost;
import com.huawei.haf.router.facade.service.PretreatmentService;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.plan.api.PlanApi;
import com.huawei.health.suggestion.PluginSuggestion;
import com.huawei.health.suggestion.util.JumpUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.utils.WebViewHelp;
import defpackage.btw;
import defpackage.iov;
import defpackage.qey;
import health.compact.a.AuthorizationUtils;
import health.compact.a.Services;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class TrainingPlanPretreatmentServiceImpl implements PretreatmentService {
    private String d;

    @Override // com.huawei.haf.router.facade.service.PretreatmentService
    public boolean onPretreatment(final Context context, Guidepost guidepost) {
        LogUtil.a("Suggestion_TrainingPlanPretreatmentServiceImpl", "onPretreatment:", guidepost.g(), " path:", guidepost.l());
        Uri uriO = guidepost.o();
        if (uriO == null) {
            LogUtil.e("Suggestion_TrainingPlanPretreatmentServiceImpl", "uri is null.");
            return false;
        }
        LoginInit loginInit = LoginInit.getInstance(context);
        if ((loginInit.getAccountInfo(1011) == null && loginInit.isBrowseMode()) || !AuthorizationUtils.c(context) || BaseApplication.d("com.huawei.health.MainActivity") == -1) {
            LogUtil.a("Suggestion_TrainingPlanPretreatmentServiceImpl", "StartHealth to MainActivity");
            Intent intent = new Intent();
            intent.setClassName(context.getPackageName(), "com.huawei.health.MainActivity");
            intent.putExtra("schemeDataType", 2);
            intent.putExtra(" schemeParamUri", uriO);
            intent.putExtra("needLogin", true);
            iov.d(context, intent);
            return false;
        }
        LogUtil.a("Suggestion_TrainingPlanPretreatmentServiceImpl", "uri:", uriO.getQuery());
        this.d = uriO.getQueryParameter(WebViewHelp.BI_KEY_PULL_FROM);
        if (((PluginSuggestion) Services.d("PluginFitnessAdvice", PluginSuggestion.class)) == null) {
            LogUtil.j("Suggestion_TrainingPlanPretreatmentServiceImpl", "plugin suggestion not install.");
            Services.c("PluginFitnessAdvice", PluginSuggestion.class, context, new Consumer() { // from class: hdx
                @Override // com.huawei.framework.servicemgr.Consumer
                public final void accept(Object obj) {
                    this.e.a(context, (PluginSuggestion) obj);
                }
            }, true);
        } else {
            e(context);
        }
        return false;
    }

    public /* synthetic */ void a(Context context, PluginSuggestion pluginSuggestion) {
        LogUtil.a("Suggestion_TrainingPlanPretreatmentServiceImpl", "PluginSuggestion installed.");
        e(context);
    }

    @Override // com.huawei.haf.router.facade.template.ServiceProvider
    public void init(Context context) {
        LogUtil.a("Suggestion_TrainingPlanPretreatmentServiceImpl", "init.");
    }

    private void e(final Context context) {
        final PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (Objects.equals(Integer.toString(4048), this.d)) {
            d(context);
        } else if (planApi == null || planApi.getCurrentIntPlan() != null) {
            d(context);
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: hdz
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.b(planApi, context);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.huawei.health.suggestion.service.TrainingPlanPretreatmentServiceImpl$5, reason: invalid class name */
    public class AnonymousClass5 extends UiCallback<qey> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f8951c;

        AnonymousClass5(Context context) {
            this.f8951c = context;
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
            LogUtil.e("Suggestion_TrainingPlanPretreatmentServiceImpl", "getCurrentPlan errorCode:", Integer.valueOf(i), ",errorInfo:", str);
            final Context context = this.f8951c;
            HandlerExecutor.b(new Runnable() { // from class: hef
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.a(context);
                }
            });
        }

        public /* synthetic */ void a(Context context) {
            TrainingPlanPretreatmentServiceImpl.this.d(context);
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(final qey qeyVar) {
            if (btw.d(qeyVar)) {
                final Context context = this.f8951c;
                HandlerExecutor.b(new Runnable() { // from class: hec
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.e.b(context, qeyVar);
                    }
                });
            } else {
                final Context context2 = this.f8951c;
                HandlerExecutor.b(new Runnable() { // from class: hed
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f36681a.d(context2);
                    }
                });
            }
        }

        public /* synthetic */ void b(Context context, qey qeyVar) {
            TrainingPlanPretreatmentServiceImpl.this.d(context, qeyVar.h());
        }

        public /* synthetic */ void d(Context context) {
            TrainingPlanPretreatmentServiceImpl.this.d(context);
        }
    }

    public /* synthetic */ void b(PlanApi planApi, Context context) {
        planApi.getCurrentPlan(new AnonymousClass5(context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Context context) {
        Context contextC = c(context);
        if (contextC == null) {
            contextC = BaseApplication.b();
        }
        JumpUtil.a(contextC, "#/train_plan_create_guide", "plan_page", "com.huawei.health.h5.intelligent-training-plan");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Context context, String str) {
        Context contextC = c(context);
        if (contextC == null) {
            contextC = BaseApplication.b();
        }
        JumpUtil.a(contextC, String.format("#/train_plan_detail?planId=%s", str), "plan_page", "com.huawei.health.h5.intelligent-training-plan");
    }

    private Activity c(Context context) {
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (iov.d(activity)) {
            LogUtil.a("Suggestion_TrainingPlanPretreatmentServiceImpl", "activity:", activity);
            return activity;
        }
        Activity activityJ = BaseApplication.j();
        if (iov.d(activityJ)) {
            LogUtil.a("Suggestion_TrainingPlanPretreatmentServiceImpl", "getTopActivity:", activityJ);
            return activityJ;
        }
        LogUtil.j("Suggestion_TrainingPlanPretreatmentServiceImpl", "getTopActivity context:", context, " topActivity:", BaseApplication.j());
        return null;
    }
}
