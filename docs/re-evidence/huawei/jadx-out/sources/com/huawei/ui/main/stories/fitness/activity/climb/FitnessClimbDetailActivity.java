package com.huawei.ui.main.stories.fitness.activity.climb;

import android.content.Intent;
import android.content.res.Configuration;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwsmartinteractmgr.data.SmartMsgConstant;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.linechart.common.ClassType;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.linechart.common.DateType;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart;
import com.huawei.ui.commonui.linechart.common.MotionType;
import com.huawei.ui.commonui.linechart.icommon.IChartLayerHolder;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.base.BaseStepDetailActivity;
import com.huawei.ui.main.stories.fitness.views.base.chart.ObserveredClassifiedView;
import com.huawei.ui.main.stories.fitness.views.base.chart.ScrollChartObserverTotalDataView;
import com.huawei.ui.main.stories.fitness.views.base.chart.ScrollChartObserverView;
import com.huawei.ui.main.stories.fitness.views.base.chart.SingleViewDataObserverView;
import com.huawei.ui.main.stories.fitness.views.base.chart.utils.IOnDataShowListener;
import com.huawei.ui.main.stories.fitness.views.base.chart.utils.UserEvent;
import defpackage.lro;
import defpackage.qrs;
import defpackage.wkb;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.Calendar;

