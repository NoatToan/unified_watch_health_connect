package com.huawei.ui.main.stories.fitness.activity.distance;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.view.View;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.linechart.common.ClassType;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.linechart.common.DateType;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart;
import com.huawei.ui.commonui.linechart.common.MotionType;
import com.huawei.ui.commonui.linechart.icommon.IChartLayerHolder;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.base.BaseStepDetailActivity;
import com.huawei.ui.main.stories.fitness.views.base.chart.ICustomMotionTypeCalculator;
import com.huawei.ui.main.stories.fitness.views.base.chart.ObserveredClassifiedView;
import com.huawei.ui.main.stories.fitness.views.base.chart.ProportionView;
import com.huawei.ui.main.stories.fitness.views.base.chart.ScrollChartObserverTotalDataView;
import com.huawei.ui.main.stories.fitness.views.base.chart.ScrollChartObserverView;
import com.huawei.ui.main.stories.fitness.views.base.chart.SingleViewDataObserverView;
import com.huawei.ui.main.stories.fitness.views.base.chart.utils.IOnDataShowListener;
import com.huawei.ui.main.stories.fitness.views.base.chart.utils.UserEvent;
import defpackage.wkb;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class FitnessDistanceDetailActivity extends BaseStepDetailActivity {
    private String h;
    private ProportionView d = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<ProportionView.ProportionItem> f26880c = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ProportionView.ProportionItem f26878a = null;
    private ProportionView.ProportionItem g = null;
    private ProportionView.ProportionItem e = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ProportionView.ProportionItem f26879b = null;
    private BaseStepDetailActivity.TextShowFormatter i = new BaseStepDetailActivity.TextShowFormatter() { // from class: com.huawei.ui.main.stories.fitness.activity.distance.FitnessDistanceDetailActivity.4
        @Override // com.huawei.ui.main.stories.fitness.base.BaseStepDetailActivity.TextShowFormatter
        public String convertFloat2TextShow(float f) {
            return UnitUtil.e(f, 1, 2);
        }
    };

    @Override // com.huawei.ui.main.stories.fitness.base.BaseStepDetailActivity
    public void initActivityData() {
    }

    @Override // com.huawei.ui.main.stories.fitness.base.BaseStepDetailActivity
    public View getExtensionView() {
        ProportionView proportionView = this.d;
        if (proportionView != null) {
            return proportionView;
        }
        this.d = new ProportionView(this);
        this.f26878a = new ProportionView.e(this, Color.argb(255, 80, 230, 80));
        this.g = new ProportionView.b(this, Color.argb(255, 76, 217, 76));
        this.e = new ProportionView.d(this, Color.argb(255, 71, 204, 71));
        this.f26879b = new ProportionView.a(this, Color.argb(255, 67, 191, 67));
        this.f26880c.add(this.f26878a);
        this.f26880c.add(this.g);
        this.f26880c.add(this.e);
        this.f26880c.add(this.f26879b);
        this.d.e(this.f26880c);
        this.d.setSubHeaderText(getResources().getString(R.string.IDS_fitness_subheader_title, getResources().getString(R.string.IDS_sport_distance)));
        return this.d;
    }

    @Override // com.huawei.ui.main.stories.fitness.base.BaseStepDetailActivity
    public void initStartArguement(Intent intent) {
        if (intent != null && intent.hasExtra("today_current_distance_total")) {
            this.mCurrentDayValueMinimum = intent.getIntExtra("today_current_distance_total", (int) this.mCurrentDayValueMinimum);
            this.mCurrentDayValueMinimum *= UnitUtil.f() ? 0.001f * ((float) UnitUtil.e(1.0d, 3)) : 0.001f;
        }
    }

    @Override // com.huawei.ui.main.stories.fitness.base.BaseStepDetailActivity
    public void initConstString() {
        if (UnitUtil.f()) {
            this.h = getString(R.string.IDS_band_data_sport_distance_unit_en);
        } else {
            this.h = getString(R.string.IDS_band_data_sport_distance_unit);
        }
    }

    @Override // com.huawei.ui.main.stories.fitness.base.BaseStepDetailActivity
    public void initChartLayerHolderData(IChartLayerHolder iChartLayerHolder) {
        iChartLayerHolder.spetifiyDataTypeUnit(new IChartLayerHolder.DataTypeFilter() { // from class: com.huawei.ui.main.stories.fitness.activity.distance.FitnessDistanceDetailActivity.1
            @Override // com.huawei.ui.commonui.linechart.icommon.IChartLayerHolder.DataTypeFilter
            public boolean isAccept(DataInfos dataInfos) {
                return dataInfos.isDistanceData();
            }
        }, this.h);
    }

    @Override // com.huawei.ui.main.stories.fitness.base.BaseStepDetailActivity
    public void initTitleBar() {
        this.mTitleBar.setTitleText(getString(R.string.IDS_sport_distance));
        ArrayList<String> arrayList = new ArrayList<>(1);
        arrayList.add(getString(R.string.IDS_privacy_all_data));
        setTitleBarRightButton(this, arrayList);
    }

    @Override // com.huawei.ui.main.stories.fitness.base.BaseStepDetailActivity
    public void initChartListener() {
        this.mClassifiedViewList.e(new IOnDataShowListener() { // from class: com.huawei.ui.main.stories.fitness.activity.distance.FitnessDistanceDetailActivity.3
            @Override // com.huawei.ui.main.stories.fitness.views.base.chart.utils.IOnDataShowListener
            public void onUserEvent(UserEvent userEvent) {
            }

            @Override // com.huawei.ui.main.stories.fitness.views.base.chart.utils.IOnDataShowListener
            public void onDataShowChanged(DataInfos dataInfos, int i, int i2, HwHealthBaseBarLineChart hwHealthBaseBarLineChart) {
                if (hwHealthBaseBarLineChart instanceof HwHealthBaseScrollBarLineChart) {
                    FitnessDistanceDetailActivity.this.c((HwHealthBaseScrollBarLineChart) hwHealthBaseBarLineChart, dataInfos);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart, DataInfos dataInfos) {
        ICustomMotionTypeCalculator iCustomMotionTypeCalculatorD = this.mChartLayerHolder.d();
        this.g.setDataValue(iCustomMotionTypeCalculatorD.calculate(hwHealthBaseScrollBarLineChart, dataInfos, MotionType.WALK));
        this.f26878a.setDataValue(iCustomMotionTypeCalculatorD.calculate(hwHealthBaseScrollBarLineChart, dataInfos, MotionType.RUN));
        this.e.setDataValue(iCustomMotionTypeCalculatorD.calculate(hwHealthBaseScrollBarLineChart, dataInfos, MotionType.CLIMB));
        ProportionView.ProportionItem proportionItem = this.f26879b;
        float fCalculate = iCustomMotionTypeCalculatorD.calculate(hwHealthBaseScrollBarLineChart, dataInfos, MotionType.SUM);
        float fCalculate2 = iCustomMotionTypeCalculatorD.calculate(hwHealthBaseScrollBarLineChart, dataInfos, MotionType.WALK);
        proportionItem.setDataValue(((fCalculate - fCalculate2) - iCustomMotionTypeCalculatorD.calculate(hwHealthBaseScrollBarLineChart, dataInfos, MotionType.RUN)) - iCustomMotionTypeCalculatorD.calculate(hwHealthBaseScrollBarLineChart, dataInfos, MotionType.CLIMB));
        this.d.e(this.f26880c);
    }

    @Override // com.huawei.ui.main.stories.fitness.base.BaseStepDetailActivity
    public BaseStepDetailActivity.TextShowFormatter getTextShowFormatter() {
        return this.i;
    }

    @Override // com.huawei.ui.main.stories.fitness.base.BaseStepDetailActivity
    public ObserveredClassifiedView onCreateDayClassifiedView(BaseStepDetailActivity.TextShowFormatter textShowFormatter) {
        ObserveredClassifiedView observeredClassifiedViewOnCreateDayClassifiedView = super.onCreateDayClassifiedView(textShowFormatter);
        enableClassifiedViewObserver(observeredClassifiedViewOnCreateDayClassifiedView, getString(R.string.IDS_fitness_total_distance_data_title), this.h);
        ScrollChartObserverView scrollChartObserverViewAcquireScrollChartObserverView = observeredClassifiedViewOnCreateDayClassifiedView.acquireScrollChartObserverView();
        if (scrollChartObserverViewAcquireScrollChartObserverView instanceof SingleViewDataObserverView) {
            this.mScrollChartObserverView = ((SingleViewDataObserverView) scrollChartObserverViewAcquireScrollChartObserverView).b();
            if (this.mScrollChartObserverView instanceof ScrollChartObserverTotalDataView) {
                ((ScrollChartObserverTotalDataView) this.mScrollChartObserverView).b(new ScrollChartObserverTotalDataView.c(this.mCurrentDayValueMinimum, 40004, DataInfos.query(getClassType(), DateType.DATE_DAY)));
                return observeredClassifiedViewOnCreateDayClassifiedView;
            }
        }
        return observeredClassifiedViewOnCreateDayClassifiedView;
    }

    @Override // com.huawei.ui.main.stories.fitness.base.BaseStepDetailActivity
    public ObserveredClassifiedView onCreateWeekClassifiedView(BaseStepDetailActivity.TextShowFormatter textShowFormatter) {
        ObserveredClassifiedView observeredClassifiedViewOnCreateWeekClassifiedView = super.onCreateWeekClassifiedView(textShowFormatter);
        enableClassifiedViewObserver(observeredClassifiedViewOnCreateWeekClassifiedView, new BaseStepDetailActivity.b(getString(R.string.IDS_fitness_total_distance_data_title), this.h, getString(R.string.IDS_fitness_average_distance_data_title), this.h));
        return observeredClassifiedViewOnCreateWeekClassifiedView;
    }

    @Override // com.huawei.ui.main.stories.fitness.base.BaseStepDetailActivity
    public ObserveredClassifiedView onCreateMonthClassifiedView(BaseStepDetailActivity.TextShowFormatter textShowFormatter) {
        ObserveredClassifiedView observeredClassifiedViewOnCreateMonthClassifiedView = super.onCreateMonthClassifiedView(textShowFormatter);
        enableClassifiedViewObserver(observeredClassifiedViewOnCreateMonthClassifiedView, new BaseStepDetailActivity.b(getString(R.string.IDS_fitness_total_distance_data_title), this.h, getString(R.string.IDS_fitness_average_distance_data_title), this.h));
        return observeredClassifiedViewOnCreateMonthClassifiedView;
    }

    @Override // com.huawei.ui.main.stories.fitness.base.BaseStepDetailActivity
    public ObserveredClassifiedView onCreateYearClassifiedView(BaseStepDetailActivity.TextShowFormatter textShowFormatter) {
        ObserveredClassifiedView observeredClassifiedViewOnCreateYearClassifiedView = super.onCreateYearClassifiedView(textShowFormatter);
        enableClassifiedViewObserver(observeredClassifiedViewOnCreateYearClassifiedView, new HwHealthBaseScrollBarLineChart.DataRatioProvider() { // from class: com.huawei.ui.main.stories.fitness.activity.distance.FitnessDistanceDetailActivity.2
            @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.DataRatioProvider
            public float computeRatio(int i) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(((long) i) * 60000);
                calendar.set(5, 1);
                calendar.roll(5, -1);
                return calendar.get(5);
            }
        }, new BaseStepDetailActivity.b(getString(R.string.IDS_fitness_total_distance_data_title), this.h, getString(R.string.IDS_fitness_average_distance_data_title), this.h));
        return observeredClassifiedViewOnCreateYearClassifiedView;
    }

    @Override // com.huawei.ui.main.stories.fitness.base.BaseStepDetailActivity
    public ClassType getClassType() {
        return ClassType.TYPE_DISTANCE;
    }

    @Override // com.huawei.ui.main.stories.fitness.base.BaseStepDetailActivity
    public String getCurrentDayValueMinimum() {
        return this.mScrollChartObserverView.getContentTextView().getText().toString();
    }

    @Override // com.huawei.ui.main.stories.fitness.base.BaseStepDetailActivity
    public String getCurrentDayValueUnit() {
        return this.h;
    }

    @Override // com.huawei.ui.main.stories.fitness.base.BaseStepDetailActivity
    public void handleTitleBarRightButtonOnClick(int i) {
        LogUtil.a("SCUI_FitnessDistanceDetailActivity", "PopViewList setOnClick position is ", Integer.valueOf(i));
        if (i == 0) {
            wkb.b(101, this);
        } else {
            LogUtil.j("SCUI_FitnessDistanceDetailActivity", "PopViewList setOnClick position is else");
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
