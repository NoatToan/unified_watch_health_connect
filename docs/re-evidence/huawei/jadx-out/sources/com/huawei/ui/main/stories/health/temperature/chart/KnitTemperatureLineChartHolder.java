package com.huawei.ui.main.stories.health.temperature.chart;

import android.content.Context;
import android.graphics.Color;
import com.huawei.hms.kit.awareness.barrier.internal.e.a;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.linechart.HwHealthChartHolder;
import com.huawei.ui.commonui.linechart.HwHealthLineScrollChartHolder;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineDataSet;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseEntry;
import com.huawei.ui.commonui.linechart.icommon.IChartStorageHelper;
import com.huawei.ui.commonui.linechart.view.HwHealthLineChart;
import com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet;
import com.huawei.ui.commonui.linechart.view.commonlinechart.IHealthMultiColorMode;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.views.base.chart.HighlightedEntryParser;
import com.huawei.ui.main.stories.health.temperature.chart.KnitTemperatureLineChartHolder;
import defpackage.qny;
import defpackage.qqn;
import defpackage.tvs;
import defpackage.vaj;
import defpackage.vbr;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes43.dex */
public class KnitTemperatureLineChartHolder extends HwHealthLineScrollChartHolder implements HighlightedEntryParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f28099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f28100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f28101c;
    private qny d;
    private final vaj e;

    public static /* synthetic */ boolean b(int i, int i2, int i3) {
        return true;
    }

    public static /* synthetic */ boolean d(int i, int i2, int i3) {
        return i2 - i <= 60;
    }

    public KnitTemperatureLineChartHolder(Context context) {
        super(context);
        this.f28101c = "TEMPERATURE_MIN_MAX";
        if (Utils.o()) {
            this.f28101c = "SKIN_TEMPERATURE_MIN_MAX";
        }
        this.e = new vaj();
        this.f28100b = vbr.h(35.0f);
        this.f28099a = vbr.h(37.2f);
    }

    public void c(String str) {
        this.e.e(str);
        a(str);
    }

    public void b(String str) {
        this.f28101c = str;
    }

    private void a(String str) {
        if (this.d == null) {
            LogUtil.j("KnitTemperatureLineChartHolder", "setColor dataSet is null");
        } else if ("TEMPERATURE_MIN_MAX".equals(str)) {
            this.d.b(new IHealthMultiColorMode() { // from class: com.huawei.ui.main.stories.health.temperature.chart.KnitTemperatureLineChartHolder.5
                @Override // com.huawei.ui.commonui.linechart.view.commonlinechart.IHealthMultiColorMode
                public int[] getDataColor() {
                    return new int[]{-13404161, -11093057, -301790};
                }

                @Override // com.huawei.ui.commonui.linechart.view.commonlinechart.IHealthMultiColorMode
                public float[] getThreshold() {
                    return new float[]{KnitTemperatureLineChartHolder.this.f28100b, KnitTemperatureLineChartHolder.this.f28099a};
                }
            });
        } else {
            this.d.b(new IHealthMultiColorMode() { // from class: com.huawei.ui.main.stories.health.temperature.chart.KnitTemperatureLineChartHolder.4
                @Override // com.huawei.ui.commonui.linechart.view.commonlinechart.IHealthMultiColorMode
                public int[] getDataColor() {
                    return new int[]{-11093057, -11093057, -11093057};
                }

                @Override // com.huawei.ui.commonui.linechart.view.commonlinechart.IHealthMultiColorMode
                public float[] getThreshold() {
                    return new float[]{20.0f, 42.0f};
                }
            });
        }
    }

    @Override // com.huawei.ui.commonui.linechart.HwHealthLineScrollChartHolder, com.huawei.ui.commonui.linechart.HwHealthScrollChartHolder, com.huawei.ui.commonui.linechart.HwHealthChartHolder
    public HwHealthLineDataSet onCreateDataSet(HwHealthLineChart hwHealthLineChart, DataInfos dataInfos, HwHealthChartHolder.c cVar) {
        this.d = new qny(new ArrayList(16), getChartBrief(dataInfos), getChartLabel(dataInfos), getChartUnit(dataInfos));
        a(this.f28101c);
        this.d.d(Color.argb(229, 178, 178, 178));
        this.d.setLabelCount(5, true);
        this.d.b(new HwHealthLineDataSet.LineLinkerFilter() { // from class: van
            @Override // com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet.LineLinkerFilter
            public final boolean drawLine(int i, int i2, int i3) {
                return KnitTemperatureLineChartHolder.d(i, i2, i3);
            }
        });
        this.d.setLineWidth(1.5f);
        this.d.setShowMaxMinValue(true);
        this.d.e(new HwHealthLineDataSet.NodeDrawStyle() { // from class: com.huawei.ui.main.stories.health.temperature.chart.KnitTemperatureLineChartHolder.3
            @Override // com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet.NodeDrawStyle
            public float initNodeStyle(int i) {
                return 0.0f;
            }

            @Override // com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet.NodeDrawStyle
            public boolean needDrawNodeFill(boolean z) {
                return false;
            }

            @Override // com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet.NodeDrawStyle
            public float calcuNodeWidthPixel(boolean z) {
                return com.github.mikephil.charting.utils.Utils.convertDpToPixel(4.0f);
            }
        });
        if ("TEMPERATURE_MIN_MAX".equals(this.f28101c)) {
            hwHealthLineChart.getAxisFirstParty().setAxisMinimum(vbr.h(34.0f));
            hwHealthLineChart.getAxisFirstParty().setAxisMaximum(vbr.h(42.0f));
        } else {
            hwHealthLineChart.getAxisFirstParty().setAxisMinimum(vbr.h(20.0f));
            hwHealthLineChart.getAxisFirstParty().setAxisMaximum(vbr.h(42.0f));
        }
        hwHealthLineChart.getAxisSecondParty().setEnabled(false);
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.ui.commonui.linechart.HwHealthScrollChartHolder, com.huawei.ui.commonui.linechart.HwHealthChartHolder
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public HwHealthLineDataSet onFakeDataSet(HwHealthChartHolder.c cVar) {
        ArrayList arrayList = new ArrayList(16);
        DataInfos dataInfosC = cVar.c();
        HwHealthLineDataSet hwHealthLineDataSet = new HwHealthLineDataSet(this.mContext, arrayList, getChartBrief(dataInfosC), getChartLabel(dataInfosC), getChartUnit(dataInfosC));
        hwHealthLineDataSet.setColor(Color.argb(255, 178, 178, 178));
        hwHealthLineDataSet.d(Color.argb(229, a.L, 70, 94));
        hwHealthLineDataSet.a(Color.argb(127, 178, 178, 178), Color.argb(0, 178, 178, 178), true);
        hwHealthLineDataSet.b(new HwHealthLineDataSet.LineLinkerFilter() { // from class: vam
            @Override // com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet.LineLinkerFilter
            public final boolean drawLine(int i, int i2, int i3) {
                return KnitTemperatureLineChartHolder.b(i, i2, i3);
            }
        });
        hwHealthLineDataSet.setForcedLabels(tvs.b());
        hwHealthLineDataSet.setLineWidth(2.0f);
        hwHealthLineDataSet.e(new HwHealthLineDataSet.NodeDrawStyle() { // from class: com.huawei.ui.main.stories.health.temperature.chart.KnitTemperatureLineChartHolder.2
            @Override // com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet.NodeDrawStyle
            public float initNodeStyle(int i) {
                return 0.0f;
            }

            @Override // com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet.NodeDrawStyle
            public boolean needDrawNodeFill(boolean z) {
                return false;
            }

            @Override // com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet.NodeDrawStyle
            public float calcuNodeWidthPixel(boolean z) {
                return com.github.mikephil.charting.utils.Utils.convertDpToPixel(4.0f);
            }
        });
        return hwHealthLineDataSet;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.ui.commonui.linechart.HwHealthChartHolder
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onCustomChartStyle(HwHealthLineChart hwHealthLineChart, DataInfos dataInfos) {
        if (hwHealthLineChart == null) {
            return;
        }
        hwHealthLineChart.makeReverse(true);
        hwHealthLineChart.setGridColor(qqn.b(BaseApplication.getContext(), R.color.emui_bottombar_icon_off), qqn.b(BaseApplication.getContext(), R.color.common_black_20alpha));
        hwHealthLineChart.setLabelColor(qqn.b(BaseApplication.getContext(), R.color.health_chart_default_text_color));
        hwHealthLineChart.setAvoidFirstLastClipping(false);
        hwHealthLineChart.enableOnlyShowMinutes(true);
        hwHealthLineChart.enableOneMinuteOmit(true);
    }

    @Override // com.huawei.ui.commonui.linechart.scrolladapter.DynamicBorderSupportable
    public float computeDynamicBorderMax(HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet, float f, float f2) {
        return vbr.b(f2, f, "TEMPERATURE_MIN_MAX".equals(this.f28101c));
    }

    @Override // com.huawei.ui.commonui.linechart.scrolladapter.DynamicBorderSupportable
    public float computeDynamicBorderMin(HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet, float f, float f2) {
        return vbr.a(f2, f, "TEMPERATURE_MIN_MAX".equals(this.f28101c));
    }

    @Override // com.huawei.ui.commonui.linechart.HwHealthScrollChartHolder
    public IChartStorageHelper acquireStorageHelper() {
        return this.e;
    }

    @Override // com.huawei.ui.main.stories.fitness.views.base.chart.HighlightedEntryParser
    public String parse(HwHealthBaseEntry hwHealthBaseEntry) {
        if (hwHealthBaseEntry == null || ((int) hwHealthBaseEntry.getY()) == Integer.MIN_VALUE) {
            return "--";
        }
        return UnitUtil.e(hwHealthBaseEntry.getY(), 1, 1);
    }
}
