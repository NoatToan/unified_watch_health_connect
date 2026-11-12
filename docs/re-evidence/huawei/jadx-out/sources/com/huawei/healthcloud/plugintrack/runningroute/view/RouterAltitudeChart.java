package com.huawei.healthcloud.plugintrack.runningroute.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.util.Pair;
import com.huawei.haf.application.BaseApplication;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.runningroute.data.RouterAltitude;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.linechart.anchor.Layout;
import com.huawei.ui.commonui.linechart.combinedchart.HwHealthBaseCombinedChart;
import com.huawei.ui.commonui.linechart.combinedchart.HwHealthTrackCombinedChart;
import defpackage.njy;
import defpackage.qrs;
import health.compact.a.UnitUtil;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class RouterAltitudeChart extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView f10619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f10620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RouteAltitudeChartHolderImpl f10621c;
    private boolean d;
    private HwHealthTrackCombinedChart e;

    public RouterAltitudeChart(Context context) {
        super(context);
        this.f10620b = null;
        this.f10619a = null;
        this.e = null;
        this.d = UnitUtil.f();
        b();
    }

    public RouterAltitudeChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10620b = null;
        this.f10619a = null;
        this.e = null;
        this.d = UnitUtil.f();
        b();
    }

    public RouterAltitudeChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f10620b = null;
        this.f10619a = null;
        this.e = null;
        this.d = UnitUtil.f();
        b();
    }

    private void b() {
        String string;
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.layout_track_chart_viewholder, (ViewGroup) this, true);
        this.f10620b = (HealthTextView) findViewById(R.id.text_track_detail_left_value);
        ((HealthTextView) findViewById(R.id.text_curve_title)).setText(R.string.IDS_route_alt_chart_title);
        HealthTextView healthTextView = (HealthTextView) findViewById(R.id.text_curve_title_unit);
        Context contextB = BaseApplication.b();
        if (this.d) {
            string = contextB.getResources().getString(R.string.IDS_motiontrack_show_chart_unit_string, contextB.getResources().getString(R.string.IDS_ft));
        } else {
            string = contextB.getResources().getString(R.string.IDS_motiontrack_show_chart_unit_string, contextB.getResources().getString(R.string.IDS_fitness_data_list_activity_meter_unit));
        }
        healthTextView.setText(string);
        ((HealthTextView) findViewById(R.id.text_track_detail_left_title)).setText(R.string.IDS_hwh_motiontrack_min_alti_simplified);
        ((HealthTextView) findViewById(R.id.text_track_detail_right_title)).setText(R.string.IDS_hwh_motiontrack_max_alti_simplified);
        this.f10619a = (HealthTextView) findViewById(R.id.text_track_detail_right_value);
        ((HealthTextView) findViewById(R.id.text_curve_detail)).setVisibility(8);
        HwHealthTrackCombinedChart hwHealthTrackCombinedChart = (HwHealthTrackCombinedChart) findViewById(R.id.combined_chart);
        this.e = hwHealthTrackCombinedChart;
        hwHealthTrackCombinedChart.b((HwHealthBaseCombinedChart.DataParser) null);
        this.f10621c = new RouteAltitudeChartHolderImpl(getContext());
        Layout layoutAcquireLayout = this.e.acquireLayout();
        if (layoutAcquireLayout != null) {
            layoutAcquireLayout.b(0.0f, 0.0f);
            layoutAcquireLayout.a(0.0f);
        }
        a(viewInflate);
    }

    private void a(View view) {
        if (qrs.t()) {
            boolean zAf = qrs.af(getContext());
            LogUtil.a("RunningRouterLineChart", "inflateView, isTahitiModel: ", Boolean.valueOf(zAf));
            ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.heart_rate_right_data);
            if (viewGroup != null && (viewGroup.getLayoutParams() instanceof LinearLayout.LayoutParams)) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) viewGroup.getLayoutParams();
                if (zAf) {
                    layoutParams.setMarginStart(qrs.d(getContext(), 12.0f));
                } else {
                    layoutParams.setMarginStart(qrs.d(getContext(), 34.0f));
                }
                viewGroup.setLayoutParams(layoutParams);
                return;
            }
            LogUtil.j("RunningRouterLineChart", "inflateView, viewGroup is null, ", "or layoutParams isn't the instance of LinearLauout.LayoutParams");
        }
    }

    public void b(List<RouterAltitude> list) {
        boolean z;
        if (njy.e(list)) {
            LogUtil.a("RunningRouterLineChart", "dataList is empty");
            return;
        }
        if (this.d) {
            for (RouterAltitude routerAltitude : list) {
                routerAltitude.setDistance((float) UnitUtil.e(routerAltitude.getDistance(), 3));
                routerAltitude.setAltitude((float) UnitUtil.e(routerAltitude.getAltitude(), 1));
            }
        }
        if (list.get(list.size() - 1).getDistance() <= 1000.0f) {
            z = true;
        } else {
            for (RouterAltitude routerAltitude2 : list) {
                routerAltitude2.setDistance(routerAltitude2.getDistance() / 1000.0f);
            }
            z = false;
        }
        this.e.getXAxis().setAxisMaximum(list.get(list.size() - 1).getDistance());
        this.f10621c.e(list);
        this.f10621c.c(this.e, z ? HwHealthBaseCombinedChart.TimeValueMode.METERS : HwHealthBaseCombinedChart.TimeValueMode.KILOMETERS);
        Pair<Float, Float> pairC = c(list);
        Float f = pairC.first;
        if (f != null) {
            this.f10620b.setText(UnitUtil.e(f.floatValue(), 1, 0));
        }
        Float f2 = pairC.second;
        if (f2 != null) {
            this.f10619a.setText(UnitUtil.e(f2.floatValue(), 1, 0));
        }
    }

    public void c() {
        if (this.f10621c == null) {
            LogUtil.a("RunningRouterLineChart", "rmDataLayer mChartHolder is null");
        }
        this.f10621c.d(this.e);
    }

    private Pair<Float, Float> c(List<RouterAltitude> list) {
        float fMax = Float.MIN_VALUE;
        float fMin = Float.MAX_VALUE;
        for (RouterAltitude routerAltitude : list) {
            if (routerAltitude != null) {
                float altitude = routerAltitude.getAltitude();
                fMax = Math.max(fMax, altitude);
                fMin = Math.min(fMin, altitude);
            }
        }
        return new Pair<>(Float.valueOf(fMin), Float.valueOf(fMax));
    }

    public void setIsTouchEventConsumption(boolean z) {
        HwHealthTrackCombinedChart hwHealthTrackCombinedChart = this.e;
        if (hwHealthTrackCombinedChart != null) {
            hwHealthTrackCombinedChart.setIsTouchEventConsumption(z);
        }
    }
}
