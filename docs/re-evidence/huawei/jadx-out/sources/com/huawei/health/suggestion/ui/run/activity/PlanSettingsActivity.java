package com.huawei.health.suggestion.ui.run.activity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.plan.api.PlanApi;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.BaseActivity;
import com.huawei.health.suggestion.util.JumpUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.switchbutton.HealthSwitchButton;
import com.huawei.ui.commonui.utils.CustomPermissionAction;
import defpackage.buh;
import defpackage.hvl;
import defpackage.qqs;
import defpackage.qqz;
import health.compact.a.EnvironmentInfo;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public class PlanSettingsActivity extends BaseActivity implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthDivider f9847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f9848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f9849c;
    private LinearLayout d;
    private IntPlan e;
    private LinearLayout f;
    private HealthDivider g;
    private HealthSwitchButton h;
    private LinearLayout i;

    @Override // com.huawei.health.suggestion.ui.BaseActivity
    public void initData() {
    }

    @Override // com.huawei.health.suggestion.ui.BaseActivity
    public void initLayout() {
        setContentView(R.layout.sug_activity_plan_settings);
        c();
        this.f9848b = this;
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            LogUtil.e("PlanSettingsActivity", "initData, getRemindTime : planApi is null.");
        } else {
            planApi.e(new AnonymousClass4());
        }
    }

    /* JADX INFO: renamed from: com.huawei.health.suggestion.ui.run.activity.PlanSettingsActivity$4, reason: invalid class name */
    public class AnonymousClass4 extends UiCallback<IntPlan> {
        AnonymousClass4() {
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
            LogUtil.e("PlanSettingsActivity", "No current plan now.");
            PlanSettingsActivity.this.finish();
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onSuccess(final IntPlan intPlan) {
            if (intPlan == null) {
                LogUtil.j("PlanSettingsActivity", "getCurrentIntPlan data null.");
            } else {
                HandlerExecutor.b(new Runnable() { // from class: hzx
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f37395b.e(intPlan);
                    }
                });
            }
        }

        public /* synthetic */ void e(IntPlan intPlan) {
            PlanSettingsActivity.this.e = intPlan;
            PlanSettingsActivity.this.e();
        }
    }

    @Override // com.huawei.health.suggestion.ui.BaseActivity
    public void initViewController() {
        this.h.setOnClickListener(this);
        this.d.setOnClickListener(this);
        this.f.setOnClickListener(this);
    }

    private void c() {
        this.i = (LinearLayout) findViewById(R.id.sync_calendar_layout);
        this.g = (HealthDivider) findViewById(R.id.sync_calendar_divider);
        if (EnvironmentInfo.m()) {
            ReleaseLogUtil.d("PlanSettingsActivity", "isMobileAppEngine is true");
            this.i.setVisibility(8);
            this.g.setVisibility(8);
        }
        this.h = (HealthSwitchButton) findViewById(R.id.sug_sync_calendar_enabled);
        ImageView imageView = (ImageView) findViewById(R.id.exe_day_edit_arrow);
        this.d = (LinearLayout) findViewById(R.id.exe_day_container);
        this.f9847a = (HealthDivider) findViewById(R.id.exe_day_divider);
        ImageView imageView2 = (ImageView) findViewById(R.id.remind_time_edit_arrow);
        this.f = (LinearLayout) findViewById(R.id.remind_time_container);
        if (LanguageUtil.ba(this)) {
            if (qqs.e(BaseApplication.getContext())) {
                BitmapDrawable bitmapDrawableE = qqz.e(this.f9848b, getResources().getDrawable(R.drawable.sport_tab_arrow_right_white));
                imageView.setImageDrawable(bitmapDrawableE);
                imageView2.setImageDrawable(bitmapDrawableE);
            } else {
                imageView.setImageResource(com.huawei.ui.commonui.R.drawable.common_ui_arrow_left);
                imageView2.setImageResource(com.huawei.ui.commonui.R.drawable.common_ui_arrow_left);
            }
        } else if (qqs.e(BaseApplication.getContext())) {
            imageView.setImageResource(R.drawable.sport_tab_arrow_right_white);
            imageView2.setImageResource(R.drawable.sport_tab_arrow_right_white);
        } else {
            imageView.setImageResource(com.huawei.ui.commonui.R.drawable.common_ui_arrow_right);
            imageView2.setImageResource(com.huawei.ui.commonui.R.drawable.common_ui_arrow_right);
        }
        String strE = buh.e("ai_plan_sync");
        boolean z = (strE == null || strE.equals("")) ? false : true;
        this.f9849c = z;
        this.h.setChecked(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (this.e == null) {
            LogUtil.a("PlanSettingsActivity", "setExeDayContainerView intPlan == null");
            return;
        }
        if (IntPlan.PlanType.AI_RUN_PLAN.equals(this.e.getPlanType()) || IntPlan.PlanType.AI_FITNESS_PLAN.equals(this.e.getPlanType())) {
            ViewGroup.LayoutParams layoutParams = this.d.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMarginStart(marginLayoutParams.getMarginStart() - ((Integer) BaseActivity.getSafeRegionWidth().first).intValue());
                marginLayoutParams.setMarginEnd(marginLayoutParams.getMarginEnd() - ((Integer) BaseActivity.getSafeRegionWidth().second).intValue());
                this.d.setLayoutParams(marginLayoutParams);
                return;
            }
            return;
        }
        LinearLayout linearLayout = this.d;
        if (linearLayout == null || this.f9847a == null) {
            return;
        }
        linearLayout.setVisibility(8);
        this.f9847a.setVisibility(8);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IntPlan intPlan = this.e;
        if (intPlan == null) {
            LogUtil.e("PlanSettingsActivity", "showEditTrainingDay mCurrentPlan == null");
            return;
        }
        if (view == this.h) {
            if (this.f9849c) {
                a();
                return;
            } else {
                j();
                return;
            }
        }
        if (intPlan.getPlanType() == IntPlan.PlanType.AI_RUN_PLAN) {
            c(view);
        } else if (this.e.getPlanType() == IntPlan.PlanType.AI_FITNESS_PLAN || this.e.getPlanType() == IntPlan.PlanType.FIT_PLAN) {
            d(view);
        } else {
            LogUtil.e("PlanSettingsActivity", "click non support type");
        }
    }

    private void c(View view) {
        if (this.e.getCompatiblePlan() == null) {
            LogUtil.e("PlanSettingsActivity", "AI_RUN_PLAN compatiblePlan null.");
            return;
        }
        if (view == this.d) {
            Intent intent = new Intent(this, (Class<?>) RunPlanCreateActivity.class);
            intent.putExtra("type", 1);
            intent.putExtra("trainLevel", this.e.getCompatiblePlan().getTrainLevel());
            ArrayList<Integer> arrayList = new ArrayList<>(this.e.getCompatiblePlan().getRunDate());
            ArrayList<Integer> arrayList2 = new ArrayList<>(this.e.getCompatiblePlan().getExeDate());
            intent.putIntegerArrayListExtra("runDate", arrayList);
            intent.putIntegerArrayListExtra("exeDate", arrayList2);
            intent.putExtra("planId", this.e.getPlanId());
            startActivity(intent);
            return;
        }
        if (view == this.f) {
            Intent intent2 = new Intent(this, (Class<?>) ExerciseRemindActivity.class);
            intent2.putExtra("planType", this.e.getCompatiblePlan().acquireType());
            startActivity(intent2);
            return;
        }
        LogUtil.e("PlanSettingsActivity", "click nothing");
    }

    private void d(View view) {
        if (view == this.d) {
            JumpUtil.b(this);
            LogUtil.a("PlanSettingsActivity", "Click exeDay editor of plan ", this.e.getMetaInfo() != null ? this.e.getMetaInfo().getName() : "");
        } else {
            if (view == this.f) {
                Intent intent = new Intent(this, (Class<?>) ExerciseRemindActivity.class);
                if (this.e.getCompatiblePlan() != null) {
                    intent.putExtra("planType", this.e.getCompatiblePlan().acquireType());
                }
                startActivity(intent);
                LogUtil.a("PlanSettingsActivity", "Click remind editor of plan ", this.e.getMetaInfo() != null ? this.e.getMetaInfo().getName() : "");
                return;
            }
            LogUtil.e("PlanSettingsActivity", "click nothing");
        }
    }

    private void a() {
        if (hvl.d(getApplicationContext())) {
            d();
        } else {
            PermissionUtil.d(this, PermissionUtil.PermissionType.CALENDAR, new b(this, false, null));
        }
    }

    public void d() {
        this.f9849c = false;
        this.h.setChecked(false);
        hvl.e(this.f9848b, buh.e("ai_plan_sync_name"), this.e.getPlanType());
        buh.c("ai_plan_sync_name");
        buh.c("ai_plan_sync");
    }

    private void j() {
        if (hvl.d(getApplicationContext())) {
            b();
        } else {
            PermissionUtil.d(this, PermissionUtil.PermissionType.CALENDAR, new b(this, true, null));
        }
    }

    public void b() {
        this.h.setChecked(true);
        this.f9849c = true;
        hvl.e(this.e, this.f9848b, 1);
    }

    public static class b extends CustomPermissionAction {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference<PlanSettingsActivity> f9851c;
        private final boolean e;

        /* synthetic */ b(PlanSettingsActivity planSettingsActivity, boolean z, AnonymousClass4 anonymousClass4) {
            this(planSettingsActivity, z);
        }

        private b(PlanSettingsActivity planSettingsActivity, boolean z) {
            super(planSettingsActivity);
            this.f9851c = new WeakReference<>(planSettingsActivity);
            this.e = z;
        }

        private PlanSettingsActivity d() {
            PlanSettingsActivity planSettingsActivity = this.f9851c.get();
            if (planSettingsActivity != null && !planSettingsActivity.isFinishing() && !planSettingsActivity.isDestroyed()) {
                return planSettingsActivity;
            }
            ReleaseLogUtil.e("PlanSettingsActivity", "InnerCustomPermissionAction getActivity activity ", planSettingsActivity);
            return null;
        }

        private void e() {
            PlanSettingsActivity planSettingsActivityD = d();
            if (planSettingsActivityD == null) {
                return;
            }
            planSettingsActivityD.h.setChecked(planSettingsActivityD.f9849c);
        }

        @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
        public void onGranted() {
            ReleaseLogUtil.d("PlanSettingsActivity", "InnerCustomPermissionAction onGranted");
            PlanSettingsActivity planSettingsActivityD = d();
            if (planSettingsActivityD == null) {
                return;
            }
            if (this.e) {
                planSettingsActivityD.b();
            } else {
                planSettingsActivityD.d();
            }
        }

        @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
        public void onDenied(String str) {
            super.onDenied(str);
            ReleaseLogUtil.d("PlanSettingsActivity", "InnerCustomPermissionAction onDenied");
            e();
        }

        @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
        public void onForeverDenied(PermissionUtil.PermissionType permissionType) {
            super.onForeverDenied(permissionType, new View.OnClickListener() { // from class: hzv
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f37393b.c(view);
                }
            }, new View.OnClickListener() { // from class: hzw
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f37394b.a(view);
                }
            });
            ReleaseLogUtil.d("PlanSettingsActivity", "InnerCustomPermissionAction onForeverDenied");
        }

        public /* synthetic */ void c(View view) {
            ReleaseLogUtil.e("PlanSettingsActivity", "InnerCustomPermissionAction onForeverDenied positiveListener");
            e();
        }

        public /* synthetic */ void a(View view) {
            ReleaseLogUtil.e("PlanSettingsActivity", "InnerCustomPermissionAction onForeverDenied negativeListener");
            e();
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
