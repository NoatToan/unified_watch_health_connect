package com.huawei.health.suggestion.ui.plan.activity;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.BaseActivity;
import com.huawei.health.suggestion.ui.plan.adapter.FitnessDetailAdapter;
import com.huawei.health.suggestion.ui.plan.mvp.PlanDetailContract;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import defpackage.hvi;
import defpackage.hvm;
import defpackage.qre;
import defpackage.qrs;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class FitnessPlanDetailActivity extends BaseActivity implements View.OnClickListener, PlanDetailContract.Iview {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CustomTitleBar f9589a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private FitnessDetailAdapter f9591c;
    private ConstraintLayout d;
    private Group e;
    private String f;
    private FrameLayout g;
    private PlanDetailContract.Ipresenter h;
    private int i = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private NoTitleCustomAlertDialog f9590b = null;

    @Override // com.huawei.health.suggestion.ui.plan.mvp.PlanDetailContract.Iview
    public Context acquireContext() {
        return this;
    }

    @Override // com.huawei.health.suggestion.ui.BaseActivity
    public void initViewController() {
    }

    static /* synthetic */ int e(FitnessPlanDetailActivity fitnessPlanDetailActivity, int i) {
        int i2 = fitnessPlanDetailActivity.i + i;
        fitnessPlanDetailActivity.i = i2;
        return i2;
    }

    @Override // com.huawei.health.suggestion.ui.BaseActivity
    public void initData() {
        if (getIntent() == null) {
            LogUtil.j("Suggestion_FitnessPlanDetailActivity", "initData: getIntent is null");
            finish();
            return;
        }
        this.f = getIntent().getStringExtra("params_plan_id_key");
        int intExtra = getIntent().getIntExtra("params_plan_TYPE_key", IntPlan.PlanType.FIT_PLAN.getType());
        if (TextUtils.isEmpty(this.f)) {
            LogUtil.j("Suggestion_FitnessPlanDetailActivity", "initData: getIntent plan id is empty");
            finish();
            return;
        }
        LogUtil.j("Suggestion_FitnessPlanDetailActivity", "initData: planType is ", Integer.valueOf(intExtra));
        if (intExtra == IntPlan.PlanType.AI_RUN_PLAN.getType()) {
            this.h = new hvi(this.f, this);
        } else {
            this.h = new hvm(this.f, this);
        }
    }

    @Override // com.huawei.health.suggestion.ui.BaseActivity
    public void initLayout() {
        setContentView(R.layout.sug_activity_fitness_plan_detail);
        this.g = (FrameLayout) findViewById(R.id.detail_paid_view_fl);
        this.f9589a = (CustomTitleBar) findViewById(R.id.detail_paid_titlebar);
        this.d = (ConstraintLayout) findViewById(R.id.detail_net_error);
        this.e = (Group) findViewById(R.id.detail_content_group);
        HealthRecycleView healthRecycleView = (HealthRecycleView) findViewById(R.id.detail_paid_rv);
        healthRecycleView.setLayoutManager(new LinearLayoutManager(this));
        FitnessDetailAdapter fitnessDetailAdapter = new FitnessDetailAdapter();
        this.f9591c = fitnessDetailAdapter;
        healthRecycleView.setAdapter(fitnessDetailAdapter);
        this.d.setOnClickListener(this);
        if (LanguageUtil.ba(this)) {
            this.f9589a.setLeftButtonDrawable(getResources().getDrawable(com.huawei.ui.commonui.R.mipmap.ic_health_rtl_back_black), qre.f(com.huawei.ui.commonui.R.string.accessibility_go_back));
        } else {
            this.f9589a.setLeftButtonDrawable(getResources().getDrawable(com.huawei.ui.commonui.R.mipmap.ic_health_nav_back_black), qre.f(com.huawei.ui.commonui.R.string.accessibility_go_back));
        }
        healthRecycleView.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.huawei.health.suggestion.ui.plan.activity.FitnessPlanDetailActivity.3
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                super.onScrolled(recyclerView, i, i2);
                FitnessPlanDetailActivity.e(FitnessPlanDetailActivity.this, i2);
                if (FitnessPlanDetailActivity.this.i > 100) {
                    FitnessPlanDetailActivity.this.f9589a.setTitleBarBackgroundColor(FitnessPlanDetailActivity.this.getResources().getColor(R.color.colorSubBackground));
                } else {
                    FitnessPlanDetailActivity.this.f9589a.setTitleBarBackgroundColor(FitnessPlanDetailActivity.this.getResources().getColor(R.color.common_transparent));
                }
            }
        });
        a();
    }

    private void a() {
        if (CommonUtil.ab(this)) {
            this.d.setVisibility(8);
            this.e.setVisibility(0);
            PlanDetailContract.Ipresenter ipresenter = this.h;
            if (ipresenter != null) {
                ipresenter.getData();
                return;
            }
            return;
        }
        this.e.setVisibility(8);
        this.d.setVisibility(0);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        PlanDetailContract.Ipresenter ipresenter = this.h;
        if (ipresenter != null) {
            ipresenter.onDestroy();
            this.h = null;
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        PlanDetailContract.Ipresenter ipresenter = this.h;
        if (ipresenter != null) {
            ipresenter.onResume();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (!qrs.c(500) && view.getId() == R.id.detail_net_error) {
            a();
        }
    }

    @Override // com.huawei.health.suggestion.ui.plan.mvp.PlanDetailContract.Iview
    public void addTradeView(View view) {
        if (this.g == null) {
            LogUtil.j("Suggestion_FitnessPlanDetailActivity", "addTradeView>mPaidViewContent is null");
        } else if (view != null) {
            LogUtil.a("Suggestion_FitnessPlanDetailActivity", "addTradeView: mTradeView is added");
            this.g.addView(view);
        } else {
            LogUtil.j("Suggestion_FitnessPlanDetailActivity", "addTradeView>mTradeView is_null,Id=", this.f);
        }
    }

    @Override // com.huawei.health.suggestion.ui.plan.mvp.PlanDetailContract.Iview
    public void recycleTradeView(View view) {
        FrameLayout frameLayout;
        if (view == null || (frameLayout = this.g) == null) {
            return;
        }
        frameLayout.removeView(view);
    }

    @Override // com.huawei.health.suggestion.ui.plan.mvp.PlanDetailContract.Iview
    public void bindData(List<String> list) {
        FitnessDetailAdapter fitnessDetailAdapter = this.f9591c;
        if (fitnessDetailAdapter != null) {
            fitnessDetailAdapter.b(list);
        }
    }

    @Override // com.huawei.health.suggestion.ui.plan.mvp.PlanDetailContract.Iview
    public void bindTitleText(String str) {
        CustomTitleBar customTitleBar = this.f9589a;
        if (customTitleBar != null) {
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            customTitleBar.setTitleText(str);
        }
    }

    @Override // com.huawei.health.suggestion.ui.plan.mvp.PlanDetailContract.Iview
    public void finishView() {
        finish();
    }

    @Override // com.huawei.health.suggestion.ui.plan.mvp.PlanDetailContract.Iview
    public void showDialog() {
        if (this.f9590b == null) {
            NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this);
            builder.b(R.string.IDS_sug_has_doing_plan_content);
            builder.c(R.string.IDS_FitnessAdvice_has_doing_plan_ok, new View.OnClickListener() { // from class: hoz
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.d.c(view);
                }
            });
            builder.a(R.string.sug_dialog_yes, new View.OnClickListener() { // from class: hpf
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LogUtil.a("Suggestion_FitnessPlanDetailActivity", "onClick setNegativeButton");
                }
            });
            this.f9590b = builder.c();
        }
        this.f9590b.show();
    }

    public /* synthetic */ void c(View view) {
        PlanDetailContract.Ipresenter ipresenter = this.h;
        if (ipresenter != null) {
            ipresenter.viewCurrentPlan();
            finishView();
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