/* JADX INFO: loaded from: classes19.dex */
public class FitnessClimbDetailActivity extends BaseStepDetailActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f26650a;
    private BaseStepDetailActivity.TextShowFormatter d = new BaseStepDetailActivity.TextShowFormatter() { // from class: com.huawei.ui.main.stories.fitness.activity.climb.FitnessClimbDetailActivity.2
        @Override // com.huawei.ui.main.stories.fitness.base.BaseStepDetailActivity.TextShowFormatter
        public String convertFloat2TextShow(float f) {
            if (UnitUtil.f()) {
                return UnitUtil.e(f, 1, 2);
            }
            return UnitUtil.e(f, 1, 1);
        }
    };
    private HealthTextView e;

    @Override // com.huawei.ui.main.stories.fitness.base.BaseStepDetailActivity
    public void initActivityData() {
    }

    @Override // com.huawei.ui.main.stories.fitness.base.BaseStepDetailActivity
    public void initStartArguement(Intent intent) {
        if (intent != null && intent.hasExtra("today_current_climb_total")) {
            this.mCurrentDayValueMinimum = intent.getIntExtra("today_current_climb_total", (int) this.mCurrentDayValueMinimum);
            this.mCurrentDayValueMinimum *= UnitUtil.f() ? 0.1f * ((float) UnitUtil.e(1.0d, 1)) : 0.1f;
        }
    }

    @Override // com.huawei.ui.main.stories.fitness.base.BaseStepDetailActivity
    public void initTitleBar() {
        this.mTitleBar.setTitleText(getString(R.string.IDS_motiontrack_climb_stairs_tip));
        ArrayList<String> arrayList = new ArrayList<>(1);
        arrayList.add(getString(R.string.IDS_privacy_all_data));
        setTitleBarRightButton(this, arrayList);
    }

    @Override // com.huawei.ui.main.stories.fitness.base.BaseStepDetailActivity
    public View getExtensionView() {
        String string;
        View viewInflate = LayoutInflater.from(this).inflate(R.layout.climb_view_extension, (ViewGroup) null);
        HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.climb_floor_height_tips);
        try {
            String str = String.format(getResources().getString(R.string.IDS_one_story_equal_to_three_meters_describe), Integer.valueOf(Integer.parseInt(UnitUtil.e(3.0d, 1, 0))), Integer.valueOf(Integer.parseInt(UnitUtil.e(10.0d, 1, 0))), Integer.valueOf(Integer.parseInt(UnitUtil.e(16.0d, 1, 0))));
            if (LanguageUtil.o(this)) {
                healthTextView.setText(UnitUtil.d(str));
            } else {
                healthTextView.setText(str);
            }
        } catch (NumberFormatException e) {
            LogUtil.a("Step_FitnessClimbDetailActivity", e.getMessage());
        }
        this.e = (HealthTextView) viewInflate.findViewById(R.id.tv_explain);
        if ((this.mCurrentDayValueMinimum <= 0.0f && !lro.d()) || !CommonUtil.bg()) {
            if (qrs.ah(BaseApplication.b())) {
                string = getString(R.string.IDS_climb_pad_not_support_record);
            } else {
                string = getString(R.string.IDS_climb_isnot_support_floor_tips);
            }
            this.e.setText(string);
        }
        if (qrs.af(this)) {
            healthTextView.setGravity(17);
            this.e.setGravity(17);
        }
        return viewInflate;
    }

    @Override // com.huawei.ui.main.stories.fitness.base.BaseStepDetailActivity
    public void initConstString() {
        if (UnitUtil.f()) {
            this.f26650a = getString(R.string.IDS_ft);
        } else {
            this.f26650a = getString(R.string.IDS_fitness_data_list_activity_meter_unit);
        }
    }

    @Override // com.huawei.ui.main.stories.fitness.base.BaseStepDetailActivity
    public void initChartLayerHolderData(IChartLayerHolder iChartLayerHolder) {
        iChartLayerHolder.spetifiyDataTypeUnit(new IChartLayerHolder.DataTypeFilter() { // from class: com.huawei.ui.main.stories.fitness.activity.climb.FitnessClimbDetailActivity.1
            @Override // com.huawei.ui.commonui.linechart.icommon.IChartLayerHolder.DataTypeFilter
            public boolean isAccept(DataInfos dataInfos) {
                return dataInfos.isClimbData();
            }
        }, this.f26650a);
    }

    @Override // com.huawei.ui.main.stories.fitness.base.BaseStepDetailActivity
    public BaseStepDetailActivity.TextShowFormatter getTextShowFormatter() {
        return this.d;
    }

    @Override // com.huawei.ui.main.stories.fitness.base.BaseStepDetailActivity
    public ObserveredClassifiedView onCreateDayClassifiedView(BaseStepDetailActivity.TextShowFormatter textShowFormatter) {
        ObserveredClassifiedView observeredClassifiedViewOnCreateDayClassifiedView = super.onCreateDayClassifiedView(textShowFormatter);
        enableClassifiedViewObserver(observeredClassifiedViewOnCreateDayClassifiedView, getString(R.string.IDS_fitness_total_height_data_title), this.f26650a);
        ScrollChartObserverView scrollChartObserverViewAcquireScrollChartObserverView = observeredClassifiedViewOnCreateDayClassifiedView.acquireScrollChartObserverView();
        if (scrollChartObserverViewAcquireScrollChartObserverView instanceof SingleViewDataObserverView) {
            this.mScrollChartObserverView = ((SingleViewDataObserverView) scrollChartObserverViewAcquireScrollChartObserverView).b();
            if (this.mScrollChartObserverView instanceof ScrollChartObserverTotalDataView) {
                ((ScrollChartObserverTotalDataView) this.mScrollChartObserverView).b(new ScrollChartObserverTotalDataView.c(this.mCurrentDayValueMinimum, SmartMsgConstant.MSG_TYPE_RIDE_USER, DataInfos.query(getClassType(), DateType.DATE_DAY)));
                return observeredClassifiedViewOnCreateDayClassifiedView;
            }
        }
        return observeredClassifiedViewOnCreateDayClassifiedView;
    }

    @Override // com.huawei.ui.main.stories.fitness.base.BaseStepDetailActivity
    public ObserveredClassifiedView onCreateWeekClassifiedView(BaseStepDetailActivity.TextShowFormatter textShowFormatter) {
        ObserveredClassifiedView observeredClassifiedViewOnCreateWeekClassifiedView = super.onCreateWeekClassifiedView(textShowFormatter);
        enableClassifiedViewObserver(observeredClassifiedViewOnCreateWeekClassifiedView, new BaseStepDetailActivity.b(getString(R.string.IDS_fitness_total_height_data_title), this.f26650a, getString(R.string.IDS_fitness_average_height_data_title), this.f26650a));
        return observeredClassifiedViewOnCreateWeekClassifiedView;
    }

    @Override // com.huawei.ui.main.stories.fitness.base.BaseStepDetailActivity
    public ObserveredClassifiedView onCreateMonthClassifiedView(BaseStepDetailActivity.TextShowFormatter textShowFormatter) {
        ObserveredClassifiedView observeredClassifiedViewOnCreateMonthClassifiedView = super.onCreateMonthClassifiedView(textShowFormatter);
        enableClassifiedViewObserver(observeredClassifiedViewOnCreateMonthClassifiedView, new BaseStepDetailActivity.b(getString(R.string.IDS_fitness_total_height_data_title), this.f26650a, getString(R.string.IDS_fitness_average_height_data_title), this.f26650a));
        return observeredClassifiedViewOnCreateMonthClassifiedView;
    }

    @Override // com.huawei.ui.main.stories.fitness.base.BaseStepDetailActivity
    public ObserveredClassifiedView onCreateYearClassifiedView(BaseStepDetailActivity.TextShowFormatter textShowFormatter) {
        ObserveredClassifiedView observeredClassifiedViewOnCreateYearClassifiedView = super.onCreateYearClassifiedView(textShowFormatter);
        enableClassifiedViewObserver(observeredClassifiedViewOnCreateYearClassifiedView, new HwHealthBaseScrollBarLineChart.DataRatioProvider() { // from class: com.huawei.ui.main.stories.fitness.activity.climb.FitnessClimbDetailActivity.4
            @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.DataRatioProvider
            public float computeRatio(int i) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(((long) i) * 60000);
                calendar.set(5, 1);
                calendar.roll(5, -1);
                return calendar.get(5);
            }
        }, new BaseStepDetailActivity.b(getString(R.string.IDS_fitness_total_height_data_title), this.f26650a, getString(R.string.IDS_fitness_average_height_data_title), this.f26650a));
        return observeredClassifiedViewOnCreateYearClassifiedView;
    }

    @Override // com.huawei.ui.main.stories.fitness.base.BaseStepDetailActivity
    public ClassType getClassType() {
        return ClassType.TYPE_CLIMB;
    }

    @Override // com.huawei.ui.main.stories.fitness.base.BaseStepDetailActivity
    public void initChartListener() {
        this.mClassifiedViewList.e(new IOnDataShowListener() { // from class: com.huawei.ui.main.stories.fitness.activity.climb.FitnessClimbDetailActivity.5
            @Override // com.huawei.ui.main.stories.fitness.views.base.chart.utils.IOnDataShowListener
            public void onUserEvent(UserEvent userEvent) {
            }

            @Override // com.huawei.ui.main.stories.fitness.views.base.chart.utils.IOnDataShowListener
            public void onDataShowChanged(DataInfos dataInfos, int i, int i2, HwHealthBaseBarLineChart hwHealthBaseBarLineChart) {
                if (hwHealthBaseBarLineChart instanceof HwHealthBaseScrollBarLineChart) {
                    FitnessClimbDetailActivity.this.d((HwHealthBaseScrollBarLineChart) hwHealthBaseBarLineChart, dataInfos);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart, DataInfos dataInfos) {
        String string;
        if ((this.mChartLayerHolder.d().calculate(hwHealthBaseScrollBarLineChart, dataInfos, MotionType.SUM) <= 0.0f && !lro.d()) || !CommonUtil.bg()) {
            if (qrs.ah(BaseApplication.b())) {
                string = getString(R.string.IDS_climb_pad_not_support_record);
            } else {
                string = getString(R.string.IDS_climb_isnot_support_floor_tips);
            }
        } else if (qrs.ah(BaseApplication.b())) {
            string = getString(R.string.IDS_climb_pad_not_support_floor);
        } else {
            string = getString(R.string.IDS_climb_is_support_floor_tips);
        }
        this.e.setText(string);
    }

    @Override // com.huawei.ui.main.stories.fitness.base.BaseStepDetailActivity
    public String getCurrentDayValueMinimum() {
        return this.mScrollChartObserverView.getContentTextView().getText().toString();
    }

    @Override // com.huawei.ui.main.stories.fitness.base.BaseStepDetailActivity
    public String getCurrentDayValueUnit() {
        return this.f26650a;
    }

    @Override // com.huawei.ui.main.stories.fitness.base.BaseStepDetailActivity
    public void handleTitleBarRightButtonOnClick(int i) {
        LogUtil.a("Step_FitnessClimbDetailActivity", "PopViewList setOnClick position is ", Integer.valueOf(i));
        if (i == 0) {
            wkb.b(110, this);
        } else {
            LogUtil.j("Step_FitnessClimbDetailActivity", "PopViewList setOnClick position is else");
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
