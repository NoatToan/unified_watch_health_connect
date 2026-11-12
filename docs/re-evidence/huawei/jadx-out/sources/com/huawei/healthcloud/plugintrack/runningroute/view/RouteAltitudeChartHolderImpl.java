package com.huawei.healthcloud.plugintrack.runningroute.view;

import android.content.Context;
import androidx.core.content.ContextCompat;
import com.huawei.healthcloud.plugintrack.runningroute.data.RouterAltitude;
import com.huawei.healthcloud.plugintrack.runningroute.view.RouteAltitudeChartHolderImpl;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.route.SlopeInfo;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.linechart.combinedchart.HwHealthBaseCombinedChart;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseEntry;
import com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet;
import com.huawei.ui.commonui.view.trackview.TrackLineChartHolder;
import defpackage.njs;
import defpackage.njy;
import defpackage.qpf;
import defpackage.qtm;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class RouteAltitudeChartHolderImpl extends RouteAltitudeChartHolderAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HwHealthLineDataSet f10612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f10613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f10614c;
    private int d;
    private List<RouterAltitude> e;
    private List<TrackLineChartHolder.Mode> g;
    private float h;
    private double j;

    public static /* synthetic */ boolean b(int i, int i2, int i3) {
        return true;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public int acquireWeightDataInterval() {
        return 0;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public boolean isSlopeInfoDisplayEnabled() {
        return false;
    }

    public RouteAltitudeChartHolderImpl(Context context) {
        super(context);
        this.e = new ArrayList();
        this.g = new ArrayList(16);
        this.f10613b = Float.MIN_VALUE;
        this.h = Float.MAX_VALUE;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public List<njs> acquireWeightData() {
        return new ArrayList();
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public List<SlopeInfo> acquireSlopeInfoList() {
        return Collections.EMPTY_LIST;
    }

    public void e(List<RouterAltitude> list) {
        this.e.clear();
        this.e.addAll(list);
        c();
    }

    private void c() {
        float fMax;
        if (njy.b(this.e)) {
            float f = this.f10614c;
            List<RouterAltitude> list = this.e;
            fMax = Math.max(f, list.get(list.size() - 1).getDistance());
        } else {
            fMax = 0.0f;
        }
        this.f10614c = fMax;
    }

    private List<HwHealthBaseEntry> e() {
        ArrayList arrayList = new ArrayList(16);
        this.f10613b = -2.1474836E9f;
        this.h = 2.1474836E9f;
        this.j = 0.0d;
        this.d = 0;
        for (int i = 0; i < this.e.size(); i++) {
            RouterAltitude routerAltitude = this.e.get(i);
            if (routerAltitude != null) {
                float distance = routerAltitude.getDistance();
                float altitude = routerAltitude.getAltitude();
                arrayList.add(new HwHealthBaseEntry(distance, altitude));
                this.f10613b = Math.max(this.f10613b, altitude);
                this.h = Math.min(this.h, altitude);
                this.j += (double) altitude;
                this.d++;
            }
        }
        return arrayList;
    }

    public void c(HwHealthBaseCombinedChart hwHealthBaseCombinedChart, HwHealthBaseCombinedChart.TimeValueMode timeValueMode) {
        hwHealthBaseCombinedChart.setLogEnabled(true);
        this.f10612a = new HwHealthLineDataSet(BaseApplication.getContext(), e(), this.mContext.getResources().getString(R.string.IDS_hwh_motiontrack_alti), this.mContext.getResources().getString(R.string.IDS_hwh_motiontrack_alti), this.mContext.getResources().getString(R.string.IDS_route_alt_chart_x_label), 1);
        hwHealthBaseCombinedChart.setTimeValueMode(timeValueMode);
        this.f10612a.setColor(ContextCompat.getColor(this.mContext, com.huawei.healthcloud.plugintrack.R.color.blood_oxygen_altitude_blue_color));
        this.f10612a.a(ContextCompat.getColor(this.mContext, com.huawei.healthcloud.plugintrack.R.color.blood_oxygen_altitude_blue_color), ContextCompat.getColor(this.mContext, com.huawei.healthcloud.plugintrack.R.color.colorCardPanelBg), true);
        this.f10612a.b(new HwHealthLineDataSet.LineLinkerFilter() { // from class: jdw
            @Override // com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet.LineLinkerFilter
            public final boolean drawLine(int i, int i2, int i3) {
                return RouteAltitudeChartHolderImpl.b(i, i2, i3);
            }
        });
        TrackLineChartHolder.Mode modeC = qtm.c(hwHealthBaseCombinedChart);
        if (modeC != TrackLineChartHolder.Mode.MODE_NONE) {
            HwHealthLineDataSet hwHealthLineDataSet = this.f10612a;
            float f = this.f10613b;
            int i = this.d;
            qtm.e(new TrackLineChartHolder.d(hwHealthBaseCombinedChart, hwHealthLineDataSet, modeC, f, i > 0 ? (float) (this.j / ((double) i)) : 0.0f, this.h, false, true, false));
        }
        qtm.b(this.f10612a);
        new qpf().initStyle(hwHealthBaseCombinedChart, this.f10612a);
        qtm.a(hwHealthBaseCombinedChart, this.f10612a, this.g);
        hwHealthBaseCombinedChart.refresh();
    }

    public void d(HwHealthBaseCombinedChart hwHealthBaseCombinedChart) {
        if (hwHealthBaseCombinedChart == null) {
            return;
        }
        hwHealthBaseCombinedChart.clear();
        hwHealthBaseCombinedChart.refresh();
    }
}
