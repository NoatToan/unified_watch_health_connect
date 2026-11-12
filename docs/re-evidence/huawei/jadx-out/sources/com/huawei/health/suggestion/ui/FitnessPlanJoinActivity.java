package com.huawei.health.suggestion.ui;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.basefitnessadvice.model.Plan;
import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.plan.api.PlanApi;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.util.JumpUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.pluginfitnessadvice.FitnessPackageInfo;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.scrollview.HealthScrollView;
import defpackage.btw;
import defpackage.btx;
import defpackage.buh;
import defpackage.gzx;
import defpackage.hcg;
import defpackage.ped;
import defpackage.qey;
import defpackage.qpx;
import defpackage.qre;
import defpackage.qrs;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class FitnessPlanJoinActivity extends BaseActivity implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthButton f8983b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private NoTitleCustomAlertDialog f8984c = null;
    private boolean f = false;
    private Plan d = null;
    private String h = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ImageView f8982a = null;
    private HealthTextView e = null;
    private HealthTextView l = null;
    private HealthTextView g = null;
    private HealthTextView j = null;
    private FitnessPackageInfo i = null;

    @Override // com.huawei.health.suggestion.ui.BaseActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        cancelMarginAdaptation();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
        c();
    }

    private void c() {
        if (qrs.t()) {
            qrs.a(getBaseContext(), true, true, (LinearLayout) findViewById(R.id.back_button_and_title_name), (HealthTextView) findViewById(R.id.sug_description_textView));
        }
    }

    @Override // com.huawei.health.suggestion.ui.BaseActivity
    public void initData() {
        Intent intent = getIntent();
        if (intent != null && intent.getStringExtra("PLAN_TEMP_ID_KEY") != null) {
            this.h = intent.getStringExtra("PLAN_TEMP_ID_KEY");
        }
        if (TextUtils.isEmpty(this.h)) {
            LogUtil.j("Suggestion_FitnessPlanJoinActivity", "TextUtils.isEmpty(mPlanTempId)");
            finish();
        }
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            LogUtil.j("Suggestion_FitnessPlanJoinActivity", "initData : planApi is null.");
            return;
        }
        FitnessPackageInfo fitnessPkgInfoByTempId = planApi.getFitnessPkgInfoByTempId(this.h);
        this.i = fitnessPkgInfoByTempId;
        if (fitnessPkgInfoByTempId == null) {
            LogUtil.j("Suggestion_FitnessPlanJoinActivity", "null is mFitnessPackageInfo");
            finish();
        }
    }

    @Override // com.huawei.health.suggestion.ui.BaseActivity
    public void initLayout() {
        a();
        setContentView(R.layout.sug_activity_fitness_plan_join);
        b();
        j();
    }

    private void b() {
        if (this.i == null) {
            LogUtil.j("Suggestion_FitnessPlanJoinActivity", "null is mFitnessPackageInfo");
            return;
        }
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            LogUtil.j("Suggestion_FitnessPlanJoinActivity", "bindView : planApi is null.");
            return;
        }
        HealthButton healthButton = (HealthButton) findViewById(R.id.sug_create_fitness_plan);
        this.f8983b = healthButton;
        healthButton.setOnClickListener(this);
        ImageView imageView = (ImageView) findViewById(R.id.sug_fitness_back);
        this.f8982a = imageView;
        imageView.setOnClickListener(this);
        this.e = (HealthTextView) findViewById(R.id.sug_day_textView);
        this.l = (HealthTextView) findViewById(R.id.sug_time_textView);
        this.g = (HealthTextView) findViewById(R.id.sug_fit_plan_title);
        if (qrs.v()) {
            ((HealthScrollView) findViewById(R.id.scroll_view_large)).setVisibility(0);
            findViewById(R.id.sug_description_textView).setVisibility(8);
            findViewById(R.id.sug_description_layout).getLayoutParams().height = 800;
            this.j = (HealthTextView) findViewById(R.id.sug_description_textView_large_mode);
        } else {
            this.j = (HealthTextView) findViewById(R.id.sug_description_textView);
        }
        this.g.setText(this.i.acquireName());
        this.j.setText(this.i.acquireDescription());
        int iAcquireTotalCourse = this.i.acquireTotalCourse();
        int iRound = Math.round(planApi.getFitnessPlanPackageTotalCalorie(this.i));
        SpannableString spannableStringC = gzx.c(this, "\\d", gzx.d(R.plurals.sug_fitness_actions, iAcquireTotalCourse, UnitUtil.e(iAcquireTotalCourse, 1, 0)), R.style.sug_text_result_k, R.style.sug_text_result_m);
        SpannableString spannableStringC2 = gzx.c(this, "\\d", gzx.d(R.plurals.sug_chart_kcals, iRound, ped.f(ped.b(iRound))), R.style.sug_text_result_k, R.style.sug_text_result_m);
        this.e.setText(spannableStringC);
        this.l.setText(spannableStringC2);
    }

    private void j() {
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this);
        builder.b(R.string.IDS_sug_has_doing_plan_content);
        builder.c(R.string.IDS_FitnessAdvice_has_doing_plan_ok, new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.FitnessPlanJoinActivity.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("Suggestion_FitnessPlanJoinActivity", "onClick setPositiveButton");
                JumpUtil.a(FitnessPlanJoinActivity.this);
            }
        });
        builder.a(R.string.sug_dialog_yes, new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.FitnessPlanJoinActivity.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("Suggestion_FitnessPlanJoinActivity", "onClick setNegativeButton");
            }
        });
        this.f8984c = builder.c();
    }

    @Override // com.huawei.health.suggestion.ui.BaseActivity
    public void initViewController() {
        LogUtil.d("Suggestion_FitnessPlanJoinActivity", "initViewController");
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this.f8983b) {
            LoginInit.getInstance(BaseApplication.getContext()).browsingToLogin(new IBaseResponseCallback() { // from class: hei
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    this.e.d(i, obj);
                }
            }, "");
        } else if (view == this.f8982a) {
            super.onBackPressed();
        }
    }

    public /* synthetic */ void d(int i, Object obj) {
        if (i == 0) {
            g();
        } else {
            LogUtil.a("Suggestion_FitnessPlanJoinActivity", "errorCode is not success", Integer.valueOf(i));
        }
    }

    private void g() {
        if (!CommonUtil.ab(this)) {
            qpx.e(this, getString(R.string.sug_haveno_network));
            return;
        }
        this.f8983b.setClickable(false);
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            LogUtil.j("Suggestion_FitnessPlanJoinActivity", "clickCreatePlanButton, getCurrentPlan : planApi is null.");
            return;
        }
        c(planApi);
        buh.d("planStatistics_need_refresh", "true");
        hcg.e().a(4, new UiCallback<Map>() { // from class: com.huawei.health.suggestion.ui.FitnessPlanJoinActivity.2
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i, String str) {
                LogUtil.j("Suggestion_FitnessPlanJoinActivity", "queryPlanStatistics errorCode = ", Integer.valueOf(i));
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(Map map) {
                LogUtil.a("Suggestion_FitnessPlanJoinActivity", "queryPlanStatistics Success");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void c(final PlanApi planApi) {
        if (HandlerExecutor.d()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: hek
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.c(planApi);
                }
            });
        } else if (planApi.getCurrentIntPlan() == null && btw.i()) {
            planApi.getCurrentPlan(new UiCallback<qey>() { // from class: com.huawei.health.suggestion.ui.FitnessPlanJoinActivity.3
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str) {
                    FitnessPlanJoinActivity.this.h();
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public void onSuccess(qey qeyVar) {
                    FitnessPlanJoinActivity.this.b(qeyVar, planApi);
                }
            });
        } else {
            planApi.e(new UiCallback<IntPlan>() { // from class: com.huawei.health.suggestion.ui.FitnessPlanJoinActivity.1
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str) {
                    FitnessPlanJoinActivity.this.h();
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public void onSuccess(IntPlan intPlan) {
                    FitnessPlanJoinActivity.this.d(planApi, intPlan != null);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(qey qeyVar, final PlanApi planApi) {
        if (btw.f() && qeyVar != null && qeyVar.e() == 0 && qeyVar.k() == 0 && qeyVar.o() == 1) {
            this.f8983b.setClickable(true);
            btw.e(this, qeyVar, new UiCallback<Object>() { // from class: com.huawei.health.suggestion.ui.FitnessPlanJoinActivity.6
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str) {
                    FitnessPlanJoinActivity.this.h();
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onSuccess(Object obj) {
                    FitnessPlanJoinActivity.this.d(planApi, false);
                }
            });
        } else {
            d(planApi, qeyVar != null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(PlanApi planApi, boolean z) {
        if (z) {
            HandlerExecutor.b(new Runnable() { // from class: hel
                @Override // java.lang.Runnable
                public final void run() {
                    this.f36686a.e();
                }
            });
        } else {
            planApi.createFitnessPkg(this.h, new AnonymousClass9());
        }
    }

    public /* synthetic */ void e() {
        this.f8983b.setClickable(true);
        this.f8984c.show();
    }

    /* JADX INFO: renamed from: com.huawei.health.suggestion.ui.FitnessPlanJoinActivity$9, reason: invalid class name */
    public class AnonymousClass9 extends UiCallback<IntPlan> {
        AnonymousClass9() {
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
            FitnessPlanJoinActivity.this.d(i, str);
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onSuccess(IntPlan intPlan) {
            HandlerExecutor.b(new Runnable() { // from class: heh
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.c();
                }
            });
        }

        public /* synthetic */ void c() {
            JumpUtil.a(FitnessPlanJoinActivity.this);
            FitnessPlanJoinActivity.this.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        HandlerExecutor.b(new Runnable() { // from class: hej
            @Override // java.lang.Runnable
            public final void run() {
                this.f36685c.d();
            }
        });
    }

    public /* synthetic */ void d() {
        this.f8983b.setClickable(true);
        qpx.e(btx.c(), qre.f(R.string.sug_haveno_network));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final int i, final String str) {
        HandlerExecutor.b(new Runnable() { // from class: com.huawei.health.suggestion.ui.FitnessPlanJoinActivity.10
            @Override // java.lang.Runnable
            public void run() {
                int i2 = i;
                LogUtil.j("Suggestion_FitnessPlanJoinActivity", "createFitnessPkg errorCode = ", Integer.valueOf(i2), " errorInfo = ", str);
                Toast.makeText(btx.c(), btx.c().getString(R.string.sug_haveno_network), 0).show();
                FitnessPlanJoinActivity.this.f8983b.setClickable(true);
            }
        });
    }

    protected void a() {
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(0);
        getWindow().setFlags(67108864, 67108864);
        getWindow().setFlags(134217728, 134217728);
    }
}
