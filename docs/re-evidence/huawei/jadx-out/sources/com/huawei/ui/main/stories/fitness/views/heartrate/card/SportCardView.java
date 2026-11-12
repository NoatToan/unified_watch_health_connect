package com.huawei.ui.main.stories.fitness.views.heartrate.card;

import android.content.Context;
import android.view.View;
import com.huawei.health.knit.api.ICustomCalculator;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.views.base.chart.ObserveredClassifiedView;
import com.huawei.ui.main.stories.fitness.views.base.chart.icommon.IFocusObserverItem;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes19.dex */
public class SportCardView extends HeartRateCardView implements IFocusObserverItem {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ICustomCalculator f27335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ICustomCalculator f27336c;

    @Override // com.huawei.ui.main.stories.fitness.views.base.chart.icommon.IFocusObserverItem
    public View onCreateDetailView() {
        return null;
    }

    public SportCardView(Context context, ObserveredClassifiedView observeredClassifiedView) {
        super(context, observeredClassifiedView, context.getString(R.string.IDS_hw_health_show_healthdata_heartrate_range), context.getString(R.string.IDS_main_watch_heart_rate_unit_string));
        this.f27335b = null;
        this.f27336c = null;
    }

    @Override // com.huawei.ui.main.stories.fitness.views.base.chart.ScrollChartObserverView
    public void onRangeShow(HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart, int i, int i2) {
        float fCalculate;
        float fCalculate2;
        ICustomCalculator iCustomCalculator = this.f27335b;
        if (iCustomCalculator == null || this.f27336c == null) {
            float[] showMinMaxRangeByRatio = hwHealthBaseScrollBarLineChart.getShowMinMaxRangeByRatio();
            if (showMinMaxRangeByRatio == null || showMinMaxRangeByRatio.length != 2) {
                fCalculate = Float.MIN_VALUE;
                fCalculate2 = Float.MAX_VALUE;
            } else {
                float f = showMinMaxRangeByRatio[0];
                fCalculate = showMinMaxRangeByRatio[1];
                fCalculate2 = f;
            }
        } else {
            fCalculate = iCustomCalculator.calculate(hwHealthBaseScrollBarLineChart, this.mHost.getStepDataType());
            fCalculate2 = this.f27336c.calculate(hwHealthBaseScrollBarLineChart, this.mHost.getStepDataType());
        }
        if (fCalculate >= fCalculate2 && fCalculate2 > 0.0f) {
            setContentText(UnitUtil.e(fCalculate2, 1, 0) + Constants.LINK + UnitUtil.e(fCalculate, 1, 0));
            return;
        }
        setContentText("--");
    }

    public void b(ICustomCalculator iCustomCalculator) {
        this.f27335b = iCustomCalculator;
    }

    public void d(ICustomCalculator iCustomCalculator) {
        this.f27336c = iCustomCalculator;
    }
}
