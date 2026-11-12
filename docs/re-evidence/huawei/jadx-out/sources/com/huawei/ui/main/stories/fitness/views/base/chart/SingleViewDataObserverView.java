package com.huawei.ui.main.stories.fitness.views.base.chart;

import android.content.Context;
import android.widget.LinearLayout;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart;
import com.huawei.ui.main.R;

/* JADX INFO: loaded from: classes19.dex */
public class SingleViewDataObserverView extends ScrollChartObserverView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LinearLayout f27189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ScrollChartObserverView f27190b;

    public SingleViewDataObserverView(Context context) {
        super(context, null, null, null);
        a();
    }

    private void a() {
        inflate(getContext(), R.layout.single_view_data_observer_view, this);
        this.f27189a = (LinearLayout) findViewById(R.id.observer_view_place);
    }

    public void b(ScrollChartObserverView scrollChartObserverView) {
        this.f27190b = scrollChartObserverView;
        this.f27189a.addView(scrollChartObserverView);
    }

    public ScrollChartObserverView b() {
        return this.f27190b;
    }

    @Override // com.huawei.ui.main.stories.fitness.views.base.chart.ScrollChartObserverView
    public void onRangeShow(HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart, int i, int i2) {
        this.f27190b.onRangeShow(hwHealthBaseScrollBarLineChart, i, i2);
    }
}
