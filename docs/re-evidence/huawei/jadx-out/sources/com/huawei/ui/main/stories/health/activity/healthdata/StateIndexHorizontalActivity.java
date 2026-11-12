package com.huawei.ui.main.stories.health.activity.healthdata;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.calendarview.HealthCalendar;
import com.huawei.ui.commonui.calendarview.HealthCalendarActivity;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.fragment.rqpackage.RqLineChartHolderView;
import com.huawei.ui.main.stories.health.fragment.rqpackage.RqLineHorizontalChartHolderView;
import com.huawei.ui.main.stories.template.BaseActivity;
import defpackage.qre;
import defpackage.qrs;
import defpackage.qsp;
import health.compact.a.LanguageUtil;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public class StateIndexHorizontalActivity extends BaseActivity {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthCalendar f27611c;
    private Context d;
    private RqLineHorizontalChartHolderView e;
    private CustomTitleBar i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f27609a = 1;
    private boolean g = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f27610b = false;
    private long h = 0;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_state_index_horizontal_layout);
        this.d = BaseApplication.getContext();
        b();
    }

    private void b() {
        CustomTitleBar customTitleBar = (CustomTitleBar) qsp.a(this, R.id.state_detail_titlebar);
        this.i = customTitleBar;
        customTitleBar.setTitleText(getString(R.string.IDS_hwh_motiontrack_detail_chart_title_three, new Object[]{getString(R.string.IDS_data_state_index_title), getString(R.string.IDS_data_fitness_condition), getString(R.string.IDS_data_fatigue_condition)}));
        if (qrs.x(this.d)) {
            if (LanguageUtil.ba(this.d)) {
                this.i.setLeftButtonDrawable(ContextCompat.getDrawable(this.d, R.drawable.ic_back_white_reverse), qre.f(R.string.accessibility_go_back));
            } else {
                this.i.setLeftButtonDrawable(ContextCompat.getDrawable(this.d, R.drawable.ic_back_white), qre.f(R.string.accessibility_go_back));
            }
        }
        this.i.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.StateIndexHorizontalActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                StateIndexHorizontalActivity.this.finish();
            }
        });
        Intent intent = getIntent();
        if (intent != null) {
            this.f27609a = intent.getIntExtra("ChartType", this.f27609a);
            this.h = intent.getLongExtra("rq_jump_to_horizontal_time", System.currentTimeMillis());
            e();
        }
    }

    private void e() {
        this.i.setRightButtonDrawable(ContextCompat.getDrawable(this.d, R.drawable.ic_rq_chart_fatigue), qre.f(R.string.IDS_data_fatigue_condition));
        this.i.setRightButtonClickable(true);
        this.i.setRightButtonVisibility(0);
        this.i.setRightButtonOnClickListener(new View.OnClickListener() { // from class: uqt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.e(view);
            }
        });
        this.i.setRightSoftkeyBackground(ContextCompat.getDrawable(this.d, R.drawable.ic_rq_chart_physical_fitness), qre.f(R.string.IDS_data_fitness_condition));
        this.i.setRightSoftkeyVisibility(0);
        this.i.setRightSoftkeyOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.StateIndexHorizontalActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                StateIndexHorizontalActivity stateIndexHorizontalActivity = StateIndexHorizontalActivity.this;
                stateIndexHorizontalActivity.g = !stateIndexHorizontalActivity.g;
                if (StateIndexHorizontalActivity.this.g) {
                    StateIndexHorizontalActivity.this.i.setRightSoftkeyBackground(ContextCompat.getDrawable(StateIndexHorizontalActivity.this.d, R.drawable.ic_rq_chart_physical_fitness_select), qre.f(R.string.IDS_data_fitness_condition));
                } else {
                    StateIndexHorizontalActivity.this.i.setRightSoftkeyBackground(ContextCompat.getDrawable(StateIndexHorizontalActivity.this.d, R.drawable.ic_rq_chart_physical_fitness), qre.f(R.string.IDS_data_fitness_condition));
                }
                StateIndexHorizontalActivity.this.e.a(StateIndexHorizontalActivity.this.g);
            }
        });
        a();
    }

    public /* synthetic */ void e(View view) {
        boolean z = this.f27610b;
        this.f27610b = !z;
        if (!z) {
            this.i.setRightButtonDrawable(ContextCompat.getDrawable(this.d, R.drawable.ic_rq_chart_fatigue_select), qre.f(R.string.IDS_data_fatigue_condition));
        } else {
            this.i.setRightButtonDrawable(ContextCompat.getDrawable(this.d, R.drawable.ic_rq_chart_fatigue), qre.f(R.string.IDS_data_fatigue_condition));
        }
        this.e.b(this.f27610b);
    }

    private void a() {
        RqLineHorizontalChartHolderView rqLineHorizontalChartHolderView = (RqLineHorizontalChartHolderView) findViewById(R.id.rq_chart_horizontal_view);
        this.e = rqLineHorizontalChartHolderView;
        rqLineHorizontalChartHolderView.setWidthMatchParent();
        d();
        if (this.f27609a == 2) {
            this.e.b(DataInfos.StateIndexMonthDetail, 1, 0, this.h);
        } else {
            this.e.b(DataInfos.StateIndexWeekDetail, 1, 0, this.h);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        if (getRequestedOrientation() != 0) {
            setRequestedOrientation(0);
        }
        super.onResume();
    }

    private void d() {
        this.e.setStartCalendarViewListener(new RqLineChartHolderView.StartCalendarViewListener() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.StateIndexHorizontalActivity.1
            @Override // com.huawei.ui.main.stories.health.fragment.rqpackage.RqLineChartHolderView.StartCalendarViewListener
            public void onStartCalendarView() {
                StateIndexHorizontalActivity stateIndexHorizontalActivity = StateIndexHorizontalActivity.this;
                HealthCalendarActivity.d(stateIndexHorizontalActivity, stateIndexHorizontalActivity.f27611c);
            }
        });
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 != -1 || intent == null) {
            return;
        }
        Serializable serializableExtra = intent.getSerializableExtra("selectedDate");
        LogUtil.a("StateIndexHorizontalActivity", "obj=" + serializableExtra);
        if (serializableExtra instanceof HealthCalendar) {
            HealthCalendar healthCalendar = (HealthCalendar) serializableExtra;
            this.f27611c = healthCalendar;
            this.e.b(healthCalendar.transformCalendar().getTimeInMillis(), this.f27611c);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        super.onMultiWindowModeChanged(z);
        if (z) {
            finish();
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
