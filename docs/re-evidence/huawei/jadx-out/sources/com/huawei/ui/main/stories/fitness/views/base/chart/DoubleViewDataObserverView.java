package com.huawei.ui.main.stories.fitness.views.base.chart;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.huawei.ui.commonui.linechart.HwHealthChartHolder;
import com.huawei.ui.commonui.linechart.HwHealthScrollChartHolder;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineDataSet;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart;
import com.huawei.ui.commonui.linechart.icommon.IChartLayerHolder;
import com.huawei.ui.main.R;
import defpackage.qrs;
import health.compact.a.util.LogUtil;

/* JADX INFO: loaded from: classes19.dex */
public class DoubleViewDataObserverView extends ScrollChartObserverView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected boolean f27144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected d f27145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected LinearLayout f27146c;
    protected ScrollChartObserverView d;
    protected ScrollChartObserverView e;
    protected LinearLayout g;

    public DoubleViewDataObserverView(Context context, ObserveredClassifiedView observeredClassifiedView) {
        super(context, observeredClassifiedView, null, null);
        this.f27144a = false;
        this.f27145b = null;
        e();
    }

    private void e() {
        inflate(getContext(), R.layout.double_view_data_observer_view, this);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.observer_view_horizontal_container);
        LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.observer_view_vertical_container);
        if (qrs.v()) {
            linearLayout.setVisibility(8);
            linearLayout2.setVisibility(0);
            this.f27146c = (LinearLayout) findViewById(R.id.observer_view_first_place_vertical);
            this.g = (LinearLayout) findViewById(R.id.observer_view_second_place_vertical);
            return;
        }
        linearLayout.setVisibility(0);
        linearLayout2.setVisibility(8);
        this.f27146c = (LinearLayout) findViewById(R.id.observer_view_first_place_horizontal);
        this.g = (LinearLayout) findViewById(R.id.observer_view_second_place_horizontal);
    }

    public void c(ScrollChartObserverView scrollChartObserverView, ScrollChartObserverView scrollChartObserverView2, boolean z) {
        this.e = scrollChartObserverView;
        this.d = scrollChartObserverView2;
        this.f27146c.addView(scrollChartObserverView);
        this.g.addView(scrollChartObserverView2);
        c(z);
    }

    public void a(ScrollChartObserverView scrollChartObserverView, ScrollChartObserverView scrollChartObserverView2) {
        c(scrollChartObserverView, scrollChartObserverView2, false);
    }

    @Override // com.huawei.ui.main.stories.fitness.views.base.chart.ScrollChartObserverView
    public void onRangeShow(HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart, int i, int i2) {
        this.e.onRangeShow(hwHealthBaseScrollBarLineChart, i, i2);
        this.d.onRangeShow(hwHealthBaseScrollBarLineChart, i, i2);
    }

    protected class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected boolean f27147a = false;
        protected HwHealthBaseBarLineDataSet d = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected HwHealthChartHolder.c f27148b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected View.OnClickListener f27149c = new View.OnClickListener() { // from class: com.huawei.ui.main.stories.fitness.views.base.chart.DoubleViewDataObserverView.d.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (view == DoubleViewDataObserverView.this.g && !d.this.b()) {
                    d.this.g();
                    d.this.a(false, true);
                } else {
                    d.this.i();
                    d.this.a(true, false);
                }
            }
        };

        protected d() {
        }

        protected void a(boolean z, boolean z2) {
            if (z == z2) {
                LogUtil.d("DoubleViewDataObserverView", "Can not focus two item in the same time");
            }
        }

        protected void i() {
            a();
            e(DoubleViewDataObserverView.this.e);
        }

        protected void g() {
            e();
            e(DoubleViewDataObserverView.this.d);
        }

        protected boolean b() {
            return this.f27147a;
        }

        protected void e() {
            if (this.f27147a || this.d == null) {
                LogUtil.d("DoubleViewDataObserverView", "addSuperLayer failed,current has SuperLayer!!!");
                return;
            }
            DoubleViewDataObserverView.this.mHost.addDataLayer(this.d, this.f27148b);
            j();
            this.f27147a = true;
        }

        protected void a() {
            if (!this.f27147a || this.d == null) {
                return;
            }
            DoubleViewDataObserverView.this.mHost.removeDataLayer(this.d);
            c();
            this.f27147a = false;
        }

        public void e(View view) {
            DoubleViewDataObserverView.this.e.setBackgroundResource(R.drawable.scrollchart_observer_hr_unfocus_bg);
            DoubleViewDataObserverView.this.d.setBackgroundResource(R.drawable.scrollchart_observer_hr_unfocus_bg);
            view.setBackgroundResource(R.drawable.scrollchart_observer_hr_focus_bg);
            f();
        }

        protected void d() {
            DoubleViewDataObserverView.this.f27146c.setOnClickListener(this.f27149c);
            DoubleViewDataObserverView.this.g.setOnClickListener(this.f27149c);
            e(DoubleViewDataObserverView.this.e);
            a(true, false);
            HwHealthChartHolder.c cVar = new HwHealthChartHolder.c();
            cVar.a(DoubleViewDataObserverView.this.mHost.getStepDataType());
            cVar.e(HwHealthChartHolder.LAYER_ID_REST_HR);
            this.f27148b = cVar;
            this.d = DoubleViewDataObserverView.this.mHost.fakeDataLayer(cVar);
            c();
        }

        protected void c() {
            IChartLayerHolder iChartLayerHolderAcquireChartLayerHolder = DoubleViewDataObserverView.this.mHost.acquireChartLayerHolder();
            if (!(iChartLayerHolderAcquireChartLayerHolder instanceof HwHealthScrollChartHolder)) {
                LogUtil.d("DoubleViewDataObserverView", "not support scrollable,init focus now only support scrollable chart!!!");
            } else {
                DoubleViewDataObserverView.this.mHost.manageDataSetAsProxy(this.d, ((HwHealthScrollChartHolder) iChartLayerHolderAcquireChartLayerHolder).acquireStorageHelper(), DoubleViewDataObserverView.this.mHost.getStepDataType(), this.f27148b);
            }
        }

        protected void j() {
            DoubleViewDataObserverView.this.mHost.unManageDataSetAsProxy(this.d);
        }

        private void f() {
            if (this.f27147a) {
                DoubleViewDataObserverView.this.f27146c.setClickable(true);
                DoubleViewDataObserverView.this.g.setClickable(false);
            } else {
                DoubleViewDataObserverView.this.f27146c.setClickable(false);
                DoubleViewDataObserverView.this.g.setClickable(true);
            }
        }
    }

    private void c(boolean z) {
        this.f27144a = z;
    }

    private void c() {
        if (this.f27144a) {
            d dVar = new d();
            this.f27145b = dVar;
            dVar.d();
        }
    }

    @Override // com.huawei.ui.main.stories.fitness.views.base.chart.ScrollChartObserverView
    public void initChartLinkage() {
        c();
    }
}
