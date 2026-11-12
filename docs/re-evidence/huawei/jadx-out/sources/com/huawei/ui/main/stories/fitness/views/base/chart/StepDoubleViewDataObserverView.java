package com.huawei.ui.main.stories.fitness.views.base.chart;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart;
import com.huawei.ui.main.R;
import defpackage.qrs;

/* JADX INFO: loaded from: classes19.dex */
public class StepDoubleViewDataObserverView extends ScrollChartObserverView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LinearLayout f27191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LinearLayout f27192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LinearLayout f27193c;
    private ScrollChartObserverView d;
    private ScrollChartObserverView e;
    private LinearLayout j;

    public StepDoubleViewDataObserverView(Context context, ObserveredClassifiedView observeredClassifiedView) {
        super(context, observeredClassifiedView, null, null);
        d();
    }

    private void d() {
        inflate(getContext(), R.layout.double_data_step_transfer_view, this);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.observer_view_horizontal_container);
        LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.observer_view_vertical_container);
        if (qrs.v()) {
            linearLayout.setVisibility(8);
            linearLayout2.setVisibility(0);
            this.j = (LinearLayout) findViewById(R.id.observer_view_first_place_vertical);
            this.f27192b = (LinearLayout) findViewById(R.id.observer_view_second_place_vertical);
        } else {
            linearLayout.setVisibility(0);
            linearLayout2.setVisibility(8);
            this.j = (LinearLayout) findViewById(R.id.observer_view_first_place_horizontal);
            this.f27192b = (LinearLayout) findViewById(R.id.observer_view_second_place_horizontal);
        }
        this.f27193c = (LinearLayout) findViewById(R.id.day_distance_description);
        this.f27191a = (LinearLayout) findViewById(R.id.day_calorie_description);
    }

    public void b(ScrollChartObserverView scrollChartObserverView, ScrollChartObserverView scrollChartObserverView2, RelativeLayout relativeLayout, RelativeLayout relativeLayout2) {
        this.d = scrollChartObserverView;
        this.e = scrollChartObserverView2;
        this.j.addView(scrollChartObserverView);
        this.f27192b.addView(scrollChartObserverView2);
        this.f27191a.addView(relativeLayout);
        this.f27193c.addView(relativeLayout2);
    }

    @Override // com.huawei.ui.main.stories.fitness.views.base.chart.ScrollChartObserverView
    public void onRangeShow(HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart, int i, int i2) {
        this.d.onRangeShow(hwHealthBaseScrollBarLineChart, i, i2);
        this.e.onRangeShow(hwHealthBaseScrollBarLineChart, i, i2);
    }
}
