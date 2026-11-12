package com.huawei.health.suggestion.ui.plan.activity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.plan.adapter.IntPlanDetailAdapter;
import com.huawei.health.suggestion.ui.plan.viewmodel.IntPlanDetailDataViewModel;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import defpackage.ibk;
import defpackage.ien;
import defpackage.njy;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class PlanListActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Observer<ibk> f9593a = new Observer() { // from class: com.huawei.health.suggestion.ui.plan.activity.PlanListActivity$$ExternalSyntheticLambda0
        @Override // androidx.lifecycle.Observer
        /* JADX INFO: renamed from: onChanged */
        public final void b(Object obj) {
            this.e.b((ibk) obj);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CustomTitleBar f9594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private IntPlanDetailAdapter f9595c;
    private IntPlanDetailDataViewModel d;
    private Intent e;
    private HealthRecycleView f;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.sug_layout_recommend_fitplanlist);
        this.e = getIntent();
        this.f9594b = (CustomTitleBar) findViewById(R.id.sug_fitness_title);
        c();
        HealthRecycleView healthRecycleView = (HealthRecycleView) findViewById(R.id.plan_list_recycle_view);
        this.f = healthRecycleView;
        ien.b(this, healthRecycleView);
        IntPlanDetailAdapter intPlanDetailAdapter = new IntPlanDetailAdapter(this, getSupportFragmentManager(), this.f);
        this.f9595c = intPlanDetailAdapter;
        this.f.setAdapter(intPlanDetailAdapter);
        this.d = (IntPlanDetailDataViewModel) new ViewModelProvider(this).get(IntPlanDetailDataViewModel.class);
        b();
        this.d.b(this.f9593a);
        this.d.d(false);
    }

    private void c() {
        Intent intent;
        if (this.f9594b == null || (intent = this.e) == null) {
            return;
        }
        String stringExtra = intent.getStringExtra("CUSTOM_TITLE");
        if (TextUtils.isEmpty(stringExtra)) {
            return;
        }
        this.f9594b.setTitleText(stringExtra);
    }

    private void b() {
        Intent intent;
        if (this.d == null || (intent = this.e) == null) {
            return;
        }
        ArrayList<Integer> integerArrayListExtra = intent.getIntegerArrayListExtra("FILTERED_PLAN_TYPES");
        if (njy.e(integerArrayListExtra)) {
            return;
        }
        this.d.c(integerArrayListExtra);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(ibk ibkVar) {
        LogUtil.a("PlanListActivity", "notifyUpdateItemData enter");
        if (ibkVar == null) {
            LogUtil.j("PlanListActivity", "notifyUpdateItemData itemData is null");
            return;
        }
        IntPlanDetailAdapter intPlanDetailAdapter = this.f9595c;
        if (intPlanDetailAdapter != null) {
            intPlanDetailAdapter.d(ibkVar);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
