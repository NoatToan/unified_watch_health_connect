package com.huawei.ui.main.stories.health.activity.healthdata;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.calendarview.HealthCalendar;
import com.huawei.ui.commonui.calendarview.HealthCalendarActivity;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.lactatethreshold.view.LacticChartHolderView;
import defpackage.qsp;
import java.io.Serializable;

/* JADX INFO: loaded from: classes43.dex */
public class LacticHorizontalActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private DataInfos f27587a = DataInfos.LactateThresholdMonthDetail;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CustomTitleBar f27588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LacticChartHolderView f27589c;
    private long d;
    private HealthCalendar e;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_lactic_horizontal_layout);
        c();
        a();
    }

    private void c() {
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            finish();
            return;
        }
        Serializable serializable = extras.getSerializable("key_bundle_health_line_chart_data_infos");
        if (serializable instanceof DataInfos) {
            DataInfos dataInfos = (DataInfos) serializable;
            this.f27587a = dataInfos;
            if (!dataInfos.isMonthData() && !this.f27587a.isYearData()) {
                finish();
                return;
            }
        }
        long j = extras.getLong("key_bundle_health_last_data_time", 0L);
        this.d = j;
        if (j == 0) {
            this.d = System.currentTimeMillis();
        }
    }

    private void a() {
        CustomTitleBar customTitleBar = (CustomTitleBar) qsp.a(this, R.id.titlebar);
        this.f27588b = customTitleBar;
        customTitleBar.setTitleText(getString(R.string.IDS_running_lactate_threshold));
        this.f27588b.setRightButtonVisibility(8);
        this.f27588b.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.LacticHorizontalActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LacticHorizontalActivity.this.finish();
            }
        });
        e();
    }

    private void e() {
        this.f27589c = (LacticChartHolderView) findViewById(R.id.chart_horizontal_view);
        d();
        this.f27589c.b(this.f27587a, this.d);
    }

    private void d() {
        this.f27589c.setStartCalendarViewListener(new LacticChartHolderView.StartCalendarViewListener() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.LacticHorizontalActivity.5
            @Override // com.huawei.ui.main.stories.health.lactatethreshold.view.LacticChartHolderView.StartCalendarViewListener
            public void onStartCalendarView() {
                LacticHorizontalActivity lacticHorizontalActivity = LacticHorizontalActivity.this;
                HealthCalendarActivity.d(lacticHorizontalActivity, lacticHorizontalActivity.e);
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
        if (serializableExtra instanceof HealthCalendar) {
            HealthCalendar healthCalendar = (HealthCalendar) serializableExtra;
            this.e = healthCalendar;
            this.f27589c.b(healthCalendar.transformCalendar().getTimeInMillis(), this.e);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity
    public void setDefaultOrientation() {
        setRequestedOrientation(0);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity
    public void setTahitiModelOrientation() {
        setRequestedOrientation(0);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
