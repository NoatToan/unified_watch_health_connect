package com.huawei.basichealthmodel.ui.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.huawei.basichealthmodel.R;
import com.huawei.basichealthmodel.ui.adapter.HealthGoalAdapter;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.recycleview.HealthLinearLayoutManager;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import defpackage.can;
import defpackage.cbg;
import defpackage.cbk;
import defpackage.ccr;

/* JADX INFO: loaded from: classes23.dex */
public class HealthGoalView extends FrameLayout implements HealthGoalAdapter.HealthPlanListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthButton f5367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f5368b;
    private int d;
    private HealthGoalAdapter e;

    public HealthGoalView(Context context) {
        super(context);
        e(context);
    }

    public HealthGoalView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        e(context);
    }

    public HealthGoalView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        e(context);
    }

    private void e(final Context context) {
        View.inflate(context, R.layout.health_goal_layout, this);
        HealthRecycleView healthRecycleView = (HealthRecycleView) findViewById(R.id.health_create_goal_recycler);
        healthRecycleView.setLayoutManager(new HealthLinearLayoutManager(context));
        healthRecycleView.setIsScroll(false);
        healthRecycleView.setIsConsumption(true);
        HealthGoalAdapter healthGoalAdapter = new HealthGoalAdapter(this);
        this.e = healthGoalAdapter;
        healthRecycleView.setAdapter(healthGoalAdapter);
        this.f5367a = (HealthButton) findViewById(R.id.health_create_goal_next);
        d(0.3f, false);
        this.f5367a.setOnClickListener(new View.OnClickListener() { // from class: cbj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f1427a.b(context, view);
            }
        });
    }

    public /* synthetic */ void b(Context context, View view) {
        if (TextUtils.isEmpty(this.f5368b)) {
            LogUtil.a("HL_HealthGoalView", "mJumpPlanParams is empty");
        } else {
            cbg.e(context, "com.huawei.health.h5.blood-pressure", this.f5368b);
            cbk.a(AnalyticsValue.HEALTH_MODEL_CHALLENGE_CHANGE_2119076, this.d);
        }
    }

    public void setGoalData() {
        HealthGoalAdapter healthGoalAdapter = this.e;
        if (healthGoalAdapter != null) {
            healthGoalAdapter.d(ccr.d());
        }
    }

    @Override // com.huawei.basichealthmodel.ui.adapter.HealthGoalAdapter.HealthPlanListener
    public void onPlanClick(can canVar) {
        if (canVar == null) {
            LogUtil.j("HL_HealthGoalView", "onPlanClick bean is null");
            d(0.3f, false);
            return;
        }
        boolean z = canVar.c() != 0;
        int iE = canVar.e();
        this.d = iE;
        this.f5368b = z ? ccr.e(iE) : "";
        d(z ? 1.0f : 0.3f, z);
    }

    private void d(float f, boolean z) {
        this.f5367a.setAlpha(f);
        this.f5367a.setClickable(z);
    }
}
