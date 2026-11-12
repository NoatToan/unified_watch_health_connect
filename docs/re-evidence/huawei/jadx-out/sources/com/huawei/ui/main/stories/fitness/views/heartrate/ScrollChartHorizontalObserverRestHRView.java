package com.huawei.ui.main.stories.fitness.views.heartrate;

import android.content.Context;
import android.view.View;
import com.huawei.health.knit.api.ICustomCalculator;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart;
import com.huawei.ui.main.stories.fitness.views.base.chart.ObserveredClassifiedView;
import com.huawei.ui.main.stories.fitness.views.base.chart.icommon.IFocusObserverItem;

/* JADX INFO: loaded from: classes19.dex */
public class ScrollChartHorizontalObserverRestHRView extends ScrollChartHorizontalObserverHRView implements IFocusObserverItem {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private OnReferenceChange f27306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ICustomCalculator f27307c;

    public interface OnReferenceChange {
        void onReferenceChange(float f);
    }

    @Override // com.huawei.ui.main.stories.fitness.views.heartrate.ScrollChartHorizontalObserverHRView, com.huawei.ui.main.stories.fitness.views.base.chart.IScrollChartOuterObserver
    public IFocusObserverItem acquireFocusItem() {
        return null;
    }

    @Override // com.huawei.ui.main.stories.fitness.views.base.chart.icommon.IFocusObserverItem
    public View onCreateDetailView() {
        return null;
    }

    public ScrollChartHorizontalObserverRestHRView(Context context, ObserveredClassifiedView observeredClassifiedView, String str) {
        super(context, observeredClassifiedView, str);
        this.f27306b = null;
    }

    @Override // com.huawei.ui.main.stories.fitness.views.base.chart.IScrollChartOuterObserver
    public void onRangeShow(HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart, int i, int i2) {
        float fCalculate;
        ICustomCalculator iCustomCalculator = this.f27307c;
        if (iCustomCalculator == null) {
            fCalculate = hwHealthBaseScrollBarLineChart.getShowDataAverage();
        } else {
            fCalculate = iCustomCalculator.calculate(hwHealthBaseScrollBarLineChart, this.mHost.getStepDataType());
        }
        OnReferenceChange onReferenceChange = this.f27306b;
        if (onReferenceChange != null) {
            onReferenceChange.onReferenceChange(fCalculate);
        }
    }

    public void setAvgCalculator(ICustomCalculator iCustomCalculator) {
        this.f27307c = iCustomCalculator;
    }

    public void setOnReferenceChangeListener(OnReferenceChange onReferenceChange) {
        this.f27306b = onReferenceChange;
    }
}
