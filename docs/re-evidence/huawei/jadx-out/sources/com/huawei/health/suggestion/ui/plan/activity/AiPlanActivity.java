package com.huawei.health.suggestion.ui.plan.activity;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.FragmentTransaction;
import com.huawei.basefitnessadvice.model.Plan;
import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.plan.api.PlanApi;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.BaseStateActivity;
import com.huawei.health.suggestion.ui.callback.UiPagingCallback;
import com.huawei.health.suggestion.ui.plan.fragment.AiPlanFragment;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.ibl;
import defpackage.ieb;
import defpackage.qqz;
import defpackage.qrs;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import java.lang.ref.WeakReference;
import java.util.Calendar;

/* JADX INFO: loaded from: classes2.dex */
public class AiPlanActivity extends BaseStateActivity {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Float f9585c = Float.valueOf(35.0f);
    private static final Float e = Float.valueOf(28.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f9586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ImageView f9587b;
    private HealthTextView d;
    private HealthTextView g;
    private Handler i = new b(Looper.getMainLooper(), this);
    private Plan j;

    @Override // com.huawei.health.suggestion.ui.BaseStateActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(0);
        getWindow().setFlags(67108864, 67108864);
        clearBackgroundDrawable();
    }

    @Override // com.huawei.health.suggestion.ui.BaseStateActivity
    public void initLayout() {
        setContentView(R.layout.sug_activity_ai_plan);
        if (getIntent() == null) {
            LogUtil.e("Suggestion_AiPlanActivity", "intent is null");
            return;
        }
        this.f9586a = this;
        this.f9587b = (ImageView) findViewById(R.id.plan_ai_background);
        this.g = (HealthTextView) findViewById(R.id.hi_coach);
        this.d = (HealthTextView) findViewById(R.id.hi_coach_advice);
        a(this.g, f9585c.floatValue());
        a(this.d, e.floatValue());
        if (qrs.ac()) {
            qrs.a(this.d);
        }
        this.g.setText(ieb.b());
        boolean zBa = LanguageUtil.ba(this.f9586a);
        BitmapDrawable bitmapDrawableE = qqz.e(this.f9586a, R.drawable.ai_bg);
        if (zBa) {
            this.f9587b.setImageDrawable(bitmapDrawableE);
        } else {
            this.f9587b.setImageDrawable(this.f9586a.getResources().getDrawable(R.drawable.ai_bg));
        }
        cancelAdaptRingRegion();
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.sug_plan_content);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = -((int) this.f9586a.getResources().getDimension(R.dimen.defaultCornerRadiusL));
        layoutParams.addRule(3, R.id.plan_ai_layout);
        linearLayout.setLayoutParams(layoutParams);
    }

    @Override // com.huawei.health.suggestion.ui.BaseStateActivity
    public void initViewController() {
        LogUtil.a("Suggestion_AiPlanActivity", "initViewController()");
    }

    @Override // com.huawei.health.suggestion.ui.BaseStateActivity
    public void initData() {
        c();
        LogUtil.a("Suggestion_AiPlanActivity", "initData()");
        new AiPlanFragment();
        AiPlanFragment aiPlanFragmentA = AiPlanFragment.a(0);
        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransactionBeginTransaction.replace(R.id.sug_plan_content, aiPlanFragmentA);
        fragmentTransactionBeginTransaction.commitAllowingStateLoss();
    }

    private void c() {
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            LogUtil.e("Suggestion_AiPlanActivity", "getMyFitnessPlansInfo, getCurrentPlan : planApi is null.");
        } else {
            planApi.e(new a(this));
        }
    }

    /* JADX INFO: loaded from: classes9.dex */
    static class a extends UiPagingCallback<IntPlan> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        WeakReference<AiPlanActivity> f9588b;

        a(AiPlanActivity aiPlanActivity) {
            this.f9588b = new WeakReference<>(aiPlanActivity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.health.suggestion.ui.callback.UiPagingCallback
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onSuccessFirst(IntPlan intPlan) {
            AiPlanActivity aiPlanActivity = this.f9588b.get();
            if (aiPlanActivity == null) {
                return;
            }
            if (intPlan != null && IntPlan.PlanType.AI_RUN_PLAN.equals(intPlan.getPlanType())) {
                aiPlanActivity.j = intPlan.getCompatiblePlan();
            }
            Handler handler = aiPlanActivity.i;
            if (handler != null) {
                handler.sendMessage(handler.obtainMessage(1));
            }
        }

        @Override // com.huawei.health.suggestion.ui.callback.UiPagingCallback
        public void onFailureFirst(int i, String str) {
            Handler handler;
            AiPlanActivity aiPlanActivity = this.f9588b.get();
            if (aiPlanActivity == null || (handler = aiPlanActivity.i) == null) {
                return;
            }
            handler.sendMessage(handler.obtainMessage(1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        String string;
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        Plan plan = this.j;
        if (plan == null) {
            LogUtil.j("Suggestion_AiPlanActivity", "setCoachTipText is mRunPlan = null");
            this.d.setText(ieb.e());
            return;
        }
        int iB = ibl.b(plan, timeInMillis);
        if (iB == 0) {
            string = this.f9586a.getResources().getString(R.string.IDS_sug_today_run_plan);
        } else if (iB == 1) {
            string = this.f9586a.getResources().getString(R.string.IDS_sug_today_plan_rest);
        } else if (iB == 2) {
            string = this.f9586a.getResources().getString(R.string.IDS_sug_yesterday_plan);
        } else if (iB == 3) {
            string = this.f9586a.getResources().getString(R.string.IDS_sug_rest_one_plan);
        } else if (iB == 4) {
            string = this.f9586a.getResources().getString(R.string.IDS_sug_rest_two_plan);
        } else if (iB == 5) {
            string = this.f9586a.getResources().getString(R.string.IDS_sug_rest_three_plan);
        } else {
            string = this.f9586a.getResources().getString(R.string.IDS_sug_finish_today_plan);
        }
        LogUtil.a("Suggestion_AiPlanActivity", "setCoachTipText tipString is", string);
        this.d.setText(string);
    }

    /* JADX INFO: loaded from: classes9.dex */
    static class b extends BaseHandler<AiPlanActivity> {
        b(Looper looper, AiPlanActivity aiPlanActivity) {
            super(looper, aiPlanActivity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(AiPlanActivity aiPlanActivity, Message message) {
            if (message.what == 1) {
                aiPlanActivity.e();
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // com.huawei.health.suggestion.ui.BaseStateActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        HealthTextView healthTextView = this.g;
        if (healthTextView != null) {
            healthTextView.setText(ieb.b());
        }
        if (this.d != null) {
            e();
        }
    }

    private void a(HealthTextView healthTextView, float f) {
        if (qrs.ac()) {
            healthTextView.setTextSize(1, f);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
