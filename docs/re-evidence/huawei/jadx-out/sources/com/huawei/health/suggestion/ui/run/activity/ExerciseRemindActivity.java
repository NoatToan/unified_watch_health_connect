package com.huawei.health.suggestion.ui.run.activity;

import android.content.Intent;
import android.content.res.Configuration;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.plan.api.PlanApi;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.BaseActivity;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.switchbutton.HealthSwitchButton;
import com.huawei.ui.commonui.timepicker.HealthTimePickerDialog;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import defpackage.buh;
import defpackage.hvp;
import defpackage.ifp;
import defpackage.lmf;
import defpackage.ped;
import defpackage.qrk;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import java.util.Date;
import java.util.HashMap;

/* JADX INFO: loaded from: classes9.dex */
public class ExerciseRemindActivity extends BaseActivity implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f9840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTimePickerDialog f9841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f9842c;
    private HealthTextView d;
    private CustomTitleBar e;
    private HealthTextView f;
    private HealthSwitchButton g;
    private int h = -1;
    private ImageView j;

    @Override // com.huawei.health.suggestion.ui.BaseActivity
    public void initLayout() {
        cancelAdaptRingRegion();
        setContentView(R.layout.sug_run_activity_exercise_remind);
        i();
    }

    @Override // com.huawei.health.suggestion.ui.BaseActivity
    public void initViewController() {
        g();
    }

    @Override // com.huawei.health.suggestion.ui.BaseActivity
    public void initData() {
        int iD;
        Intent intent = getIntent();
        if (intent != null) {
            this.h = intent.getIntExtra("planType", -1);
        }
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            LogUtil.e("ExerciseRemindActivity", "initData, getRemindTime : planApi is null.");
            return;
        }
        planApi.setPlanType(this.h);
        int remindTime = planApi.getRemindTime();
        if (this.h == 0) {
            iD = ifp.d(buh.e("runLastRemindTime"), 1080);
        } else {
            iD = ifp.d(buh.e("intLastRemindTime"), 1080);
        }
        this.f9840a = ped.d(remindTime > -1 ? remindTime : iD);
        if (remindTime <= -1) {
            remindTime = iD;
        }
        this.f9842c = ped.c(remindTime);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0068  */
    private void i() {
        this.g = (HealthSwitchButton) findViewById(R.id.sug_sc_enabled);
        this.d = (HealthTextView) findViewById(R.id.sug_txt_remind_time);
        this.f = (HealthTextView) findViewById(R.id.sug_txt_title_exercise_remind);
        this.e = (CustomTitleBar) findViewById(R.id.sug_titleBar);
        this.j = (ImageView) findViewById(R.id.sug_iv_arrow);
        if (LanguageUtil.ba(this)) {
            this.j.setImageResource(com.huawei.ui.commonui.R.drawable.common_ui_arrow_left);
        } else {
            this.j.setImageResource(com.huawei.ui.commonui.R.drawable.common_ui_arrow_right);
        }
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi != null) {
            planApi.setPlanType(this.h);
            if (planApi.isOpenRemind()) {
                this.g.setChecked(true);
                c(true);
            } else {
                this.g.setChecked(false);
                c(false);
            }
        } else {
            this.g.setChecked(false);
            c(false);
        }
        this.d.setText(e());
    }

    private void f() {
        HealthTimePickerDialog healthTimePickerDialog = this.f9841b;
        if (healthTimePickerDialog != null && healthTimePickerDialog.isShowing()) {
            this.f9841b.dismiss();
        }
        HealthTimePickerDialog healthTimePickerDialog2 = new HealthTimePickerDialog(this, new HealthTimePickerDialog.TimeSelectedListener() { // from class: com.huawei.health.suggestion.ui.run.activity.ExerciseRemindActivity.2
            @Override // com.huawei.ui.commonui.timepicker.HealthTimePickerDialog.TimeSelectedListener
            public void onTimeSelected(int i, int i2) {
                ExerciseRemindActivity.this.f9840a = i;
                ExerciseRemindActivity.this.f9842c = i2;
                ExerciseRemindActivity.this.c();
            }
        });
        this.f9841b = healthTimePickerDialog2;
        healthTimePickerDialog2.b(0, 0, 0, this.f9840a, this.f9842c);
        this.f9841b.e(getString(com.huawei.health.servicesui.R.string.sug_exercise_remind));
    }

    private void g() {
        this.g.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.health.suggestion.ui.run.activity.ExerciseRemindActivity.1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                ExerciseRemindActivity.this.c(z);
            }
        });
        this.e.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.run.activity.ExerciseRemindActivity.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ExerciseRemindActivity.this.b();
            }
        });
        this.e.setRightButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.run.activity.ExerciseRemindActivity.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ExerciseRemindActivity.this.d();
            }
        });
        this.d.setOnClickListener(this);
        this.j.setOnClickListener(this);
    }

    private String e() {
        return qrk.a(getApplicationContext(), new Date(0, 0, 0, this.f9840a, this.f9842c, 0).getTime(), 1);
    }

    private int a() {
        return (this.f9840a * 60) + this.f9842c;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this.d || view == this.j) {
            j();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            LogUtil.e("ExerciseRemindActivity", "conformSetExerciseRemind, updateRemindTime : planApi is null.");
            return;
        }
        planApi.setPlanType(this.h);
        int iA = a();
        if (this.g.isChecked()) {
            planApi.updateRemindTime(true, iA);
        } else {
            planApi.updateRemindTime(false, -1);
        }
        if (this.h == 0) {
            buh.d("runLastRemindTime", String.valueOf(iA));
        } else {
            buh.d("intLastRemindTime", String.valueOf(iA));
        }
        planApi.e(new UiCallback<IntPlan>() { // from class: com.huawei.health.suggestion.ui.run.activity.ExerciseRemindActivity.3
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i, String str) {
                LogUtil.e("ExerciseRemindActivity", "No current plan now.");
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onSuccess(IntPlan intPlan) {
                if (intPlan != null) {
                    LogUtil.j("ExerciseRemindActivity", "getCurrentIntPlan data null.");
                    HashMap map = new HashMap();
                    map.put("click", 1);
                    map.put("type", Integer.valueOf(intPlan.getPlanType().getType()));
                    map.put("plan_name", intPlan.getMetaInfo().getName());
                    lmf.d().c(BaseApplication.getContext(), AnalyticsValue.INT_PLAN_1120046.value(), map, 0);
                }
            }
        });
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        this.d.setText(e());
        this.f9841b.dismiss();
    }

    private void j() {
        f();
        this.f9841b.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(boolean z) {
        this.d.setEnabled(z);
        this.j.setEnabled(z);
        if (z) {
            this.f.setAlpha(1.0f);
            this.d.setAlpha(1.0f);
            this.j.setAlpha(1.0f);
        } else {
            this.f.setAlpha(0.2f);
            this.d.setAlpha(0.4f);
            this.j.setAlpha(0.4f);
            hvp.d();
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.d.setText(e());
        f();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
