package com.huawei.ui.main.stories.health.activity.healthdata;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.ui.commonui.subtab.HealthSubTabWidget;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.fragment.StateDayDetailFragment;
import com.huawei.ui.main.stories.health.fragment.StateMonthDetailFragment;
import com.huawei.ui.main.stories.health.fragment.StateWeekDetailFragment;
import com.huawei.ui.main.stories.health.interactors.healthdata.RunningStateIndexData;
import com.huawei.ui.main.stories.template.BaseActivity;
import defpackage.qpn;
import defpackage.qsp;
import defpackage.wka;

/* JADX INFO: loaded from: classes19.dex */
public class StateIndexActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CustomTitleBar f27605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f27606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private qpn f27607c;
    private RunningStateIndexData d = new RunningStateIndexData();
    private HealthSubTabWidget e;
    private HealthViewPager h;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        cancelAdaptRingRegion();
        setContentView(R.layout.activity_state_index_layout);
        this.f27606b = this;
        b();
    }

    private void b() {
        CustomTitleBar customTitleBar = (CustomTitleBar) qsp.a(this, R.id.state_detail_titlebar);
        this.f27605a = customTitleBar;
        customTitleBar.setTitleText(getString(R.string.IDS_data_state_index_title));
        this.f27605a.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.StateIndexActivity.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                StateIndexActivity.this.finish();
            }
        });
        wka.d(this, this.f27605a, "TRAIN_CONDITION");
        this.e = (HealthSubTabWidget) findViewById(R.id.state_subTabLayout);
        HealthViewPager healthViewPager = (HealthViewPager) qsp.a(this, R.id.state_detail_viewpager);
        this.h = healthViewPager;
        if (healthViewPager == null) {
            return;
        }
        healthViewPager.setScrollHeightArea(200);
        this.f27607c = new qpn(this, this.h, this.e);
        if (getIntent() != null && (getIntent().getParcelableExtra("state_index_level_data") instanceof RunningStateIndexData)) {
            this.d = (RunningStateIndexData) getIntent().getParcelableExtra("state_index_level_data");
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("state_index_level_data", this.d);
        StateDayDetailFragment stateDayDetailFragment = new StateDayDetailFragment();
        stateDayDetailFragment.setArguments(bundle);
        StateWeekDetailFragment stateWeekDetailFragment = new StateWeekDetailFragment();
        stateWeekDetailFragment.setArguments(bundle);
        StateMonthDetailFragment stateMonthDetailFragment = new StateMonthDetailFragment();
        stateMonthDetailFragment.setArguments(bundle);
        this.f27607c.b(this.e.b(this.f27606b.getResources().getString(R.string.IDS_fitness_detail_radio_button_tab_day)), stateDayDetailFragment, true);
        this.f27607c.b(this.e.b(this.f27606b.getResources().getString(R.string.IDS_fitness_detail_radio_button_tab_week)), stateWeekDetailFragment, false);
        this.f27607c.b(this.e.b(this.f27606b.getResources().getString(R.string.IDS_fitness_detail_radio_button_tab_month)), stateMonthDetailFragment, false);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
